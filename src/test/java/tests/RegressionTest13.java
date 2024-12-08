package tests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest13 {

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
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList10 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList12 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList14 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Product> productList16 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList16);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Product product9 = productRepository0.findById((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList11 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Product> productList12 = productRepository0.findAll();
        java.util.List<org.example.Product> productList14 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        boolean boolean16 = productRepository0.delete((java.lang.Long) 1L);
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
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(product9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        boolean boolean9 = productRepository0.delete((java.lang.Long) 100L);
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
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(productList10);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        boolean boolean2 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList4 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        org.example.Product product5 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(productList4);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        boolean boolean9 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList10 = productRepository0.findAll();
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
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList11);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Product> productList3 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList4 = productRepository0.findAll();
        boolean boolean6 = productRepository0.delete((java.lang.Long) (-1L));
        org.example.Order order7 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
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
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(orderList6);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        boolean boolean7 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList9 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList10 = productRepository0.findAll();
        java.util.List<org.example.Product> productList12 = productRepository0.findByKeyword("hi!");
        org.example.Product product14 = productRepository0.findById((java.lang.Long) 100L);
        org.example.Order order16 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList18 = productRepository0.findByKeyword("hi!");
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNull(product14);
        org.junit.Assert.assertNull(order16);
        org.junit.Assert.assertNotNull(productList18);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        java.util.List<org.example.Product> productList8 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList9 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList10 = productRepository0.findAll();
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
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(orderList9);
        org.junit.Assert.assertNotNull(productList10);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        org.example.Order order8 = productRepository0.findOrderById((java.lang.Long) 100L);
        boolean boolean10 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList12 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        java.util.List<org.example.Product> productList14 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.util.List<org.example.Product> productList16 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList17 = productRepository0.findAll();
        java.lang.Class<?> wildcardClass18 = productList17.getClass();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(order8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertNotNull(productList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        boolean boolean2 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList3 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList4 = productRepository0.findAll();
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList6 = productRepository0.findSortedByName();
        org.example.Product product8 = productRepository0.findById((java.lang.Long) 100L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(product8);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList8 = productRepository0.findSortedByName();
        org.example.Order order10 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(orderList7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNull(order10);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList9 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
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
        org.junit.Assert.assertNotNull(orderList7);
        org.junit.Assert.assertNotNull(productList9);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Product product9 = productRepository0.findById((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList11 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.util.List<org.example.Product> productList13 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.util.List<org.example.Product> productList15 = productRepository0.findByKeyword("");
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
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(product9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNotNull(productList15);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        org.example.Product product7 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList8 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        boolean boolean12 = productRepository0.delete((java.lang.Long) (-1L));
        boolean boolean14 = productRepository0.delete((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNull(product7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList10 = productRepository0.findByKeyword("");
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
        org.junit.Assert.assertNotNull(productList10);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        boolean boolean8 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList9 = productRepository0.findAll();
        org.example.Product product11 = productRepository0.findById((java.lang.Long) 1L);
        org.example.Product product13 = productRepository0.findById((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNull(product11);
        org.junit.Assert.assertNull(product13);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList5 = productRepository0.findByKeyword("");
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
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
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(orderList7);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        boolean boolean2 = productRepository0.delete((java.lang.Long) 100L);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        org.example.Product product7 = productRepository0.findById((java.lang.Long) (-1L));
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
        org.junit.Assert.assertNull(product7);
        org.junit.Assert.assertNotNull(orderList8);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList10 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList12 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList14 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList15 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList16 = productRepository0.findSortedByName();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(orderList15);
        org.junit.Assert.assertNotNull(productList16);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
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
        org.junit.Assert.assertNull(order8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(order12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        boolean boolean7 = productRepository0.delete((java.lang.Long) (-1L));
        boolean boolean9 = productRepository0.delete((java.lang.Long) 1L);
        java.util.List<org.example.Order> orderList10 = productRepository0.findAllOrders();
        org.example.Product product12 = productRepository0.findById((java.lang.Long) 1L);
        boolean boolean14 = productRepository0.delete((java.lang.Long) 1L);
        org.example.Order order16 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList18 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(orderList10);
        org.junit.Assert.assertNull(product12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(order16);
        org.junit.Assert.assertNotNull(productList18);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        org.example.Product product5 = productRepository0.findById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList6 = productRepository0.findAll();
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
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNull(product5);
        org.junit.Assert.assertNotNull(productList6);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList2 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        org.example.Product product5 = productRepository0.findById((java.lang.Long) 0L);
        boolean boolean7 = productRepository0.delete((java.lang.Long) 100L);
        boolean boolean9 = productRepository0.delete((java.lang.Long) (-1L));
        org.example.Product product11 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList13 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Order> orderList14 = productRepository0.findAllOrders();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(orderList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNull(product5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(product11);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNotNull(orderList14);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList5 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList6 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        boolean boolean4 = productRepository0.delete((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
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
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList9);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        org.example.Order order8 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList10 = productRepository0.findByKeyword("hi!");
        org.example.Product product12 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList13 = productRepository0.findSortedByName();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(order8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNull(product12);
        org.junit.Assert.assertNotNull(productList13);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        boolean boolean8 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList9 = productRepository0.findAll();
        boolean boolean11 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList13 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        java.util.List<org.example.Order> orderList14 = productRepository0.findAllOrders();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNotNull(orderList14);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        org.example.Product product7 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList8 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList9 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList11 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        java.util.List<org.example.Product> productList12 = productRepository0.findAll();
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
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNull(product7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList12);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList5 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList6 = productRepository0.findSortedByName();
        boolean boolean8 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList9 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList10 = productRepository0.findAllOrders();
        boolean boolean12 = productRepository0.delete((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList14 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList16 = productRepository0.findByKeyword("hi!");
        org.example.Product product17 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product17);
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
        org.junit.Assert.assertNotNull(orderList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList16);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        boolean boolean2 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList4 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList6 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
        java.lang.Class<?> wildcardClass9 = productList8.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        boolean boolean2 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList4 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        boolean boolean6 = productRepository0.delete((java.lang.Long) 0L);
        org.example.Product product8 = productRepository0.findById((java.lang.Long) 1L);
        java.util.List<org.example.Order> orderList9 = productRepository0.findAllOrders();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(product8);
        org.junit.Assert.assertNotNull(orderList9);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList4 = productRepository0.findAll();
        java.util.List<org.example.Product> productList5 = productRepository0.findAll();
        java.util.List<org.example.Product> productList6 = productRepository0.findAll();
        boolean boolean8 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList10 = productRepository0.findByKeyword("");
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(productList10);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        org.example.Order order8 = productRepository0.findOrderById((java.lang.Long) 100L);
        boolean boolean10 = productRepository0.delete((java.lang.Long) 1L);
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
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(order8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        boolean boolean8 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList9 = productRepository0.findAll();
        boolean boolean11 = productRepository0.delete((java.lang.Long) 0L);
        org.example.Product product13 = productRepository0.findById((java.lang.Long) 10L);
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
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(product13);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        boolean boolean8 = productRepository0.delete((java.lang.Long) (-1L));
        boolean boolean10 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList11 = productRepository0.findAll();
        boolean boolean13 = productRepository0.delete((java.lang.Long) 10L);
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
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList4 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList7 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        java.util.List<org.example.Product> productList9 = productRepository0.findByKeyword("");
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(orderList4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList9);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
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
        boolean boolean16 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList18 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(productList18);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
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
            productRepository0.saveOrder(order11);
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
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList9 = productRepository0.findAll();
        java.util.List<org.example.Order> orderList10 = productRepository0.findAllOrders();
        org.example.Order order12 = productRepository0.findOrderById((java.lang.Long) 1L);
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
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(orderList10);
        org.junit.Assert.assertNull(order12);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
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
        java.util.List<org.example.Product> productList22 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
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
        org.junit.Assert.assertNotNull(productList22);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        boolean boolean4 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Product product9 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Product product10 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(product9);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
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
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList15);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("hi!");
        org.example.Product product8 = productRepository0.findById((java.lang.Long) 100L);
        org.example.Order order10 = productRepository0.findOrderById((java.lang.Long) (-1L));
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(product8);
        org.junit.Assert.assertNull(order10);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        boolean boolean7 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList8 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList9 = productRepository0.findAll();
        boolean boolean11 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList12 = productRepository0.findAllOrders();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(orderList12);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList9 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList11 = productRepository0.findByKeyword("hi!");
        org.example.Product product13 = productRepository0.findById((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList15 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        java.lang.Class<?> wildcardClass16 = productList15.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(orderList7);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNull(product13);
        org.junit.Assert.assertNotNull(productList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList1 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList3 = productRepository0.findByKeyword("");
        boolean boolean5 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.util.List<org.example.Product> productList9 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        org.example.Order order11 = productRepository0.findOrderById((java.lang.Long) 100L);
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
        org.junit.Assert.assertNull(order11);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
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
            productRepository0.update(product10);
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
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        java.util.List<org.example.Order> orderList8 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(orderList8);
        org.junit.Assert.assertNotNull(productList10);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList4 = productRepository0.findAllOrders();
        org.example.Product product6 = productRepository0.findById((java.lang.Long) 1L);
        boolean boolean8 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList10 = productRepository0.findByKeyword("hi!");
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(orderList4);
        org.junit.Assert.assertNull(product6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(productList10);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList5 = productRepository0.findByKeyword("");
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
        org.example.Product product10 = productRepository0.findById((java.lang.Long) 10L);
        org.example.Order order12 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNull(product10);
        org.junit.Assert.assertNull(order12);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList4 = productRepository0.findAll();
        boolean boolean6 = productRepository0.delete((java.lang.Long) 100L);
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
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList1 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList3 = productRepository0.findByKeyword("");
        boolean boolean5 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findByKeyword("");
        java.lang.Class<?> wildcardClass8 = productRepository0.getClass();
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
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
        org.junit.Assert.assertNotNull(productList8);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        java.util.List<org.example.Product> productList9 = productRepository0.findByKeyword("hi!");
        boolean boolean11 = productRepository0.delete((java.lang.Long) 0L);
        java.lang.Class<?> wildcardClass12 = productRepository0.getClass();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        boolean boolean7 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList9 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList10 = productRepository0.findAll();
        java.util.List<org.example.Order> orderList11 = productRepository0.findAllOrders();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(orderList11);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList7 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        java.util.List<org.example.Product> productList8 = productRepository0.findAll();
        java.util.List<org.example.Product> productList9 = productRepository0.findAll();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList9);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        boolean boolean8 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList9 = productRepository0.findAll();
        boolean boolean11 = productRepository0.delete((java.lang.Long) 0L);
        org.example.Product product13 = productRepository0.findById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList14 = productRepository0.findAll();
        java.util.List<org.example.Product> productList16 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
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
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(product13);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList16);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList10 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList12 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList14 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList15 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList16 = productRepository0.findAllOrders();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(orderList15);
        org.junit.Assert.assertNotNull(orderList16);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        boolean boolean2 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList3 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList4 = productRepository0.findSortedByName();
        boolean boolean6 = productRepository0.delete((java.lang.Long) (-1L));
        org.example.Product product8 = productRepository0.findById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList9 = productRepository0.findAll();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(product8);
        org.junit.Assert.assertNotNull(productList9);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Product product9 = productRepository0.findById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList10 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList11 = productRepository0.findAll();
        java.util.List<org.example.Product> productList13 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Product> productList14 = productRepository0.findSortedByName();
        org.example.Product product15 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product15);
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
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNotNull(productList14);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList2 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        org.example.Product product5 = productRepository0.findById((java.lang.Long) 0L);
        boolean boolean7 = productRepository0.delete((java.lang.Long) 100L);
        boolean boolean9 = productRepository0.delete((java.lang.Long) (-1L));
        org.example.Product product11 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList13 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Product> productList14 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList16 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        java.util.List<org.example.Product> productList17 = productRepository0.findAll();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(orderList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNull(product5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(product11);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertNotNull(productList17);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Order order9 = productRepository0.findOrderById((java.lang.Long) 1L);
        org.example.Product product11 = productRepository0.findById((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList12 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList14 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        org.example.Product product16 = productRepository0.findById((java.lang.Long) 100L);
        boolean boolean18 = productRepository0.delete((java.lang.Long) (-1L));
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(order9);
        org.junit.Assert.assertNull(product11);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNull(product16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("hi!");
        org.example.Product product8 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList9 = productRepository0.findAll();
        java.util.List<org.example.Product> productList11 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList13 = productRepository0.findByKeyword("hi!");
        org.example.Order order15 = productRepository0.findOrderById((java.lang.Long) (-1L));
        org.example.Product product17 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList18 = productRepository0.findAll();
        org.example.Product product19 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product19);
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
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNull(order15);
        org.junit.Assert.assertNull(product17);
        org.junit.Assert.assertNotNull(productList18);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        org.example.Product product9 = productRepository0.findById((java.lang.Long) 1L);
        org.example.Order order11 = productRepository0.findOrderById((java.lang.Long) (-1L));
        org.example.Product product13 = productRepository0.findById((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(orderList7);
        org.junit.Assert.assertNull(product9);
        org.junit.Assert.assertNull(order11);
        org.junit.Assert.assertNull(product13);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Order order9 = productRepository0.findOrderById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList10 = productRepository0.findAll();
        boolean boolean12 = productRepository0.delete((java.lang.Long) (-1L));
        org.example.Order order14 = productRepository0.findOrderById((java.lang.Long) 100L);
        org.example.Order order16 = productRepository0.findOrderById((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(order9);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(order14);
        org.junit.Assert.assertNull(order16);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList10 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList12 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList14 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList15 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList16 = productRepository0.findAll();
        java.lang.Class<?> wildcardClass17 = productList16.getClass();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(orderList15);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("hi!");
        org.example.Product product8 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList9 = productRepository0.findAll();
        org.example.Order order11 = productRepository0.findOrderById((java.lang.Long) 100L);
        org.example.Order order13 = productRepository0.findOrderById((java.lang.Long) 0L);
        org.example.Product product15 = productRepository0.findById((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(product8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNull(order11);
        org.junit.Assert.assertNull(order13);
        org.junit.Assert.assertNull(product15);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList4 = productRepository0.findAll();
        boolean boolean6 = productRepository0.delete((java.lang.Long) 100L);
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
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(orderList7);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        org.example.Product product7 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList8 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList9 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList10 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList11 = productRepository0.findSortedByName();
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
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Product product6 = productRepository0.findById((java.lang.Long) 1L);
        boolean boolean8 = productRepository0.delete((java.lang.Long) 0L);
        org.example.Order order10 = productRepository0.findOrderById((java.lang.Long) 0L);
        org.example.Order order12 = productRepository0.findOrderById((java.lang.Long) 100L);
        org.example.Order order14 = productRepository0.findOrderById((java.lang.Long) (-1L));
        org.example.Product product15 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(product6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(order10);
        org.junit.Assert.assertNull(order12);
        org.junit.Assert.assertNull(order14);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList8 = productRepository0.findAllOrders();
        org.example.Product product10 = productRepository0.findById((java.lang.Long) 1L);
        org.example.Order order12 = productRepository0.findOrderById((java.lang.Long) (-1L));
        org.example.Product product14 = productRepository0.findById((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList16 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        boolean boolean18 = productRepository0.delete((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(orderList7);
        org.junit.Assert.assertNotNull(orderList8);
        org.junit.Assert.assertNull(product10);
        org.junit.Assert.assertNull(order12);
        org.junit.Assert.assertNull(product14);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        boolean boolean9 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList11 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList12 = productRepository0.findAll();
        boolean boolean14 = productRepository0.delete((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Product product9 = productRepository0.findById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList10 = productRepository0.findSortedByName();
        org.example.Product product12 = productRepository0.findById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList13 = productRepository0.findAll();
        org.example.Product product15 = productRepository0.findById((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(product9);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNull(product12);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNull(product15);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        boolean boolean9 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Order> orderList10 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList12 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        org.example.Order order14 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList15 = productRepository0.findAllOrders();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(orderList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNull(order14);
        org.junit.Assert.assertNotNull(orderList15);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
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
        java.util.List<org.example.Order> orderList20 = productRepository0.findAllOrders();
        org.example.Order order21 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order21);
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
        org.junit.Assert.assertNotNull(orderList20);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        org.example.Product product5 = productRepository0.findById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList6 = productRepository0.findAll();
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        java.util.List<org.example.Product> productList8 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList10 = productRepository0.findByKeyword("hi!");
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNull(product5);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
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
        java.util.List<org.example.Product> productList17 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList19 = productRepository0.findByKeyword("");
        org.example.Product product21 = productRepository0.findById((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(order8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(order12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(productList17);
        org.junit.Assert.assertNotNull(productList19);
        org.junit.Assert.assertNull(product21);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        boolean boolean9 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList11 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList12 = productRepository0.findSortedByName();
        boolean boolean14 = productRepository0.delete((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList15 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList17 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Product> productList19 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        org.example.Product product21 = productRepository0.findById((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(productList15);
        org.junit.Assert.assertNotNull(productList17);
        org.junit.Assert.assertNotNull(productList19);
        org.junit.Assert.assertNull(product21);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList2 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        org.example.Product product5 = productRepository0.findById((java.lang.Long) 0L);
        boolean boolean7 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList8 = productRepository0.findAll();
        org.example.Order order10 = productRepository0.findOrderById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList11 = productRepository0.findSortedByName();
        org.example.Order order13 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList15 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(orderList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNull(product5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNull(order10);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNull(order13);
        org.junit.Assert.assertNotNull(productList15);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        boolean boolean7 = productRepository0.delete((java.lang.Long) 10L);
        boolean boolean9 = productRepository0.delete((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList10 = productRepository0.findSortedByName();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(productList10);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        org.example.Product product8 = productRepository0.findById((java.lang.Long) (-1L));
        org.example.Order order10 = productRepository0.findOrderById((java.lang.Long) 0L);
        org.example.Product product12 = productRepository0.findById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList13 = productRepository0.findSortedByName();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(product8);
        org.junit.Assert.assertNull(order10);
        org.junit.Assert.assertNull(product12);
        org.junit.Assert.assertNotNull(productList13);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList2 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        org.example.Product product5 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        org.example.Order order8 = productRepository0.findOrderById((java.lang.Long) (-1L));
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
        org.junit.Assert.assertNotNull(orderList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNull(product5);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNull(order8);
        org.junit.Assert.assertNotNull(productList9);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        boolean boolean9 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList10 = productRepository0.findAll();
        java.util.List<org.example.Order> orderList11 = productRepository0.findAllOrders();
        org.example.Order order13 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList14 = productRepository0.findSortedByName();
        org.example.Product product16 = productRepository0.findById((java.lang.Long) 1L);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(orderList11);
        org.junit.Assert.assertNull(order13);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNull(product16);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList1 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList3 = productRepository0.findByKeyword("");
        boolean boolean5 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList9 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        boolean boolean11 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList12 = productRepository0.findSortedByName();
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(productList12);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        boolean boolean9 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList11 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order13 = productRepository0.findOrderById((java.lang.Long) 0L);
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
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(orderList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNull(order13);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
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
        org.example.Product product27 = productRepository0.findById((java.lang.Long) 100L);
        org.example.Order order28 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order28);
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
        org.junit.Assert.assertNull(product27);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList5 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList6 = productRepository0.findSortedByName();
        boolean boolean8 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList9 = productRepository0.findSortedByName();
        boolean boolean11 = productRepository0.delete((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("hi!");
        org.example.Product product8 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList9 = productRepository0.findAll();
        java.util.List<org.example.Product> productList11 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList13 = productRepository0.findByKeyword("hi!");
        org.example.Product product15 = productRepository0.findById((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(product8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNull(product15);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 10L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList8 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(productList8);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        org.example.Order order8 = productRepository0.findOrderById((java.lang.Long) 100L);
        boolean boolean10 = productRepository0.delete((java.lang.Long) 0L);
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        boolean boolean4 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList7 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList7);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        org.example.Product product7 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList8 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList9 = productRepository0.findSortedByName();
        boolean boolean11 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList12 = productRepository0.findSortedByName();
        org.example.Product product13 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product13);
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(productList12);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Product product9 = productRepository0.findById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList10 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList11 = productRepository0.findAll();
        java.util.List<org.example.Product> productList13 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Product> productList14 = productRepository0.findSortedByName();
        org.example.Order order16 = productRepository0.findOrderById((java.lang.Long) 1L);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(product9);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNull(order16);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList1 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList3 = productRepository0.findByKeyword("");
        boolean boolean5 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.util.List<org.example.Product> productList9 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList11 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        java.util.List<org.example.Order> orderList12 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList14 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Product> productList16 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList18 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(orderList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertNotNull(productList18);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList5 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList6 = productRepository0.findSortedByName();
        org.example.Order order8 = productRepository0.findOrderById((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(order8);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 10L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 10L);
        boolean boolean8 = productRepository0.delete((java.lang.Long) (-1L));
        org.example.Product product9 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
        boolean boolean10 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList11 = productRepository0.findAll();
        java.util.List<org.example.Product> productList12 = productRepository0.findAll();
        org.example.Order order14 = productRepository0.findOrderById((java.lang.Long) 1L);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNull(order14);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        boolean boolean9 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Order> orderList10 = productRepository0.findAllOrders();
        java.lang.Class<?> wildcardClass11 = productRepository0.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(orderList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        boolean boolean9 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList10 = productRepository0.findSortedByName();
        boolean boolean12 = productRepository0.delete((java.lang.Long) 1L);
        org.example.Product product14 = productRepository0.findById((java.lang.Long) (-1L));
        org.example.Product product15 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product15);
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(product14);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        boolean boolean8 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        boolean boolean12 = productRepository0.delete((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("hi!");
        org.example.Product product8 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList9 = productRepository0.findAll();
        java.util.List<org.example.Product> productList10 = productRepository0.findAll();
        java.util.List<org.example.Order> orderList11 = productRepository0.findAllOrders();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(product8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(orderList11);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList1 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList3 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList5 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.util.List<org.example.Product> productList7 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Product> productList8 = productRepository0.findSortedByName();
        java.lang.Class<?> wildcardClass9 = productList8.getClass();
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        boolean boolean2 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList3 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList4 = productRepository0.findAll();
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.lang.Class<?> wildcardClass6 = orderList5.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        boolean boolean2 = productRepository0.delete((java.lang.Long) 100L);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        java.util.List<org.example.Product> productList9 = productRepository0.findByKeyword("");
        org.example.Order order11 = productRepository0.findOrderById((java.lang.Long) 0L);
        org.example.Order order12 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNull(order11);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList1 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 0L);
        org.example.Product product5 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList4 = productRepository0.findAll();
        java.util.List<org.example.Product> productList5 = productRepository0.findAll();
        java.util.List<org.example.Product> productList6 = productRepository0.findAll();
        boolean boolean8 = productRepository0.delete((java.lang.Long) 100L);
        boolean boolean10 = productRepository0.delete((java.lang.Long) 10L);
        org.example.Order order12 = productRepository0.findOrderById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList13 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList14 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList15 = productRepository0.findSortedByName();
        boolean boolean17 = productRepository0.delete((java.lang.Long) 10L);
        org.example.Order order19 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(order12);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(order19);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        org.example.Order order8 = productRepository0.findOrderById((java.lang.Long) 100L);
        org.example.Product product10 = productRepository0.findById((java.lang.Long) 1L);
        org.example.Order order12 = productRepository0.findOrderById((java.lang.Long) (-1L));
        java.util.List<org.example.Order> orderList13 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList14 = productRepository0.findAllOrders();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(order8);
        org.junit.Assert.assertNull(product10);
        org.junit.Assert.assertNull(order12);
        org.junit.Assert.assertNotNull(orderList13);
        org.junit.Assert.assertNotNull(orderList14);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Product product9 = productRepository0.findById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList10 = productRepository0.findSortedByName();
        org.example.Product product12 = productRepository0.findById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList13 = productRepository0.findAll();
        java.util.List<org.example.Product> productList14 = productRepository0.findAll();
        java.util.List<org.example.Product> productList16 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList18 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Product product19 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product19);
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
        org.junit.Assert.assertNull(product12);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertNotNull(productList18);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        java.util.List<org.example.Product> productList9 = productRepository0.findByKeyword("hi!");
        boolean boolean11 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList12 = productRepository0.findAll();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(productList12);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Product product9 = productRepository0.findById((java.lang.Long) 100L);
        org.example.Order order11 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList12 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList14 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Order> orderList15 = productRepository0.findAllOrders();
        org.example.Order order16 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order16);
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
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(orderList15);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
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
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNull(product7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNull(order12);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
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
        org.example.Order order15 = productRepository0.findOrderById((java.lang.Long) (-1L));
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
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(order9);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(orderList13);
        org.junit.Assert.assertNull(order15);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("hi!");
        boolean boolean10 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList11 = productRepository0.findSortedByName();
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
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(productList11);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList5 = productRepository0.findByKeyword("");
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order12 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList13 = productRepository0.findAll();
        org.example.Order order15 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNull(order12);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNull(order15);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        boolean boolean7 = productRepository0.delete((java.lang.Long) (-1L));
        boolean boolean9 = productRepository0.delete((java.lang.Long) 1L);
        java.util.List<org.example.Order> orderList10 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList11 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList12 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList13 = productRepository0.findSortedByName();
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
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(orderList10);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(orderList12);
        org.junit.Assert.assertNotNull(productList13);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        boolean boolean4 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList9 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        boolean boolean11 = productRepository0.delete((java.lang.Long) 1L);
        boolean boolean13 = productRepository0.delete((java.lang.Long) (-1L));
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Product> productList8 = productRepository0.findSortedByName();
        org.example.Order order10 = productRepository0.findOrderById((java.lang.Long) 100L);
        boolean boolean12 = productRepository0.delete((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNull(order10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        boolean boolean2 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList4 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("hi!");
        org.example.Product product7 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList7 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.util.List<org.example.Order> orderList8 = productRepository0.findAllOrders();
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
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(orderList8);
        org.junit.Assert.assertNotNull(orderList9);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList4 = productRepository0.findAll();
        java.util.List<org.example.Product> productList5 = productRepository0.findAll();
        java.util.List<org.example.Product> productList6 = productRepository0.findAll();
        boolean boolean8 = productRepository0.delete((java.lang.Long) 100L);
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
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(orderList9);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Product product9 = productRepository0.findById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList10 = productRepository0.findSortedByName();
        org.example.Product product12 = productRepository0.findById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList13 = productRepository0.findAll();
        java.util.List<org.example.Product> productList14 = productRepository0.findAll();
        java.util.List<org.example.Product> productList16 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList18 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Product> productList19 = productRepository0.findAll();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(product9);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNull(product12);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertNotNull(productList18);
        org.junit.Assert.assertNotNull(productList19);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
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
            productRepository0.update(product10);
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
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
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
        java.util.List<org.example.Product> productList17 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList18 = productRepository0.findSortedByName();
        org.example.Product product19 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product19);
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
        org.junit.Assert.assertNotNull(orderList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(order14);
        org.junit.Assert.assertNotNull(productList15);
        org.junit.Assert.assertNotNull(productList17);
        org.junit.Assert.assertNotNull(productList18);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
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
            productRepository0.saveOrder(order26);
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
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
        org.example.Order order10 = productRepository0.findOrderById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList11 = productRepository0.findSortedByName();
        org.example.Order order13 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList14 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList15 = productRepository0.findSortedByName();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNull(order10);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNull(order13);
        org.junit.Assert.assertNotNull(orderList14);
        org.junit.Assert.assertNotNull(productList15);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Product> productList3 = productRepository0.findAll();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList3);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList8 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList9 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList10 = productRepository0.findAll();
        org.example.Product product12 = productRepository0.findById((java.lang.Long) 10L);
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
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(orderList7);
        org.junit.Assert.assertNotNull(orderList8);
        org.junit.Assert.assertNotNull(orderList9);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNull(product12);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
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
        java.util.List<org.example.Product> productList17 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList18 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList19 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList21 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
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
        org.junit.Assert.assertNotNull(productList18);
        org.junit.Assert.assertNotNull(productList19);
        org.junit.Assert.assertNotNull(productList21);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        boolean boolean9 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList11 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList12 = productRepository0.findSortedByName();
        boolean boolean14 = productRepository0.delete((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList15 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList17 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Product> productList19 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        java.util.List<org.example.Product> productList20 = productRepository0.findAll();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(productList15);
        org.junit.Assert.assertNotNull(productList17);
        org.junit.Assert.assertNotNull(productList19);
        org.junit.Assert.assertNotNull(productList20);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        org.example.Product product7 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList8 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList9 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList11 = productRepository0.findByKeyword("hi!");
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
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNull(product7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(orderList9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList13);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList8 = productRepository0.findAll();
        boolean boolean10 = productRepository0.delete((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        boolean boolean7 = productRepository0.delete((java.lang.Long) (-1L));
        boolean boolean9 = productRepository0.delete((java.lang.Long) 1L);
        java.util.List<org.example.Order> orderList10 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList11 = productRepository0.findSortedByName();
        boolean boolean13 = productRepository0.delete((java.lang.Long) 1L);
        java.util.List<org.example.Order> orderList14 = productRepository0.findAllOrders();
        java.lang.Class<?> wildcardClass15 = orderList14.getClass();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(orderList10);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(orderList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        boolean boolean9 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList10 = productRepository0.findAll();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(orderList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(productList10);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        boolean boolean4 = productRepository0.delete((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        java.util.List<org.example.Product> productList8 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        java.util.List<org.example.Product> productList11 = productRepository0.findSortedByName();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList11);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        boolean boolean2 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList4 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        boolean boolean6 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Order> orderList9 = productRepository0.findAllOrders();
        org.example.Order order10 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(orderList9);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        org.example.Product product8 = productRepository0.findById((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList9 = productRepository0.findAll();
        org.example.Product product11 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList12 = productRepository0.findSortedByName();
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
        org.junit.Assert.assertNull(product8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNull(product11);
        org.junit.Assert.assertNotNull(productList12);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        boolean boolean8 = productRepository0.delete((java.lang.Long) (-1L));
        boolean boolean10 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList11 = productRepository0.findAll();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(productList11);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("hi!");
        org.example.Product product8 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList9 = productRepository0.findAll();
        java.util.List<org.example.Product> productList11 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList13 = productRepository0.findByKeyword("hi!");
        org.example.Product product15 = productRepository0.findById((java.lang.Long) 100L);
        boolean boolean17 = productRepository0.delete((java.lang.Long) (-1L));
        org.example.Product product19 = productRepository0.findById((java.lang.Long) (-1L));
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(product8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNull(product15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(product19);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
        boolean boolean10 = productRepository0.delete((java.lang.Long) 10L);
        boolean boolean12 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList14 = productRepository0.findByKeyword("");
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(productList14);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList1 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList3 = productRepository0.findByKeyword("");
        boolean boolean5 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList9 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Product> productList11 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        org.example.Order order13 = productRepository0.findOrderById((java.lang.Long) 1L);
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNull(order13);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("hi!");
        org.example.Product product8 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList9 = productRepository0.findAll();
        java.util.List<org.example.Product> productList11 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList13 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Product> productList14 = productRepository0.findSortedByName();
        java.lang.Class<?> wildcardClass15 = productList14.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(product8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList4 = productRepository0.findAll();
        boolean boolean6 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        org.example.Order order9 = productRepository0.findOrderById((java.lang.Long) 0L);
        boolean boolean11 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList12 = productRepository0.findSortedByName();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(orderList7);
        org.junit.Assert.assertNull(order9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(productList12);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        boolean boolean2 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList3 = productRepository0.findSortedByName();
        org.example.Product product5 = productRepository0.findById((java.lang.Long) 1L);
        org.example.Product product7 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList8 = productRepository0.findSortedByName();
        boolean boolean10 = productRepository0.delete((java.lang.Long) 0L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNull(product5);
        org.junit.Assert.assertNull(product7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Product product9 = productRepository0.findById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList10 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList11 = productRepository0.findAll();
        java.util.List<org.example.Product> productList13 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Product> productList14 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList15 = productRepository0.findAll();
        org.example.Order order17 = productRepository0.findOrderById((java.lang.Long) (-1L));
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(product9);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList15);
        org.junit.Assert.assertNull(order17);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        boolean boolean4 = productRepository0.delete((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList8 = productRepository0.findAll();
        java.util.List<org.example.Product> productList10 = productRepository0.findByKeyword("");
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(orderList7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        boolean boolean2 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList3 = productRepository0.findSortedByName();
        org.example.Product product5 = productRepository0.findById((java.lang.Long) (-1L));
        org.example.Order order7 = productRepository0.findOrderById((java.lang.Long) 0L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNull(product5);
        org.junit.Assert.assertNull(order7);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList5 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList6 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        java.util.List<org.example.Order> orderList8 = productRepository0.findAllOrders();
        org.example.Order order10 = productRepository0.findOrderById((java.lang.Long) 1L);
        boolean boolean12 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList13 = productRepository0.findSortedByName();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(orderList8);
        org.junit.Assert.assertNull(order10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(productList13);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList7 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        org.example.Product product9 = productRepository0.findById((java.lang.Long) (-1L));
        boolean boolean11 = productRepository0.delete((java.lang.Long) 100L);
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
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(product9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        org.example.Order order7 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList9 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
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
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNull(order7);
        org.junit.Assert.assertNotNull(productList9);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
        org.example.Product product10 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList11 = productRepository0.findSortedByName();
        org.example.Order order13 = productRepository0.findOrderById((java.lang.Long) 0L);
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
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNull(product10);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNull(order13);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
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
        boolean boolean21 = productRepository0.delete((java.lang.Long) 0L);
        org.example.Order order23 = productRepository0.findOrderById((java.lang.Long) (-1L));
        java.lang.Class<?> wildcardClass24 = productRepository0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(order23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList4 = productRepository0.findAll();
        java.util.List<org.example.Product> productList5 = productRepository0.findAll();
        java.util.List<org.example.Product> productList6 = productRepository0.findSortedByName();
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
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList6);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("hi!");
        org.example.Order order10 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList12 = productRepository0.findByKeyword("");
        org.example.Order order14 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList16 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        org.example.Product product18 = productRepository0.findById((java.lang.Long) 1L);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNull(order10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNull(order14);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertNull(product18);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        org.example.Product product8 = productRepository0.findById((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Product> productList11 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList13 = productRepository0.findByKeyword("hi!");
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(product8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList13);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
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
        java.util.List<org.example.Product> productList18 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(productList18);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        boolean boolean4 = productRepository0.delete((java.lang.Long) 0L);
        boolean boolean6 = productRepository0.delete((java.lang.Long) 10L);
        org.example.Order order8 = productRepository0.findOrderById((java.lang.Long) (-1L));
        org.example.Order order10 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(order8);
        org.junit.Assert.assertNull(order10);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList10 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList12 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList14 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList15 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList16 = productRepository0.findAll();
        boolean boolean18 = productRepository0.delete((java.lang.Long) 0L);
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
        org.junit.Assert.assertNotNull(orderList15);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
        boolean boolean10 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList11 = productRepository0.findAll();
        org.example.Product product13 = productRepository0.findById((java.lang.Long) (-1L));
        java.util.List<org.example.Order> orderList14 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList16 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Product> productList17 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList18 = productRepository0.findSortedByName();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNull(product13);
        org.junit.Assert.assertNotNull(orderList14);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertNotNull(productList17);
        org.junit.Assert.assertNotNull(productList18);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        java.util.List<org.example.Product> productList8 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList10 = productRepository0.findByKeyword("");
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        boolean boolean2 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList4 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) (-1L));
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        org.example.Order order8 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(orderList7);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Product product9 = productRepository0.findById((java.lang.Long) 100L);
        org.example.Order order11 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList12 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList13 = productRepository0.findSortedByName();
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
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(product9);
        org.junit.Assert.assertNull(order11);
        org.junit.Assert.assertNotNull(orderList12);
        org.junit.Assert.assertNotNull(productList13);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
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
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList8);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList2 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        org.example.Product product5 = productRepository0.findById((java.lang.Long) 0L);
        boolean boolean7 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList9 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        java.util.List<org.example.Product> productList10 = productRepository0.findSortedByName();
        org.example.Order order12 = productRepository0.findOrderById((java.lang.Long) 0L);
        org.example.Order order14 = productRepository0.findOrderById((java.lang.Long) 1L);
        org.example.Order order15 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(orderList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNull(product5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNull(order12);
        org.junit.Assert.assertNull(order14);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("hi!");
        org.example.Product product8 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList9 = productRepository0.findAll();
        java.util.List<org.example.Product> productList11 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList13 = productRepository0.findByKeyword("hi!");
        org.example.Product product15 = productRepository0.findById((java.lang.Long) 100L);
        boolean boolean17 = productRepository0.delete((java.lang.Long) (-1L));
        org.example.Order order18 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order18);
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
        org.junit.Assert.assertNull(product15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList1 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList3 = productRepository0.findByKeyword("");
        boolean boolean5 = productRepository0.delete((java.lang.Long) 100L);
        org.example.Order order7 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList9 = productRepository0.findByKeyword("");
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(order7);
        org.junit.Assert.assertNotNull(productList9);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        org.example.Product product7 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList8 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNull(product7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList9 = productRepository0.findAll();
        boolean boolean11 = productRepository0.delete((java.lang.Long) 10L);
        org.example.Order order13 = productRepository0.findOrderById((java.lang.Long) 0L);
        org.example.Order order15 = productRepository0.findOrderById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList16 = productRepository0.findSortedByName();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(order13);
        org.junit.Assert.assertNull(order15);
        org.junit.Assert.assertNotNull(productList16);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Product product6 = productRepository0.findById((java.lang.Long) 1L);
        boolean boolean8 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        java.util.List<org.example.Product> productList11 = productRepository0.findAll();
        java.util.List<org.example.Order> orderList12 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList14 = productRepository0.findByKeyword("");
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(product6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(orderList12);
        org.junit.Assert.assertNotNull(productList14);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList5 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList6 = productRepository0.findSortedByName();
        boolean boolean8 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList9 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList10 = productRepository0.findAllOrders();
        boolean boolean12 = productRepository0.delete((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList14 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList16 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Product> productList17 = productRepository0.findAll();
        java.util.List<org.example.Product> productList19 = productRepository0.findByKeyword("hi!");
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(orderList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertNotNull(productList17);
        org.junit.Assert.assertNotNull(productList19);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        boolean boolean2 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList4 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList6 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        boolean boolean9 = productRepository0.delete((java.lang.Long) 0L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Product product9 = productRepository0.findById((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList11 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.util.List<org.example.Order> orderList12 = productRepository0.findAllOrders();
        java.lang.Class<?> wildcardClass13 = orderList12.getClass();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(product9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(orderList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList5 = productRepository0.findByKeyword("");
        boolean boolean7 = productRepository0.delete((java.lang.Long) 10L);
        org.example.Order order9 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList10 = productRepository0.findAllOrders();
        org.example.Order order12 = productRepository0.findOrderById((java.lang.Long) 100L);
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
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(order9);
        org.junit.Assert.assertNotNull(orderList10);
        org.junit.Assert.assertNull(order12);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        org.example.Order order7 = productRepository0.findOrderById((java.lang.Long) (-1L));
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(order7);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        org.example.Product product7 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList8 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList9 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList10 = productRepository0.findAll();
        boolean boolean12 = productRepository0.delete((java.lang.Long) 1L);
        org.example.Product product14 = productRepository0.findById((java.lang.Long) 1L);
        org.example.Order order16 = productRepository0.findOrderById((java.lang.Long) 0L);
        org.example.Order order18 = productRepository0.findOrderById((java.lang.Long) (-1L));
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNull(product7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(product14);
        org.junit.Assert.assertNull(order16);
        org.junit.Assert.assertNull(order18);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Product product9 = productRepository0.findById((java.lang.Long) (-1L));
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
        org.junit.Assert.assertNull(product9);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        boolean boolean9 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList10 = productRepository0.findAll();
        java.lang.Class<?> wildcardClass11 = productRepository0.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList6 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList10 = productRepository0.findByKeyword("hi!");
        org.example.Order order12 = productRepository0.findOrderById((java.lang.Long) 0L);
        org.example.Order order14 = productRepository0.findOrderById((java.lang.Long) (-1L));
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNull(order12);
        org.junit.Assert.assertNull(order14);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("hi!");
        org.example.Product product8 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList9 = productRepository0.findAll();
        java.util.List<org.example.Product> productList11 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList13 = productRepository0.findByKeyword("hi!");
        org.example.Order order15 = productRepository0.findOrderById((java.lang.Long) (-1L));
        org.example.Product product17 = productRepository0.findById((java.lang.Long) 100L);
        org.example.Product product18 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product18);
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
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNull(order15);
        org.junit.Assert.assertNull(product17);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList5 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList6 = productRepository0.findSortedByName();
        boolean boolean8 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList9 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList10 = productRepository0.findAllOrders();
        boolean boolean12 = productRepository0.delete((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList14 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList16 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Order> orderList17 = productRepository0.findAllOrders();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(orderList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertNotNull(orderList17);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        boolean boolean3 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList4 = productRepository0.findAll();
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        java.util.List<org.example.Product> productList8 = productRepository0.findSortedByName();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList8);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        boolean boolean2 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList3 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList4 = productRepository0.findSortedByName();
        org.example.Product product6 = productRepository0.findById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList8 = productRepository0.findAll();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNull(product6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList8);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Product product6 = productRepository0.findById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList8 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        java.util.List<org.example.Product> productList9 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList10 = productRepository0.findSortedByName();
        java.lang.Class<?> wildcardClass11 = productRepository0.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(product6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        boolean boolean9 = productRepository0.delete((java.lang.Long) 0L);
        org.example.Order order11 = productRepository0.findOrderById((java.lang.Long) (-1L));
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
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(order11);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findByKeyword("hi!");
        boolean boolean9 = productRepository0.delete((java.lang.Long) 10L);
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
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList3 = productRepository0.findAll();
        java.util.List<org.example.Product> productList4 = productRepository0.findAll();
        org.example.Product product6 = productRepository0.findById((java.lang.Long) (-1L));
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
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNull(product6);
        org.junit.Assert.assertNull(product8);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList1 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList3 = productRepository0.findByKeyword("");
        boolean boolean5 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.util.List<org.example.Product> productList9 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList11 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        java.util.List<org.example.Order> orderList12 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList14 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Product> productList15 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList16 = productRepository0.findAll();
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(orderList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList15);
        org.junit.Assert.assertNotNull(productList16);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        boolean boolean9 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Order> orderList10 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList12 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        java.util.List<org.example.Order> orderList13 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList14 = productRepository0.findSortedByName();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(orderList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(orderList13);
        org.junit.Assert.assertNotNull(productList14);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        boolean boolean4 = productRepository0.delete((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        java.util.List<org.example.Product> productList8 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        org.example.Order order10 = productRepository0.findOrderById((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNull(order10);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        boolean boolean2 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList3 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList4 = productRepository0.findAll();
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.util.List<org.example.Product> productList9 = productRepository0.findByKeyword("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList9);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList9 = productRepository0.findByKeyword("");
        org.example.Product product11 = productRepository0.findById((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNull(product11);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        org.example.Product product7 = productRepository0.findById((java.lang.Long) 1L);
        java.util.List<org.example.Order> orderList8 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList9 = productRepository0.findAllOrders();
        java.lang.Class<?> wildcardClass10 = orderList9.getClass();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNull(product7);
        org.junit.Assert.assertNotNull(orderList8);
        org.junit.Assert.assertNotNull(orderList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        boolean boolean7 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList9 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList10 = productRepository0.findAll();
        org.example.Product product12 = productRepository0.findById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList13 = productRepository0.findSortedByName();
        java.lang.Class<?> wildcardClass14 = productList13.getClass();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNull(product12);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        java.util.List<org.example.Product> productList4 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        org.example.Product product6 = productRepository0.findById((java.lang.Long) (-1L));
        org.example.Product product8 = productRepository0.findById((java.lang.Long) 100L);
        org.example.Order order10 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Product product12 = productRepository0.findById((java.lang.Long) 1L);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNull(product6);
        org.junit.Assert.assertNull(product8);
        org.junit.Assert.assertNull(order10);
        org.junit.Assert.assertNull(product12);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        boolean boolean9 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Order> orderList10 = productRepository0.findAllOrders();
        org.example.Product product12 = productRepository0.findById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList13 = productRepository0.findSortedByName();
        org.example.Product product15 = productRepository0.findById((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(orderList10);
        org.junit.Assert.assertNull(product12);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNull(product15);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
        boolean boolean10 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList11 = productRepository0.findAll();
        org.example.Product product13 = productRepository0.findById((java.lang.Long) (-1L));
        java.util.List<org.example.Order> orderList14 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList16 = productRepository0.findByKeyword("hi!");
        boolean boolean18 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList20 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        org.example.Product product21 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product21);
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
        org.junit.Assert.assertNotNull(orderList14);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(productList20);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
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
        org.example.Product product21 = productRepository0.findById((java.lang.Long) 1L);
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
        org.junit.Assert.assertNull(product21);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        boolean boolean7 = productRepository0.delete((java.lang.Long) (-1L));
        boolean boolean9 = productRepository0.delete((java.lang.Long) 1L);
        org.example.Product product11 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList12 = productRepository0.findAllOrders();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(product11);
        org.junit.Assert.assertNotNull(orderList12);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        boolean boolean4 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList9 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        org.example.Order order11 = productRepository0.findOrderById((java.lang.Long) 1L);
        org.example.Order order13 = productRepository0.findOrderById((java.lang.Long) 0L);
        org.example.Order order14 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNull(order11);
        org.junit.Assert.assertNull(order13);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
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
        java.util.List<org.example.Product> productList19 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList20 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList22 = productRepository0.findByKeyword("hi!");
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
        org.junit.Assert.assertNotNull(productList19);
        org.junit.Assert.assertNotNull(productList20);
        org.junit.Assert.assertNotNull(productList22);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        java.util.List<org.example.Product> productList4 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        org.example.Product product6 = productRepository0.findById((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        java.lang.Class<?> wildcardClass8 = productRepository0.getClass();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNull(product6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        boolean boolean9 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList10 = productRepository0.findAll();
        java.util.List<org.example.Order> orderList11 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList12 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList13 = productRepository0.findAll();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(orderList11);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList13);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList8 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList10 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Product> productList12 = productRepository0.findByKeyword("");
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
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(orderList7);
        org.junit.Assert.assertNotNull(orderList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList3 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList4 = productRepository0.findAllOrders();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNotNull(orderList4);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
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
        java.util.List<org.example.Product> productList13 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList15 = productRepository0.findByKeyword("hi!");
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNull(product7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(orderList9);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNotNull(productList15);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
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
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
        org.example.Product product10 = productRepository0.findById((java.lang.Long) 10L);
        boolean boolean12 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList13 = productRepository0.findAll();
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
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNull(product10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(productList13);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Order order9 = productRepository0.findOrderById((java.lang.Long) 1L);
        org.example.Product product11 = productRepository0.findById((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList12 = productRepository0.findSortedByName();
        org.example.Product product14 = productRepository0.findById((java.lang.Long) 10L);
        boolean boolean16 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList18 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(order9);
        org.junit.Assert.assertNull(product11);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNull(product14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(productList18);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("hi!");
        org.example.Product product8 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList9 = productRepository0.findAll();
        java.util.List<org.example.Product> productList11 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Product> productList12 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList13 = productRepository0.findAllOrders();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(product8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(orderList13);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList2 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        org.example.Product product5 = productRepository0.findById((java.lang.Long) 0L);
        boolean boolean7 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList9 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.util.List<org.example.Product> productList11 = productRepository0.findByKeyword("hi!");
        org.example.Product product13 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList15 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        org.example.Product product17 = productRepository0.findById((java.lang.Long) 1L);
        org.example.Product product18 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product18);
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
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNull(product13);
        org.junit.Assert.assertNotNull(productList15);
        org.junit.Assert.assertNull(product17);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList4 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Product> productList8 = productRepository0.findSortedByName();
        org.example.Order order10 = productRepository0.findOrderById((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList12 = productRepository0.findByKeyword("hi!");
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNull(order10);
        org.junit.Assert.assertNotNull(productList12);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Order order9 = productRepository0.findOrderById((java.lang.Long) 1L);
        org.example.Product product11 = productRepository0.findById((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList12 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList13 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList15 = productRepository0.findByKeyword("");
        boolean boolean17 = productRepository0.delete((java.lang.Long) 0L);
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
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(order9);
        org.junit.Assert.assertNull(product11);
        org.junit.Assert.assertNotNull(orderList12);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNotNull(productList15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("hi!");
        org.example.Product product8 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList9 = productRepository0.findAll();
        java.util.List<org.example.Product> productList11 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList13 = productRepository0.findByKeyword("hi!");
        org.example.Product product15 = productRepository0.findById((java.lang.Long) 100L);
        boolean boolean17 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Order> orderList18 = productRepository0.findAllOrders();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(product8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNull(product15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(orderList18);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList8 = productRepository0.findAllOrders();
        org.example.Product product10 = productRepository0.findById((java.lang.Long) 1L);
        org.example.Order order12 = productRepository0.findOrderById((java.lang.Long) (-1L));
        org.example.Product product14 = productRepository0.findById((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList16 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.lang.Class<?> wildcardClass17 = productList16.getClass();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(orderList7);
        org.junit.Assert.assertNotNull(orderList8);
        org.junit.Assert.assertNull(product10);
        org.junit.Assert.assertNull(order12);
        org.junit.Assert.assertNull(product14);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
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
        java.util.List<org.example.Product> productList17 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.lang.Class<?> wildcardClass18 = productList17.getClass();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(order8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(order12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(productList15);
        org.junit.Assert.assertNotNull(productList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        org.example.Order order8 = productRepository0.findOrderById((java.lang.Long) 100L);
        org.example.Product product10 = productRepository0.findById((java.lang.Long) 1L);
        org.example.Order order12 = productRepository0.findOrderById((java.lang.Long) (-1L));
        org.example.Product product14 = productRepository0.findById((java.lang.Long) (-1L));
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(order8);
        org.junit.Assert.assertNull(product10);
        org.junit.Assert.assertNull(order12);
        org.junit.Assert.assertNull(product14);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Product product9 = productRepository0.findById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList10 = productRepository0.findSortedByName();
        org.example.Product product12 = productRepository0.findById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList13 = productRepository0.findAll();
        java.util.List<org.example.Product> productList14 = productRepository0.findAll();
        java.util.List<org.example.Product> productList16 = productRepository0.findByKeyword("");
        org.example.Order order17 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order17);
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
        org.junit.Assert.assertNull(product12);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList16);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Product product6 = productRepository0.findById((java.lang.Long) 1L);
        boolean boolean8 = productRepository0.delete((java.lang.Long) 0L);
        org.example.Order order10 = productRepository0.findOrderById((java.lang.Long) 0L);
        org.example.Order order12 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList13 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList14 = productRepository0.findAll();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(product6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(order10);
        org.junit.Assert.assertNull(order12);
        org.junit.Assert.assertNotNull(orderList13);
        org.junit.Assert.assertNotNull(productList14);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        boolean boolean9 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList10 = productRepository0.findAll();
        java.util.List<org.example.Product> productList11 = productRepository0.findAll();
        java.util.List<org.example.Product> productList13 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList14 = productRepository0.findAll();
        java.util.List<org.example.Product> productList15 = productRepository0.findAll();
        java.util.List<org.example.Product> productList17 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList15);
        org.junit.Assert.assertNotNull(productList17);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList1 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList3 = productRepository0.findByKeyword("");
        boolean boolean5 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.util.List<org.example.Product> productList9 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList11 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        java.util.List<org.example.Order> orderList12 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList13 = productRepository0.findAll();
        java.lang.Class<?> wildcardClass14 = productRepository0.getClass();
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(orderList12);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList1 = productRepository0.findSortedByName();
        boolean boolean3 = productRepository0.delete((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        org.example.Product product7 = productRepository0.findById((java.lang.Long) 1L);
        java.util.List<org.example.Order> orderList8 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList10 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Product> productList12 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNull(product7);
        org.junit.Assert.assertNotNull(orderList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("hi!");
        org.example.Product product8 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList9 = productRepository0.findAll();
        java.util.List<org.example.Product> productList11 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
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
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Product product6 = productRepository0.findById((java.lang.Long) 1L);
        boolean boolean8 = productRepository0.delete((java.lang.Long) 0L);
        org.example.Order order10 = productRepository0.findOrderById((java.lang.Long) 0L);
        org.example.Order order12 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList13 = productRepository0.findAllOrders();
        java.lang.Class<?> wildcardClass14 = orderList13.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(product6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(order10);
        org.junit.Assert.assertNull(order12);
        org.junit.Assert.assertNotNull(orderList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        boolean boolean8 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        java.util.List<org.example.Product> productList12 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList13 = productRepository0.findSortedByName();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList13);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findByKeyword("hi!");
        org.example.Order order9 = productRepository0.findOrderById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList11 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        java.util.List<org.example.Order> orderList12 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList13 = productRepository0.findAllOrders();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(order9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(orderList12);
        org.junit.Assert.assertNotNull(orderList13);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList1 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList3 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Product> productList5 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNotNull(productList5);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        org.example.Product product7 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList8 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList9 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList10 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList11 = productRepository0.findAllOrders();
        java.lang.Class<?> wildcardClass12 = orderList11.getClass();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNull(product7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(orderList9);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(orderList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        org.example.Product product8 = productRepository0.findById((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Product> productList11 = productRepository0.findSortedByName();
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
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(product8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList13);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList8 = productRepository0.findAll();
        java.util.List<org.example.Order> orderList9 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList10 = productRepository0.findAllOrders();
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
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(orderList9);
        org.junit.Assert.assertNotNull(orderList10);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        boolean boolean7 = productRepository0.delete((java.lang.Long) (-1L));
        boolean boolean9 = productRepository0.delete((java.lang.Long) 1L);
        java.util.List<org.example.Order> orderList10 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList11 = productRepository0.findSortedByName();
        boolean boolean13 = productRepository0.delete((java.lang.Long) 1L);
        java.util.List<org.example.Order> orderList14 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList16 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(orderList10);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(orderList14);
        org.junit.Assert.assertNotNull(productList16);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        org.example.Product product8 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order10 = productRepository0.findOrderById((java.lang.Long) 1L);
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
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        org.example.Order order8 = productRepository0.findOrderById((java.lang.Long) 100L);
        boolean boolean10 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList12 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(order8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(productList12);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        org.example.Product product7 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList8 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        java.util.List<org.example.Product> productList11 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList12 = productRepository0.findAllOrders();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNull(product7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(orderList12);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        boolean boolean4 = productRepository0.delete((java.lang.Long) 1L);
        org.example.Product product6 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(product6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList5 = productRepository0.findByKeyword("");
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
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList7);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
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
        java.util.List<org.example.Product> productList13 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        java.util.List<org.example.Order> orderList14 = productRepository0.findAllOrders();
        org.example.Product product16 = productRepository0.findById((java.lang.Long) 1L);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNull(product7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(orderList9);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNotNull(orderList14);
        org.junit.Assert.assertNull(product16);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        org.example.Order order8 = productRepository0.findOrderById((java.lang.Long) 100L);
        boolean boolean10 = productRepository0.delete((java.lang.Long) 0L);
        org.example.Order order12 = productRepository0.findOrderById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList14 = productRepository0.findByKeyword("hi!");
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
        org.junit.Assert.assertNotNull(productList14);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList2 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        org.example.Product product5 = productRepository0.findById((java.lang.Long) 0L);
        boolean boolean7 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList8 = productRepository0.findAll();
        org.example.Order order10 = productRepository0.findOrderById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList11 = productRepository0.findSortedByName();
        boolean boolean13 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList14 = productRepository0.findAll();
        boolean boolean16 = productRepository0.delete((java.lang.Long) (-1L));
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(orderList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNull(product5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNull(order10);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList8 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.util.List<org.example.Product> productList10 = productRepository0.findByKeyword("");
        org.example.Order order12 = productRepository0.findOrderById((java.lang.Long) 10L);
        boolean boolean14 = productRepository0.delete((java.lang.Long) 1L);
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
        org.junit.Assert.assertNull(order12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        org.example.Product product7 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList8 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList9 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList10 = productRepository0.findAll();
        java.util.List<org.example.Product> productList11 = productRepository0.findSortedByName();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNull(product7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList11);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
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
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(orderList7);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Product product9 = productRepository0.findById((java.lang.Long) 100L);
        org.example.Order order11 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList12 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList14 = productRepository0.findByKeyword("hi!");
        boolean boolean16 = productRepository0.delete((java.lang.Long) 0L);
        org.example.Order order17 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order17);
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
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        org.example.Order order9 = productRepository0.findOrderById((java.lang.Long) 1L);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(orderList7);
        org.junit.Assert.assertNull(order9);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        org.example.Product product7 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList8 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList9 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList10 = productRepository0.findSortedByName();
        org.example.Order order12 = productRepository0.findOrderById((java.lang.Long) 0L);
        boolean boolean14 = productRepository0.delete((java.lang.Long) 0L);
        java.lang.Class<?> wildcardClass15 = productRepository0.getClass();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNull(product7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNull(order12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        boolean boolean9 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList10 = productRepository0.findAll();
        java.util.List<org.example.Order> orderList11 = productRepository0.findAllOrders();
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
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(orderList11);
        org.junit.Assert.assertNotNull(productList12);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList5 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList6 = productRepository0.findSortedByName();
        org.example.Order order8 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(order8);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        org.example.Product product7 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList8 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList9 = productRepository0.findSortedByName();
        boolean boolean11 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList12 = productRepository0.findAll();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNull(product7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(productList12);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList7 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.util.List<org.example.Product> productList9 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        java.util.List<org.example.Product> productList10 = productRepository0.findSortedByName();
        org.example.Product product12 = productRepository0.findById((java.lang.Long) 100L);
        boolean boolean14 = productRepository0.delete((java.lang.Long) 10L);
        java.lang.Class<?> wildcardClass15 = productRepository0.getClass();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNull(product12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Product product9 = productRepository0.findById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList10 = productRepository0.findSortedByName();
        org.example.Product product12 = productRepository0.findById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList13 = productRepository0.findAll();
        java.util.List<org.example.Product> productList14 = productRepository0.findAll();
        org.example.Order order16 = productRepository0.findOrderById((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(product9);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNull(product12);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNull(order16);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList8 = productRepository0.findAll();
        java.util.List<org.example.Order> orderList9 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList10 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList11 = productRepository0.findAll();
        java.lang.Class<?> wildcardClass12 = productRepository0.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(orderList9);
        org.junit.Assert.assertNotNull(orderList10);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
        boolean boolean10 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList11 = productRepository0.findAll();
        boolean boolean13 = productRepository0.delete((java.lang.Long) 0L);
        org.example.Order order15 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(order15);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList1 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        java.util.List<org.example.Product> productList4 = productRepository0.findByKeyword("hi!");
        org.example.Order order5 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Product> productList3 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList4 = productRepository0.findSortedByName();
        boolean boolean6 = productRepository0.delete((java.lang.Long) 1L);
        org.example.Product product8 = productRepository0.findById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(product8);
        org.junit.Assert.assertNotNull(productList10);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Product product9 = productRepository0.findById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList10 = productRepository0.findSortedByName();
        org.example.Product product12 = productRepository0.findById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList13 = productRepository0.findAll();
        java.util.List<org.example.Product> productList14 = productRepository0.findAll();
        java.util.List<org.example.Product> productList16 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList18 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order20 = productRepository0.findOrderById((java.lang.Long) 0L);
        org.example.Product product21 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product21);
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
        org.junit.Assert.assertNull(product12);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertNotNull(productList18);
        org.junit.Assert.assertNull(order20);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        org.example.Product product7 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList8 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList9 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList10 = productRepository0.findAll();
        boolean boolean12 = productRepository0.delete((java.lang.Long) 1L);
        org.example.Product product14 = productRepository0.findById((java.lang.Long) 1L);
        org.example.Order order16 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Order order18 = productRepository0.findOrderById((java.lang.Long) (-1L));
        org.example.Product product19 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product19);
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
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(product14);
        org.junit.Assert.assertNull(order16);
        org.junit.Assert.assertNull(order18);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList8 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        boolean boolean10 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList11 = productRepository0.findSortedByName();
        org.example.Order order13 = productRepository0.findOrderById((java.lang.Long) 10L);
        boolean boolean15 = productRepository0.delete((java.lang.Long) 1L);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNull(order13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList6 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList8 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(orderList7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList7 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.util.List<org.example.Product> productList9 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        boolean boolean11 = productRepository0.delete((java.lang.Long) 1L);
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
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList4 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Product> productList8 = productRepository0.findSortedByName();
        org.example.Order order10 = productRepository0.findOrderById((java.lang.Long) (-1L));
        org.example.Product product12 = productRepository0.findById((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNull(order10);
        org.junit.Assert.assertNull(product12);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        org.example.Order order8 = productRepository0.findOrderById((java.lang.Long) 100L);
        boolean boolean10 = productRepository0.delete((java.lang.Long) 0L);
        org.example.Order order12 = productRepository0.findOrderById((java.lang.Long) 1L);
        boolean boolean14 = productRepository0.delete((java.lang.Long) (-1L));
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
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        org.example.Product product7 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList8 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
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
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNull(product7);
        org.junit.Assert.assertNotNull(orderList8);
        org.junit.Assert.assertNotNull(productList10);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        org.example.Product product9 = productRepository0.findById((java.lang.Long) 1L);
        org.example.Order order11 = productRepository0.findOrderById((java.lang.Long) (-1L));
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
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(orderList7);
        org.junit.Assert.assertNull(product9);
        org.junit.Assert.assertNull(order11);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Product product9 = productRepository0.findById((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList11 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Product> productList13 = productRepository0.findByKeyword("");
        java.util.List<org.example.Order> orderList14 = productRepository0.findAllOrders();
        org.example.Product product16 = productRepository0.findById((java.lang.Long) (-1L));
        boolean boolean18 = productRepository0.delete((java.lang.Long) (-1L));
        org.example.Product product20 = productRepository0.findById((java.lang.Long) 1L);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(product9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNotNull(orderList14);
        org.junit.Assert.assertNull(product16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(product20);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList5 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList6 = productRepository0.findSortedByName();
        org.example.Product product8 = productRepository0.findById((java.lang.Long) 1L);
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
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(product8);
        org.junit.Assert.assertNotNull(orderList9);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList1 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList3 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList5 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.util.List<org.example.Product> productList7 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Product> productList8 = productRepository0.findSortedByName();
        org.example.Product product9 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList8);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        boolean boolean2 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList3 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList4 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNotNull(orderList4);
        org.junit.Assert.assertNotNull(productList6);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList8 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList9 = productRepository0.findAllOrders();
        org.example.Product product11 = productRepository0.findById((java.lang.Long) 1L);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(orderList8);
        org.junit.Assert.assertNotNull(orderList9);
        org.junit.Assert.assertNull(product11);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        org.example.Product product8 = productRepository0.findById((java.lang.Long) (-1L));
        org.example.Product product10 = productRepository0.findById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList12 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
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
        org.junit.Assert.assertNull(product8);
        org.junit.Assert.assertNull(product10);
        org.junit.Assert.assertNotNull(productList12);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        org.example.Order order8 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList10 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Product> productList12 = productRepository0.findByKeyword("hi!");
        org.example.Product product14 = productRepository0.findById((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList15 = productRepository0.findAll();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(order8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNull(product14);
        org.junit.Assert.assertNotNull(productList15);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        boolean boolean9 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList11 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList12 = productRepository0.findSortedByName();
        boolean boolean14 = productRepository0.delete((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList15 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList17 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Product> productList19 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        org.example.Order order21 = productRepository0.findOrderById((java.lang.Long) 1L);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(productList15);
        org.junit.Assert.assertNotNull(productList17);
        org.junit.Assert.assertNotNull(productList19);
        org.junit.Assert.assertNull(order21);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        org.example.Product product8 = productRepository0.findById((java.lang.Long) (-1L));
        org.example.Order order10 = productRepository0.findOrderById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList12 = productRepository0.findByKeyword("hi!");
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(product8);
        org.junit.Assert.assertNull(order10);
        org.junit.Assert.assertNotNull(productList12);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        boolean boolean7 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList9 = productRepository0.findByKeyword("");
        org.example.Order order11 = productRepository0.findOrderById((java.lang.Long) 1L);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNull(order11);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        boolean boolean9 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList10 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList12 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Product> productList13 = productRepository0.findSortedByName();
        org.example.Product product14 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product14);
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
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList13);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList8 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        org.example.Order order10 = productRepository0.findOrderById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList12 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList14 = productRepository0.findByKeyword("");
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNull(order10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Product product9 = productRepository0.findById((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList11 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Product> productList13 = productRepository0.findByKeyword("");
        java.util.List<org.example.Order> orderList14 = productRepository0.findAllOrders();
        org.example.Product product16 = productRepository0.findById((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList17 = productRepository0.findSortedByName();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(product9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNotNull(orderList14);
        org.junit.Assert.assertNull(product16);
        org.junit.Assert.assertNotNull(productList17);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        boolean boolean7 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList9 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList10 = productRepository0.findAll();
        java.util.List<org.example.Product> productList12 = productRepository0.findByKeyword("hi!");
        org.example.Product product14 = productRepository0.findById((java.lang.Long) 100L);
        org.example.Order order16 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList17 = productRepository0.findAllOrders();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNull(product14);
        org.junit.Assert.assertNull(order16);
        org.junit.Assert.assertNotNull(orderList17);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList1 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList3 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList5 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.util.List<org.example.Product> productList7 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Product> productList8 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        boolean boolean4 = productRepository0.delete((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        boolean boolean9 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList11 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        org.example.Order order13 = productRepository0.findOrderById((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNull(order13);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
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
        boolean boolean16 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList17 = productRepository0.findAllOrders();
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(orderList17);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Product product9 = productRepository0.findById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList10 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList11 = productRepository0.findAll();
        java.util.List<org.example.Product> productList13 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Product> productList14 = productRepository0.findSortedByName();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(product9);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList15);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList1 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        java.util.List<org.example.Product> productList4 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        org.example.Product product6 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product6);
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
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Product product6 = productRepository0.findById((java.lang.Long) 1L);
        boolean boolean8 = productRepository0.delete((java.lang.Long) 0L);
        org.example.Order order10 = productRepository0.findOrderById((java.lang.Long) 0L);
        org.example.Order order12 = productRepository0.findOrderById((java.lang.Long) 100L);
        org.example.Order order14 = productRepository0.findOrderById((java.lang.Long) (-1L));
        org.example.Product product16 = productRepository0.findById((java.lang.Long) (-1L));
        java.util.List<org.example.Order> orderList17 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList18 = productRepository0.findAllOrders();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(product6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(order10);
        org.junit.Assert.assertNull(order12);
        org.junit.Assert.assertNull(order14);
        org.junit.Assert.assertNull(product16);
        org.junit.Assert.assertNotNull(orderList17);
        org.junit.Assert.assertNotNull(orderList18);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        boolean boolean3 = productRepository0.delete((java.lang.Long) 0L);
        org.example.Product product4 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Product product9 = productRepository0.findById((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList11 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        boolean boolean13 = productRepository0.delete((java.lang.Long) 0L);
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList8 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order12 = productRepository0.findOrderById((java.lang.Long) 100L);
        org.example.Order order14 = productRepository0.findOrderById((java.lang.Long) 1L);
        org.example.Order order16 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList18 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(orderList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNull(order12);
        org.junit.Assert.assertNull(order14);
        org.junit.Assert.assertNull(order16);
        org.junit.Assert.assertNotNull(productList18);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
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
        boolean boolean22 = productRepository0.delete((java.lang.Long) (-1L));
        org.example.Product product24 = productRepository0.findById((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList25 = productRepository0.findSortedByName();
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
        org.junit.Assert.assertNull(product24);
        org.junit.Assert.assertNotNull(productList25);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList8 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        org.example.Order order10 = productRepository0.findOrderById((java.lang.Long) 100L);
        org.example.Product product12 = productRepository0.findById((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNull(order10);
        org.junit.Assert.assertNull(product12);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        org.example.Product product7 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList8 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList9 = productRepository0.findSortedByName();
        boolean boolean11 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList12 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList13 = productRepository0.findSortedByName();
        org.example.Product product15 = productRepository0.findById((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNull(product7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(orderList12);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNull(product15);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        org.example.Order order7 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList9 = productRepository0.findByKeyword("hi!");
        org.example.Product product11 = productRepository0.findById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList12 = productRepository0.findAll();
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
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNull(order7);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNull(product11);
        org.junit.Assert.assertNotNull(productList12);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Product> productList3 = productRepository0.findSortedByName();
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
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNotNull(productList4);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        boolean boolean4 = productRepository0.delete((java.lang.Long) 0L);
        boolean boolean6 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(productList8);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        boolean boolean9 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList11 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Product> productList13 = productRepository0.findByKeyword("");
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(orderList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList13);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
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
        org.junit.Assert.assertNull(order9);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(orderList13);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList4 = productRepository0.findAll();
        boolean boolean6 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList8 = productRepository0.findAll();
        org.example.Product product10 = productRepository0.findById((java.lang.Long) 100L);
        boolean boolean12 = productRepository0.delete((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNull(product10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList10 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList12 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList14 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList15 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList16 = productRepository0.findAll();
        java.util.List<org.example.Order> orderList17 = productRepository0.findAllOrders();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(orderList15);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertNotNull(orderList17);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList5 = productRepository0.findByKeyword("");
        org.example.Order order7 = productRepository0.findOrderById((java.lang.Long) 0L);
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
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNull(order7);
        org.junit.Assert.assertNotNull(orderList8);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        boolean boolean9 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList11 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList13 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList15 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        org.example.Product product16 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product16);
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
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNotNull(productList15);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList8 = productRepository0.findAll();
        org.example.Product product10 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList11 = productRepository0.findAll();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNull(product10);
        org.junit.Assert.assertNotNull(productList11);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        boolean boolean7 = productRepository0.delete((java.lang.Long) (-1L));
        boolean boolean9 = productRepository0.delete((java.lang.Long) 1L);
        java.util.List<org.example.Order> orderList10 = productRepository0.findAllOrders();
        org.example.Product product12 = productRepository0.findById((java.lang.Long) 1L);
        java.util.List<org.example.Order> orderList13 = productRepository0.findAllOrders();
        org.example.Product product15 = productRepository0.findById((java.lang.Long) (-1L));
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
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(orderList10);
        org.junit.Assert.assertNull(product12);
        org.junit.Assert.assertNotNull(orderList13);
        org.junit.Assert.assertNull(product15);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList10 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList12 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList14 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList15 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList16 = productRepository0.findAll();
        java.util.List<org.example.Product> productList17 = productRepository0.findAll();
        java.lang.Class<?> wildcardClass18 = productList17.getClass();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(orderList15);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertNotNull(productList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findByKeyword("hi!");
        org.example.Order order9 = productRepository0.findOrderById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList11 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        java.util.List<org.example.Product> productList12 = productRepository0.findSortedByName();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(order9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList12);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList2 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        org.example.Product product5 = productRepository0.findById((java.lang.Long) 0L);
        boolean boolean7 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList9 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.util.List<org.example.Product> productList11 = productRepository0.findByKeyword("hi!");
        org.example.Product product13 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList15 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        org.example.Product product17 = productRepository0.findById((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(orderList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNull(product5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNull(product13);
        org.junit.Assert.assertNotNull(productList15);
        org.junit.Assert.assertNull(product17);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        boolean boolean2 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList3 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList4 = productRepository0.findAll();
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        java.util.List<org.example.Product> productList8 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList12 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Product> productList13 = productRepository0.findSortedByName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList13);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        boolean boolean9 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList11 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order13 = productRepository0.findOrderById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList15 = productRepository0.findByKeyword("");
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(orderList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNull(order13);
        org.junit.Assert.assertNotNull(productList15);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        boolean boolean6 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Product> productList9 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList11 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList13 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Product> productList15 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNotNull(productList15);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList2 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList3 = productRepository0.findAll();
        java.util.List<org.example.Product> productList4 = productRepository0.findSortedByName();
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
        org.junit.Assert.assertNotNull(orderList2);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        boolean boolean2 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList3 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList4 = productRepository0.findSortedByName();
        boolean boolean6 = productRepository0.delete((java.lang.Long) (-1L));
        org.example.Product product8 = productRepository0.findById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        org.example.Order order11 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(product8);
        org.junit.Assert.assertNotNull(productList10);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        java.util.List<org.example.Product> productList9 = productRepository0.findByKeyword("hi!");
        org.example.Order order11 = productRepository0.findOrderById((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNull(order11);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
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
        java.util.List<org.example.Product> productList13 = productRepository0.findByKeyword("");
        org.example.Order order15 = productRepository0.findOrderById((java.lang.Long) 10L);
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
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNull(product7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(orderList9);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNull(order15);
        org.junit.Assert.assertNotNull(orderList16);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findByKeyword("hi!");
        org.example.Order order9 = productRepository0.findOrderById((java.lang.Long) 0L);
        org.example.Product product11 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList12 = productRepository0.findSortedByName();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(order9);
        org.junit.Assert.assertNull(product11);
        org.junit.Assert.assertNotNull(productList12);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList4 = productRepository0.findAll();
        java.util.List<org.example.Product> productList5 = productRepository0.findAll();
        java.util.List<org.example.Product> productList7 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        java.lang.Class<?> wildcardClass8 = productRepository0.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList8 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        org.example.Order order10 = productRepository0.findOrderById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList12 = productRepository0.findByKeyword("");
        java.util.List<org.example.Order> orderList13 = productRepository0.findAllOrders();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNull(order10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(orderList13);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        boolean boolean9 = productRepository0.delete((java.lang.Long) 0L);
        org.example.Product product11 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList12 = productRepository0.findAll();
        boolean boolean14 = productRepository0.delete((java.lang.Long) (-1L));
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(orderList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(product11);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
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
        java.util.List<org.example.Order> orderList14 = productRepository0.findAllOrders();
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
        org.junit.Assert.assertNotNull(orderList14);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList2 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList7 = productRepository0.findByKeyword("");
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(orderList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(productList7);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        org.example.Order order8 = productRepository0.findOrderById((java.lang.Long) 100L);
        boolean boolean10 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList12 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
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
        org.junit.Assert.assertNotNull(productList12);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        boolean boolean2 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList3 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList4 = productRepository0.findAll();
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        boolean boolean8 = productRepository0.delete((java.lang.Long) (-1L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Product product6 = productRepository0.findById((java.lang.Long) 1L);
        boolean boolean8 = productRepository0.delete((java.lang.Long) 0L);
        org.example.Order order10 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList12 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList13 = productRepository0.findAll();
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
        org.junit.Assert.assertNull(product6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(order10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList13);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
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
        org.example.Order order20 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order20);
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
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList8 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList9 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList10 = productRepository0.findAllOrders();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(orderList7);
        org.junit.Assert.assertNotNull(orderList8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(orderList10);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
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
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNull(product7);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
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
        java.util.List<org.example.Product> productList17 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.util.List<org.example.Product> productList19 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList21 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList15);
        org.junit.Assert.assertNotNull(productList17);
        org.junit.Assert.assertNotNull(productList19);
        org.junit.Assert.assertNotNull(productList21);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
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
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(productList7);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Product product6 = productRepository0.findById((java.lang.Long) 1L);
        org.example.Order order8 = productRepository0.findOrderById((java.lang.Long) 0L);
        org.example.Product product10 = productRepository0.findById((java.lang.Long) (-1L));
        java.util.List<org.example.Order> orderList11 = productRepository0.findAllOrders();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(product6);
        org.junit.Assert.assertNull(order8);
        org.junit.Assert.assertNull(product10);
        org.junit.Assert.assertNotNull(orderList11);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        boolean boolean8 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList9 = productRepository0.findAll();
        org.example.Product product11 = productRepository0.findById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList13 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
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
        org.junit.Assert.assertNull(product11);
        org.junit.Assert.assertNotNull(productList13);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList2 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        org.example.Product product5 = productRepository0.findById((java.lang.Long) 0L);
        boolean boolean7 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList8 = productRepository0.findAll();
        org.example.Order order10 = productRepository0.findOrderById((java.lang.Long) 0L);
        org.example.Product product12 = productRepository0.findById((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(orderList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNull(product5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNull(order10);
        org.junit.Assert.assertNull(product12);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("hi!");
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
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(orderList7);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findByKeyword("hi!");
        boolean boolean9 = productRepository0.delete((java.lang.Long) 10L);
        org.example.Product product11 = productRepository0.findById((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(product11);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList9 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        boolean boolean11 = productRepository0.delete((java.lang.Long) 1L);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList10 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList12 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList14 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList15 = productRepository0.findAllOrders();
        boolean boolean17 = productRepository0.delete((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(orderList15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        boolean boolean7 = productRepository0.delete((java.lang.Long) (-1L));
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
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(productList8);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList10 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList11 = productRepository0.findAll();
        java.util.List<org.example.Product> productList13 = productRepository0.findByKeyword("hi!");
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList13);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        boolean boolean9 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList11 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList12 = productRepository0.findAll();
        org.example.Order order14 = productRepository0.findOrderById((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNull(order14);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
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
        java.util.List<org.example.Product> productList17 = productRepository0.findSortedByName();
        org.example.Product product18 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product18);
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
        org.junit.Assert.assertNotNull(orderList16);
        org.junit.Assert.assertNotNull(productList17);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("hi!");
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
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(productList8);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList2 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        org.example.Product product5 = productRepository0.findById((java.lang.Long) 0L);
        boolean boolean7 = productRepository0.delete((java.lang.Long) 100L);
        boolean boolean9 = productRepository0.delete((java.lang.Long) (-1L));
        org.example.Product product11 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList12 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList14 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(orderList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNull(product5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(product11);
        org.junit.Assert.assertNotNull(orderList12);
        org.junit.Assert.assertNotNull(productList14);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("hi!");
        org.example.Product product8 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        java.util.List<org.example.Product> productList11 = productRepository0.findAll();
        org.example.Order order13 = productRepository0.findOrderById((java.lang.Long) 0L);
        boolean boolean15 = productRepository0.delete((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(product8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNull(order13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
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
        org.example.Order order19 = productRepository0.findOrderById((java.lang.Long) 100L);
        org.example.Product product21 = productRepository0.findById((java.lang.Long) 10L);
        org.example.Product product23 = productRepository0.findById((java.lang.Long) 100L);
        boolean boolean25 = productRepository0.delete((java.lang.Long) 100L);
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
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNull(order16);
        org.junit.Assert.assertNotNull(orderList17);
        org.junit.Assert.assertNull(order19);
        org.junit.Assert.assertNull(product21);
        org.junit.Assert.assertNull(product23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        org.example.Order order8 = productRepository0.findOrderById((java.lang.Long) 100L);
        org.example.Product product10 = productRepository0.findById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList12 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        org.example.Product product14 = productRepository0.findById((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(order8);
        org.junit.Assert.assertNull(product10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNull(product14);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        boolean boolean9 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList11 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order13 = productRepository0.findOrderById((java.lang.Long) 0L);
        org.example.Order order15 = productRepository0.findOrderById((java.lang.Long) 1L);
        org.example.Product product17 = productRepository0.findById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList19 = productRepository0.findByKeyword("hi!");
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(orderList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNull(order13);
        org.junit.Assert.assertNull(order15);
        org.junit.Assert.assertNull(product17);
        org.junit.Assert.assertNotNull(productList19);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        boolean boolean4 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList7 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Product> productList9 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Product> productList10 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList11 = productRepository0.findSortedByName();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList11);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        org.example.Product product7 = productRepository0.findById((java.lang.Long) (-1L));
        java.util.List<org.example.Order> orderList8 = productRepository0.findAllOrders();
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
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNull(product7);
        org.junit.Assert.assertNotNull(orderList8);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("hi!");
        org.example.Product product8 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        org.example.Product product12 = productRepository0.findById((java.lang.Long) (-1L));
        org.example.Order order14 = productRepository0.findOrderById((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(product8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNull(product12);
        org.junit.Assert.assertNull(order14);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        boolean boolean9 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList11 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
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
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(orderList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(productList11);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList8 = productRepository0.findAllOrders();
        org.example.Product product10 = productRepository0.findById((java.lang.Long) 1L);
        org.example.Order order12 = productRepository0.findOrderById((java.lang.Long) (-1L));
        org.example.Product product14 = productRepository0.findById((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList16 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
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
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(orderList7);
        org.junit.Assert.assertNotNull(orderList8);
        org.junit.Assert.assertNull(product10);
        org.junit.Assert.assertNull(order12);
        org.junit.Assert.assertNull(product14);
        org.junit.Assert.assertNotNull(productList16);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Product product6 = productRepository0.findById((java.lang.Long) 1L);
        boolean boolean8 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList10 = productRepository0.findByKeyword("hi!");
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
        org.junit.Assert.assertNull(product6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(productList10);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Product product6 = productRepository0.findById((java.lang.Long) 1L);
        boolean boolean8 = productRepository0.delete((java.lang.Long) 0L);
        org.example.Order order10 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList11 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList13 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
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
        org.junit.Assert.assertNull(product6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(order10);
        org.junit.Assert.assertNotNull(orderList11);
        org.junit.Assert.assertNotNull(productList13);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList1 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList3 = productRepository0.findByKeyword("");
        boolean boolean5 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findByKeyword("");
        org.example.Product product9 = productRepository0.findById((java.lang.Long) (-1L));
        java.util.List<org.example.Order> orderList10 = productRepository0.findAllOrders();
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(product9);
        org.junit.Assert.assertNotNull(orderList10);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        org.example.Order order8 = productRepository0.findOrderById((java.lang.Long) 100L);
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
        org.junit.Assert.assertNull(order8);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList5 = productRepository0.findByKeyword("");
        boolean boolean7 = productRepository0.delete((java.lang.Long) 10L);
        org.example.Order order9 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList10 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList11 = productRepository0.findAllOrders();
        boolean boolean13 = productRepository0.delete((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(order9);
        org.junit.Assert.assertNotNull(orderList10);
        org.junit.Assert.assertNotNull(orderList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        boolean boolean8 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList9 = productRepository0.findAll();
        java.util.List<org.example.Product> productList11 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        org.example.Order order13 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList14 = productRepository0.findSortedByName();
        org.example.Product product16 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList17 = productRepository0.findAllOrders();
        org.example.Order order19 = productRepository0.findOrderById((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNull(order13);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNull(product16);
        org.junit.Assert.assertNotNull(orderList17);
        org.junit.Assert.assertNull(order19);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
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
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(product6);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Order order9 = productRepository0.findOrderById((java.lang.Long) 1L);
        java.util.List<org.example.Order> orderList10 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList11 = productRepository0.findAll();
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
        org.junit.Assert.assertNotNull(orderList10);
        org.junit.Assert.assertNotNull(productList11);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        org.example.Product product7 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList8 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList9 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList10 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList11 = productRepository0.findSortedByName();
        org.example.Order order13 = productRepository0.findOrderById((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNull(product7);
        org.junit.Assert.assertNotNull(orderList8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNull(order13);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        java.util.List<org.example.Product> productList8 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList9 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList10 = productRepository0.findAll();
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
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(orderList9);
        org.junit.Assert.assertNotNull(productList10);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        boolean boolean4 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Product product9 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList11 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Product> productList12 = productRepository0.findSortedByName();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(product9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList12);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Product product6 = productRepository0.findById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList8 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        java.util.List<org.example.Product> productList9 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList11 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        org.example.Product product13 = productRepository0.findById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList15 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        java.lang.Class<?> wildcardClass16 = productList15.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(product6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNull(product13);
        org.junit.Assert.assertNotNull(productList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList8 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList9 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList10 = productRepository0.findAll();
        org.example.Order order12 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList14 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(orderList7);
        org.junit.Assert.assertNotNull(orderList8);
        org.junit.Assert.assertNotNull(orderList9);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNull(order12);
        org.junit.Assert.assertNotNull(productList14);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList1 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList3 = productRepository0.findByKeyword("");
        boolean boolean5 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.util.List<org.example.Product> productList9 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList11 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        java.util.List<org.example.Order> orderList12 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList13 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList14 = productRepository0.findAll();
        boolean boolean16 = productRepository0.delete((java.lang.Long) 1L);
        org.example.Product product17 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product17);
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
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        boolean boolean4 = productRepository0.delete((java.lang.Long) 0L);
        org.example.Product product6 = productRepository0.findById((java.lang.Long) (-1L));
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(product6);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Product product6 = productRepository0.findById((java.lang.Long) 1L);
        boolean boolean8 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Product> productList11 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList12 = productRepository0.findSortedByName();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(product6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList12);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList1 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList3 = productRepository0.findByKeyword("");
        boolean boolean5 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList9 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Product product11 = productRepository0.findById((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNull(product11);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        boolean boolean4 = productRepository0.delete((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        boolean boolean9 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList10 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList12 = productRepository0.findByKeyword("");
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(orderList10);
        org.junit.Assert.assertNotNull(productList12);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        org.example.Order order8 = productRepository0.findOrderById((java.lang.Long) 100L);
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
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(order8);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        boolean boolean9 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList10 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList12 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Product> productList14 = productRepository0.findByKeyword("");
        org.example.Product product15 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product15);
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
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        org.example.Product product7 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList8 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList9 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList10 = productRepository0.findAll();
        boolean boolean12 = productRepository0.delete((java.lang.Long) 1L);
        org.example.Product product14 = productRepository0.findById((java.lang.Long) 1L);
        org.example.Order order16 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Order order18 = productRepository0.findOrderById((java.lang.Long) (-1L));
        org.example.Product product20 = productRepository0.findById((java.lang.Long) 1L);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNull(product7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(product14);
        org.junit.Assert.assertNull(order16);
        org.junit.Assert.assertNull(order18);
        org.junit.Assert.assertNull(product20);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        boolean boolean2 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList3 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList4 = productRepository0.findSortedByName();
        boolean boolean6 = productRepository0.delete((java.lang.Long) (-1L));
        org.example.Product product8 = productRepository0.findById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        org.example.Order order12 = productRepository0.findOrderById((java.lang.Long) 0L);
        org.example.Product product14 = productRepository0.findById((java.lang.Long) 1L);
        org.example.Product product15 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(product8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNull(order12);
        org.junit.Assert.assertNull(product14);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        boolean boolean3 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList4 = productRepository0.findAll();
        java.util.List<org.example.Product> productList5 = productRepository0.findAll();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList5);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        boolean boolean8 = productRepository0.delete((java.lang.Long) 100L);
        org.example.Order order10 = productRepository0.findOrderById((java.lang.Long) 10L);
        boolean boolean12 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Order> orderList13 = productRepository0.findAllOrders();
        java.lang.Class<?> wildcardClass14 = productRepository0.getClass();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(order10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(orderList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        boolean boolean8 = productRepository0.delete((java.lang.Long) 1L);
        org.example.Product product10 = productRepository0.findById((java.lang.Long) 1L);
        org.example.Order order12 = productRepository0.findOrderById((java.lang.Long) 0L);
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
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(product10);
        org.junit.Assert.assertNull(order12);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        boolean boolean2 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList4 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        org.example.Product product5 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(productList4);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        boolean boolean4 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList9 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        java.util.List<org.example.Product> productList11 = productRepository0.findByKeyword("hi!");
        org.example.Order order13 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList14 = productRepository0.findSortedByName();
        org.example.Order order16 = productRepository0.findOrderById((java.lang.Long) 0L);
        org.example.Order order17 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNull(order13);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNull(order16);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        boolean boolean2 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList3 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList4 = productRepository0.findSortedByName();
        boolean boolean6 = productRepository0.delete((java.lang.Long) (-1L));
        org.example.Product product8 = productRepository0.findById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList11 = productRepository0.findAll();
        org.example.Order order12 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(product8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList11);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        boolean boolean2 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList3 = productRepository0.findSortedByName();
        org.example.Product product5 = productRepository0.findById((java.lang.Long) 1L);
        org.example.Order order7 = productRepository0.findOrderById((java.lang.Long) (-1L));
        boolean boolean9 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList11 = productRepository0.findByKeyword("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNull(product5);
        org.junit.Assert.assertNull(order7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(productList11);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Product product6 = productRepository0.findById((java.lang.Long) 1L);
        boolean boolean8 = productRepository0.delete((java.lang.Long) 0L);
        org.example.Order order10 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList12 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList13 = productRepository0.findSortedByName();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(product6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(order10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList13);
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList8 = productRepository0.findAllOrders();
        org.example.Product product10 = productRepository0.findById((java.lang.Long) 1L);
        org.example.Order order12 = productRepository0.findOrderById((java.lang.Long) 100L);
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
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(orderList7);
        org.junit.Assert.assertNotNull(orderList8);
        org.junit.Assert.assertNull(product10);
        org.junit.Assert.assertNull(order12);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        boolean boolean2 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList4 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        org.example.Product product8 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(productList7);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("hi!");
        org.example.Product product8 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        java.util.List<org.example.Product> productList11 = productRepository0.findAll();
        org.example.Order order13 = productRepository0.findOrderById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList15 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Product> productList17 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.util.List<org.example.Product> productList18 = productRepository0.findAll();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(product8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNull(order13);
        org.junit.Assert.assertNotNull(productList15);
        org.junit.Assert.assertNotNull(productList17);
        org.junit.Assert.assertNotNull(productList18);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
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
        java.util.List<org.example.Product> productList17 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.util.List<org.example.Product> productList19 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        org.example.Order order21 = productRepository0.findOrderById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList22 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList23 = productRepository0.findAll();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList15);
        org.junit.Assert.assertNotNull(productList17);
        org.junit.Assert.assertNotNull(productList19);
        org.junit.Assert.assertNull(order21);
        org.junit.Assert.assertNotNull(orderList22);
        org.junit.Assert.assertNotNull(productList23);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList10 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList11 = productRepository0.findAll();
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
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList11);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
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
        java.util.List<org.example.Product> productList17 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.util.List<org.example.Product> productList19 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList21 = productRepository0.findByKeyword("");
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList15);
        org.junit.Assert.assertNotNull(productList17);
        org.junit.Assert.assertNotNull(productList19);
        org.junit.Assert.assertNotNull(productList21);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        boolean boolean2 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList4 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList7 = productRepository0.findByKeyword("");
        org.example.Product product9 = productRepository0.findById((java.lang.Long) (-1L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(product9);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Product product6 = productRepository0.findById((java.lang.Long) 1L);
        boolean boolean8 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        java.util.List<org.example.Product> productList11 = productRepository0.findAll();
        java.util.List<org.example.Product> productList12 = productRepository0.findAll();
        java.util.List<org.example.Product> productList13 = productRepository0.findSortedByName();
        java.lang.Class<?> wildcardClass14 = productList13.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(product6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
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
        boolean boolean15 = productRepository0.delete((java.lang.Long) 1L);
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
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(order9);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(orderList13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Product product6 = productRepository0.findById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList8 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        java.util.List<org.example.Product> productList9 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList11 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        org.example.Product product13 = productRepository0.findById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList15 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        org.example.Product product17 = productRepository0.findById((java.lang.Long) (-1L));
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(product6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNull(product13);
        org.junit.Assert.assertNotNull(productList15);
        org.junit.Assert.assertNull(product17);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Product product6 = productRepository0.findById((java.lang.Long) 1L);
        boolean boolean8 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        java.util.List<org.example.Product> productList11 = productRepository0.findAll();
        java.util.List<org.example.Product> productList12 = productRepository0.findSortedByName();
        boolean boolean14 = productRepository0.delete((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(product6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        boolean boolean2 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList3 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList4 = productRepository0.findSortedByName();
        org.example.Product product6 = productRepository0.findById((java.lang.Long) 10L);
        org.example.Order order8 = productRepository0.findOrderById((java.lang.Long) (-1L));
        boolean boolean10 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList12 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Product> productList13 = productRepository0.findSortedByName();
        org.example.Order order15 = productRepository0.findOrderById((java.lang.Long) 100L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNull(product6);
        org.junit.Assert.assertNull(order8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNull(order15);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Product> productList8 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList9 = productRepository0.findAll();
        java.util.List<org.example.Product> productList11 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Product> productList12 = productRepository0.findAll();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList12);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList4 = productRepository0.findAll();
        java.util.List<org.example.Product> productList5 = productRepository0.findAll();
        java.util.List<org.example.Product> productList6 = productRepository0.findSortedByName();
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
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList6);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("hi!");
        org.example.Order order10 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList12 = productRepository0.findByKeyword("hi!");
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNull(order10);
        org.junit.Assert.assertNotNull(productList12);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        org.example.Product product8 = productRepository0.findById((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList9 = productRepository0.findAll();
        org.example.Product product11 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList13 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
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
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(product8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNull(product11);
        org.junit.Assert.assertNotNull(productList13);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Order order9 = productRepository0.findOrderById((java.lang.Long) 1L);
        org.example.Product product11 = productRepository0.findById((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList12 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList13 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList14 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList15 = productRepository0.findAll();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(order9);
        org.junit.Assert.assertNull(product11);
        org.junit.Assert.assertNotNull(orderList12);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList15);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        org.example.Order order8 = productRepository0.findOrderById((java.lang.Long) 100L);
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
        org.junit.Assert.assertNull(order8);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        boolean boolean2 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList4 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(orderList7);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        boolean boolean7 = productRepository0.delete((java.lang.Long) (-1L));
        boolean boolean9 = productRepository0.delete((java.lang.Long) 1L);
        org.example.Product product11 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList12 = productRepository0.findAll();
        boolean boolean14 = productRepository0.delete((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(product11);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList2 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        org.example.Product product5 = productRepository0.findById((java.lang.Long) 0L);
        boolean boolean7 = productRepository0.delete((java.lang.Long) 100L);
        boolean boolean9 = productRepository0.delete((java.lang.Long) (-1L));
        org.example.Product product11 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList13 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Product> productList14 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList16 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        java.lang.Class<?> wildcardClass17 = productList16.getClass();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(orderList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNull(product5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(product11);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
        boolean boolean10 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList11 = productRepository0.findAll();
        org.example.Product product13 = productRepository0.findById((java.lang.Long) (-1L));
        java.util.List<org.example.Order> orderList14 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList16 = productRepository0.findByKeyword("hi!");
        boolean boolean18 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList20 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        org.example.Order order22 = productRepository0.findOrderById((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNull(product13);
        org.junit.Assert.assertNotNull(orderList14);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(productList20);
        org.junit.Assert.assertNull(order22);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList4 = productRepository0.findByKeyword("hi!");
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        org.example.Product product7 = productRepository0.findById((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList9 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Product> productList11 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList12 = productRepository0.findSortedByName();
        boolean boolean14 = productRepository0.delete((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNull(product7);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList4 = productRepository0.findAll();
        java.util.List<org.example.Product> productList5 = productRepository0.findAll();
        java.util.List<org.example.Product> productList6 = productRepository0.findAll();
        boolean boolean8 = productRepository0.delete((java.lang.Long) 100L);
        boolean boolean10 = productRepository0.delete((java.lang.Long) 10L);
        org.example.Order order12 = productRepository0.findOrderById((java.lang.Long) 1L);
        org.example.Product product14 = productRepository0.findById((java.lang.Long) 1L);
        org.example.Order order15 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order15);
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(order12);
        org.junit.Assert.assertNull(product14);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList1 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList3 = productRepository0.findByKeyword("");
        boolean boolean5 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.util.List<org.example.Product> productList9 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList11 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        java.util.List<org.example.Order> orderList12 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList13 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList15 = productRepository0.findByKeyword("");
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(orderList12);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNotNull(productList15);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList6 = productRepository0.findSortedByName();
        org.example.Order order8 = productRepository0.findOrderById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList9 = productRepository0.findAll();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(order8);
        org.junit.Assert.assertNotNull(productList9);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        boolean boolean4 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList8 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Product product12 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList13 = productRepository0.findAllOrders();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNull(product12);
        org.junit.Assert.assertNotNull(orderList13);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        boolean boolean7 = productRepository0.delete((java.lang.Long) (-1L));
        boolean boolean9 = productRepository0.delete((java.lang.Long) 1L);
        java.util.List<org.example.Order> orderList10 = productRepository0.findAllOrders();
        java.lang.Class<?> wildcardClass11 = orderList10.getClass();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(orderList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList6 = productRepository0.findSortedByName();
        org.example.Order order8 = productRepository0.findOrderById((java.lang.Long) 1L);
        org.example.Product product10 = productRepository0.findById((java.lang.Long) 10L);
        org.example.Order order12 = productRepository0.findOrderById((java.lang.Long) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = order12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(order8);
        org.junit.Assert.assertNull(product10);
        org.junit.Assert.assertNull(order12);
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
        org.example.Product product10 = productRepository0.findById((java.lang.Long) 1L);
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
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNull(product10);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 10L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 10L);
        boolean boolean8 = productRepository0.delete((java.lang.Long) (-1L));
        org.example.Product product10 = productRepository0.findById((java.lang.Long) (-1L));
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(product10);
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        boolean boolean2 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList3 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList4 = productRepository0.findAll();
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        java.util.List<org.example.Product> productList8 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        org.example.Order order12 = productRepository0.findOrderById((java.lang.Long) (-1L));
        org.example.Order order13 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNull(order12);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        org.example.Order order8 = productRepository0.findOrderById((java.lang.Long) 100L);
        org.example.Product product10 = productRepository0.findById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList12 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        java.util.List<org.example.Order> orderList13 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList14 = productRepository0.findSortedByName();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(order8);
        org.junit.Assert.assertNull(product10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(orderList13);
        org.junit.Assert.assertNotNull(productList14);
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
        boolean boolean10 = productRepository0.delete((java.lang.Long) 10L);
        boolean boolean12 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList13 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList14 = productRepository0.findAllOrders();
        boolean boolean16 = productRepository0.delete((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(orderList13);
        org.junit.Assert.assertNotNull(orderList14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Product product9 = productRepository0.findById((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList11 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Product> productList13 = productRepository0.findByKeyword("");
        java.util.List<org.example.Order> orderList14 = productRepository0.findAllOrders();
        org.example.Product product16 = productRepository0.findById((java.lang.Long) (-1L));
        boolean boolean18 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList19 = productRepository0.findAll();
        org.example.Order order20 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order20);
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
        org.junit.Assert.assertNotNull(orderList14);
        org.junit.Assert.assertNull(product16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(productList19);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Product product9 = productRepository0.findById((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList11 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Product> productList12 = productRepository0.findAll();
        boolean boolean14 = productRepository0.delete((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(product9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList4 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList7 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        java.util.List<org.example.Product> productList9 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        org.example.Product product11 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Product product12 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(orderList4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNull(product11);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Product product9 = productRepository0.findById((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList11 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Product> productList12 = productRepository0.findAll();
        java.util.List<org.example.Product> productList14 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        boolean boolean16 = productRepository0.delete((java.lang.Long) 1L);
        org.example.Product product18 = productRepository0.findById((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(product9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(product18);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
        org.example.Product product10 = productRepository0.findById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList11 = productRepository0.findAll();
        java.lang.Class<?> wildcardClass12 = productList11.getClass();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNull(product10);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList4 = productRepository0.findAllOrders();
        org.example.Product product6 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList8 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(orderList4);
        org.junit.Assert.assertNull(product6);
        org.junit.Assert.assertNotNull(orderList7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findAll();
        boolean boolean7 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList9 = productRepository0.findByKeyword("");
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
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(productList9);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        boolean boolean6 = productRepository0.delete((java.lang.Long) (-1L));
        org.example.Product product8 = productRepository0.findById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList9 = productRepository0.findSortedByName();
        java.lang.Class<?> wildcardClass10 = productRepository0.getClass();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(product8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
        org.example.Order order10 = productRepository0.findOrderById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList11 = productRepository0.findSortedByName();
        org.example.Order order13 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList14 = productRepository0.findAllOrders();
        org.example.Order order16 = productRepository0.findOrderById((java.lang.Long) (-1L));
        boolean boolean18 = productRepository0.delete((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNull(order10);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNull(order13);
        org.junit.Assert.assertNotNull(orderList14);
        org.junit.Assert.assertNull(order16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        boolean boolean9 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList10 = productRepository0.findAll();
        java.util.List<org.example.Product> productList11 = productRepository0.findAll();
        java.util.List<org.example.Product> productList13 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList14 = productRepository0.findAll();
        java.util.List<org.example.Product> productList15 = productRepository0.findAll();
        java.util.List<org.example.Product> productList17 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Product> productList19 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        boolean boolean21 = productRepository0.delete((java.lang.Long) (-1L));
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList15);
        org.junit.Assert.assertNotNull(productList17);
        org.junit.Assert.assertNotNull(productList19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
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
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNull(product7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(orderList9);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(product14);
        org.junit.Assert.assertNotNull(productList16);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList7 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        java.util.List<org.example.Product> productList8 = productRepository0.findAll();
        org.example.Product product10 = productRepository0.findById((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNull(product10);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        boolean boolean2 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList4 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        boolean boolean6 = productRepository0.delete((java.lang.Long) (-1L));
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
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList5 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList6 = productRepository0.findSortedByName();
        boolean boolean8 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList9 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList10 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList12 = productRepository0.findByKeyword("hi!");
        boolean boolean14 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList16 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(orderList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(productList16);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Product product9 = productRepository0.findById((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList11 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order13 = productRepository0.findOrderById((java.lang.Long) (-1L));
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(product9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNull(order13);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
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
        java.util.List<org.example.Product> productList17 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList18 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList19 = productRepository0.findSortedByName();
        java.lang.Class<?> wildcardClass20 = productRepository0.getClass();
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
        org.junit.Assert.assertNotNull(productList18);
        org.junit.Assert.assertNotNull(productList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        boolean boolean2 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList3 = productRepository0.findSortedByName();
        org.example.Product product5 = productRepository0.findById((java.lang.Long) 1L);
        org.example.Order order7 = productRepository0.findOrderById((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList9 = productRepository0.findByKeyword("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNull(product5);
        org.junit.Assert.assertNull(order7);
        org.junit.Assert.assertNotNull(productList9);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList1 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList3 = productRepository0.findByKeyword("");
        boolean boolean5 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.util.List<org.example.Product> productList9 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList11 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        java.util.List<org.example.Order> orderList12 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList14 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Product> productList16 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        java.util.List<org.example.Order> orderList17 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList19 = productRepository0.findByKeyword("hi!");
        java.lang.Class<?> wildcardClass20 = productList19.getClass();
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(orderList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertNotNull(orderList17);
        org.junit.Assert.assertNotNull(productList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Order order9 = productRepository0.findOrderById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList10 = productRepository0.findAll();
        boolean boolean12 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList13 = productRepository0.findAll();
        org.example.Product product15 = productRepository0.findById((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(order9);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNull(product15);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        org.example.Order order5 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNull(order5);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(orderList7);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        org.example.Order order9 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(order9);
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        org.example.Product product7 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList8 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        java.util.List<org.example.Order> orderList11 = productRepository0.findAllOrders();
        boolean boolean13 = productRepository0.delete((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNull(product7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(orderList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList2 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        org.example.Product product5 = productRepository0.findById((java.lang.Long) 0L);
        boolean boolean7 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList9 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.util.List<org.example.Product> productList11 = productRepository0.findByKeyword("hi!");
        org.example.Order order12 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(orderList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNull(product5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        org.example.Product product7 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList8 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList9 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList11 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Product> productList13 = productRepository0.findByKeyword("");
        org.example.Product product15 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList16 = productRepository0.findAllOrders();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNull(product7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(orderList9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNull(product15);
        org.junit.Assert.assertNotNull(orderList16);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList4 = productRepository0.findAll();
        java.util.List<org.example.Product> productList5 = productRepository0.findAll();
        java.util.List<org.example.Product> productList6 = productRepository0.findAll();
        boolean boolean8 = productRepository0.delete((java.lang.Long) 100L);
        boolean boolean10 = productRepository0.delete((java.lang.Long) 10L);
        org.example.Order order12 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList13 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList14 = productRepository0.findAllOrders();
        org.example.Order order16 = productRepository0.findOrderById((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(order12);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNotNull(orderList14);
        org.junit.Assert.assertNull(order16);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        boolean boolean8 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList9 = productRepository0.findAll();
        boolean boolean11 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList13 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        org.example.Product product15 = productRepository0.findById((java.lang.Long) 1L);
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNull(product15);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
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
        org.example.Product product24 = productRepository0.findById((java.lang.Long) 1L);
        boolean boolean26 = productRepository0.delete((java.lang.Long) 1L);
        org.example.Order order27 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order27);
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
        org.junit.Assert.assertNull(product24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList8 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.util.List<org.example.Product> productList10 = productRepository0.findByKeyword("");
        org.example.Order order12 = productRepository0.findOrderById((java.lang.Long) 10L);
        boolean boolean14 = productRepository0.delete((java.lang.Long) 1L);
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
        org.junit.Assert.assertNull(order12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        org.example.Order order8 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList10 = productRepository0.findByKeyword("hi!");
        boolean boolean12 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList14 = productRepository0.findByKeyword("hi!");
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(order8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(productList14);
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("hi!");
        org.example.Product product8 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        java.util.List<org.example.Product> productList11 = productRepository0.findAll();
        org.example.Order order13 = productRepository0.findOrderById((java.lang.Long) 0L);
        org.example.Product product15 = productRepository0.findById((java.lang.Long) (-1L));
        org.example.Product product17 = productRepository0.findById((java.lang.Long) 1L);
        org.example.Product product18 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product18);
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
        org.junit.Assert.assertNull(order13);
        org.junit.Assert.assertNull(product15);
        org.junit.Assert.assertNull(product17);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        boolean boolean9 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList10 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList11 = productRepository0.findSortedByName();
        java.lang.Class<?> wildcardClass12 = productList11.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(orderList10);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        boolean boolean3 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList4 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(orderList4);
        org.junit.Assert.assertNotNull(orderList5);
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        boolean boolean8 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList9 = productRepository0.findAll();
        boolean boolean11 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList13 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        java.util.List<org.example.Product> productList15 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        boolean boolean17 = productRepository0.delete((java.lang.Long) (-1L));
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNotNull(productList15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList7 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.util.List<org.example.Product> productList9 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        java.util.List<org.example.Product> productList11 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Product> productList12 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList13 = productRepository0.findAllOrders();
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
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(orderList13);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
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
        org.example.Product product17 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList19 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.util.List<org.example.Product> productList21 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList22 = productRepository0.findAll();
        java.util.List<org.example.Product> productList23 = productRepository0.findSortedByName();
        org.example.Product product25 = productRepository0.findById((java.lang.Long) 0L);
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
        org.junit.Assert.assertNull(product17);
        org.junit.Assert.assertNotNull(productList19);
        org.junit.Assert.assertNotNull(productList21);
        org.junit.Assert.assertNotNull(productList22);
        org.junit.Assert.assertNotNull(productList23);
        org.junit.Assert.assertNull(product25);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        boolean boolean7 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList9 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList10 = productRepository0.findAll();
        java.util.List<org.example.Product> productList12 = productRepository0.findByKeyword("hi!");
        org.example.Product product14 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList16 = productRepository0.findByKeyword("hi!");
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNull(product14);
        org.junit.Assert.assertNotNull(productList16);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
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
            productRepository0.update(product10);
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
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList1 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList3 = productRepository0.findByKeyword("hi!");
        org.example.Product product5 = productRepository0.findById((java.lang.Long) 1L);
        boolean boolean7 = productRepository0.delete((java.lang.Long) 1L);
        java.util.List<org.example.Order> orderList8 = productRepository0.findAllOrders();
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNull(product5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(orderList8);
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        boolean boolean9 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList11 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList13 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        org.example.Order order15 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNull(order15);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        boolean boolean9 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList10 = productRepository0.findAll();
        java.util.List<org.example.Product> productList11 = productRepository0.findAll();
        java.util.List<org.example.Order> orderList12 = productRepository0.findAllOrders();
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(orderList12);
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList5 = productRepository0.findByKeyword("");
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        org.example.Order order9 = productRepository0.findOrderById((java.lang.Long) 1L);
        org.example.Order order11 = productRepository0.findOrderById((java.lang.Long) 0L);
        boolean boolean13 = productRepository0.delete((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList14 = productRepository0.findSortedByName();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(orderList7);
        org.junit.Assert.assertNull(order9);
        org.junit.Assert.assertNull(order11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(productList14);
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Product product9 = productRepository0.findById((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList11 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Product> productList13 = productRepository0.findByKeyword("");
        java.lang.Class<?> wildcardClass14 = productList13.getClass();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(product9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList8 = productRepository0.findAllOrders();
        org.example.Product product10 = productRepository0.findById((java.lang.Long) 1L);
        org.example.Order order12 = productRepository0.findOrderById((java.lang.Long) (-1L));
        org.example.Product product14 = productRepository0.findById((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList15 = productRepository0.findAll();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(orderList7);
        org.junit.Assert.assertNotNull(orderList8);
        org.junit.Assert.assertNull(product10);
        org.junit.Assert.assertNull(order12);
        org.junit.Assert.assertNull(product14);
        org.junit.Assert.assertNotNull(productList15);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
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
        java.util.List<org.example.Product> productList24 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Product product26 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order27 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order27);
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
        org.junit.Assert.assertNotNull(productList24);
        org.junit.Assert.assertNull(product26);
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList8 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList9 = productRepository0.findSortedByName();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(orderList7);
        org.junit.Assert.assertNotNull(orderList8);
        org.junit.Assert.assertNotNull(productList9);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        org.example.Product product9 = productRepository0.findById((java.lang.Long) 1L);
        org.example.Order order11 = productRepository0.findOrderById((java.lang.Long) (-1L));
        boolean boolean13 = productRepository0.delete((java.lang.Long) (-1L));
        boolean boolean15 = productRepository0.delete((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(orderList7);
        org.junit.Assert.assertNull(product9);
        org.junit.Assert.assertNull(order11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        boolean boolean8 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList9 = productRepository0.findAll();
        java.lang.Class<?> wildcardClass10 = productList9.getClass();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList5 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList7 = productRepository0.findByKeyword("");
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList7);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        org.example.Product product7 = productRepository0.findById((java.lang.Long) 1L);
        java.util.List<org.example.Order> orderList8 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList9 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList10 = productRepository0.findSortedByName();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNull(product7);
        org.junit.Assert.assertNotNull(orderList8);
        org.junit.Assert.assertNotNull(orderList9);
        org.junit.Assert.assertNotNull(productList10);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList5 = productRepository0.findByKeyword("");
        boolean boolean7 = productRepository0.delete((java.lang.Long) 10L);
        org.example.Order order9 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList10 = productRepository0.findAllOrders();
        org.example.Order order12 = productRepository0.findOrderById((java.lang.Long) 100L);
        org.example.Product product14 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList15 = productRepository0.findAll();
        java.util.List<org.example.Product> productList17 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(order9);
        org.junit.Assert.assertNotNull(orderList10);
        org.junit.Assert.assertNull(order12);
        org.junit.Assert.assertNull(product14);
        org.junit.Assert.assertNotNull(productList15);
        org.junit.Assert.assertNotNull(productList17);
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
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
            productRepository0.save(product11);
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
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList7 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.util.List<org.example.Product> productList9 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        java.util.List<org.example.Product> productList11 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Product> productList13 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
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
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList13);
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList8 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.util.List<org.example.Product> productList10 = productRepository0.findByKeyword("");
        org.example.Order order12 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Product product14 = productRepository0.findById((java.lang.Long) (-1L));
        org.example.Order order16 = productRepository0.findOrderById((java.lang.Long) 1L);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNull(order12);
        org.junit.Assert.assertNull(product14);
        org.junit.Assert.assertNull(order16);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        boolean boolean9 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList11 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList12 = productRepository0.findSortedByName();
        boolean boolean14 = productRepository0.delete((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList15 = productRepository0.findSortedByName();
        java.lang.Class<?> wildcardClass16 = productList15.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(productList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        boolean boolean7 = productRepository0.delete((java.lang.Long) 10L);
        boolean boolean9 = productRepository0.delete((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList11 = productRepository0.findByKeyword("hi!");
        org.example.Order order13 = productRepository0.findOrderById((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNull(order13);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList10 = productRepository0.findByKeyword("");
        org.example.Product product12 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Product product14 = productRepository0.findById((java.lang.Long) 1L);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNull(product12);
        org.junit.Assert.assertNull(product14);
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        boolean boolean9 = productRepository0.delete((java.lang.Long) 0L);
        org.example.Product product11 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList12 = productRepository0.findAll();
        org.example.Order order14 = productRepository0.findOrderById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList16 = productRepository0.findByKeyword("");
        org.example.Order order18 = productRepository0.findOrderById((java.lang.Long) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = order18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(orderList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(product11);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNull(order14);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertNull(order18);
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList8 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order12 = productRepository0.findOrderById((java.lang.Long) 100L);
        org.example.Order order14 = productRepository0.findOrderById((java.lang.Long) 1L);
        org.example.Order order16 = productRepository0.findOrderById((java.lang.Long) 10L);
        boolean boolean18 = productRepository0.delete((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(orderList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNull(order12);
        org.junit.Assert.assertNull(order14);
        org.junit.Assert.assertNull(order16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList4 = productRepository0.findAll();
        boolean boolean6 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        org.example.Order order9 = productRepository0.findOrderById((java.lang.Long) 0L);
        org.example.Order order11 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Order order12 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(orderList7);
        org.junit.Assert.assertNull(order9);
        org.junit.Assert.assertNull(order11);
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList9 = productRepository0.findAll();
        boolean boolean11 = productRepository0.delete((java.lang.Long) 10L);
        org.example.Product product13 = productRepository0.findById((java.lang.Long) (-1L));
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(product13);
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
        org.example.Order order10 = productRepository0.findOrderById((java.lang.Long) 0L);
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
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        boolean boolean2 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList3 = productRepository0.findSortedByName();
        org.example.Product product5 = productRepository0.findById((java.lang.Long) 1L);
        org.example.Order order7 = productRepository0.findOrderById((java.lang.Long) (-1L));
        org.example.Product product9 = productRepository0.findById((java.lang.Long) 1L);
        org.example.Order order10 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNull(product5);
        org.junit.Assert.assertNull(order7);
        org.junit.Assert.assertNull(product9);
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        org.example.Product product5 = productRepository0.findById((java.lang.Long) 1L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList8 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNull(product5);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList8);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        org.example.Product product8 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order10 = productRepository0.findOrderById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList12 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(product8);
        org.junit.Assert.assertNull(order10);
        org.junit.Assert.assertNotNull(productList12);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList6 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList8 = productRepository0.findSortedByName();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList8);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Product product9 = productRepository0.findById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList10 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList11 = productRepository0.findAll();
        java.util.List<org.example.Product> productList13 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Product> productList14 = productRepository0.findSortedByName();
        org.example.Product product16 = productRepository0.findById((java.lang.Long) 1L);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(product9);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNull(product16);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList8 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        boolean boolean12 = productRepository0.delete((java.lang.Long) 10L);
        boolean boolean14 = productRepository0.delete((java.lang.Long) (-1L));
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
        org.example.Product product10 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList11 = productRepository0.findAll();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNull(product10);
        org.junit.Assert.assertNotNull(productList11);
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Order order9 = productRepository0.findOrderById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList10 = productRepository0.findAll();
        java.util.List<org.example.Product> productList12 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList13 = productRepository0.findAllOrders();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(order9);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(orderList13);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Order order9 = productRepository0.findOrderById((java.lang.Long) 1L);
        org.example.Order order11 = productRepository0.findOrderById((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList13 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        java.util.List<org.example.Product> productList15 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList17 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Product> productList19 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.util.List<org.example.Product> productList21 = productRepository0.findByKeyword("hi!");
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(order9);
        org.junit.Assert.assertNull(order11);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNotNull(productList15);
        org.junit.Assert.assertNotNull(productList17);
        org.junit.Assert.assertNotNull(productList19);
        org.junit.Assert.assertNotNull(productList21);
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList10 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList12 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList14 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Product> productList16 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Product> productList17 = productRepository0.findSortedByName();
        org.example.Product product19 = productRepository0.findById((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList20 = productRepository0.findAllOrders();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertNotNull(productList17);
        org.junit.Assert.assertNull(product19);
        org.junit.Assert.assertNotNull(orderList20);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Product product9 = productRepository0.findById((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList11 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Product> productList13 = productRepository0.findByKeyword("");
        java.util.List<org.example.Order> orderList14 = productRepository0.findAllOrders();
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
        org.junit.Assert.assertNull(product9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNotNull(orderList14);
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList1 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList3 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        org.example.Order order5 = productRepository0.findOrderById((java.lang.Long) 1L);
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
        org.junit.Assert.assertNull(order5);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Order order9 = productRepository0.findOrderById((java.lang.Long) 1L);
        java.util.List<org.example.Order> orderList10 = productRepository0.findAllOrders();
        org.example.Order order12 = productRepository0.findOrderById((java.lang.Long) 0L);
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
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(order9);
        org.junit.Assert.assertNotNull(orderList10);
        org.junit.Assert.assertNull(order12);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        boolean boolean4 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList9 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        org.example.Order order11 = productRepository0.findOrderById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList13 = productRepository0.findByKeyword("hi!");
        org.example.Order order15 = productRepository0.findOrderById((java.lang.Long) 1L);
        boolean boolean17 = productRepository0.delete((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNull(order11);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNull(order15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
        boolean boolean10 = productRepository0.delete((java.lang.Long) 10L);
        org.example.Product product12 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList14 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        org.example.Product product16 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList17 = productRepository0.findAll();
        java.util.List<org.example.Product> productList18 = productRepository0.findSortedByName();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(product12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNull(product16);
        org.junit.Assert.assertNotNull(productList17);
        org.junit.Assert.assertNotNull(productList18);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        org.example.Order order8 = productRepository0.findOrderById((java.lang.Long) 100L);
        org.example.Product product10 = productRepository0.findById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList12 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        java.util.List<org.example.Order> orderList13 = productRepository0.findAllOrders();
        java.lang.Class<?> wildcardClass14 = orderList13.getClass();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(order8);
        org.junit.Assert.assertNull(product10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(orderList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
        java.util.List<org.example.Order> orderList9 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList11 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(orderList9);
        org.junit.Assert.assertNotNull(productList11);
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        boolean boolean2 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) (-1L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList2 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        org.example.Product product5 = productRepository0.findById((java.lang.Long) 0L);
        boolean boolean7 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList9 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.util.List<org.example.Product> productList11 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        org.example.Product product13 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList14 = productRepository0.findAllOrders();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(orderList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNull(product5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNull(product13);
        org.junit.Assert.assertNotNull(orderList14);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("hi!");
        org.example.Product product8 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList9 = productRepository0.findAll();
        java.util.List<org.example.Product> productList11 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList13 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Product> productList15 = productRepository0.findByKeyword("");
        java.lang.Class<?> wildcardClass16 = productRepository0.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(product8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNotNull(productList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList7 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Order> orderList8 = productRepository0.findAllOrders();
        org.example.Product product10 = productRepository0.findById((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(orderList8);
        org.junit.Assert.assertNull(product10);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        boolean boolean9 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList11 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList12 = productRepository0.findSortedByName();
        boolean boolean14 = productRepository0.delete((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList15 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList17 = productRepository0.findByKeyword("hi!");
        boolean boolean19 = productRepository0.delete((java.lang.Long) 10L);
        org.example.Product product20 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product20);
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
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(productList15);
        org.junit.Assert.assertNotNull(productList17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList7 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.util.List<org.example.Product> productList9 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        java.util.List<org.example.Product> productList10 = productRepository0.findSortedByName();
        org.example.Product product12 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList14 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNull(product12);
        org.junit.Assert.assertNotNull(productList14);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
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
        org.example.Product product19 = productRepository0.findById((java.lang.Long) 1L);
        boolean boolean21 = productRepository0.delete((java.lang.Long) (-1L));
        boolean boolean23 = productRepository0.delete((java.lang.Long) 100L);
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
        org.junit.Assert.assertNull(product19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        org.example.Product product8 = productRepository0.findById((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList9 = productRepository0.findSortedByName();
        boolean boolean11 = productRepository0.delete((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(product8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
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
        java.util.List<org.example.Product> productList17 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.util.List<org.example.Product> productList19 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        org.example.Order order21 = productRepository0.findOrderById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList22 = productRepository0.findAllOrders();
        org.example.Product product24 = productRepository0.findById((java.lang.Long) 1L);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList15);
        org.junit.Assert.assertNotNull(productList17);
        org.junit.Assert.assertNotNull(productList19);
        org.junit.Assert.assertNull(order21);
        org.junit.Assert.assertNotNull(orderList22);
        org.junit.Assert.assertNull(product24);
    }
}

