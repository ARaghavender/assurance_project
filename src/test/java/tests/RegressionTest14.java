package tests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest14 {

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
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList4 = productRepository0.findAll();
        boolean boolean6 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        org.example.Order order9 = productRepository0.findOrderById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList10 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList12 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order14 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList16 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(orderList7);
        org.junit.Assert.assertNull(order9);
        org.junit.Assert.assertNotNull(orderList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNull(order14);
        org.junit.Assert.assertNotNull(productList16);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        boolean boolean4 = productRepository0.delete((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        java.util.List<org.example.Product> productList8 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        java.util.List<org.example.Product> productList11 = productRepository0.findAll();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList11);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList5 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList6 = productRepository0.findSortedByName();
        boolean boolean8 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList9 = productRepository0.findAll();
        java.util.List<org.example.Product> productList11 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList12 = productRepository0.findAll();
        org.example.Order order14 = productRepository0.findOrderById((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList16 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNull(order14);
        org.junit.Assert.assertNotNull(productList16);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
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
        java.lang.Class<?> wildcardClass16 = productList15.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        boolean boolean8 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList9 = productRepository0.findAll();
        java.util.List<org.example.Product> productList11 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        java.util.List<org.example.Product> productList12 = productRepository0.findSortedByName();
        org.example.Order order14 = productRepository0.findOrderById((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNull(order14);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Order order9 = productRepository0.findOrderById((java.lang.Long) 1L);
        org.example.Order order11 = productRepository0.findOrderById((java.lang.Long) (-1L));
        org.example.Order order13 = productRepository0.findOrderById((java.lang.Long) 0L);
        boolean boolean15 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList17 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(order9);
        org.junit.Assert.assertNull(order11);
        org.junit.Assert.assertNull(order13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(productList17);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
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
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(productList7);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
        org.example.Product product10 = productRepository0.findById((java.lang.Long) 10L);
        boolean boolean12 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList14 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        org.example.Product product15 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
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
        org.junit.Assert.assertNotNull(productList14);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList1 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList3 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        org.example.Order order5 = productRepository0.findOrderById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList6 = productRepository0.findSortedByName();
        org.example.Order order7 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNull(order5);
        org.junit.Assert.assertNotNull(productList6);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList4 = productRepository0.findAll();
        java.util.List<org.example.Product> productList5 = productRepository0.findAll();
        java.util.List<org.example.Product> productList7 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        java.util.List<org.example.Product> productList8 = productRepository0.findSortedByName();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList8);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
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
        java.util.List<org.example.Product> productList13 = productRepository0.findByKeyword("hi!");
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNull(product7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(orderList9);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(orderList11);
        org.junit.Assert.assertNotNull(productList13);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList5 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList6 = productRepository0.findSortedByName();
        boolean boolean8 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList9 = productRepository0.findSortedByName();
        boolean boolean11 = productRepository0.delete((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList1 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList3 = productRepository0.findByKeyword("");
        boolean boolean5 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList9 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Product> productList11 = productRepository0.findByKeyword("hi!");
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Product product5 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
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
        java.util.List<org.example.Product> productList15 = productRepository0.findByKeyword("hi!");
        org.example.Product product16 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product16);
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
        org.junit.Assert.assertNull(order11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(productList15);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
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
        org.example.Product product18 = productRepository0.findById((java.lang.Long) 0L);
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
        org.junit.Assert.assertNull(product18);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        boolean boolean4 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList9 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        boolean boolean11 = productRepository0.delete((java.lang.Long) 1L);
        java.util.List<org.example.Order> orderList12 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList13 = productRepository0.findAllOrders();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(orderList12);
        org.junit.Assert.assertNotNull(orderList13);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        boolean boolean8 = productRepository0.delete((java.lang.Long) 1L);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        org.example.Product product8 = productRepository0.findById((java.lang.Long) (-1L));
        org.example.Order order10 = productRepository0.findOrderById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList11 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList12 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList13 = productRepository0.findSortedByName();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(product8);
        org.junit.Assert.assertNull(order10);
        org.junit.Assert.assertNotNull(orderList11);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList13);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList8 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.util.List<org.example.Product> productList10 = productRepository0.findByKeyword("");
        org.example.Order order12 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList14 = productRepository0.findByKeyword("");
        boolean boolean16 = productRepository0.delete((java.lang.Long) 100L);
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
        org.junit.Assert.assertNull(order12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("hi!");
        org.example.Order order10 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList12 = productRepository0.findByKeyword("");
        org.example.Order order14 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList16 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Product> productList17 = productRepository0.findAll();
        java.util.List<org.example.Product> productList18 = productRepository0.findSortedByName();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNull(order10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNull(order14);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertNotNull(productList17);
        org.junit.Assert.assertNotNull(productList18);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
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
        org.example.Order order15 = productRepository0.findOrderById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList16 = productRepository0.findSortedByName();
        org.example.Product product18 = productRepository0.findById((java.lang.Long) 100L);
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
        org.junit.Assert.assertNull(order15);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertNull(product18);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
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
        org.example.Order order20 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order20);
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
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertNotNull(orderList17);
        org.junit.Assert.assertNotNull(productList19);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        boolean boolean4 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList6 = productRepository0.findAll();
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList9 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        boolean boolean11 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList12 = productRepository0.findSortedByName();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(productList12);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        boolean boolean7 = productRepository0.delete((java.lang.Long) (-1L));
        boolean boolean9 = productRepository0.delete((java.lang.Long) 1L);
        org.example.Product product11 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList12 = productRepository0.findAll();
        java.util.List<org.example.Product> productList14 = productRepository0.findByKeyword("");
        java.lang.Class<?> wildcardClass15 = productList14.getClass();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(product11);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList5 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList6 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("hi!");
        org.example.Order order10 = productRepository0.findOrderById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList12 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNull(order10);
        org.junit.Assert.assertNotNull(productList12);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList7 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        org.example.Order order9 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList10 = productRepository0.findAllOrders();
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
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(order9);
        org.junit.Assert.assertNotNull(orderList10);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Product product9 = productRepository0.findById((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList11 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.util.List<org.example.Order> orderList12 = productRepository0.findAllOrders();
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
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(product9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(orderList12);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        boolean boolean2 = productRepository0.delete((java.lang.Long) 100L);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(orderList7);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        boolean boolean2 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList4 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList7 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList9 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList9);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList9 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList11 = productRepository0.findByKeyword("hi!");
        org.example.Product product13 = productRepository0.findById((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList14 = productRepository0.findAllOrders();
        org.example.Order order16 = productRepository0.findOrderById((java.lang.Long) 1L);
        boolean boolean18 = productRepository0.delete((java.lang.Long) 1L);
        org.example.Product product20 = productRepository0.findById((java.lang.Long) (-1L));
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(orderList7);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNull(product13);
        org.junit.Assert.assertNotNull(orderList14);
        org.junit.Assert.assertNull(order16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(product20);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList5 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList6 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Product> productList10 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList12 = productRepository0.findByKeyword("");
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
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Product product6 = productRepository0.findById((java.lang.Long) 1L);
        boolean boolean8 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList10 = productRepository0.findByKeyword("hi!");
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
        org.junit.Assert.assertNotNull(productList10);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        boolean boolean2 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList3 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList4 = productRepository0.findAll();
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        java.util.List<org.example.Product> productList8 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        org.example.Product product10 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList11 = productRepository0.findAll();
        boolean boolean13 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList14 = productRepository0.findSortedByName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNull(product10);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(productList14);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        boolean boolean4 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        boolean boolean8 = productRepository0.delete((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList1 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList3 = productRepository0.findByKeyword("");
        boolean boolean5 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findByKeyword("");
        org.example.Product product9 = productRepository0.findById((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList11 = productRepository0.findByKeyword("");
        org.example.Order order12 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(product9);
        org.junit.Assert.assertNotNull(productList11);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Product product9 = productRepository0.findById((java.lang.Long) (-1L));
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
        org.junit.Assert.assertNull(product9);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
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
        java.util.List<org.example.Product> productList13 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(orderList9);
        org.junit.Assert.assertNotNull(orderList10);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList13);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
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
        org.example.Order order19 = productRepository0.findOrderById((java.lang.Long) 0L);
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
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Order order9 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(order9);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(productList7);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList7 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.util.List<org.example.Product> productList9 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
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
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        boolean boolean2 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList4 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.util.List<org.example.Product> productList9 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Product> productList11 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.util.List<org.example.Product> productList13 = productRepository0.findByKeyword("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList13);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList4 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList5 = productRepository0.findAll();
        java.lang.Class<?> wildcardClass6 = productRepository0.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(orderList4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
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
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList9);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        boolean boolean7 = productRepository0.delete((java.lang.Long) (-1L));
        boolean boolean9 = productRepository0.delete((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList11 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList12 = productRepository0.findAll();
        boolean boolean14 = productRepository0.delete((java.lang.Long) 0L);
        org.example.Product product15 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product15);
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
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList4 = productRepository0.findAllOrders();
        org.example.Product product6 = productRepository0.findById((java.lang.Long) 10L);
        org.example.Product product8 = productRepository0.findById((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(orderList4);
        org.junit.Assert.assertNull(product6);
        org.junit.Assert.assertNull(product8);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList8 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList9 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList10 = productRepository0.findAll();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(orderList8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList10);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Product product6 = productRepository0.findById((java.lang.Long) 1L);
        boolean boolean8 = productRepository0.delete((java.lang.Long) 0L);
        org.example.Order order10 = productRepository0.findOrderById((java.lang.Long) 0L);
        org.example.Order order12 = productRepository0.findOrderById((java.lang.Long) 100L);
        org.example.Order order14 = productRepository0.findOrderById((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList16 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(product6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(order10);
        org.junit.Assert.assertNull(order12);
        org.junit.Assert.assertNull(order14);
        org.junit.Assert.assertNotNull(productList16);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
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
        org.example.Order order16 = productRepository0.findOrderById((java.lang.Long) 0L);
        org.example.Product product18 = productRepository0.findById((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(orderList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNull(order16);
        org.junit.Assert.assertNull(product18);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
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
            productRepository0.update(product15);
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
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
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
        java.util.List<org.example.Product> productList18 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList19 = productRepository0.findAll();
        org.example.Product product21 = productRepository0.findById((java.lang.Long) 1L);
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
        org.junit.Assert.assertNotNull(productList18);
        org.junit.Assert.assertNotNull(productList19);
        org.junit.Assert.assertNull(product21);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList1 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList3 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList4 = productRepository0.findAll();
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
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList5);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        org.example.Product product8 = productRepository0.findById((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList9 = productRepository0.findAll();
        java.util.List<org.example.Product> productList10 = productRepository0.findSortedByName();
        org.example.Order order12 = productRepository0.findOrderById((java.lang.Long) 0L);
        boolean boolean14 = productRepository0.delete((java.lang.Long) 0L);
        org.example.Order order16 = productRepository0.findOrderById((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(product8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNull(order12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(order16);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Order order9 = productRepository0.findOrderById((java.lang.Long) 1L);
        java.util.List<org.example.Order> orderList10 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList11 = productRepository0.findAll();
        java.util.List<org.example.Order> orderList12 = productRepository0.findAllOrders();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(order9);
        org.junit.Assert.assertNotNull(orderList10);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(orderList12);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList1 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList3 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        boolean boolean5 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        org.example.Order order8 = productRepository0.findOrderById((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList10 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Order> orderList11 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList13 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNull(order8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(orderList11);
        org.junit.Assert.assertNotNull(productList13);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
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
        java.util.List<org.example.Order> orderList17 = productRepository0.findAllOrders();
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
        org.junit.Assert.assertNotNull(orderList17);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Product> productList3 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList4 = productRepository0.findAll();
        boolean boolean6 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList9 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList9);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
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
        org.junit.Assert.assertNotNull(productList17);
        org.junit.Assert.assertNotNull(productList19);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Product product9 = productRepository0.findById((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList10 = productRepository0.findSortedByName();
        org.example.Order order12 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(product9);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNull(order12);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        boolean boolean6 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        org.example.Product product9 = productRepository0.findById((java.lang.Long) 0L);
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
        org.junit.Assert.assertNotNull(orderList7);
        org.junit.Assert.assertNull(product9);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList9 = productRepository0.findAll();
        boolean boolean11 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList12 = productRepository0.findSortedByName();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(productList12);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
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
        java.util.List<org.example.Product> productList19 = productRepository0.findByKeyword("");
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
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Product product9 = productRepository0.findById((java.lang.Long) (-1L));
        org.example.Product product11 = productRepository0.findById((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(product9);
        org.junit.Assert.assertNull(product11);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList4 = productRepository0.findAll();
        java.util.List<org.example.Product> productList5 = productRepository0.findAll();
        java.util.List<org.example.Product> productList6 = productRepository0.findAll();
        boolean boolean8 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList9 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList10 = productRepository0.findSortedByName();
        boolean boolean12 = productRepository0.delete((java.lang.Long) 1L);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(orderList9);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
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
        java.lang.Class<?> wildcardClass14 = productRepository0.getClass();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(orderList10);
        org.junit.Assert.assertNull(product12);
        org.junit.Assert.assertNotNull(orderList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
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
        org.example.Product product23 = productRepository0.findById((java.lang.Long) 100L);
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
        org.junit.Assert.assertNull(product23);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
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
        org.example.Product product16 = productRepository0.findById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList18 = productRepository0.findByKeyword("hi!");
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
        org.junit.Assert.assertNull(product16);
        org.junit.Assert.assertNotNull(productList18);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList2 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        org.example.Product product5 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Product product7 = productRepository0.findById((java.lang.Long) (-1L));
        java.util.List<org.example.Order> orderList8 = productRepository0.findAllOrders();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(orderList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNull(product5);
        org.junit.Assert.assertNull(product7);
        org.junit.Assert.assertNotNull(orderList8);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList5 = productRepository0.findByKeyword("");
        boolean boolean7 = productRepository0.delete((java.lang.Long) 10L);
        org.example.Order order9 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList10 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList11 = productRepository0.findAllOrders();
        org.example.Order order13 = productRepository0.findOrderById((java.lang.Long) (-1L));
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
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(order9);
        org.junit.Assert.assertNotNull(orderList10);
        org.junit.Assert.assertNotNull(orderList11);
        org.junit.Assert.assertNull(order13);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        boolean boolean2 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList3 = productRepository0.findSortedByName();
        org.example.Order order5 = productRepository0.findOrderById((java.lang.Long) (-1L));
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNull(order5);
        org.junit.Assert.assertNotNull(orderList6);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList4 = productRepository0.findAll();
        java.util.List<org.example.Product> productList5 = productRepository0.findAll();
        java.util.List<org.example.Product> productList7 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        java.lang.Class<?> wildcardClass8 = productList7.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList7 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.util.List<org.example.Product> productList9 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
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
        org.junit.Assert.assertNotNull(productList9);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
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
        org.example.Order order16 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(orderList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(order16);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
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
            productRepository0.save(product15);
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
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
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
        java.util.List<org.example.Product> productList15 = productRepository0.findByKeyword("");
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(orderList11);
        org.junit.Assert.assertNull(order13);
        org.junit.Assert.assertNotNull(productList15);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        boolean boolean6 = productRepository0.delete((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList5 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList6 = productRepository0.findSortedByName();
        org.example.Product product8 = productRepository0.findById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.lang.Class<?> wildcardClass11 = productRepository0.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(product8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        java.util.List<org.example.Order> orderList8 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList10 = productRepository0.findByKeyword("");
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(orderList8);
        org.junit.Assert.assertNotNull(productList10);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList8 = productRepository0.findSortedByName();
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
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        boolean boolean8 = productRepository0.delete((java.lang.Long) 10L);
        org.example.Order order10 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Product product12 = productRepository0.findById((java.lang.Long) 10L);
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
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(order10);
        org.junit.Assert.assertNull(product12);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
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
        org.example.Order order19 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order19);
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
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(product14);
        org.junit.Assert.assertNull(order16);
        org.junit.Assert.assertNull(order18);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList7 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.util.List<org.example.Product> productList9 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        java.util.List<org.example.Product> productList10 = productRepository0.findSortedByName();
        org.example.Product product12 = productRepository0.findById((java.lang.Long) 100L);
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
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNull(product12);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList7 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.util.List<org.example.Product> productList9 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        java.util.List<org.example.Product> productList11 = productRepository0.findByKeyword("hi!");
        org.example.Order order13 = productRepository0.findOrderById((java.lang.Long) 0L);
        boolean boolean15 = productRepository0.delete((java.lang.Long) (-1L));
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNull(order13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList6 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        java.util.List<org.example.Product> productList8 = productRepository0.findSortedByName();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList8);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
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
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
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
        java.util.List<org.example.Product> productList20 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
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
        org.junit.Assert.assertNotNull(productList20);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Product product9 = productRepository0.findById((java.lang.Long) (-1L));
        java.util.List<org.example.Order> orderList10 = productRepository0.findAllOrders();
        org.example.Product product12 = productRepository0.findById((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(product9);
        org.junit.Assert.assertNotNull(orderList10);
        org.junit.Assert.assertNull(product12);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        boolean boolean7 = productRepository0.delete((java.lang.Long) (-1L));
        boolean boolean9 = productRepository0.delete((java.lang.Long) 1L);
        org.example.Product product11 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList12 = productRepository0.findAll();
        java.util.List<org.example.Order> orderList13 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList14 = productRepository0.findSortedByName();
        org.example.Product product16 = productRepository0.findById((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(product11);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(orderList13);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNull(product16);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
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
        org.example.Product product17 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList18 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList19 = productRepository0.findAllOrders();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(order9);
        org.junit.Assert.assertNull(order11);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNotNull(productList15);
        org.junit.Assert.assertNull(product17);
        org.junit.Assert.assertNotNull(orderList18);
        org.junit.Assert.assertNotNull(orderList19);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        boolean boolean7 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList9 = productRepository0.findByKeyword("");
        java.util.List<org.example.Order> orderList10 = productRepository0.findAllOrders();
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
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(orderList10);
        org.junit.Assert.assertNotNull(productList12);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList9 = productRepository0.findAll();
        java.util.List<org.example.Product> productList11 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
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
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        org.example.Product product7 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList8 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        java.util.List<org.example.Order> orderList11 = productRepository0.findAllOrders();
        boolean boolean13 = productRepository0.delete((java.lang.Long) (-1L));
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
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
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
        java.util.List<org.example.Product> productList24 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Product> productList25 = productRepository0.findAll();
        org.example.Order order27 = productRepository0.findOrderById((java.lang.Long) 100L);
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
        org.junit.Assert.assertNotNull(productList25);
        org.junit.Assert.assertNull(order27);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Product product9 = productRepository0.findById((java.lang.Long) (-1L));
        org.example.Order order11 = productRepository0.findOrderById((java.lang.Long) 1L);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(product9);
        org.junit.Assert.assertNull(order11);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        boolean boolean4 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        org.example.Product product8 = productRepository0.findById((java.lang.Long) 0L);
        java.lang.Class<?> wildcardClass9 = productRepository0.getClass();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNull(product8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
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
        java.util.List<org.example.Product> productList17 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.lang.Class<?> wildcardClass18 = productList17.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("hi!");
        org.example.Order order10 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList12 = productRepository0.findByKeyword("");
        org.example.Order order14 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList16 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Product> productList17 = productRepository0.findAll();
        java.util.List<org.example.Product> productList18 = productRepository0.findAll();
        org.example.Product product20 = productRepository0.findById((java.lang.Long) (-1L));
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNull(order10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNull(order14);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertNotNull(productList17);
        org.junit.Assert.assertNotNull(productList18);
        org.junit.Assert.assertNull(product20);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 10L);
        org.example.Product product5 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        boolean boolean6 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Product> productList9 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList11 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList13 = productRepository0.findByKeyword("hi!");
        org.example.Product product15 = productRepository0.findById((java.lang.Long) (-1L));
        boolean boolean17 = productRepository0.delete((java.lang.Long) 1L);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNull(product15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
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
        java.util.List<org.example.Order> orderList20 = productRepository0.findAllOrders();
        java.lang.Class<?> wildcardClass21 = productRepository0.getClass();
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
        org.junit.Assert.assertNotNull(orderList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Product product9 = productRepository0.findById((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList11 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Product> productList13 = productRepository0.findByKeyword("");
        org.example.Product product15 = productRepository0.findById((java.lang.Long) 100L);
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
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList1 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList3 = productRepository0.findByKeyword("");
        boolean boolean5 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList9 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Product> productList11 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList8 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList9 = productRepository0.findAll();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList9);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList7 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.util.List<org.example.Product> productList9 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        java.util.List<org.example.Product> productList11 = productRepository0.findByKeyword("hi!");
        org.example.Product product13 = productRepository0.findById((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNull(product13);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
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
        java.util.List<org.example.Product> productList24 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Product> productList25 = productRepository0.findAll();
        java.util.List<org.example.Product> productList26 = productRepository0.findSortedByName();
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
        org.junit.Assert.assertNotNull(productList25);
        org.junit.Assert.assertNotNull(productList26);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
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
        boolean boolean18 = productRepository0.delete((java.lang.Long) 10L);
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
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        org.example.Order order8 = productRepository0.findOrderById((java.lang.Long) 100L);
        boolean boolean10 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList12 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        java.util.List<org.example.Product> productList13 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList14 = productRepository0.findAllOrders();
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
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNotNull(orderList14);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("hi!");
        org.example.Product product8 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList9 = productRepository0.findAll();
        java.util.List<org.example.Product> productList11 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList12 = productRepository0.findAll();
        java.util.List<org.example.Product> productList13 = productRepository0.findSortedByName();
        java.lang.Class<?> wildcardClass14 = productRepository0.getClass();
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
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        org.example.Product product7 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList8 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        boolean boolean12 = productRepository0.delete((java.lang.Long) (-1L));
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
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNull(product7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        boolean boolean9 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList11 = productRepository0.findByKeyword("");
        java.lang.Class<?> wildcardClass12 = productList11.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        org.example.Product product7 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList8 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList9 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList11 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        java.util.List<org.example.Product> productList13 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.lang.Class<?> wildcardClass14 = productList13.getClass();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNull(product7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        boolean boolean7 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList9 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList11 = productRepository0.findByKeyword("");
        java.lang.Class<?> wildcardClass12 = productList11.getClass();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList6 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList8 = productRepository0.findAll();
        java.lang.Class<?> wildcardClass9 = productRepository0.getClass();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        boolean boolean2 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList4 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        org.example.Order order9 = productRepository0.findOrderById((java.lang.Long) 100L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(order9);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        boolean boolean9 = productRepository0.delete((java.lang.Long) 0L);
        org.example.Product product10 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
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
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList4 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList5 = productRepository0.findAll();
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
        org.junit.Assert.assertNotNull(orderList4);
        org.junit.Assert.assertNotNull(productList5);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
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
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList15);
        org.junit.Assert.assertNotNull(productList17);
        org.junit.Assert.assertNotNull(productList19);
        org.junit.Assert.assertNull(order21);
        org.junit.Assert.assertNotNull(orderList22);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        org.example.Product product8 = productRepository0.findById((java.lang.Long) (-1L));
        boolean boolean10 = productRepository0.delete((java.lang.Long) (-1L));
        org.example.Product product12 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList13 = productRepository0.findAll();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(product8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(product12);
        org.junit.Assert.assertNotNull(productList13);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        org.example.Product product7 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList8 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList9 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList11 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        boolean boolean13 = productRepository0.delete((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNull(product7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        org.example.Product product8 = productRepository0.findById((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Product> productList11 = productRepository0.findAll();
        org.example.Product product13 = productRepository0.findById((java.lang.Long) 100L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = product13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
        org.junit.Assert.assertNull(product13);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
        org.example.Order order10 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList12 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNull(order10);
        org.junit.Assert.assertNotNull(productList12);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList9 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList11 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Product> productList12 = productRepository0.findSortedByName();
        org.example.Order order14 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(orderList7);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNull(order14);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList5 = productRepository0.findByKeyword("");
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        org.example.Order order9 = productRepository0.findOrderById((java.lang.Long) 1L);
        org.example.Order order11 = productRepository0.findOrderById((java.lang.Long) 0L);
        boolean boolean13 = productRepository0.delete((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList14 = productRepository0.findAll();
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
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("hi!");
        org.example.Product product8 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList9 = productRepository0.findAll();
        java.util.List<org.example.Product> productList11 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList13 = productRepository0.findByKeyword("hi!");
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
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(product8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList13);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList1 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList3 = productRepository0.findByKeyword("");
        boolean boolean5 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.util.List<org.example.Product> productList9 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        org.example.Order order10 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList9);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList9 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList11 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Product> productList12 = productRepository0.findSortedByName();
        boolean boolean14 = productRepository0.delete((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(orderList7);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Product product6 = productRepository0.findById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        java.lang.Class<?> wildcardClass8 = productRepository0.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(product6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList8 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Product> productList9 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList10 = productRepository0.findAll();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList10);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        boolean boolean9 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList11 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList12 = productRepository0.findSortedByName();
        boolean boolean14 = productRepository0.delete((java.lang.Long) (-1L));
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
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList4 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList7 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        boolean boolean9 = productRepository0.delete((java.lang.Long) (-1L));
        boolean boolean11 = productRepository0.delete((java.lang.Long) 0L);
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
        org.junit.Assert.assertNotNull(orderList4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList1 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList3 = productRepository0.findByKeyword("");
        boolean boolean5 = productRepository0.delete((java.lang.Long) 100L);
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
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        org.example.Product product5 = productRepository0.findById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList7 = productRepository0.findByKeyword("hi!");
        org.example.Product product9 = productRepository0.findById((java.lang.Long) 10L);
        boolean boolean11 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList13 = productRepository0.findByKeyword("");
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNull(product5);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(product9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(productList13);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList5 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList6 = productRepository0.findSortedByName();
        org.example.Product product8 = productRepository0.findById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        java.util.List<org.example.Product> productList11 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList13 = productRepository0.findByKeyword("");
        org.example.Product product15 = productRepository0.findById((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(product8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNull(product15);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
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
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(orderList7);
        org.junit.Assert.assertNotNull(orderList8);
        org.junit.Assert.assertNotNull(orderList9);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("hi!");
        org.example.Order order10 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList12 = productRepository0.findByKeyword("");
        org.example.Order order14 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList16 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Order> orderList17 = productRepository0.findAllOrders();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNull(order10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNull(order14);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertNotNull(orderList17);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        org.example.Product product7 = productRepository0.findById((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList9 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Product> productList11 = productRepository0.findByKeyword("");
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
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNull(product7);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList12);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        org.example.Product product8 = productRepository0.findById((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
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
        org.junit.Assert.assertNull(product8);
        org.junit.Assert.assertNotNull(productList10);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
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
        boolean boolean18 = productRepository0.delete((java.lang.Long) 10L);
        java.lang.Class<?> wildcardClass19 = productRepository0.getClass();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        boolean boolean4 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList9 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        org.example.Order order11 = productRepository0.findOrderById((java.lang.Long) 1L);
        org.example.Order order13 = productRepository0.findOrderById((java.lang.Long) 0L);
        org.example.Product product14 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product14);
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
        org.junit.Assert.assertNull(order11);
        org.junit.Assert.assertNull(order13);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        boolean boolean2 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList4 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.util.List<org.example.Product> productList9 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        java.util.List<org.example.Product> productList11 = productRepository0.findByKeyword("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
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
        java.util.List<org.example.Product> productList13 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList15 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList16 = productRepository0.findAll();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(orderList12);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNotNull(productList15);
        org.junit.Assert.assertNotNull(productList16);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList1 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        java.util.List<org.example.Product> productList4 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList5 = productRepository0.findAll();
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList5);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
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
        java.util.List<org.example.Product> productList17 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        java.util.List<org.example.Product> productList19 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(orderList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList15);
        org.junit.Assert.assertNotNull(productList17);
        org.junit.Assert.assertNotNull(productList19);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        boolean boolean6 = productRepository0.delete((java.lang.Long) (-1L));
        org.example.Product product8 = productRepository0.findById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList9 = productRepository0.findSortedByName();
        boolean boolean11 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList12 = productRepository0.findAll();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(product8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(productList12);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList1 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList3 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList5 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.util.List<org.example.Product> productList6 = productRepository0.findSortedByName();
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList6);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList1 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList3 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        boolean boolean5 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList9 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList9);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
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
        org.example.Order order17 = productRepository0.findOrderById((java.lang.Long) 1L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = order17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
        org.junit.Assert.assertNull(order17);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList7 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        org.example.Product product9 = productRepository0.findById((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList10 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList12 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        boolean boolean14 = productRepository0.delete((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(product9);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        boolean boolean4 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        org.example.Product product8 = productRepository0.findById((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList9 = productRepository0.findAllOrders();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNull(product8);
        org.junit.Assert.assertNotNull(orderList9);
        org.junit.Assert.assertNotNull(productList10);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        boolean boolean7 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList9 = productRepository0.findByKeyword("");
        java.util.List<org.example.Order> orderList10 = productRepository0.findAllOrders();
        boolean boolean12 = productRepository0.delete((java.lang.Long) 1L);
        boolean boolean14 = productRepository0.delete((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(orderList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList8 = productRepository0.findSortedByName();
        org.example.Order order10 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList11 = productRepository0.findAll();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNull(order10);
        org.junit.Assert.assertNotNull(productList11);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("hi!");
        org.example.Order order8 = productRepository0.findOrderById((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(order8);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        org.example.Order order8 = productRepository0.findOrderById((java.lang.Long) 100L);
        boolean boolean10 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList11 = productRepository0.findAll();
        org.example.Product product13 = productRepository0.findById((java.lang.Long) (-1L));
        org.example.Order order15 = productRepository0.findOrderById((java.lang.Long) (-1L));
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(order8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNull(product13);
        org.junit.Assert.assertNull(order15);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
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
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList5 = productRepository0.findByKeyword("");
        boolean boolean7 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList9 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        org.example.Product product11 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList13 = productRepository0.findByKeyword("hi!");
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNull(product11);
        org.junit.Assert.assertNotNull(productList13);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList3 = productRepository0.findAll();
        java.util.List<org.example.Product> productList4 = productRepository0.findAll();
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(orderList5);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        boolean boolean9 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList11 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order13 = productRepository0.findOrderById((java.lang.Long) 0L);
        boolean boolean15 = productRepository0.delete((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(orderList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNull(order13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        boolean boolean8 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        java.util.List<org.example.Product> productList11 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList12 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList14 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(productList7);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        java.util.List<org.example.Product> productList8 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList9 = productRepository0.findSortedByName();
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
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(orderList10);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
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
        org.example.Order order21 = productRepository0.findOrderById((java.lang.Long) 1L);
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
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        boolean boolean2 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList3 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList4 = productRepository0.findSortedByName();
        org.example.Product product6 = productRepository0.findById((java.lang.Long) 10L);
        org.example.Order order8 = productRepository0.findOrderById((java.lang.Long) (-1L));
        java.util.List<org.example.Order> orderList9 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList11 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNull(product6);
        org.junit.Assert.assertNull(order8);
        org.junit.Assert.assertNotNull(orderList9);
        org.junit.Assert.assertNotNull(productList11);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList4 = productRepository0.findAll();
        boolean boolean6 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList8 = productRepository0.findAll();
        java.util.List<org.example.Product> productList9 = productRepository0.findSortedByName();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList9);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList1 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList3 = productRepository0.findByKeyword("");
        boolean boolean5 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList8 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        java.util.List<org.example.Product> productList9 = productRepository0.findAll();
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList9);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
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
        org.example.Product product22 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product22);
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
        org.junit.Assert.assertNull(order21);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList9 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList11 = productRepository0.findByKeyword("hi!");
        org.example.Product product13 = productRepository0.findById((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList14 = productRepository0.findAllOrders();
        org.example.Product product16 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList17 = productRepository0.findAllOrders();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(orderList7);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNull(product13);
        org.junit.Assert.assertNotNull(orderList14);
        org.junit.Assert.assertNull(product16);
        org.junit.Assert.assertNotNull(orderList17);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        boolean boolean7 = productRepository0.delete((java.lang.Long) (-1L));
        boolean boolean9 = productRepository0.delete((java.lang.Long) 1L);
        java.util.List<org.example.Order> orderList10 = productRepository0.findAllOrders();
        org.example.Product product12 = productRepository0.findById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList14 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(orderList10);
        org.junit.Assert.assertNull(product12);
        org.junit.Assert.assertNotNull(productList14);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        java.util.List<org.example.Order> orderList8 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList9 = productRepository0.findSortedByName();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(orderList8);
        org.junit.Assert.assertNotNull(productList9);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        boolean boolean6 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Product> productList9 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList11 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList13 = productRepository0.findByKeyword("hi!");
        org.example.Order order15 = productRepository0.findOrderById((java.lang.Long) 1L);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNull(order15);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList1 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList3 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        boolean boolean5 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        org.example.Order order7 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
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
        java.util.List<org.example.Product> productList16 = productRepository0.findAll();
        org.example.Product product18 = productRepository0.findById((java.lang.Long) 1L);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(order9);
        org.junit.Assert.assertNull(order11);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNotNull(productList15);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertNull(product18);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Product product9 = productRepository0.findById((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList11 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.util.List<org.example.Product> productList13 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
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
        org.junit.Assert.assertNull(product9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList13);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList1 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList3 = productRepository0.findByKeyword("");
        boolean boolean5 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.util.List<org.example.Product> productList9 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList11 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.util.List<org.example.Product> productList13 = productRepository0.findByKeyword("");
        java.util.List<org.example.Order> orderList14 = productRepository0.findAllOrders();
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNotNull(orderList14);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList6 = productRepository0.findSortedByName();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList6);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        boolean boolean7 = productRepository0.delete((java.lang.Long) (-1L));
        boolean boolean9 = productRepository0.delete((java.lang.Long) 1L);
        org.example.Product product11 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList12 = productRepository0.findAll();
        org.example.Product product14 = productRepository0.findById((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(product11);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNull(product14);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList1 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList3 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        boolean boolean5 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        org.example.Order order8 = productRepository0.findOrderById((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList10 = productRepository0.findByKeyword("hi!");
        org.example.Product product12 = productRepository0.findById((java.lang.Long) (-1L));
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNull(order8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNull(product12);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList2 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        org.example.Product product5 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        org.example.Order order8 = productRepository0.findOrderById((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList9 = productRepository0.findSortedByName();
        org.example.Order order11 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Product product13 = productRepository0.findById((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(orderList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNull(product5);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNull(order8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNull(order11);
        org.junit.Assert.assertNull(product13);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList5 = productRepository0.findByKeyword("");
        boolean boolean7 = productRepository0.delete((java.lang.Long) 10L);
        org.example.Order order9 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList10 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList11 = productRepository0.findAllOrders();
        org.example.Order order13 = productRepository0.findOrderById((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(order9);
        org.junit.Assert.assertNotNull(orderList10);
        org.junit.Assert.assertNotNull(orderList11);
        org.junit.Assert.assertNull(order13);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
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
        org.example.Order order20 = productRepository0.findOrderById((java.lang.Long) 10L);
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
        org.junit.Assert.assertNull(order20);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        boolean boolean9 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList10 = productRepository0.findSortedByName();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(orderList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(productList10);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList8 = productRepository0.findSortedByName();
        org.example.Product product9 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product9);
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
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
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
        java.util.List<org.example.Product> productList15 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.util.List<org.example.Order> orderList16 = productRepository0.findAllOrders();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(orderList11);
        org.junit.Assert.assertNull(order13);
        org.junit.Assert.assertNotNull(productList15);
        org.junit.Assert.assertNotNull(orderList16);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        org.example.Product product7 = productRepository0.findById((java.lang.Long) 1L);
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
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNull(product7);
        org.junit.Assert.assertNotNull(orderList8);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        org.example.Product product7 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList8 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Product> productList12 = productRepository0.findByKeyword("");
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNull(product7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Product product9 = productRepository0.findById((java.lang.Long) 100L);
        boolean boolean11 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList12 = productRepository0.findAllOrders();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(product9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(orderList12);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("hi!");
        org.example.Product product8 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList9 = productRepository0.findAll();
        org.example.Order order11 = productRepository0.findOrderById((java.lang.Long) 100L);
        org.example.Product product13 = productRepository0.findById((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(product8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNull(order11);
        org.junit.Assert.assertNull(product13);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        org.example.Product product8 = productRepository0.findById((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList9 = productRepository0.findAll();
        org.example.Product product11 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList12 = productRepository0.findAll();
        java.util.List<org.example.Product> productList13 = productRepository0.findSortedByName();
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
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList13);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList5 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList6 = productRepository0.findSortedByName();
        boolean boolean8 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList9 = productRepository0.findAllOrders();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(orderList9);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList2 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        org.example.Product product5 = productRepository0.findById((java.lang.Long) 0L);
        boolean boolean7 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList9 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.util.List<org.example.Product> productList11 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        boolean boolean13 = productRepository0.delete((java.lang.Long) (-1L));
        boolean boolean15 = productRepository0.delete((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(orderList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNull(product5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        boolean boolean7 = productRepository0.delete((java.lang.Long) (-1L));
        boolean boolean9 = productRepository0.delete((java.lang.Long) 1L);
        org.example.Product product11 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList12 = productRepository0.findAll();
        java.util.List<org.example.Order> orderList13 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList14 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList15 = productRepository0.findSortedByName();
        boolean boolean17 = productRepository0.delete((java.lang.Long) 100L);
        boolean boolean19 = productRepository0.delete((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(product11);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(orderList13);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList2 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        org.example.Product product5 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        org.example.Order order8 = productRepository0.findOrderById((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList9 = productRepository0.findSortedByName();
        org.example.Order order11 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList13 = productRepository0.findByKeyword("");
        boolean boolean15 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList17 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Product> productList18 = productRepository0.findAll();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(orderList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNull(product5);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNull(order8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNull(order11);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(productList17);
        org.junit.Assert.assertNotNull(productList18);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList4 = productRepository0.findAll();
        boolean boolean6 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList8 = productRepository0.findAll();
        org.example.Product product10 = productRepository0.findById((java.lang.Long) 100L);
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
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNull(product10);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
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
        org.example.Product product17 = productRepository0.findById((java.lang.Long) 10L);
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
        org.junit.Assert.assertNull(product17);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        boolean boolean8 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        java.util.List<org.example.Product> productList11 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList12 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList13 = productRepository0.findAll();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList13);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList2 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        org.example.Product product5 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findSortedByName();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(orderList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNull(product5);
        org.junit.Assert.assertNotNull(productList6);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList6 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        org.example.Order order9 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList11 = productRepository0.findByKeyword("");
        java.lang.Class<?> wildcardClass12 = productRepository0.getClass();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(order9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
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
        org.example.Product product19 = productRepository0.findById((java.lang.Long) 10L);
        java.lang.Class<?> wildcardClass20 = productRepository0.getClass();
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
        org.junit.Assert.assertNull(product19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
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
        java.util.List<org.example.Product> productList20 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
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
        org.junit.Assert.assertNotNull(productList20);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
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
        boolean boolean18 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList20 = productRepository0.findByKeyword("");
        boolean boolean22 = productRepository0.delete((java.lang.Long) (-1L));
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findAll();
        java.util.List<org.example.Product> productList6 = productRepository0.findAll();
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        org.example.Order order9 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(order9);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList1 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList3 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Product> productList4 = productRepository0.findAll();
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("hi!");
        org.example.Product product7 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        boolean boolean8 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        java.util.List<org.example.Product> productList11 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList12 = productRepository0.findSortedByName();
        org.example.Product product14 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList15 = productRepository0.findAllOrders();
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
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNull(product14);
        org.junit.Assert.assertNotNull(orderList15);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
        boolean boolean10 = productRepository0.delete((java.lang.Long) 10L);
        org.example.Product product12 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList14 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
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
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        boolean boolean7 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList9 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList11 = productRepository0.findByKeyword("hi!");
        boolean boolean13 = productRepository0.delete((java.lang.Long) 100L);
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
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList5 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList6 = productRepository0.findSortedByName();
        boolean boolean8 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList9 = productRepository0.findAll();
        java.util.List<org.example.Product> productList11 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList12 = productRepository0.findAll();
        java.util.List<org.example.Product> productList14 = productRepository0.findByKeyword("hi!");
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
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
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
        org.example.Order order22 = productRepository0.findOrderById((java.lang.Long) 1L);
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
        org.junit.Assert.assertNull(order22);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList8 = productRepository0.findAllOrders();
        org.example.Product product10 = productRepository0.findById((java.lang.Long) 1L);
        org.example.Order order12 = productRepository0.findOrderById((java.lang.Long) (-1L));
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
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(orderList7);
        org.junit.Assert.assertNotNull(orderList8);
        org.junit.Assert.assertNull(product10);
        org.junit.Assert.assertNull(order12);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        org.example.Product product7 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList8 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList9 = productRepository0.findSortedByName();
        boolean boolean11 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList13 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Product> productList14 = productRepository0.findAll();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNull(product7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNotNull(productList14);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
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
        java.lang.Class<?> wildcardClass16 = productRepository0.getClass();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(orderList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        boolean boolean2 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList4 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList6 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList9 = productRepository0.findSortedByName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList9);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        boolean boolean4 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList9 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        org.example.Order order11 = productRepository0.findOrderById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList13 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.lang.Class<?> wildcardClass14 = productList13.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNull(order11);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        boolean boolean7 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList9 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList10 = productRepository0.findAll();
        java.util.List<org.example.Product> productList12 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Order> orderList13 = productRepository0.findAllOrders();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(orderList13);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList2 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        org.example.Product product5 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Product product7 = productRepository0.findById((java.lang.Long) (-1L));
        org.example.Order order9 = productRepository0.findOrderById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList11 = productRepository0.findByKeyword("hi!");
        boolean boolean13 = productRepository0.delete((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(orderList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNull(product5);
        org.junit.Assert.assertNull(product7);
        org.junit.Assert.assertNull(order9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList8 = productRepository0.findAllOrders();
        boolean boolean10 = productRepository0.delete((java.lang.Long) 10L);
        org.example.Order order12 = productRepository0.findOrderById((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(orderList7);
        org.junit.Assert.assertNotNull(orderList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(order12);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        boolean boolean7 = productRepository0.delete((java.lang.Long) (-1L));
        boolean boolean9 = productRepository0.delete((java.lang.Long) 1L);
        org.example.Product product11 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList12 = productRepository0.findAll();
        java.util.List<org.example.Order> orderList13 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList14 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList15 = productRepository0.findSortedByName();
        boolean boolean17 = productRepository0.delete((java.lang.Long) 100L);
        java.lang.Class<?> wildcardClass18 = productRepository0.getClass();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(product11);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(orderList13);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList5 = productRepository0.findByKeyword("");
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order12 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList13 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList14 = productRepository0.findAll();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNull(order12);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNotNull(productList14);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
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
        boolean boolean18 = productRepository0.delete((java.lang.Long) 100L);
        org.example.Product product20 = productRepository0.findById((java.lang.Long) 10L);
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
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        org.example.Product product8 = productRepository0.findById((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList9 = productRepository0.findAll();
        java.util.List<org.example.Product> productList10 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList11 = productRepository0.findAll();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(product8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList11);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        org.example.Product product8 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order10 = productRepository0.findOrderById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList11 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList13 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList14 = productRepository0.findSortedByName();
        boolean boolean16 = productRepository0.delete((java.lang.Long) 10L);
        org.example.Product product18 = productRepository0.findById((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(product8);
        org.junit.Assert.assertNull(order10);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(product18);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList8 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList9 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList10 = productRepository0.findAll();
        org.example.Order order12 = productRepository0.findOrderById((java.lang.Long) 10L);
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
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(orderList7);
        org.junit.Assert.assertNotNull(orderList8);
        org.junit.Assert.assertNotNull(orderList9);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNull(order12);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        org.example.Product product5 = productRepository0.findById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList7 = productRepository0.findByKeyword("hi!");
        org.example.Product product9 = productRepository0.findById((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList11 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNull(product5);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(product9);
        org.junit.Assert.assertNotNull(productList11);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList5 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList6 = productRepository0.findSortedByName();
        org.example.Product product8 = productRepository0.findById((java.lang.Long) 1L);
        org.example.Order order10 = productRepository0.findOrderById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList11 = productRepository0.findAllOrders();
        boolean boolean13 = productRepository0.delete((java.lang.Long) 100L);
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
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(product8);
        org.junit.Assert.assertNull(order10);
        org.junit.Assert.assertNotNull(orderList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList8 = productRepository0.findAllOrders();
        org.example.Product product10 = productRepository0.findById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList12 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(orderList7);
        org.junit.Assert.assertNotNull(orderList8);
        org.junit.Assert.assertNull(product10);
        org.junit.Assert.assertNotNull(productList12);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
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
        java.util.List<org.example.Product> productList13 = productRepository0.findAll();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNull(product7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList13);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        boolean boolean6 = productRepository0.delete((java.lang.Long) 0L);
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
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
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
        java.util.List<org.example.Product> productList18 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Product> productList20 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
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
        org.junit.Assert.assertNotNull(productList18);
        org.junit.Assert.assertNotNull(productList20);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        org.example.Order order8 = productRepository0.findOrderById((java.lang.Long) 0L);
        org.example.Order order10 = productRepository0.findOrderById((java.lang.Long) 1L);
        java.util.List<org.example.Order> orderList11 = productRepository0.findAllOrders();
        boolean boolean13 = productRepository0.delete((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNull(order8);
        org.junit.Assert.assertNull(order10);
        org.junit.Assert.assertNotNull(orderList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList8 = productRepository0.findAll();
        org.example.Product product10 = productRepository0.findById((java.lang.Long) 1L);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNull(product10);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        org.example.Product product9 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Product product11 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList13 = productRepository0.findByKeyword("");
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
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(orderList7);
        org.junit.Assert.assertNull(product9);
        org.junit.Assert.assertNull(product11);
        org.junit.Assert.assertNotNull(productList13);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
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
        java.util.List<org.example.Product> productList20 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
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
        org.junit.Assert.assertNotNull(productList20);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
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
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(orderList7);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        boolean boolean9 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Order> orderList10 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList12 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        org.example.Product product14 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList15 = productRepository0.findAll();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(orderList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNull(product14);
        org.junit.Assert.assertNotNull(productList15);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
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
        org.example.Product product18 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList20 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
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
        org.junit.Assert.assertNull(product18);
        org.junit.Assert.assertNotNull(productList20);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        boolean boolean9 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList10 = productRepository0.findAll();
        java.util.List<org.example.Product> productList12 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        boolean boolean14 = productRepository0.delete((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Product> productList3 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList4 = productRepository0.findAll();
        boolean boolean6 = productRepository0.delete((java.lang.Long) (-1L));
        org.example.Order order8 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        java.util.List<org.example.Product> productList12 = productRepository0.findByKeyword("");
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(order8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList8 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.util.List<org.example.Product> productList10 = productRepository0.findByKeyword("");
        org.example.Order order12 = productRepository0.findOrderById((java.lang.Long) 10L);
        boolean boolean14 = productRepository0.delete((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList16 = productRepository0.findByKeyword("");
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNull(order12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(productList16);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList4 = productRepository0.findAll();
        boolean boolean6 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        org.example.Order order9 = productRepository0.findOrderById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList10 = productRepository0.findAllOrders();
        boolean boolean12 = productRepository0.delete((java.lang.Long) (-1L));
        org.example.Product product14 = productRepository0.findById((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(orderList7);
        org.junit.Assert.assertNull(order9);
        org.junit.Assert.assertNotNull(orderList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(product14);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
        boolean boolean10 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList11 = productRepository0.findAll();
        boolean boolean13 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList14 = productRepository0.findAll();
        java.util.List<org.example.Product> productList15 = productRepository0.findSortedByName();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList15);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Order order9 = productRepository0.findOrderById((java.lang.Long) 1L);
        org.example.Product product11 = productRepository0.findById((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList13 = productRepository0.findByKeyword("");
        java.util.List<org.example.Order> orderList14 = productRepository0.findAllOrders();
        org.example.Product product15 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product15);
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
        org.junit.Assert.assertNotNull(orderList14);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
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
        java.util.List<org.example.Product> productList14 = productRepository0.findAll();
        java.lang.Class<?> wildcardClass15 = productRepository0.getClass();
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
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        org.example.Product product8 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order10 = productRepository0.findOrderById((java.lang.Long) 1L);
        org.example.Product product12 = productRepository0.findById((java.lang.Long) (-1L));
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(product8);
        org.junit.Assert.assertNull(order10);
        org.junit.Assert.assertNull(product12);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
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
        org.example.Order order15 = productRepository0.findOrderById((java.lang.Long) 1L);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(orderList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNull(order15);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("hi!");
        org.example.Product product8 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList9 = productRepository0.findAll();
        org.example.Order order11 = productRepository0.findOrderById((java.lang.Long) 100L);
        org.example.Order order13 = productRepository0.findOrderById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList14 = productRepository0.findAll();
        java.lang.Class<?> wildcardClass15 = productRepository0.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(product8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNull(order11);
        org.junit.Assert.assertNull(order13);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        org.example.Product product9 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Product product11 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList13 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList14 = productRepository0.findSortedByName();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(orderList7);
        org.junit.Assert.assertNull(product9);
        org.junit.Assert.assertNull(product11);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNotNull(productList14);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("hi!");
        org.example.Product product8 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        java.util.List<org.example.Product> productList11 = productRepository0.findAll();
        boolean boolean13 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Order> orderList14 = productRepository0.findAllOrders();
        java.lang.Class<?> wildcardClass15 = orderList14.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(product8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(orderList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
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
        boolean boolean19 = productRepository0.delete((java.lang.Long) 0L);
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        boolean boolean2 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList3 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList4 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNotNull(orderList4);
        org.junit.Assert.assertNotNull(orderList5);
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        boolean boolean2 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList3 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList4 = productRepository0.findAll();
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        org.example.Order order7 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        boolean boolean8 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Order> orderList9 = productRepository0.findAllOrders();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(orderList9);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
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
        boolean boolean16 = productRepository0.delete((java.lang.Long) (-1L));
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(orderList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        org.example.Order order7 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.lang.Class<?> wildcardClass8 = productRepository0.getClass();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNull(order7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        org.example.Order order9 = productRepository0.findOrderById((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList10 = productRepository0.findAll();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(orderList7);
        org.junit.Assert.assertNull(order9);
        org.junit.Assert.assertNotNull(productList10);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
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
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(orderList10);
        org.junit.Assert.assertNull(product12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList8 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        boolean boolean10 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList11 = productRepository0.findAllOrders();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(orderList11);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
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
        java.util.List<org.example.Product> productList18 = productRepository0.findSortedByName();
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
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
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
        org.example.Order order18 = productRepository0.findOrderById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList20 = productRepository0.findByKeyword("hi!");
        org.example.Product product21 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product21);
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
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertNull(order18);
        org.junit.Assert.assertNotNull(productList20);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        org.example.Product product8 = productRepository0.findById((java.lang.Long) (-1L));
        org.example.Product product10 = productRepository0.findById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList11 = productRepository0.findAll();
        java.util.List<org.example.Product> productList13 = productRepository0.findByKeyword("hi!");
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNull(product8);
        org.junit.Assert.assertNull(product10);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList13);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("hi!");
        org.example.Product product8 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList9 = productRepository0.findAll();
        java.util.List<org.example.Product> productList11 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList13 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Product> productList14 = productRepository0.findSortedByName();
        boolean boolean16 = productRepository0.delete((java.lang.Long) 10L);
        boolean boolean18 = productRepository0.delete((java.lang.Long) 1L);
        boolean boolean20 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList21 = productRepository0.findSortedByName();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(product8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(productList21);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
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
        java.util.List<org.example.Product> productList12 = productRepository0.findSortedByName();
        boolean boolean14 = productRepository0.delete((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNull(product7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(orderList9);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList8 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList10 = productRepository0.findByKeyword("");
        org.example.Order order12 = productRepository0.findOrderById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList13 = productRepository0.findAll();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNull(order12);
        org.junit.Assert.assertNotNull(productList13);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        boolean boolean2 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList3 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList4 = productRepository0.findSortedByName();
        org.example.Product product6 = productRepository0.findById((java.lang.Long) 10L);
        org.example.Order order8 = productRepository0.findOrderById((java.lang.Long) (-1L));
        boolean boolean10 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList12 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Product> productList14 = productRepository0.findByKeyword("hi!");
        java.lang.Class<?> wildcardClass15 = productList14.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNull(product6);
        org.junit.Assert.assertNull(order8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
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
        org.example.Product product17 = productRepository0.findById((java.lang.Long) 100L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = product17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNotNull(productList15);
        org.junit.Assert.assertNull(product17);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList2 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        org.example.Product product5 = productRepository0.findById((java.lang.Long) 0L);
        boolean boolean7 = productRepository0.delete((java.lang.Long) 100L);
        boolean boolean9 = productRepository0.delete((java.lang.Long) (-1L));
        org.example.Product product11 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList13 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
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
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList7 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Product> productList8 = productRepository0.findAll();
        java.util.List<org.example.Product> productList9 = productRepository0.findAll();
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
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList10);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("hi!");
        org.example.Product product8 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList9 = productRepository0.findAll();
        java.util.List<org.example.Product> productList11 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList12 = productRepository0.findAll();
        org.example.Product product14 = productRepository0.findById((java.lang.Long) (-1L));
        org.example.Order order15 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order15);
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
        org.junit.Assert.assertNull(product14);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList3 = productRepository0.findAll();
        java.util.List<org.example.Product> productList4 = productRepository0.findAll();
        org.example.Product product6 = productRepository0.findById((java.lang.Long) (-1L));
        org.example.Product product8 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList10 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList12 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNull(product6);
        org.junit.Assert.assertNull(product8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList5 = productRepository0.findByKeyword("");
        boolean boolean7 = productRepository0.delete((java.lang.Long) 10L);
        org.example.Order order9 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList10 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList11 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList13 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(order9);
        org.junit.Assert.assertNotNull(orderList10);
        org.junit.Assert.assertNotNull(orderList11);
        org.junit.Assert.assertNotNull(productList13);
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        boolean boolean2 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList4 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) (-1L));
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        org.example.Product product9 = productRepository0.findById((java.lang.Long) 1L);
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
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(orderList7);
        org.junit.Assert.assertNull(product9);
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        org.example.Product product5 = productRepository0.findById((java.lang.Long) 1L);
        boolean boolean7 = productRepository0.delete((java.lang.Long) 100L);
        org.example.Order order9 = productRepository0.findOrderById((java.lang.Long) 100L);
        org.example.Product product11 = productRepository0.findById((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNull(product5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(order9);
        org.junit.Assert.assertNull(product11);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList9 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList11 = productRepository0.findByKeyword("hi!");
        org.example.Product product13 = productRepository0.findById((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList15 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        org.example.Order order17 = productRepository0.findOrderById((java.lang.Long) 0L);
        org.example.Order order18 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(orderList7);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNull(product13);
        org.junit.Assert.assertNotNull(productList15);
        org.junit.Assert.assertNull(order17);
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList8 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.util.List<org.example.Product> productList10 = productRepository0.findByKeyword("");
        org.example.Order order12 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList14 = productRepository0.findByKeyword("");
        org.example.Order order16 = productRepository0.findOrderById((java.lang.Long) 100L);
        boolean boolean18 = productRepository0.delete((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNull(order12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNull(order16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Product product9 = productRepository0.findById((java.lang.Long) 100L);
        boolean boolean11 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList12 = productRepository0.findAll();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(product9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(productList12);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        java.util.List<org.example.Product> productList9 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList9);
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Product product6 = productRepository0.findById((java.lang.Long) 1L);
        boolean boolean8 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList10 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList11 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList13 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList15 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Product> productList17 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(product6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNotNull(productList15);
        org.junit.Assert.assertNotNull(productList17);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList7 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Product> productList8 = productRepository0.findAll();
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
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(orderList9);
        org.junit.Assert.assertNotNull(productList10);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        org.example.Product product5 = productRepository0.findById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList7 = productRepository0.findByKeyword("hi!");
        org.example.Product product9 = productRepository0.findById((java.lang.Long) 10L);
        boolean boolean11 = productRepository0.delete((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNull(product5);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(product9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList1 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList3 = productRepository0.findByKeyword("");
        boolean boolean5 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.util.List<org.example.Product> productList9 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList11 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        java.util.List<org.example.Order> orderList12 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList14 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Product> productList15 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList16 = productRepository0.findAllOrders();
        java.lang.Class<?> wildcardClass17 = orderList16.getClass();
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(orderList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList15);
        org.junit.Assert.assertNotNull(orderList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList4 = productRepository0.findAllOrders();
        org.example.Product product6 = productRepository0.findById((java.lang.Long) 10L);
        org.example.Product product8 = productRepository0.findById((java.lang.Long) 1L);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(orderList4);
        org.junit.Assert.assertNull(product6);
        org.junit.Assert.assertNull(product8);
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        boolean boolean4 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        org.example.Product product7 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList9 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        java.lang.Class<?> wildcardClass10 = productRepository0.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNull(product7);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList8 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order10 = productRepository0.findOrderById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList12 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNull(order10);
        org.junit.Assert.assertNotNull(productList12);
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
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
        java.util.List<org.example.Product> productList15 = productRepository0.findByKeyword("hi!");
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(orderList11);
        org.junit.Assert.assertNull(order13);
        org.junit.Assert.assertNotNull(productList15);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList4 = productRepository0.findAll();
        boolean boolean6 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        org.example.Order order9 = productRepository0.findOrderById((java.lang.Long) 0L);
        boolean boolean11 = productRepository0.delete((java.lang.Long) 0L);
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
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(orderList7);
        org.junit.Assert.assertNull(order9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList2 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList3 = productRepository0.findAll();
        java.util.List<org.example.Product> productList4 = productRepository0.findSortedByName();
        org.example.Product product6 = productRepository0.findById((java.lang.Long) (-1L));
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(orderList2);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNull(product6);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        boolean boolean8 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList9 = productRepository0.findAll();
        org.example.Product product11 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList12 = productRepository0.findSortedByName();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNull(product11);
        org.junit.Assert.assertNotNull(productList12);
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Product product6 = productRepository0.findById((java.lang.Long) 1L);
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
        org.junit.Assert.assertNull(product6);
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList8 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.util.List<org.example.Product> productList10 = productRepository0.findByKeyword("");
        org.example.Order order12 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Product product14 = productRepository0.findById((java.lang.Long) (-1L));
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
        org.junit.Assert.assertNull(product14);
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Product product9 = productRepository0.findById((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList11 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.util.List<org.example.Product> productList13 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.util.List<org.example.Product> productList15 = productRepository0.findByKeyword("hi!");
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
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList6 = productRepository0.findSortedByName();
        org.example.Order order8 = productRepository0.findOrderById((java.lang.Long) 1L);
        org.example.Product product10 = productRepository0.findById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList11 = productRepository0.findAll();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(order8);
        org.junit.Assert.assertNull(product10);
        org.junit.Assert.assertNotNull(productList11);
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList1 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList3 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList4 = productRepository0.findAll();
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        org.example.Product product9 = productRepository0.findById((java.lang.Long) 1L);
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(orderList7);
        org.junit.Assert.assertNull(product9);
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
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
        java.util.List<org.example.Order> orderList22 = productRepository0.findAllOrders();
        boolean boolean24 = productRepository0.delete((java.lang.Long) 100L);
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
        org.junit.Assert.assertNotNull(orderList22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }
}

