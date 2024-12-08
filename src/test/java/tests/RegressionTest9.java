package tests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest9 {

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
    public void test4501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4501");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (-1));
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
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4502");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4503");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (-1));
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
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4504");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = productService1.decrementStock((java.lang.Long) 1L, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4505");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = productService1.decrementStock((java.lang.Long) 100L, (int) '4');
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
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4506");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4507");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
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
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4508");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert16 = productService1.checkLowStock((java.lang.Long) 10L, (int) (short) 10);
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
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4509");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean19 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.Order order21 = productService1.getOrderById((java.lang.Long) 1L);
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
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4510");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) 0);
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
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4511");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (-1));
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
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4512");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = productService1.decrementStock((java.lang.Long) 100L, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4513");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
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
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4514");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
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
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4515");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean19 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean22 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        boolean boolean25 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert28 = productService1.checkLowStock((java.lang.Long) 100L, (int) 'a');
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4516");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
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
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4517");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean19 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4518");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 100L, (-1));
        boolean boolean19 = productService1.restockProduct((java.lang.Long) 10L, (-1));
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
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4519");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 100L, (-1));
        boolean boolean19 = productService1.restockProduct((java.lang.Long) 10L, (-1));
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
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4520");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (-1));
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
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4521");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert16 = productService1.checkLowStock((java.lang.Long) 10L, (int) (byte) 1);
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
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4522");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean19 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean22 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        boolean boolean25 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.example.Order> orderList26 = productService1.getAllOrders();
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4523");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
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
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4524");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert16 = productService1.checkLowStock((java.lang.Long) 0L, (int) '#');
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
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4525");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean19 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean22 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        org.example.OrderStatus orderStatus24 = null;
        // The following exception was thrown during execution in test generation
        try {
            productService1.updateOrderStatus((java.lang.Long) 0L, orderStatus24);
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
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4526");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean19 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = productService1.decrementStock((java.lang.Long) 0L, 100);
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
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4527");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean19 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        boolean boolean22 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = productService1.deleteProduct((java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.delete(java.lang.Long)\" because \"this.productRepository\" is null");
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
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4528");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 100L, (-1));
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
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4529");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
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
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4530");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
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
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4531");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = productService1.decrementStock((java.lang.Long) (-1L), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4532");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) (-1L), (int) (short) -1);
        org.example.OrderStatus orderStatus18 = null;
        // The following exception was thrown during execution in test generation
        try {
            productService1.updateOrderStatus((java.lang.Long) 0L, orderStatus18);
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
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4533");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) (-1L), (int) (short) -1);
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
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4534");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
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
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4535");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (-1));
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
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4536");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        boolean boolean19 = productService1.restockProduct((java.lang.Long) 0L, (-1));
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
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4537");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = productService1.decrementStock((java.lang.Long) 100L, 100);
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
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4538");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean19 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean22 = productService1.restockProduct((java.lang.Long) 0L, (-1));
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
    public void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4539");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean19 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4540");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) (-1L), (int) (byte) -1);
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
    public void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4541");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) (-1L), (int) (short) -1);
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
    public void test4542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4542");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 1L, (-1));
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
    public void test4543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4543");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) (-1L), (int) (short) -1);
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
    public void test4544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4544");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4545");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean19 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4546");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert16 = productService1.checkLowStock((java.lang.Long) 100L, (int) (short) 100);
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
    public void test4547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4547");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean19 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean22 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        boolean boolean25 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        org.example.Product product26 = null;
        // The following exception was thrown during execution in test generation
        try {
            productService1.updateProduct(product26);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test4548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4548");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test4549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4549");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (-1));
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
    public void test4550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4550");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
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
    public void test4551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4551");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
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
    public void test4552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4552");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (-1));
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
    public void test4553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4553");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
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
    public void test4554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4554");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
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
    }

    @Test
    public void test4555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4555");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean19 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
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
    public void test4556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4556");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
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
    public void test4557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4557");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (-1));
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
    public void test4558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4558");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean19 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
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
    public void test4559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4559");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = productService1.decrementStock((java.lang.Long) 0L, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4560");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (-1));
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
    public void test4561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4561");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.Order order9 = productService1.getOrderById((java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findOrderById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4562");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = productService1.decrementStock((java.lang.Long) 100L, 1);
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
    public void test4563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4563");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
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
    public void test4564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4564");
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
            org.example.Product product21 = productService1.getProductById((java.lang.Long) 100L);
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
    public void test4565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4565");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert16 = productService1.checkLowStock((java.lang.Long) 100L, (int) (byte) 10);
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
    public void test4566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4566");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert19 = productService1.checkLowStock((java.lang.Long) 1L, (int) 'a');
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
    public void test4567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4567");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) (-1L), (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4568");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert16 = productService1.checkLowStock((java.lang.Long) 0L, (int) (byte) 1);
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
    public void test4569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4569");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
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
    public void test4570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4570");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = productService1.decrementStock((java.lang.Long) 10L, 0);
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
    public void test4571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4571");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean19 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test4572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4572");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean19 = productService1.restockProduct((java.lang.Long) (-1L), (int) (short) -1);
        boolean boolean22 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.example.Product> productList24 = productService1.getProductsByKeyword("");
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4573");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.Product product18 = productService1.getProductById((java.lang.Long) 1L);
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
    public void test4574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4574");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = productService1.decrementStock((java.lang.Long) 1L, (int) '4');
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
    public void test4575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4575");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean19 = productService1.restockProduct((java.lang.Long) 1L, (-1));
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
    public void test4576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4576");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean19 = productService1.restockProduct((java.lang.Long) (-1L), (int) (short) -1);
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
    public void test4577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4577");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test4578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4578");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) (-1L), (int) (short) -1);
        boolean boolean19 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean22 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        org.example.OrderStatus orderStatus24 = null;
        // The following exception was thrown during execution in test generation
        try {
            productService1.updateOrderStatus((java.lang.Long) 1L, orderStatus24);
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
    public void test4579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4579");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = productService1.decrementStock((java.lang.Long) 10L, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4580");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert10 = productService1.checkLowStock((java.lang.Long) 0L, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4581");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) (-1L), (int) (short) -1);
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
    public void test4582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4582");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        boolean boolean19 = productService1.restockProduct((java.lang.Long) 0L, (-1));
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
    public void test4583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4583");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = productService1.restockProduct((java.lang.Long) (-1L), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4584");
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
            boolean boolean22 = productService1.restockProduct((java.lang.Long) (-1L), (int) ' ');
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
    public void test4585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4585");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean19 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean22 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.example.Product> productList24 = productService1.getProductsByPriceThreshold((java.lang.Double) (-1.0d));
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4586");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 1L, (-1));
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
    public void test4587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4587");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
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
    public void test4588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4588");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
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
    public void test4589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4589");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) (-1L), (int) (short) -1);
        boolean boolean19 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean22 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.example.Product> productList23 = productService1.getProductsSortedByName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findSortedByName()\" because \"this.productRepository\" is null");
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
    public void test4590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4590");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
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
    public void test4591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4591");
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
            productService1.updateOrderStatus((java.lang.Long) 0L, orderStatus18);
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
    public void test4592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4592");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert7 = productService1.checkLowStock((java.lang.Long) 0L, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test4593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4593");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) (-1L), (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert16 = productService1.checkLowStock((java.lang.Long) 1L, (int) (byte) 0);
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
    public void test4594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4594");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) (-1L), (int) (short) -1);
        boolean boolean19 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = productService1.deleteProduct((java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.delete(java.lang.Long)\" because \"this.productRepository\" is null");
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
    public void test4595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4595");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test4596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4596");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = productService1.deleteProduct((java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.delete(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test4597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4597");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean19 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert22 = productService1.checkLowStock((java.lang.Long) 10L, (int) (short) 0);
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
    public void test4598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4598");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 100L, (-1));
        boolean boolean19 = productService1.restockProduct((java.lang.Long) 1L, (-1));
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
    public void test4599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4599");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
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
    public void test4600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4600");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert13 = productService1.checkLowStock((java.lang.Long) 100L, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4601");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert13 = productService1.checkLowStock((java.lang.Long) 0L, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4602");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean19 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        boolean boolean22 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
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
    public void test4603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4603");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
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
    public void test4604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4604");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean19 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean22 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
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
    public void test4605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4605");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (-1));
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
    public void test4606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4606");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) (-1L), (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = productService1.decrementStock((java.lang.Long) (-1L), 100);
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
    public void test4607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4607");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) (-1L), (int) (byte) -1);
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
    public void test4608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4608");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean19 = productService1.restockProduct((java.lang.Long) (-1L), (int) (short) -1);
        boolean boolean22 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        org.example.OrderStatus orderStatus24 = null;
        // The following exception was thrown during execution in test generation
        try {
            productService1.updateOrderStatus((java.lang.Long) (-1L), orderStatus24);
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
    public void test4609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4609");
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
            boolean boolean22 = productService1.decrementStock((java.lang.Long) 0L, (int) (short) 0);
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
    public void test4610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4610");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean19 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean22 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        boolean boolean25 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        org.example.Product product26 = null;
        // The following exception was thrown during execution in test generation
        try {
            productService1.createProduct(product26);
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test4611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4611");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = productService1.deleteProduct((java.lang.Long) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.delete(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4612");
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
            productService1.addPriceHistory((java.lang.Long) 10L, (java.lang.Double) 1.0d);
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
    public void test4613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4613");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert16 = productService1.checkLowStock((java.lang.Long) 0L, (int) '4');
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
    public void test4614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4614");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test4615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4615");
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
            org.example.InventoryAlert inventoryAlert22 = productService1.checkLowStock((java.lang.Long) 1L, (int) (byte) 100);
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
    public void test4616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4616");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4617");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) (-1L), (int) (byte) -1);
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
    public void test4618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4618");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = productService1.decrementStock((java.lang.Long) 100L, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4619");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = productService1.decrementStock((java.lang.Long) (-1L), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4620");
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
            org.example.Product product21 = productService1.getProductById((java.lang.Long) (-1L));
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
    public void test4621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4621");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
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
    public void test4622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4622");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert16 = productService1.checkLowStock((java.lang.Long) 0L, (int) 'a');
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
    public void test4623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4623");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) (-1L), (int) (short) -1);
        boolean boolean19 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
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
    public void test4624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4624");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = productService1.decrementStock((java.lang.Long) 100L, (int) (byte) 0);
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
    public void test4625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4625");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean19 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test4626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4626");
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
            productService1.updateOrderStatus((java.lang.Long) 1L, orderStatus24);
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
    public void test4627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4627");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (-1));
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
    public void test4628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4628");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 100L, (-1));
        boolean boolean19 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.Order order21 = productService1.getOrderById((java.lang.Long) 10L);
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
    public void test4629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4629");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    }

    @Test
    public void test4630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4630");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) (-1L), (int) (short) -1);
        boolean boolean19 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4631");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean19 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test4632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4632");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean19 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
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
    public void test4633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4633");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.example.Order> orderList17 = productService1.getAllOrders();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findAllOrders()\" because \"this.productRepository\" is null");
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
    public void test4634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4634");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean19 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean22 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        org.example.Order order23 = null;
        // The following exception was thrown during execution in test generation
        try {
            productService1.createOrder(order23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getQuantity()\" because \"order\" is null");
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
    public void test4635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4635");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test4636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4636");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) (-1L), (int) (byte) -1);
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
    public void test4637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4637");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = productService1.decrementStock((java.lang.Long) 1L, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4638");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (-1));
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
    public void test4639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4639");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        boolean boolean19 = productService1.restockProduct((java.lang.Long) 0L, (-1));
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
    public void test4640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4640");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert13 = productService1.checkLowStock((java.lang.Long) (-1L), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4641");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean19 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = productService1.decrementStock((java.lang.Long) (-1L), (int) (byte) -1);
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
    public void test4642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4642");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
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
    public void test4643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4643");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        // The following exception was thrown during execution in test generation
        try {
            productService1.addPriceHistory((java.lang.Long) 10L, (java.lang.Double) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test4644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4644");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean19 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) 1);
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
    public void test4645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4645");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4646");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) (-1L), (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = productService1.decrementStock((java.lang.Long) (-1L), 10);
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
    public void test4647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4647");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 1L, (-1));
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
    public void test4648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4648");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
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
    public void test4649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4649");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
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
    public void test4650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4650");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            productService1.addPriceHistory((java.lang.Long) 0L, (java.lang.Double) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4651");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4652");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean19 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        boolean boolean22 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4653");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (-1));
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
    public void test4654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4654");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean19 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4655");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) (-1L), (int) (byte) -1);
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
    public void test4656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4656");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = productService1.decrementStock((java.lang.Long) 10L, 0);
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
    public void test4657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4657");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
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
    public void test4658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4658");
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
    public void test4659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4659");
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
            boolean boolean22 = productService1.decrementStock((java.lang.Long) 10L, 100);
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
    public void test4660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4660");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = productService1.restockProduct((java.lang.Long) (-1L), (int) (byte) 0);
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
    public void test4661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4661");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 100L, (-1));
        boolean boolean19 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert22 = productService1.checkLowStock((java.lang.Long) 10L, (int) '#');
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
    public void test4662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4662");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (-1));
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
    public void test4663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4663");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert7 = productService1.checkLowStock((java.lang.Long) 100L, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test4664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4664");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = productService1.decrementStock((java.lang.Long) (-1L), 10);
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
    public void test4665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4665");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 100L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.Order order18 = productService1.getOrderById((java.lang.Long) 100L);
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
    public void test4666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4666");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean19 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean22 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        java.lang.Class<?> wildcardClass23 = productService1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4667");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
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
    public void test4668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4668");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean19 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean22 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        boolean boolean25 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.example.Product> productList26 = productService1.listAllProducts();
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test4669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4669");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean19 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
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
    public void test4670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4670");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 100L, (-1));
        boolean boolean19 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.Order order21 = productService1.getOrderById((java.lang.Long) 100L);
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
    public void test4671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4671");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 1L, (-1));
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
    public void test4672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4672");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = productService1.restockProduct((java.lang.Long) (-1L), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4673");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test4674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4674");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (-1));
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
    public void test4675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4675");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean19 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4676");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, 100);
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
    public void test4677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4677");
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
    public void test4678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4678");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
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
    public void test4679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4679");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = productService1.restockProduct((java.lang.Long) 0L, (int) '4');
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
    public void test4680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4680");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) (-1L), (int) (byte) -1);
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
    public void test4681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4681");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test4682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4682");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert19 = productService1.checkLowStock((java.lang.Long) 0L, 0);
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
    public void test4683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4683");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert16 = productService1.checkLowStock((java.lang.Long) (-1L), (int) (byte) 0);
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
    public void test4684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4684");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean19 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
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
    public void test4685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4685");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        java.lang.Class<?> wildcardClass14 = productService1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4686");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4687");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = productService1.decrementStock((java.lang.Long) 1L, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4688");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = productService1.decrementStock((java.lang.Long) 0L, (int) '4');
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
    public void test4689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4689");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        boolean boolean19 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = productService1.decrementStock((java.lang.Long) 100L, (int) ' ');
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
    public void test4690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4690");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.Product product18 = productService1.getProductById((java.lang.Long) 1L);
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
    public void test4691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4691");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean19 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        boolean boolean22 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert25 = productService1.checkLowStock((java.lang.Long) 10L, 10);
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
    public void test4692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4692");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) (-1L), (int) (byte) -1);
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
    public void test4693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4693");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean19 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test4694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4694");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) (-1L), (int) (short) -1);
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
    public void test4695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4695");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.Order order9 = productService1.getOrderById((java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findOrderById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4696");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
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
    }

    @Test
    public void test4697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4697");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = productService1.restockProduct((java.lang.Long) 100L, (int) 'a');
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
    public void test4698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4698");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) (-1L), (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4699");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
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
    public void test4700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4700");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert16 = productService1.checkLowStock((java.lang.Long) (-1L), (int) (short) -1);
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
    public void test4701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4701");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = productService1.restockProduct((java.lang.Long) 0L, 0);
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
    public void test4702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4702");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) (-1L), (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        org.example.OrderStatus orderStatus12 = null;
        // The following exception was thrown during execution in test generation
        try {
            productService1.updateOrderStatus((java.lang.Long) 1L, orderStatus12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findOrderById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4703");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (-1));
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
    public void test4704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4704");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = productService1.restockProduct((java.lang.Long) (-1L), 10);
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
    public void test4705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4705");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
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
    public void test4706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4706");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) (-1L), (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4707");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean19 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.Product product21 = productService1.getProductById((java.lang.Long) 100L);
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
    public void test4708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4708");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) (-1L), (int) (short) -1);
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
    public void test4709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4709");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (-1));
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
    public void test4710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4710");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) (-1L), (int) (short) -1);
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
    public void test4711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4711");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) (-1L), (int) (short) -1);
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
    public void test4712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4712");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = productService1.deleteProduct((java.lang.Long) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.delete(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4713");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean19 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean22 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        java.lang.Class<?> wildcardClass23 = productService1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4714");
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
            boolean boolean22 = productService1.decrementStock((java.lang.Long) 100L, (int) (byte) 100);
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
    public void test4715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4715");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = productService1.decrementStock((java.lang.Long) 0L, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4716");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test4717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4717");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
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
    public void test4718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4718");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
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
    }

    @Test
    public void test4719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4719");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
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
    public void test4720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4720");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) 0);
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
    public void test4721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4721");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4722");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
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
    public void test4723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4723");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean19 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean22 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        org.example.OrderStatus orderStatus24 = null;
        // The following exception was thrown during execution in test generation
        try {
            productService1.updateOrderStatus((java.lang.Long) 1L, orderStatus24);
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
    public void test4724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4724");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 100L, (-1));
        boolean boolean19 = productService1.restockProduct((java.lang.Long) 1L, (-1));
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
    public void test4725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4725");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) (-1L), (int) (short) -1);
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
    public void test4726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4726");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = productService1.decrementStock((java.lang.Long) (-1L), (int) (byte) -1);
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
    public void test4727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4727");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 100L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = productService1.decrementStock((java.lang.Long) 10L, (int) (short) 0);
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
    public void test4728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4728");
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
    public void test4729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4729");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) (-1L), (int) (short) -1);
        boolean boolean19 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean22 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.Order order24 = productService1.getOrderById((java.lang.Long) 1L);
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
    public void test4730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4730");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
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
}

