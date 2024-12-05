package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class ProductServiceTest {
    ProductServiceTest() {
    }

    @Test
    void testCreateAndRetrieveProduct() {
        ProductRepository repository = new ProductRepository();
        ProductService service = new ProductService(repository);
        Product product = new Product((Long)null, "Laptop", "High-end laptop", (double)1000.0F, 10);
        service.createProduct(product);
        Product retrievedProduct = service.getProductById(product.getId());
        Assertions.assertNotNull(retrievedProduct);
        Assertions.assertEquals("Laptop", retrievedProduct.getName());
    }

    @Test
    void testUpdateProduct() {
        ProductRepository repository = new ProductRepository();
        ProductService service = new ProductService(repository);
        Product product = new Product((Long)null, "Laptop", "High-end laptop", (double)1000.0F, 10);
        service.createProduct(product);
        product.setPrice((double)900.0F);
        service.updateProduct(product);
        Product updatedProduct = service.getProductById(product.getId());
        Assertions.assertEquals((double)900.0F, updatedProduct.getPrice());
    }

    @Test
    void testDeleteProduct() {
        ProductRepository repository = new ProductRepository();
        ProductService service = new ProductService(repository);
        Product product = new Product((Long)null, "Laptop", "High-end laptop", (double)1000.0F, 10);
        service.createProduct(product);
        boolean deleted = service.deleteProduct(product.getId());
        Assertions.assertTrue(deleted);
        Assertions.assertNull(service.getProductById(product.getId()));
    }

    @Test
    void testListAllProducts() {
        ProductRepository repository = new ProductRepository();
        ProductService service = new ProductService(repository);
        service.createProduct(new Product((Long)null, "Product 1", "Description", (double)10.0F, 5));
        service.createProduct(new Product((Long)null, "Product 2", "Description", (double)20.0F, 10));
        List<Product> products = service.listAllProducts();
        Assertions.assertEquals(2, products.size());
    }

    @Test
    void testGetProductsByPriceThreshold() {
        ProductRepository repository = new ProductRepository();
        ProductService service = new ProductService(repository);
        service.createProduct(new Product((Long)null, "Product 1", "Description", (double)10.0F, 5));
        service.createProduct(new Product((Long)null, "Product 2", "Description", (double)20.0F, 10));
        List<Product> products = service.getProductsByPriceThreshold((double)15.0F);
        Assertions.assertEquals(1, products.size());
    }

    @Test
    void testRestockProduct() {
        ProductRepository repository = new ProductRepository();
        ProductService service = new ProductService(repository);
        Product product = new Product((Long)null, "Laptop", "High-end laptop", (double)1000.0F, 10);
        service.createProduct(product);
        boolean restocked = service.restockProduct(product.getId(), 5);
        Assertions.assertTrue(restocked);
        Assertions.assertEquals(15, service.getProductById(product.getId()).getQuantity());
    }

    @Test
    void testDecrementStock() {
        ProductRepository repository = new ProductRepository();
        ProductService service = new ProductService(repository);
        Product product = new Product((Long)null, "Laptop", "High-end laptop", (double)1000.0F, 10);
        service.createProduct(product);
        boolean decremented = service.decrementStock(product.getId(), 5);
        Assertions.assertTrue(decremented);
        Assertions.assertEquals(5, service.getProductById(product.getId()).getQuantity());
    }

    @Test
    void testAddPriceHistory() {
        ProductRepository repository = new ProductRepository();
        ProductService service = new ProductService(repository);
        Product product = new Product((Long)null, "Laptop", "High-end laptop", (double)1000.0F, 10);
        service.createProduct(product);
        service.addPriceHistory(product.getId(), (double)900.0F);
        List<Double> priceHistory = service.getPriceHistory(product.getId());
        Assertions.assertEquals(1, priceHistory.size());
        Assertions.assertEquals((double)900.0F, (Double)priceHistory.get(0));
    }

    @Test
    void testOrderManagement() {
        ProductRepository repository = new ProductRepository();
        ProductService service = new ProductService(repository);
        Product product = new Product((Long)null, "Laptop", "High-end laptop", (double)1000.0F, 10);
        service.createProduct(product);
        Order order = new Order((Long)null, product.getId(), 2, OrderStatus.PENDING);
        service.createOrder(order);
        Order retrievedOrder = service.getOrderById(order.getId());
        Assertions.assertNotNull(retrievedOrder);
        Assertions.assertEquals(OrderStatus.PENDING, retrievedOrder.getStatus());
    }

    @Test
    void testLowStockAlert() {
        ProductRepository repository = new ProductRepository();
        ProductService service = new ProductService(repository);
        Product product = new Product((Long)null, "Laptop", "High-end laptop", (double)1000.0F, 5);
        service.createProduct(product);
        InventoryAlert alert = service.checkLowStock(product.getId(), 10);
        Assertions.assertNotNull(alert);
        Assertions.assertEquals(5, alert.currentStock);
    }
}
