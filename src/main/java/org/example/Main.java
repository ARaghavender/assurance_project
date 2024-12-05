package org.example;

import java.util.List;

public class Main {
    private ProductService productService;

    public Main(ProductService productService) {
        this.productService = productService;
    }

    public static void main(String[] args) {
        ProductService productService = new ProductService(new ProductRepository());
        Main mainApp = new Main(productService);
        mainApp.run();
    }

    public void run() {
        Product product1 = new Product(null, "Headphones", "Noise Cancelling", 129.99, 30);
        productService.createProduct(product1);
        Product product2 = new Product(null, "Keyboard", "Mechanical", 79.99, 50);
        productService.createProduct(product2);
        Product product3 = new Product(null, "Mouse", "Wireless", 49.99, 100);
        productService.createProduct(product3);
        Product product4 = new Product(null, "Monitor", "4K Display", 299.99, 15);
        productService.createProduct(product4);

        List<Product> productsBelow200 = productService.getProductsByPriceThreshold(200.0);
        productsBelow200.forEach(product -> System.out.println(product.getName()));

        Product retrievedProduct = productService.getProductById(product1.getId());
        if (retrievedProduct != null) {
            retrievedProduct.setPrice(119.99);
            productService.updateProduct(retrievedProduct);
        }

        boolean deleted = productService.deleteProduct(product3.getId());
        System.out.println("Deleted Product: " + deleted);

        productService.restockProduct(product4.getId(), 20);
        List<Product> allProducts = productService.listAllProducts();
        allProducts.forEach(System.out::println);

        boolean stockDecremented = productService.decrementStock(product2.getId(), 5);
        System.out.println("Stock decremented: " + stockDecremented);

        System.out.println("Products by keyword:");
        List<Product> keywordProducts = productService.getProductsByKeyword("Noise");
        keywordProducts.forEach(System.out::println);

        List<Product> sortedProducts = productService.getProductsSortedByName();
        System.out.println("Sorted products:");
        sortedProducts.forEach(product -> System.out.println(product.getName()));

        productService.addPriceHistory(product1.getId(), 129.99);
        productService.addPriceHistory(product1.getId(), 119.99);

        System.out.println("Price history for " + product1.getName() + ":");
        productService.getPriceHistory(product1.getId()).forEach(System.out::println);

        Order order1 = new Order(null, product1.getId(), 2, OrderStatus.PENDING);
        productService.createOrder(order1);
        Order order2 = new Order(null, product2.getId(), 1, OrderStatus.PENDING);
        productService.createOrder(order2);

        System.out.println("All orders:");
        productService.getAllOrders().forEach(System.out::println);

        productService.updateOrderStatus(order1.getId(), OrderStatus.COMPLETED);
        System.out.println("Updated order status:");
        System.out.println(productService.getOrderById(order1.getId()));

        InventoryAlert alert = productService.checkLowStock(product4.getId(), 20);
        if (alert != null) {
            System.out.println("Low stock alert: " + alert);
        }
    }
}
