package org.example;

import java.util.Objects;

public class InventoryAlert {
    private Long productId;
    private int currentStock;
    private int threshold;

    public InventoryAlert(Long productId, int currentStock, int threshold) {
        this.productId = productId;
        this.currentStock = currentStock;
        this.threshold = threshold;
    }

    public Long getProductId() {
        return productId;
    }

    public int getCurrentStock() {
        return currentStock;
    }

    public int getThreshold() {
        return threshold;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Reflexivity
        if (obj == null || getClass() != obj.getClass()) return false; // Type check
        InventoryAlert that = (InventoryAlert) obj;
        return currentStock == that.currentStock &&
                threshold == that.threshold &&
                Objects.equals(productId, that.productId); // Compare fields
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, currentStock, threshold); // Generate consistent hash code
    }

    @Override
    public String toString() {
        return "InventoryAlert{productId=" + productId + ", currentStock=" + currentStock + ", threshold=" + threshold + '}';
    }
}
