package org.example;

import java.util.List;

public class Main {

    // Instance of ProductService to interact with product-related operations
    private ProductService productService;

    // Constructor to initialize ProductService
    public Main(ProductService productService) {
        this.productService = productService;
    }

    // Main method to launch the application
    public static void main(String[] args) {
        // Create ProductService with a ProductRepository dependency
        ProductService productService = new ProductService(new ProductRepository());

        // Create the Main application instance and pass the ProductService instance
        Main mainApp = new Main(productService);

        // Run the application logic
        mainApp.run();
    }

    // Method to handle all application logic and product operations
    public void run() {
        // Create and add products to the system using the productService
        Product product1 = new Product(null, "Headphones", "Noise Cancelling", 129.99, 30);
        productService.createProduct(product1);
        Product product2 = new Product(null, "Keyboard", "Mechanical", 79.99, 50);
        productService.createProduct(product2);
        Product product3 = new Product(null, "Mouse", "Wireless", 49.99, 100);
        productService.createProduct(product3);
        Product product4 = new Product(null, "Monitor", "4K Display", 299.99, 15);
        productService.createProduct(product4);

        // Retrieve and display products with a price below 200
        List<Product> productsBelow200 = productService.getProductsByPriceThreshold(200.0);
        productsBelow200.forEach(product -> System.out.println(product.getName()));

        // Retrieve product by ID, update its price, and save the changes
        Product retrievedProduct = productService.getProductById(product1.getId());
        if (retrievedProduct != null) {
            retrievedProduct.setPrice(119.99);  // Update price
            productService.updateProduct(retrievedProduct);  // Save changes
        }

        // Delete a product by ID and print the result
        boolean deleted = productService.deleteProduct(product3.getId());
        System.out.println("Deleted Product: " + deleted);

        // Restock a product and display all products in the system
        productService.restockProduct(product4.getId(), 20);  // Increase stock by 20 units
        List<Product> allProducts = productService.listAllProducts();
        allProducts.forEach(System.out::println);

        // Decrement the stock of a product and print the result
        boolean stockDecremented = productService.decrementStock(product2.getId(), 5);
        System.out.println("Stock decremented: " + stockDecremented);

        // Search and display products by a keyword
        System.out.println("Products by keyword:");
        List<Product> keywordProducts = productService.getProductsByKeyword("Noise");
        keywordProducts.forEach(System.out::println);

        // Retrieve and display products sorted by name
        List<Product> sortedProducts = productService.getProductsSortedByName();
        System.out.println("Sorted products:");
        sortedProducts.forEach(product -> System.out.println(product.getName()));

        // Add and display price history for a product
        productService.addPriceHistory(product1.getId(), 129.99);
        productService.addPriceHistory(product1.getId(), 119.99);
        System.out.println("Price history for " + product1.getName() + ":");
        productService.getPriceHistory(product1.getId()).forEach(System.out::println);

        // Create and add orders for products
        Order order1 = new Order(null, product1.getId(), 2, OrderStatus.PENDING);
        productService.createOrder(order1);
        Order order2 = new Order(null, product2.getId(), 1, OrderStatus.PENDING);
        productService.createOrder(order2);

        // Display all orders in the system
        System.out.println("All orders:");
        productService.getAllOrders().forEach(System.out::println);

        // Update the status of an order and display the updated order
        productService.updateOrderStatus(order1.getId(), OrderStatus.COMPLETED);
        System.out.println("Updated order status:");
        System.out.println(productService.getOrderById(order1.getId()));

        // Check for low stock of a product and display an alert if needed
        InventoryAlert alert = productService.checkLowStock(product4.getId(), 20);
        if (alert != null) {
            System.out.println("Low stock alert: " + alert);
        }
    }
}
