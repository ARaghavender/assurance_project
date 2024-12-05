package org.example;

public class InventoryAlert {
    private Long productId;
    public int currentStock;
    private int threshold;

    public InventoryAlert(Long productId, int currentStock, int threshold) {
        this.productId = productId;
        this.currentStock = currentStock;
        this.threshold = threshold;
    }

    @Override
    public String toString() {
        return "InventoryAlert{productId=" + productId + ", currentStock=" + currentStock + ", threshold=" + threshold + '}';
    }
}
