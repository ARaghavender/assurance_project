package tests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

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
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.example.Product> productList12 = productService1.getProductsByPriceThreshold((java.lang.Double) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findByPriceBelow(java.lang.Double)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert7 = productService1.checkLowStock((java.lang.Long) (-1L), 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert10 = productService1.checkLowStock((java.lang.Long) 100L, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
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
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            productService1.addPriceHistory((java.lang.Long) (-1L), (java.lang.Double) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            productService1.addPriceHistory((java.lang.Long) 0L, (java.lang.Double) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.example.Product> productList12 = productService1.getProductsByPriceThreshold((java.lang.Double) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findByPriceBelow(java.lang.Double)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (-1));
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
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert10 = productService1.checkLowStock((java.lang.Long) (-1L), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = productService1.decrementStock((java.lang.Long) 1L, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            productService1.addPriceHistory((java.lang.Long) 0L, (java.lang.Double) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
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
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert10 = productService1.checkLowStock((java.lang.Long) 10L, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
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
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = productService1.decrementStock((java.lang.Long) 0L, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = productService1.decrementStock((java.lang.Long) 1L, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = productService1.decrementStock((java.lang.Long) 1L, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = productService1.decrementStock((java.lang.Long) 1L, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = productService1.decrementStock((java.lang.Long) 100L, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = productService1.decrementStock((java.lang.Long) 100L, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.example.Product> productList6 = productService1.getProductsByPriceThreshold((java.lang.Double) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findByPriceBelow(java.lang.Double)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = productService1.decrementStock((java.lang.Long) 0L, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = productService1.decrementStock((java.lang.Long) 1L, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = productService1.decrementStock((java.lang.Long) 10L, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            productService1.addPriceHistory((java.lang.Long) 10L, (java.lang.Double) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
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
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert13 = productService1.checkLowStock((java.lang.Long) 100L, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = productService1.decrementStock((java.lang.Long) 0L, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = productService1.restockProduct((java.lang.Long) 1L, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.Product product6 = productService1.getProductById((java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
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
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
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
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = productService1.decrementStock((java.lang.Long) 0L, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = productService1.decrementStock((java.lang.Long) 1L, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = productService1.decrementStock((java.lang.Long) 0L, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert7 = productService1.checkLowStock((java.lang.Long) 0L, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = productService1.decrementStock((java.lang.Long) (-1L), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        org.example.OrderStatus orderStatus9 = null;
        // The following exception was thrown during execution in test generation
        try {
            productService1.updateOrderStatus((java.lang.Long) 100L, orderStatus9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findOrderById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            productService1.addPriceHistory((java.lang.Long) 100L, (java.lang.Double) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert7 = productService1.checkLowStock((java.lang.Long) 10L, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert7 = productService1.checkLowStock((java.lang.Long) 10L, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
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
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = productService1.decrementStock((java.lang.Long) 1L, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.Product product9 = productService1.getProductById((java.lang.Long) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = productService1.restockProduct((java.lang.Long) 0L, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = productService1.restockProduct((java.lang.Long) 1L, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
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
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        // The following exception was thrown during execution in test generation
        try {
            productService1.addPriceHistory((java.lang.Long) (-1L), (java.lang.Double) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        org.example.Product product8 = null;
        // The following exception was thrown during execution in test generation
        try {
            productService1.updateProduct(product8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.update(org.example.Product)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = productService1.decrementStock((java.lang.Long) 10L, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = productService1.decrementStock((java.lang.Long) 100L, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = productService1.decrementStock((java.lang.Long) 0L, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
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
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.example.Product> productList8 = productService1.listAllProducts();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findAll()\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.Product product9 = productService1.getProductById((java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert10 = productService1.checkLowStock((java.lang.Long) 1L, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        org.example.OrderStatus orderStatus9 = null;
        // The following exception was thrown during execution in test generation
        try {
            productService1.updateOrderStatus((java.lang.Long) 100L, orderStatus9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findOrderById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        // The following exception was thrown during execution in test generation
        try {
            productService1.addPriceHistory((java.lang.Long) 10L, (java.lang.Double) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
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
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = productService1.decrementStock((java.lang.Long) 0L, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert13 = productService1.checkLowStock((java.lang.Long) (-1L), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
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
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
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
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
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
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        java.lang.Class<?> wildcardClass8 = productService1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            productService1.addPriceHistory((java.lang.Long) 0L, (java.lang.Double) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert7 = productService1.checkLowStock((java.lang.Long) 0L, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert7 = productService1.checkLowStock((java.lang.Long) 10L, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
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
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert4 = productService1.checkLowStock((java.lang.Long) (-1L), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
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
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            productService1.addPriceHistory((java.lang.Long) 100L, (java.lang.Double) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.example.Product> productList8 = productService1.listAllProducts();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findAll()\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = productService1.decrementStock((java.lang.Long) 1L, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
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
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
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
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        // The following exception was thrown during execution in test generation
        try {
            productService1.addPriceHistory((java.lang.Long) 10L, (java.lang.Double) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            productService1.addPriceHistory((java.lang.Long) 10L, (java.lang.Double) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = productService1.decrementStock((java.lang.Long) 0L, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.Product product9 = productService1.getProductById((java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.Product product9 = productService1.getProductById((java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = productService1.decrementStock((java.lang.Long) 1L, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = productService1.decrementStock((java.lang.Long) 1L, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            productService1.addPriceHistory((java.lang.Long) 10L, (java.lang.Double) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        // The following exception was thrown during execution in test generation
        try {
            productService1.addPriceHistory((java.lang.Long) 0L, (java.lang.Double) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert7 = productService1.checkLowStock((java.lang.Long) 100L, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert7 = productService1.checkLowStock((java.lang.Long) 0L, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = productService1.decrementStock((java.lang.Long) (-1L), 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = productService1.decrementStock((java.lang.Long) 1L, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
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
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert10 = productService1.checkLowStock((java.lang.Long) (-1L), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
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
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
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
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert13 = productService1.checkLowStock((java.lang.Long) 1L, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Double> doubleList6 = productService1.getPriceHistory((java.lang.Long) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert7 = productService1.checkLowStock((java.lang.Long) 100L, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.example.Product> productList12 = productService1.getProductsByPriceThreshold((java.lang.Double) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findByPriceBelow(java.lang.Double)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
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
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = productService1.decrementStock((java.lang.Long) 0L, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
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
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
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
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Double> doubleList9 = productService1.getPriceHistory((java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.Product product9 = productService1.getProductById((java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
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
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
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
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
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
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
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
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        org.example.Product product8 = null;
        // The following exception was thrown during execution in test generation
        try {
            productService1.updateProduct(product8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.update(org.example.Product)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
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
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert7 = productService1.checkLowStock((java.lang.Long) (-1L), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = productService1.decrementStock((java.lang.Long) (-1L), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
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
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        org.example.Product product8 = null;
        // The following exception was thrown during execution in test generation
        try {
            productService1.updateProduct(product8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.update(org.example.Product)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert10 = productService1.checkLowStock((java.lang.Long) 1L, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            productService1.addPriceHistory((java.lang.Long) (-1L), (java.lang.Double) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        java.lang.Class<?> wildcardClass8 = productService1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.example.Product> productList8 = productService1.listAllProducts();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findAll()\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        org.example.OrderStatus orderStatus9 = null;
        // The following exception was thrown during execution in test generation
        try {
            productService1.updateOrderStatus((java.lang.Long) 1L, orderStatus9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findOrderById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = productService1.decrementStock((java.lang.Long) 0L, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
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
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
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
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert7 = productService1.checkLowStock((java.lang.Long) 10L, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
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
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
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
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
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
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
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
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            productService1.addPriceHistory((java.lang.Long) 10L, (java.lang.Double) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (-1));
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
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        // The following exception was thrown during execution in test generation
        try {
            productService1.addPriceHistory((java.lang.Long) 1L, (java.lang.Double) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
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
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            productService1.addPriceHistory((java.lang.Long) (-1L), (java.lang.Double) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert4 = productService1.checkLowStock((java.lang.Long) (-1L), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = productService1.decrementStock((java.lang.Long) (-1L), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert10 = productService1.checkLowStock((java.lang.Long) 0L, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
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
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (-1));
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
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
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
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
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
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = productService1.decrementStock((java.lang.Long) 100L, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            productService1.addPriceHistory((java.lang.Long) 0L, (java.lang.Double) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (-1));
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
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
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
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
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
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
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
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
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
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = productService1.decrementStock((java.lang.Long) 1L, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (-1));
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
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
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
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert7 = productService1.checkLowStock((java.lang.Long) 0L, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert10 = productService1.checkLowStock((java.lang.Long) 100L, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (-1));
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
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        org.example.OrderStatus orderStatus9 = null;
        // The following exception was thrown during execution in test generation
        try {
            productService1.updateOrderStatus((java.lang.Long) 0L, orderStatus9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findOrderById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
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
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
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
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        java.lang.Class<?> wildcardClass14 = productService1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Double> doubleList9 = productService1.getPriceHistory((java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
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
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
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
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            productService1.addPriceHistory((java.lang.Long) (-1L), (java.lang.Double) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
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
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (-1));
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
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
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
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert10 = productService1.checkLowStock((java.lang.Long) (-1L), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
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
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.Product product9 = productService1.getProductById((java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.Product product12 = productService1.getProductById((java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert10 = productService1.checkLowStock((java.lang.Long) (-1L), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
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
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (-1));
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
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        // The following exception was thrown during execution in test generation
        try {
            productService1.addPriceHistory((java.lang.Long) (-1L), (java.lang.Double) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
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
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert10 = productService1.checkLowStock((java.lang.Long) 0L, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.Product product9 = productService1.getProductById((java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.Product product12 = productService1.getProductById((java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert16 = productService1.checkLowStock((java.lang.Long) 0L, 0);
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
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (-1));
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
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
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
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = productService1.decrementStock((java.lang.Long) 0L, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        java.lang.Class<?> wildcardClass8 = productService1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (-1));
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
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert4 = productService1.checkLowStock((java.lang.Long) (-1L), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert10 = productService1.checkLowStock((java.lang.Long) (-1L), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
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
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.Product product9 = productService1.getProductById((java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (-1));
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
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            productService1.addPriceHistory((java.lang.Long) (-1L), (java.lang.Double) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
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
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = productService1.decrementStock((java.lang.Long) 1L, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = productService1.decrementStock((java.lang.Long) 10L, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert4 = productService1.checkLowStock((java.lang.Long) 10L, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
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
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (-1));
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
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
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
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
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
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (-1));
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
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = productService1.decrementStock((java.lang.Long) 100L, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert13 = productService1.checkLowStock((java.lang.Long) 100L, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
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
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = productService1.deleteProduct((java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.delete(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (-1));
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
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.example.Product> productList6 = productService1.getProductsByPriceThreshold((java.lang.Double) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findByPriceBelow(java.lang.Double)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = productService1.deleteProduct((java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.delete(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (-1));
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
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert7 = productService1.checkLowStock((java.lang.Long) 0L, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = productService1.decrementStock((java.lang.Long) 100L, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = productService1.decrementStock((java.lang.Long) 100L, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = productService1.decrementStock((java.lang.Long) 10L, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = productService1.decrementStock((java.lang.Long) (-1L), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
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
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = productService1.decrementStock((java.lang.Long) 100L, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (-1));
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
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = productService1.restockProduct((java.lang.Long) (-1L), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert13 = productService1.checkLowStock((java.lang.Long) 10L, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
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
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            productService1.addPriceHistory((java.lang.Long) 100L, (java.lang.Double) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert10 = productService1.checkLowStock((java.lang.Long) 10L, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert7 = productService1.checkLowStock((java.lang.Long) 1L, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        java.lang.Class<?> wildcardClass11 = productService1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (-1));
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
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (-1));
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
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = productService1.decrementStock((java.lang.Long) 10L, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (-1));
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
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
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
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
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
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.Product product9 = productService1.getProductById((java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
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
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) (-1L), (int) (short) -1);
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
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            productService1.addPriceHistory((java.lang.Long) 1L, (java.lang.Double) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
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
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        java.lang.Class<?> wildcardClass14 = productService1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) (-1L), (int) (short) -1);
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
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        org.example.OrderStatus orderStatus9 = null;
        // The following exception was thrown during execution in test generation
        try {
            productService1.updateOrderStatus((java.lang.Long) 100L, orderStatus9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findOrderById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert4 = productService1.checkLowStock((java.lang.Long) 10L, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (-1));
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
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = productService1.restockProduct((java.lang.Long) 0L, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) (-1L), (int) (short) -1);
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
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = productService1.restockProduct((java.lang.Long) (-1L), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) (-1L), (int) (short) -1);
        java.lang.Class<?> wildcardClass14 = productService1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) (-1L), (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = productService1.decrementStock((java.lang.Long) 100L, 0);
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
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert7 = productService1.checkLowStock((java.lang.Long) 1L, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        org.example.OrderStatus orderStatus9 = null;
        // The following exception was thrown during execution in test generation
        try {
            productService1.updateOrderStatus((java.lang.Long) 1L, orderStatus9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findOrderById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
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
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
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
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = productService1.decrementStock((java.lang.Long) (-1L), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
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
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = productService1.decrementStock((java.lang.Long) (-1L), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) (-1L), (int) (short) -1);
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
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) (-1L), (int) (short) -1);
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
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
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
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.Order order9 = productService1.getOrderById((java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findOrderById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = productService1.deleteProduct((java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.delete(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            productService1.addPriceHistory((java.lang.Long) 100L, (java.lang.Double) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
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
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
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
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert4 = productService1.checkLowStock((java.lang.Long) 0L, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
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
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) (-1L), (int) (short) -1);
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
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
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
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = productService1.restockProduct((java.lang.Long) 1L, (int) '#');
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
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert16 = productService1.checkLowStock((java.lang.Long) 1L, (int) (short) 1);
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
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
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
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = productService1.decrementStock((java.lang.Long) 0L, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
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
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = productService1.decrementStock((java.lang.Long) 100L, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            productService1.addPriceHistory((java.lang.Long) 0L, (java.lang.Double) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
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
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
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
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.Product product9 = productService1.getProductById((java.lang.Long) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
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
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = productService1.decrementStock((java.lang.Long) 0L, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            productService1.addPriceHistory((java.lang.Long) 0L, (java.lang.Double) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
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
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = productService1.decrementStock((java.lang.Long) 100L, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = productService1.decrementStock((java.lang.Long) (-1L), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
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
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (-1));
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
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) (-1L), (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert16 = productService1.checkLowStock((java.lang.Long) (-1L), 0);
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
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = productService1.decrementStock((java.lang.Long) 1L, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.Order order9 = productService1.getOrderById((java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findOrderById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Double> doubleList9 = productService1.getPriceHistory((java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
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
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = productService1.deleteProduct((java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.delete(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (-1));
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
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (-1));
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
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
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
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
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
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
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
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.Product product9 = productService1.getProductById((java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
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
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (-1));
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
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) (-1L), (int) (short) -1);
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
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) (-1L), (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = productService1.decrementStock((java.lang.Long) 10L, (int) ' ');
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
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (-1));
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
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) (-1L), (int) (short) -1);
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
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert4 = productService1.checkLowStock((java.lang.Long) (-1L), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = productService1.decrementStock((java.lang.Long) 0L, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
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
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
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
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
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
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
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
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
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
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (-1));
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
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
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
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
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
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            productService1.addPriceHistory((java.lang.Long) 1L, (java.lang.Double) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = productService1.decrementStock((java.lang.Long) (-1L), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (-1));
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
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = productService1.decrementStock((java.lang.Long) 10L, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (-1));
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
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert4 = productService1.checkLowStock((java.lang.Long) (-1L), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) (-1L), (int) (short) -1);
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
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = productService1.decrementStock((java.lang.Long) 0L, (int) (short) 0);
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
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
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
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
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
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) (-1L), (int) (short) -1);
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
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Double> doubleList9 = productService1.getPriceHistory((java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = productService1.deleteProduct((java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.delete(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (-1));
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
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
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
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = productService1.decrementStock((java.lang.Long) 100L, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Double> doubleList9 = productService1.getPriceHistory((java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = productService1.decrementStock((java.lang.Long) 1L, (int) (byte) 1);
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
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Double> doubleList6 = productService1.getPriceHistory((java.lang.Long) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert10 = productService1.checkLowStock((java.lang.Long) (-1L), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
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
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert10 = productService1.checkLowStock((java.lang.Long) 10L, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
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
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) (-1L), (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert16 = productService1.checkLowStock((java.lang.Long) 1L, (int) '4');
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
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert13 = productService1.checkLowStock((java.lang.Long) 10L, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert7 = productService1.checkLowStock((java.lang.Long) 10L, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert7 = productService1.checkLowStock((java.lang.Long) 10L, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = productService1.restockProduct((java.lang.Long) (-1L), (int) (byte) 100);
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
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
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
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
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
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = productService1.restockProduct((java.lang.Long) (-1L), 0);
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
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (-1));
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
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert10 = productService1.checkLowStock((java.lang.Long) 10L, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert10 = productService1.checkLowStock((java.lang.Long) 100L, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
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
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
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
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
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
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = productService1.decrementStock((java.lang.Long) 0L, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = productService1.decrementStock((java.lang.Long) 1L, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert13 = productService1.checkLowStock((java.lang.Long) 10L, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = productService1.decrementStock((java.lang.Long) (-1L), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = productService1.decrementStock((java.lang.Long) 1L, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
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
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
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
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert10 = productService1.checkLowStock((java.lang.Long) 1L, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
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
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
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
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert16 = productService1.checkLowStock((java.lang.Long) 1L, (int) (short) 0);
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
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 10L, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert7 = productService1.checkLowStock((java.lang.Long) 1L, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) (-1L), (int) (short) -1);
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
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
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
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 10L, (int) (short) -1);
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
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert4 = productService1.checkLowStock((java.lang.Long) 10L, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) (-1L), (int) (short) -1);
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
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
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
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
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
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
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
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = productService1.decrementStock((java.lang.Long) 0L, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = productService1.decrementStock((java.lang.Long) 1L, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = productService1.decrementStock((java.lang.Long) 10L, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) 1L, (int) (byte) -1);
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 100L, (int) (short) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) 10L, (int) (byte) -1);
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
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        boolean boolean10 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean13 = productService1.restockProduct((java.lang.Long) 1L, (-1));
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
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        org.example.ProductRepository productRepository0 = null;
        org.example.ProductService productService1 = new org.example.ProductService(productRepository0);
        boolean boolean4 = productService1.restockProduct((java.lang.Long) (-1L), (-1));
        boolean boolean7 = productService1.restockProduct((java.lang.Long) 0L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.example.InventoryAlert inventoryAlert10 = productService1.checkLowStock((java.lang.Long) 0L, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.ProductRepository.findById(java.lang.Long)\" because \"this.productRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }
}

