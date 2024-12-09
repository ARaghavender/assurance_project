package org.example;

import java.util.Objects;

public class InventoryAlert {

    // Fields to store product information and inventory status
    private Long productId;  // Product ID
    private int currentStock;  // Current stock level of the product
    private int threshold;  // Threshold value to trigger an alert

    // Constructor to initialize an InventoryAlert object with productId, currentStock, and threshold
    public InventoryAlert(Long productId, int currentStock, int threshold) {
        this.productId = productId;
        this.currentStock = currentStock;
        this.threshold = threshold;
    }

    // Getter method to retrieve the productId
    public Long getProductId() {
        return productId;
    }

    // Getter method to retrieve the current stock level
    public int getCurrentStock() {
        return currentStock;
    }

    // Getter method to retrieve the threshold value
    public int getThreshold() {
        return threshold;
    }

    // Override equals() to compare InventoryAlert objects for equality
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;  // Reflexivity: If both objects are the same, they are equal
        if (obj == null || getClass() != obj.getClass()) return false;  // Null check and type check

        // Cast the object to InventoryAlert and compare relevant fields
        InventoryAlert that = (InventoryAlert) obj;
        return currentStock == that.currentStock &&  // Compare currentStock
                threshold == that.threshold &&  // Compare threshold
                Objects.equals(productId, that.productId);  // Compare productId using equals
    }

    // Override hashCode() to generate a consistent hash code based on object fields
    @Override
    public int hashCode() {
        return Objects.hash(productId, currentStock, threshold);  // Generate hash code using productId, currentStock, and threshold
    }

    // Override toString() to return a string representation of the InventoryAlert object
    @Override
    public String toString() {
        return "InventoryAlert{productId=" + productId + ", currentStock=" + currentStock + ", threshold=" + threshold + '}';  // Return formatted string
    }
}
