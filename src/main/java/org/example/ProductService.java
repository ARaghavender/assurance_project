package org.example;

import java.util.List;

public class ProductService {
    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void createProduct(Product product) {
        productRepository.save(product);
    }

    public Product getProductById(Long id) {
        return productRepository.findById(id);
    }

    public void updateProduct(Product product) {
        productRepository.update(product);
    }

    public boolean deleteProduct(Long id) {
        return productRepository.delete(id);
    }

    public List<Product> listAllProducts() {
        return productRepository.findAll();
    }

    public List<Product> getProductsByPriceThreshold(Double threshold) {
        return productRepository.findByPriceBelow(threshold);
    }

    public List<Product> getProductsByKeyword(String keyword) {
        return productRepository.findByKeyword(keyword);
    }

    public List<Product> getProductsSortedByName() {
        return productRepository.findSortedByName();
    }

    public boolean restockProduct(Long productId, int quantity) {
        Product product = productRepository.findById(productId);
        if (product != null) {
            product.setQuantity(product.getQuantity() + quantity);
            productRepository.update(product);
            return true;
        }
        return false;
    }

    public boolean decrementStock(Long productId, int quantity) {
        Product product = productRepository.findById(productId);
        if (product != null && product.getQuantity() >= quantity) {
            product.setQuantity(product.getQuantity() - quantity);
            productRepository.update(product);
            return true;
        }
        return false;
    }

    public void addPriceHistory(Long productId, Double price) {
        Product product = productRepository.findById(productId);
        if (product != null) {
            product.addPriceToHistory(price);
        }
    }

    public List<Double> getPriceHistory(Long productId) {
        Product product = productRepository.findById(productId);
        return product != null ? product.getPriceHistory() : null;
    }

    public void createOrder(Order order) {
        Product product = productRepository.findById(order.getProductId());
        if (product != null && product.getQuantity() >= order.getQuantity()) {
            product.setQuantity(product.getQuantity() - order.getQuantity());
            productRepository.saveOrder(order);
            productRepository.update(product);
        }
    }

    public List<Order> getAllOrders() {
        return productRepository.findAllOrders();
    }

    public Order getOrderById(Long id) {
        return productRepository.findOrderById(id);
    }

    public void updateOrderStatus(Long orderId, OrderStatus status) {
        Order order = productRepository.findOrderById(orderId);
        if (order != null) {
            order.setStatus(status);
            productRepository.updateOrder(order);
        }
    }

    public InventoryAlert checkLowStock(Long productId, int threshold) {
        Product product = productRepository.findById(productId);
        if (product != null && product.getQuantity() < threshold) {
            return new InventoryAlert(productId, product.getQuantity(), threshold);
        }
        return null;
    }
}
