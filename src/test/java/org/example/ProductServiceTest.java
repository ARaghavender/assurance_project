package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProductServiceTest {
    private ProductService productService;
    private ProductRepository productRepository;
    private Product testProduct;

    @BeforeEach
    void setUp() {
        productRepository = new ProductRepository();
        productService = new ProductService(productRepository);
        testProduct = new Product(null, "Test Product", "Description", 100.0, 10);
        productService.createProduct(testProduct);

    }

    @Test
    void testCreateProductWithNullValues() {
        Product product = new Product(null, null, null, null, 0);
        productService.createProduct(product);

        Product saved = productService.getProductById(product.getId());
        assertNotNull(saved);
        assertNull(saved.getName());
        assertNull(saved.getDescription());
        assertNull(saved.getPrice());
        assertEquals(0, saved.getQuantity());
    }

    @Test
    void testGetProductByIdNonExistent() {
        assertNull(productService.getProductById(999L));
    }

    @Test
    void testUpdateProductNonExistent() {
        Product nonExistent = new Product(null,null,null,null,0);
        productService.updateProduct(nonExistent);
        assertNull(productService.getProductById(999L));
    }

    @Test
    void testDeleteProductNonExistent() {
        assertFalse(productService.deleteProduct(999L));
    }

    @Test
    void testDeleteExistingProduct() {
        assertTrue(productService.deleteProduct(testProduct.getId()));
        assertNull(productService.getProductById(testProduct.getId()));
    }



    @Test
    void testRestockProductNonExistent() {
        assertFalse(productService.restockProduct(999L, 10));
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, 0, 10, 11})
    void testDecrementStockEdgeCases(int quantity) {
        // Given: product has initial stock of 10
        boolean result = productService.decrementStock(testProduct.getId(), quantity);

        // If the quantity is invalid (negative or more than stock), the result should be false
        if (quantity < 0 || quantity > 10) {
            assertFalse(result);
            assertEquals(10, productService.getProductById(testProduct.getId()).getQuantity());
        } else {
            // Otherwise, we expect the stock to decrease but not below 0
            assertTrue(result);
            assertEquals(10 - quantity, productService.getProductById(testProduct.getId()).getQuantity());
        }
    }




    @Test
    void testAddPriceHistoryNullPrice() {
        productService.addPriceHistory(testProduct.getId(), null);
        List<Double> history = productService.getPriceHistory(testProduct.getId());
        assertTrue(history.contains(null));
    }

    @Test
    void testGetPriceHistoryNonExistentProduct() {
        assertNull(productService.getPriceHistory(999L));
    }



    @Test
    void testCreateOrderWithNegativeQuantity() {
        Order order = new Order(null, testProduct.getId(), -5, OrderStatus.PENDING);
        productService.createOrder(order);
        assertEquals(10, productService.getProductById(testProduct.getId()).getQuantity());
    }

    @Test
    void testUpdateOrderStatusNonExistent() {
        productService.updateOrderStatus(999L, OrderStatus.COMPLETED);
        assertNull(productService.getOrderById(999L));
    }

    @Test
    void testUpdateOrderStatusNull() {
        Order order = new Order(null, testProduct.getId(), 5, OrderStatus.PENDING);
        productService.createOrder(order);
        productService.updateOrderStatus(order.getId(), null);

        Order updated = productService.getOrderById(order.getId());
        assertNull(updated.getStatus());
    }


    @ParameterizedTest
    @ValueSource(ints = {1, 2, 5, 0})  // Add different quantities you want to test
    void testRestockProductEdgeCases(int quantity) {
        int initialStock = 10; // Starting quantity
        productService.restockProduct(testProduct.getId(), quantity);

        // If quantity is 0 or any valid value, check if stock is updated correctly
        Product updated = productService.getProductById(testProduct.getId());
        int expectedStock = initialStock + quantity;
        assertEquals(expectedStock, updated.getQuantity());
    }



    @Test
    void testCheckLowStockNonExistentProduct() {
        assertNull(productService.checkLowStock(999L, 5));
    }

    @Test
    void testGetProductsByPriceThresholdNegative() {
        List<Product> products = productService.getProductsByPriceThreshold(-1.0);
        assertTrue(products.isEmpty());
    }



    @Test
    void testGetProductsByKeywordEmpty() {
        List<Product> products = productService.getProductsByKeyword("");
        assertFalse(products.isEmpty());
        assertTrue(products.contains(testProduct));
    }

    @Test
    void testGetAllOrdersEmpty() {
        List<Order> orders = productService.getAllOrders();
        assertTrue(orders.isEmpty());
    }

    @Test
    void testCreateMultipleOrders() {
        Order order1 = new Order(null, testProduct.getId(), 3, OrderStatus.PENDING);
        Order order2 = new Order(null, testProduct.getId(), 4, OrderStatus.PENDING);

        productService.createOrder(order1);
        productService.createOrder(order2);

        List<Order> orders = productService.getAllOrders();
        assertEquals(2, orders.size());
        assertEquals(3, productService.getProductById(testProduct.getId()).getQuantity());
    }
    @Test
    void testServiceInitialization() {
        assertNotNull(productService);
        assertNotNull(productRepository);

    }

    @ParameterizedTest
    @CsvSource({
            "0.0, 0",
            "-1.0, 0",
            "100.0, 10",
            "9999.99, 5"
    })
    void testCreateProductWithVariousValues(Double price, int quantity) {
        Product product = new Product(null, "Test", "Desc", price, quantity);
        productService.createProduct(product);

        Product saved = productService.getProductById(product.getId());
        assertEquals(price, saved.getPrice());
        assertEquals(quantity, saved.getQuantity());
    }

    @Test
    void testUpdateProductAllFields() {
        testProduct.setName("Updated");
        testProduct.setDescription("Updated Desc");
        testProduct.setPrice(200.0);
        testProduct.setQuantity(20);

        productService.updateProduct(testProduct);

        Product updated = productService.getProductById(testProduct.getId());
        assertAll(
                () -> assertEquals("Updated", updated.getName()),
                () -> assertEquals("Updated Desc", updated.getDescription()),
                () -> assertEquals(200.0, updated.getPrice()),
                () -> assertEquals(20, updated.getQuantity())
        );
    }

    @ParameterizedTest
    @ValueSource(doubles = {Double.MAX_VALUE, Double.MIN_VALUE, 0.0, -1.0})
    void testPriceHistoryEdgeCases(Double price) {
        productService.addPriceHistory(testProduct.getId(), price);
        List<Double> history = productService.getPriceHistory(testProduct.getId());
        assertTrue(history.contains(price));
    }

    @Test
    void testProductLifecycle() {
        // Create
        Product product = new Product(null, "Lifecycle", "Test", 100.0, 10);
        productService.createProduct(product);

        // Update
        product.setPrice(200.0);
        productService.updateProduct(product);

        // Check price history
        productService.addPriceHistory(product.getId(), 200.0);

        // Restock
        productService.restockProduct(product.getId(), 5);

        // Create order
        Order order = new Order(null, product.getId(), 3, OrderStatus.PENDING);
        productService.createOrder(order);

        // Update order status
        productService.updateOrderStatus(order.getId(), OrderStatus.COMPLETED);

        // Delete
        assertTrue(productService.deleteProduct(product.getId()));
    }

    @Test
    void testOrderProcessing() {
        // Test order creation with exact stock
        Order order = new Order(null, testProduct.getId(), 10, OrderStatus.PENDING);
        productService.createOrder(order);
        assertEquals(0, productService.getProductById(testProduct.getId()).getQuantity());

        // Test order creation with insufficient stock
        Order failedOrder = new Order(null, testProduct.getId(), 1, OrderStatus.PENDING);
        productService.createOrder(failedOrder);
        assertEquals(0, productService.getProductById(testProduct.getId()).getQuantity());
    }

    @ParameterizedTest
    @ValueSource(ints = {Integer.MAX_VALUE, Integer.MIN_VALUE, 0})
    void testStockOperationsWithExtremeValues(int quantity) {
        productService.restockProduct(testProduct.getId(), quantity);
        if (quantity > 0) {
            assertFalse(productService.getProductById(testProduct.getId()).getQuantity() > 10);
        }
    }

    @Test
    void testConcurrentOrders() {
        for (int i = 0; i < 5; i++) {
            Order order = new Order(null, testProduct.getId(), 2, OrderStatus.PENDING);
            productService.createOrder(order);
        }
        assertEquals(0, productService.getProductById(testProduct.getId()).getQuantity());
    }

    @Test
    void testLowStockThresholds() {
        InventoryAlert alert;

        alert = productService.checkLowStock(testProduct.getId(), 15);
        assertTrue(alert != null && alert.getCurrentStock() < alert.getThreshold());

        alert = productService.checkLowStock(testProduct.getId(), 5);
        assertFalse(alert != null && alert.getCurrentStock() > alert.getThreshold());
    }

    @ParameterizedTest
    @NullSource
    @ValueSource(strings = {"", " ", "test", "TEST", "Product"})
    void testKeywordSearchVariations(String keyword) {
        List<Product> results = productService.getProductsByKeyword(keyword);
        if (keyword == null) {
            assertTrue(results.isEmpty());
        }
    }

    @Test
    void testOrderStatusTransitions() {
        Order order = new Order(null, testProduct.getId(), 1, OrderStatus.PENDING);
        productService.createOrder(order);

        for (OrderStatus status : OrderStatus.values()) {
            productService.updateOrderStatus(order.getId(), status);
            assertEquals(status, productService.getOrderById(order.getId()).getStatus());
        }
    }
}
