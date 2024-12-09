package org.example;

import java.util.Objects;

public class Order {

    // Fields to store order information
    private Long id;          // Unique identifier for the order
    private Long productId;   // ID of the product being ordered
    private int quantity;     // Quantity of the product being ordered
    private OrderStatus status; // Status of the order (e.g., PENDING, COMPLETED)

    // Constructor to initialize an Order object
    public Order(Long id, Long productId, int quantity, OrderStatus status) {
        this.id = id;
        this.productId = productId;
        this.quantity = quantity;
        this.status = status;
    }

    // Getter method for order ID
    public Long getId() {
        return id;
    }

    // Setter method for order ID
    public void setId(Long id) {
        this.id = id;
    }

    // Getter method for product ID associated with the order
    public Long getProductId() {
        return productId;
    }

    // Getter method for the quantity of the product in the order
    public int getQuantity() {
        return quantity;
    }

    // Getter method for the order's status
    public OrderStatus getStatus() {
        return status;
    }

    // Setter method for the order's status
    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    // Override equals() method to compare two Order objects for equality
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Reflexivity: if both objects are the same, they are equal
        if (obj == null || getClass() != obj.getClass()) return false; // Null check and type check

        // Cast the object to Order and compare relevant fields
        Order order = (Order) obj;
        return quantity == order.quantity && // Compare quantity
                Objects.equals(id, order.id) && // Compare order ID
                Objects.equals(productId, order.productId) && // Compare product ID
                status == order.status; // Compare order status
    }

    // Override hashCode() to generate a unique hash code based on the object's fields
    @Override
    public int hashCode() {
        return Objects.hash(id, productId, quantity, status); // Generate hash code based on id, productId, quantity, and status
    }

    // Override toString() to return a string representation of the Order object
    @Override
    public String toString() {
        return "Order{id=" + id + ", productId=" + productId + ", quantity=" + quantity + ", status=" + status + '}';
        // Return a formatted string displaying the order details
    }
}
