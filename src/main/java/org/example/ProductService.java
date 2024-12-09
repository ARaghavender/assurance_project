package org.example;

import java.util.List;

public class ProductService {
    private ProductRepository productRepository;  // Dependency for product and order operations

    // Constructor to initialize ProductRepository dependency
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    // Create a new product and save it in the repository
    public void createProduct(Product product) {
        productRepository.save(product);  // Call repository's save method to store the product
    }

    // Get a product by its unique ID
    public Product getProductById(Long id) {
        return productRepository.findById(id);  // Call repository's findById method to fetch the product
    }

    // Update an existing product in the repository
    public void updateProduct(Product product) {
        productRepository.update(product);  // Call repository's update method to modify the product
    }

    // Delete a product by its ID
    public boolean deleteProduct(Long id) {
        return productRepository.delete(id);  // Call repository's delete method to remove the product
    }

    // List all products available in the repository
    public List<Product> listAllProducts() {
        return productRepository.findAll();  // Retrieve all products using the repository
    }

    // Get products with a price below a specified threshold
    public List<Product> getProductsByPriceThreshold(Double threshold) {
        return productRepository.findByPriceBelow(threshold);  // Retrieve products filtered by price
    }

    // Get products that match a keyword in either name or description
    public List<Product> getProductsByKeyword(String keyword) {
        return productRepository.findByKeyword(keyword);  // Search for products by keyword
    }

    // Get products sorted by their name
    public List<Product> getProductsSortedByName() {
        return productRepository.findSortedByName();  // Retrieve sorted products based on their name
    }

    // Restock a product by increasing its quantity
    public boolean restockProduct(Long productId, int quantity) {
        if (quantity < 0) {
            return false;  // Prevent restocking with negative quantities
        }
        Product product = productRepository.findById(productId);  // Find product by ID
        if (product != null) {
            product.setQuantity(product.getQuantity() + quantity);  // Update the product quantity
            productRepository.update(product);  // Save the updated product
            return true;  // Restocking was successful
        }
        return false;  // Product not found
    }

    // Decrement the stock of a product
    public boolean decrementStock(Long productId, int quantity) {
        Product product = productRepository.findById(productId);  // Find product by ID

        // Check for invalid quantities (negative or more than available stock)
        if (quantity < 0 || quantity > product.getQuantity()) {
            return false;  // Invalid decrement request
        }

        int newQuantity = product.getQuantity() - quantity;  // Calculate new quantity
        if (newQuantity < 0) {
            return false;  // Prevent stock from going negative
        }

        product.setQuantity(newQuantity);  // Update product quantity
        productRepository.save(product);  // Save the updated product
        return true;  // Stock decrement was successful
    }

    // Add a price to the product's price history
    public void addPriceHistory(Long productId, Double price) {
        Product product = productRepository.findById(productId);  // Find product by ID
        if (product != null) {
            product.addPriceToHistory(price);  // Add the price to the product's history
        }
    }

    // Get the price history of a product
    public List<Double> getPriceHistory(Long productId) {
        Product product = productRepository.findById(productId);  // Find product by ID
        return product != null ? product.getPriceHistory() : null;  // Return price history if product found
    }

    // Create and process an order, updating the product stock
    public void createOrder(Order order) {
        if (order.getQuantity() <= 0) {
            return;  // Do not process orders with invalid quantities
        }

        Product product = productRepository.findById(order.getProductId());  // Find product by ID
        if (product != null && product.getQuantity() >= order.getQuantity()) {
            product.setQuantity(product.getQuantity() - order.getQuantity());  // Deduct the ordered quantity from stock
            productRepository.saveOrder(order);  // Save the order
            productRepository.update(product);  // Update the product in the repository
        }
    }

    // Get all orders from the repository
    public List<Order> getAllOrders() {
        return productRepository.findAllOrders();  // Retrieve all orders from the repository
    }

    // Get an order by its unique ID
    public Order getOrderById(Long id) {
        return productRepository.findOrderById(id);  // Retrieve an order by ID
    }

    // Update the status of an order
    public void updateOrderStatus(Long orderId, OrderStatus status) {
        Order order = productRepository.findOrderById(orderId);  // Find order by ID
        if (order != null) {
            order.setStatus(status);  // Set the new status for the order
            productRepository.updateOrder(order);  // Save the updated order
        }
    }

    // Check if a product's stock is below a given threshold
    public InventoryAlert checkLowStock(Long productId, int threshold) {
        Product product = productRepository.findById(productId);  // Find product by ID
        if (product != null && product.getQuantity() < threshold) {
            return new InventoryAlert(productId, product.getQuantity(), threshold);  // Create an alert if stock is low
        }
        return null;  // No alert if stock is sufficient
    }
}
