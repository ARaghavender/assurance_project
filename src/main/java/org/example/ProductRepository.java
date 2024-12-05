package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class ProductRepository {
    private Map<Long, Product> productDatabase = new HashMap<>();
    private Map<Long, Order> orderDatabase = new HashMap<>();
    private Long productIdCounter = 1L;
    private Long orderIdCounter = 1L;

    public void save(Product product) {
        if (product.getId() == null) {
            product.setId(productIdCounter++);
        }
        productDatabase.put(product.getId(), product);
    }

    public Product findById(Long id) {
        return productDatabase.get(id);
    }

    public void update(Product product) {
        productDatabase.put(product.getId(), product);
    }

    public boolean delete(Long id) {
        return productDatabase.remove(id) != null;
    }

    public List<Product> findAll() {
        return new ArrayList<>(productDatabase.values());
    }

    public List<Product> findByPriceBelow(Double threshold) {
        return productDatabase.values().stream()
                .filter(product -> product.getPrice() < threshold)
                .collect(Collectors.toList());
    }

    public List<Product> findByKeyword(String keyword) {
        return productDatabase.values().stream()
                .filter(product -> product.getName().toLowerCase().contains(keyword.toLowerCase())
                        || product.getDescription().toLowerCase().contains(keyword.toLowerCase()))
                .collect(Collectors.toList());
    }

    public List<Product> findSortedByName() {
        return productDatabase.values().stream()
                .sorted(Comparator.comparing(Product::getName))
                .collect(Collectors.toList());
    }

    public void saveOrder(Order order) {
        if (order.getId() == null) {
            order.setId(orderIdCounter++);
        }
        orderDatabase.put(order.getId(), order);
    }

    public Order findOrderById(Long id) {
        return orderDatabase.get(id);
    }

    public void updateOrder(Order order) {
        orderDatabase.put(order.getId(), order);
    }

    public List<Order> findAllOrders() {
        return new ArrayList<>(orderDatabase.values());
    }
}
