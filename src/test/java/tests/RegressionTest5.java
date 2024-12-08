package tests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert10 = productService1.checkLowStock((java.lang.Long) 100L, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            productService1.addPriceHistory((java.lang.Long) 1L, (java.lang.Double) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            productService1.addPriceHistory((java.lang.Long) 1L, (java.lang.Double) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert13 = productService1.checkLowStock((java.lang.Long) 1L, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        org.example.OrderStatus orderStatus15 = null;
        // The following exception was thrown during execution in test generation
        try {
            productService1.updateOrderStatus((java.lang.Long) 0L, orderStatus15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findOrderById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        org.example.Order order14 = null;
        // The following exception was thrown during execution in test generation
        try {
            productService1.createOrder(order14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getQuantity()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert16 = productService1.checkLowStock((java.lang.Long) 10L, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean19 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        org.example.Product product20 = null;
        // The following exception was thrown during execution in test generation
        try {
            productService1.createProduct(product20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.save(org.example.Product)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = productService1.decrementStock((java.lang.Long) 10L, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert16 = productService1.checkLowStock((java.lang.Long) 100L, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            productService1.addPriceHistory((java.lang.Long) 1L, (java.lang.Double) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.Order order12 = productService1.getOrderById((java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findOrderById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = productService1.decrementStock((java.lang.Long) 0L, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.Order order15 = productService1.getOrderById((java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findOrderById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        org.example.OrderStatus orderStatus15 = null;
        // The following exception was thrown during execution in test generation
        try {
            productService1.updateOrderStatus((java.lang.Long) 10L, orderStatus15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findOrderById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) (-1L), (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = productService1.restockProduct((java.lang.Long) (-1L), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.example.Product> productList12 = productService1.getProductsByKeyword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findByKeyword(String)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Double> doubleList12 = productService1.getPriceHistory((java.lang.Long) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = productService1.decrementStock((java.lang.Long) 0L, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = productService1.decrementStock((java.lang.Long) 1L, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.Product product15 = productService1.getProductById((java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Double> doubleList12 = productService1.getPriceHistory((java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.example.Product> productList15 = productService1.getProductsByKeyword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findByKeyword(String)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = productService1.decrementStock((java.lang.Long) 0L, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            productService1.addPriceHistory((java.lang.Long) 0L, (java.lang.Double) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = productService1.decrementStock((java.lang.Long) 1L, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = productService1.deleteProduct((java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.delete(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert19 = productService1.checkLowStock((java.lang.Long) 100L, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert16 = productService1.checkLowStock((java.lang.Long) (-1L), 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = productService1.deleteProduct((java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.delete(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            productService1.addPriceHistory((java.lang.Long) 100L, (java.lang.Double) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        org.example.OrderStatus orderStatus15 = null;
        // The following exception was thrown during execution in test generation
        try {
            productService1.updateOrderStatus((java.lang.Long) (-1L), orderStatus15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findOrderById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.Order order15 = productService1.getOrderById((java.lang.Long) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findOrderById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.Product product18 = productService1.getProductById((java.lang.Long) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = productService1.decrementStock((java.lang.Long) 1L, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 100L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.Product product18 = productService1.getProductById((java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Double> doubleList15 = productService1.getPriceHistory((java.lang.Long) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.Order order15 = productService1.getOrderById((java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findOrderById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = productService1.decrementStock((java.lang.Long) 0L, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = productService1.restockProduct((java.lang.Long) 1L, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        org.example.Product product11 = null;
        // The following exception was thrown during execution in test generation
        try {
            productService1.createProduct(product11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.save(org.example.Product)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.Order order15 = productService1.getOrderById((java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findOrderById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            productService1.addPriceHistory((java.lang.Long) 0L, (java.lang.Double) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.Product product15 = productService1.getProductById((java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            productService1.addPriceHistory((java.lang.Long) 10L, (java.lang.Double) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.example.Product> productList12 = productService1.getProductsByPriceThreshold((java.lang.Double) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findByPriceBelow(java.lang.Double)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.example.Product> productList14 = productService1.getProductsSortedByName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findSortedByName()\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        org.example.OrderStatus orderStatus15 = null;
        // The following exception was thrown during execution in test generation
        try {
            productService1.updateOrderStatus((java.lang.Long) 10L, orderStatus15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findOrderById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = productService1.deleteProduct((java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.delete(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.Order order15 = productService1.getOrderById((java.lang.Long) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findOrderById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (-1));
        org.example.Order order14 = null;
        // The following exception was thrown during execution in test generation
        try {
            productService1.createOrder(order14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getQuantity()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert13 = productService1.checkLowStock((java.lang.Long) 100L, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.Order order15 = productService1.getOrderById((java.lang.Long) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findOrderById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            productService1.addPriceHistory((java.lang.Long) 10L, (java.lang.Double) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = productService1.restockProduct((java.lang.Long) (-1L), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = productService1.decrementStock((java.lang.Long) 1L, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            productService1.addPriceHistory((java.lang.Long) 1L, (java.lang.Double) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.Product product15 = productService1.getProductById((java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = productService1.restockProduct((java.lang.Long) 1L, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert13 = productService1.checkLowStock((java.lang.Long) 1L, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = productService1.decrementStock((java.lang.Long) 0L, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean19 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.Product product21 = productService1.getProductById((java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.Product product12 = productService1.getProductById((java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = productService1.decrementStock((java.lang.Long) 1L, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.Order order12 = productService1.getOrderById((java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findOrderById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = productService1.deleteProduct((java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.delete(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean19 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            productService1.addPriceHistory((java.lang.Long) 100L, (java.lang.Double) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            productService1.addPriceHistory((java.lang.Long) 10L, (java.lang.Double) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = productService1.deleteProduct((java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.delete(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        org.example.OrderStatus orderStatus12 = null;
        // The following exception was thrown during execution in test generation
        try {
            productService1.updateOrderStatus((java.lang.Long) 0L, orderStatus12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findOrderById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.Product product6 = productService1.getProductById((java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.Order order18 = productService1.getOrderById((java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findOrderById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = productService1.decrementStock((java.lang.Long) 1L, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert16 = productService1.checkLowStock((java.lang.Long) 100L, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (-1));
        org.example.Product product11 = null;
        // The following exception was thrown during execution in test generation
        try {
            productService1.createProduct(product11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.save(org.example.Product)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.Product product15 = productService1.getProductById((java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean19 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean19 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            productService1.addPriceHistory((java.lang.Long) (-1L), (java.lang.Double) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean19 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            productService1.addPriceHistory((java.lang.Long) 0L, (java.lang.Double) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Double> doubleList15 = productService1.getPriceHistory((java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            productService1.addPriceHistory((java.lang.Long) 10L, (java.lang.Double) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert16 = productService1.checkLowStock((java.lang.Long) (-1L), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            productService1.addPriceHistory((java.lang.Long) (-1L), (java.lang.Double) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            productService1.addPriceHistory((java.lang.Long) (-1L), (java.lang.Double) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Double> doubleList15 = productService1.getPriceHistory((java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = productService1.restockProduct((java.lang.Long) 100L, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        java.lang.Class<?> wildcardClass14 = productService1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean19 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        java.lang.Class<?> wildcardClass20 = productService1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean19 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.example.Product> productList21 = productService1.getProductsByPriceThreshold((java.lang.Double) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findByPriceBelow(java.lang.Double)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.example.Product> productList11 = productService1.getProductsSortedByName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findSortedByName()\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            productService1.addPriceHistory((java.lang.Long) 100L, (java.lang.Double) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        org.example.OrderStatus orderStatus18 = null;
        // The following exception was thrown during execution in test generation
        try {
            productService1.updateOrderStatus((java.lang.Long) 10L, orderStatus18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findOrderById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert10 = productService1.checkLowStock((java.lang.Long) 0L, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = productService1.deleteProduct((java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.delete(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.Order order15 = productService1.getOrderById((java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findOrderById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert7 = productService1.checkLowStock((java.lang.Long) (-1L), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            productService1.addPriceHistory((java.lang.Long) 1L, (java.lang.Double) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean19 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        org.example.Product product20 = null;
        // The following exception was thrown during execution in test generation
        try {
            productService1.updateProduct(product20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.update(org.example.Product)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.example.Product> productList14 = productService1.listAllProducts();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findAll()\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert19 = productService1.checkLowStock((java.lang.Long) 0L, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = productService1.restockProduct((java.lang.Long) 10L, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean19 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Double> doubleList21 = productService1.getPriceHistory((java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            productService1.addPriceHistory((java.lang.Long) 10L, (java.lang.Double) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = productService1.decrementStock((java.lang.Long) (-1L), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert16 = productService1.checkLowStock((java.lang.Long) (-1L), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = productService1.deleteProduct((java.lang.Long) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.delete(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = productService1.decrementStock((java.lang.Long) 10L, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = productService1.decrementStock((java.lang.Long) (-1L), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.example.Order> orderList14 = productService1.getAllOrders();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findAllOrders()\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.Product product15 = productService1.getProductById((java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Double> doubleList15 = productService1.getPriceHistory((java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Double> doubleList12 = productService1.getPriceHistory((java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.example.Product> productList18 = productService1.getProductsByPriceThreshold((java.lang.Double) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findByPriceBelow(java.lang.Double)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (-1));
        org.example.Product product14 = null;
        // The following exception was thrown during execution in test generation
        try {
            productService1.createProduct(product14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.save(org.example.Product)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        org.example.Order order11 = null;
        // The following exception was thrown during execution in test generation
        try {
            productService1.createOrder(order11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getQuantity()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = productService1.decrementStock((java.lang.Long) (-1L), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = productService1.restockProduct((java.lang.Long) (-1L), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = productService1.decrementStock((java.lang.Long) (-1L), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (-1));
        org.example.OrderStatus orderStatus12 = null;
        // The following exception was thrown during execution in test generation
        try {
            productService1.updateOrderStatus((java.lang.Long) 100L, orderStatus12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findOrderById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Double> doubleList15 = productService1.getPriceHistory((java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert16 = productService1.checkLowStock((java.lang.Long) 1L, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = productService1.decrementStock((java.lang.Long) 0L, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert10 = productService1.checkLowStock((java.lang.Long) 0L, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.Product product15 = productService1.getProductById((java.lang.Long) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.example.Product> productList15 = productService1.getProductsByPriceThreshold((java.lang.Double) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findByPriceBelow(java.lang.Double)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.Order order9 = productService1.getOrderById((java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findOrderById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        org.example.OrderStatus orderStatus15 = null;
        // The following exception was thrown during execution in test generation
        try {
            productService1.updateOrderStatus((java.lang.Long) 1L, orderStatus15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findOrderById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.Order order15 = productService1.getOrderById((java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findOrderById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = productService1.deleteProduct((java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.delete(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.Order order15 = productService1.getOrderById((java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findOrderById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            productService1.addPriceHistory((java.lang.Long) 1L, (java.lang.Double) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            productService1.addPriceHistory((java.lang.Long) 0L, (java.lang.Double) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = productService1.decrementStock((java.lang.Long) 10L, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert16 = productService1.checkLowStock((java.lang.Long) 1L, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.Order order12 = productService1.getOrderById((java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findOrderById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            productService1.addPriceHistory((java.lang.Long) 10L, (java.lang.Double) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean19 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert22 = productService1.checkLowStock((java.lang.Long) 1L, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Double> doubleList15 = productService1.getPriceHistory((java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean19 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = productService1.restockProduct((java.lang.Long) 1L, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Double> doubleList15 = productService1.getPriceHistory((java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert10 = productService1.checkLowStock((java.lang.Long) 10L, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = productService1.deleteProduct((java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.delete(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = productService1.restockProduct((java.lang.Long) 100L, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = productService1.deleteProduct((java.lang.Long) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.delete(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = productService1.deleteProduct((java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.delete(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = productService1.restockProduct((java.lang.Long) 100L, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = productService1.restockProduct((java.lang.Long) (-1L), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.example.Product> productList12 = productService1.getProductsByKeyword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findByKeyword(String)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.Order order18 = productService1.getOrderById((java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findOrderById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            productService1.addPriceHistory((java.lang.Long) 10L, (java.lang.Double) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        java.lang.Class<?> wildcardClass11 = productService1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = productService1.decrementStock((java.lang.Long) 100L, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = productService1.restockProduct((java.lang.Long) 1L, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert16 = productService1.checkLowStock((java.lang.Long) 0L, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.example.Product> productList14 = productService1.listAllProducts();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findAll()\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        org.example.OrderStatus orderStatus9 = null;
        // The following exception was thrown during execution in test generation
        try {
            productService1.updateOrderStatus((java.lang.Long) (-1L), orderStatus9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findOrderById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = productService1.decrementStock((java.lang.Long) (-1L), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert13 = productService1.checkLowStock((java.lang.Long) 10L, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = productService1.restockProduct((java.lang.Long) (-1L), 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.example.Product> productList18 = productService1.getProductsByPriceThreshold((java.lang.Double) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findByPriceBelow(java.lang.Double)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (-1));
        java.lang.Class<?> wildcardClass14 = productService1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = productService1.decrementStock((java.lang.Long) 0L, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        org.example.OrderStatus orderStatus9 = null;
        // The following exception was thrown during execution in test generation
        try {
            productService1.updateOrderStatus((java.lang.Long) 10L, orderStatus9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findOrderById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Double> doubleList15 = productService1.getPriceHistory((java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.example.Order> orderList14 = productService1.getAllOrders();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findAllOrders()\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        org.example.Product product17 = null;
        // The following exception was thrown during execution in test generation
        try {
            productService1.updateProduct(product17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.update(org.example.Product)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = productService1.decrementStock((java.lang.Long) 0L, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.Order order15 = productService1.getOrderById((java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findOrderById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean19 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = productService1.decrementStock((java.lang.Long) 100L, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean19 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.Product product21 = productService1.getProductById((java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            productService1.addPriceHistory((java.lang.Long) 10L, (java.lang.Double) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean19 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.Order order21 = productService1.getOrderById((java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findOrderById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        org.example.OrderStatus orderStatus18 = null;
        // The following exception was thrown during execution in test generation
        try {
            productService1.updateOrderStatus((java.lang.Long) 10L, orderStatus18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findOrderById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        org.example.Product product8 = null;
        // The following exception was thrown during execution in test generation
        try {
            productService1.createProduct(product8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.save(org.example.Product)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = productService1.decrementStock((java.lang.Long) 1L, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) (-1L), (int) (short) -1);
        org.example.OrderStatus orderStatus15 = null;
        // The following exception was thrown during execution in test generation
        try {
            productService1.updateOrderStatus((java.lang.Long) 1L, orderStatus15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findOrderById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        org.example.OrderStatus orderStatus18 = null;
        // The following exception was thrown during execution in test generation
        try {
            productService1.updateOrderStatus((java.lang.Long) 1L, orderStatus18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findOrderById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) (-1L), (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Double> doubleList15 = productService1.getPriceHistory((java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.example.Product> productList15 = productService1.getProductsByPriceThreshold((java.lang.Double) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findByPriceBelow(java.lang.Double)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.Product product15 = productService1.getProductById((java.lang.Long) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 100L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = productService1.decrementStock((java.lang.Long) 1L, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.example.Product> productList15 = productService1.getProductsByKeyword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findByKeyword(String)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean19 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.example.Product> productList21 = productService1.getProductsByKeyword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findByKeyword(String)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.example.Product> productList12 = productService1.getProductsByKeyword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findByKeyword(String)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            productService1.addPriceHistory((java.lang.Long) 100L, (java.lang.Double) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = productService1.deleteProduct((java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.delete(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.example.Product> productList18 = productService1.getProductsByPriceThreshold((java.lang.Double) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findByPriceBelow(java.lang.Double)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert13 = productService1.checkLowStock((java.lang.Long) (-1L), 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            productService1.addPriceHistory((java.lang.Long) (-1L), (java.lang.Double) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean19 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.example.Product> productList21 = productService1.getProductsByKeyword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findByKeyword(String)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.example.Product> productList15 = productService1.getProductsByPriceThreshold((java.lang.Double) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findByPriceBelow(java.lang.Double)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean19 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.example.Product> productList21 = productService1.getProductsByPriceThreshold((java.lang.Double) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findByPriceBelow(java.lang.Double)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Double> doubleList15 = productService1.getPriceHistory((java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = productService1.decrementStock((java.lang.Long) 10L, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Double> doubleList9 = productService1.getPriceHistory((java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.example.Product> productList15 = productService1.getProductsByKeyword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findByKeyword(String)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = productService1.decrementStock((java.lang.Long) 1L, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert13 = productService1.checkLowStock((java.lang.Long) 100L, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            productService1.addPriceHistory((java.lang.Long) 1L, (java.lang.Double) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            productService1.addPriceHistory((java.lang.Long) 10L, (java.lang.Double) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        org.example.Product product17 = null;
        // The following exception was thrown during execution in test generation
        try {
            productService1.createProduct(product17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.save(org.example.Product)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        org.example.OrderStatus orderStatus18 = null;
        // The following exception was thrown during execution in test generation
        try {
            productService1.updateOrderStatus((java.lang.Long) 100L, orderStatus18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findOrderById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.example.Product> productList12 = productService1.getProductsByKeyword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findByKeyword(String)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = productService1.decrementStock((java.lang.Long) 0L, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.example.Product> productList12 = productService1.getProductsByKeyword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findByKeyword(String)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean19 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.example.Order> orderList20 = productService1.getAllOrders();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findAllOrders()\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert10 = productService1.checkLowStock((java.lang.Long) 10L, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            productService1.addPriceHistory((java.lang.Long) 0L, (java.lang.Double) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 100L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = productService1.decrementStock((java.lang.Long) 1L, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = productService1.restockProduct((java.lang.Long) 10L, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = productService1.deleteProduct((java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.delete(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 100L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = productService1.decrementStock((java.lang.Long) 10L, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean19 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.Product product21 = productService1.getProductById((java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean19 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        org.example.OrderStatus orderStatus21 = null;
        // The following exception was thrown during execution in test generation
        try {
            productService1.updateOrderStatus((java.lang.Long) 0L, orderStatus21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findOrderById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert19 = productService1.checkLowStock((java.lang.Long) 100L, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Double> doubleList15 = productService1.getPriceHistory((java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert19 = productService1.checkLowStock((java.lang.Long) 0L, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.example.Product> productList9 = productService1.getProductsByPriceThreshold((java.lang.Double) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findByPriceBelow(java.lang.Double)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = productService1.decrementStock((java.lang.Long) 0L, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean19 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.example.Product> productList21 = productService1.getProductsByPriceThreshold((java.lang.Double) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findByPriceBelow(java.lang.Double)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert10 = productService1.checkLowStock((java.lang.Long) 1L, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = productService1.deleteProduct((java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.delete(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.Product product15 = productService1.getProductById((java.lang.Long) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = productService1.deleteProduct((java.lang.Long) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.delete(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = productService1.restockProduct((java.lang.Long) (-1L), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.Product product15 = productService1.getProductById((java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            productService1.addPriceHistory((java.lang.Long) 10L, (java.lang.Double) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        org.example.Order order17 = null;
        // The following exception was thrown during execution in test generation
        try {
            productService1.createOrder(order17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getQuantity()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.Product product15 = productService1.getProductById((java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.example.Order> orderList14 = productService1.getAllOrders();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findAllOrders()\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean19 = productService1.restockProduct((java.lang.Long) (-1L), (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.Product product21 = productService1.getProductById((java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert10 = productService1.checkLowStock((java.lang.Long) (-1L), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = productService1.decrementStock((java.lang.Long) 0L, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean19 = productService1.restockProduct((java.lang.Long) (-1L), (int) (short) -1);
        org.example.Product product20 = null;
        // The following exception was thrown during execution in test generation
        try {
            productService1.updateProduct(product20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.update(org.example.Product)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.Product product18 = productService1.getProductById((java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Double> doubleList12 = productService1.getPriceHistory((java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.Order order15 = productService1.getOrderById((java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findOrderById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.Order order15 = productService1.getOrderById((java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findOrderById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.example.Product> productList18 = productService1.getProductsByPriceThreshold((java.lang.Double) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findByPriceBelow(java.lang.Double)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = productService1.restockProduct((java.lang.Long) 100L, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert16 = productService1.checkLowStock((java.lang.Long) (-1L), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = productService1.deleteProduct((java.lang.Long) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.delete(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.example.Product> productList15 = productService1.getProductsByPriceThreshold((java.lang.Double) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findByPriceBelow(java.lang.Double)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.Order order12 = productService1.getOrderById((java.lang.Long) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findOrderById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean19 = productService1.restockProduct((java.lang.Long) (-1L), (int) (short) -1);
        org.example.Product product20 = null;
        // The following exception was thrown during execution in test generation
        try {
            productService1.createProduct(product20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.save(org.example.Product)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.Order order18 = productService1.getOrderById((java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findOrderById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        // The following exception was thrown during execution in test generation
        try {
            productService1.addPriceHistory((java.lang.Long) 0L, (java.lang.Double) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Double> doubleList12 = productService1.getPriceHistory((java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean19 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.example.Product> productList21 = productService1.getProductsByPriceThreshold((java.lang.Double) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findByPriceBelow(java.lang.Double)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.Order order15 = productService1.getOrderById((java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findOrderById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            productService1.addPriceHistory((java.lang.Long) 100L, (java.lang.Double) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean19 = productService1.restockProduct((java.lang.Long) (-1L), (int) (short) -1);
        java.lang.Class<?> wildcardClass20 = productService1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.Product product12 = productService1.getProductById((java.lang.Long) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean19 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Double> doubleList21 = productService1.getPriceHistory((java.lang.Long) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            productService1.addPriceHistory((java.lang.Long) 1L, (java.lang.Double) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        org.example.OrderStatus orderStatus12 = null;
        // The following exception was thrown during execution in test generation
        try {
            productService1.updateOrderStatus((java.lang.Long) (-1L), orderStatus12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findOrderById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = productService1.restockProduct((java.lang.Long) (-1L), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean19 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = productService1.restockProduct((java.lang.Long) 0L, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert7 = productService1.checkLowStock((java.lang.Long) 0L, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            productService1.addPriceHistory((java.lang.Long) (-1L), (java.lang.Double) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean19 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Double> doubleList21 = productService1.getPriceHistory((java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean19 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        org.example.OrderStatus orderStatus21 = null;
        // The following exception was thrown during execution in test generation
        try {
            productService1.updateOrderStatus((java.lang.Long) 10L, orderStatus21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findOrderById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.Order order15 = productService1.getOrderById((java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findOrderById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        org.example.OrderStatus orderStatus15 = null;
        // The following exception was thrown during execution in test generation
        try {
            productService1.updateOrderStatus((java.lang.Long) (-1L), orderStatus15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findOrderById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.Product product18 = productService1.getProductById((java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert10 = productService1.checkLowStock((java.lang.Long) 0L, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        org.example.Order order8 = null;
        // The following exception was thrown during execution in test generation
        try {
            productService1.createOrder(order8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getQuantity()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            productService1.addPriceHistory((java.lang.Long) 10L, (java.lang.Double) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = productService1.decrementStock((java.lang.Long) (-1L), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            productService1.addPriceHistory((java.lang.Long) 10L, (java.lang.Double) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.example.Product> productList15 = productService1.getProductsByKeyword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findByKeyword(String)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = productService1.restockProduct((java.lang.Long) 100L, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean19 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            productService1.addPriceHistory((java.lang.Long) 1L, (java.lang.Double) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert16 = productService1.checkLowStock((java.lang.Long) 10L, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 100L, (-1));
        org.example.OrderStatus orderStatus18 = null;
        // The following exception was thrown during execution in test generation
        try {
            productService1.updateOrderStatus((java.lang.Long) 100L, orderStatus18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findOrderById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        org.example.OrderStatus orderStatus15 = null;
        // The following exception was thrown during execution in test generation
        try {
            productService1.updateOrderStatus((java.lang.Long) 100L, orderStatus15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findOrderById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.example.Product> productList9 = productService1.getProductsByKeyword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findByKeyword(String)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        org.example.OrderStatus orderStatus9 = null;
        // The following exception was thrown during execution in test generation
        try {
            productService1.updateOrderStatus((java.lang.Long) 10L, orderStatus9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findOrderById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.Product product18 = productService1.getProductById((java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            productService1.addPriceHistory((java.lang.Long) 10L, (java.lang.Double) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = productService1.decrementStock((java.lang.Long) 1L, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        org.example.OrderStatus orderStatus15 = null;
        // The following exception was thrown during execution in test generation
        try {
            productService1.updateOrderStatus((java.lang.Long) 100L, orderStatus15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findOrderById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            productService1.addPriceHistory((java.lang.Long) (-1L), (java.lang.Double) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            productService1.addPriceHistory((java.lang.Long) 10L, (java.lang.Double) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = productService1.deleteProduct((java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.delete(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = productService1.decrementStock((java.lang.Long) 100L, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = productService1.decrementStock((java.lang.Long) 0L, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        org.example.OrderStatus orderStatus15 = null;
        // The following exception was thrown during execution in test generation
        try {
            productService1.updateOrderStatus((java.lang.Long) 100L, orderStatus15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findOrderById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) (-1L), (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            productService1.addPriceHistory((java.lang.Long) 1L, (java.lang.Double) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = productService1.deleteProduct((java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.delete(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        org.example.OrderStatus orderStatus12 = null;
        // The following exception was thrown during execution in test generation
        try {
            productService1.updateOrderStatus((java.lang.Long) 10L, orderStatus12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findOrderById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.example.Product> productList15 = productService1.getProductsByPriceThreshold((java.lang.Double) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findByPriceBelow(java.lang.Double)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        java.lang.Class<?> wildcardClass14 = productService1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = productService1.decrementStock((java.lang.Long) 10L, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.example.Product> productList12 = productService1.getProductsByPriceThreshold((java.lang.Double) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findByPriceBelow(java.lang.Double)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        org.example.Product product17 = null;
        // The following exception was thrown during execution in test generation
        try {
            productService1.updateProduct(product17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.update(org.example.Product)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean19 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        org.example.OrderStatus orderStatus21 = null;
        // The following exception was thrown during execution in test generation
        try {
            productService1.updateOrderStatus((java.lang.Long) (-1L), orderStatus21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findOrderById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean19 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        org.example.Product product20 = null;
        // The following exception was thrown during execution in test generation
        try {
            productService1.createProduct(product20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.save(org.example.Product)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.example.Product> productList8 = productService1.getProductsSortedByName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findSortedByName()\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert13 = productService1.checkLowStock((java.lang.Long) 10L, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = productService1.decrementStock((java.lang.Long) 0L, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert7 = productService1.checkLowStock((java.lang.Long) 10L, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert10 = productService1.checkLowStock((java.lang.Long) 0L, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean19 = productService1.restockProduct((java.lang.Long) (-1L), (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert22 = productService1.checkLowStock((java.lang.Long) (-1L), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = productService1.decrementStock((java.lang.Long) 10L, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.Order order15 = productService1.getOrderById((java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findOrderById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean19 = productService1.restockProduct((java.lang.Long) (-1L), (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Double> doubleList21 = productService1.getPriceHistory((java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.Product product12 = productService1.getProductById((java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = productService1.decrementStock((java.lang.Long) (-1L), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert16 = productService1.checkLowStock((java.lang.Long) 100L, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean19 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Double> doubleList21 = productService1.getPriceHistory((java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        org.example.Product product14 = null;
        // The following exception was thrown during execution in test generation
        try {
            productService1.createProduct(product14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.save(org.example.Product)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.Order order12 = productService1.getOrderById((java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findOrderById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (-1));
        java.lang.Class<?> wildcardClass11 = productService1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean19 = productService1.restockProduct((java.lang.Long) (-1L), (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert22 = productService1.checkLowStock((java.lang.Long) 0L, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = productService1.decrementStock((java.lang.Long) 10L, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean19 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        boolean boolean22 = productService1.restockProduct((java.lang.Long) (-1L), (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Double> doubleList24 = productService1.getPriceHistory((java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean19 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.example.Product> productList21 = productService1.getProductsByPriceThreshold((java.lang.Double) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findByPriceBelow(java.lang.Double)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.Order order12 = productService1.getOrderById((java.lang.Long) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findOrderById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.example.Product> productList18 = productService1.getProductsByKeyword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findByKeyword(String)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = productService1.restockProduct((java.lang.Long) (-1L), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.example.Product> productList14 = productService1.listAllProducts();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findAll()\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert13 = productService1.checkLowStock((java.lang.Long) 100L, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        org.example.OrderStatus orderStatus15 = null;
        // The following exception was thrown during execution in test generation
        try {
            productService1.updateOrderStatus((java.lang.Long) (-1L), orderStatus15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findOrderById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) (-1L), (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert16 = productService1.checkLowStock((java.lang.Long) 1L, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean19 = productService1.restockProduct((java.lang.Long) (-1L), (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Double> doubleList21 = productService1.getPriceHistory((java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert13 = productService1.checkLowStock((java.lang.Long) 1L, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = productService1.deleteProduct((java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.delete(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean19 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert22 = productService1.checkLowStock((java.lang.Long) 0L, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) (-1L), (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            productService1.addPriceHistory((java.lang.Long) (-1L), (java.lang.Double) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Double> doubleList15 = productService1.getPriceHistory((java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean19 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.example.Product> productList20 = productService1.listAllProducts();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findAll()\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Double> doubleList18 = productService1.getPriceHistory((java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.example.Product> productList18 = productService1.getProductsByPriceThreshold((java.lang.Double) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findByPriceBelow(java.lang.Double)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        org.example.Product product11 = null;
        // The following exception was thrown during execution in test generation
        try {
            productService1.updateProduct(product11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.update(org.example.Product)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            productService1.addPriceHistory((java.lang.Long) (-1L), (java.lang.Double) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert19 = productService1.checkLowStock((java.lang.Long) 100L, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = productService1.decrementStock((java.lang.Long) 10L, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.example.Product> productList12 = productService1.getProductsByPriceThreshold((java.lang.Double) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findByPriceBelow(java.lang.Double)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = productService1.decrementStock((java.lang.Long) 100L, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = productService1.decrementStock((java.lang.Long) (-1L), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean19 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.Order order21 = productService1.getOrderById((java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findOrderById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        java.lang.Class<?> wildcardClass11 = productService1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2875");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert16 = productService1.checkLowStock((java.lang.Long) 10L, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = productService1.decrementStock((java.lang.Long) 1L, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (-1));
        org.example.OrderStatus orderStatus15 = null;
        // The following exception was thrown during execution in test generation
        try {
            productService1.updateOrderStatus((java.lang.Long) (-1L), orderStatus15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findOrderById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean19 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        boolean boolean22 = productService1.restockProduct((java.lang.Long) (-1L), (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.Product product24 = productService1.getProductById((java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            productService1.addPriceHistory((java.lang.Long) 100L, (java.lang.Double) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.example.Product> productList18 = productService1.getProductsByPriceThreshold((java.lang.Double) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findByPriceBelow(java.lang.Double)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        java.lang.Class<?> wildcardClass8 = productService1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            productService1.addPriceHistory((java.lang.Long) 1L, (java.lang.Double) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert13 = productService1.checkLowStock((java.lang.Long) 1L, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean19 = productService1.restockProduct((java.lang.Long) (-1L), (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = productService1.decrementStock((java.lang.Long) 10L, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            productService1.addPriceHistory((java.lang.Long) 1L, (java.lang.Double) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            productService1.addPriceHistory((java.lang.Long) 0L, (java.lang.Double) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.example.Product> productList9 = productService1.getProductsByKeyword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findByKeyword(String)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean19 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        org.example.OrderStatus orderStatus21 = null;
        // The following exception was thrown during execution in test generation
        try {
            productService1.updateOrderStatus((java.lang.Long) 1L, orderStatus21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findOrderById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Double> doubleList9 = productService1.getPriceHistory((java.lang.Long) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.Product product15 = productService1.getProductById((java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean19 = productService1.restockProduct((java.lang.Long) (-1L), (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.example.Product> productList20 = productService1.listAllProducts();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findAll()\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (-1));
        org.example.Product product14 = null;
        // The following exception was thrown during execution in test generation
        try {
            productService1.updateProduct(product14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.update(org.example.Product)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = productService1.deleteProduct((java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.delete(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Double> doubleList18 = productService1.getPriceHistory((java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 100L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Double> doubleList18 = productService1.getPriceHistory((java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = productService1.deleteProduct((java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.delete(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            productService1.addPriceHistory((java.lang.Long) (-1L), (java.lang.Double) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2900");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 100L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.Order order18 = productService1.getOrderById((java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findOrderById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2901");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert7 = productService1.checkLowStock((java.lang.Long) 1L, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2902");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert10 = productService1.checkLowStock((java.lang.Long) 100L, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2903");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean19 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        boolean boolean22 = productService1.restockProduct((java.lang.Long) (-1L), (int) (short) -1);
        org.example.OrderStatus orderStatus24 = null;
        // The following exception was thrown during execution in test generation
        try {
            productService1.updateOrderStatus((java.lang.Long) 100L, orderStatus24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findOrderById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2904");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        org.example.OrderStatus orderStatus15 = null;
        // The following exception was thrown during execution in test generation
        try {
            productService1.updateOrderStatus((java.lang.Long) 0L, orderStatus15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findOrderById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.Order order12 = productService1.getOrderById((java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findOrderById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2907");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.Order order12 = productService1.getOrderById((java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findOrderById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2908");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = productService1.deleteProduct((java.lang.Long) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.delete(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2909");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 100L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.example.Product> productList18 = productService1.getProductsByPriceThreshold((java.lang.Double) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findByPriceBelow(java.lang.Double)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2912");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = productService1.decrementStock((java.lang.Long) 10L, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            productService1.addPriceHistory((java.lang.Long) 1L, (java.lang.Double) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2914");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            productService1.addPriceHistory((java.lang.Long) 0L, (java.lang.Double) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2915");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.Order order18 = productService1.getOrderById((java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findOrderById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2916");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = productService1.restockProduct((java.lang.Long) (-1L), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2917");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2918");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            productService1.addPriceHistory((java.lang.Long) 0L, (java.lang.Double) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2919");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean19 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        boolean boolean22 = productService1.restockProduct((java.lang.Long) (-1L), (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = productService1.decrementStock((java.lang.Long) (-1L), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2920");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert16 = productService1.checkLowStock((java.lang.Long) 10L, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = productService1.restockProduct((java.lang.Long) (-1L), 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2922");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean19 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.example.Product> productList21 = productService1.getProductsByPriceThreshold((java.lang.Double) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findByPriceBelow(java.lang.Double)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2923");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            productService1.addPriceHistory((java.lang.Long) 10L, (java.lang.Double) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2924");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert16 = productService1.checkLowStock((java.lang.Long) 1L, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2925");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        org.example.Order order11 = null;
        // The following exception was thrown during execution in test generation
        try {
            productService1.createOrder(order11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getQuantity()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2926");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.Product product15 = productService1.getProductById((java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2927");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.example.Product> productList9 = productService1.getProductsByPriceThreshold((java.lang.Double) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findByPriceBelow(java.lang.Double)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2928");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = productService1.decrementStock((java.lang.Long) 10L, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2929");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert10 = productService1.checkLowStock((java.lang.Long) 10L, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2930");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.Product product12 = productService1.getProductById((java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2931");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.example.Product> productList9 = productService1.getProductsByPriceThreshold((java.lang.Double) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findByPriceBelow(java.lang.Double)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2932");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (-1));
        org.example.OrderStatus orderStatus12 = null;
        // The following exception was thrown during execution in test generation
        try {
            productService1.updateOrderStatus((java.lang.Long) (-1L), orderStatus12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findOrderById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2933");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        java.lang.Class<?> wildcardClass17 = productService1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2934");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.Order order12 = productService1.getOrderById((java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findOrderById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2935");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.example.Product> productList11 = productService1.getProductsSortedByName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findSortedByName()\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2936");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Double> doubleList9 = productService1.getPriceHistory((java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2937");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert19 = productService1.checkLowStock((java.lang.Long) 1L, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2938");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.Order order12 = productService1.getOrderById((java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findOrderById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2939");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean19 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        boolean boolean22 = productService1.restockProduct((java.lang.Long) (-1L), (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert25 = productService1.checkLowStock((java.lang.Long) (-1L), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2940");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            productService1.addPriceHistory((java.lang.Long) 1L, (java.lang.Double) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2941");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean19 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            productService1.addPriceHistory((java.lang.Long) (-1L), (java.lang.Double) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2942");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean19 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        boolean boolean22 = productService1.restockProduct((java.lang.Long) (-1L), (int) (short) -1);
        org.example.Product product23 = null;
        // The following exception was thrown during execution in test generation
        try {
            productService1.createProduct(product23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.save(org.example.Product)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2943");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2944");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.example.Product> productList11 = productService1.listAllProducts();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findAll()\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2945");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = productService1.decrementStock((java.lang.Long) (-1L), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2946");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.example.Order> orderList11 = productService1.getAllOrders();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findAllOrders()\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2947");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.example.Product> productList12 = productService1.getProductsByPriceThreshold((java.lang.Double) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findByPriceBelow(java.lang.Double)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2948");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean19 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        org.example.Product product20 = null;
        // The following exception was thrown during execution in test generation
        try {
            productService1.updateProduct(product20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.update(org.example.Product)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2949");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean19 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        boolean boolean22 = productService1.restockProduct((java.lang.Long) (-1L), (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.example.Product> productList23 = productService1.listAllProducts();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findAll()\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2950");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2951");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.example.Product> productList15 = productService1.getProductsByPriceThreshold((java.lang.Double) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findByPriceBelow(java.lang.Double)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2952");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert13 = productService1.checkLowStock((java.lang.Long) 1L, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2953");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert16 = productService1.checkLowStock((java.lang.Long) (-1L), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2954");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.Product product9 = productService1.getProductById((java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2955");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.Product product18 = productService1.getProductById((java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2956");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            productService1.addPriceHistory((java.lang.Long) 0L, (java.lang.Double) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2957");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = productService1.decrementStock((java.lang.Long) 10L, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2958");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Double> doubleList15 = productService1.getPriceHistory((java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2959");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            productService1.addPriceHistory((java.lang.Long) (-1L), (java.lang.Double) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2960");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert13 = productService1.checkLowStock((java.lang.Long) 100L, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2961");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 100L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = productService1.decrementStock((java.lang.Long) 0L, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2962");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.Order order15 = productService1.getOrderById((java.lang.Long) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findOrderById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2963");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.Order order15 = productService1.getOrderById((java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findOrderById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2964");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Double> doubleList12 = productService1.getPriceHistory((java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2965");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Double> doubleList12 = productService1.getPriceHistory((java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2966");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = productService1.deleteProduct((java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.delete(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2967");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert13 = productService1.checkLowStock((java.lang.Long) 0L, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2968");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert10 = productService1.checkLowStock((java.lang.Long) 0L, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2969");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = productService1.decrementStock((java.lang.Long) 0L, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2970");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean19 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2971");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            productService1.addPriceHistory((java.lang.Long) (-1L), (java.lang.Double) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2972");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.Order order12 = productService1.getOrderById((java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findOrderById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2973");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean19 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        boolean boolean22 = productService1.restockProduct((java.lang.Long) (-1L), (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.Product product24 = productService1.getProductById((java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2974");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2975");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert19 = productService1.checkLowStock((java.lang.Long) 0L, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2976");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Double> doubleList12 = productService1.getPriceHistory((java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2977");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = productService1.decrementStock((java.lang.Long) 0L, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2978");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Double> doubleList15 = productService1.getPriceHistory((java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2979");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 100L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = productService1.decrementStock((java.lang.Long) (-1L), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2980");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.Product product15 = productService1.getProductById((java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2981");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 100L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2982");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert16 = productService1.checkLowStock((java.lang.Long) (-1L), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2983");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        org.example.Order order14 = null;
        // The following exception was thrown during execution in test generation
        try {
            productService1.createOrder(order14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getQuantity()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2984");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert13 = productService1.checkLowStock((java.lang.Long) (-1L), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2985");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            productService1.addPriceHistory((java.lang.Long) 10L, (java.lang.Double) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2986");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Double> doubleList15 = productService1.getPriceHistory((java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2987");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert4 = productService1.checkLowStock((java.lang.Long) (-1L), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2988");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.example.Product> productList18 = productService1.getProductsByPriceThreshold((java.lang.Double) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findByPriceBelow(java.lang.Double)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2989");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = productService1.decrementStock((java.lang.Long) 10L, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2990");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = productService1.decrementStock((java.lang.Long) 100L, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2991");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Double> doubleList15 = productService1.getPriceHistory((java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2992");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.example.Order> orderList8 = productService1.getAllOrders();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findAllOrders()\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2993");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.example.Order> orderList11 = productService1.getAllOrders();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findAllOrders()\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2994");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        org.example.Order order8 = null;
        // The following exception was thrown during execution in test generation
        try {
            productService1.createOrder(order8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getQuantity()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2995");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) (-1L), (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.Product product15 = productService1.getProductById((java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2996");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2997");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            productService1.addPriceHistory((java.lang.Long) 1L, (java.lang.Double) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2998");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.Order order18 = productService1.getOrderById((java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findOrderById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2999");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            productService1.addPriceHistory((java.lang.Long) 0L, (java.lang.Double) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3000");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean19 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            productService1.addPriceHistory((java.lang.Long) 100L, (java.lang.Double) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }
}

