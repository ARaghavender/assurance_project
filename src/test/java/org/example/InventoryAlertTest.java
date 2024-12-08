package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class InventoryAlertTest {
    private InventoryAlert alert;

    @BeforeEach
    void setUp() {
        alert = new InventoryAlert(1L, 10, 5);
    }

    @Test
    void testEqualsAndHashCode() {
        InventoryAlert alert1 = new InventoryAlert(1L, 10, 5);
        InventoryAlert alert2 = new InventoryAlert(1L, 10, 5);
        InventoryAlert differentAlert = new InventoryAlert(2L, 20, 10);

        assertAll("Equals and HashCode",
                () -> assertEquals(alert1, alert2, "Alerts with same properties should be equal"),
                () -> assertEquals(alert1.hashCode(), alert2.hashCode(), "Equal alerts should have the same hash code"),
                () -> assertNotEquals(alert1, differentAlert, "Different alerts should not be equal"),
                () -> assertNotEquals(alert1.hashCode(), differentAlert.hashCode(), "Different alerts should have different hash codes"),
                () -> assertNotEquals(alert1, null, "Alert should not be equal to null"),
                () -> assertNotEquals(alert1, new Object(), "Alert should not be equal to an unrelated object")
        );
    }


    @Test
    void testEqualsWithDifferentFields() {
        InventoryAlert baseAlert = new InventoryAlert(1L, 10, 5);

        assertAll("Different fields comparison",
                () -> assertNotEquals(baseAlert, new InventoryAlert(2L, 10, 5)),
                () -> assertNotEquals(baseAlert, new InventoryAlert(1L, 11, 5)),
                () -> assertNotEquals(baseAlert, new InventoryAlert(1L, 10, 6))
        );
    }

    @ParameterizedTest
    @CsvSource({
            "1, 1, 1",
            "-1, -1, -1",
            "9223372036854775807, 2147483647, 2147483647",  // Long.MAX_VALUE, Integer.MAX_VALUE
            "-9223372036854775808, -2147483648, -2147483648" // Long.MIN_VALUE, Integer.MIN_VALUE
    })
    void testBoundaryValues(long productId, int currentStock, int threshold) {
        InventoryAlert alert = new InventoryAlert(productId, currentStock, threshold);
        assertAll("Boundary values",
                () -> assertEquals(productId, alert.getProductId()),
                () -> assertEquals(currentStock, alert.getCurrentStock()),
                () -> assertEquals(threshold, alert.getThreshold())
        );
    }

    @Test
    void testToStringWithMaxValues() {
        InventoryAlert alert = new InventoryAlert(Long.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
        String expected = String.format("InventoryAlert{productId=%d, currentStock=%d, threshold=%d}",
                Long.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
        assertEquals(expected, alert.toString());
    }

    @Test
    void testToStringWithMinValues() {
        InventoryAlert alert = new InventoryAlert(Long.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        String expected = String.format("InventoryAlert{productId=%d, currentStock=%d, threshold=%d}",
                Long.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        assertEquals(expected, alert.toString());
    }

    @Test
    void testSameInstanceEquals() {
        assertEquals(alert, alert);
    }

    @ParameterizedTest
    @MethodSource("provideInventoryAlertData")
    void testMethodSourceWithDifferentValues(Long productId, int currentStock, int threshold) {
        InventoryAlert alert = new InventoryAlert(productId, currentStock, threshold);
        assertAll("Method source values",
                () -> assertEquals(productId, alert.getProductId()),
                () -> assertEquals(currentStock, alert.getCurrentStock()),
                () -> assertEquals(threshold, alert.getThreshold())
        );
    }

    @Test
    void testStockComparisonWithThreshold() {
        InventoryAlert belowThreshold = new InventoryAlert(1L, 5, 10);
        InventoryAlert aboveThreshold = new InventoryAlert(1L, 15, 10);
        InventoryAlert atThreshold = new InventoryAlert(1L, 10, 10);

        assertAll("Stock threshold comparisons",
                () -> assertTrue(belowThreshold.getCurrentStock() < belowThreshold.getThreshold()),
                () -> assertTrue(aboveThreshold.getCurrentStock() > aboveThreshold.getThreshold()),
                () -> assertEquals(atThreshold.getCurrentStock(), atThreshold.getThreshold())
        );
    }

    // Keep existing tests...

    private static Stream<Arguments> provideInventoryAlertData() {
        return Stream.of(
                Arguments.of(1L, 100, 50),
                Arguments.of(999999L, 1000, 100),
                Arguments.of(-1L, -100, -50),
                Arguments.of(0L, 0, 0),
                Arguments.of(Long.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE),
                Arguments.of(Long.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE)
        );
    }
}
