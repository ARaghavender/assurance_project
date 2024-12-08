package tests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest12 {

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
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Product> productList8 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList9 = productRepository0.findAll();
        java.util.List<org.example.Product> productList11 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        boolean boolean9 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList10 = productRepository0.findSortedByName();
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
        org.junit.Assert.assertNotNull(productList10);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList4 = productRepository0.findAllOrders();
        org.example.Product product6 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order8 = productRepository0.findOrderById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList9 = productRepository0.findSortedByName();
        java.lang.Class<?> wildcardClass10 = productRepository0.getClass();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(orderList4);
        org.junit.Assert.assertNull(product6);
        org.junit.Assert.assertNull(order8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList8 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList9 = productRepository0.findAllOrders();
        org.example.Order order11 = productRepository0.findOrderById((java.lang.Long) 1L);
        org.example.Order order12 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order12);
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
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        boolean boolean4 = productRepository0.delete((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList9 = productRepository0.findByKeyword("hi!");
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList9);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList5 = productRepository0.findByKeyword("");
        org.example.Order order7 = productRepository0.findOrderById((java.lang.Long) 0L);
        org.example.Product product9 = productRepository0.findById((java.lang.Long) 1L);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNull(order7);
        org.junit.Assert.assertNull(product9);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        java.util.List<org.example.Product> productList9 = productRepository0.findByKeyword("");
        org.example.Order order11 = productRepository0.findOrderById((java.lang.Long) (-1L));
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
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNull(order11);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Product product6 = productRepository0.findById((java.lang.Long) 1L);
        boolean boolean8 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        java.util.List<org.example.Product> productList11 = productRepository0.findAll();
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
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
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
        java.lang.Class<?> wildcardClass17 = productRepository0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList4 = productRepository0.findSortedByName();
        org.example.Product product6 = productRepository0.findById((java.lang.Long) 10L);
        org.example.Product product8 = productRepository0.findById((java.lang.Long) 10L);
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
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNull(product6);
        org.junit.Assert.assertNull(product8);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
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
        org.example.Order order22 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order22);
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
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList8 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.util.List<org.example.Product> productList10 = productRepository0.findByKeyword("");
        org.example.Order order12 = productRepository0.findOrderById((java.lang.Long) 10L);
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
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNull(order12);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
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
        java.util.List<org.example.Product> productList13 = productRepository0.findAll();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(orderList11);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList13);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Product product9 = productRepository0.findById((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList11 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
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
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList2 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        org.example.Product product5 = productRepository0.findById((java.lang.Long) 0L);
        boolean boolean7 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList9 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList10 = productRepository0.findAll();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(orderList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNull(product5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList10);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        boolean boolean6 = productRepository0.delete((java.lang.Long) (-1L));
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
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(orderList7);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
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
        org.example.Product product17 = productRepository0.findById((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(order9);
        org.junit.Assert.assertNull(order11);
        org.junit.Assert.assertNull(order13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(product17);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findByKeyword("hi!");
        org.example.Order order9 = productRepository0.findOrderById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList11 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        boolean boolean13 = productRepository0.delete((java.lang.Long) (-1L));
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(order9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList9 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList11 = productRepository0.findByKeyword("hi!");
        org.example.Product product13 = productRepository0.findById((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList15 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Product> productList16 = productRepository0.findSortedByName();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(orderList7);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNull(product13);
        org.junit.Assert.assertNotNull(productList15);
        org.junit.Assert.assertNotNull(productList16);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
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
        org.example.Product product18 = productRepository0.findById((java.lang.Long) 100L);
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
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertNull(product18);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 10L);
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
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNull(order8);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        boolean boolean4 = productRepository0.delete((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        java.util.List<org.example.Product> productList8 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList9);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
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
        java.lang.Class<?> wildcardClass17 = productRepository0.getClass();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNull(order12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNull(order16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
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
        org.junit.Assert.assertNotNull(productList15);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList2 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        org.example.Product product5 = productRepository0.findById((java.lang.Long) 0L);
        boolean boolean7 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList8 = productRepository0.findAll();
        org.example.Order order9 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(orderList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNull(product5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(productList8);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        boolean boolean8 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        java.util.List<org.example.Product> productList12 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        boolean boolean4 = productRepository0.delete((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList8 = productRepository0.findAll();
        org.example.Product product9 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(orderList7);
        org.junit.Assert.assertNotNull(productList8);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        boolean boolean9 = productRepository0.delete((java.lang.Long) 0L);
        org.example.Order order11 = productRepository0.findOrderById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList13 = productRepository0.findByKeyword("");
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
        org.junit.Assert.assertNull(order11);
        org.junit.Assert.assertNotNull(productList13);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        boolean boolean4 = productRepository0.delete((java.lang.Long) 0L);
        boolean boolean6 = productRepository0.delete((java.lang.Long) 10L);
        org.example.Order order8 = productRepository0.findOrderById((java.lang.Long) (-1L));
        org.example.Product product10 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList12 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(order8);
        org.junit.Assert.assertNull(product10);
        org.junit.Assert.assertNotNull(productList12);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        boolean boolean8 = productRepository0.delete((java.lang.Long) (-1L));
        boolean boolean10 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList12 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(productList12);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        org.example.Product product7 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList8 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList9 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList10 = productRepository0.findAll();
        java.util.List<org.example.Product> productList12 = productRepository0.findByKeyword("hi!");
        java.lang.Class<?> wildcardClass13 = productList12.getClass();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNull(product7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findByKeyword("hi!");
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
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findAll();
        org.example.Product product7 = productRepository0.findById((java.lang.Long) 10L);
        org.example.Product product9 = productRepository0.findById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList10 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList11 = productRepository0.findAll();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNull(product7);
        org.junit.Assert.assertNull(product9);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList11);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList9 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList11 = productRepository0.findByKeyword("hi!");
        org.example.Product product13 = productRepository0.findById((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList14 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList15 = productRepository0.findAll();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(orderList7);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNull(product13);
        org.junit.Assert.assertNotNull(orderList14);
        org.junit.Assert.assertNotNull(productList15);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
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
        java.util.List<org.example.Product> productList18 = productRepository0.findAll();
        java.util.List<org.example.Product> productList19 = productRepository0.findSortedByName();
        boolean boolean21 = productRepository0.delete((java.lang.Long) (-1L));
        org.example.Product product22 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product22);
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
        org.junit.Assert.assertNotNull(productList18);
        org.junit.Assert.assertNotNull(productList19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
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
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(productList18);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        org.example.Product product8 = productRepository0.findById((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Product> productList12 = productRepository0.findByKeyword("hi!");
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(product8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        boolean boolean8 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        org.example.Product product12 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList14 = productRepository0.findByKeyword("hi!");
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNull(product12);
        org.junit.Assert.assertNotNull(productList14);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        java.util.List<org.example.Product> productList9 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList11 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Order> orderList12 = productRepository0.findAllOrders();
        org.example.Order order14 = productRepository0.findOrderById((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(orderList12);
        org.junit.Assert.assertNull(order14);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
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
        java.util.List<org.example.Product> productList27 = productRepository0.findByKeyword("");
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
        org.junit.Assert.assertNotNull(productList27);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
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
        boolean boolean17 = productRepository0.delete((java.lang.Long) 0L);
        org.example.Order order18 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order18);
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
        org.junit.Assert.assertNotNull(orderList15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Product product6 = productRepository0.findById((java.lang.Long) 1L);
        boolean boolean8 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        org.example.Product product12 = productRepository0.findById((java.lang.Long) 10L);
        org.example.Order order14 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList15 = productRepository0.findAll();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(product6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNull(product12);
        org.junit.Assert.assertNull(order14);
        org.junit.Assert.assertNotNull(productList15);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList8 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        org.example.Order order10 = productRepository0.findOrderById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList12 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList14 = productRepository0.findByKeyword("hi!");
        java.lang.Class<?> wildcardClass15 = productList14.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNull(order10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList5 = productRepository0.findByKeyword("");
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList8 = productRepository0.findAll();
        java.util.List<org.example.Product> productList9 = productRepository0.findSortedByName();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(orderList7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList9);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        boolean boolean2 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList4 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList5 = productRepository0.findAll();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList5);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
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
        org.example.Order order25 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order25);
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
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        boolean boolean8 = productRepository0.delete((java.lang.Long) 100L);
        org.example.Product product10 = productRepository0.findById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList11 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList13 = productRepository0.findByKeyword("hi!");
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(product10);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList13);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Product product6 = productRepository0.findById((java.lang.Long) 1L);
        boolean boolean8 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        boolean boolean12 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList13 = productRepository0.findSortedByName();
        org.example.Product product14 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(product6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(productList13);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Product product6 = productRepository0.findById((java.lang.Long) 1L);
        boolean boolean8 = productRepository0.delete((java.lang.Long) 0L);
        org.example.Order order10 = productRepository0.findOrderById((java.lang.Long) 0L);
        org.example.Order order12 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList13 = productRepository0.findAllOrders();
        org.example.Product product14 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product14);
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
        org.junit.Assert.assertNotNull(orderList13);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        org.example.Product product7 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList8 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList9 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList10 = productRepository0.findAll();
        org.example.Order order12 = productRepository0.findOrderById((java.lang.Long) 0L);
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
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
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
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNull(product7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNull(order12);
        org.junit.Assert.assertNotNull(orderList13);
        org.junit.Assert.assertNull(order15);
        org.junit.Assert.assertNotNull(productList16);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList8 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        java.util.List<org.example.Product> productList12 = productRepository0.findByKeyword("hi!");
        org.example.Product product14 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList16 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNull(product14);
        org.junit.Assert.assertNotNull(productList16);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        org.example.Product product7 = productRepository0.findById((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList9 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Product> productList11 = productRepository0.findByKeyword("");
        org.example.Product product13 = productRepository0.findById((java.lang.Long) 10L);
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
        org.junit.Assert.assertNull(product7);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNull(product13);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
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
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNull(order10);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 10L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 10L);
        boolean boolean8 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Order> orderList9 = productRepository0.findAllOrders();
        boolean boolean11 = productRepository0.delete((java.lang.Long) (-1L));
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(orderList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
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
        org.example.Product product26 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product26);
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
        org.junit.Assert.assertNull(order24);
        org.junit.Assert.assertNotNull(orderList25);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList9 = productRepository0.findByKeyword("");
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(orderList7);
        org.junit.Assert.assertNotNull(productList9);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList4 = productRepository0.findAll();
        boolean boolean6 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        boolean boolean9 = productRepository0.delete((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
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
        java.util.List<org.example.Order> orderList16 = productRepository0.findAllOrders();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNotNull(productList15);
        org.junit.Assert.assertNotNull(orderList16);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList5 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList6 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        java.util.List<org.example.Product> productList8 = productRepository0.findAll();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList8);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Product product6 = productRepository0.findById((java.lang.Long) 1L);
        boolean boolean8 = productRepository0.delete((java.lang.Long) 0L);
        org.example.Order order10 = productRepository0.findOrderById((java.lang.Long) 0L);
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
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList9 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList11 = productRepository0.findByKeyword("hi!");
        org.example.Product product13 = productRepository0.findById((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList15 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Order> orderList16 = productRepository0.findAllOrders();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(orderList7);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNull(product13);
        org.junit.Assert.assertNotNull(productList15);
        org.junit.Assert.assertNotNull(orderList16);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        boolean boolean8 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(productList10);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
        boolean boolean10 = productRepository0.delete((java.lang.Long) 10L);
        org.example.Product product12 = productRepository0.findById((java.lang.Long) 100L);
        org.example.Product product14 = productRepository0.findById((java.lang.Long) 1L);
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
        org.junit.Assert.assertNull(product14);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        boolean boolean9 = productRepository0.delete((java.lang.Long) 0L);
        org.example.Order order11 = productRepository0.findOrderById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList13 = productRepository0.findByKeyword("");
        boolean boolean15 = productRepository0.delete((java.lang.Long) 100L);
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
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(orderList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(order11);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList1 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList3 = productRepository0.findByKeyword("");
        boolean boolean5 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList9 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        boolean boolean11 = productRepository0.delete((java.lang.Long) 10L);
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
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
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
        boolean boolean18 = productRepository0.delete((java.lang.Long) 100L);
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
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNull(product7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(product14);
        org.junit.Assert.assertNull(order16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
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
        java.lang.Class<?> wildcardClass19 = productList18.getClass();
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
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        boolean boolean2 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList3 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList4 = productRepository0.findAll();
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList8 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Order order9 = productRepository0.findOrderById((java.lang.Long) 1L);
        org.example.Product product11 = productRepository0.findById((java.lang.Long) (-1L));
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
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(order9);
        org.junit.Assert.assertNull(product11);
        org.junit.Assert.assertNotNull(productList12);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
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
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        boolean boolean4 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList9 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        java.util.List<org.example.Product> productList11 = productRepository0.findByKeyword("hi!");
        org.example.Product product12 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product12);
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
        org.junit.Assert.assertNotNull(productList11);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
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
        java.lang.Class<?> wildcardClass15 = productList14.getClass();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(orderList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNull(product5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(product11);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList8 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        org.example.Order order10 = productRepository0.findOrderById((java.lang.Long) 100L);
        boolean boolean12 = productRepository0.delete((java.lang.Long) (-1L));
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNull(order10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList1 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList3 = productRepository0.findByKeyword("");
        boolean boolean5 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList8 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        org.example.Order order9 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList8);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList10 = productRepository0.findByKeyword("");
        org.example.Product product12 = productRepository0.findById((java.lang.Long) 0L);
        boolean boolean14 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList16 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList17 = productRepository0.findSortedByName();
        org.example.Product product19 = productRepository0.findById((java.lang.Long) 0L);
        boolean boolean21 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList22 = productRepository0.findAll();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNull(product12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertNotNull(productList17);
        org.junit.Assert.assertNull(product19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(productList22);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("hi!");
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
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNull(product10);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        boolean boolean2 = productRepository0.delete((java.lang.Long) 100L);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        java.util.List<org.example.Product> productList8 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
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
            productRepository0.saveOrder(order11);
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
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
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
        java.lang.Class<?> wildcardClass15 = productRepository0.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(orderList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        boolean boolean7 = productRepository0.delete((java.lang.Long) (-1L));
        boolean boolean9 = productRepository0.delete((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList11 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(productList11);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList5 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList6 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        java.util.List<org.example.Order> orderList8 = productRepository0.findAllOrders();
        java.lang.Class<?> wildcardClass9 = productRepository0.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(orderList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findAll();
        org.example.Product product7 = productRepository0.findById((java.lang.Long) 10L);
        org.example.Product product9 = productRepository0.findById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList11 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
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
        org.junit.Assert.assertNull(product9);
        org.junit.Assert.assertNotNull(productList11);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList2 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        org.example.Product product5 = productRepository0.findById((java.lang.Long) 0L);
        boolean boolean7 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList9 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        java.util.List<org.example.Product> productList10 = productRepository0.findSortedByName();
        org.example.Order order11 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order11);
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
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
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
        java.util.List<org.example.Order> orderList19 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList20 = productRepository0.findSortedByName();
        boolean boolean22 = productRepository0.delete((java.lang.Long) 100L);
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
        org.junit.Assert.assertNotNull(orderList19);
        org.junit.Assert.assertNotNull(productList20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList1 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList3 = productRepository0.findByKeyword("");
        boolean boolean5 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.util.List<org.example.Product> productList9 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList11 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        java.util.List<org.example.Order> orderList12 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList13 = productRepository0.findSortedByName();
        boolean boolean15 = productRepository0.delete((java.lang.Long) 1L);
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(orderList12);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
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
        java.util.List<org.example.Product> productList20 = productRepository0.findSortedByName();
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
        org.junit.Assert.assertNotNull(productList20);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
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
        java.util.List<org.example.Order> orderList15 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList16 = productRepository0.findAllOrders();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNull(product14);
        org.junit.Assert.assertNotNull(orderList15);
        org.junit.Assert.assertNotNull(orderList16);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        org.example.Product product7 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList8 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList9 = productRepository0.findSortedByName();
        boolean boolean11 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList12 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList14 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNull(product7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(orderList12);
        org.junit.Assert.assertNotNull(productList14);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
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
        java.util.List<org.example.Product> productList19 = productRepository0.findByKeyword("hi!");
        org.example.Product product20 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product20);
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
        org.junit.Assert.assertNotNull(productList17);
        org.junit.Assert.assertNotNull(productList19);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList9 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        java.lang.Class<?> wildcardClass10 = productList9.getClass();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
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
        java.util.List<org.example.Product> productList14 = productRepository0.findSortedByName();
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
        org.junit.Assert.assertNotNull(productList14);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        boolean boolean8 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList9 = productRepository0.findAll();
        org.example.Product product11 = productRepository0.findById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList13 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        org.example.Product product15 = productRepository0.findById((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNull(product11);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNull(product15);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList3 = productRepository0.findAll();
        java.util.List<org.example.Product> productList4 = productRepository0.findAll();
        org.example.Product product6 = productRepository0.findById((java.lang.Long) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = product6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNull(product6);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        boolean boolean8 = productRepository0.delete((java.lang.Long) (-1L));
        boolean boolean10 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList12 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        org.example.Product product14 = productRepository0.findById((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNull(product14);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        boolean boolean4 = productRepository0.delete((java.lang.Long) (-1L));
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(orderList5);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        boolean boolean8 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList9 = productRepository0.findAll();
        org.example.Product product11 = productRepository0.findById((java.lang.Long) 1L);
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNull(product11);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
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
        org.example.Order order19 = productRepository0.findOrderById((java.lang.Long) 0L);
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
        org.junit.Assert.assertNull(order9);
        org.junit.Assert.assertNull(order11);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNotNull(productList15);
        org.junit.Assert.assertNotNull(productList17);
        org.junit.Assert.assertNull(order19);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        org.example.Product product1 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Product product6 = productRepository0.findById((java.lang.Long) 1L);
        boolean boolean8 = productRepository0.delete((java.lang.Long) 0L);
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
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(product6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(order10);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        boolean boolean8 = productRepository0.delete((java.lang.Long) 10L);
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
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        org.example.Product product7 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList8 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        java.util.List<org.example.Product> productList11 = productRepository0.findSortedByName();
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
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList11);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList4 = productRepository0.findAll();
        boolean boolean6 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        org.example.Order order9 = productRepository0.findOrderById((java.lang.Long) 0L);
        org.example.Order order11 = productRepository0.findOrderById((java.lang.Long) (-1L));
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(orderList7);
        org.junit.Assert.assertNull(order9);
        org.junit.Assert.assertNull(order11);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
        org.example.Product product10 = productRepository0.findById((java.lang.Long) 10L);
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
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNull(product10);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        boolean boolean4 = productRepository0.delete((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        boolean boolean8 = productRepository0.delete((java.lang.Long) 1L);
        org.example.Order order10 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(order10);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
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
        boolean boolean18 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList19 = productRepository0.findSortedByName();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(productList19);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
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
        org.example.Order order18 = productRepository0.findOrderById((java.lang.Long) 100L);
        org.example.Order order19 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order19);
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
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertNull(order18);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
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
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
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
        java.lang.Class<?> wildcardClass15 = productRepository0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        boolean boolean8 = productRepository0.delete((java.lang.Long) 1L);
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
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        boolean boolean2 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList3 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList4 = productRepository0.findSortedByName();
        boolean boolean6 = productRepository0.delete((java.lang.Long) (-1L));
        org.example.Product product8 = productRepository0.findById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        org.example.Order order12 = productRepository0.findOrderById((java.lang.Long) 0L);
        org.example.Product product14 = productRepository0.findById((java.lang.Long) 1L);
        org.example.Order order15 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order15);
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
        org.junit.Assert.assertNull(order12);
        org.junit.Assert.assertNull(product14);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
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
        org.example.Order order15 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order15);
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
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNotNull(productList14);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        boolean boolean2 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList3 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList4 = productRepository0.findAll();
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        java.util.List<org.example.Product> productList8 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList12 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Product product13 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList1 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList3 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Product> productList4 = productRepository0.findAll();
        org.example.Product product6 = productRepository0.findById((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNull(product6);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("hi!");
        org.example.Product product8 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        java.util.List<org.example.Product> productList11 = productRepository0.findAll();
        boolean boolean13 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Order> orderList14 = productRepository0.findAllOrders();
        org.example.Order order15 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order15);
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(orderList14);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        java.util.List<org.example.Product> productList9 = productRepository0.findByKeyword("hi!");
        java.lang.Class<?> wildcardClass10 = productRepository0.getClass();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
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
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList9);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        boolean boolean8 = productRepository0.delete((java.lang.Long) 10L);
        org.example.Order order10 = productRepository0.findOrderById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList11 = productRepository0.findAllOrders();
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
        org.junit.Assert.assertNull(order10);
        org.junit.Assert.assertNotNull(orderList11);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList4 = productRepository0.findAll();
        boolean boolean6 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList8 = productRepository0.findAll();
        org.example.Product product10 = productRepository0.findById((java.lang.Long) 100L);
        java.lang.Class<?> wildcardClass11 = productRepository0.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNull(product10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        boolean boolean8 = productRepository0.delete((java.lang.Long) (-1L));
        boolean boolean10 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList12 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(productList12);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList8 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList9 = productRepository0.findAllOrders();
        java.lang.Class<?> wildcardClass10 = productRepository0.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(orderList7);
        org.junit.Assert.assertNotNull(orderList8);
        org.junit.Assert.assertNotNull(orderList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Product product6 = productRepository0.findById((java.lang.Long) 1L);
        boolean boolean8 = productRepository0.delete((java.lang.Long) 0L);
        org.example.Order order10 = productRepository0.findOrderById((java.lang.Long) 0L);
        org.example.Order order12 = productRepository0.findOrderById((java.lang.Long) 100L);
        org.example.Order order14 = productRepository0.findOrderById((java.lang.Long) (-1L));
        org.example.Product product16 = productRepository0.findById((java.lang.Long) (-1L));
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
        org.junit.Assert.assertNull(product6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(order10);
        org.junit.Assert.assertNull(order12);
        org.junit.Assert.assertNull(order14);
        org.junit.Assert.assertNull(product16);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList5 = productRepository0.findByKeyword("");
        boolean boolean7 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList9 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(productList9);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        boolean boolean2 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList4 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList6 = productRepository0.findSortedByName();
        boolean boolean8 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList9 = productRepository0.findAll();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(productList9);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        boolean boolean4 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList6 = productRepository0.findAll();
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList9 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        org.example.Order order11 = productRepository0.findOrderById((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNull(order11);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        boolean boolean2 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList4 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.util.List<org.example.Product> productList9 = productRepository0.findByKeyword("hi!");
        org.example.Product product11 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList13 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNull(product11);
        org.junit.Assert.assertNotNull(productList13);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        org.example.Product product8 = productRepository0.findById((java.lang.Long) (-1L));
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
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(product8);
        org.junit.Assert.assertNotNull(productList9);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("hi!");
        boolean boolean10 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList11 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList12 = productRepository0.findAllOrders();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(orderList12);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList1 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList3 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        boolean boolean5 = productRepository0.delete((java.lang.Long) 0L);
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
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNull(order8);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        boolean boolean7 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList9 = productRepository0.findByKeyword("");
        java.util.List<org.example.Order> orderList10 = productRepository0.findAllOrders();
        org.example.Product product12 = productRepository0.findById((java.lang.Long) 1L);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(orderList10);
        org.junit.Assert.assertNull(product12);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
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
        org.junit.Assert.assertNotNull(orderList10);
        org.junit.Assert.assertNull(product12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList2 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        org.example.Product product5 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Product product7 = productRepository0.findById((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList9 = productRepository0.findByKeyword("");
        org.example.Product product10 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(orderList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNull(product5);
        org.junit.Assert.assertNull(product7);
        org.junit.Assert.assertNotNull(productList9);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList7 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Product> productList8 = productRepository0.findAll();
        java.util.List<org.example.Product> productList9 = productRepository0.findAll();
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
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList9);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        boolean boolean2 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList3 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList4 = productRepository0.findSortedByName();
        boolean boolean6 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        org.example.Order order9 = productRepository0.findOrderById((java.lang.Long) 100L);
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
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(orderList7);
        org.junit.Assert.assertNull(order9);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
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
        org.junit.Assert.assertNotNull(productList15);
        org.junit.Assert.assertNotNull(orderList16);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList9 = productRepository0.findAll();
        java.util.List<org.example.Order> orderList10 = productRepository0.findAllOrders();
        java.lang.Class<?> wildcardClass11 = productRepository0.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(orderList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
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
        java.util.List<org.example.Product> productList15 = productRepository0.findAll();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(orderList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList15);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList8 = productRepository0.findAll();
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
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNull(product10);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
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
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNull(order13);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNull(product16);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        boolean boolean9 = productRepository0.delete((java.lang.Long) 0L);
        org.example.Product product11 = productRepository0.findById((java.lang.Long) 100L);
        org.example.Product product13 = productRepository0.findById((java.lang.Long) (-1L));
        boolean boolean15 = productRepository0.delete((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(orderList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(product11);
        org.junit.Assert.assertNull(product13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        org.example.Product product7 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList8 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        boolean boolean12 = productRepository0.delete((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList13 = productRepository0.findAll();
        org.example.Order order15 = productRepository0.findOrderById((java.lang.Long) 1L);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNull(product7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNull(order15);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        org.example.Order order7 = productRepository0.findOrderById((java.lang.Long) 10L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = order7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNull(order7);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        boolean boolean2 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList4 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("hi!");
        java.lang.Class<?> wildcardClass7 = productRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("hi!");
        org.example.Product product8 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList9 = productRepository0.findAll();
        org.example.Order order11 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList13 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
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
        org.junit.Assert.assertNull(order11);
        org.junit.Assert.assertNotNull(productList13);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
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
            productRepository0.updateOrder(order13);
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
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        boolean boolean8 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList9 = productRepository0.findAll();
        org.example.Order order11 = productRepository0.findOrderById((java.lang.Long) (-1L));
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNull(order11);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList10 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList12 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList14 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Product> productList16 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Product> productList18 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Product> productList19 = productRepository0.findAll();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertNotNull(productList18);
        org.junit.Assert.assertNotNull(productList19);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        boolean boolean9 = productRepository0.delete((java.lang.Long) 100L);
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
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(productList10);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
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
        org.example.Order order15 = productRepository0.findOrderById((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(orderList11);
        org.junit.Assert.assertNull(order13);
        org.junit.Assert.assertNull(order15);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        boolean boolean9 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList11 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order13 = productRepository0.findOrderById((java.lang.Long) 0L);
        boolean boolean15 = productRepository0.delete((java.lang.Long) (-1L));
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
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList2 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        org.example.Product product5 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findAll();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(orderList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNull(product5);
        org.junit.Assert.assertNotNull(productList6);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList4 = productRepository0.findSortedByName();
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
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
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
        java.util.List<org.example.Order> orderList14 = productRepository0.findAllOrders();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNull(product7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(orderList9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNotNull(orderList14);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
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
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNull(order10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNull(order14);
        org.junit.Assert.assertNotNull(productList16);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        org.example.Order order8 = productRepository0.findOrderById((java.lang.Long) 100L);
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
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(order8);
        org.junit.Assert.assertNull(product10);
        org.junit.Assert.assertNull(order12);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Order order9 = productRepository0.findOrderById((java.lang.Long) 1L);
        org.example.Order order11 = productRepository0.findOrderById((java.lang.Long) (-1L));
        org.example.Order order13 = productRepository0.findOrderById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList14 = productRepository0.findSortedByName();
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
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList5 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList6 = productRepository0.findSortedByName();
        boolean boolean8 = productRepository0.delete((java.lang.Long) 100L);
        org.example.Product product10 = productRepository0.findById((java.lang.Long) 0L);
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
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(product10);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList3 = productRepository0.findAll();
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
        org.junit.Assert.assertNotNull(productList3);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList10 = productRepository0.findByKeyword("");
        org.example.Product product12 = productRepository0.findById((java.lang.Long) 0L);
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
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNull(product12);
        org.junit.Assert.assertNotNull(productList13);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Product product9 = productRepository0.findById((java.lang.Long) 100L);
        org.example.Order order11 = productRepository0.findOrderById((java.lang.Long) 10L);
        boolean boolean13 = productRepository0.delete((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(product9);
        org.junit.Assert.assertNull(order11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        org.example.Product product7 = productRepository0.findById((java.lang.Long) 1L);
        java.util.List<org.example.Order> orderList8 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList9 = productRepository0.findAllOrders();
        org.example.Order order11 = productRepository0.findOrderById((java.lang.Long) 10L);
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
        org.junit.Assert.assertNotNull(orderList8);
        org.junit.Assert.assertNotNull(orderList9);
        org.junit.Assert.assertNull(order11);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList4 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
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
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(productList7);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Product> productList3 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList4 = productRepository0.findSortedByName();
        boolean boolean6 = productRepository0.delete((java.lang.Long) 1L);
        org.example.Product product8 = productRepository0.findById((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(product8);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList4 = productRepository0.findAll();
        java.util.List<org.example.Product> productList5 = productRepository0.findAll();
        java.util.List<org.example.Product> productList6 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("hi!");
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Product product6 = productRepository0.findById((java.lang.Long) 1L);
        boolean boolean8 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Product> productList11 = productRepository0.findAll();
        boolean boolean13 = productRepository0.delete((java.lang.Long) 0L);
        org.example.Product product15 = productRepository0.findById((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(product6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(product15);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList8 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Product> productList12 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(orderList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
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
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNull(order16);
        org.junit.Assert.assertNull(order18);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Product product9 = productRepository0.findById((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList11 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Product> productList12 = productRepository0.findAll();
        java.util.List<org.example.Product> productList13 = productRepository0.findAll();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(product9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList13);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Product product6 = productRepository0.findById((java.lang.Long) 1L);
        boolean boolean8 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Product> productList12 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.util.List<org.example.Order> orderList13 = productRepository0.findAllOrders();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(product6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(orderList13);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
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
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(productList7);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        boolean boolean7 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList9 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList10 = productRepository0.findAll();
        java.util.List<org.example.Product> productList12 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Product> productList14 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
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
        java.util.List<org.example.Product> productList14 = productRepository0.findByKeyword("");
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(orderList10);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(orderList12);
        org.junit.Assert.assertNotNull(productList14);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList1 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList3 = productRepository0.findByKeyword("");
        boolean boolean5 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.util.List<org.example.Product> productList9 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList11 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.util.List<org.example.Product> productList13 = productRepository0.findByKeyword("");
        java.lang.Class<?> wildcardClass14 = productList13.getClass();
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
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
        java.lang.Class<?> wildcardClass17 = productRepository0.getClass();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(order8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        boolean boolean4 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList6 = productRepository0.findAll();
        org.example.Order order8 = productRepository0.findOrderById((java.lang.Long) 1L);
        java.util.List<org.example.Order> orderList9 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList10 = productRepository0.findAll();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(order8);
        org.junit.Assert.assertNotNull(orderList9);
        org.junit.Assert.assertNotNull(productList10);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList4 = productRepository0.findAllOrders();
        org.example.Product product6 = productRepository0.findById((java.lang.Long) 0L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = product6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(orderList4);
        org.junit.Assert.assertNull(product6);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        boolean boolean9 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList10 = productRepository0.findSortedByName();
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
        org.junit.Assert.assertNotNull(productList10);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList1 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList3 = productRepository0.findByKeyword("");
        boolean boolean5 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        org.example.Order order8 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(productList7);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList4 = productRepository0.findAll();
        org.example.Product product6 = productRepository0.findById((java.lang.Long) 0L);
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
        org.junit.Assert.assertNull(product6);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
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
        java.util.List<org.example.Product> productList17 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
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
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList6 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        org.example.Order order9 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Order order11 = productRepository0.findOrderById((java.lang.Long) (-1L));
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(order9);
        org.junit.Assert.assertNull(order11);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Product product6 = productRepository0.findById((java.lang.Long) 1L);
        boolean boolean8 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        java.util.List<org.example.Product> productList11 = productRepository0.findAll();
        org.example.Order order13 = productRepository0.findOrderById((java.lang.Long) (-1L));
        java.lang.Class<?> wildcardClass14 = productRepository0.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(product6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNull(order13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        org.example.Product product8 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order10 = productRepository0.findOrderById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList11 = productRepository0.findSortedByName();
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
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(product8);
        org.junit.Assert.assertNull(order10);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList13);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        org.example.Product product8 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order10 = productRepository0.findOrderById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList11 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList13 = productRepository0.findByKeyword("");
        org.example.Product product15 = productRepository0.findById((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(product8);
        org.junit.Assert.assertNull(order10);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNull(product15);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
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
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(orderList7);
        org.junit.Assert.assertNotNull(productList8);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        java.util.List<org.example.Order> orderList8 = productRepository0.findAllOrders();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(orderList8);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
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
        java.util.List<org.example.Product> productList19 = productRepository0.findByKeyword("hi!");
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
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        org.example.Product product8 = productRepository0.findById((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList9 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList10 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList11 = productRepository0.findAllOrders();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(product8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(orderList11);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
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
        org.junit.Assert.assertNotNull(orderList25);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
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
        boolean boolean18 = productRepository0.delete((java.lang.Long) 100L);
        boolean boolean20 = productRepository0.delete((java.lang.Long) (-1L));
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
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
        java.util.List<org.example.Product> productList19 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
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
        org.junit.Assert.assertNotNull(productList17);
        org.junit.Assert.assertNotNull(productList19);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList8 = productRepository0.findAll();
        org.example.Product product10 = productRepository0.findById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList11 = productRepository0.findSortedByName();
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
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList1 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList3 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        org.example.Order order5 = productRepository0.findOrderById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList6 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNull(order5);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        boolean boolean7 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList9 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList11 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Product> productList12 = productRepository0.findAll();
        java.lang.Class<?> wildcardClass13 = productList12.getClass();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        boolean boolean8 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList9 = productRepository0.findAll();
        java.util.List<org.example.Product> productList11 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        org.example.Order order13 = productRepository0.findOrderById((java.lang.Long) 10L);
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
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNull(order13);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Product product6 = productRepository0.findById((java.lang.Long) 1L);
        boolean boolean8 = productRepository0.delete((java.lang.Long) 0L);
        org.example.Order order10 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList12 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        org.example.Product product13 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(product6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(order10);
        org.junit.Assert.assertNotNull(productList12);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
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
        org.junit.Assert.assertNull(product7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(orderList9);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList4 = productRepository0.findAll();
        java.util.List<org.example.Product> productList5 = productRepository0.findAll();
        java.util.List<org.example.Product> productList6 = productRepository0.findAll();
        boolean boolean8 = productRepository0.delete((java.lang.Long) 100L);
        boolean boolean10 = productRepository0.delete((java.lang.Long) 10L);
        org.example.Order order12 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList14 = productRepository0.findByKeyword("");
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(order12);
        org.junit.Assert.assertNotNull(productList14);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        org.example.Product product7 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList8 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList9 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList10 = productRepository0.findAll();
        java.util.List<org.example.Order> orderList11 = productRepository0.findAllOrders();
        boolean boolean13 = productRepository0.delete((java.lang.Long) 10L);
        java.lang.Class<?> wildcardClass14 = productRepository0.getClass();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNull(product7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(orderList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
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
            productRepository0.updateOrder(order9);
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
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList2 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        org.example.Product product5 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        org.example.Order order7 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(orderList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNull(product5);
        org.junit.Assert.assertNotNull(orderList6);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
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
        boolean boolean20 = productRepository0.delete((java.lang.Long) 10L);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        boolean boolean2 = productRepository0.delete((java.lang.Long) 100L);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        java.util.List<org.example.Product> productList8 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList9 = productRepository0.findAll();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList9);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList4 = productRepository0.findAll();
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNull(order6);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Product product6 = productRepository0.findById((java.lang.Long) 1L);
        org.example.Order order8 = productRepository0.findOrderById((java.lang.Long) 0L);
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
        org.junit.Assert.assertNull(product6);
        org.junit.Assert.assertNull(order8);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        boolean boolean6 = productRepository0.delete((java.lang.Long) 0L);
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
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        boolean boolean3 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        org.example.Order order6 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(productList5);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("hi!");
        org.example.Product product8 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList9 = productRepository0.findAll();
        java.util.List<org.example.Product> productList11 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList13 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Product> productList15 = productRepository0.findByKeyword("");
        boolean boolean17 = productRepository0.delete((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(product8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNotNull(productList15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList5 = productRepository0.findByKeyword("");
        org.example.Order order7 = productRepository0.findOrderById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList8 = productRepository0.findAllOrders();
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
        org.junit.Assert.assertNull(order7);
        org.junit.Assert.assertNotNull(orderList8);
        org.junit.Assert.assertNotNull(productList9);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        java.util.List<org.example.Product> productList9 = productRepository0.findByKeyword("");
        org.example.Order order11 = productRepository0.findOrderById((java.lang.Long) (-1L));
        org.example.Product product13 = productRepository0.findById((java.lang.Long) 1L);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNull(order11);
        org.junit.Assert.assertNull(product13);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        java.util.List<org.example.Product> productList9 = productRepository0.findByKeyword("");
        org.example.Order order11 = productRepository0.findOrderById((java.lang.Long) (-1L));
        org.example.Order order13 = productRepository0.findOrderById((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNull(order11);
        org.junit.Assert.assertNull(order13);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
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
        java.util.List<org.example.Product> productList15 = productRepository0.findAll();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNull(product14);
        org.junit.Assert.assertNotNull(productList15);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList5 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList6 = productRepository0.findSortedByName();
        boolean boolean8 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList9 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList10 = productRepository0.findAllOrders();
        boolean boolean12 = productRepository0.delete((java.lang.Long) 1L);
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
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(orderList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
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
        org.example.Product product25 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product25);
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
        org.junit.Assert.assertNotNull(productList22);
        org.junit.Assert.assertNull(product24);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        boolean boolean4 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList9 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList11 = productRepository0.findByKeyword("hi!");
        boolean boolean13 = productRepository0.delete((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        boolean boolean2 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList3 = productRepository0.findSortedByName();
        org.example.Product product5 = productRepository0.findById((java.lang.Long) 1L);
        org.example.Order order7 = productRepository0.findOrderById((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList8 = productRepository0.findSortedByName();
        java.lang.Class<?> wildcardClass9 = productRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNull(product5);
        org.junit.Assert.assertNull(order7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
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
            productRepository0.updateOrder(order20);
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
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
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
            productRepository0.saveOrder(order14);
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
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList4 = productRepository0.findAllOrders();
        org.example.Product product6 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order8 = productRepository0.findOrderById((java.lang.Long) 1L);
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
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(orderList4);
        org.junit.Assert.assertNull(product6);
        org.junit.Assert.assertNull(order8);
        org.junit.Assert.assertNotNull(productList9);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        boolean boolean9 = productRepository0.delete((java.lang.Long) 0L);
        org.example.Product product11 = productRepository0.findById((java.lang.Long) 100L);
        org.example.Product product13 = productRepository0.findById((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList15 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        org.example.Order order17 = productRepository0.findOrderById((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(orderList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(product11);
        org.junit.Assert.assertNull(product13);
        org.junit.Assert.assertNotNull(productList15);
        org.junit.Assert.assertNull(order17);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
        boolean boolean10 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList12 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList13 = productRepository0.findSortedByName();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList13);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList1 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList3 = productRepository0.findByKeyword("");
        boolean boolean5 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findByKeyword("");
        org.example.Product product9 = productRepository0.findById((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList11 = productRepository0.findByKeyword("");
        org.example.Product product12 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
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
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        org.example.Order order8 = productRepository0.findOrderById((java.lang.Long) 100L);
        boolean boolean10 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList12 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        java.util.List<org.example.Product> productList14 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
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
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
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
        org.example.Product product16 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product16);
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
        org.junit.Assert.assertNotNull(productList15);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList2 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        org.example.Product product5 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList7 = productRepository0.findByKeyword("hi!");
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(orderList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNull(product5);
        org.junit.Assert.assertNotNull(productList7);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
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
        org.junit.Assert.assertNotNull(productList24);
        org.junit.Assert.assertNotNull(productList25);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        boolean boolean9 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Order> orderList10 = productRepository0.findAllOrders();
        boolean boolean12 = productRepository0.delete((java.lang.Long) 100L);
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
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(orderList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(product14);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        org.example.Product product7 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList8 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        boolean boolean12 = productRepository0.delete((java.lang.Long) (-1L));
        java.lang.Class<?> wildcardClass13 = productRepository0.getClass();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNull(product7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Product product6 = productRepository0.findById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList8 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        java.util.List<org.example.Product> productList9 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList11 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        java.util.List<org.example.Product> productList13 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
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
        org.junit.Assert.assertNull(product6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList13);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
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
        org.example.Product product18 = productRepository0.findById((java.lang.Long) 100L);
        org.example.Order order19 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order19);
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(product18);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
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
        java.util.List<org.example.Product> productList15 = productRepository0.findSortedByName();
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
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
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
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(productList6);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
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
        org.junit.Assert.assertNull(order9);
        org.junit.Assert.assertNull(order11);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNotNull(productList15);
        org.junit.Assert.assertNotNull(productList16);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList3 = productRepository0.findAll();
        java.util.List<org.example.Product> productList4 = productRepository0.findAll();
        org.example.Product product6 = productRepository0.findById((java.lang.Long) (-1L));
        boolean boolean8 = productRepository0.delete((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNull(product6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
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
        org.example.Product product19 = productRepository0.findById((java.lang.Long) 0L);
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
        org.junit.Assert.assertNull(product19);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 10L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 10L);
        boolean boolean8 = productRepository0.delete((java.lang.Long) (-1L));
        org.example.Product product9 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product9);
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
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
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
        java.util.List<org.example.Product> productList24 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
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
        org.junit.Assert.assertNotNull(productList24);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList1 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList3 = productRepository0.findByKeyword("");
        boolean boolean5 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList6 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Order order8 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList7);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
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
            productRepository0.saveOrder(order23);
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
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
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
        org.example.Order order16 = productRepository0.findOrderById((java.lang.Long) (-1L));
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNull(product12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(order16);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
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
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList9 = productRepository0.findAll();
        java.util.List<org.example.Order> orderList10 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList11 = productRepository0.findAll();
        java.lang.Class<?> wildcardClass12 = productList11.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(orderList10);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        boolean boolean2 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList3 = productRepository0.findSortedByName();
        org.example.Product product5 = productRepository0.findById((java.lang.Long) 1L);
        org.example.Order order7 = productRepository0.findOrderById((java.lang.Long) (-1L));
        boolean boolean9 = productRepository0.delete((java.lang.Long) 0L);
        org.example.Order order11 = productRepository0.findOrderById((java.lang.Long) 0L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNull(product5);
        org.junit.Assert.assertNull(order7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(order11);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList2 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        org.example.Product product5 = productRepository0.findById((java.lang.Long) 0L);
        boolean boolean7 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList9 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.util.List<org.example.Product> productList11 = productRepository0.findByKeyword("hi!");
        org.example.Product product13 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList15 = productRepository0.findByKeyword("");
        org.example.Product product16 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product16);
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
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
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
            productRepository0.updateOrder(order13);
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
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 10L);
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
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(productList7);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Product product6 = productRepository0.findById((java.lang.Long) 1L);
        boolean boolean8 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        org.example.Product product12 = productRepository0.findById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList13 = productRepository0.findSortedByName();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(product6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNull(product12);
        org.junit.Assert.assertNotNull(productList13);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList7 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.util.List<org.example.Product> productList9 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        org.example.Order order11 = productRepository0.findOrderById((java.lang.Long) 1L);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNull(order11);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
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
        java.util.List<org.example.Product> productList20 = productRepository0.findByKeyword("hi!");
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
        org.junit.Assert.assertNotNull(productList20);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        boolean boolean9 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList10 = productRepository0.findSortedByName();
        org.example.Product product12 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList13 = productRepository0.findAll();
        java.util.List<org.example.Product> productList15 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        java.util.List<org.example.Product> productList16 = productRepository0.findSortedByName();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNull(product12);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNotNull(productList15);
        org.junit.Assert.assertNotNull(productList16);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList8 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        org.example.Order order10 = productRepository0.findOrderById((java.lang.Long) 100L);
        boolean boolean12 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList13 = productRepository0.findSortedByName();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNull(order10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(productList13);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList8 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList9 = productRepository0.findSortedByName();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(orderList7);
        org.junit.Assert.assertNotNull(orderList8);
        org.junit.Assert.assertNotNull(productList9);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList7 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
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
        org.junit.Assert.assertNotNull(productList7);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        boolean boolean2 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList3 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList4 = productRepository0.findAll();
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        java.util.List<org.example.Product> productList8 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList12 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order14 = productRepository0.findOrderById((java.lang.Long) 0L);
        org.example.Product product15 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNull(order14);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList8 = productRepository0.findAll();
        org.example.Product product10 = productRepository0.findById((java.lang.Long) (-1L));
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(orderList7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNull(product10);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList8 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(orderList7);
        org.junit.Assert.assertNotNull(orderList8);
        org.junit.Assert.assertNotNull(productList10);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList4 = productRepository0.findAll();
        boolean boolean6 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        org.example.Product product9 = productRepository0.findById((java.lang.Long) 100L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = product9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(orderList7);
        org.junit.Assert.assertNull(product9);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        boolean boolean9 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList11 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList12 = productRepository0.findAll();
        java.lang.Class<?> wildcardClass13 = productList12.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
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
        org.example.Product product14 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product14);
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
        org.junit.Assert.assertNull(order11);
        org.junit.Assert.assertNotNull(productList13);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList9 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList10 = productRepository0.findSortedByName();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList10);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
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
        java.lang.Class<?> wildcardClass17 = productRepository0.getClass();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(order8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(order12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        boolean boolean2 = productRepository0.delete((java.lang.Long) 100L);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        org.example.Order order8 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList7);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
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
        org.example.Product product16 = productRepository0.findById((java.lang.Long) (-1L));
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNull(product16);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        boolean boolean2 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList3 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList4 = productRepository0.findAll();
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        org.example.Product product8 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList7);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        boolean boolean2 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList3 = productRepository0.findSortedByName();
        org.example.Product product5 = productRepository0.findById((java.lang.Long) 1L);
        org.example.Order order7 = productRepository0.findOrderById((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList8 = productRepository0.findAll();
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNull(product5);
        org.junit.Assert.assertNull(order7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Order order9 = productRepository0.findOrderById((java.lang.Long) 1L);
        org.example.Order order11 = productRepository0.findOrderById((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList12 = productRepository0.findSortedByName();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(order9);
        org.junit.Assert.assertNull(order11);
        org.junit.Assert.assertNotNull(productList12);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        boolean boolean4 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList6 = productRepository0.findAll();
        boolean boolean8 = productRepository0.delete((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList2 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        org.example.Product product5 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        org.example.Order order8 = productRepository0.findOrderById((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList9 = productRepository0.findSortedByName();
        org.example.Order order11 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList12 = productRepository0.findSortedByName();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(orderList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNull(product5);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNull(order8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNull(order11);
        org.junit.Assert.assertNotNull(productList12);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
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
        org.example.Order order19 = productRepository0.findOrderById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList20 = productRepository0.findSortedByName();
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
        org.junit.Assert.assertNull(order19);
        org.junit.Assert.assertNotNull(productList20);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        boolean boolean8 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList9 = productRepository0.findAll();
        java.util.List<org.example.Product> productList11 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        java.util.List<org.example.Product> productList12 = productRepository0.findAll();
        java.util.List<org.example.Product> productList14 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
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
        java.util.List<org.example.Order> orderList19 = productRepository0.findAllOrders();
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
        org.junit.Assert.assertNotNull(orderList19);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        boolean boolean4 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList8 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        org.example.Product product10 = productRepository0.findById((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNull(product10);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        boolean boolean2 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList3 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList4 = productRepository0.findSortedByName();
        org.example.Product product6 = productRepository0.findById((java.lang.Long) 10L);
        org.example.Order order8 = productRepository0.findOrderById((java.lang.Long) (-1L));
        org.example.Product product9 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNull(product6);
        org.junit.Assert.assertNull(order8);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList8 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.util.List<org.example.Product> productList10 = productRepository0.findByKeyword("");
        org.example.Order order12 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList14 = productRepository0.findByKeyword("");
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
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNull(order12);
        org.junit.Assert.assertNotNull(productList14);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("hi!");
        org.example.Product product8 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        org.example.Product product12 = productRepository0.findById((java.lang.Long) (-1L));
        org.example.Product product13 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(product8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNull(product12);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        boolean boolean7 = productRepository0.delete((java.lang.Long) (-1L));
        boolean boolean9 = productRepository0.delete((java.lang.Long) 1L);
        java.util.List<org.example.Order> orderList10 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList11 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList13 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Product> productList15 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
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
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(orderList10);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNotNull(productList15);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        boolean boolean4 = productRepository0.delete((java.lang.Long) 0L);
        boolean boolean6 = productRepository0.delete((java.lang.Long) 10L);
        org.example.Order order8 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Product product10 = productRepository0.findById((java.lang.Long) (-1L));
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(order8);
        org.junit.Assert.assertNull(product10);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
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
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNull(product7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(productList13);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
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
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList16);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
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
        java.util.List<org.example.Product> productList18 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
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
        org.junit.Assert.assertNotNull(productList18);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        java.util.List<org.example.Product> productList4 = productRepository0.findByKeyword("hi!");
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 1L);
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
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNull(order6);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
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
        org.example.Order order25 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order25);
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
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("hi!");
        org.example.Product product8 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList9 = productRepository0.findAll();
        java.util.List<org.example.Product> productList11 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Product> productList12 = productRepository0.findSortedByName();
        boolean boolean14 = productRepository0.delete((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(product8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList6 = productRepository0.findSortedByName();
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
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList7);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
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
        org.junit.Assert.assertNull(product9);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        boolean boolean7 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList9 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList10 = productRepository0.findAll();
        java.util.List<org.example.Product> productList12 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Product> productList13 = productRepository0.findSortedByName();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList13);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
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
        java.util.List<org.example.Product> productList24 = productRepository0.findByKeyword("");
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
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList5 = productRepository0.findByKeyword("");
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        org.example.Order order9 = productRepository0.findOrderById((java.lang.Long) 1L);
        org.example.Order order11 = productRepository0.findOrderById((java.lang.Long) 0L);
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
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(orderList7);
        org.junit.Assert.assertNull(order9);
        org.junit.Assert.assertNull(order11);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
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
        org.example.Product product16 = productRepository0.findById((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(orderList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNull(product5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(product11);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNull(product16);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
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
        org.example.Order order18 = productRepository0.findOrderById((java.lang.Long) 10L);
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
        org.junit.Assert.assertNull(order18);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
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
            productRepository0.update(product13);
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
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
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
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNull(product13);
        org.junit.Assert.assertNotNull(orderList14);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        boolean boolean9 = productRepository0.delete((java.lang.Long) 0L);
        org.example.Product product11 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList12 = productRepository0.findAll();
        org.example.Order order14 = productRepository0.findOrderById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList16 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        org.example.Order order17 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order17);
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
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNull(order14);
        org.junit.Assert.assertNotNull(productList16);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
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
        org.junit.Assert.assertNotNull(orderList5);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList4 = productRepository0.findAllOrders();
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
        org.junit.Assert.assertNotNull(orderList4);
        org.junit.Assert.assertNotNull(productList5);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Product product6 = productRepository0.findById((java.lang.Long) 1L);
        boolean boolean8 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        boolean boolean12 = productRepository0.delete((java.lang.Long) 10L);
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
        org.junit.Assert.assertNull(product6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(productList14);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        boolean boolean3 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList4 = productRepository0.findAll();
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(orderList7);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        java.util.List<org.example.Product> productList4 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        boolean boolean6 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(orderList7);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        org.example.Order order8 = productRepository0.findOrderById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList9 = productRepository0.findSortedByName();
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
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNull(order8);
        org.junit.Assert.assertNotNull(productList9);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Product product9 = productRepository0.findById((java.lang.Long) 1L);
        org.example.Product product11 = productRepository0.findById((java.lang.Long) (-1L));
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(product9);
        org.junit.Assert.assertNull(product11);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
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
        java.util.List<org.example.Product> productList17 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
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
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList1 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList3 = productRepository0.findByKeyword("");
        boolean boolean5 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findByKeyword("");
        org.example.Order order9 = productRepository0.findOrderById((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(order9);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList5 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList6 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("hi!");
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
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
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
        java.util.List<org.example.Product> productList13 = productRepository0.findAll();
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
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNull(product7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(orderList12);
        org.junit.Assert.assertNotNull(productList13);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
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
        java.util.List<org.example.Product> productList17 = productRepository0.findByKeyword("");
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
        org.junit.Assert.assertNotNull(productList17);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList8 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        org.example.Product product10 = productRepository0.findById((java.lang.Long) 10L);
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
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNull(product10);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList1 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList3 = productRepository0.findByKeyword("");
        boolean boolean5 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList8 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        java.util.List<org.example.Product> productList9 = productRepository0.findSortedByName();
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList9);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Product> productList10 = productRepository0.findByKeyword("hi!");
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
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
        org.example.Product product10 = productRepository0.findById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList11 = productRepository0.findAll();
        boolean boolean13 = productRepository0.delete((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNull(product10);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        boolean boolean4 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList7 = productRepository0.findByKeyword("hi!");
        org.example.Product product8 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList7);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
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
        java.util.List<org.example.Product> productList17 = productRepository0.findAll();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNull(order12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(productList17);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList8 = productRepository0.findAllOrders();
        org.example.Product product10 = productRepository0.findById((java.lang.Long) 1L);
        org.example.Order order12 = productRepository0.findOrderById((java.lang.Long) (-1L));
        java.util.List<org.example.Order> orderList13 = productRepository0.findAllOrders();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(orderList7);
        org.junit.Assert.assertNotNull(orderList8);
        org.junit.Assert.assertNull(product10);
        org.junit.Assert.assertNull(order12);
        org.junit.Assert.assertNotNull(orderList13);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
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
        org.example.Product product14 = productRepository0.findById((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(orderList12);
        org.junit.Assert.assertNull(product14);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList4 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList7 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        boolean boolean9 = productRepository0.delete((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(orderList4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
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
        boolean boolean17 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList18 = productRepository0.findAll();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(productList18);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
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
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(orderList7);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNull(product13);
        org.junit.Assert.assertNotNull(orderList14);
        org.junit.Assert.assertNull(order16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findAll();
        org.example.Product product7 = productRepository0.findById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList9 = productRepository0.findByKeyword("hi!");
        org.example.Order order11 = productRepository0.findOrderById((java.lang.Long) 1L);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNull(product7);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNull(order11);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList2 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        org.example.Product product5 = productRepository0.findById((java.lang.Long) 0L);
        boolean boolean7 = productRepository0.delete((java.lang.Long) 100L);
        boolean boolean9 = productRepository0.delete((java.lang.Long) (-1L));
        org.example.Product product11 = productRepository0.findById((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(orderList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNull(product5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(product11);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList1 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList3 = productRepository0.findByKeyword("");
        boolean boolean5 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findByKeyword("");
        org.example.Product product9 = productRepository0.findById((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList11 = productRepository0.findByKeyword("");
        org.example.Order order13 = productRepository0.findOrderById((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(product9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNull(order13);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList5 = productRepository0.findByKeyword("");
        boolean boolean7 = productRepository0.delete((java.lang.Long) 10L);
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
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList1 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList3 = productRepository0.findByKeyword("");
        boolean boolean5 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.util.List<org.example.Product> productList9 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList11 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        java.util.List<org.example.Order> orderList12 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList14 = productRepository0.findByKeyword("hi!");
        org.example.Product product15 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product15);
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
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        boolean boolean4 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList8 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Product product12 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList13 = productRepository0.findAll();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNull(product12);
        org.junit.Assert.assertNotNull(productList13);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
        boolean boolean10 = productRepository0.delete((java.lang.Long) 10L);
        org.example.Product product12 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList14 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        org.example.Order order16 = productRepository0.findOrderById((java.lang.Long) (-1L));
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(product12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNull(order16);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList8 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        boolean boolean10 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList11 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList12 = productRepository0.findAll();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList12);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
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
        java.util.List<org.example.Product> productList20 = productRepository0.findByKeyword("hi!");
        org.example.Order order21 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order21);
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
        org.junit.Assert.assertNotNull(orderList14);
        org.junit.Assert.assertNull(order16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(productList20);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
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
        org.junit.Assert.assertNull(product7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(orderList12);
        org.junit.Assert.assertNotNull(productList13);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList1 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        java.util.List<org.example.Product> productList4 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        org.example.Product product6 = productRepository0.findById((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNull(product6);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        boolean boolean4 = productRepository0.delete((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList9 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        boolean boolean11 = productRepository0.delete((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
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
        org.example.Order order15 = productRepository0.findOrderById((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNull(order15);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList7 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.util.List<org.example.Product> productList9 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
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
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        boolean boolean9 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Order> orderList10 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList12 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        java.util.List<org.example.Product> productList13 = productRepository0.findSortedByName();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(orderList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList13);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList4 = productRepository0.findAllOrders();
        org.example.Product product6 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order8 = productRepository0.findOrderById((java.lang.Long) 1L);
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
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(orderList4);
        org.junit.Assert.assertNull(product6);
        org.junit.Assert.assertNull(order8);
        org.junit.Assert.assertNotNull(productList9);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList2 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        org.example.Product product5 = productRepository0.findById((java.lang.Long) 0L);
        boolean boolean7 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList9 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.util.List<org.example.Product> productList10 = productRepository0.findSortedByName();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(orderList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNull(product5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList10);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
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
        boolean boolean16 = productRepository0.delete((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNull(order14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        boolean boolean8 = productRepository0.delete((java.lang.Long) 100L);
        org.example.Order order10 = productRepository0.findOrderById((java.lang.Long) 10L);
        boolean boolean12 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList13 = productRepository0.findSortedByName();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(order10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(productList13);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList4 = productRepository0.findAll();
        org.example.Product product6 = productRepository0.findById((java.lang.Long) 0L);
        boolean boolean8 = productRepository0.delete((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList9 = productRepository0.findSortedByName();
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
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNull(product6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(productList9);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList5 = productRepository0.findByKeyword("");
        org.example.Order order7 = productRepository0.findOrderById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList8 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList9 = productRepository0.findAllOrders();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNull(order7);
        org.junit.Assert.assertNotNull(orderList8);
        org.junit.Assert.assertNotNull(orderList9);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        boolean boolean4 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList9 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        java.util.List<org.example.Product> productList10 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList12 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList2 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        org.example.Product product5 = productRepository0.findById((java.lang.Long) 0L);
        boolean boolean7 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList9 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.util.List<org.example.Product> productList11 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        org.example.Product product13 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order14 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order14);
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
        org.junit.Assert.assertNull(product13);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        org.example.Product product8 = productRepository0.findById((java.lang.Long) 0L);
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
        org.junit.Assert.assertNull(product8);
        org.junit.Assert.assertNotNull(productList9);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList1 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList3 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        org.example.Order order4 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList3);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
        org.example.Product product10 = productRepository0.findById((java.lang.Long) 10L);
        boolean boolean12 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList13 = productRepository0.findAll();
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
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNull(product10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(productList13);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        boolean boolean8 = productRepository0.delete((java.lang.Long) (-1L));
        boolean boolean10 = productRepository0.delete((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Product product9 = productRepository0.findById((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList11 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.util.List<org.example.Order> orderList12 = productRepository0.findAllOrders();
        org.example.Order order14 = productRepository0.findOrderById((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(product9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(orderList12);
        org.junit.Assert.assertNull(order14);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList2 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        org.example.Product product5 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("hi!");
        java.lang.Class<?> wildcardClass9 = productList8.getClass();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(orderList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNull(product5);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList1 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList3 = productRepository0.findByKeyword("");
        boolean boolean5 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.util.List<org.example.Product> productList9 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList11 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        java.util.List<org.example.Order> orderList12 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList13 = productRepository0.findAll();
        org.example.Product product14 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product14);
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
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList3 = productRepository0.findAll();
        java.util.List<org.example.Product> productList4 = productRepository0.findAll();
        org.example.Product product6 = productRepository0.findById((java.lang.Long) (-1L));
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNull(product6);
        org.junit.Assert.assertNotNull(orderList7);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
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
        java.util.List<org.example.Product> productList16 = productRepository0.findSortedByName();
        org.example.Order order18 = productRepository0.findOrderById((java.lang.Long) 1L);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNull(order11);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNull(order15);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertNull(order18);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
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
        org.junit.Assert.assertNull(order11);
        org.junit.Assert.assertNull(order13);
        org.junit.Assert.assertNotNull(productList14);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Product product6 = productRepository0.findById((java.lang.Long) 1L);
        boolean boolean8 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        org.example.Product product12 = productRepository0.findById((java.lang.Long) 10L);
        org.example.Order order14 = productRepository0.findOrderById((java.lang.Long) 100L);
        org.example.Product product15 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(product6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNull(product12);
        org.junit.Assert.assertNull(order14);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
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
        org.example.Order order15 = productRepository0.findOrderById((java.lang.Long) 100L);
        org.example.Product product17 = productRepository0.findById((java.lang.Long) (-1L));
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(order9);
        org.junit.Assert.assertNull(product11);
        org.junit.Assert.assertNotNull(orderList12);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNull(order15);
        org.junit.Assert.assertNull(product17);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
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
        org.example.Product product21 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product21);
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
        org.junit.Assert.assertNotNull(productList19);
        org.junit.Assert.assertNotNull(productList20);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Order order9 = productRepository0.findOrderById((java.lang.Long) 1L);
        org.example.Product product11 = productRepository0.findById((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList12 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList13 = productRepository0.findAllOrders();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(order9);
        org.junit.Assert.assertNull(product11);
        org.junit.Assert.assertNotNull(orderList12);
        org.junit.Assert.assertNotNull(orderList13);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        java.util.List<org.example.Product> productList9 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Product> productList11 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        org.example.Product product7 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList8 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList9 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList10 = productRepository0.findAll();
        org.example.Order order12 = productRepository0.findOrderById((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList13 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList15 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
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
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNull(product7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(orderList9);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNull(order12);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNotNull(productList15);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList4 = productRepository0.findAll();
        boolean boolean6 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Product product9 = productRepository0.findById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList10 = productRepository0.findAll();
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
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(product9);
        org.junit.Assert.assertNotNull(productList10);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
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
        java.util.List<org.example.Product> productList19 = productRepository0.findByKeyword("");
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
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Order order9 = productRepository0.findOrderById((java.lang.Long) 1L);
        org.example.Product product11 = productRepository0.findById((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList13 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList15 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Order> orderList16 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList17 = productRepository0.findAll();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(order9);
        org.junit.Assert.assertNull(product11);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNotNull(productList15);
        org.junit.Assert.assertNotNull(orderList16);
        org.junit.Assert.assertNotNull(productList17);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        java.lang.Class<?> wildcardClass8 = orderList7.getClass();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(orderList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList4 = productRepository0.findAll();
        org.example.Product product6 = productRepository0.findById((java.lang.Long) 0L);
        boolean boolean8 = productRepository0.delete((java.lang.Long) 1L);
        org.example.Product product10 = productRepository0.findById((java.lang.Long) (-1L));
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNull(product6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(product10);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Order order9 = productRepository0.findOrderById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList10 = productRepository0.findAll();
        org.example.Order order12 = productRepository0.findOrderById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList14 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
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
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        org.example.Product product8 = productRepository0.findById((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList9 = productRepository0.findAll();
        java.util.List<org.example.Product> productList10 = productRepository0.findSortedByName();
        org.example.Order order12 = productRepository0.findOrderById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList13 = productRepository0.findAllOrders();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(product8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNull(order12);
        org.junit.Assert.assertNotNull(orderList13);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
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
            productRepository0.save(product17);
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
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
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
        java.util.List<org.example.Product> productList15 = productRepository0.findAll();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(product9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList15);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
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
        java.util.List<org.example.Product> productList17 = productRepository0.findAll();
        java.util.List<org.example.Product> productList19 = productRepository0.findByKeyword("hi!");
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
        org.junit.Assert.assertNotNull(productList19);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        boolean boolean8 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList9 = productRepository0.findAll();
        java.lang.Class<?> wildcardClass10 = productList9.getClass();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findAll();
        org.example.Product product7 = productRepository0.findById((java.lang.Long) 10L);
        org.example.Product product9 = productRepository0.findById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList11 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.lang.Class<?> wildcardClass12 = productRepository0.getClass();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNull(product7);
        org.junit.Assert.assertNull(product9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList2 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList3 = productRepository0.findAll();
        java.util.List<org.example.Product> productList4 = productRepository0.findSortedByName();
        java.lang.Class<?> wildcardClass5 = productRepository0.getClass();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(orderList2);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList3 = productRepository0.findAll();
        java.util.List<org.example.Product> productList4 = productRepository0.findAll();
        org.example.Product product6 = productRepository0.findById((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList8 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList9 = productRepository0.findSortedByName();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNull(product6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList9);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList6 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList7);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
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
            productRepository0.saveOrder(order17);
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
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
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
        org.example.Product product17 = productRepository0.findById((java.lang.Long) 0L);
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
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList15);
        org.junit.Assert.assertNull(product17);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        boolean boolean2 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList4 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList6 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
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
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList7);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        boolean boolean4 = productRepository0.delete((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        boolean boolean9 = productRepository0.delete((java.lang.Long) (-1L));
        org.example.Order order11 = productRepository0.findOrderById((java.lang.Long) 1L);
        org.example.Order order12 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(order11);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
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
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList8 = productRepository0.findAllOrders();
        org.example.Product product10 = productRepository0.findById((java.lang.Long) 1L);
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
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(orderList7);
        org.junit.Assert.assertNotNull(orderList8);
        org.junit.Assert.assertNull(product10);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        org.example.Product product7 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList8 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        java.util.List<org.example.Order> orderList11 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList13 = productRepository0.findByKeyword("");
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNull(product7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(orderList11);
        org.junit.Assert.assertNotNull(productList13);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
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
            productRepository0.updateOrder(order9);
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
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        boolean boolean9 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList10 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList12 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.lang.Class<?> wildcardClass13 = productList12.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(orderList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        org.example.Product product9 = productRepository0.findById((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(orderList7);
        org.junit.Assert.assertNull(product9);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
        org.example.Order order10 = productRepository0.findOrderById((java.lang.Long) 100L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = order10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNull(order10);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        boolean boolean2 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList3 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList4 = productRepository0.findAll();
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        boolean boolean8 = productRepository0.delete((java.lang.Long) 10L);
        boolean boolean10 = productRepository0.delete((java.lang.Long) 0L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        org.example.Product product7 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList8 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        boolean boolean12 = productRepository0.delete((java.lang.Long) 100L);
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
        org.junit.Assert.assertNotNull(orderList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        boolean boolean7 = productRepository0.delete((java.lang.Long) (-1L));
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        boolean boolean8 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList9 = productRepository0.findAll();
        boolean boolean11 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList13 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        java.util.List<org.example.Product> productList15 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        org.example.Product product17 = productRepository0.findById((java.lang.Long) 100L);
        boolean boolean19 = productRepository0.delete((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNotNull(productList15);
        org.junit.Assert.assertNull(product17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList5 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList6 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("hi!");
        org.example.Product product10 = productRepository0.findById((java.lang.Long) 1L);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNull(product10);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Order order9 = productRepository0.findOrderById((java.lang.Long) 1L);
        org.example.Product product11 = productRepository0.findById((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList13 = productRepository0.findByKeyword("");
        org.example.Order order15 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList17 = productRepository0.findByKeyword("hi!");
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(order9);
        org.junit.Assert.assertNull(product11);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNull(order15);
        org.junit.Assert.assertNotNull(productList17);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList1 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList3 = productRepository0.findByKeyword("");
        boolean boolean5 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList9 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        boolean boolean11 = productRepository0.delete((java.lang.Long) 10L);
        org.example.Product product13 = productRepository0.findById((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(product13);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        boolean boolean4 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList6 = productRepository0.findAll();
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        java.lang.Class<?> wildcardClass8 = productRepository0.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Product product6 = productRepository0.findById((java.lang.Long) 1L);
        boolean boolean8 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Product> productList11 = productRepository0.findSortedByName();
        org.example.Product product13 = productRepository0.findById((java.lang.Long) (-1L));
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(product6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNull(product13);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Product product6 = productRepository0.findById((java.lang.Long) 1L);
        boolean boolean8 = productRepository0.delete((java.lang.Long) 0L);
        org.example.Order order10 = productRepository0.findOrderById((java.lang.Long) 0L);
        org.example.Order order12 = productRepository0.findOrderById((java.lang.Long) 100L);
        org.example.Order order14 = productRepository0.findOrderById((java.lang.Long) (-1L));
        org.example.Product product16 = productRepository0.findById((java.lang.Long) (-1L));
        org.example.Order order17 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order17);
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
        org.junit.Assert.assertNull(order14);
        org.junit.Assert.assertNull(product16);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList1 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        java.util.List<org.example.Product> productList4 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        boolean boolean7 = productRepository0.delete((java.lang.Long) 1L);
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Order order9 = productRepository0.findOrderById((java.lang.Long) 1L);
        org.example.Product product11 = productRepository0.findById((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList12 = productRepository0.findSortedByName();
        java.lang.Class<?> wildcardClass13 = productRepository0.getClass();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(order9);
        org.junit.Assert.assertNull(product11);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
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
        java.util.List<org.example.Product> productList18 = productRepository0.findAll();
        java.util.List<org.example.Product> productList19 = productRepository0.findSortedByName();
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
        org.junit.Assert.assertNotNull(productList17);
        org.junit.Assert.assertNotNull(productList18);
        org.junit.Assert.assertNotNull(productList19);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList8 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order12 = productRepository0.findOrderById((java.lang.Long) 1L);
        org.example.Product product14 = productRepository0.findById((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(orderList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNull(order12);
        org.junit.Assert.assertNull(product14);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        boolean boolean8 = productRepository0.delete((java.lang.Long) 1L);
        org.example.Product product10 = productRepository0.findById((java.lang.Long) 1L);
        java.lang.Class<?> wildcardClass11 = productRepository0.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(product10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        org.example.Order order8 = productRepository0.findOrderById((java.lang.Long) 100L);
        org.example.Product product10 = productRepository0.findById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList11 = productRepository0.findAll();
        org.example.Product product13 = productRepository0.findById((java.lang.Long) 1L);
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
        org.junit.Assert.assertNull(order8);
        org.junit.Assert.assertNull(product10);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNull(product13);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList4 = productRepository0.findAll();
        boolean boolean6 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        org.example.Order order9 = productRepository0.findOrderById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList10 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList12 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Product> productList13 = productRepository0.findSortedByName();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(orderList7);
        org.junit.Assert.assertNull(order9);
        org.junit.Assert.assertNotNull(orderList10);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList13);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
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
        java.util.List<org.example.Product> productList17 = productRepository0.findAll();
        java.lang.Class<?> wildcardClass18 = productList17.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
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
        org.example.Product product19 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Product product20 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product20);
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
        org.junit.Assert.assertNull(product19);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList4 = productRepository0.findAllOrders();
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
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(orderList4);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList8 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList11 = productRepository0.findAllOrders();
        org.example.Order order13 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Order order14 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.saveOrder(order14);
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
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(orderList11);
        org.junit.Assert.assertNull(order13);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList1 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList3 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList4 = productRepository0.findAll();
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        org.example.Order order8 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(orderList7);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        org.example.Product product8 = productRepository0.findById((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList9 = productRepository0.findAll();
        java.util.List<org.example.Product> productList10 = productRepository0.findSortedByName();
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
        org.junit.Assert.assertNull(product8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList10);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
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
        org.example.Product product14 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product14);
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
        org.junit.Assert.assertNull(order11);
        org.junit.Assert.assertNotNull(productList13);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        boolean boolean9 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList10 = productRepository0.findAll();
        java.util.List<org.example.Order> orderList11 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList12 = productRepository0.findSortedByName();
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
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList8 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Product product10 = productRepository0.findById((java.lang.Long) (-1L));
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNull(product10);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findAll();
        org.example.Product product7 = productRepository0.findById((java.lang.Long) 10L);
        org.example.Product product9 = productRepository0.findById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList11 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        org.example.Order order13 = productRepository0.findOrderById((java.lang.Long) 1L);
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
        org.junit.Assert.assertNull(product7);
        org.junit.Assert.assertNull(product9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNull(order13);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        org.example.Order order8 = productRepository0.findOrderById((java.lang.Long) 100L);
        boolean boolean10 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList11 = productRepository0.findAll();
        org.example.Product product13 = productRepository0.findById((java.lang.Long) (-1L));
        org.example.Product product15 = productRepository0.findById((java.lang.Long) 1L);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(order8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNull(product13);
        org.junit.Assert.assertNull(product15);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
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
        java.util.List<org.example.Order> orderList15 = productRepository0.findAllOrders();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(order9);
        org.junit.Assert.assertNull(product11);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNull(product14);
        org.junit.Assert.assertNotNull(orderList15);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("hi!");
        org.example.Product product8 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList9 = productRepository0.findAll();
        java.util.List<org.example.Product> productList11 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList13 = productRepository0.findByKeyword("hi!");
        org.example.Product product15 = productRepository0.findById((java.lang.Long) 100L);
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
        org.junit.Assert.assertNull(product15);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("hi!");
        org.example.Product product8 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        java.util.List<org.example.Product> productList11 = productRepository0.findAll();
        boolean boolean13 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Order> orderList14 = productRepository0.findAllOrders();
        org.example.Order order16 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(product8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(orderList14);
        org.junit.Assert.assertNull(order16);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
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
        java.util.List<org.example.Product> productList16 = productRepository0.findByKeyword("");
        java.lang.Class<?> wildcardClass17 = productRepository0.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNull(order13);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNull(product16);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList8 = productRepository0.findAllOrders();
        org.example.Product product10 = productRepository0.findById((java.lang.Long) 10L);
        org.example.Product product12 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList13 = productRepository0.findAllOrders();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(orderList7);
        org.junit.Assert.assertNotNull(orderList8);
        org.junit.Assert.assertNull(product10);
        org.junit.Assert.assertNull(product12);
        org.junit.Assert.assertNotNull(orderList13);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList2 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        org.example.Product product5 = productRepository0.findById((java.lang.Long) 0L);
        boolean boolean7 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList9 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.util.List<org.example.Product> productList11 = productRepository0.findByKeyword("hi!");
        org.example.Product product13 = productRepository0.findById((java.lang.Long) 100L);
        org.example.Product product15 = productRepository0.findById((java.lang.Long) 1L);
        org.example.Product product16 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product16);
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
        org.junit.Assert.assertNull(product15);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList1 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList3 = productRepository0.findByKeyword("");
        boolean boolean5 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findByKeyword("");
        org.example.Product product9 = productRepository0.findById((java.lang.Long) (-1L));
        org.example.Order order11 = productRepository0.findOrderById((java.lang.Long) 10L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = order11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(product9);
        org.junit.Assert.assertNull(order11);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
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
        org.junit.Assert.assertNotNull(productList17);
        org.junit.Assert.assertNotNull(productList19);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("hi!");
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(productList8);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
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
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNull(product7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(product14);
        org.junit.Assert.assertNull(order16);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        boolean boolean4 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        org.example.Product product8 = productRepository0.findById((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList9 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList10 = productRepository0.findAll();
        org.example.Product product12 = productRepository0.findById((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNull(product8);
        org.junit.Assert.assertNotNull(orderList9);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNull(product12);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        boolean boolean2 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList4 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        boolean boolean6 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        org.example.Product product8 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(orderList7);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
        boolean boolean10 = productRepository0.delete((java.lang.Long) 10L);
        org.example.Product product12 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList14 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        org.example.Order order16 = productRepository0.findOrderById((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(product12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNull(order16);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        boolean boolean7 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList9 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList11 = productRepository0.findByKeyword("hi!");
        boolean boolean13 = productRepository0.delete((java.lang.Long) 100L);
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
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList1 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList3 = productRepository0.findByKeyword("");
        boolean boolean5 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.util.List<org.example.Product> productList9 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList11 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.util.List<org.example.Product> productList13 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList14 = productRepository0.findAll();
        org.example.Order order15 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order15);
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
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNotNull(productList14);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        boolean boolean5 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
        boolean boolean10 = productRepository0.delete((java.lang.Long) 10L);
        org.example.Product product12 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList13 = productRepository0.findAll();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(product12);
        org.junit.Assert.assertNotNull(productList13);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
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
        org.example.Product product18 = productRepository0.findById((java.lang.Long) 0L);
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
        org.junit.Assert.assertNull(product18);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList2 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        org.example.Product product5 = productRepository0.findById((java.lang.Long) 0L);
        boolean boolean7 = productRepository0.delete((java.lang.Long) 100L);
        boolean boolean9 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList11 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.lang.Class<?> wildcardClass12 = productList11.getClass();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(orderList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNull(product5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        boolean boolean9 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList10 = productRepository0.findSortedByName();
        boolean boolean12 = productRepository0.delete((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        boolean boolean4 = productRepository0.delete((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        boolean boolean8 = productRepository0.delete((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList10 = productRepository0.findByKeyword("");
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(productList10);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findAll();
        org.example.Product product7 = productRepository0.findById((java.lang.Long) 10L);
        org.example.Product product9 = productRepository0.findById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList11 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.util.List<org.example.Product> productList13 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNull(product7);
        org.junit.Assert.assertNull(product9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList13);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        org.example.Order order8 = productRepository0.findOrderById((java.lang.Long) 0L);
        org.example.Order order10 = productRepository0.findOrderById((java.lang.Long) 1L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = order10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNull(order8);
        org.junit.Assert.assertNull(order10);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList4 = productRepository0.findAllOrders();
        org.example.Product product6 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order8 = productRepository0.findOrderById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList9 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList10 = productRepository0.findAll();
        java.util.List<org.example.Product> productList11 = productRepository0.findSortedByName();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(orderList4);
        org.junit.Assert.assertNull(product6);
        org.junit.Assert.assertNull(order8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList11);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
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
        org.example.Product product25 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.save(product25);
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
        org.junit.Assert.assertNotNull(productList22);
        org.junit.Assert.assertNull(product24);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        boolean boolean4 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList9 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        org.example.Order order11 = productRepository0.findOrderById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList13 = productRepository0.findByKeyword("");
        java.util.List<org.example.Order> orderList14 = productRepository0.findAllOrders();
        java.lang.Class<?> wildcardClass15 = productRepository0.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNull(order11);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNotNull(orderList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        org.example.Product product8 = productRepository0.findById((java.lang.Long) (-1L));
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
        org.junit.Assert.assertNull(product8);
        org.junit.Assert.assertNotNull(productList9);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        org.example.Product product5 = productRepository0.findById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList7 = productRepository0.findByKeyword("");
        java.lang.Class<?> wildcardClass8 = productList7.getClass();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNull(product5);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList7 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.util.List<org.example.Product> productList9 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        java.util.List<org.example.Product> productList10 = productRepository0.findSortedByName();
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
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList10);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
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
        java.util.List<org.example.Product> productList16 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(orderList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(order14);
        org.junit.Assert.assertNotNull(productList16);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList10 = productRepository0.findByKeyword("");
        java.util.List<org.example.Order> orderList11 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList12 = productRepository0.findAllOrders();
        org.example.Order order14 = productRepository0.findOrderById((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(orderList11);
        org.junit.Assert.assertNotNull(orderList12);
        org.junit.Assert.assertNull(order14);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
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
        org.example.Order order13 = productRepository0.findOrderById((java.lang.Long) 1L);
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNull(product7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(orderList9);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNull(order13);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        boolean boolean4 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Product product9 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList10 = productRepository0.findAllOrders();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(product9);
        org.junit.Assert.assertNotNull(orderList10);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList4 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList7 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        java.util.List<org.example.Product> productList9 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.util.List<org.example.Product> productList11 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(orderList4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        org.example.Product product7 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList8 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList9 = productRepository0.findSortedByName();
        boolean boolean11 = productRepository0.delete((java.lang.Long) 10L);
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
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        org.example.Product product8 = productRepository0.findById((java.lang.Long) (-1L));
        org.example.Order order10 = productRepository0.findOrderById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList11 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList12 = productRepository0.findSortedByName();
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
        org.junit.Assert.assertNull(product8);
        org.junit.Assert.assertNull(order10);
        org.junit.Assert.assertNotNull(orderList11);
        org.junit.Assert.assertNotNull(productList12);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        boolean boolean8 = productRepository0.delete((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList9 = productRepository0.findAll();
        boolean boolean11 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList13 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        java.lang.Class<?> wildcardClass14 = productList13.getClass();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        boolean boolean4 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList7 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Product> productList9 = productRepository0.findByKeyword("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList10);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
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
        boolean boolean18 = productRepository0.delete((java.lang.Long) 0L);
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
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
            productRepository0.save(product14);
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
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        boolean boolean7 = productRepository0.delete((java.lang.Long) (-1L));
        org.example.Order order9 = productRepository0.findOrderById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList11 = productRepository0.findByKeyword("");
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(order9);
        org.junit.Assert.assertNotNull(productList11);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList5 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList6 = productRepository0.findSortedByName();
        org.example.Product product8 = productRepository0.findById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        java.util.List<org.example.Product> productList11 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList13 = productRepository0.findByKeyword("");
        boolean boolean15 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList16 = productRepository0.findAllOrders();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(product8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(orderList16);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList2 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        org.example.Product product5 = productRepository0.findById((java.lang.Long) 0L);
        boolean boolean7 = productRepository0.delete((java.lang.Long) 100L);
        boolean boolean9 = productRepository0.delete((java.lang.Long) (-1L));
        org.example.Product product11 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList13 = productRepository0.findByKeyword("hi!");
        org.example.Order order14 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList4 = productRepository0.findAll();
        boolean boolean6 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList8 = productRepository0.findAll();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(orderList7);
        org.junit.Assert.assertNotNull(productList8);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        java.util.List<org.example.Product> productList9 = productRepository0.findByKeyword("hi!");
        boolean boolean11 = productRepository0.delete((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList12 = productRepository0.findAllOrders();
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
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(orderList12);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
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
        java.util.List<org.example.Product> productList24 = productRepository0.findByKeyword("hi!");
        java.util.List<org.example.Product> productList26 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.util.List<org.example.Product> productList28 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
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
        org.junit.Assert.assertNotNull(productList26);
        org.junit.Assert.assertNotNull(productList28);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        boolean boolean4 = productRepository0.delete((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        org.example.Order order8 = productRepository0.findOrderById((java.lang.Long) 1L);
        org.example.Product product9 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(order8);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(productList7);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        org.example.Product product7 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList8 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList9 = productRepository0.findSortedByName();
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
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNull(product7);
        org.junit.Assert.assertNotNull(orderList8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList10);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findByKeyword("hi!");
        org.example.Order order9 = productRepository0.findOrderById((java.lang.Long) (-1L));
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(order9);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("hi!");
        org.example.Product product8 = productRepository0.findById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList9 = productRepository0.findAll();
        org.example.Order order11 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList13 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList15 = productRepository0.findByKeyword("hi!");
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(product8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNull(order11);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNotNull(productList15);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        boolean boolean7 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList9 = productRepository0.findByKeyword("");
        java.util.List<org.example.Order> orderList10 = productRepository0.findAllOrders();
        boolean boolean12 = productRepository0.delete((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList13 = productRepository0.findAll();
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
        org.junit.Assert.assertNotNull(orderList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(productList13);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
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
        boolean boolean19 = productRepository0.delete((java.lang.Long) 10L);
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
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
        java.util.List<org.example.Product> productList18 = productRepository0.findByKeyword("hi!");
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(product8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(productList18);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        org.example.Product product7 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList8 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList9 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList11 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        boolean boolean13 = productRepository0.delete((java.lang.Long) 1L);
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
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList2 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList3 = productRepository0.findAll();
        org.example.Order order5 = productRepository0.findOrderById((java.lang.Long) 100L);
        org.example.Order order6 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(orderList2);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNull(order5);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
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
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(productList4);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
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
        org.example.Order order17 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order17);
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
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNull(order16);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("");
        org.example.Product product10 = productRepository0.findById((java.lang.Long) 10L);
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
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNull(product10);
        org.junit.Assert.assertNotNull(productList11);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
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
        java.util.List<org.example.Product> productList18 = productRepository0.findAll();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(product8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNull(product15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(productList18);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Order order9 = productRepository0.findOrderById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList10 = productRepository0.findAll();
        org.example.Order order12 = productRepository0.findOrderById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList14 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.util.List<org.example.Order> orderList15 = productRepository0.findAllOrders();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(order9);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNull(order12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(orderList15);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList6 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        org.example.Order order9 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Product> productList10 = productRepository0.findAll();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(order9);
        org.junit.Assert.assertNotNull(productList10);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
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
        org.example.Order order18 = productRepository0.findOrderById((java.lang.Long) (-1L));
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
        org.junit.Assert.assertNull(order18);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        org.example.Order order6 = productRepository0.findOrderById((java.lang.Long) 10L);
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
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(productList7);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
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
        java.util.List<org.example.Product> productList17 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList18 = productRepository0.findAll();
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
        org.junit.Assert.assertNotNull(productList17);
        org.junit.Assert.assertNotNull(productList18);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        boolean boolean2 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList3 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList4 = productRepository0.findAll();
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList6 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList8 = productRepository0.findByKeyword("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList8);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        boolean boolean8 = productRepository0.delete((java.lang.Long) 10L);
        boolean boolean10 = productRepository0.delete((java.lang.Long) 100L);
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
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
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
        java.lang.Class<?> wildcardClass17 = productRepository0.getClass();
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
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        java.util.List<org.example.Product> productList9 = productRepository0.findByKeyword("");
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
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList9);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
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
        java.lang.Class<?> wildcardClass14 = productRepository0.getClass();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(product9);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNull(product12);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList4 = productRepository0.findAll();
        java.util.List<org.example.Product> productList5 = productRepository0.findAll();
        org.example.Order order7 = productRepository0.findOrderById((java.lang.Long) 1L);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNull(order7);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
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
        java.util.List<org.example.Product> productList17 = productRepository0.findSortedByName();
        org.example.Product product18 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product18);
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
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(productList17);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList7 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.util.List<org.example.Product> productList9 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        java.util.List<org.example.Product> productList11 = productRepository0.findByKeyword("");
        org.example.Product product13 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList15 = productRepository0.findByKeyword("hi!");
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNull(product13);
        org.junit.Assert.assertNotNull(productList15);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
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
        org.example.Product product17 = productRepository0.findById((java.lang.Long) 0L);
        org.example.Product product19 = productRepository0.findById((java.lang.Long) 10L);
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
        org.junit.Assert.assertNull(product17);
        org.junit.Assert.assertNull(product19);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList4 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList5 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList7 = productRepository0.findByPriceBelow((java.lang.Double) 100.0d);
        java.util.List<org.example.Product> productList9 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        boolean boolean11 = productRepository0.delete((java.lang.Long) 100L);
        org.example.Order order12 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.updateOrder(order12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Order.getId()\" because \"order\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(orderList4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList2 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        org.example.Product product5 = productRepository0.findById((java.lang.Long) 0L);
        boolean boolean7 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList8 = productRepository0.findAll();
        org.example.Order order10 = productRepository0.findOrderById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList11 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList12 = productRepository0.findAll();
        java.util.List<org.example.Product> productList14 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Product> productList15 = productRepository0.findAll();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(orderList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNull(product5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNull(order10);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList15);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
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
        org.example.Order order16 = productRepository0.findOrderById((java.lang.Long) 100L);
        java.util.List<org.example.Order> orderList17 = productRepository0.findAllOrders();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(product13);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNull(order16);
        org.junit.Assert.assertNotNull(orderList17);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
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
        org.example.Product product20 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product20);
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
        org.junit.Assert.assertNotNull(productList19);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
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
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(orderList9);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList6 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList9 = productRepository0.findByPriceBelow((java.lang.Double) 10.0d);
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
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList9);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList4 = productRepository0.findAll();
        boolean boolean6 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList7 = productRepository0.findSortedByName();
        org.example.Product product9 = productRepository0.findById((java.lang.Long) 1L);
        org.example.Product product11 = productRepository0.findById((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(product9);
        org.junit.Assert.assertNull(product11);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
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
        java.util.List<org.example.Order> orderList17 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList18 = productRepository0.findSortedByName();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(order8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertNotNull(orderList17);
        org.junit.Assert.assertNotNull(productList18);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 10L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList7 = productRepository0.findAll();
        boolean boolean9 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList10 = productRepository0.findAll();
        org.example.Product product12 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList13 = productRepository0.findAllOrders();
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNull(product12);
        org.junit.Assert.assertNotNull(orderList13);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findAll();
        org.example.Order order4 = productRepository0.findOrderById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList6 = productRepository0.findByKeyword("");
        boolean boolean8 = productRepository0.delete((java.lang.Long) 10L);
        boolean boolean10 = productRepository0.delete((java.lang.Long) 100L);
        java.util.List<org.example.Product> productList11 = productRepository0.findSortedByName();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(productList11);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList5 = productRepository0.findByKeyword("");
        java.util.List<org.example.Order> orderList6 = productRepository0.findAllOrders();
        java.util.List<org.example.Order> orderList7 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList8 = productRepository0.findAll();
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
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(orderList7);
        org.junit.Assert.assertNotNull(productList8);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Product> productList2 = productRepository0.findByPriceBelow((java.lang.Double) 0.0d);
        java.util.List<org.example.Order> orderList3 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList5 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList6 = productRepository0.findSortedByName();
        org.example.Product product8 = productRepository0.findById((java.lang.Long) 1L);
        java.util.List<org.example.Product> productList10 = productRepository0.findByPriceBelow((java.lang.Double) (-1.0d));
        java.util.List<org.example.Product> productList11 = productRepository0.findSortedByName();
        java.util.List<org.example.Product> productList13 = productRepository0.findByKeyword("");
        boolean boolean15 = productRepository0.delete((java.lang.Long) 100L);
        org.example.Product product16 = null;
        // The following exception was thrown during execution in test generation
        try {
            productRepository0.update(product16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Product.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(orderList3);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNull(product8);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
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
        java.util.List<org.example.Product> productList17 = productRepository0.findSortedByName();
        java.lang.Class<?> wildcardClass18 = productRepository0.getClass();
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
        org.junit.Assert.assertNotNull(productList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        org.example.ProductRepository productRepository0 = new org.example.ProductRepository();
        java.util.List<org.example.Order> orderList1 = productRepository0.findAllOrders();
        java.util.List<org.example.Product> productList2 = productRepository0.findSortedByName();
        org.example.Product product4 = productRepository0.findById((java.lang.Long) 0L);
        java.util.List<org.example.Order> orderList5 = productRepository0.findAllOrders();
        boolean boolean7 = productRepository0.delete((java.lang.Long) (-1L));
        java.util.List<org.example.Product> productList9 = productRepository0.findByKeyword("");
        java.util.List<org.example.Product> productList11 = productRepository0.findByPriceBelow((java.lang.Double) 1.0d);
        java.util.List<org.example.Product> productList12 = productRepository0.findSortedByName();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(orderList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList12);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
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
        java.lang.Class<?> wildcardClass16 = productRepository0.getClass();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNull(order9);
        org.junit.Assert.assertNull(order11);
        org.junit.Assert.assertNull(order13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }
}

