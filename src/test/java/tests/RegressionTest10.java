package tests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest10 {

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
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        org.example.Product product2 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        org.example.Order order7 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Order order3 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList1 = productRepository0.findSortedByName();
        org.example.Product product2 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.lang.Class<?> wildcardClass7 = productList6.getClass();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        org.example.Order order7 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(order6);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        org.example.Product product7 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        org.example.Order order7 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(order6);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        org.example.Product product4 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        org.example.Order order7 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        org.example.Order order6 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order3 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        org.example.Order order1 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        org.example.Order order7 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList1 = productRepository0.findSortedByName();
        org.example.Product product2 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.lang.Class<?> wildcardClass6 = productRepository0.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList1 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList3 = productRepository0.findByKeyword("");
        java.lang.Class<?> wildcardClass4 = productRepository0.getClass();
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList5 = productRepository0.findByKeyword("");
        org.example.Order order6 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(productList5);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        org.example.Product product7 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(order6);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList1 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList3 = productRepository0.findByKeyword("");
        org.example.Product product4 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList3);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Product product5 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product3 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.lang.Class<?> wildcardClass3 = productRepository0.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        org.example.Order order7 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Order order3 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        org.example.Order order2 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        org.example.Order order6 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(orderList5);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Product product6 = productRepository0.findById((java.lang.Long) 1L);
        boolean boolean8 = productRepository0.delete((java.lang.Long) 0L);
        org.example.Order order9 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(product6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        org.example.Order order8 = productRepository0.findOrderById((java.lang.Long) 100L);
        org.example.Product product9 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(order8);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 1L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = order4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        org.example.Product product8 = productRepository0.findById((java.lang.Long) (-1L));
        org.example.Order order9 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(product8);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("hi!");
        org.example.Product product7 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(productList6);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order3 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        org.example.Product product6 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Product product3 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        org.example.Product product6 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList5);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Order order9 = productRepository0.findOrderById((java.lang.Long) 1L);
        org.example.Order order10 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(order9);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        org.example.Order order6 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList5);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("hi!");
        org.example.Product product7 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(productList6);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        org.example.Product product6 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(orderList5);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
        org.example.Order order9 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList8);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        boolean boolean4 = productRepository0.delete((java.lang.Long) 1L);
        org.example.Product product5 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList4 = productRepository0.findAll();
        org.example.Product product5 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(productList4);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        org.example.Product product6 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(orderList5);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        org.example.Product product8 = productRepository0.findById((java.lang.Long) (-1L));
        org.example.Product product10 = productRepository0.findById((java.lang.Long) 1L);
        org.example.Order order11 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(product8);
        org.junit.Assert.assertNull(product10);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList1 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList3 = productRepository0.findByKeyword("");
        boolean boolean5 = productRepository0.delete((java.lang.Long) 100L);
        org.example.Order order6 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        org.example.Order order8 = productRepository0.findOrderById((java.lang.Long) 100L);
        boolean boolean10 = productRepository0.delete((java.lang.Long) 0L);
        org.example.Order order12 = productRepository0.findOrderById((java.lang.Long) 1L);
        org.example.Product product13 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(order8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(order12);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        org.example.Order order8 = productRepository0.findOrderById((java.lang.Long) 100L);
        boolean boolean10 = productRepository0.delete((java.lang.Long) 0L);
        org.example.Order order12 = productRepository0.findOrderById((java.lang.Long) 1L);
        org.example.Order order13 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(order8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(order12);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        java.lang.Class<?> wildcardClass8 = productList7.getClass();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = product4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order5 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        boolean boolean2 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        org.example.Product product4 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(orderList3);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Product product6 = productRepository0.findById((java.lang.Long) 1L);
        boolean boolean8 = productRepository0.delete((java.lang.Long) 0L);
        org.example.Order order9 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(product6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList1 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList3 = productRepository0.findByKeyword("");
        boolean boolean5 = productRepository0.delete((java.lang.Long) 100L);
        org.example.Order order6 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        org.example.Product product6 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(orderList5);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        org.example.Product product7 = productRepository0.findById((java.lang.Long) 100L);
        org.example.Product product8 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNull(product7);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList10 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList12 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList14 = productRepository0.findByKeyword("hi!");
        org.example.Order order15 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList1 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList3 = productRepository0.findByKeyword("");
        boolean boolean5 = productRepository0.delete((java.lang.Long) 100L);
        java.lang.Class<?> wildcardClass6 = productRepository0.getClass();
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList10 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList12 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList14 = productRepository0.findByKeyword("hi!");
        org.example.Order order16 = productRepository0.findOrderById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList17 = productRepository0.findSortedByName();
        org.example.Product product18 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNull(order16);
        org.junit.Assert.assertNotNull(productList17);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Product product5 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        org.example.Product product7 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(order6);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("hi!");
        org.example.Product product8 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList9 = productRepository0.findAll();
        org.example.Order order10 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(product8);
        org.junit.Assert.assertNotNull(productList9);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Order order9 = productRepository0.findOrderById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList10 = productRepository0.findAll();
        org.example.Order order11 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(order9);
        org.junit.Assert.assertNotNull(productList10);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList2 = productRepository0.findAllOrders();
        org.example.Product product3 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(orderList2);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        boolean boolean2 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        org.example.Order order4 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(orderList3);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList8 = productRepository0.findAll();
        org.example.Product product9 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList8);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList2 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList3 = productRepository0.findAll();
        org.example.Order order4 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(orderList2);
        org.junit.Assert.assertNotNull(productList3);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Order order9 = productRepository0.findOrderById((java.lang.Long) 1L);
        org.example.Product product10 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(order9);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        boolean boolean2 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList3 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList4 = productRepository0.findSortedByName();
        java.lang.Class<?> wildcardClass5 = productRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList4 = productRepository0.findAllOrders();
        java.lang.Class<?> wildcardClass5 = orderList4.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(orderList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        org.example.Order order8 = productRepository0.findOrderById((java.lang.Long) 100L);
        boolean boolean10 = productRepository0.delete((java.lang.Long) 0L);
        org.example.Order order12 = productRepository0.findOrderById((java.lang.Long) 1L);
        boolean boolean14 = productRepository0.delete((java.lang.Long) 10L);
        boolean boolean16 = productRepository0.delete((java.lang.Long) 100L);
        org.example.Order order17 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(order8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(order12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
        org.example.Product product9 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        org.example.Product product8 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(orderList7);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        boolean boolean8 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList9 = productRepository0.findAll();
        boolean boolean11 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList13 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        org.example.Order order14 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(productList13);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList2 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList3 = productRepository0.findAll();
        java.lang.Class<?> wildcardClass4 = productList3.getClass();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(orderList2);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        org.example.Product product7 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(order6);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        org.example.Product product8 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order9 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(product8);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList5 = productRepository0.findByKeyword("");
        org.example.Product product6 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(productList5);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Product product6 = productRepository0.findById((java.lang.Long) 1L);
        org.example.Product product7 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(product6);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Product product6 = productRepository0.findById((java.lang.Long) 1L);
        boolean boolean8 = productRepository0.delete((java.lang.Long) 0L);
        org.example.Product product9 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(product6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList6 = productRepository0.findSortedByName();
        org.example.Product product7 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList6);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        org.example.Product product7 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList8 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList9 = productRepository0.findAllOrders();
        org.example.Order order10 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNull(product7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(orderList9);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        boolean boolean4 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        org.example.Product product7 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(orderList6);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        org.example.Product product7 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(orderList6);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        boolean boolean8 = productRepository0.delete((java.lang.Long) (-1L));
        org.example.Order order9 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        java.util.List<org.example.Product> productList9 = productRepository0.findByKeyword("hi!");
        org.example.Product product10 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList9);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        org.example.Order order6 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(productList5);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        org.example.Order order8 = productRepository0.findOrderById((java.lang.Long) 100L);
        boolean boolean10 = productRepository0.delete((java.lang.Long) 0L);
        org.example.Order order12 = productRepository0.findOrderById((java.lang.Long) 1L);
        boolean boolean14 = productRepository0.delete((java.lang.Long) 10L);
        boolean boolean16 = productRepository0.delete((java.lang.Long) 100L);
        org.example.Product product18 = productRepository0.findById((java.lang.Long) 1L);
        org.example.Product product19 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(order8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(order12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(product18);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        org.example.Order order8 = productRepository0.findOrderById((java.lang.Long) 100L);
        boolean boolean10 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList12 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Product product13 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(order8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(productList12);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 1L);
        org.example.Order order5 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList4 = productRepository0.findAll();
        java.util.List<org.example.Product> productList5 = productRepository0.findAll();
        org.example.Order order6 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList5);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList5 = productRepository0.findByKeyword("");
        boolean boolean7 = productRepository0.delete((java.lang.Long) 10L);
        org.example.Product product8 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList8 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.lang.Class<?> wildcardClass9 = productList8.getClass();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.lang.Class<?> wildcardClass6 = productRepository0.getClass();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Product product8 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList7);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        boolean boolean2 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList3 = productRepository0.findSortedByName();
        java.lang.Class<?> wildcardClass4 = productList3.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        boolean boolean2 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList4 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        org.example.Order order5 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(productList4);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        org.example.Product product7 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList8 = productRepository0.findSortedByName();
        org.example.Product product9 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNull(product7);
        org.junit.Assert.assertNotNull(productList8);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Order order3 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        java.lang.Class<?> wildcardClass3 = productList2.getClass();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        org.example.Product product7 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList8 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList9 = productRepository0.findAllOrders();
        org.example.Product product10 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNull(product7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(orderList9);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Order order9 = productRepository0.findOrderById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList10 = productRepository0.findAll();
        org.example.Product product11 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(order9);
        org.junit.Assert.assertNotNull(productList10);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Product product8 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findAll();
        org.example.Product product7 = productRepository0.findById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList9 = productRepository0.findByKeyword("hi!");
        org.example.Product product10 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNull(product7);
        org.junit.Assert.assertNotNull(productList9);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList4 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList7 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        boolean boolean9 = productRepository0.delete((java.lang.Long) (-1L));
        org.example.Order order10 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(orderList4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.lang.Class<?> wildcardClass7 = productRepository0.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        boolean boolean6 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Product> productList9 = productRepository0.findSortedByName();
        java.lang.Class<?> wildcardClass10 = productList9.getClass();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        org.example.Product product4 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        org.example.Order order8 = productRepository0.findOrderById((java.lang.Long) 100L);
        boolean boolean10 = productRepository0.delete((java.lang.Long) 0L);
        org.example.Order order12 = productRepository0.findOrderById((java.lang.Long) 1L);
        org.example.Order order13 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(order8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(order12);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Order order9 = productRepository0.findOrderById((java.lang.Long) 1L);
        org.example.Order order11 = productRepository0.findOrderById((java.lang.Long) (-1L));
        org.example.Order order12 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(order9);
        org.junit.Assert.assertNull(order11);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        org.example.Order order8 = productRepository0.findOrderById((java.lang.Long) 100L);
        boolean boolean10 = productRepository0.delete((java.lang.Long) 0L);
        org.example.Product product11 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(order8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Order order9 = productRepository0.findOrderById((java.lang.Long) 1L);
        org.example.Product product11 = productRepository0.findById((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList13 = productRepository0.findByKeyword("");
        org.example.Order order14 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(order9);
        org.junit.Assert.assertNull(product11);
        org.junit.Assert.assertNotNull(productList13);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList4 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList7 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        boolean boolean9 = productRepository0.delete((java.lang.Long) (-1L));
        org.example.Product product10 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(orderList4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findAll();
        java.lang.Class<?> wildcardClass6 = productList5.getClass();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Order order9 = productRepository0.findOrderById((java.lang.Long) 1L);
        org.example.Product product11 = productRepository0.findById((java.lang.Long) (-1L));
        org.example.Product product12 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(order9);
        org.junit.Assert.assertNull(product11);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        org.example.Order order8 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList7);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        org.example.Order order4 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList9 = productRepository0.findAll();
        org.example.Order order10 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList9);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("hi!");
        org.example.Order order7 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(productList6);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList8 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        org.example.Product product9 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        boolean boolean8 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList10 = productRepository0.findByKeyword("");
        java.lang.Class<?> wildcardClass11 = productRepository0.getClass();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        org.example.Product product7 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList8 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList9 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList10 = productRepository0.findSortedByName();
        org.example.Product product11 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNull(product7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(orderList9);
        org.junit.Assert.assertNotNull(productList10);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList8 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList10 = productRepository0.findByKeyword("");
        org.example.Order order11 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(orderList7);
        org.junit.Assert.assertNotNull(orderList8);
        org.junit.Assert.assertNotNull(productList10);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        org.example.Order order7 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(order6);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        org.example.Order order8 = productRepository0.findOrderById((java.lang.Long) 100L);
        boolean boolean10 = productRepository0.delete((java.lang.Long) 0L);
        org.example.Order order12 = productRepository0.findOrderById((java.lang.Long) 1L);
        boolean boolean14 = productRepository0.delete((java.lang.Long) 10L);
        org.example.Order order15 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(order8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(order12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList1 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList3 = productRepository0.findByKeyword("");
        boolean boolean5 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.util.List<org.example.Product> productList9 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList11 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        java.util.List<org.example.Order> orderList12 = productRepository0.findAllOrders();
        org.example.Order order13 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(orderList12);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.lang.Class<?> wildcardClass7 = orderList6.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        boolean boolean4 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList6 = productRepository0.findAll();
        java.lang.Class<?> wildcardClass7 = productRepository0.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
        org.example.Product product9 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList8);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        org.example.Order order8 = productRepository0.findOrderById((java.lang.Long) 100L);
        boolean boolean10 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList12 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        org.example.Product product13 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(order8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(productList12);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        org.example.Product product7 = productRepository0.findById((java.lang.Long) 100L);
        org.example.Order order8 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNull(product7);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        boolean boolean9 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList10 = productRepository0.findAll();
        java.util.List<org.example.Product> productList11 = productRepository0.findAll();
        org.example.Product product12 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList11);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        boolean boolean9 = productRepository0.delete((java.lang.Long) 0L);
        java.lang.Class<?> wildcardClass10 = productRepository0.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(orderList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        org.example.Product product8 = productRepository0.findById((java.lang.Long) (-1L));
        org.example.Product product9 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(product8);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        boolean boolean2 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList3 = productRepository0.findSortedByName();
        org.example.Product product5 = productRepository0.findById((java.lang.Long) 1L);
        org.example.Product product6 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNull(product5);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        boolean boolean8 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList10 = productRepository0.findByKeyword("");
        org.example.Order order11 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(productList10);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList4 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        org.example.Product product6 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(orderList4);
        org.junit.Assert.assertNotNull(productList5);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList10 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList12 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList14 = productRepository0.findByKeyword("hi!");
        boolean boolean16 = productRepository0.delete((java.lang.Long) 100L);
        org.example.Order order17 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        org.example.Order order8 = productRepository0.findOrderById((java.lang.Long) 100L);
        boolean boolean10 = productRepository0.delete((java.lang.Long) 0L);
        org.example.Order order12 = productRepository0.findOrderById((java.lang.Long) 1L);
        boolean boolean14 = productRepository0.delete((java.lang.Long) 10L);
        boolean boolean16 = productRepository0.delete((java.lang.Long) 100L);
        org.example.Product product18 = productRepository0.findById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList20 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        org.example.Product product21 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(order8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(order12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(product18);
        org.junit.Assert.assertNotNull(productList20);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList8 = productRepository0.findAllOrders();
        org.example.Product product10 = productRepository0.findById((java.lang.Long) 10L);
        org.example.Order order11 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(orderList7);
        org.junit.Assert.assertNotNull(orderList8);
        org.junit.Assert.assertNull(product10);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Order order9 = productRepository0.findOrderById((java.lang.Long) 1L);
        org.example.Order order11 = productRepository0.findOrderById((java.lang.Long) (-1L));
        org.example.Order order13 = productRepository0.findOrderById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList14 = productRepository0.findAll();
        java.lang.Class<?> wildcardClass15 = productList14.getClass();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(order9);
        org.junit.Assert.assertNull(order11);
        org.junit.Assert.assertNull(order13);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList8 = productRepository0.findSortedByName();
        java.lang.Class<?> wildcardClass9 = productRepository0.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList1 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList3 = productRepository0.findByKeyword("");
        boolean boolean5 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.util.List<org.example.Product> productList9 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList11 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        java.util.List<org.example.Order> orderList12 = productRepository0.findAllOrders();
        org.example.Product product13 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(orderList12);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        boolean boolean4 = productRepository0.delete((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        org.example.Product product7 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(productList6);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList8 = productRepository0.findSortedByName();
        org.example.Order order9 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList8);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList10 = productRepository0.findByKeyword("");
        org.example.Product product12 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Product product13 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNull(product12);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        boolean boolean6 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Product> productList9 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList11 = productRepository0.findByKeyword("");
        org.example.Order order12 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
        boolean boolean10 = productRepository0.delete((java.lang.Long) 10L);
        org.example.Product product11 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        boolean boolean8 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList9 = productRepository0.findAll();
        boolean boolean11 = productRepository0.delete((java.lang.Long) 0L);
        org.example.Order order12 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        org.example.Product product7 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList8 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList9 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList10 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList11 = productRepository0.findAll();
        org.example.Order order12 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNull(product7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(orderList9);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList11);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList2 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        org.example.Product product5 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        org.example.Order order8 = productRepository0.findOrderById((java.lang.Long) (-1L));
        org.example.Product product9 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(orderList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNull(product5);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNull(order8);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findByKeyword("hi!");
        org.example.Product product8 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(productList7);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        org.example.Order order1 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Product product9 = productRepository0.findById((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList11 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Product> productList13 = productRepository0.findByKeyword("");
        org.example.Order order14 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(product9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList13);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList4 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        java.lang.Class<?> wildcardClass6 = productList5.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(orderList4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList8 = productRepository0.findAllOrders();
        org.example.Order order9 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(orderList7);
        org.junit.Assert.assertNotNull(orderList8);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("hi!");
        org.example.Product product8 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        org.example.Order order11 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(product8);
        org.junit.Assert.assertNotNull(productList10);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList8 = productRepository0.findAllOrders();
        org.example.Product product9 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(orderList8);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        org.example.Product product7 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList8 = productRepository0.findAllOrders();
        org.example.Product product10 = productRepository0.findById((java.lang.Long) (-1L));
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNull(product7);
        org.junit.Assert.assertNotNull(orderList8);
        org.junit.Assert.assertNull(product10);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        boolean boolean7 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList9 = productRepository0.findByKeyword("");
        java.lang.Class<?> wildcardClass10 = productList9.getClass();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        boolean boolean2 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList5 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        org.example.Order order6 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(productList5);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        boolean boolean2 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList3 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList4 = productRepository0.findSortedByName();
        org.example.Order order5 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNotNull(productList4);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        boolean boolean4 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        org.example.Order order7 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(orderList6);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        boolean boolean2 = productRepository0.delete((java.lang.Long) (-1L));
        org.example.Order order3 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList8 = productRepository0.findAllOrders();
        org.example.Product product9 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(orderList7);
        org.junit.Assert.assertNotNull(orderList8);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        java.lang.Class<?> wildcardClass8 = productRepository0.getClass();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        org.example.Product product7 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList8 = productRepository0.findAllOrders();
        org.example.Product product9 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNull(product7);
        org.junit.Assert.assertNotNull(orderList8);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        boolean boolean4 = productRepository0.delete((java.lang.Long) 1L);
        org.example.Order order5 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
        java.lang.Class<?> wildcardClass9 = productRepository0.getClass();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList4 = productRepository0.findAll();
        java.util.List<org.example.Product> productList5 = productRepository0.findAll();
        org.example.Product product6 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList5);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList1 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList3 = productRepository0.findByKeyword("");
        boolean boolean5 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.util.List<org.example.Product> productList9 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.lang.Class<?> wildcardClass10 = productList9.getClass();
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Order order9 = productRepository0.findOrderById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList10 = productRepository0.findAll();
        org.example.Order order11 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(order9);
        org.junit.Assert.assertNotNull(productList10);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        org.example.Product product7 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList8 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        org.example.Order order11 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNull(product7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        org.example.Order order8 = productRepository0.findOrderById((java.lang.Long) 100L);
        boolean boolean10 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList12 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        java.lang.Class<?> wildcardClass13 = productRepository0.getClass();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(order8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.lang.Class<?> wildcardClass4 = orderList3.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList8 = productRepository0.findSortedByName();
        java.lang.Class<?> wildcardClass9 = productList8.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList1 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList3 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList5 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.lang.Class<?> wildcardClass6 = productList5.getClass();
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        boolean boolean4 = productRepository0.delete((java.lang.Long) 0L);
        boolean boolean6 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Order order8 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(productList7);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        boolean boolean2 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList3 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList4 = productRepository0.findSortedByName();
        boolean boolean6 = productRepository0.delete((java.lang.Long) (-1L));
        org.example.Product product8 = productRepository0.findById((java.lang.Long) 1L);
        org.example.Order order9 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(product8);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Product product6 = productRepository0.findById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList8 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        org.example.Order order9 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(product6);
        org.junit.Assert.assertNotNull(productList8);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        boolean boolean2 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList4 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.lang.Class<?> wildcardClass6 = productRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        boolean boolean4 = productRepository0.delete((java.lang.Long) (-1L));
        org.example.Order order5 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("hi!");
        org.example.Product product8 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList9 = productRepository0.findAll();
        java.util.List<org.example.Product> productList11 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList13 = productRepository0.findByKeyword("hi!");
        org.example.Order order14 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(product8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList13);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        boolean boolean2 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList3 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList4 = productRepository0.findSortedByName();
        boolean boolean6 = productRepository0.delete((java.lang.Long) (-1L));
        boolean boolean8 = productRepository0.delete((java.lang.Long) (-1L));
        org.example.Order order9 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        boolean boolean4 = productRepository0.delete((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        org.example.Order order8 = productRepository0.findOrderById((java.lang.Long) 1L);
        org.example.Order order9 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(order8);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList10 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList12 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList14 = productRepository0.findByKeyword("hi!");
        org.example.Order order16 = productRepository0.findOrderById((java.lang.Long) 0L);
        org.example.Product product17 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNull(order16);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        boolean boolean4 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList8 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.lang.Class<?> wildcardClass9 = productRepository0.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList10 = productRepository0.findByKeyword("");
        org.example.Product product11 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        boolean boolean4 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        org.example.Order order6 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(productList5);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        boolean boolean8 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList9 = productRepository0.findAll();
        boolean boolean11 = productRepository0.delete((java.lang.Long) 0L);
        org.example.Product product13 = productRepository0.findById((java.lang.Long) 10L);
        org.example.Order order14 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(product13);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList1 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList3 = productRepository0.findByKeyword("");
        org.example.Product product4 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList3);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList10 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList12 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList14 = productRepository0.findByKeyword("hi!");
        org.example.Order order16 = productRepository0.findOrderById((java.lang.Long) 0L);
        org.example.Product product18 = productRepository0.findById((java.lang.Long) 10L);
        org.example.Product product19 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNull(order16);
        org.junit.Assert.assertNull(product18);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList4 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList7 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        org.example.Order order8 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(orderList4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList7);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        boolean boolean4 = productRepository0.delete((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        org.example.Product product7 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(productList6);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList1 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList3 = productRepository0.findByKeyword("");
        org.example.Order order4 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList3);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        boolean boolean8 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        org.example.Order order12 = productRepository0.findOrderById((java.lang.Long) 1L);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNull(order12);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList6 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        org.example.Order order8 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList7);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        org.example.Product product8 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(productList7);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Product product9 = productRepository0.findById((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList11 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.lang.Class<?> wildcardClass12 = productList11.getClass();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(product9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        java.lang.Class<?> wildcardClass7 = productList6.getClass();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList2 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 0L);
        org.example.Product product6 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(orderList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        org.example.Product product7 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList8 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        java.util.List<org.example.Product> productList11 = productRepository0.findSortedByName();
        org.example.Order order12 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNull(product7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList11);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("hi!");
        org.example.Product product8 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        java.util.List<org.example.Product> productList11 = productRepository0.findAll();
        org.example.Order order12 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(product8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList11);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findAll();
        org.example.Product product7 = productRepository0.findById((java.lang.Long) 10L);
        org.example.Product product9 = productRepository0.findById((java.lang.Long) 1L);
        java.util.List<org.example.Order> orderList10 = productRepository0.findAllOrders();
        org.example.Product product11 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNull(product7);
        org.junit.Assert.assertNull(product9);
        org.junit.Assert.assertNotNull(orderList10);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        boolean boolean2 = productRepository0.delete((java.lang.Long) 100L);
        org.example.Product product3 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList1 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList3 = productRepository0.findByKeyword("");
        boolean boolean5 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.util.List<org.example.Product> productList9 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList11 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        org.example.Product product12 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("hi!");
        org.example.Product product8 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList9 = productRepository0.findAll();
        java.util.List<org.example.Product> productList11 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList13 = productRepository0.findByKeyword("hi!");
        java.lang.Class<?> wildcardClass14 = productRepository0.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(product8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList9 = productRepository0.findAll();
        java.util.List<org.example.Order> orderList10 = productRepository0.findAllOrders();
        org.example.Order order11 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(orderList10);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList5 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList6 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        java.util.List<org.example.Order> orderList8 = productRepository0.findAllOrders();
        boolean boolean10 = productRepository0.delete((java.lang.Long) (-1L));
        org.example.Order order11 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(orderList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("hi!");
        org.example.Product product8 = productRepository0.findById((java.lang.Long) 100L);
        org.example.Order order9 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(product8);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList8 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        org.example.Order order10 = productRepository0.findOrderById((java.lang.Long) 100L);
        org.example.Product product11 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNull(order10);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        boolean boolean8 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList10 = productRepository0.findByKeyword("");
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(productList10);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList4 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        org.example.Order order6 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(orderList4);
        org.junit.Assert.assertNotNull(productList5);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        org.example.Order order8 = productRepository0.findOrderById((java.lang.Long) 100L);
        boolean boolean10 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList11 = productRepository0.findAll();
        java.util.List<org.example.Product> productList13 = productRepository0.findByKeyword("");
        org.example.Order order14 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(order8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList13);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList8 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        org.example.Order order10 = productRepository0.findOrderById((java.lang.Long) 100L);
        org.example.Order order11 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNull(order10);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList8 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        boolean boolean12 = productRepository0.delete((java.lang.Long) (-1L));
        org.example.Product product13 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(orderList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        boolean boolean6 = productRepository0.delete((java.lang.Long) (-1L));
        org.example.Product product7 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        boolean boolean8 = productRepository0.delete((java.lang.Long) (-1L));
        org.example.Order order9 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Order order9 = productRepository0.findOrderById((java.lang.Long) 1L);
        org.example.Order order11 = productRepository0.findOrderById((java.lang.Long) (-1L));
        java.lang.Class<?> wildcardClass12 = productRepository0.getClass();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(order9);
        org.junit.Assert.assertNull(order11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
        boolean boolean10 = productRepository0.delete((java.lang.Long) 10L);
        org.example.Product product12 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList14 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        org.example.Product product15 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(product12);
        org.junit.Assert.assertNotNull(productList14);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
        org.example.Product product9 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList8);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList4 = productRepository0.findAllOrders();
        org.example.Product product6 = productRepository0.findById((java.lang.Long) 1L);
        org.example.Product product7 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(orderList4);
        org.junit.Assert.assertNull(product6);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        boolean boolean7 = productRepository0.delete((java.lang.Long) (-1L));
        org.example.Product product8 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        boolean boolean2 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList4 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        boolean boolean6 = productRepository0.delete((java.lang.Long) 0L);
        org.example.Order order7 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
        boolean boolean10 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList11 = productRepository0.findAll();
        org.example.Product product13 = productRepository0.findById((java.lang.Long) (-1L));
        org.example.Product product14 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNull(product13);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("hi!");
        org.example.Product product8 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList9 = productRepository0.findAllOrders();
        org.example.Order order10 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(product8);
        org.junit.Assert.assertNotNull(orderList9);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 10L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        org.example.Order order8 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNull(order8);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        java.lang.Class<?> wildcardClass8 = productRepository0.getClass();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList8 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        org.example.Order order9 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList8);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("hi!");
        org.example.Product product8 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList9 = productRepository0.findAll();
        java.util.List<org.example.Product> productList11 = productRepository0.findByKeyword("");
        org.example.Product product12 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(product8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList1 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList3 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList5 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        org.example.Order order6 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNotNull(productList5);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        org.example.Order order8 = productRepository0.findOrderById((java.lang.Long) 100L);
        boolean boolean10 = productRepository0.delete((java.lang.Long) 0L);
        org.example.Order order12 = productRepository0.findOrderById((java.lang.Long) 1L);
        boolean boolean14 = productRepository0.delete((java.lang.Long) 10L);
        org.example.Product product15 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(order8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(order12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        boolean boolean8 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList10 = productRepository0.findByKeyword("");
        org.example.Product product11 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(productList10);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        boolean boolean7 = productRepository0.delete((java.lang.Long) (-1L));
        boolean boolean9 = productRepository0.delete((java.lang.Long) 1L);
        java.util.List<org.example.Order> orderList10 = productRepository0.findAllOrders();
        org.example.Order order11 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(orderList10);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList8 = productRepository0.findAllOrders();
        org.example.Product product9 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(orderList7);
        org.junit.Assert.assertNotNull(orderList8);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        boolean boolean6 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        org.example.Product product8 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(orderList7);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("hi!");
        org.example.Order order9 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(productList8);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        boolean boolean4 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList8 = productRepository0.findAll();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList8);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList8 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        org.example.Product product9 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList8);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        boolean boolean6 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("hi!");
        java.lang.Class<?> wildcardClass9 = productList8.getClass();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        boolean boolean4 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList6 = productRepository0.findAll();
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Order order8 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList7);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList5 = productRepository0.findByKeyword("");
        boolean boolean7 = productRepository0.delete((java.lang.Long) 10L);
        org.example.Product product8 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        org.example.Order order7 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Product product9 = productRepository0.findById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList10 = productRepository0.findSortedByName();
        org.example.Order order11 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(product9);
        org.junit.Assert.assertNotNull(productList10);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Order order9 = productRepository0.findOrderById((java.lang.Long) 1L);
        org.example.Product product11 = productRepository0.findById((java.lang.Long) (-1L));
        org.example.Order order12 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(order9);
        org.junit.Assert.assertNull(product11);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        boolean boolean6 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Product> productList9 = productRepository0.findSortedByName();
        org.example.Order order10 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList9);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("hi!");
        org.example.Product product8 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList9 = productRepository0.findAll();
        java.util.List<org.example.Product> productList11 = productRepository0.findByKeyword("");
        org.example.Order order12 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(product8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("hi!");
        org.example.Product product8 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList9 = productRepository0.findAll();
        java.util.List<org.example.Product> productList11 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList13 = productRepository0.findByKeyword("hi!");
        org.example.Order order15 = productRepository0.findOrderById((java.lang.Long) (-1L));
        org.example.Order order16 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(product8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNull(order15);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        org.example.Product product7 = productRepository0.findById((java.lang.Long) (-1L));
        org.example.Order order8 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNull(product7);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findByKeyword("");
        org.example.Product product8 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(productList7);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList8 = productRepository0.findAll();
        org.example.Product product10 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Product product11 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNull(product10);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList4 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.lang.Class<?> wildcardClass6 = productRepository0.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList9 = productRepository0.findAll();
        org.example.Product product10 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList9);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList8 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        org.example.Order order11 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        java.util.List<org.example.Product> productList9 = productRepository0.findByKeyword("hi!");
        org.example.Product product10 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList9);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        boolean boolean6 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        org.example.Order order8 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(orderList7);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList8 = productRepository0.findSortedByName();
        org.example.Product product9 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList8);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) (-1L));
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(order6);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList10 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList12 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList14 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Product> productList15 = productRepository0.findAll();
        java.lang.Class<?> wildcardClass16 = productRepository0.getClass();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        org.example.Product product8 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order10 = productRepository0.findOrderById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList11 = productRepository0.findSortedByName();
        org.example.Order order12 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(product8);
        org.junit.Assert.assertNull(order10);
        org.junit.Assert.assertNotNull(productList11);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        org.example.Product product7 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList8 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        org.example.Product product11 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNull(product7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList8 = productRepository0.findAllOrders();
        org.example.Order order9 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(orderList8);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order5 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Product product6 = productRepository0.findById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList8 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        java.util.List<org.example.Product> productList9 = productRepository0.findSortedByName();
        org.example.Product product10 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(product6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList9);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList10 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList12 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList14 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Product> productList15 = productRepository0.findSortedByName();
        org.example.Order order16 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList15);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Product product6 = productRepository0.findById((java.lang.Long) 1L);
        boolean boolean8 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList10 = productRepository0.findByKeyword("hi!");
        org.example.Product product11 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(product6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(productList10);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        boolean boolean6 = productRepository0.delete((java.lang.Long) (-1L));
        java.lang.Class<?> wildcardClass7 = productRepository0.getClass();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        org.example.Product product7 = productRepository0.findById((java.lang.Long) 1L);
        java.util.List<org.example.Order> orderList8 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList9 = productRepository0.findAllOrders();
        org.example.Product product10 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNull(product7);
        org.junit.Assert.assertNotNull(orderList8);
        org.junit.Assert.assertNotNull(orderList9);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList1 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList3 = productRepository0.findByKeyword("");
        boolean boolean5 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList6 = productRepository0.findAll();
        java.lang.Class<?> wildcardClass7 = productList6.getClass();
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        org.example.Order order8 = productRepository0.findOrderById((java.lang.Long) 100L);
        org.example.Product product10 = productRepository0.findById((java.lang.Long) 1L);
        org.example.Order order11 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(order8);
        org.junit.Assert.assertNull(product10);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Product product6 = productRepository0.findById((java.lang.Long) 1L);
        boolean boolean8 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        java.util.List<org.example.Product> productList11 = productRepository0.findAll();
        java.lang.Class<?> wildcardClass12 = productList11.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(product6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList1 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList3 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        boolean boolean5 = productRepository0.delete((java.lang.Long) 0L);
        java.lang.Class<?> wildcardClass6 = productRepository0.getClass();
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        org.example.Order order8 = productRepository0.findOrderById((java.lang.Long) 100L);
        boolean boolean10 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList12 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        java.util.List<org.example.Product> productList13 = productRepository0.findSortedByName();
        org.example.Order order14 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(order8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList13);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        org.example.Product product8 = productRepository0.findById((java.lang.Long) (-1L));
        boolean boolean10 = productRepository0.delete((java.lang.Long) (-1L));
        org.example.Order order11 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(product8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("hi!");
        org.example.Product product8 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList9 = productRepository0.findAll();
        java.util.List<org.example.Product> productList11 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList13 = productRepository0.findByKeyword("hi!");
        org.example.Order order15 = productRepository0.findOrderById((java.lang.Long) (-1L));
        org.example.Order order16 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(product8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNull(order15);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Product product9 = productRepository0.findById((java.lang.Long) 100L);
        org.example.Order order11 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList12 = productRepository0.findAllOrders();
        org.example.Order order13 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(product9);
        org.junit.Assert.assertNull(order11);
        org.junit.Assert.assertNotNull(orderList12);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList5 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList6 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("hi!");
        org.example.Order order9 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        org.example.Product product7 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList8 = productRepository0.findSortedByName();
        org.example.Order order9 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNull(product7);
        org.junit.Assert.assertNotNull(productList8);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Product product9 = productRepository0.findById((java.lang.Long) 100L);
        org.example.Order order10 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(product9);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        boolean boolean2 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList3 = productRepository0.findSortedByName();
        org.example.Product product5 = productRepository0.findById((java.lang.Long) 1L);
        org.example.Product product7 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Product product8 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNull(product5);
        org.junit.Assert.assertNull(product7);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Product product6 = productRepository0.findById((java.lang.Long) 1L);
        boolean boolean8 = productRepository0.delete((java.lang.Long) 0L);
        org.example.Order order10 = productRepository0.findOrderById((java.lang.Long) 100L);
        org.example.Order order11 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(product6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(order10);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Product product9 = productRepository0.findById((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList11 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Product> productList13 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList14 = productRepository0.findAll();
        java.util.List<org.example.Product> productList16 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        org.example.Order order17 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(product9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList16);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList1 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList3 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        boolean boolean5 = productRepository0.delete((java.lang.Long) 0L);
        org.example.Product product6 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList1 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList3 = productRepository0.findByKeyword("");
        boolean boolean5 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.lang.Class<?> wildcardClass8 = productRepository0.getClass();
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList4 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList7 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        boolean boolean9 = productRepository0.delete((java.lang.Long) (-1L));
        org.example.Order order10 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(orderList4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        org.example.Order order8 = productRepository0.findOrderById((java.lang.Long) 100L);
        boolean boolean10 = productRepository0.delete((java.lang.Long) 0L);
        org.example.Order order12 = productRepository0.findOrderById((java.lang.Long) 1L);
        boolean boolean14 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList15 = productRepository0.findAll();
        org.example.Product product16 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(order8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(order12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(productList15);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList10 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList12 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList14 = productRepository0.findByKeyword("hi!");
        org.example.Order order16 = productRepository0.findOrderById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList17 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList19 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Product> productList20 = productRepository0.findSortedByName();
        org.example.Order order21 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNull(order16);
        org.junit.Assert.assertNotNull(productList17);
        org.junit.Assert.assertNotNull(productList19);
        org.junit.Assert.assertNotNull(productList20);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        org.example.Order order2 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        org.example.Product product5 = productRepository0.findById((java.lang.Long) 1L);
        org.example.Order order6 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNull(product5);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        org.example.Product product7 = productRepository0.findById((java.lang.Long) 1L);
        org.example.Order order8 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNull(product7);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList10 = productRepository0.findByKeyword("");
        org.example.Product product12 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList13 = productRepository0.findAllOrders();
        org.example.Order order14 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNull(product12);
        org.junit.Assert.assertNotNull(orderList13);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        boolean boolean4 = productRepository0.delete((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        org.example.Order order7 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(productList6);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList7 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        org.example.Order order8 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList7);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        org.example.Product product8 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(orderList7);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        org.example.Product product7 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList8 = productRepository0.findSortedByName();
        org.example.Product product9 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNull(product7);
        org.junit.Assert.assertNotNull(productList8);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        org.example.Order order8 = productRepository0.findOrderById((java.lang.Long) 100L);
        boolean boolean10 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList12 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.lang.Class<?> wildcardClass13 = productRepository0.getClass();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(order8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("hi!");
        org.example.Product product8 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList9 = productRepository0.findAll();
        java.util.List<org.example.Product> productList11 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList12 = productRepository0.findAll();
        org.example.Product product14 = productRepository0.findById((java.lang.Long) 1L);
        boolean boolean16 = productRepository0.delete((java.lang.Long) 0L);
        org.example.Product product17 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(product8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNull(product14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        boolean boolean8 = productRepository0.delete((java.lang.Long) 10L);
        org.example.Order order9 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList8 = productRepository0.findAll();
        org.example.Order order9 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList8);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Product product9 = productRepository0.findById((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList11 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.util.List<org.example.Product> productList13 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        org.example.Order order14 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(product9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList13);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        boolean boolean4 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList7 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Product> productList9 = productRepository0.findByKeyword("hi!");
        org.example.Order order10 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList9);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        boolean boolean4 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        org.example.Order order8 = productRepository0.findOrderById((java.lang.Long) 1L);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNull(order8);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        boolean boolean4 = productRepository0.delete((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        java.lang.Class<?> wildcardClass8 = productRepository0.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList8 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Product product11 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(orderList8);
        org.junit.Assert.assertNotNull(productList10);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList5 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList6 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        java.util.List<org.example.Order> orderList8 = productRepository0.findAllOrders();
        org.example.Order order10 = productRepository0.findOrderById((java.lang.Long) 1L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = order10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(orderList8);
        org.junit.Assert.assertNull(order10);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        boolean boolean9 = productRepository0.delete((java.lang.Long) (-1L));
        org.example.Order order10 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        boolean boolean9 = productRepository0.delete((java.lang.Long) (-1L));
        java.lang.Class<?> wildcardClass10 = productRepository0.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        boolean boolean7 = productRepository0.delete((java.lang.Long) (-1L));
        boolean boolean9 = productRepository0.delete((java.lang.Long) 1L);
        org.example.Product product10 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList1 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList3 = productRepository0.findByKeyword("");
        boolean boolean5 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.util.List<org.example.Product> productList9 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList11 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        java.util.List<org.example.Order> orderList12 = productRepository0.findAllOrders();
        org.example.Order order13 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(orderList12);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList6 = productRepository0.findSortedByName();
        java.lang.Class<?> wildcardClass7 = productRepository0.getClass();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Product product9 = productRepository0.findById((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList11 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.util.List<org.example.Product> productList13 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        org.example.Product product15 = productRepository0.findById((java.lang.Long) 100L);
        org.example.Order order16 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(product9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNull(product15);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList10 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList12 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList14 = productRepository0.findByKeyword("hi!");
        org.example.Order order16 = productRepository0.findOrderById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList17 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList19 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order20 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNull(order16);
        org.junit.Assert.assertNotNull(productList17);
        org.junit.Assert.assertNotNull(productList19);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Order order9 = productRepository0.findOrderById((java.lang.Long) 1L);
        java.util.List<org.example.Order> orderList10 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList11 = productRepository0.findSortedByName();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(order9);
        org.junit.Assert.assertNotNull(orderList10);
        org.junit.Assert.assertNotNull(productList11);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList5 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList6 = productRepository0.findSortedByName();
        boolean boolean8 = productRepository0.delete((java.lang.Long) 100L);
        java.lang.Class<?> wildcardClass9 = productRepository0.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        boolean boolean4 = productRepository0.delete((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        org.example.Order order8 = productRepository0.findOrderById((java.lang.Long) 1L);
        org.example.Order order9 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(order8);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        boolean boolean9 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList10 = productRepository0.findAllOrders();
        org.example.Order order11 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(orderList10);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList5 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList6 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        java.util.List<org.example.Order> orderList8 = productRepository0.findAllOrders();
        org.example.Order order9 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(orderList8);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        boolean boolean4 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList7 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Product> productList9 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Product> productList11 = productRepository0.findByKeyword("");
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        org.example.Order order8 = productRepository0.findOrderById((java.lang.Long) 100L);
        boolean boolean10 = productRepository0.delete((java.lang.Long) 0L);
        org.example.Order order12 = productRepository0.findOrderById((java.lang.Long) 1L);
        boolean boolean14 = productRepository0.delete((java.lang.Long) 10L);
        boolean boolean16 = productRepository0.delete((java.lang.Long) 100L);
        org.example.Product product18 = productRepository0.findById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList20 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        boolean boolean22 = productRepository0.delete((java.lang.Long) 0L);
        org.example.Product product23 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(order8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(order12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(product18);
        org.junit.Assert.assertNotNull(productList20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        boolean boolean4 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList6 = productRepository0.findAll();
        org.example.Order order7 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList6);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Order order9 = productRepository0.findOrderById((java.lang.Long) 1L);
        org.example.Product product11 = productRepository0.findById((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList13 = productRepository0.findByKeyword("");
        org.example.Product product14 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(order9);
        org.junit.Assert.assertNull(product11);
        org.junit.Assert.assertNotNull(productList13);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        boolean boolean8 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList9 = productRepository0.findAll();
        boolean boolean11 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList13 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        org.example.Order order14 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(productList13);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("hi!");
        org.example.Product product8 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList9 = productRepository0.findAll();
        java.util.List<org.example.Product> productList11 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList12 = productRepository0.findAll();
        org.example.Product product14 = productRepository0.findById((java.lang.Long) 1L);
        boolean boolean16 = productRepository0.delete((java.lang.Long) 0L);
        org.example.Product product18 = productRepository0.findById((java.lang.Long) 1L);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(product8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNull(product14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(product18);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList6 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        org.example.Product product8 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(orderList7);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        org.example.Order order7 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(orderList6);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Product product9 = productRepository0.findById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList10 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList11 = productRepository0.findAll();
        org.example.Product product12 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(product9);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList11);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        boolean boolean9 = productRepository0.delete((java.lang.Long) 0L);
        org.example.Order order10 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        org.example.Product product8 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        java.lang.Class<?> wildcardClass8 = productRepository0.getClass();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Order order9 = productRepository0.findOrderById((java.lang.Long) 1L);
        org.example.Order order11 = productRepository0.findOrderById((java.lang.Long) (-1L));
        org.example.Order order13 = productRepository0.findOrderById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList14 = productRepository0.findAll();
        org.example.Product product15 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(order9);
        org.junit.Assert.assertNull(order11);
        org.junit.Assert.assertNull(order13);
        org.junit.Assert.assertNotNull(productList14);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList6 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        org.example.Product product8 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList7);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Product product6 = productRepository0.findById((java.lang.Long) 1L);
        boolean boolean8 = productRepository0.delete((java.lang.Long) 0L);
        org.example.Order order10 = productRepository0.findOrderById((java.lang.Long) 0L);
        org.example.Order order11 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(product6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(order10);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        boolean boolean9 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList10 = productRepository0.findAllOrders();
        org.example.Product product11 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(orderList10);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        java.util.List<org.example.Product> productList4 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        org.example.Product product6 = productRepository0.findById((java.lang.Long) (-1L));
        org.example.Order order7 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNull(product6);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
        org.example.Order order10 = productRepository0.findOrderById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList11 = productRepository0.findSortedByName();
        boolean boolean13 = productRepository0.delete((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNull(order10);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        org.example.Order order8 = productRepository0.findOrderById((java.lang.Long) 100L);
        boolean boolean10 = productRepository0.delete((java.lang.Long) 0L);
        org.example.Order order12 = productRepository0.findOrderById((java.lang.Long) 1L);
        boolean boolean14 = productRepository0.delete((java.lang.Long) 10L);
        org.example.Order order15 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(order8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(order12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        boolean boolean9 = productRepository0.delete((java.lang.Long) 0L);
        org.example.Product product11 = productRepository0.findById((java.lang.Long) 100L);
        org.example.Order order12 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(orderList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(product11);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 10L);
        boolean boolean6 = productRepository0.delete((java.lang.Long) 10L);
        org.example.Product product7 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList8 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        java.lang.Class<?> wildcardClass11 = productRepository0.getClass();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        org.example.Product product7 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList8 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        org.example.Product product11 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNull(product7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        boolean boolean9 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList10 = productRepository0.findAll();
        java.util.List<org.example.Order> orderList11 = productRepository0.findAllOrders();
        org.example.Product product12 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(orderList11);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Order order9 = productRepository0.findOrderById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList10 = productRepository0.findAll();
        org.example.Order order12 = productRepository0.findOrderById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList14 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        org.example.Order order15 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(order9);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNull(order12);
        org.junit.Assert.assertNotNull(productList14);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Order order9 = productRepository0.findOrderById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList10 = productRepository0.findAll();
        org.example.Product product11 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(order9);
        org.junit.Assert.assertNotNull(productList10);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        boolean boolean8 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList9 = productRepository0.findAll();
        org.example.Product product10 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(productList9);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        boolean boolean6 = productRepository0.delete((java.lang.Long) (-1L));
        org.example.Order order7 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList1 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList2 = productRepository0.findAllOrders();
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(orderList2);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        boolean boolean6 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Product> productList9 = productRepository0.findSortedByName();
        org.example.Order order10 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList9);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        org.example.Product product7 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList8 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList9 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList10 = productRepository0.findAll();
        java.util.List<org.example.Order> orderList11 = productRepository0.findAllOrders();
        org.example.Product product12 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNull(product7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(orderList9);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(orderList11);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList8 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        org.example.Order order10 = productRepository0.findOrderById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList12 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        org.example.Order order13 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNull(order10);
        org.junit.Assert.assertNotNull(productList12);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList10 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList12 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList14 = productRepository0.findByKeyword("hi!");
        org.example.Order order16 = productRepository0.findOrderById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList17 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList19 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        org.example.Product product20 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNull(order16);
        org.junit.Assert.assertNotNull(orderList17);
        org.junit.Assert.assertNotNull(productList19);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        boolean boolean4 = productRepository0.delete((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        org.example.Product product7 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(productList6);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        boolean boolean4 = productRepository0.delete((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        java.util.List<org.example.Product> productList8 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        org.example.Product product9 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        org.example.Product product7 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList8 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList9 = productRepository0.findSortedByName();
        org.example.Product product10 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNull(product7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList9);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Product product6 = productRepository0.findById((java.lang.Long) 1L);
        boolean boolean8 = productRepository0.delete((java.lang.Long) 10L);
        org.example.Product product9 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(product6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList6 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        java.util.List<org.example.Product> productList9 = productRepository0.findByKeyword("hi!");
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList9);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList2 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        org.example.Product product5 = productRepository0.findById((java.lang.Long) 0L);
        boolean boolean7 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList9 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        org.example.Product product10 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(orderList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNull(product5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(productList9);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        org.example.Product product8 = productRepository0.findById((java.lang.Long) (-1L));
        org.example.Order order10 = productRepository0.findOrderById((java.lang.Long) 0L);
        org.example.Product product11 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(product8);
        org.junit.Assert.assertNull(order10);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList8 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Product product11 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(orderList8);
        org.junit.Assert.assertNotNull(productList10);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList5 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList6 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        org.example.Product product8 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(orderList7);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        org.example.Product product7 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList8 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList9 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList10 = productRepository0.findAll();
        org.example.Order order12 = productRepository0.findOrderById((java.lang.Long) (-1L));
        java.util.List<org.example.Order> orderList13 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList15 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList17 = productRepository0.findByKeyword("hi!");
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNull(product7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNull(order12);
        org.junit.Assert.assertNotNull(orderList13);
        org.junit.Assert.assertNotNull(productList15);
        org.junit.Assert.assertNotNull(productList17);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
        boolean boolean10 = productRepository0.delete((java.lang.Long) 10L);
        org.example.Product product12 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList14 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        org.example.Product product16 = productRepository0.findById((java.lang.Long) 1L);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(product12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNull(product16);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList1 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList3 = productRepository0.findByKeyword("");
        boolean boolean5 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList9 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.lang.Class<?> wildcardClass10 = productList9.getClass();
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList10 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList12 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList14 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order15 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        boolean boolean9 = productRepository0.delete((java.lang.Long) 0L);
        org.example.Order order11 = productRepository0.findOrderById((java.lang.Long) 0L);
        org.example.Order order12 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(orderList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(order11);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        org.example.Order order8 = productRepository0.findOrderById((java.lang.Long) 100L);
        boolean boolean10 = productRepository0.delete((java.lang.Long) 0L);
        org.example.Order order12 = productRepository0.findOrderById((java.lang.Long) 1L);
        boolean boolean14 = productRepository0.delete((java.lang.Long) 10L);
        boolean boolean16 = productRepository0.delete((java.lang.Long) 100L);
        org.example.Product product18 = productRepository0.findById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList20 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        boolean boolean22 = productRepository0.delete((java.lang.Long) 1L);
        org.example.Product product23 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(order8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(order12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(product18);
        org.junit.Assert.assertNotNull(productList20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList4 = productRepository0.findAll();
        java.lang.Class<?> wildcardClass5 = productList4.getClass();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        boolean boolean2 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList4 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.util.List<org.example.Product> productList9 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        org.example.Product product10 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList9);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList4 = productRepository0.findAll();
        java.lang.Class<?> wildcardClass5 = productRepository0.getClass();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        org.example.Order order8 = productRepository0.findOrderById((java.lang.Long) 100L);
        boolean boolean10 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList12 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Product> productList14 = productRepository0.findByKeyword("");
        org.example.Order order15 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(order8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        org.example.Order order8 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(orderList7);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("hi!");
        org.example.Product product8 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        java.util.List<org.example.Product> productList11 = productRepository0.findAll();
        org.example.Product product12 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(product8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList11);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList8 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        org.example.Order order10 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.lang.Class<?> wildcardClass11 = productRepository0.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNull(order10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Order order9 = productRepository0.findOrderById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList10 = productRepository0.findAll();
        boolean boolean12 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Order> orderList13 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList14 = productRepository0.findAllOrders();
        org.example.Order order15 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(order9);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(orderList13);
        org.junit.Assert.assertNotNull(orderList14);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Order order9 = productRepository0.findOrderById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList10 = productRepository0.findAll();
        org.example.Order order12 = productRepository0.findOrderById((java.lang.Long) 1L);
        org.example.Order order13 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(order9);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNull(order12);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        java.util.List<org.example.Product> productList9 = productRepository0.findByKeyword("hi!");
        org.example.Order order10 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList9);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        java.util.List<org.example.Product> productList8 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList9 = productRepository0.findAll();
        java.util.List<org.example.Product> productList11 = productRepository0.findByKeyword("");
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        boolean boolean4 = productRepository0.delete((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        org.example.Product product8 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList7);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("hi!");
        org.example.Product product8 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList9 = productRepository0.findAll();
        java.util.List<org.example.Product> productList11 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList12 = productRepository0.findAll();
        java.util.List<org.example.Product> productList13 = productRepository0.findSortedByName();
        org.example.Order order14 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(product8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList13);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList8 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        org.example.Product product9 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Product product9 = productRepository0.findById((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList11 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Product product12 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(product9);
        org.junit.Assert.assertNotNull(productList11);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList5 = productRepository0.findByKeyword("");
        boolean boolean7 = productRepository0.delete((java.lang.Long) 10L);
        org.example.Order order9 = productRepository0.findOrderById((java.lang.Long) 100L);
        org.example.Order order10 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(order9);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList6 = productRepository0.findSortedByName();
        org.example.Order order8 = productRepository0.findOrderById((java.lang.Long) 1L);
        java.lang.Class<?> wildcardClass9 = productRepository0.getClass();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(order8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList8 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.lang.Class<?> wildcardClass9 = productRepository0.getClass();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Product product6 = productRepository0.findById((java.lang.Long) 1L);
        boolean boolean8 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        boolean boolean12 = productRepository0.delete((java.lang.Long) 0L);
        org.example.Order order13 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(product6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList1 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList3 = productRepository0.findByKeyword("");
        boolean boolean5 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.util.List<org.example.Product> productList9 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList11 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        java.util.List<org.example.Order> orderList12 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList14 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order15 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(orderList12);
        org.junit.Assert.assertNotNull(productList14);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        org.example.Product product7 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        org.example.Product product7 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList8 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList9 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList11 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        org.example.Product product12 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNull(product7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList5 = productRepository0.findByKeyword("");
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
        org.example.Order order9 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList8);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList1 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList3 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList5 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        org.example.Product product6 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNotNull(productList5);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        org.example.Product product7 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(productList6);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList4 = productRepository0.findAll();
        java.util.List<org.example.Product> productList5 = productRepository0.findAll();
        java.util.List<org.example.Product> productList6 = productRepository0.findAll();
        boolean boolean8 = productRepository0.delete((java.lang.Long) 100L);
        org.example.Order order9 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        org.example.Order order6 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(productList5);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
        boolean boolean10 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList11 = productRepository0.findAll();
        java.util.List<org.example.Product> productList12 = productRepository0.findAll();
        org.example.Order order13 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList12);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        boolean boolean2 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList3 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList4 = productRepository0.findSortedByName();
        boolean boolean6 = productRepository0.delete((java.lang.Long) (-1L));
        org.example.Product product8 = productRepository0.findById((java.lang.Long) 1L);
        java.lang.Class<?> wildcardClass9 = productRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(product8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList1 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList3 = productRepository0.findByKeyword("");
        boolean boolean5 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findByKeyword("hi!");
        org.example.Order order9 = productRepository0.findOrderById((java.lang.Long) 0L);
        org.example.Product product10 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(order9);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList9 = productRepository0.findAll();
        java.util.List<org.example.Order> orderList10 = productRepository0.findAllOrders();
        org.example.Order order12 = productRepository0.findOrderById((java.lang.Long) 1L);
        org.example.Product product13 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(orderList10);
        org.junit.Assert.assertNull(order12);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        org.example.Order order8 = productRepository0.findOrderById((java.lang.Long) 100L);
        boolean boolean10 = productRepository0.delete((java.lang.Long) 0L);
        org.example.Order order12 = productRepository0.findOrderById((java.lang.Long) 1L);
        boolean boolean14 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList15 = productRepository0.findAll();
        java.util.List<org.example.Product> productList16 = productRepository0.findSortedByName();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(order8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(order12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(productList15);
        org.junit.Assert.assertNotNull(productList16);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList6 = productRepository0.findSortedByName();
        org.example.Product product7 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(productList6);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList1 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList3 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        boolean boolean5 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        org.example.Product product7 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        java.util.List<org.example.Order> orderList8 = productRepository0.findAllOrders();
        java.lang.Class<?> wildcardClass9 = productRepository0.getClass();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(orderList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList10 = productRepository0.findByKeyword("");
        org.example.Product product12 = productRepository0.findById((java.lang.Long) 0L);
        boolean boolean14 = productRepository0.delete((java.lang.Long) 0L);
        org.example.Product product15 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNull(product12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
        org.example.Order order9 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList8);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        boolean boolean2 = productRepository0.delete((java.lang.Long) (-1L));
        java.lang.Class<?> wildcardClass3 = productRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        org.example.Order order8 = productRepository0.findOrderById((java.lang.Long) 100L);
        org.example.Product product9 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(order8);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList4 = productRepository0.findAll();
        java.lang.Class<?> wildcardClass5 = productList4.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        boolean boolean9 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Order> orderList10 = productRepository0.findAllOrders();
        org.example.Order order11 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(orderList10);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList7 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.util.List<org.example.Order> orderList8 = productRepository0.findAllOrders();
        org.example.Product product9 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(orderList8);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList8 = productRepository0.findAll();
        org.example.Product product10 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Product product11 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNull(product10);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList2 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        org.example.Order order4 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(orderList2);
        org.junit.Assert.assertNotNull(orderList3);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList8 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList9 = productRepository0.findAllOrders();
        org.example.Order order11 = productRepository0.findOrderById((java.lang.Long) 1L);
        boolean boolean13 = productRepository0.delete((java.lang.Long) (-1L));
        org.example.Order order14 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(orderList8);
        org.junit.Assert.assertNotNull(orderList9);
        org.junit.Assert.assertNull(order11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        boolean boolean8 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList9 = productRepository0.findSortedByName();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(productList9);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList10 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList12 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList14 = productRepository0.findByKeyword("hi!");
        org.example.Order order15 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList5 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList6 = productRepository0.findSortedByName();
        boolean boolean8 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList9 = productRepository0.findSortedByName();
        org.example.Product product10 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(productList9);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList5 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList6 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        java.util.List<org.example.Order> orderList8 = productRepository0.findAllOrders();
        org.example.Order order10 = productRepository0.findOrderById((java.lang.Long) 1L);
        boolean boolean12 = productRepository0.delete((java.lang.Long) 10L);
        boolean boolean14 = productRepository0.delete((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(orderList8);
        org.junit.Assert.assertNull(order10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        org.example.Order order8 = productRepository0.findOrderById((java.lang.Long) 100L);
        boolean boolean10 = productRepository0.delete((java.lang.Long) 0L);
        org.example.Order order12 = productRepository0.findOrderById((java.lang.Long) 1L);
        boolean boolean14 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList15 = productRepository0.findAll();
        java.util.List<org.example.Order> orderList16 = productRepository0.findAllOrders();
        org.example.Order order17 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(order8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(order12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(productList15);
        org.junit.Assert.assertNotNull(orderList16);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        boolean boolean9 = productRepository0.delete((java.lang.Long) 0L);
        org.example.Order order10 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList8 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order12 = productRepository0.findOrderById((java.lang.Long) 100L);
        org.example.Order order14 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(orderList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNull(order12);
        org.junit.Assert.assertNull(order14);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Order order9 = productRepository0.findOrderById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList10 = productRepository0.findAll();
        org.example.Order order12 = productRepository0.findOrderById((java.lang.Long) 1L);
        org.example.Product product13 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(order9);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNull(order12);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList8 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        java.util.List<org.example.Product> productList12 = productRepository0.findByKeyword("hi!");
        org.example.Order order13 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList7 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Product> productList8 = productRepository0.findAll();
        java.util.List<org.example.Product> productList9 = productRepository0.findAll();
        org.example.Order order10 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList9);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList5 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList6 = productRepository0.findSortedByName();
        boolean boolean8 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList9 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList10 = productRepository0.findAllOrders();
        boolean boolean12 = productRepository0.delete((java.lang.Long) 1L);
        org.example.Order order14 = productRepository0.findOrderById((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList15 = productRepository0.findAll();
        java.util.List<org.example.Product> productList17 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(orderList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(order14);
        org.junit.Assert.assertNotNull(productList15);
        org.junit.Assert.assertNotNull(productList17);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        boolean boolean8 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList9 = productRepository0.findAll();
        boolean boolean11 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList13 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        java.util.List<org.example.Product> productList15 = productRepository0.findByKeyword("");
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNotNull(productList15);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        org.example.Order order6 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(orderList5);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        org.example.Order order8 = productRepository0.findOrderById((java.lang.Long) 100L);
        boolean boolean10 = productRepository0.delete((java.lang.Long) 0L);
        org.example.Order order12 = productRepository0.findOrderById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList13 = productRepository0.findSortedByName();
        org.example.Order order14 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(order8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(order12);
        org.junit.Assert.assertNotNull(productList13);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList2 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        org.example.Product product5 = productRepository0.findById((java.lang.Long) 0L);
        boolean boolean7 = productRepository0.delete((java.lang.Long) 100L);
        boolean boolean9 = productRepository0.delete((java.lang.Long) (-1L));
        org.example.Product product11 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList13 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(orderList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNull(product5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(product11);
        org.junit.Assert.assertNotNull(productList13);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        boolean boolean6 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Product> productList9 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList11 = productRepository0.findByKeyword("");
        org.example.Product product12 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList2 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        org.example.Product product5 = productRepository0.findById((java.lang.Long) 0L);
        boolean boolean7 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList9 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        org.example.Product product10 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(orderList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNull(product5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(productList9);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList8 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        org.example.Order order9 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList4 = productRepository0.findAll();
        org.example.Product product5 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(productList4);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        org.example.Product product7 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList8 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        java.lang.Class<?> wildcardClass11 = productRepository0.getClass();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNull(product7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        org.example.Product product8 = productRepository0.findById((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList9 = productRepository0.findAll();
        org.example.Product product11 = productRepository0.findById((java.lang.Long) 100L);
        org.example.Order order12 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(product8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNull(product11);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        boolean boolean9 = productRepository0.delete((java.lang.Long) 100L);
        org.example.Product product10 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        boolean boolean9 = productRepository0.delete((java.lang.Long) 0L);
        org.example.Order order10 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(orderList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Product product6 = productRepository0.findById((java.lang.Long) 1L);
        boolean boolean8 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        boolean boolean12 = productRepository0.delete((java.lang.Long) 10L);
        java.lang.Class<?> wildcardClass13 = productRepository0.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(product6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        org.example.Product product7 = productRepository0.findById((java.lang.Long) 1L);
        java.util.List<org.example.Order> orderList8 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList9 = productRepository0.findAllOrders();
        org.example.Order order10 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNull(product7);
        org.junit.Assert.assertNotNull(orderList8);
        org.junit.Assert.assertNotNull(orderList9);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        boolean boolean7 = productRepository0.delete((java.lang.Long) (-1L));
        boolean boolean9 = productRepository0.delete((java.lang.Long) 1L);
        java.util.List<org.example.Order> orderList10 = productRepository0.findAllOrders();
        org.example.Product product12 = productRepository0.findById((java.lang.Long) 1L);
        boolean boolean14 = productRepository0.delete((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(orderList10);
        org.junit.Assert.assertNull(product12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Product product6 = productRepository0.findById((java.lang.Long) 1L);
        boolean boolean8 = productRepository0.delete((java.lang.Long) 0L);
        org.example.Order order10 = productRepository0.findOrderById((java.lang.Long) 100L);
        org.example.Order order12 = productRepository0.findOrderById((java.lang.Long) (-1L));
        org.example.Order order13 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(product6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(order10);
        org.junit.Assert.assertNull(order12);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList1 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        java.util.List<org.example.Product> productList4 = productRepository0.findByKeyword("hi!");
        org.example.Order order5 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        org.example.Product product7 = productRepository0.findById((java.lang.Long) 1L);
        org.example.Product product8 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNull(product7);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList5 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList6 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        org.example.Order order8 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(orderList7);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList10 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList12 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList14 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Product> productList15 = productRepository0.findAll();
        java.lang.Class<?> wildcardClass16 = productList15.getClass();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        boolean boolean8 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList9 = productRepository0.findAll();
        boolean boolean11 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList13 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        org.example.Product product14 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(productList13);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList2 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        org.example.Product product5 = productRepository0.findById((java.lang.Long) 0L);
        boolean boolean7 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList8 = productRepository0.findAll();
        org.example.Order order10 = productRepository0.findOrderById((java.lang.Long) 0L);
        org.example.Product product11 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(orderList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNull(product5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNull(order10);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        boolean boolean8 = productRepository0.delete((java.lang.Long) 10L);
        org.example.Order order9 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        org.example.Order order8 = productRepository0.findOrderById((java.lang.Long) 100L);
        boolean boolean10 = productRepository0.delete((java.lang.Long) 0L);
        org.example.Order order12 = productRepository0.findOrderById((java.lang.Long) 1L);
        boolean boolean14 = productRepository0.delete((java.lang.Long) 10L);
        boolean boolean16 = productRepository0.delete((java.lang.Long) 100L);
        org.example.Product product18 = productRepository0.findById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList19 = productRepository0.findSortedByName();
        org.example.Order order20 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(order8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(order12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(product18);
        org.junit.Assert.assertNotNull(productList19);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Order order9 = productRepository0.findOrderById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList10 = productRepository0.findAll();
        boolean boolean12 = productRepository0.delete((java.lang.Long) 0L);
        org.example.Order order13 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(order9);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        boolean boolean4 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        org.example.Product product7 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(productList6);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        boolean boolean2 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList4 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.util.List<org.example.Product> productList9 = productRepository0.findByKeyword("hi!");
        org.example.Product product10 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList9);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList8 = productRepository0.findAllOrders();
        org.example.Product product10 = productRepository0.findById((java.lang.Long) 10L);
        org.example.Product product11 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(orderList7);
        org.junit.Assert.assertNotNull(orderList8);
        org.junit.Assert.assertNull(product10);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        boolean boolean6 = productRepository0.delete((java.lang.Long) (-1L));
        org.example.Product product7 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        boolean boolean3 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList4 = productRepository0.findAllOrders();
        java.lang.Class<?> wildcardClass5 = productRepository0.getClass();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(orderList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        boolean boolean2 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList3 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList4 = productRepository0.findAllOrders();
        org.example.Order order5 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNotNull(orderList4);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        boolean boolean3 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList4 = productRepository0.findAllOrders();
        org.example.Order order5 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(orderList4);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList5 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList6 = productRepository0.findSortedByName();
        boolean boolean8 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList9 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList10 = productRepository0.findAllOrders();
        boolean boolean12 = productRepository0.delete((java.lang.Long) 1L);
        org.example.Order order14 = productRepository0.findOrderById((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList15 = productRepository0.findAll();
        org.example.Order order16 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(orderList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(order14);
        org.junit.Assert.assertNotNull(productList15);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        org.example.Order order8 = productRepository0.findOrderById((java.lang.Long) 100L);
        boolean boolean10 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList12 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Product> productList14 = productRepository0.findByKeyword("");
        org.example.Product product15 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(order8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        boolean boolean4 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList9 = productRepository0.findByKeyword("hi!");
        org.example.Product product10 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList9);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList1 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList3 = productRepository0.findByKeyword("hi!");
        org.example.Product product4 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList3);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList1 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        java.util.List<org.example.Product> productList4 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        org.example.Product product6 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList5);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        org.example.Product product7 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList8 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList9 = productRepository0.findAllOrders();
        org.example.Order order10 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNull(product7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(orderList9);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        boolean boolean8 = productRepository0.delete((java.lang.Long) (-1L));
        boolean boolean10 = productRepository0.delete((java.lang.Long) 10L);
        org.example.Product product11 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList4 = productRepository0.findAll();
        java.util.List<org.example.Product> productList5 = productRepository0.findAll();
        java.util.List<org.example.Product> productList6 = productRepository0.findAll();
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("hi!");
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("hi!");
        org.example.Product product8 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList9 = productRepository0.findAll();
        java.util.List<org.example.Product> productList10 = productRepository0.findAll();
        org.example.Order order11 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(product8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList10);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        org.example.Product product8 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(orderList7);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("hi!");
        org.example.Product product8 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList9 = productRepository0.findAll();
        java.util.List<org.example.Product> productList11 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList12 = productRepository0.findAll();
        java.util.List<org.example.Product> productList13 = productRepository0.findSortedByName();
        java.lang.Class<?> wildcardClass14 = productList13.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(product8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("hi!");
        org.example.Product product8 = productRepository0.findById((java.lang.Long) 100L);
        org.example.Product product9 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(product8);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Product> productList3 = productRepository0.findSortedByName();
        org.example.Order order4 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList3);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList4 = productRepository0.findAll();
        boolean boolean6 = productRepository0.delete((java.lang.Long) 100L);
        org.example.Product product7 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList1 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList3 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList4 = productRepository0.findAll();
        org.example.Product product6 = productRepository0.findById((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNull(product6);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        org.example.Order order8 = productRepository0.findOrderById((java.lang.Long) 100L);
        boolean boolean10 = productRepository0.delete((java.lang.Long) 0L);
        org.example.Order order12 = productRepository0.findOrderById((java.lang.Long) 1L);
        boolean boolean14 = productRepository0.delete((java.lang.Long) 10L);
        boolean boolean16 = productRepository0.delete((java.lang.Long) 100L);
        org.example.Product product18 = productRepository0.findById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList20 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        boolean boolean22 = productRepository0.delete((java.lang.Long) 0L);
        org.example.Order order24 = productRepository0.findOrderById((java.lang.Long) 1L);
        java.util.List<org.example.Order> orderList25 = productRepository0.findAllOrders();
        org.example.Order order26 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(order8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(order12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(product18);
        org.junit.Assert.assertNotNull(productList20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(order24);
        org.junit.Assert.assertNotNull(orderList25);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList1 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList3 = productRepository0.findByKeyword("");
        boolean boolean5 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList9 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList10 = productRepository0.findAllOrders();
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(orderList10);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList8 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList9 = productRepository0.findAllOrders();
        org.example.Product product10 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(orderList8);
        org.junit.Assert.assertNotNull(orderList9);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        boolean boolean8 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        java.util.List<org.example.Product> productList11 = productRepository0.findAll();
        java.lang.Class<?> wildcardClass12 = productList11.getClass();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        org.example.Order order8 = productRepository0.findOrderById((java.lang.Long) 100L);
        boolean boolean10 = productRepository0.delete((java.lang.Long) 0L);
        org.example.Order order12 = productRepository0.findOrderById((java.lang.Long) 1L);
        boolean boolean14 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList15 = productRepository0.findAll();
        org.example.Product product16 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(order8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(order12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(productList15);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList8 = productRepository0.findAllOrders();
        org.example.Order order9 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(orderList8);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findAll();
        org.example.Product product7 = productRepository0.findById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList9 = productRepository0.findByKeyword("hi!");
        org.example.Order order10 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNull(product7);
        org.junit.Assert.assertNotNull(productList9);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        org.example.Order order8 = productRepository0.findOrderById((java.lang.Long) 100L);
        boolean boolean10 = productRepository0.delete((java.lang.Long) 0L);
        org.example.Order order12 = productRepository0.findOrderById((java.lang.Long) 1L);
        boolean boolean14 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList15 = productRepository0.findAll();
        java.util.List<org.example.Order> orderList16 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList18 = productRepository0.findByKeyword("");
        java.lang.Class<?> wildcardClass19 = productRepository0.getClass();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(order8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(order12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(productList15);
        org.junit.Assert.assertNotNull(orderList16);
        org.junit.Assert.assertNotNull(productList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList10 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList12 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList14 = productRepository0.findByKeyword("hi!");
        org.example.Order order16 = productRepository0.findOrderById((java.lang.Long) 0L);
        org.example.Product product17 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNull(order16);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList1 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList3 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        org.example.Order order5 = productRepository0.findOrderById((java.lang.Long) 1L);
        org.example.Order order6 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNull(order5);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        org.example.Product product8 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(productList7);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
        boolean boolean10 = productRepository0.delete((java.lang.Long) 10L);
        org.example.Product product12 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList14 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        org.example.Order order15 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(product12);
        org.junit.Assert.assertNotNull(productList14);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        boolean boolean2 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList3 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList4 = productRepository0.findAll();
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        java.util.List<org.example.Product> productList8 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList9 = productRepository0.findSortedByName();
        java.lang.Class<?> wildcardClass10 = productList9.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Product product6 = productRepository0.findById((java.lang.Long) 1L);
        boolean boolean8 = productRepository0.delete((java.lang.Long) 10L);
        org.example.Order order10 = productRepository0.findOrderById((java.lang.Long) 100L);
        org.example.Order order11 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(product6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(order10);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        boolean boolean9 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList10 = productRepository0.findSortedByName();
        org.example.Product product12 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Product product13 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNull(product12);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList2 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        org.example.Product product5 = productRepository0.findById((java.lang.Long) 0L);
        boolean boolean7 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList8 = productRepository0.findAll();
        java.util.List<org.example.Order> orderList9 = productRepository0.findAllOrders();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(orderList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNull(product5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(orderList9);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList2 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        org.example.Product product5 = productRepository0.findById((java.lang.Long) 0L);
        boolean boolean7 = productRepository0.delete((java.lang.Long) 100L);
        org.example.Order order8 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(orderList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNull(product5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        boolean boolean7 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList8 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList9 = productRepository0.findAll();
        org.example.Order order10 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList9);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        org.example.Product product7 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList8 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList9 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList10 = productRepository0.findSortedByName();
        boolean boolean12 = productRepository0.delete((java.lang.Long) 100L);
        org.example.Product product14 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList16 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        java.lang.Class<?> wildcardClass17 = productRepository0.getClass();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNull(product7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(orderList9);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(product14);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList4 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList7 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        org.example.Order order8 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(orderList4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList7);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList1 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList3 = productRepository0.findByKeyword("");
        boolean boolean5 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.util.List<org.example.Product> productList9 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList11 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        java.lang.Class<?> wildcardClass12 = productList11.getClass();
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("hi!");
        org.example.Product product8 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList9 = productRepository0.findAllOrders();
        boolean boolean11 = productRepository0.delete((java.lang.Long) (-1L));
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(product8);
        org.junit.Assert.assertNotNull(orderList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        org.example.Product product7 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList8 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList9 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList11 = productRepository0.findByKeyword("hi!");
        org.example.Product product12 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNull(product7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(orderList9);
        org.junit.Assert.assertNotNull(productList11);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        org.example.Product product7 = productRepository0.findById((java.lang.Long) 1L);
        java.util.List<org.example.Order> orderList8 = productRepository0.findAllOrders();
        java.lang.Class<?> wildcardClass9 = productRepository0.getClass();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNull(product7);
        org.junit.Assert.assertNotNull(orderList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        boolean boolean7 = productRepository0.delete((java.lang.Long) (-1L));
        boolean boolean9 = productRepository0.delete((java.lang.Long) 1L);
        org.example.Order order10 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        org.example.Product product7 = productRepository0.findById((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList9 = productRepository0.findByKeyword("hi!");
        java.lang.Class<?> wildcardClass10 = productList9.getClass();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNull(product7);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        java.util.List<org.example.Product> productList9 = productRepository0.findByKeyword("");
        org.example.Order order10 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList9);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Product product9 = productRepository0.findById((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList11 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Product> productList13 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList14 = productRepository0.findAll();
        org.example.Order order15 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(product9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNotNull(productList14);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList10 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList12 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList14 = productRepository0.findByKeyword("hi!");
        org.example.Order order16 = productRepository0.findOrderById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList17 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList19 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        org.example.Order order21 = productRepository0.findOrderById((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList22 = productRepository0.findSortedByName();
        org.example.Order order23 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNull(order16);
        org.junit.Assert.assertNotNull(orderList17);
        org.junit.Assert.assertNotNull(productList19);
        org.junit.Assert.assertNull(order21);
        org.junit.Assert.assertNotNull(productList22);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        boolean boolean9 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList10 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList12 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order13 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(orderList10);
        org.junit.Assert.assertNotNull(productList12);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList10 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList12 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList14 = productRepository0.findByKeyword("hi!");
        org.example.Order order16 = productRepository0.findOrderById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList17 = productRepository0.findAllOrders();
        org.example.Product product18 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNull(order16);
        org.junit.Assert.assertNotNull(orderList17);
    }
}

