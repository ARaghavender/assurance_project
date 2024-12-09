package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class ProductRepository {

    // Database simulation using maps to store products and orders
    private Map<Long, Product> productDatabase = new HashMap<>();  // Stores products by their unique ID
    private Map<Long, Order> orderDatabase = new HashMap<>();      // Stores orders by their unique ID
    private Long productIdCounter = 1L;  // Counter for generating unique product IDs
    private Long orderIdCounter = 1L;    // Counter for generating unique order IDs

    // Save a new product to the database
    public void save(Product product) {
        if (product.getId() == null) {
            product.setId(productIdCounter++);  // If the product doesn't have an ID, assign one using the counter
        }
        productDatabase.put(product.getId(), product);  // Store the product in the map with its ID as the key
    }

    // Find a product by its unique ID
    public Product findById(Long id) {
        return productDatabase.get(id);  // Retrieve the product from the map using its ID
    }

    // Update an existing product
    public void update(Product product) {
        productDatabase.put(product.getId(), product);  // Replace the existing product in the map with the updated one
    }

    // Delete a product by its unique ID
    public boolean delete(Long id) {
        return productDatabase.remove(id) != null;  // Remove the product and return true if it was removed
    }

    // Get all products in the database
    public List<Product> findAll() {
        return new ArrayList<>(productDatabase.values());  // Return all products as a list
    }

    // Find products with price below a specified threshold
    public List<Product> findByPriceBelow(Double threshold) {
        return productDatabase.values().stream()  // Stream through all products
                .filter(product -> product.getPrice() < threshold)  // Filter based on the price
                .collect(Collectors.toList());  // Collect the results as a list
    }

    // Find products based on a keyword (either in the name or description)
    public List<Product> findByKeyword(String keyword) {
        if (keyword == null) {
            return Collections.emptyList();  // Return an empty list if the keyword is null
        }

        String lowerKeyword = keyword.toLowerCase();  // Convert the keyword to lowercase for case-insensitive search
        return productDatabase.values().stream()  // Stream through all products
                .filter(product -> product.getName().toLowerCase().contains(lowerKeyword)  // Check if name contains keyword
                        || product.getDescription().toLowerCase().contains(lowerKeyword))  // Check if description contains keyword
                .collect(Collectors.toList());  // Collect the results as a list
    }

    // Find all products sorted by their name
    public List<Product> findSortedByName() {
        return productDatabase.values().stream()  // Stream through all products
                .sorted(Comparator.comparing(Product::getName))  // Sort products by their name
                .collect(Collectors.toList());  // Collect the results as a list
    }

    // Save a new order to the database
    public void saveOrder(Order order) {
        if (order.getId() == null) {
            order.setId(orderIdCounter++);  // If the order doesn't have an ID, assign one using the counter
        }
        orderDatabase.put(order.getId(), order);  // Store the order in the map with its ID as the key
    }

    // Find an order by its unique ID
    public Order findOrderById(Long id) {
        return orderDatabase.get(id);  // Retrieve the order from the map using its ID
    }

    // Update an existing order
    public void updateOrder(Order order) {
        orderDatabase.put(order.getId(), order);  // Replace the existing order in the map with the updated one
    }

    // Get all orders in the database
    public List<Order> findAllOrders() {
        return new ArrayList<>(orderDatabase.values());  // Return all orders as a list
    }
}
