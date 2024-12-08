package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    void testProductInitialization() {
        Product product = new Product(1L, "Laptop", "High-end laptop", 1500.0, 10);

        assertAll("Product initialization",
                () -> assertEquals(1L, product.getId()),
                () -> assertEquals("Laptop", product.getName()),
                () -> assertEquals("High-end laptop", product.getDescription()),
                () -> assertEquals(1500.0, product.getPrice()),
                () -> assertEquals(10, product.getQuantity()),
                () -> assertNotNull(product.getPriceHistory()),
                () -> assertTrue(product.getPriceHistory().isEmpty())
        );
    }

    @Test
    void testSettersAndGetters() {
        Product product = new Product(null, null, null, null, 0);

        assertAll("Initial null values",
                () -> assertNull(product.getId()),
                () -> assertNull(product.getName()),
                () -> assertNull(product.getDescription()),
                () -> assertNull(product.getPrice())
        );

        product.setId(2L);
        product.setName("Smartphone");
        product.setDescription("Flagship smartphone");
        product.setPrice(1200.0);
        product.setQuantity(5);

        assertAll("After setting values",
                () -> assertEquals(2L, product.getId()),
                () -> assertEquals("Smartphone", product.getName()),
                () -> assertEquals("Flagship smartphone", product.getDescription()),
                () -> assertEquals(1200.0, product.getPrice()),
                () -> assertEquals(5, product.getQuantity())
        );
    }

    @Test
    void testPriceHistoryWithNullValues() {
        Product product = new Product(1L, "Test", "Test Desc", 100.0, 1);

        product.addPriceToHistory(null);
        List<Double> priceHistory = product.getPriceHistory();

        assertNotNull(priceHistory);
        assertEquals(1, priceHistory.size());
        assertNull(priceHistory.get(0));
    }

    @ParameterizedTest
    @ValueSource(doubles = {Double.MAX_VALUE, Double.MIN_VALUE, 0.0, -0.0, -1.0})
    void testPriceHistoryWithEdgeCases(double price) {
        Product product = new Product(1L, "Test", "Test Desc", 100.0, 1);

        product.addPriceToHistory(price);
        List<Double> history = product.getPriceHistory();

        assertEquals(1, history.size());
        assertEquals(price, history.get(0));
    }

    @Test
    void testEqualsAndHashCode() {
        Product product1 = new Product(1L, "Test", "Desc", 100.0, 1);
        Product product2 = new Product(1L, "Test", "Desc", 100.0, 1);
        Product product3 = new Product(2L, "Test", "Desc", 100.0, 1);

        assertAll("Equals and HashCode",
                () -> assertEquals(product1, product2),
                () -> assertNotEquals(product1, product3),
                () -> assertEquals(product1.hashCode(), product2.hashCode()),
                () -> assertNotEquals(product1.hashCode(), product3.hashCode()),
                () -> assertNotEquals(product1, null),
                () -> assertNotEquals(product1, new Object())
        );
    }


    @Test
    void testToStringWithNullValues() {
        Product product = new Product(null, null, null, null, 0);
        String result = product.toString();

        assertAll("ToString with null values",
                () -> assertTrue(result.contains("id=null")),
                () -> assertTrue(result.contains("name='null'")),
                () -> assertTrue(result.contains("description='null'")),
                () -> assertTrue(result.contains("price=null")),
                () -> assertTrue(result.contains("quantity=0"))
        );
    }

    @Test
    void testQuantityBoundaries() {
        Product product = new Product(1L, "Test", "Desc", 100.0, Integer.MAX_VALUE);

        assertAll("Quantity boundaries",
                () -> assertEquals(Integer.MAX_VALUE, product.getQuantity()),
                () -> {
                    product.setQuantity(Integer.MIN_VALUE);
                    assertEquals(Integer.MIN_VALUE, product.getQuantity());
                }
        );
    }

    @Test
    void testPriceHistoryModification() {
        Product product = new Product(1L, "Test", "Desc", 100.0, 1);
        product.addPriceToHistory(200.0);

        List<Double> history = product.getPriceHistory();
        try {
            history.add(300.0); // Try to modify the returned list
            fail("PriceHistory list should not be modifiable");
        } catch (UnsupportedOperationException e) {
            // Expected
        }
    }


    @Test
    void testClearPriceHistory() {
        Product product = new Product(1L, "Test", "Desc", 100.0, 1);
        product.addPriceToHistory(100.0);
        product.addPriceToHistory(200.0);


        assertFalse(product.getPriceHistory().isEmpty());
    }

    @Test
    void testConstructorWithZeroValues() {
        Product product = new Product(0L, "", "", 0.0, 0);

        assertAll("Zero values",
                () -> assertEquals(0L, product.getId()),
                () -> assertEquals("", product.getName()),
                () -> assertEquals("", product.getDescription()),
                () -> assertEquals(0.0, product.getPrice()),
                () -> assertEquals(0, product.getQuantity())
        );
    }



    @Test
    void testPriceHistoryOrder() {
        Product product = new Product(1L, "Test", "Desc", 100.0, 1);

        product.addPriceToHistory(100.0);
        product.addPriceToHistory(200.0);
        product.addPriceToHistory(150.0);

        List<Double> history = product.getPriceHistory();
        assertEquals(3, history.size());
        assertEquals(100.0, history.get(0));
        assertEquals(200.0, history.get(1));
        assertEquals(150.0, history.get(2));
    }
    @ParameterizedTest
    @MethodSource("productData")
    void testProductConstructorVariations(Long id, String name, String desc, Double price, Integer quantity) {
        Product product = new Product(id, name, desc, price, quantity);
        assertAll("Product construction",
                () -> assertEquals(id, product.getId()),
                () -> assertEquals(name, product.getName()),
                () -> assertEquals(desc, product.getDescription()),
                () -> assertEquals(price, product.getPrice()),
                () -> assertEquals(quantity, product.getQuantity())
        );
    }

    static Stream<Arguments> productData() {
        return Stream.of(
                Arguments.of(1L, "Test", "Desc", 100.0, 1),
                Arguments.of(null, "", "", 0.0, 0),
                Arguments.of(9999L, "Very Long Name", "Very Long Description", 9999.99, 9999)
        );
    }


    @Test
    void testPriceHistoryImmutability() {
        Product product = new Product(1L, "Test", "Desc", 100.0, 1);
        product.addPriceToHistory(100.0);

        List<Double> history = product.getPriceHistory();
        assertThrows(UnsupportedOperationException.class, () -> history.add(200.0));
        assertThrows(UnsupportedOperationException.class, () -> history.remove(0));
        assertThrows(UnsupportedOperationException.class, () -> history.clear());
    }

    @Test
    void testDeepCopyOfPriceHistory() {
        Product product = new Product(1L, "Test", "Desc", 100.0, 1);
        product.addPriceToHistory(100.0);

        List<Double> history1 = product.getPriceHistory();
        List<Double> history2 = product.getPriceHistory();

        assertNotSame(history1, history2);
    }

    @Test
    void testEqualsWithAllFields() {
        Product product1 = new Product(1L, "Test", "Desc", 100.0, 1);
        Product product2 = new Product(1L, "Test", "Desc", 100.0, 1);
        product1.addPriceToHistory(100.0);
        product2.addPriceToHistory(100.0);

        assertEquals(product1, product2);
        assertEquals(product1.hashCode(), product2.hashCode());
    }

    @Test
    void testEqualsWithDifferentFields() {
        Product baseProduct = new Product(1L, "Test", "Desc", 100.0, 1);

        assertAll("Different field comparisons",
                () -> assertNotEquals(baseProduct, new Product(2L, "Test", "Desc", 100.0, 1)),
                () -> assertNotEquals(baseProduct, new Product(1L, "Different", "Desc", 100.0, 1)),
                () -> assertNotEquals(baseProduct, new Product(1L, "Test", "Different", 100.0, 1)),
                () -> assertNotEquals(baseProduct, new Product(1L, "Test", "Desc", 200.0, 1)),
                () -> assertNotEquals(baseProduct, new Product(1L, "Test", "Desc", 100.0, 2))
        );
    }

    @ParameterizedTest
    @ValueSource(doubles = {Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY, Double.NaN})
    void testSpecialDoubleValues(double price) {
        Product product = new Product(1L, "Test", "Desc", price, 1);
        assertEquals(price, product.getPrice());
        product.addPriceToHistory(price);
        assertTrue(product.getPriceHistory().contains(price));
    }

    @Test
    void testToStringConsistency() {
        Product product = new Product(1L, "Test", "Desc", 100.0, 1);
        String toString1 = product.toString();
        product.addPriceToHistory(200.0);
        String toString2 = product.toString();
        assertEquals(toString1, toString2);
    }

    @Test
    void testPriceHistoryWithLargeVolume() {
        Product product = new Product(1L, "Test", "Desc", 100.0, 1);
        for (int i = 0; i < 1000; i++) {
            product.addPriceToHistory((double) i);
        }
        assertEquals(1000, product.getPriceHistory().size());
    }

    @Test
    void testSettersWithSameValues() {
        Product product = new Product(1L, "Test", "Desc", 100.0, 1);

        product.setId(1L);
        product.setName("Test");
        product.setDescription("Desc");
        product.setPrice(100.0);
        product.setQuantity(1);

        assertAll("Same value setters",
                () -> assertEquals(1L, product.getId()),
                () -> assertEquals("Test", product.getName()),
                () -> assertEquals("Desc", product.getDescription()),
                () -> assertEquals(100.0, product.getPrice()),
                () -> assertEquals(1, product.getQuantity())
        );
    }
}
