package tests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

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
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean19 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        org.example.Order order20 = null;
        // The following exception was thrown during execution in test generation
        try {
            productService1.createOrder(order20);
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
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
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
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (-1));
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
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
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
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
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
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
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
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
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
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
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
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
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
            productService1.updateOrderStatus((java.lang.Long) (-1L), orderStatus18);
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
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
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
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
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
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
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
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
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
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            productService1.addPriceHistory((java.lang.Long) 1L, (java.lang.Double) (-1.0d));
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
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 100L, (-1));
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
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
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
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) (-1L), (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert16 = productService1.checkLowStock((java.lang.Long) 0L, (int) (byte) 100);
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
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
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
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert16 = productService1.checkLowStock((java.lang.Long) 1L, (int) (short) 100);
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
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
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
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
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
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
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
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
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
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            productService1.addPriceHistory((java.lang.Long) (-1L), (java.lang.Double) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
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
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
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
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
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
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
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
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
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
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            productService1.addPriceHistory((java.lang.Long) 100L, (java.lang.Double) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
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
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
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
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
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
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = productService1.decrementStock((java.lang.Long) 1L, (int) (short) -1);
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
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (-1));
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
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = productService1.decrementStock((java.lang.Long) 10L, (int) 'a');
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
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
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
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
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
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean19 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
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
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) (-1L), (int) (short) -1);
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
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = productService1.decrementStock((java.lang.Long) 1L, (int) (short) 10);
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
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
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
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (-1));
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
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
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
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (-1));
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
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            productService1.addPriceHistory((java.lang.Long) 100L, (java.lang.Double) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
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
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
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
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = productService1.restockProduct((java.lang.Long) 0L, (int) '#');
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
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert10 = productService1.checkLowStock((java.lang.Long) 10L, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
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
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
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
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert13 = productService1.checkLowStock((java.lang.Long) 0L, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
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
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
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
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
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
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
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
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
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
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
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
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (-1));
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
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 100L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.example.Product> productList17 = productService1.listAllProducts();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findAll()\" because \"this.productRepository\" is null");
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
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
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
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
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
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
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
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
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
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
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
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
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
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
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
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
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
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            productService1.addPriceHistory((java.lang.Long) 100L, (java.lang.Double) 0.0d);
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
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = productService1.decrementStock((java.lang.Long) (-1L), 0);
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
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
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
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert7 = productService1.checkLowStock((java.lang.Long) (-1L), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
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
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
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
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
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
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
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
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
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
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (-1));
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
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
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
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.example.Product> productList17 = productService1.listAllProducts();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findAll()\" because \"this.productRepository\" is null");
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
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (-1));
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
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            productService1.addPriceHistory((java.lang.Long) (-1L), (java.lang.Double) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
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
            boolean boolean21 = productService1.deleteProduct((java.lang.Long) 100L);
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
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
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
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
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
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert13 = productService1.checkLowStock((java.lang.Long) 0L, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 100L, (-1));
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
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        java.lang.Class<?> wildcardClass14 = productService1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert16 = productService1.checkLowStock((java.lang.Long) 100L, (int) (byte) 100);
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
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
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
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
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
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
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
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
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
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
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
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
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
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
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
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = productService1.decrementStock((java.lang.Long) 0L, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
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
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 100L, (-1));
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
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
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
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = productService1.decrementStock((java.lang.Long) 0L, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (-1));
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
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (-1));
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
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = productService1.restockProduct((java.lang.Long) (-1L), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
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
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
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
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 100L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.example.Product> productList18 = productService1.getProductsByPriceThreshold((java.lang.Double) 10.0d);
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
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.example.Product> productList15 = productService1.getProductsByPriceThreshold((java.lang.Double) 1.0d);
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
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
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
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert16 = productService1.checkLowStock((java.lang.Long) 100L, (int) ' ');
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
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.example.Product> productList17 = productService1.getProductsSortedByName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findSortedByName()\" because \"this.productRepository\" is null");
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
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.example.Product> productList18 = productService1.getProductsByKeyword("hi!");
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
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
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
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = productService1.decrementStock((java.lang.Long) 100L, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
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
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = productService1.decrementStock((java.lang.Long) 100L, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (-1));
        java.lang.Class<?> wildcardClass14 = productService1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
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
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (-1));
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
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = productService1.decrementStock((java.lang.Long) 100L, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
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
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
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
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.example.Product> productList17 = productService1.getProductsSortedByName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findSortedByName()\" because \"this.productRepository\" is null");
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
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert16 = productService1.checkLowStock((java.lang.Long) 0L, (-1));
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
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
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
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
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
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        org.example.OrderStatus orderStatus6 = null;
        // The following exception was thrown during execution in test generation
        try {
            productService1.updateOrderStatus((java.lang.Long) 100L, orderStatus6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findOrderById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
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
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) 100);
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
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
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
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
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
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
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
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
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
            java.util.List<org.example.Product> productList20 = productService1.getProductsSortedByName();
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
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = productService1.decrementStock((java.lang.Long) (-1L), 100);
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
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Double> doubleList18 = productService1.getPriceHistory((java.lang.Long) 0L);
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
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = productService1.decrementStock((java.lang.Long) 0L, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
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
            java.util.List<java.lang.Double> doubleList21 = productService1.getPriceHistory((java.lang.Long) 10L);
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
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert4 = productService1.checkLowStock((java.lang.Long) 0L, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
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
            boolean boolean22 = productService1.decrementStock((java.lang.Long) 100L, (int) (byte) -1);
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
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
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
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
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
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.example.Product> productList9 = productService1.getProductsByPriceThreshold((java.lang.Double) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findByPriceBelow(java.lang.Double)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
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
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
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
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
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
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
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
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
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
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = productService1.decrementStock((java.lang.Long) (-1L), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
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
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
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
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
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
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
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
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = productService1.decrementStock((java.lang.Long) (-1L), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
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
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.example.Product> productList17 = productService1.getProductsSortedByName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findSortedByName()\" because \"this.productRepository\" is null");
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
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
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
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert16 = productService1.checkLowStock((java.lang.Long) 0L, (int) (short) 1);
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
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
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
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = productService1.deleteProduct((java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.delete(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 100L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = productService1.decrementStock((java.lang.Long) 100L, (int) '#');
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
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = productService1.restockProduct((java.lang.Long) 10L, (int) ' ');
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
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
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
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
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
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
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
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = productService1.decrementStock((java.lang.Long) 100L, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 100L, (-1));
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert13 = productService1.checkLowStock((java.lang.Long) 1L, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (-1));
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
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (-1));
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
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = productService1.decrementStock((java.lang.Long) 10L, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert19 = productService1.checkLowStock((java.lang.Long) 10L, (int) (short) 0);
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
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert16 = productService1.checkLowStock((java.lang.Long) 0L, (int) (short) 10);
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
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
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
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (-1));
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
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = productService1.decrementStock((java.lang.Long) (-1L), (int) '#');
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
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
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
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
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
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert13 = productService1.checkLowStock((java.lang.Long) 0L, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = productService1.decrementStock((java.lang.Long) 0L, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
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
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
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
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = productService1.decrementStock((java.lang.Long) 0L, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
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
            org.example.InventoryAlert inventoryAlert22 = productService1.checkLowStock((java.lang.Long) 100L, 0);
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
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
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
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = productService1.restockProduct((java.lang.Long) (-1L), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
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
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
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
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
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
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
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
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
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
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert10 = productService1.checkLowStock((java.lang.Long) 10L, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
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
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
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
            boolean boolean21 = productService1.deleteProduct((java.lang.Long) (-1L));
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
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        java.lang.Class<?> wildcardClass17 = productService1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
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
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
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
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.example.Product> productList18 = productService1.getProductsByKeyword("hi!");
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
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
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
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert10 = productService1.checkLowStock((java.lang.Long) 1L, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
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
            org.example.InventoryAlert inventoryAlert22 = productService1.checkLowStock((java.lang.Long) 10L, (int) (byte) -1);
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
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean19 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
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
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
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
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (-1));
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
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
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
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
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
            boolean boolean22 = productService1.restockProduct((java.lang.Long) (-1L), 10);
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
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
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
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (-1));
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
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (-1));
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
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert16 = productService1.checkLowStock((java.lang.Long) 0L, 10);
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
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
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
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
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
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert13 = productService1.checkLowStock((java.lang.Long) 1L, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
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
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = productService1.decrementStock((java.lang.Long) (-1L), (int) (short) 100);
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
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) (-1L), (int) (short) -1);
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
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
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
            java.util.List<org.example.Product> productList20 = productService1.getProductsSortedByName();
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
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
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
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = productService1.decrementStock((java.lang.Long) 0L, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 100L, (-1));
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
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        java.lang.Class<?> wildcardClass17 = productService1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = productService1.decrementStock((java.lang.Long) (-1L), (int) (short) -1);
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
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert13 = productService1.checkLowStock((java.lang.Long) 0L, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
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
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
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
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
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
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.example.Product> productList17 = productService1.getProductsSortedByName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findSortedByName()\" because \"this.productRepository\" is null");
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
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert19 = productService1.checkLowStock((java.lang.Long) 100L, (int) (short) 10);
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
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert10 = productService1.checkLowStock((java.lang.Long) 1L, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = productService1.restockProduct((java.lang.Long) 100L, 10);
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
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
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
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 100L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = productService1.decrementStock((java.lang.Long) 100L, 100);
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
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = productService1.decrementStock((java.lang.Long) 100L, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert16 = productService1.checkLowStock((java.lang.Long) (-1L), 10);
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
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
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
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
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
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
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
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
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
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
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
            boolean boolean22 = productService1.decrementStock((java.lang.Long) 0L, 1);
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
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.Product product12 = productService1.getProductById((java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert19 = productService1.checkLowStock((java.lang.Long) 10L, 0);
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
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
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
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.example.Product> productList15 = productService1.getProductsByPriceThreshold((java.lang.Double) 1.0d);
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
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
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
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) 10);
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
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
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
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = productService1.decrementStock((java.lang.Long) 10L, (int) '4');
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
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        java.lang.Class<?> wildcardClass14 = productService1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
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
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (-1));
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
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
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
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
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
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
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
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
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
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
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
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = productService1.restockProduct((java.lang.Long) (-1L), (int) (byte) 10);
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
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
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
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
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
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
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
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert13 = productService1.checkLowStock((java.lang.Long) 0L, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
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
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
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
            boolean boolean22 = productService1.decrementStock((java.lang.Long) 100L, (int) (byte) 0);
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
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (-1));
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
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
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
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = productService1.decrementStock((java.lang.Long) 1L, (int) (byte) -1);
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
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 1L, (-1));
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
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (-1));
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
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
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
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 100L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.example.Product> productList18 = productService1.getProductsByKeyword("hi!");
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
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
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
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
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
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.example.Product> productList17 = productService1.listAllProducts();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findAll()\" because \"this.productRepository\" is null");
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
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
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
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
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
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) (-1L), (int) (short) -1);
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
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
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
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
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
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
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
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
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
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
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
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
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
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
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
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert10 = productService1.checkLowStock((java.lang.Long) 1L, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
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
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) 1);
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
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = productService1.decrementStock((java.lang.Long) 0L, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
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
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        java.lang.Class<?> wildcardClass14 = productService1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
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
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = productService1.decrementStock((java.lang.Long) (-1L), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert16 = productService1.checkLowStock((java.lang.Long) 1L, (int) (byte) -1);
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
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert10 = productService1.checkLowStock((java.lang.Long) 1L, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
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
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
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
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
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
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
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
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert7 = productService1.checkLowStock((java.lang.Long) (-1L), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
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
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
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
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert10 = productService1.checkLowStock((java.lang.Long) 0L, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
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
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
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
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
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
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) (-1L), (int) (short) -1);
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
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (-1));
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
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert13 = productService1.checkLowStock((java.lang.Long) 100L, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
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
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
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
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
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
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
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
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
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
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = productService1.decrementStock((java.lang.Long) (-1L), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.Order order9 = productService1.getOrderById((java.lang.Long) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findOrderById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
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
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.example.Product> productList17 = productService1.listAllProducts();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findAll()\" because \"this.productRepository\" is null");
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
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
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
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
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
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
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
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
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
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
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
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (-1));
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
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 100L, (-1));
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
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
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
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = productService1.decrementStock((java.lang.Long) (-1L), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert16 = productService1.checkLowStock((java.lang.Long) 10L, 0);
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
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
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
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
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
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (-1));
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
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
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
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
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert13 = productService1.checkLowStock((java.lang.Long) 1L, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) (-1L), (int) (short) -1);
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
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert13 = productService1.checkLowStock((java.lang.Long) 100L, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, 1);
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
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
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
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = productService1.decrementStock((java.lang.Long) 10L, 100);
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
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
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
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
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
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
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
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
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
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
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
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
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
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = productService1.decrementStock((java.lang.Long) 100L, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
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
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert13 = productService1.checkLowStock((java.lang.Long) 0L, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
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
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
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
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.example.Product> productList9 = productService1.getProductsByPriceThreshold((java.lang.Double) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findByPriceBelow(java.lang.Double)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
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
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
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
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        java.lang.Class<?> wildcardClass14 = productService1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = productService1.restockProduct((java.lang.Long) (-1L), 100);
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
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
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
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (-1));
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
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
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
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
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
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
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
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (-1));
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
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
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
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert13 = productService1.checkLowStock((java.lang.Long) 10L, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = productService1.restockProduct((java.lang.Long) (-1L), 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
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
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
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
            boolean boolean22 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) 0);
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
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert13 = productService1.checkLowStock((java.lang.Long) (-1L), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 1L, (-1));
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
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 100L, (-1));
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (-1));
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
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert13 = productService1.checkLowStock((java.lang.Long) 1L, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
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
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = productService1.decrementStock((java.lang.Long) (-1L), (int) (byte) 0);
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
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (-1));
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
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
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
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
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
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
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
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = productService1.decrementStock((java.lang.Long) 10L, (int) 'a');
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
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
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
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
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
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
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
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert13 = productService1.checkLowStock((java.lang.Long) 0L, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
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
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 1L, (-1));
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
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
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
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
            org.example.InventoryAlert inventoryAlert22 = productService1.checkLowStock((java.lang.Long) 1L, 0);
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
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
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
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
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
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
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
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert7 = productService1.checkLowStock((java.lang.Long) 1L, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.Product product12 = productService1.getProductById((java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
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
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
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
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
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
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
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
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = productService1.decrementStock((java.lang.Long) 100L, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
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
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 100L, (-1));
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
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
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
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
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
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
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
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
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
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = productService1.decrementStock((java.lang.Long) 100L, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = productService1.decrementStock((java.lang.Long) 100L, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
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
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
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
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 1L, (-1));
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
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
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
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
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
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
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
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (-1));
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
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
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
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = productService1.decrementStock((java.lang.Long) (-1L), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert10 = productService1.checkLowStock((java.lang.Long) 1L, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
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
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 100L, (-1));
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
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert16 = productService1.checkLowStock((java.lang.Long) 1L, (int) (byte) 10);
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
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            productService1.addPriceHistory((java.lang.Long) 100L, (java.lang.Double) 0.0d);
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
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
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
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
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
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert16 = productService1.checkLowStock((java.lang.Long) 0L, 100);
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
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (-1));
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
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (-1));
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
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert10 = productService1.checkLowStock((java.lang.Long) 1L, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert13 = productService1.checkLowStock((java.lang.Long) 1L, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert4 = productService1.checkLowStock((java.lang.Long) 100L, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert16 = productService1.checkLowStock((java.lang.Long) (-1L), 10);
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
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 100L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) 10);
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
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, 0);
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
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
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
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
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
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
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
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = productService1.decrementStock((java.lang.Long) 10L, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
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
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
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
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
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
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
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
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
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
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert19 = productService1.checkLowStock((java.lang.Long) 10L, (int) (short) 100);
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
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
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
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
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
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
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
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
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
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
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
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (-1));
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.Product product12 = productService1.getProductById((java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
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
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
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
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
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
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
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
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = productService1.decrementStock((java.lang.Long) 10L, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) 0);
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
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (-1));
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
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert16 = productService1.checkLowStock((java.lang.Long) 100L, (int) (short) 10);
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
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) (-1L), (int) (short) -1);
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
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = productService1.decrementStock((java.lang.Long) (-1L), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert19 = productService1.checkLowStock((java.lang.Long) (-1L), (int) (short) 0);
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
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert13 = productService1.checkLowStock((java.lang.Long) 1L, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = productService1.decrementStock((java.lang.Long) 0L, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
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
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (-1));
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
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
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
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
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
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
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = productService1.decrementStock((java.lang.Long) 1L, 1);
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
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
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
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean19 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        org.example.Order order20 = null;
        // The following exception was thrown during execution in test generation
        try {
            productService1.createOrder(order20);
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
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            productService1.addPriceHistory((java.lang.Long) 1L, (java.lang.Double) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
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
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (-1));
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
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean16 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Double> doubleList18 = productService1.getPriceHistory((java.lang.Long) 100L);
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
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert16 = productService1.checkLowStock((java.lang.Long) 10L, 0);
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
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            productService1.addPriceHistory((java.lang.Long) 1L, (java.lang.Double) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) -1);
        java.lang.Class<?> wildcardClass11 = productService1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
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
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            productService1.addPriceHistory((java.lang.Long) (-1L), (java.lang.Double) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = productService1.decrementStock((java.lang.Long) 0L, 1);
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
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
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
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert16 = productService1.checkLowStock((java.lang.Long) 10L, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }
}

