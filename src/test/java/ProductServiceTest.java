

import org.example.Product;
import org.example.ProductRepository;
import org.example.ProductService;
import org.example.Order;
import org.example.OrderStatus;
import org.example.InventoryAlert;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProductServiceTest {

    @Test
    void testCreateAndRetrieveProduct() {
        ProductRepository repository = new ProductRepository();
        ProductService service = new ProductService(repository);

        Product product = new Product(null, "Laptop", "High-end laptop", 1000.0, 10);
        service.createProduct(product);

        Product retrievedProduct = service.getProductById(product.getId());

        assertNotNull(retrievedProduct);
        assertEquals("Laptop", retrievedProduct.getName());
    }

    @Test
    void testUpdateProduct() {
        ProductRepository repository = new ProductRepository();
        ProductService service = new ProductService(repository);

        Product product = new Product(null, "Laptop", "High-end laptop", 1000.0, 10);
        service.createProduct(product);

        product.setPrice(900.0);
        service.updateProduct(product);

        Product updatedProduct = service.getProductById(product.getId());
        assertEquals(900.0, updatedProduct.getPrice());
    }

    @Test
    void testDeleteProduct() {
        ProductRepository repository = new ProductRepository();
        ProductService service = new ProductService(repository);

        Product product = new Product(null, "Laptop", "High-end laptop", 1000.0, 10);
        service.createProduct(product);

        boolean deleted = service.deleteProduct(product.getId());

        assertTrue(deleted);
        assertNull(service.getProductById(product.getId()));
    }

    @Test
    void testListAllProducts() {
        ProductRepository repository = new ProductRepository();
        ProductService service = new ProductService(repository);

        service.createProduct(new Product(null, "Product 1", "Description", 10.0, 5));
        service.createProduct(new Product(null, "Product 2", "Description", 20.0, 10));

        List<Product> products = service.listAllProducts();

        assertEquals(2, products.size());
    }

    @Test
    void testGetProductsByPriceThreshold() {
        ProductRepository repository = new ProductRepository();
        ProductService service = new ProductService(repository);

        service.createProduct(new Product(null, "Product 1", "Description", 10.0, 5));
        service.createProduct(new Product(null, "Product 2", "Description", 20.0, 10));

        List<Product> products = service.getProductsByPriceThreshold(15.0);

        assertEquals(1, products.size());
    }

    @Test
    void testRestockProduct() {
        ProductRepository repository = new ProductRepository();
        ProductService service = new ProductService(repository);

        Product product = new Product(null, "Laptop", "High-end laptop", 1000.0, 10);
        service.createProduct(product);

        boolean restocked = service.restockProduct(product.getId(), 5);

        assertTrue(restocked);
        assertEquals(15, service.getProductById(product.getId()).getQuantity());
    }

    @Test
    void testDecrementStock() {
        ProductRepository repository = new ProductRepository();
        ProductService service = new ProductService(repository);

        Product product = new Product(null, "Laptop", "High-end laptop", 1000.0, 10);
        service.createProduct(product);

        boolean decremented = service.decrementStock(product.getId(), 5);

        assertTrue(decremented);
        assertEquals(5, service.getProductById(product.getId()).getQuantity());
    }

    @Test
    void testAddPriceHistory() {
        ProductRepository repository = new ProductRepository();
        ProductService service = new ProductService(repository);

        Product product = new Product(null, "Laptop", "High-end laptop", 1000.0, 10);
        service.createProduct(product);

        service.addPriceHistory(product.getId(), 900.0);

        List<Double> priceHistory = service.getPriceHistory(product.getId());

        assertEquals(1, priceHistory.size());
        assertEquals(900.0, priceHistory.get(0));
    }

    @Test
    void testOrderManagement() {
        ProductRepository repository = new ProductRepository();
        ProductService service = new ProductService(repository);

        Product product = new Product(null, "Laptop", "High-end laptop", 1000.0, 10);
        service.createProduct(product);

        Order order = new Order(null, product.getId(), 2, OrderStatus.PENDING);
        service.createOrder(order);

        Order retrievedOrder = service.getOrderById(order.getId());

        assertNotNull(retrievedOrder);
        assertEquals(OrderStatus.PENDING, retrievedOrder.getStatus());
    }

    @Test
    void testLowStockAlert() {
        ProductRepository repository = new ProductRepository();
        ProductService service = new ProductService(repository);

        Product product = new Product(null, "Laptop", "High-end laptop", 1000.0, 5);
        service.createProduct(product);

        InventoryAlert alert = service.checkLowStock(product.getId(), 10);

        assertNotNull(alert);
        assertEquals(5, alert.currentStock);
    }
}
