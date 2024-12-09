package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Product {

    // Fields to store product information
    private Long id;             // Unique identifier for the product
    private String name;         // Name of the product
    private String description;  // Description of the product
    private Double price;        // Price of the product
    private int quantity;        // Available quantity of the product
    private List<Double> priceHistory;  // History of price changes for the product

    // Constructor to initialize a Product object with the provided values
    public Product(Long id, String name, String description, Double price, Integer quantity) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.priceHistory = new ArrayList<>();  // Initialize the price history list
    }

    // Getter method for product ID
    public Long getId() {
        return id;
    }

    // Setter method for product ID
    public void setId(Long id) {
        this.id = id;
    }

    // Getter method for product name
    public String getName() {
        return name;
    }

    // Setter method for product name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for product description
    public String getDescription() {
        return description;
    }

    // Setter method for product description
    public void setDescription(String description) {
        this.description = description;
    }

    // Getter method for product price
    public Double getPrice() {
        return price;
    }

    // Setter method for product price
    public void setPrice(Double price) {
        this.price = price;
    }

    // Getter method for product quantity
    public int getQuantity() {
        return quantity;
    }

    // Setter method for product quantity
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Method to add a price change to the product's price history
    public void addPriceToHistory(Double price) {
        this.priceHistory.add(price);  // Add the new price to the price history list
    }

    // Override toString() to return a string representation of the Product object
    @Override
    public String toString() {
        return "Product{id=" + id + ", name='" + name + "', description='" + description + "', price=" + price + ", quantity=" + quantity + '}';
        // Return a formatted string displaying the product details
    }

    // Getter method for price history
    public List<Double> getPriceHistory() {
        return Collections.unmodifiableList(priceHistory);  // Return an unmodifiable list of price history
    }

    // Override equals() method to compare two Product objects for equality
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;  // Reflexivity: if both objects are the same, they are equal
        if (o == null || getClass() != o.getClass()) return false;  // Null check and type check
        Product product = (Product) o;  // Cast object to Product
        return Objects.equals(id, product.id) &&  // Compare product ID
                Objects.equals(name, product.name) &&  // Compare product name
                Objects.equals(description, product.description) &&  // Compare product description
                Objects.equals(price, product.price) &&  // Compare product price
                Objects.equals(quantity, product.quantity);  // Compare product quantity
    }

    // Override hashCode() to generate a unique hash code based on the product's fields
    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, price, quantity);  // Generate hash code based on fields
    }
}
