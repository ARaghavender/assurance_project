package org.example;



import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepositoryTest {

    @Test
    void testSaveAndFindById() {
        ProductRepository repository = new ProductRepository();
        Product product = new Product(null, "Test Product", "Description", 10.0, 5);

        repository.save(product);
        Product foundProduct = repository.findById(product.getId());

        assertNotNull(foundProduct);
        assertEquals("Test Product", foundProduct.getName());
    }

    @Test
    void testUpdate() {
        ProductRepository repository = new ProductRepository();
        Product product = new Product(null, "Test Product", "Description", 10.0, 5);

        repository.save(product);
        product.setPrice(12.0);
        repository.update(product);

        Product updatedProduct = repository.findById(product.getId());
        assertEquals(12.0, updatedProduct.getPrice());
    }

    @Test
    void testDelete() {
        ProductRepository repository = new ProductRepository();
        Product product = new Product(null, "Test Product", "Description", 10.0, 5);

        repository.save(product);
        boolean deleted = repository.delete(product.getId());
        Product deletedProduct = repository.findById(product.getId());

        assertTrue(deleted);
        assertNull(deletedProduct);
    }

    @Test
    void testFindAll() {
        ProductRepository repository = new ProductRepository();
        repository.save(new Product(null, "Product 1", "Description", 10.0, 5));
        repository.save(new Product(null, "Product 2", "Description", 20.0, 10));

        List<Product> allProducts = repository.findAll();

        assertEquals(2, allProducts.size());
    }
}
