package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {
    private Order defaultOrder;

    @BeforeEach
    void setUp() {
        defaultOrder = new Order(1L, 1L, 5, OrderStatus.PENDING);
    }

    @Test
    void testEqualsAndHashCode() {
        Order order1 = new Order(1L, 1L, 5, OrderStatus.PENDING);
        Order order2 = new Order(1L, 1L, 5, OrderStatus.PENDING);
        Order differentOrder = new Order(2L, 2L, 10, OrderStatus.COMPLETED);

        assertAll("Equals and HashCode",
                () -> assertEquals(order1, order2),
                () -> assertEquals(order1.hashCode(), order2.hashCode()),
                () -> assertNotEquals(order1, differentOrder),
                () -> assertNotEquals(order1.hashCode(), differentOrder.hashCode()),
                () -> assertNotEquals(order1, null),
                () -> assertNotEquals(order1, new Object())
        );
    }

    @Test
    void testEqualsWithDifferentFields() {
        Order baseOrder = new Order(1L, 1L, 5, OrderStatus.PENDING);

        assertAll("Different fields comparison",
                () -> assertNotEquals(baseOrder, new Order(2L, 1L, 5, OrderStatus.PENDING)),
                () -> assertNotEquals(baseOrder, new Order(1L, 2L, 5, OrderStatus.PENDING)),
                () -> assertNotEquals(baseOrder, new Order(1L, 1L, 6, OrderStatus.PENDING)),
                () -> assertNotEquals(baseOrder, new Order(1L, 1L, 5, OrderStatus.COMPLETED))
        );
    }

    @Test
    void testSetters() {
        Order order = new Order(null, null, 0, null);

        order.setId(1L);

        order.setStatus(OrderStatus.PENDING);

        assertAll("Setters",
                () -> assertEquals(1L, order.getId()),

                () -> assertEquals(OrderStatus.PENDING, order.getStatus())
        );
    }

    @ParameterizedTest
    @MethodSource("provideOrderData")
    void testOrderWithVariousValues(Long id, Long productId, int quantity, OrderStatus status) {
        Order order = new Order(id, productId, quantity, status);
        assertAll("Order values",
                () -> assertEquals(id, order.getId()),
                () -> assertEquals(productId, order.getProductId()),
                () -> assertEquals(quantity, order.getQuantity()),
                () -> assertEquals(status, order.getStatus())
        );
    }

    @Test
    void testToStringWithNullValues() {
        Order order = new Order(null, null, 0, null);
        String expected = "Order{id=null, productId=null, quantity=0, status=null}";
        assertEquals(expected, order.toString());
    }

    @Test
    void testToStringWithExtremeValues() {
        Order order = new Order(Long.MAX_VALUE, Long.MIN_VALUE, Integer.MAX_VALUE, OrderStatus.COMPLETED);
        String expected = String.format("Order{id=%d, productId=%d, quantity=%d, status=COMPLETED}",
                Long.MAX_VALUE, Long.MIN_VALUE, Integer.MAX_VALUE);
        assertEquals(expected, order.toString());
    }

    // Keep existing tests...

    private static Stream<Arguments> provideOrderData() {
        return Stream.of(
                Arguments.of(1L, 1L, 1, OrderStatus.PENDING),
                Arguments.of(Long.MAX_VALUE, Long.MAX_VALUE, Integer.MAX_VALUE, OrderStatus.COMPLETED),
                Arguments.of(Long.MIN_VALUE, Long.MIN_VALUE, Integer.MIN_VALUE, OrderStatus.CANCELLED),
                Arguments.of(null, null, 0, null)
        );
    }
}
