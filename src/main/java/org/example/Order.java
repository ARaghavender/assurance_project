package org.example;

public class Order {
    private Long id;
    private Long productId;
    private int quantity;
    private OrderStatus status;

    public Order(Long id, Long productId, int quantity, OrderStatus status) {
        this.id = id;
        this.productId = productId;
        this.quantity = quantity;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductId() {
        return productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{id=" + id + ", productId=" + productId + ", quantity=" + quantity + ", status=" + status + '}';
    }
}
