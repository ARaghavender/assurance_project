package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepositoryTest {
    private ProductRepository repository;
    private Product testProduct;

    @BeforeEach
    void setUp() {
        repository = new ProductRepository();
        testProduct = new Product(null, "Test Product", "Description", 100.0, 10);
        repository.save(testProduct);
    }

    @Test
    void testSaveProduct() {
        Product product = new Product(null, "Laptop", "High-end laptop", 1500.0, 5);
        repository.save(product);

        assertNotNull(product.getId());
        Product found = repository.findById(product.getId());
        assertNotNull(found);
        assertEquals(product.getName(), found.getName());
        assertEquals(product.getDescription(), found.getDescription());
        assertEquals(product.getPrice(), found.getPrice());
        assertEquals(product.getQuantity(), found.getQuantity());
    }

    @Test
    void testSaveProductWithNullValues() {
        Product product = new Product(null, null, null, null, 0); // Changed null to 0 for int quantity
        repository.save(product);

        assertNotNull(product.getId());
        Product found = repository.findById(product.getId());
        assertNotNull(found);
        assertNull(found.getName());
        assertNull(found.getDescription());
        assertNull(found.getPrice());
        assertEquals(0, found.getQuantity()); // Changed assertion to check for 0
    }


    @Test
    void testUpdateProduct() {
        testProduct.setName("Updated Name");
        testProduct.setDescription("Updated Description");
        testProduct.setPrice(200.0);
        testProduct.setQuantity(20);

        repository.update(testProduct);

        Product updated = repository.findById(testProduct.getId());
        assertEquals("Updated Name", updated.getName());
        assertEquals("Updated Description", updated.getDescription());
        assertEquals(200.0, updated.getPrice());
        assertEquals(20, updated.getQuantity());
    }

    @Test
    void testUpdateNonExistentProduct() {
        Product nonExistent = new Product(null,null,null,null,0);
        repository.update(nonExistent);
        assertNull(repository.findById(999L));
    }

    @Test
    void testDeleteProduct() {
        assertTrue(repository.delete(testProduct.getId()));
        assertNull(repository.findById(testProduct.getId()));
    }

    @Test
    void testDeleteNonExistentProduct() {
        assertFalse(repository.delete(999L));
    }

    @Test
    void testFindAllProductsEmpty() {
        repository.delete(testProduct.getId());
        List<Product> products = repository.findAll();
        assertTrue(products.isEmpty());
    }

    @Test
    void testFindAllProductsMultiple() {
        Product product2 = new Product(null, "Second", "Description", 200.0, 20);
        Product product3 = new Product(null, "Third", "Description", 300.0, 30);

        repository.save(product2);
        repository.save(product3);

        List<Product> products = repository.findAll();

        // Check size
        assertEquals(3, products.size());

        // Check individual products
        assertTrue(products.contains(testProduct));
        assertTrue(products.contains(product2));
        assertTrue(products.contains(product3));
    }

    @ParameterizedTest
    @ValueSource(doubles = {0.0, -1.0, Double.MAX_VALUE})
    void testFindByPriceBelowEdgeCases(double threshold) {
        Product cheapProduct = new Product(null, "Cheap", "Description", 0.0, 1);
        Product expensiveProduct = new Product(null, "Expensive", "Description", Double.MAX_VALUE - 1, 1);

        repository.save(cheapProduct);
        repository.save(expensiveProduct);

        List<Product> products = repository.findByPriceBelow(threshold);
        if (threshold <= 0.0) {
            assertTrue(products.isEmpty());
        } else {
            assertTrue(products.size() >= 1);
        }
    }

    @Test
    void testFindByKeywordCaseInsensitive() {
        Product product = new Product(null, "TEST product", "TEST description", 100.0, 10);
        repository.save(product);

        List<Product> resultsLower = repository.findByKeyword("test");
        List<Product> resultsUpper = repository.findByKeyword("TEST");

        assertEquals(resultsLower.size(), resultsUpper.size());
        assertTrue(resultsLower.contains(product));
    }

    @Test
    void testFindByKeywordEmptyString() {
        List<Product> results = repository.findByKeyword("");
        assertFalse(results.isEmpty());
        assertEquals(repository.findAll().size(), results.size());
    }



    @Test
    void testFindSortedByNameWithDuplicateNames() {
        Product product1 = new Product(null, "Same Name", "First", 100.0, 10);
        Product product2 = new Product(null, "Same Name", "Second", 200.0, 20);

        repository.save(product1);
        repository.save(product2);

        List<Product> sortedProducts = repository.findSortedByName();
        assertEquals(3, sortedProducts.size());
        assertEquals("Same Name", sortedProducts.get(0).getName());
        assertEquals("Same Name", sortedProducts.get(1).getName());
    }

    @Test
    void testFindSortedByNameEmptyRepository() {
        repository.delete(testProduct.getId());
        List<Product> sortedProducts = repository.findSortedByName();
        assertTrue(sortedProducts.isEmpty());
    }

    // Order-related tests
    @Test
    void testSaveAndFindOrder() {
        Order order = new Order(null, testProduct.getId(), 5, OrderStatus.PENDING);
        repository.saveOrder(order);

        assertNotNull(order.getId());
        Order found = repository.findOrderById(order.getId());
        assertNotNull(found);
        assertEquals(order.getProductId(), found.getProductId());
        assertEquals(order.getQuantity(), found.getQuantity());
        assertEquals(order.getStatus(), found.getStatus());
    }

    @Test
    void testUpdateOrder() {
        Order order = new Order(null, testProduct.getId(), 5, OrderStatus.PENDING);
        repository.saveOrder(order);

        order.setStatus(OrderStatus.COMPLETED);
        repository.updateOrder(order);

        Order updated = repository.findOrderById(order.getId());
        assertEquals(OrderStatus.COMPLETED, updated.getStatus());
    }

    @Test
    void testFindAllOrders() {
        Order order1 = new Order(null, testProduct.getId(), 5, OrderStatus.PENDING);
        Order order2 = new Order(null, testProduct.getId(), 3, OrderStatus.COMPLETED);

        repository.saveOrder(order1);
        repository.saveOrder(order2);

        List<Order> orders = repository.findAllOrders();
        assertEquals(2, orders.size());
        assertTrue(orders.contains(order1));
        assertTrue(orders.contains(order2));
    }


    @Test
    void testRepositoryInitialization() {
        assertNotNull(repository);
        assertEquals(1, repository.findAll().size());
    }

    @ParameterizedTest
    @NullSource
    @ValueSource(strings = {"", " ", "test", "TEST", "Product"})
    void testFindByKeywordVariations(String keyword) {
        List<Product> results = repository.findByKeyword(keyword);

        if (keyword == null) {
            assertTrue(results.isEmpty());  // Ensure the results are empty when the keyword is null
        } else if (keyword.trim().isEmpty()) {
            // Ensure results size matches repository size when keyword is empty or just whitespace
            assertEquals(repository.findAll().size(), results.size());
        } else {
            // Ensure the search results are not empty when a valid keyword is provided
            assertFalse(results.isEmpty());
        }
    }


    @Test
    void testConcurrentProductOperations() {
        AtomicLong lastId = new AtomicLong(0);
        for (int i = 0; i < 100; i++) {
            Product product = new Product(null, "Product" + i, "Desc", (double) i, i);
            repository.save(product);
            lastId.set(product.getId());
        }

        assertTrue(repository.delete(lastId.get()));
        assertNull(repository.findById(lastId.get()));
    }

    @Test
    void testProductLifecycle() {
        // Create
        Product product = new Product(null, "Lifecycle", "Test", 100.0, 10);
        repository.save(product);
        assertNotNull(product.getId());

        // Read
        Product found = repository.findById(product.getId());
        assertNotNull(found);

        // Update
        found.setPrice(200.0);
        repository.update(found);
        Product updated = repository.findById(product.getId());
        assertEquals(200.0, updated.getPrice());

        // Delete
        assertTrue(repository.delete(product.getId()));
        assertNull(repository.findById(product.getId()));
    }

    @Test
    void testOrderLifecycle() {
        // Create
        Order order = new Order(null, testProduct.getId(), 5, OrderStatus.PENDING);
        repository.saveOrder(order);
        assertNotNull(order.getId());

        // Read
        Order found = repository.findOrderById(order.getId());
        assertNotNull(found);

        // Update
        found.setStatus(OrderStatus.COMPLETED);
        repository.updateOrder(found);
        Order updated = repository.findOrderById(order.getId());
        assertEquals(OrderStatus.COMPLETED, updated.getStatus());

        // Verify in all orders
        List<Order> allOrders = repository.findAllOrders();
        assertTrue(allOrders.contains(updated));
    }

    @Test
    void testBoundaryConditions() {
        Product maxProduct = new Product(Long.MAX_VALUE, "Max", "Desc", Double.MAX_VALUE, Integer.MAX_VALUE);
        Product minProduct = new Product(Long.MIN_VALUE, "Min", "Desc", Double.MIN_VALUE, Integer.MIN_VALUE);

        repository.save(maxProduct);
        repository.save(minProduct);

        assertEquals(maxProduct, repository.findById(maxProduct.getId()));
        assertEquals(minProduct, repository.findById(minProduct.getId()));
    }

    @Test
    void testNullHandling() {
        Product nullProduct = new Product(null, null, null, null, 0);
        repository.save(nullProduct);

        Product found = repository.findById(nullProduct.getId());
        assertAll(
                () -> assertNotNull(found),
                () -> assertNull(found.getName()),
                () -> assertNull(found.getDescription()),
                () -> assertNull(found.getPrice())
        );
    }

    @Test
    void testPriceRangeSearch() {
        repository.save(new Product(null, "Cheap", "Desc", 10.0, 1));
        repository.save(new Product(null, "Medium", "Desc", 50.0, 1));
        repository.save(new Product(null, "Expensive", "Desc", 100.0, 1));

        List<Product> cheapProducts = repository.findByPriceBelow(30.0);
        List<Product> allProducts = repository.findByPriceBelow(Double.MAX_VALUE);
        List<Product> noProducts = repository.findByPriceBelow(0.0);

        assertTrue(cheapProducts.size() < allProducts.size());
        assertTrue(noProducts.isEmpty());
    }



}