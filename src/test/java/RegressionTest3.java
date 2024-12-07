import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

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
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}", "Product{id=100, name='hi!', description='', price=1.0, quantity=10}", (java.lang.Double) (-1.0d), (int) (short) 100);
        java.lang.String str6 = product5.getName();
        java.util.List<java.lang.Double> doubleList7 = product5.getPriceHistory();
        product5.setName("hi!");
        java.lang.String str10 = product5.toString();
        java.lang.Double double11 = product5.getPrice();
        product5.setQuantity(35);
        product5.setDescription("Product{id=10, name='Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}', description='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', price=10.0, quantity=100}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}" + "'", str6, "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=100}" + "'", str10, "Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=100}");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        product5.setName("hi!");
        int int10 = product5.getQuantity();
        product5.setName("Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}");
        java.lang.Long long13 = product5.getId();
        java.lang.String str14 = product5.toString();
        product5.setDescription("Product{id=1, name='', description='', price=-1.0, quantity=100}");
        int int17 = product5.getQuantity();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Product{id=100, name='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', description='', price=1.0, quantity=0}" + "'", str14, "Product{id=100, name='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setQuantity((int) '#');
        product5.setId((java.lang.Long) 100L);
        java.lang.Double double15 = product5.getPrice();
        java.lang.String str16 = product5.getDescription();
        java.lang.Long long17 = product5.getId();
        product5.setName("Product{id=0, name='hi!', description='', price=1.0, quantity=1}");
        product5.addPriceToHistory((java.lang.Double) (-1.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        product5.setName("hi!");
        java.lang.String str10 = product5.toString();
        java.lang.Long long11 = product5.getId();
        java.lang.String str12 = product5.getName();
        product5.setPrice((java.lang.Double) (-1.0d));
        java.lang.Double double15 = product5.getPrice();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str10, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setQuantity((int) '#');
        product5.setName("hi!");
        java.lang.String str15 = product5.getDescription();
        java.lang.String str16 = product5.getDescription();
        java.lang.Long long17 = product5.getId();
        int int18 = product5.getQuantity();
        java.lang.String str19 = product5.toString();
        java.lang.String str20 = product5.toString();
        product5.addPriceToHistory((java.lang.Double) 10.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Product{id=100, name='hi!', description='', price=10.0, quantity=35}" + "'", str19, "Product{id=100, name='hi!', description='', price=10.0, quantity=35}");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Product{id=100, name='hi!', description='', price=10.0, quantity=35}" + "'", str20, "Product{id=100, name='hi!', description='', price=10.0, quantity=35}");
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setQuantity((int) '#');
        product5.setId((java.lang.Long) 100L);
        java.lang.Double double15 = product5.getPrice();
        java.util.List<java.lang.Double> doubleList16 = product5.getPriceHistory();
        product5.setPrice((java.lang.Double) (-1.0d));
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        java.lang.String str21 = product5.getName();
        java.lang.Long long22 = product5.getId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(doubleList16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "Product{id=100, name='', description='', price=10.0, quantity=0}", "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", (java.lang.Double) 1.0d, 100);
        product5.setName("Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        int int8 = product5.getQuantity();
        java.lang.String str9 = product5.getName();
        java.lang.String str10 = product5.getDescription();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str9, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str10, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        int int11 = product5.getQuantity();
        java.util.List<java.lang.Double> doubleList12 = product5.getPriceHistory();
        java.lang.String str13 = product5.getDescription();
        product5.setDescription("Product{id=100, name='hi!', description='', price=10.0, quantity=0}");
        int int16 = product5.getQuantity();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(doubleList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str13, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setId((java.lang.Long) 10L);
        java.lang.Long long14 = product5.getId();
        java.lang.String str15 = product5.getDescription();
        java.lang.Double double16 = product5.getPrice();
        product5.setId((java.lang.Long) 0L);
        java.util.List<java.lang.Double> doubleList19 = product5.getPriceHistory();
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertNotNull(doubleList19);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        java.lang.String str9 = product5.getDescription();
        product5.setId((java.lang.Long) 10L);
        int int12 = product5.getQuantity();
        java.lang.Class<?> wildcardClass13 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.lang.String str10 = product5.getName();
        java.util.List<java.lang.Double> doubleList11 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 0L);
        product5.setQuantity((int) (byte) 0);
        java.lang.Long long16 = product5.getId();
        java.lang.String str17 = product5.toString();
        java.lang.String str18 = product5.getDescription();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(doubleList11);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str17, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        product5.setQuantity((int) (short) 10);
        java.lang.String str9 = product5.toString();
        java.lang.Long long10 = product5.getId();
        product5.setDescription("");
        product5.setId((java.lang.Long) 10L);
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        java.lang.String str17 = product5.getDescription();
        product5.setQuantity((int) (short) 10);
        java.lang.Double double20 = product5.getPrice();
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=10}" + "'", str9, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=0, name='hi!', description='', price=1.0, quantity=0}", "Product{id=100, name='', description='', price=10.0, quantity=0}", (java.lang.Double) (-1.0d), (int) '#');
        product5.setId((java.lang.Long) 10L);
        java.util.List<java.lang.Double> doubleList8 = product5.getPriceHistory();
        java.lang.String str9 = product5.getDescription();
        java.util.List<java.lang.Double> doubleList10 = product5.getPriceHistory();
        org.junit.Assert.assertNotNull(doubleList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str9, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList10);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.lang.String str10 = product5.getName();
        java.util.List<java.lang.Double> doubleList11 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 0L);
        product5.setQuantity((int) (byte) 0);
        java.lang.Long long16 = product5.getId();
        java.lang.String str17 = product5.toString();
        java.lang.String str18 = product5.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(doubleList11);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str17, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str18, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        product5.setQuantity((int) (short) 10);
        java.lang.String str9 = product5.toString();
        product5.setDescription("hi!");
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.Double double14 = product5.getPrice();
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        int int17 = product5.getQuantity();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=10}" + "'", str9, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.util.List<java.lang.Double> doubleList8 = product5.getPriceHistory();
        product5.setPrice((java.lang.Double) 0.0d);
        product5.setName("Product{id=0, name='Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}', description='Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}', price=1.0, quantity=0}");
        product5.setId((java.lang.Long) 1L);
        org.junit.Assert.assertNotNull(doubleList8);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.util.List<java.lang.Double> doubleList10 = product5.getPriceHistory();
        java.lang.Double double11 = product5.getPrice();
        product5.setId((java.lang.Long) 0L);
        java.util.List<java.lang.Double> doubleList14 = product5.getPriceHistory();
        product5.setName("Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}");
        product5.setDescription("Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}");
        product5.setQuantity((int) '4');
        java.lang.String str21 = product5.getName();
        org.junit.Assert.assertNotNull(doubleList10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(doubleList14);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}" + "'", str21, "Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}");
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}", "Product{id=100, name='hi!', description='', price=1.0, quantity=10}", (java.lang.Double) (-1.0d), (int) (short) 100);
        java.lang.String str6 = product5.getName();
        java.util.List<java.lang.Double> doubleList7 = product5.getPriceHistory();
        product5.setName("hi!");
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setDescription("Product{id=100, name='hi!', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}" + "'", str6, "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList7);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setQuantity((int) (short) 1);
        java.lang.Double double10 = product5.getPrice();
        java.lang.String str11 = product5.getName();
        java.lang.Long long12 = product5.getId();
        java.lang.Double double13 = product5.getPrice();
        product5.setDescription("Product{id=100, name='', description='Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "hi!", "Product{id=1, name='', description='', price=-1.0, quantity=100}", (java.lang.Double) 0.0d, (int) (byte) 10);
        java.lang.String str6 = product5.getName();
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.String str7 = product5.toString();
        java.lang.Long long8 = product5.getId();
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.Double double11 = product5.getPrice();
        java.lang.String str12 = product5.getDescription();
        java.lang.String str13 = product5.getDescription();
        java.lang.String str14 = product5.getName();
        java.lang.String str15 = product5.toString();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str7, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Product{id=100, name='hi!', description='', price=0.0, quantity=0}" + "'", str15, "Product{id=100, name='hi!', description='', price=0.0, quantity=0}");
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.Long long7 = product5.getId();
        int int8 = product5.getQuantity();
        java.lang.String str9 = product5.getDescription();
        int int10 = product5.getQuantity();
        java.lang.Long long11 = product5.getId();
        product5.addPriceToHistory((java.lang.Double) 1.0d);
        java.lang.String str14 = product5.toString();
        int int15 = product5.getQuantity();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str14, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}", "Product{id=0, name='Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}', description='Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}', price=0.0, quantity=100}", (java.lang.Double) 0.0d, (int) (byte) -1);
        java.lang.String str6 = product5.getDescription();
        int int7 = product5.getQuantity();
        java.lang.String str8 = product5.toString();
        product5.setDescription("Product{id=0, name='Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}', description='Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}', price=0.0, quantity=100}");
        java.lang.String str11 = product5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=0, name='Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}', description='Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}', price=0.0, quantity=100}" + "'", str6, "Product{id=0, name='Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}', description='Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}', price=0.0, quantity=100}");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Product{id=0, name='Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}', description='Product{id=0, name='Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}', description='Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}', price=0.0, quantity=100}', price=0.0, quantity=-1}" + "'", str8, "Product{id=0, name='Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}', description='Product{id=0, name='Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}', description='Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}', price=0.0, quantity=100}', price=0.0, quantity=-1}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}" + "'", str11, "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}");
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setQuantity((int) '#');
        product5.setId((java.lang.Long) 100L);
        java.lang.Double double15 = product5.getPrice();
        java.util.List<java.lang.Double> doubleList16 = product5.getPriceHistory();
        product5.setName("Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        product5.setId((java.lang.Long) 100L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(doubleList16);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.util.List<java.lang.Double> doubleList7 = product5.getPriceHistory();
        product5.setQuantity((int) (short) 100);
        java.lang.Double double10 = product5.getPrice();
        java.lang.String str11 = product5.getName();
        java.util.List<java.lang.Double> doubleList12 = product5.getPriceHistory();
        product5.setPrice((java.lang.Double) (-1.0d));
        product5.setName("Product{id=0, name='Product{id=100, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=0.0, quantity=0}', description='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(doubleList7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(doubleList12);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        product5.setName("hi!");
        int int10 = product5.getQuantity();
        product5.setName("Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}");
        product5.setId((java.lang.Long) 100L);
        product5.setQuantity((int) (byte) 0);
        product5.setPrice((java.lang.Double) 100.0d);
        java.lang.Class<?> wildcardClass19 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getDescription();
        product5.setId((java.lang.Long) 0L);
        java.lang.String str11 = product5.toString();
        java.lang.Long long12 = product5.getId();
        int int13 = product5.getQuantity();
        java.lang.String str14 = product5.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str11, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str14, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setQuantity((int) '#');
        product5.setId((java.lang.Long) 100L);
        java.lang.Double double15 = product5.getPrice();
        java.lang.String str16 = product5.getDescription();
        java.lang.String str17 = product5.getName();
        product5.setName("Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        product5.setName("Product{id=100, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 10.0d, (int) (short) 1);
        java.lang.String str6 = product5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        java.lang.String str11 = product5.getDescription();
        java.lang.String str12 = product5.toString();
        product5.setName("Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        product5.setQuantity((int) (short) 100);
        product5.setDescription("Product{id=10, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=10.0, quantity=35}");
        java.lang.Long long19 = product5.getId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Product{id=100, name='hi!', description='', price=10.0, quantity=0}" + "'", str12, "Product{id=100, name='hi!', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getDescription();
        java.lang.String str9 = product5.toString();
        java.lang.String str10 = product5.getName();
        product5.setQuantity(0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str9, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        int int11 = product5.getQuantity();
        java.util.List<java.lang.Double> doubleList12 = product5.getPriceHistory();
        java.lang.String str13 = product5.toString();
        product5.setDescription("Product{id=100, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='', price=10.0, quantity=0}");
        java.util.List<java.lang.Double> doubleList16 = product5.getPriceHistory();
        java.lang.Class<?> wildcardClass17 = doubleList16.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(doubleList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}" + "'", str13, "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.Long long7 = product5.getId();
        int int8 = product5.getQuantity();
        java.lang.String str9 = product5.getDescription();
        int int10 = product5.getQuantity();
        java.lang.Long long11 = product5.getId();
        java.lang.Double double12 = product5.getPrice();
        product5.setId((java.lang.Long) 100L);
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getName();
        product5.setDescription("hi!");
        product5.setPrice((java.lang.Double) 1.0d);
        product5.setDescription("hi!");
        product5.setDescription("Product{id=100, name='hi!', description='', price=1.0, quantity=35}");
        java.lang.Long long17 = product5.getId();
        product5.setDescription("Product{id=1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='Product{id=100, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='', price=10.0, quantity=0}', price=1.0, quantity=0}', price=0.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        product5.setDescription("Product{id=-1, name='hi!', description='', price=0.0, quantity=100}");
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setName("Product{id=100, name='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', description='', price=-1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.String str11 = product5.getDescription();
        product5.setId((java.lang.Long) 0L);
        java.lang.String str14 = product5.toString();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Product{id=0, name='hi!', description='', price=0.0, quantity=0}" + "'", str14, "Product{id=0, name='hi!', description='', price=0.0, quantity=0}");
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setQuantity((int) '#');
        product5.setName("hi!");
        java.lang.Double double15 = product5.getPrice();
        product5.setQuantity(52);
        java.lang.String str18 = product5.getName();
        int int19 = product5.getQuantity();
        product5.setDescription("Product{id=10, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=10.0, quantity=35}");
        product5.setDescription("Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setQuantity((int) (short) 1);
        java.lang.Double double10 = product5.getPrice();
        java.lang.String str11 = product5.getName();
        product5.setId((java.lang.Long) 0L);
        product5.setDescription("");
        java.lang.Long long16 = product5.getId();
        product5.setId((java.lang.Long) 0L);
        product5.setName("Product{id=100, name='', description='', price=10.0, quantity=0}");
        java.lang.Long long21 = product5.getId();
        java.lang.Long long22 = product5.getId();
        product5.setPrice((java.lang.Double) (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.String str7 = product5.toString();
        java.lang.Long long8 = product5.getId();
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.Double double11 = product5.getPrice();
        java.lang.String str12 = product5.getDescription();
        java.lang.String str13 = product5.getDescription();
        java.lang.String str14 = product5.getName();
        product5.setPrice((java.lang.Double) 1.0d);
        product5.setDescription("Product{id=100, name='Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=100}', description='', price=1.0, quantity=0}");
        product5.setPrice((java.lang.Double) 1.0d);
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str7, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=100, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='', price=10.0, quantity=0}", "Product{id=100, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=0.0, quantity=0}", (java.lang.Double) 0.0d, (int) '4');
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.Long long7 = product5.getId();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "Product{id=0, name='hi!', description='Product{id=100, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='', price=10.0, quantity=0}', price=1.0, quantity=0}", "Product{id=1, name='Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}', description='Product{id=0, name='hi!', description='', price=100.0, quantity=0}', price=10.0, quantity=0}", (java.lang.Double) 10.0d, 35);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "", "", (java.lang.Double) 0.0d, (int) (short) -1);
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        product5.setDescription("Product{id=0, name='Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}', description='Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}', price=1.0, quantity=0}");
        product5.setName("Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        product5.setQuantity((int) '4');
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.String str7 = product5.toString();
        java.lang.Long long8 = product5.getId();
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.Double double11 = product5.getPrice();
        java.lang.String str12 = product5.getDescription();
        java.lang.Long long13 = product5.getId();
        java.lang.String str14 = product5.getName();
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        java.lang.String str17 = product5.getName();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str7, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        product5.setQuantity(0);
        java.lang.Double double13 = product5.getPrice();
        java.util.List<java.lang.Double> doubleList14 = product5.getPriceHistory();
        product5.addPriceToHistory((java.lang.Double) 10.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(doubleList14);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "Product{id=0, name='hi!', description='', price=100.0, quantity=100}", "Product{id=-1, name='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', description='Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}', price=10.0, quantity=32}", (java.lang.Double) 1.0d, 0);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        product5.setName("hi!");
        product5.addPriceToHistory((java.lang.Double) 1.0d);
        product5.setQuantity((int) '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}", "Product{id=100, name='hi!', description='', price=1.0, quantity=10}", (java.lang.Double) (-1.0d), (int) (short) 100);
        java.lang.String str6 = product5.getDescription();
        product5.setQuantity(0);
        product5.setDescription("Product{id=0, name='hi!', description='', price=-1.0, quantity=0}");
        product5.setPrice((java.lang.Double) (-1.0d));
        java.lang.Long long13 = product5.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=10}" + "'", str6, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        int int7 = product5.getQuantity();
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        java.util.List<java.lang.Double> doubleList10 = product5.getPriceHistory();
        java.lang.String str11 = product5.getName();
        java.lang.Class<?> wildcardClass12 = product5.getClass();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(doubleList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        product5.setName("hi!");
        java.lang.Double double10 = product5.getPrice();
        product5.setId((java.lang.Long) (-1L));
        int int13 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        java.lang.String str16 = product5.getName();
        product5.addPriceToHistory((java.lang.Double) 1.0d);
        product5.setDescription("Product{id=100, name='hi!', description='hi!', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.Double double8 = product5.getPrice();
        product5.setId((java.lang.Long) (-1L));
        java.lang.String str11 = product5.getDescription();
        java.lang.Long long12 = product5.getId();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setId((java.lang.Long) 10L);
        product5.setName("Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=10.0, quantity=0}");
        product5.setQuantity(10);
        java.lang.Double double18 = product5.getPrice();
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}", "Product{id=100, name='hi!', description='hi!', price=10.0, quantity=0}", (java.lang.Double) 10.0d, (int) (byte) 1);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}", "Product{id=100, name='hi!', description='', price=1.0, quantity=10}", (java.lang.Double) (-1.0d), (int) (short) 100);
        java.lang.String str6 = product5.getDescription();
        product5.setQuantity(0);
        product5.setDescription("Product{id=0, name='hi!', description='', price=-1.0, quantity=0}");
        product5.setPrice((java.lang.Double) (-1.0d));
        product5.setDescription("Product{id=100, name='Product{id=100, name='hi!', description='', price=1.0, quantity=0}', description='Product{id=0, name='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=0}', price=10.0, quantity=-1}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=10}" + "'", str6, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        java.lang.Long long9 = product5.getId();
        java.util.List<java.lang.Double> doubleList10 = product5.getPriceHistory();
        int int11 = product5.getQuantity();
        java.util.List<java.lang.Double> doubleList12 = product5.getPriceHistory();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertNotNull(doubleList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(doubleList12);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setName("");
        java.lang.String str14 = product5.toString();
        java.lang.Double double15 = product5.getPrice();
        java.lang.String str16 = product5.toString();
        product5.setQuantity((int) (short) -1);
        product5.setPrice((java.lang.Double) 100.0d);
        java.lang.String str21 = product5.getName();
        product5.setQuantity(52);
        product5.setName("Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        product5.addPriceToHistory((java.lang.Double) (-1.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str14, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str16, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        product5.setName("hi!");
        java.lang.Double double10 = product5.getPrice();
        product5.setId((java.lang.Long) (-1L));
        java.lang.String str13 = product5.getName();
        int int14 = product5.getQuantity();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=100, name='', description='', price=10.0, quantity=0}", "", (java.lang.Double) 100.0d, (int) ' ');
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        java.lang.Long long8 = product5.getId();
        java.util.List<java.lang.Double> doubleList9 = product5.getPriceHistory();
        java.lang.String str10 = product5.toString();
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        java.lang.String str13 = product5.getName();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(doubleList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}" + "'", str10, "Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str13, "Product{id=100, name='', description='', price=10.0, quantity=0}");
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setId((java.lang.Long) 10L);
        product5.setName("");
        product5.setQuantity((int) (short) 10);
        product5.setName("Product{id=100, name='', description='', price=10.0, quantity=0}");
        java.lang.String str20 = product5.toString();
        product5.setPrice((java.lang.Double) (-1.0d));
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        product5.setId((java.lang.Long) 0L);
        product5.setQuantity((int) (short) -1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}" + "'", str20, "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}");
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        product5.setName("hi!");
        int int10 = product5.getQuantity();
        product5.setName("Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}");
        product5.setId((java.lang.Long) 100L);
        product5.setId((java.lang.Long) 100L);
        product5.setDescription("Product{id=100, name='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setQuantity((int) '#');
        product5.setName("hi!");
        java.lang.Double double15 = product5.getPrice();
        product5.setQuantity(52);
        product5.setQuantity(0);
        java.lang.Long long20 = product5.getId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 100L + "'", long20 == 100L);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=100, name='hi!', description='', price=1.0, quantity=10}", "Product{id=0, name='hi!', description='', price=1.0, quantity=0}", (java.lang.Double) 0.0d, (int) (short) -1);
        java.lang.String str6 = product5.getName();
        java.lang.String str7 = product5.getName();
        product5.addPriceToHistory((java.lang.Double) 10.0d);
        product5.addPriceToHistory((java.lang.Double) 1.0d);
        java.lang.Long long12 = product5.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=10}" + "'", str6, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=10}" + "'", str7, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 0L);
        java.lang.String str9 = product5.getDescription();
        product5.setDescription("Product{id=100, name='hi!', description='', price=10.0, quantity=0}");
        java.lang.Long long12 = product5.getId();
        product5.setId((java.lang.Long) 0L);
        java.lang.Double double15 = product5.getPrice();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        java.lang.String str10 = product5.getDescription();
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        java.lang.Double double13 = product5.getPrice();
        java.lang.Class<?> wildcardClass14 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setQuantity((int) (short) 1);
        product5.setQuantity((int) (short) 100);
        java.lang.String str12 = product5.getName();
        product5.setDescription("Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
        java.util.List<java.lang.Double> doubleList15 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 100L);
        product5.setDescription("Product{id=0, name='Product{id=10, name='hi!', description='', price=10.0, quantity=0}', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=0.0, quantity=-1}");
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(doubleList15);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 0.0d);
        product5.setQuantity(52);
        product5.setDescription("Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", "hi!", (java.lang.Double) 100.0d, (int) '#');
        int int6 = product5.getQuantity();
        product5.setName("Product{id=100, name='', description='', price=10.0, quantity=0}");
        java.lang.Double double9 = product5.getPrice();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setName("Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}");
        java.lang.Double double14 = product5.getPrice();
        product5.setQuantity((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        java.lang.Long long10 = product5.getId();
        product5.setQuantity((int) (short) 100);
        java.util.List<java.lang.Double> doubleList13 = product5.getPriceHistory();
        product5.addPriceToHistory((java.lang.Double) (-1.0d));
        java.lang.Long long16 = product5.getId();
        product5.setQuantity((int) (byte) 1);
        java.lang.String str19 = product5.getDescription();
        product5.addPriceToHistory((java.lang.Double) 10.0d);
        java.lang.String str22 = product5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertNotNull(doubleList13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=1}" + "'", str22, "Product{id=100, name='hi!', description='', price=1.0, quantity=1}");
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", "hi!", (java.lang.Double) 100.0d, (int) '#');
        int int6 = product5.getQuantity();
        product5.setName("Product{id=100, name='', description='', price=10.0, quantity=0}");
        java.lang.String str9 = product5.getName();
        product5.setName("Product{id=-1, name='hi!', description='', price=0.0, quantity=100}");
        product5.setName("Product{id=-1, name='hi!', description='', price=0.0, quantity=100}");
        java.util.List<java.lang.Double> doubleList14 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 1L);
        java.util.List<java.lang.Double> doubleList17 = product5.getPriceHistory();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str9, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList14);
        org.junit.Assert.assertNotNull(doubleList17);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        java.lang.String str10 = product5.getDescription();
        product5.setQuantity(0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.String str7 = product5.toString();
        java.lang.Long long8 = product5.getId();
        java.lang.String str9 = product5.getDescription();
        java.lang.String str10 = product5.toString();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str7, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str10, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setQuantity((int) '#');
        product5.setName("hi!");
        java.lang.String str15 = product5.getDescription();
        product5.setDescription("Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}");
        product5.setName("Product{id=1, name='Product{id=-1, name='hi!', description='', price=0.0, quantity=100}', description='hi!', price=100.0, quantity=35}");
        java.lang.Class<?> wildcardClass20 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "Product{id=0, name='Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}', description='Product{id=0, name='Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}', description='Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}', price=0.0, quantity=100}', price=0.0, quantity=-1}", "Product{id=-1, name='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', description='Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}', price=10.0, quantity=32}", (java.lang.Double) 10.0d, (int) ' ');
        java.lang.Double double6 = product5.getPrice();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        int int8 = product5.getQuantity();
        java.util.List<java.lang.Double> doubleList9 = product5.getPriceHistory();
        product5.setPrice((java.lang.Double) 0.0d);
        product5.setId((java.lang.Long) 100L);
        product5.setId((java.lang.Long) 100L);
        java.lang.Double double16 = product5.getPrice();
        java.lang.Double double17 = product5.getPrice();
        java.lang.String str18 = product5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleList9);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Product{id=100, name='hi!', description='', price=0.0, quantity=0}" + "'", str18, "Product{id=100, name='hi!', description='', price=0.0, quantity=0}");
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setQuantity((int) '#');
        product5.setName("hi!");
        java.lang.String str15 = product5.getDescription();
        java.lang.String str16 = product5.getDescription();
        product5.setPrice((java.lang.Double) 0.0d);
        product5.setName("Product{id=100, name='hi!', description='', price=100.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) 10.0d);
        java.lang.String str12 = product5.getDescription();
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.String str15 = product5.getName();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=100, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}", "Product{id=100, name='hi!', description='', price=1.0, quantity=10}", (java.lang.Double) 1.0d, 35);
        java.lang.String str6 = product5.getDescription();
        java.lang.Long long7 = product5.getId();
        java.lang.String str8 = product5.getDescription();
        java.util.List<java.lang.Double> doubleList9 = product5.getPriceHistory();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=10}" + "'", str6, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=10}" + "'", str8, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
        org.junit.Assert.assertNotNull(doubleList9);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", "hi!", (java.lang.Double) 100.0d, (int) '#');
        int int6 = product5.getQuantity();
        product5.setName("Product{id=100, name='', description='', price=10.0, quantity=0}");
        java.lang.Double double9 = product5.getPrice();
        product5.setPrice((java.lang.Double) 10.0d);
        java.lang.Long long12 = product5.getId();
        product5.setId((java.lang.Long) 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", "hi!", (java.lang.Double) 100.0d, (int) '#');
        int int6 = product5.getQuantity();
        product5.setName("Product{id=100, name='', description='', price=10.0, quantity=0}");
        java.lang.String str9 = product5.getName();
        product5.setName("Product{id=1, name='', description='', price=-1.0, quantity=100}");
        java.lang.Double double12 = product5.getPrice();
        product5.setName("Product{id=1, name='', description='', price=-1.0, quantity=100}");
        product5.setQuantity((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str9, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.String str8 = product5.getDescription();
        product5.addPriceToHistory((java.lang.Double) 1.0d);
        java.lang.String str11 = product5.getName();
        product5.setName("Product{id=-1, name='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=-1.0, quantity=35}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getName();
        product5.setDescription("hi!");
        product5.setId((java.lang.Long) 10L);
        java.util.List<java.lang.Double> doubleList13 = product5.getPriceHistory();
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) 1.0d);
        java.lang.Class<?> wildcardClass18 = product5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(doubleList13);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.String str8 = product5.getDescription();
        java.util.List<java.lang.Double> doubleList9 = product5.getPriceHistory();
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.String str12 = product5.getName();
        product5.setQuantity((int) (short) 10);
        java.lang.String str15 = product5.getDescription();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(doubleList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "", "", (java.lang.Double) 0.0d, (int) (short) -1);
        java.lang.String str6 = product5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=10, name='', description='', price=0.0, quantity=-1}" + "'", str6, "Product{id=10, name='', description='', price=0.0, quantity=-1}");
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) (-1.0d));
        java.lang.String str12 = product5.getDescription();
        java.lang.Long long13 = product5.getId();
        int int14 = product5.getQuantity();
        product5.addPriceToHistory((java.lang.Double) (-1.0d));
        product5.setName("Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        product5.setQuantity((int) (short) 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        java.lang.Long long10 = product5.getId();
        product5.setQuantity((int) (short) 100);
        java.util.List<java.lang.Double> doubleList13 = product5.getPriceHistory();
        product5.setPrice((java.lang.Double) 1.0d);
        java.lang.String str16 = product5.toString();
        int int17 = product5.getQuantity();
        product5.setQuantity(97);
        java.lang.String str20 = product5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertNotNull(doubleList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=100}" + "'", str16, "Product{id=100, name='hi!', description='', price=1.0, quantity=100}");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=97}" + "'", str20, "Product{id=100, name='hi!', description='', price=1.0, quantity=97}");
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.Double double8 = product5.getPrice();
        product5.setQuantity((int) (byte) 0);
        java.lang.Long long11 = product5.getId();
        java.lang.Long long12 = product5.getId();
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getName();
        product5.setDescription("hi!");
        product5.setPrice((java.lang.Double) 1.0d);
        java.lang.String str13 = product5.getName();
        int int14 = product5.getQuantity();
        java.lang.String str15 = product5.toString();
        java.lang.String str16 = product5.getName();
        product5.setQuantity(1);
        java.lang.Class<?> wildcardClass19 = product5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Product{id=0, name='hi!', description='hi!', price=1.0, quantity=0}" + "'", str15, "Product{id=0, name='hi!', description='hi!', price=1.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setQuantity((int) (short) 1);
        java.lang.Double double10 = product5.getPrice();
        java.lang.String str11 = product5.getName();
        product5.setId((java.lang.Long) 0L);
        java.lang.Long long14 = product5.getId();
        java.util.List<java.lang.Double> doubleList15 = product5.getPriceHistory();
        product5.setDescription("Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}");
        java.lang.Double double18 = product5.getPrice();
        java.lang.String str19 = product5.getDescription();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(doubleList15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}" + "'", str19, "Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}");
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) (-1.0d), (int) (byte) 100);
        product5.setPrice((java.lang.Double) 100.0d);
        java.lang.Long long8 = product5.getId();
        product5.setId((java.lang.Long) (-1L));
        java.lang.Double double11 = product5.getPrice();
        java.lang.String str12 = product5.getDescription();
        java.util.List<java.lang.Double> doubleList13 = product5.getPriceHistory();
        java.lang.String str14 = product5.getName();
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(doubleList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "", "", (java.lang.Double) (-1.0d), (int) (byte) 100);
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        java.lang.Double double8 = product5.getPrice();
        java.lang.String str9 = product5.toString();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=1, name='', description='', price=-1.0, quantity=100}" + "'", str9, "Product{id=1, name='', description='', price=-1.0, quantity=100}");
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}", "Product{id=100, name='hi!', description='', price=1.0, quantity=10}", (java.lang.Double) (-1.0d), (int) (short) 100);
        java.lang.String str6 = product5.getName();
        java.util.List<java.lang.Double> doubleList7 = product5.getPriceHistory();
        product5.setName("hi!");
        java.lang.String str10 = product5.toString();
        java.lang.Double double11 = product5.getPrice();
        product5.setDescription("Product{id=0, name='', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}" + "'", str6, "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=100}" + "'", str10, "Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=100}");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.Long long7 = product5.getId();
        int int8 = product5.getQuantity();
        java.lang.String str9 = product5.getDescription();
        int int10 = product5.getQuantity();
        java.lang.Long long11 = product5.getId();
        product5.addPriceToHistory((java.lang.Double) 1.0d);
        java.lang.String str14 = product5.toString();
        java.lang.Double double15 = product5.getPrice();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str14, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        java.lang.String str9 = product5.getDescription();
        product5.setId((java.lang.Long) 10L);
        java.lang.String str12 = product5.toString();
        int int13 = product5.getQuantity();
        java.lang.String str14 = product5.getDescription();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Product{id=10, name='hi!', description='', price=1.0, quantity=0}" + "'", str12, "Product{id=10, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        int int8 = product5.getQuantity();
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        product5.setId((java.lang.Long) 10L);
        product5.setQuantity(0);
        java.lang.String str15 = product5.getName();
        product5.setId((java.lang.Long) (-1L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}", "Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}", (java.lang.Double) 0.0d, 35);
        product5.setPrice((java.lang.Double) (-1.0d));
        product5.setDescription("Product{id=0, name='hi!', description='hi!', price=1.0, quantity=100}");
        java.lang.String str10 = product5.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}" + "'", str10, "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}");
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setQuantity((int) '#');
        product5.setName("hi!");
        java.lang.Double double15 = product5.getPrice();
        product5.setQuantity(52);
        product5.setName("Product{id=1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=0}', description='hi!', price=1.0, quantity=35}");
        java.lang.Long long20 = product5.getId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 100L + "'", long20 == 100L);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.Long long7 = product5.getId();
        int int8 = product5.getQuantity();
        product5.setQuantity(35);
        java.lang.String str11 = product5.getDescription();
        java.lang.Long long12 = product5.getId();
        product5.setDescription("Product{id=100, name='hi!', description='', price=-1.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.Long long7 = product5.getId();
        int int8 = product5.getQuantity();
        product5.setQuantity((int) (short) -1);
        java.lang.Class<?> wildcardClass11 = product5.getClass();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.util.List<java.lang.Double> doubleList10 = product5.getPriceHistory();
        java.lang.String str11 = product5.getDescription();
        product5.addPriceToHistory((java.lang.Double) 10.0d);
        product5.setQuantity((int) (byte) 1);
        product5.setDescription("Product{id=1, name='Product{id=1, name='', description='', price=-1.0, quantity=100}', description='hi!', price=100.0, quantity=35}");
        org.junit.Assert.assertNotNull(doubleList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        product5.setQuantity((int) (short) 1);
        int int10 = product5.getQuantity();
        java.lang.String str11 = product5.getDescription();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.Double double8 = product5.getPrice();
        product5.setDescription("Product{id=100, name='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', description='', price=-1.0, quantity=0}");
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.util.List<java.lang.Double> doubleList10 = product5.getPriceHistory();
        java.util.List<java.lang.Double> doubleList11 = product5.getPriceHistory();
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setDescription("");
        product5.setPrice((java.lang.Double) 10.0d);
        java.lang.Class<?> wildcardClass18 = product5.getClass();
        org.junit.Assert.assertNotNull(doubleList10);
        org.junit.Assert.assertNotNull(doubleList11);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "", "", (java.lang.Double) 0.0d, (int) (byte) 100);
        product5.setQuantity((int) (short) -1);
        product5.setPrice((java.lang.Double) (-1.0d));
        product5.addPriceToHistory((java.lang.Double) 10.0d);
        java.lang.String str12 = product5.toString();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Product{id=10, name='', description='', price=-1.0, quantity=-1}" + "'", str12, "Product{id=10, name='', description='', price=-1.0, quantity=-1}");
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "", "", (java.lang.Double) (-1.0d), (int) (byte) 100);
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        java.lang.Double double8 = product5.getPrice();
        java.lang.String str9 = product5.getName();
        java.util.List<java.lang.Double> doubleList10 = product5.getPriceHistory();
        product5.setName("Product{id=100, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}");
        product5.addPriceToHistory((java.lang.Double) 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(doubleList10);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", "", (java.lang.Double) 100.0d, (int) (byte) 0);
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setDescription("Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
        product5.setId((java.lang.Long) 0L);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        java.lang.String str9 = product5.getName();
        java.lang.String str10 = product5.getDescription();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setId((java.lang.Long) (-1L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        int int8 = product5.getQuantity();
        java.util.List<java.lang.Double> doubleList9 = product5.getPriceHistory();
        product5.setPrice((java.lang.Double) 0.0d);
        product5.setId((java.lang.Long) 100L);
        product5.setId((java.lang.Long) 100L);
        java.lang.Double double16 = product5.getPrice();
        java.util.List<java.lang.Double> doubleList17 = product5.getPriceHistory();
        java.util.List<java.lang.Double> doubleList18 = product5.getPriceHistory();
        product5.setDescription("Product{id=100, name='hi!', description='', price=1.0, quantity=35}");
        java.lang.String str21 = product5.getName();
        int int22 = product5.getQuantity();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleList9);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(doubleList17);
        org.junit.Assert.assertNotNull(doubleList18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.util.List<java.lang.Double> doubleList8 = product5.getPriceHistory();
        java.lang.String str9 = product5.getName();
        java.lang.Double double10 = product5.getPrice();
        product5.setQuantity((int) (short) 0);
        product5.addPriceToHistory((java.lang.Double) 1.0d);
        product5.setId((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(doubleList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        int int11 = product5.getQuantity();
        java.util.List<java.lang.Double> doubleList12 = product5.getPriceHistory();
        java.lang.String str13 = product5.toString();
        product5.setId((java.lang.Long) 1L);
        int int16 = product5.getQuantity();
        java.lang.Long long17 = product5.getId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(doubleList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}" + "'", str13, "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        java.lang.Long long10 = product5.getId();
        product5.setQuantity((int) (short) 100);
        java.util.List<java.lang.Double> doubleList13 = product5.getPriceHistory();
        java.lang.String str14 = product5.getName();
        java.lang.Class<?> wildcardClass15 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertNotNull(doubleList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        product5.setName("");
        product5.setName("Product{id=0, name='hi!', description='', price=-1.0, quantity=0}");
        java.lang.Long long12 = product5.getId();
        java.lang.String str13 = product5.getDescription();
        product5.setDescription("Product{id=10, name='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=-1.0, quantity=35}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setQuantity((int) '#');
        product5.setId((java.lang.Long) 100L);
        java.lang.Double double15 = product5.getPrice();
        java.lang.String str16 = product5.getDescription();
        java.lang.String str17 = product5.getName();
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        int int20 = product5.getQuantity();
        product5.setName("");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=100}", "Product{id=100, name='', description='', price=10.0, quantity=0}", (java.lang.Double) 1.0d, 0);
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        int int8 = product5.getQuantity();
        java.lang.Long long9 = product5.getId();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        int int11 = product5.getQuantity();
        java.util.List<java.lang.Double> doubleList12 = product5.getPriceHistory();
        java.lang.String str13 = product5.toString();
        product5.setQuantity((int) (short) 1);
        java.util.List<java.lang.Double> doubleList16 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(doubleList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}" + "'", str13, "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList16);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "hi!", "Product{id=10, name='hi!', description='', price=1.0, quantity=10}", (java.lang.Double) (-1.0d), (int) (short) 100);
        java.lang.String str6 = product5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=10, name='hi!', description='Product{id=10, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=100}" + "'", str6, "Product{id=10, name='hi!', description='Product{id=10, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=100}");
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setName("");
        java.lang.String str14 = product5.toString();
        java.lang.Double double15 = product5.getPrice();
        java.lang.Double double16 = product5.getPrice();
        product5.setPrice((java.lang.Double) (-1.0d));
        java.util.List<java.lang.Double> doubleList19 = product5.getPriceHistory();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str14, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertNotNull(doubleList19);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "Product{id=100, name='hi!', description='', price=-1.0, quantity=52}", "Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}", (java.lang.Double) 1.0d, (int) 'a');
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getName();
        product5.setQuantity((int) (byte) -1);
        product5.addPriceToHistory((java.lang.Double) 1.0d);
        java.lang.Double double13 = product5.getPrice();
        java.lang.String str14 = product5.getDescription();
        product5.setPrice((java.lang.Double) 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setName("");
        java.lang.String str14 = product5.toString();
        java.lang.Double double15 = product5.getPrice();
        java.lang.String str16 = product5.toString();
        product5.setQuantity((int) (short) -1);
        java.lang.Long long19 = product5.getId();
        java.lang.String str20 = product5.getDescription();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str14, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str16, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setQuantity((int) '#');
        product5.setName("hi!");
        java.lang.String str15 = product5.getDescription();
        product5.setDescription("Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}");
        product5.setId((java.lang.Long) 100L);
        java.lang.String str20 = product5.getName();
        product5.setName("Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=100}", "Product{id=100, name='', description='', price=10.0, quantity=0}", (java.lang.Double) 1.0d, 0);
        product5.setQuantity((int) '#');
        java.lang.Double double8 = product5.getPrice();
        java.lang.Class<?> wildcardClass9 = product5.getClass();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "Product{id=0, name='hi!', description='Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}', price=0.0, quantity=0}", "Product{id=100, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}", (java.lang.Double) (-1.0d), (int) '#');
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.String str8 = product5.getDescription();
        java.util.List<java.lang.Double> doubleList9 = product5.getPriceHistory();
        product5.setPrice((java.lang.Double) 0.0d);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        java.lang.String str16 = product5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(doubleList9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Product{id=100, name='hi!', description='', price=100.0, quantity=0}" + "'", str16, "Product{id=100, name='hi!', description='', price=100.0, quantity=0}");
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        int int11 = product5.getQuantity();
        java.util.List<java.lang.Double> doubleList12 = product5.getPriceHistory();
        java.lang.String str13 = product5.getDescription();
        product5.setDescription("Product{id=100, name='hi!', description='', price=10.0, quantity=0}");
        java.util.List<java.lang.Double> doubleList16 = product5.getPriceHistory();
        java.lang.String str17 = product5.getDescription();
        java.lang.String str18 = product5.getDescription();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(doubleList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str13, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Product{id=100, name='hi!', description='', price=10.0, quantity=0}" + "'", str17, "Product{id=100, name='hi!', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Product{id=100, name='hi!', description='', price=10.0, quantity=0}" + "'", str18, "Product{id=100, name='hi!', description='', price=10.0, quantity=0}");
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setName("hi!");
        java.lang.String str8 = product5.getDescription();
        java.lang.Double double9 = product5.getPrice();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setQuantity((int) '#');
        product5.setName("hi!");
        java.lang.Double double15 = product5.getPrice();
        product5.setQuantity(52);
        product5.setQuantity(0);
        java.lang.Double double20 = product5.getPrice();
        java.lang.String str21 = product5.toString();
        int int22 = product5.getQuantity();
        product5.setDescription("Product{id=100, name='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', description='', price=-1.0, quantity=0}");
        product5.setId((java.lang.Long) (-1L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Product{id=100, name='hi!', description='', price=10.0, quantity=0}" + "'", str21, "Product{id=100, name='hi!', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setQuantity((int) '#');
        product5.setId((java.lang.Long) 100L);
        int int15 = product5.getQuantity();
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setId((java.lang.Long) 10L);
        java.lang.Long long14 = product5.getId();
        java.lang.String str15 = product5.toString();
        product5.setDescription("Product{id=100, name='Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=100}', description='', price=1.0, quantity=-1}");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Product{id=10, name='hi!', description='', price=10.0, quantity=0}" + "'", str15, "Product{id=10, name='hi!', description='', price=10.0, quantity=0}");
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        java.lang.String str9 = product5.getDescription();
        product5.setId((java.lang.Long) 10L);
        java.lang.String str12 = product5.getDescription();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        product5.setName("hi!");
        int int10 = product5.getQuantity();
        product5.setName("Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}");
        product5.setDescription("Product{id=0, name='hi!', description='', price=-1.0, quantity=0}");
        product5.setPrice((java.lang.Double) (-1.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        int int8 = product5.getQuantity();
        product5.setDescription("hi!");
        java.util.List<java.lang.Double> doubleList11 = product5.getPriceHistory();
        java.lang.String str12 = product5.getName();
        product5.setDescription("");
        java.lang.Class<?> wildcardClass15 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", "hi!", (java.lang.Double) 100.0d, (int) '#');
        int int6 = product5.getQuantity();
        product5.setName("Product{id=100, name='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', description='', price=-1.0, quantity=0}");
        java.util.List<java.lang.Double> doubleList9 = product5.getPriceHistory();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(doubleList9);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}", "Product{id=1, name='hi!', description='', price=1.0, quantity=0}", (java.lang.Double) 0.0d, 100);
        product5.setId((java.lang.Long) 100L);
        product5.setName("Product{id=100, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='', price=1.0, quantity=0}");
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) (-1.0d), (int) (byte) 100);
        java.lang.String str6 = product5.getName();
        int int7 = product5.getQuantity();
        product5.setPrice((java.lang.Double) (-1.0d));
        product5.setQuantity(35);
        product5.setId((java.lang.Long) 100L);
        java.lang.String str14 = product5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "hi!", "", (java.lang.Double) 0.0d, (int) (byte) 100);
        product5.setPrice((java.lang.Double) 100.0d);
        int int8 = product5.getQuantity();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=100, name='hi!', description='', price=1.0, quantity=10}", "Product{id=0, name='hi!', description='', price=1.0, quantity=0}", (java.lang.Double) 0.0d, (int) (short) -1);
        java.lang.String str6 = product5.getName();
        java.lang.String str7 = product5.getName();
        product5.addPriceToHistory((java.lang.Double) 10.0d);
        java.lang.Long long10 = product5.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=10}" + "'", str6, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=10}" + "'", str7, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}", "Product{id=0, name='Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}', description='Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}', price=1.0, quantity=0}", (java.lang.Double) 1.0d, 32);
        java.lang.String str6 = product5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=0, name='Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}', description='Product{id=0, name='Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}', description='Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}', price=1.0, quantity=0}', price=1.0, quantity=32}" + "'", str6, "Product{id=0, name='Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}', description='Product{id=0, name='Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}', description='Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}', price=1.0, quantity=0}', price=1.0, quantity=32}");
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", "", (java.lang.Double) 0.0d, 1);
        java.lang.String str6 = product5.getName();
        int int7 = product5.getQuantity();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str6, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=1, name='Product{id=100, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='', price=10.0, quantity=0}', description='Product{id=100, name='hi!', description='', price=100.0, quantity=0}', price=10.0, quantity=52}", "Product{id=10, name='hi!', description='Product{id=10, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=100}", (java.lang.Double) 0.0d, 0);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=-1, name='hi!', description='', price=0.0, quantity=100}", "Product{id=10, name='', description='', price=0.0, quantity=-1}", (java.lang.Double) 10.0d, (int) (short) 100);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "Product{id=100, name='hi!', description='', price=1.0, quantity=97}", "Product{id=1, name='Product{id=100, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='', price=10.0, quantity=0}', description='Product{id=100, name='hi!', description='', price=100.0, quantity=0}', price=10.0, quantity=52}", (java.lang.Double) (-1.0d), 32);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.Long long7 = product5.getId();
        java.lang.Long long8 = product5.getId();
        java.lang.Long long9 = product5.getId();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.Long long7 = product5.getId();
        java.lang.Long long8 = product5.getId();
        product5.setName("Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}");
        java.lang.String str11 = product5.getDescription();
        product5.setName("Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=100}");
        product5.setId((java.lang.Long) 100L);
        product5.addPriceToHistory((java.lang.Double) 1.0d);
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setId((java.lang.Long) 10L);
        product5.setName("");
        product5.setQuantity((int) (short) -1);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", "hi!", (java.lang.Double) 100.0d, (int) '#');
        int int6 = product5.getQuantity();
        product5.setName("Product{id=100, name='', description='', price=10.0, quantity=0}");
        java.lang.String str9 = product5.getName();
        product5.setName("Product{id=-1, name='hi!', description='', price=0.0, quantity=100}");
        java.lang.Long long12 = product5.getId();
        java.lang.String str13 = product5.getName();
        product5.setId((java.lang.Long) 10L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str9, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=-1, name='hi!', description='', price=0.0, quantity=100}" + "'", str13, "Product{id=-1, name='hi!', description='', price=0.0, quantity=100}");
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        int int8 = product5.getQuantity();
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        product5.setId((java.lang.Long) 10L);
        int int13 = product5.getQuantity();
        java.lang.Double double14 = product5.getPrice();
        java.lang.String str15 = product5.getName();
        product5.setName("Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=52}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setQuantity((int) '#');
        product5.setName("hi!");
        java.lang.String str15 = product5.toString();
        java.lang.String str16 = product5.getDescription();
        java.lang.Double double17 = product5.getPrice();
        java.lang.Long long18 = product5.getId();
        product5.setDescription("Product{id=100, name='Product{id=100, name='hi!', description='', price=1.0, quantity=0}', description='Product{id=0, name='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=0}', price=10.0, quantity=-1}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Product{id=100, name='hi!', description='', price=10.0, quantity=35}" + "'", str15, "Product{id=100, name='hi!', description='', price=10.0, quantity=35}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", "hi!", (java.lang.Double) 100.0d, (int) '#');
        int int6 = product5.getQuantity();
        product5.setName("Product{id=100, name='', description='', price=10.0, quantity=0}");
        java.lang.String str9 = product5.getName();
        product5.setName("Product{id=-1, name='hi!', description='', price=0.0, quantity=100}");
        java.lang.Long long12 = product5.getId();
        product5.setName("Product{id=100, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str9, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 0.0d);
        product5.setName("Product{id=0, name='hi!', description='Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}', price=0.0, quantity=0}");
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        product5.addPriceToHistory((java.lang.Double) 1.0d);
        product5.setName("Product{id=-1, name='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', description='Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}', price=10.0, quantity=32}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        java.lang.String str11 = product5.getDescription();
        java.lang.Double double12 = product5.getPrice();
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.String str15 = product5.getName();
        java.lang.String str16 = product5.getDescription();
        java.lang.Double double17 = product5.getPrice();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.Double double8 = product5.getPrice();
        product5.setQuantity((int) (byte) 0);
        java.lang.String str11 = product5.getDescription();
        product5.setName("Product{id=0, name='hi!', description='hi!', price=1.0, quantity=100}");
        java.lang.Double double14 = product5.getPrice();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        java.lang.Long long10 = product5.getId();
        product5.setQuantity((int) (short) 100);
        java.util.List<java.lang.Double> doubleList13 = product5.getPriceHistory();
        product5.addPriceToHistory((java.lang.Double) (-1.0d));
        java.lang.Long long16 = product5.getId();
        product5.setId((java.lang.Long) 1L);
        product5.setName("Product{id=0, name='Product{id=10, name='hi!', description='', price=10.0, quantity=0}', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=0.0, quantity=-1}");
        java.lang.String str21 = product5.getDescription();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertNotNull(doubleList13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.Double double8 = product5.getPrice();
        java.lang.String str9 = product5.toString();
        java.lang.Double double10 = product5.getPrice();
        java.lang.String str11 = product5.getName();
        int int12 = product5.getQuantity();
        product5.setId((java.lang.Long) 1L);
        product5.setName("Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str9, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setQuantity((int) '#');
        product5.setId((java.lang.Long) 100L);
        java.lang.Double double15 = product5.getPrice();
        java.util.List<java.lang.Double> doubleList16 = product5.getPriceHistory();
        product5.setPrice((java.lang.Double) (-1.0d));
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        java.lang.String str21 = product5.getName();
        product5.setDescription("Product{id=0, name='hi!', description='', price=1.0, quantity=10}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(doubleList16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}", "Product{id=100, name='hi!', description='', price=1.0, quantity=10}", (java.lang.Double) (-1.0d), (int) (short) 100);
        java.lang.String str6 = product5.getName();
        java.util.List<java.lang.Double> doubleList7 = product5.getPriceHistory();
        product5.setName("hi!");
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}" + "'", str6, "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList7);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setName("");
        java.lang.String str14 = product5.toString();
        java.lang.Double double15 = product5.getPrice();
        java.lang.String str16 = product5.toString();
        product5.setQuantity((int) (short) -1);
        java.lang.Long long19 = product5.getId();
        product5.setPrice((java.lang.Double) 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str14, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str16, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 0L);
        java.util.List<java.lang.Double> doubleList9 = product5.getPriceHistory();
        java.lang.Long long10 = product5.getId();
        java.lang.Double double11 = product5.getPrice();
        int int12 = product5.getQuantity();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertNotNull(doubleList9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getName();
        product5.setDescription("hi!");
        product5.setId((java.lang.Long) 10L);
        java.util.List<java.lang.Double> doubleList13 = product5.getPriceHistory();
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        java.lang.String str16 = product5.getDescription();
        product5.setDescription("Product{id=0, name='Product{id=0, name='hi!', description='', price=0.0, quantity=0}', description='Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}', price=0.0, quantity=35}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(doubleList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        int int8 = product5.getQuantity();
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        product5.setId((java.lang.Long) 10L);
        int int13 = product5.getQuantity();
        int int14 = product5.getQuantity();
        java.util.List<java.lang.Double> doubleList15 = product5.getPriceHistory();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(doubleList15);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}", "Product{id=100, name='hi!', description='', price=1.0, quantity=10}", (java.lang.Double) (-1.0d), (int) (short) 100);
        java.lang.String str6 = product5.getName();
        java.util.List<java.lang.Double> doubleList7 = product5.getPriceHistory();
        java.lang.Double double8 = product5.getPrice();
        java.lang.String str9 = product5.getDescription();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}" + "'", str6, "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=10}" + "'", str9, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.lang.String str10 = product5.getName();
        java.lang.String str11 = product5.getName();
        java.lang.Double double12 = product5.getPrice();
        java.util.List<java.lang.Double> doubleList13 = product5.getPriceHistory();
        java.lang.Long long14 = product5.getId();
        java.lang.String str15 = product5.getDescription();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertNotNull(doubleList13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.util.List<java.lang.Double> doubleList10 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 10L);
        product5.setName("Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        java.lang.String str15 = product5.getName();
        int int16 = product5.getQuantity();
        org.junit.Assert.assertNotNull(doubleList10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str15, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setQuantity((int) '#');
        product5.setName("hi!");
        java.lang.String str15 = product5.toString();
        java.lang.String str16 = product5.getDescription();
        java.lang.Class<?> wildcardClass17 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Product{id=100, name='hi!', description='', price=10.0, quantity=35}" + "'", str15, "Product{id=100, name='hi!', description='', price=10.0, quantity=35}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 0L);
        java.lang.String str9 = product5.getDescription();
        java.lang.Double double10 = product5.getPrice();
        java.lang.String str11 = product5.toString();
        product5.setPrice((java.lang.Double) 10.0d);
        java.lang.Double double14 = product5.getPrice();
        product5.setDescription("Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=-1.0, quantity=100}");
        product5.setQuantity((int) (byte) 1);
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str11, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getName();
        product5.setDescription("hi!");
        product5.setPrice((java.lang.Double) 1.0d);
        java.lang.String str13 = product5.getName();
        int int14 = product5.getQuantity();
        java.lang.String str15 = product5.toString();
        int int16 = product5.getQuantity();
        product5.setId((java.lang.Long) 10L);
        java.lang.String str19 = product5.getName();
        java.lang.Long long20 = product5.getId();
        product5.setQuantity(10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Product{id=0, name='hi!', description='hi!', price=1.0, quantity=0}" + "'", str15, "Product{id=0, name='hi!', description='hi!', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}", "Product{id=100, name='hi!', description='', price=1.0, quantity=10}", (java.lang.Double) 1.0d, (int) 'a');
        java.lang.Double double6 = product5.getPrice();
        product5.addPriceToHistory((java.lang.Double) (-1.0d));
        java.util.List<java.lang.Double> doubleList9 = product5.getPriceHistory();
        product5.setName("Product{id=1, name='Product{id=-1, name='hi!', description='', price=0.0, quantity=100}', description='hi!', price=100.0, quantity=35}");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertNotNull(doubleList9);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=100, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='', price=1.0, quantity=0}", "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}", (java.lang.Double) 100.0d, (int) (short) 0);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getName();
        product5.setQuantity((int) (byte) -1);
        product5.setDescription("Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        java.lang.String str13 = product5.getDescription();
        java.lang.Long long14 = product5.getId();
        int int15 = product5.getQuantity();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str13, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.Long long7 = product5.getId();
        int int8 = product5.getQuantity();
        product5.setName("Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}");
        java.lang.String str11 = product5.getDescription();
        product5.setId((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 0L);
        product5.addPriceToHistory((java.lang.Double) (-1.0d));
        java.lang.Double double11 = product5.getPrice();
        int int12 = product5.getQuantity();
        product5.setDescription("Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=10.0, quantity=0}', price=1.0, quantity=35}");
        int int15 = product5.getQuantity();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setDescription("Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}");
        java.lang.Long long14 = product5.getId();
        java.lang.String str15 = product5.getDescription();
        java.util.List<java.lang.Double> doubleList16 = product5.getPriceHistory();
        java.lang.Class<?> wildcardClass17 = doubleList16.getClass();
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}" + "'", str15, "Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        java.lang.String str10 = product5.getDescription();
        product5.setId((java.lang.Long) 10L);
        java.util.List<java.lang.Double> doubleList13 = product5.getPriceHistory();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(doubleList13);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setQuantity((int) '#');
        product5.setName("hi!");
        java.lang.Double double15 = product5.getPrice();
        product5.setQuantity(52);
        java.lang.String str18 = product5.getName();
        product5.addPriceToHistory((java.lang.Double) 10.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setQuantity((int) '#');
        product5.setId((java.lang.Long) 100L);
        java.lang.Double double15 = product5.getPrice();
        java.lang.String str16 = product5.getDescription();
        java.lang.String str17 = product5.getName();
        java.lang.String str18 = product5.getDescription();
        product5.setDescription("Product{id=100, name='hi!', description='', price=-1.0, quantity=35}");
        java.lang.String str21 = product5.getName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", "hi!", (java.lang.Double) 100.0d, (int) '#');
        int int6 = product5.getQuantity();
        product5.setName("Product{id=100, name='', description='', price=10.0, quantity=0}");
        java.lang.String str9 = product5.getName();
        product5.setName("Product{id=1, name='', description='', price=-1.0, quantity=100}");
        java.lang.Double double12 = product5.getPrice();
        product5.addPriceToHistory((java.lang.Double) 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str9, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.Double double8 = product5.getPrice();
        product5.setId((java.lang.Long) (-1L));
        product5.setPrice((java.lang.Double) (-1.0d));
        product5.setId((java.lang.Long) 1L);
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        java.lang.String str10 = product5.getDescription();
        int int11 = product5.getQuantity();
        java.util.List<java.lang.Double> doubleList12 = product5.getPriceHistory();
        product5.addPriceToHistory((java.lang.Double) 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(doubleList12);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        int int8 = product5.getQuantity();
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        product5.setId((java.lang.Long) 10L);
        product5.setQuantity(0);
        java.util.List<java.lang.Double> doubleList15 = product5.getPriceHistory();
        java.lang.String str16 = product5.getDescription();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}", "Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}", (java.lang.Double) 0.0d, 100);
        product5.addPriceToHistory((java.lang.Double) (-1.0d));
        product5.setQuantity(97);
        product5.setName("Product{id=100, name='Product{id=100, name='hi!', description='', price=1.0, quantity=0}', description='Product{id=0, name='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=0}', price=10.0, quantity=-1}");
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "Product{id=-1, name='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=-1.0, quantity=35}", "Product{id=100, name='hi!', description='', price=1.0, quantity=100}", (java.lang.Double) 0.0d, (int) (short) 100);
        java.lang.Long long6 = product5.getId();
        product5.setPrice((java.lang.Double) (-1.0d));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 0L);
        java.lang.String str9 = product5.getDescription();
        int int10 = product5.getQuantity();
        java.lang.Double double11 = product5.getPrice();
        java.lang.String str12 = product5.getDescription();
        java.lang.String str13 = product5.getDescription();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        product5.setQuantity((int) (short) 1);
        product5.setDescription("Product{id=100, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}");
        product5.setName("Product{id=10, name='', description='', price=-1.0, quantity=-1}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) (-1.0d), (int) (byte) 100);
        product5.setPrice((java.lang.Double) 1.0d);
        product5.setPrice((java.lang.Double) 1.0d);
        product5.setDescription("Product{id=10, name='hi!', description='', price=1.0, quantity=0}");
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setId((java.lang.Long) 10L);
        java.lang.Long long14 = product5.getId();
        java.lang.String str15 = product5.getDescription();
        java.lang.Double double16 = product5.getPrice();
        java.util.List<java.lang.Double> doubleList17 = product5.getPriceHistory();
        product5.setQuantity((int) (short) 0);
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertNotNull(doubleList17);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        product5.setQuantity((int) (short) 10);
        java.lang.Double double9 = product5.getPrice();
        java.util.List<java.lang.Double> doubleList10 = product5.getPriceHistory();
        product5.setName("Product{id=10, name='Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}', description='', price=1.0, quantity=10}");
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(doubleList10);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=100, name='hi!', description='', price=1.0, quantity=10}", "Product{id=0, name='hi!', description='', price=1.0, quantity=0}", (java.lang.Double) 0.0d, (int) (short) -1);
        java.lang.String str6 = product5.getName();
        java.lang.Double double7 = product5.getPrice();
        java.lang.Class<?> wildcardClass8 = product5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=10}" + "'", str6, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) (-1.0d), (int) (byte) 100);
        product5.setPrice((java.lang.Double) 100.0d);
        java.lang.Long long8 = product5.getId();
        product5.setId((java.lang.Long) (-1L));
        product5.setName("Product{id=100, name='hi!', description='', price=1.0, quantity=35}");
        product5.setName("Product{id=0, name='', description='', price=1.0, quantity=-1}");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) (-1.0d), (int) (byte) 100);
        product5.setPrice((java.lang.Double) 100.0d);
        java.lang.Long long8 = product5.getId();
        product5.setId((java.lang.Long) (-1L));
        java.lang.Double double11 = product5.getPrice();
        java.lang.String str12 = product5.getDescription();
        java.util.List<java.lang.Double> doubleList13 = product5.getPriceHistory();
        java.lang.String str14 = product5.getName();
        java.lang.Class<?> wildcardClass15 = product5.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(doubleList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setQuantity((int) (short) 1);
        java.lang.Double double10 = product5.getPrice();
        java.lang.String str11 = product5.getName();
        product5.setId((java.lang.Long) 0L);
        product5.setDescription("");
        java.lang.Long long16 = product5.getId();
        product5.setId((java.lang.Long) 0L);
        product5.setName("Product{id=100, name='', description='', price=10.0, quantity=0}");
        java.lang.String str21 = product5.getDescription();
        java.lang.Double double22 = product5.getPrice();
        java.lang.String str23 = product5.toString();
        product5.setId((java.lang.Long) 1L);
        product5.setQuantity((-1));
        product5.setId((java.lang.Long) 0L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=1.0, quantity=1}" + "'", str23, "Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=1.0, quantity=1}");
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setName("");
        java.lang.String str14 = product5.toString();
        java.lang.Double double15 = product5.getPrice();
        java.lang.String str16 = product5.toString();
        product5.setName("Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
        product5.setPrice((java.lang.Double) (-1.0d));
        product5.setDescription("Product{id=0, name='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=0}");
        java.lang.Double double23 = product5.getPrice();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str14, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str16, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}", "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}", (java.lang.Double) 10.0d, 100);
        java.lang.String str6 = product5.getName();
        java.lang.Long long7 = product5.getId();
        product5.setQuantity((int) (short) 10);
        product5.setId((java.lang.Long) 100L);
        java.lang.String str12 = product5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}" + "'", str6, "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}" + "'", str12, "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}");
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        product5.setName("");
        product5.setName("Product{id=0, name='hi!', description='', price=-1.0, quantity=0}");
        java.lang.Long long12 = product5.getId();
        java.lang.String str13 = product5.getName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}" + "'", str13, "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}");
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.Double double8 = product5.getPrice();
        product5.setQuantity((int) (byte) 0);
        java.lang.String str11 = product5.getDescription();
        java.lang.Double double12 = product5.getPrice();
        java.lang.Long long13 = product5.getId();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.util.List<java.lang.Double> doubleList7 = product5.getPriceHistory();
        product5.setQuantity((int) (short) 100);
        java.lang.Double double10 = product5.getPrice();
        java.lang.String str11 = product5.getName();
        java.lang.String str12 = product5.getDescription();
        java.lang.String str13 = product5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(doubleList7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=100}" + "'", str13, "Product{id=100, name='hi!', description='', price=1.0, quantity=100}");
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.String str8 = product5.getDescription();
        java.util.List<java.lang.Double> doubleList9 = product5.getPriceHistory();
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.String str12 = product5.getName();
        product5.setQuantity((int) (short) 10);
        product5.setQuantity(97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(doubleList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setDescription("Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}");
        java.lang.Long long14 = product5.getId();
        java.lang.String str15 = product5.getDescription();
        java.lang.String str16 = product5.getDescription();
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}" + "'", str15, "Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}" + "'", str16, "Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}");
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.String str7 = product5.toString();
        java.util.List<java.lang.Double> doubleList8 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str7, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList8);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", "hi!", (java.lang.Double) 100.0d, (int) '#');
        int int6 = product5.getQuantity();
        product5.setName("Product{id=100, name='', description='', price=10.0, quantity=0}");
        java.lang.String str9 = product5.getName();
        product5.setName("Product{id=-1, name='hi!', description='', price=0.0, quantity=100}");
        product5.setName("Product{id=-1, name='hi!', description='', price=0.0, quantity=100}");
        java.util.List<java.lang.Double> doubleList14 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 100L);
        java.lang.String str17 = product5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str9, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Product{id=100, name='Product{id=-1, name='hi!', description='', price=0.0, quantity=100}', description='hi!', price=100.0, quantity=35}" + "'", str17, "Product{id=100, name='Product{id=-1, name='hi!', description='', price=0.0, quantity=100}', description='hi!', price=100.0, quantity=35}");
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.util.List<java.lang.Double> doubleList7 = product5.getPriceHistory();
        product5.setQuantity((int) (short) 100);
        java.lang.Double double10 = product5.getPrice();
        product5.setId((java.lang.Long) 0L);
        java.lang.String str13 = product5.getDescription();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(doubleList7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=-1.0, quantity=100}", "Product{id=10, name='hi!', description='', price=1.0, quantity=10}", (java.lang.Double) 10.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        org.junit.Assert.assertNotNull(doubleList6);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        java.lang.String str11 = product5.getDescription();
        java.lang.Double double12 = product5.getPrice();
        product5.setDescription("Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        product5.setPrice((java.lang.Double) 10.0d);
        java.lang.Double double17 = product5.getPrice();
        product5.setName("Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}");
        product5.setName("Product{id=0, name='hi!', description='', price=0.0, quantity=0}");
        product5.setQuantity(1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        int int8 = product5.getQuantity();
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        product5.setId((java.lang.Long) 10L);
        int int13 = product5.getQuantity();
        java.lang.Double double14 = product5.getPrice();
        java.lang.String str15 = product5.getName();
        java.lang.Double double16 = product5.getPrice();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setQuantity((int) (short) 1);
        java.lang.Double double10 = product5.getPrice();
        java.lang.String str11 = product5.getName();
        product5.setId((java.lang.Long) 0L);
        product5.setDescription("");
        java.lang.Long long16 = product5.getId();
        product5.setDescription("Product{id=-1, name='hi!', description='', price=0.0, quantity=100}");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        int int7 = product5.getQuantity();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "Product{id=100, name='', description='', price=0.0, quantity=0}", "Product{id=100, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=0}', price=10.0, quantity=-1}", (java.lang.Double) 0.0d, 1);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getName();
        product5.setDescription("hi!");
        product5.setPrice((java.lang.Double) 1.0d);
        java.lang.String str13 = product5.getName();
        int int14 = product5.getQuantity();
        java.lang.String str15 = product5.toString();
        java.lang.String str16 = product5.getName();
        int int17 = product5.getQuantity();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Product{id=0, name='hi!', description='hi!', price=1.0, quantity=0}" + "'", str15, "Product{id=0, name='hi!', description='hi!', price=1.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        java.lang.String str9 = product5.getName();
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        java.lang.Double double12 = product5.getPrice();
        java.lang.Long long13 = product5.getId();
        int int14 = product5.getQuantity();
        java.lang.String str15 = product5.toString();
        java.util.List<java.lang.Double> doubleList16 = product5.getPriceHistory();
        product5.setQuantity((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}" + "'", str15, "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList16);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "hi!", "Product{id=100, name='hi!', description='', price=0.0, quantity=0}", (java.lang.Double) 100.0d, (int) (byte) 100);
        java.lang.Double double6 = product5.getPrice();
        java.lang.Double double7 = product5.getPrice();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}", "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}", (java.lang.Double) 10.0d, 100);
        product5.setId((java.lang.Long) 10L);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.String str8 = product5.getDescription();
        java.util.List<java.lang.Double> doubleList9 = product5.getPriceHistory();
        product5.setPrice((java.lang.Double) 0.0d);
        java.util.List<java.lang.Double> doubleList12 = product5.getPriceHistory();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(doubleList9);
        org.junit.Assert.assertNotNull(doubleList12);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        java.lang.String str11 = product5.getDescription();
        java.lang.Double double12 = product5.getPrice();
        product5.setDescription("Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        product5.setDescription("Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        product5.setQuantity((int) (byte) 1);
        product5.setDescription("Product{id=0, name='Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}', description='Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}', price=0.0, quantity=100}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "Product{id=0, name='Product{id=0, name='hi!', description='', price=0.0, quantity=0}', description='Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}', price=0.0, quantity=35}", "Product{id=100, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='', price=10.0, quantity=0}", (java.lang.Double) 1.0d, (int) '#');
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.util.List<java.lang.Double> doubleList10 = product5.getPriceHistory();
        java.lang.Double double11 = product5.getPrice();
        product5.setId((java.lang.Long) 0L);
        java.util.List<java.lang.Double> doubleList14 = product5.getPriceHistory();
        java.lang.Double double15 = product5.getPrice();
        java.lang.String str16 = product5.toString();
        org.junit.Assert.assertNotNull(doubleList10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(doubleList14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str16, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        java.lang.Long long10 = product5.getId();
        java.lang.Double double11 = product5.getPrice();
        int int12 = product5.getQuantity();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", "hi!", (java.lang.Double) 100.0d, (int) '#');
        int int6 = product5.getQuantity();
        product5.setName("Product{id=100, name='', description='', price=10.0, quantity=0}");
        java.lang.String str9 = product5.getName();
        product5.setName("Product{id=-1, name='hi!', description='', price=0.0, quantity=100}");
        java.lang.Long long12 = product5.getId();
        java.lang.String str13 = product5.getName();
        java.lang.Long long14 = product5.getId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str9, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=-1, name='hi!', description='', price=0.0, quantity=100}" + "'", str13, "Product{id=-1, name='hi!', description='', price=0.0, quantity=100}");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=-1, name='hi!', description='', price=0.0, quantity=100}", "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}", (java.lang.Double) 0.0d, 52);
        int int6 = product5.getQuantity();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=-1, name='hi!', description='', price=-1.0, quantity=0}", "Product{id=100, name='hi!', description='', price=10.0, quantity=35}", (java.lang.Double) 0.0d, (int) 'a');
        java.lang.Double double6 = product5.getPrice();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=10, name='', description='', price=-1.0, quantity=-1}", "Product{id=100, name='Product{id=-1, name='hi!', description='', price=0.0, quantity=100}', description='hi!', price=100.0, quantity=35}", (java.lang.Double) 10.0d, 52);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "", "Product{id=0, name='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=0}", (java.lang.Double) 1.0d, 97);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "", "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}", (java.lang.Double) (-1.0d), 0);
        java.lang.String str6 = product5.toString();
        java.lang.String str7 = product5.getDescription();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=1, name='', description='Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}', price=-1.0, quantity=0}" + "'", str6, "Product{id=1, name='', description='Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}', price=-1.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}" + "'", str7, "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}");
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        java.lang.String str11 = product5.getDescription();
        java.lang.Double double12 = product5.getPrice();
        product5.setDescription("Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        product5.setDescription("Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        product5.setName("");
        int int19 = product5.getQuantity();
        int int20 = product5.getQuantity();
        java.util.List<java.lang.Double> doubleList21 = product5.getPriceHistory();
        java.lang.String str22 = product5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(doubleList21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Product{id=100, name='', description='Product{id=100, name='hi!', description='', price=1.0, quantity=0}', price=10.0, quantity=0}" + "'", str22, "Product{id=100, name='', description='Product{id=100, name='hi!', description='', price=1.0, quantity=0}', price=10.0, quantity=0}");
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "Product{id=100, name='', description='', price=-1.0, quantity=10}", "", (java.lang.Double) 1.0d, (int) 'a');
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=100, name='', description='', price=10.0, quantity=0}", "", (java.lang.Double) 100.0d, (int) ' ');
        java.lang.String str6 = product5.toString();
        product5.setId((java.lang.Long) (-1L));
        java.lang.Class<?> wildcardClass9 = product5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}" + "'", str6, "Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=100, name='hi!', description='', price=10.0, quantity=0}", "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", (java.lang.Double) 1.0d, 35);
        product5.setQuantity((int) 'a');
        java.lang.Long long8 = product5.getId();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setId((java.lang.Long) 10L);
        product5.setName("");
        product5.setQuantity((int) (short) 10);
        product5.setName("Product{id=100, name='', description='', price=10.0, quantity=0}");
        java.lang.String str20 = product5.toString();
        product5.setPrice((java.lang.Double) (-1.0d));
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str27 = product5.getName();
        product5.setId((java.lang.Long) 100L);
        java.lang.Long long30 = product5.getId();
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}" + "'", str20, "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str27, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 100L + "'", long30 == 100L);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        int int8 = product5.getQuantity();
        java.util.List<java.lang.Double> doubleList9 = product5.getPriceHistory();
        product5.setPrice((java.lang.Double) 0.0d);
        product5.setId((java.lang.Long) 100L);
        java.lang.Long long14 = product5.getId();
        product5.setId((java.lang.Long) 100L);
        product5.setId((java.lang.Long) 100L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleList9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) 10.0d);
        java.lang.String str12 = product5.getDescription();
        product5.setPrice((java.lang.Double) 0.0d);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 1.0d);
        java.lang.String str19 = product5.toString();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str19, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        product5.setName("hi!");
        int int10 = product5.getQuantity();
        product5.setName("Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}");
        java.lang.Long long13 = product5.getId();
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "hi!", "Product{id=1, name='', description='', price=-1.0, quantity=100}", (java.lang.Double) 0.0d, (int) (byte) 10);
        java.lang.String str6 = product5.getName();
        product5.setId((java.lang.Long) 100L);
        product5.setDescription("Product{id=10, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=10.0, quantity=35}");
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.Double double8 = product5.getPrice();
        product5.setQuantity((int) (byte) 0);
        product5.setDescription("Product{id=0, name='hi!', description='', price=0.0, quantity=0}");
        java.lang.Long long13 = product5.getId();
        java.util.List<java.lang.Double> doubleList14 = product5.getPriceHistory();
        product5.setPrice((java.lang.Double) 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(doubleList14);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setName("");
        java.lang.String str14 = product5.toString();
        java.lang.Double double15 = product5.getPrice();
        java.lang.Double double16 = product5.getPrice();
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) 0.0d);
        int int21 = product5.getQuantity();
        java.lang.Double double22 = product5.getPrice();
        java.lang.Double double23 = product5.getPrice();
        java.lang.Double double24 = product5.getPrice();
        java.lang.Long long25 = product5.getId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str14, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 100L + "'", long25 == 100L);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setName("");
        java.lang.String str14 = product5.toString();
        java.lang.Double double15 = product5.getPrice();
        java.lang.Double double16 = product5.getPrice();
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) 0.0d);
        int int21 = product5.getQuantity();
        java.lang.Double double22 = product5.getPrice();
        java.lang.Double double23 = product5.getPrice();
        java.lang.String str24 = product5.toString();
        product5.setDescription("Product{id=10, name='hi!', description='', price=1.0, quantity=0}");
        product5.setQuantity(35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str14, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Product{id=100, name='', description='', price=0.0, quantity=0}" + "'", str24, "Product{id=100, name='', description='', price=0.0, quantity=0}");
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setName("");
        java.lang.Long long11 = product5.getId();
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        java.lang.String str14 = product5.getDescription();
        product5.setQuantity((int) '#');
        java.lang.String str17 = product5.getDescription();
        product5.setPrice((java.lang.Double) 0.0d);
        product5.setName("Product{id=1, name='', description='', price=-1.0, quantity=100}");
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str14, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str17, "Product{id=100, name='', description='', price=10.0, quantity=0}");
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setName("");
        java.lang.String str14 = product5.toString();
        java.lang.Double double15 = product5.getPrice();
        java.lang.Double double16 = product5.getPrice();
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) 0.0d);
        int int21 = product5.getQuantity();
        java.lang.Double double22 = product5.getPrice();
        product5.setId((java.lang.Long) (-1L));
        product5.setQuantity(0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str14, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        java.lang.String str10 = product5.getDescription();
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        product5.setName("hi!");
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        java.lang.Double double17 = product5.getPrice();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setQuantity((int) '#');
        product5.setId((java.lang.Long) 100L);
        java.lang.Double double15 = product5.getPrice();
        java.util.List<java.lang.Double> doubleList16 = product5.getPriceHistory();
        product5.setName("Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        int int19 = product5.getQuantity();
        product5.addPriceToHistory((java.lang.Double) 10.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(doubleList16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", "hi!", (java.lang.Double) 100.0d, (int) '#');
        int int6 = product5.getQuantity();
        product5.setName("Product{id=100, name='', description='', price=10.0, quantity=0}");
        java.lang.String str9 = product5.getName();
        product5.setQuantity((int) (short) 10);
        product5.setName("Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=10.0, quantity=0}', price=1.0, quantity=35}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str9, "Product{id=100, name='', description='', price=10.0, quantity=0}");
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setId((java.lang.Long) 10L);
        product5.setName("");
        product5.setId((java.lang.Long) (-1L));
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setName("");
        java.lang.Double double14 = product5.getPrice();
        product5.setName("Product{id=1, name='', description='', price=-1.0, quantity=100}");
        product5.setName("Product{id=100, name='', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        product5.setId((java.lang.Long) 1L);
        java.lang.String str12 = product5.getName();
        java.lang.String str13 = product5.toString();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=1, name='hi!', description='', price=1.0, quantity=0}" + "'", str13, "Product{id=1, name='hi!', description='', price=1.0, quantity=0}");
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.lang.String str10 = product5.getName();
        java.lang.String str11 = product5.toString();
        product5.addPriceToHistory((java.lang.Double) 1.0d);
        product5.setName("Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}");
        java.lang.Long long16 = product5.getId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str11, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        java.lang.Long long10 = product5.getId();
        product5.setQuantity((int) (short) 100);
        java.util.List<java.lang.Double> doubleList13 = product5.getPriceHistory();
        product5.addPriceToHistory((java.lang.Double) (-1.0d));
        java.lang.Long long16 = product5.getId();
        product5.setQuantity((int) (byte) 1);
        java.lang.String str19 = product5.getDescription();
        java.lang.String str20 = product5.getDescription();
        int int21 = product5.getQuantity();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertNotNull(doubleList13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "", "", (java.lang.Double) 0.0d, (int) (short) -1);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        product5.setQuantity((int) (byte) 0);
        product5.setDescription("Product{id=10, name='Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}', description='', price=1.0, quantity=10}");
        org.junit.Assert.assertNotNull(doubleList6);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "", "", (java.lang.Double) (-1.0d), (int) (byte) 100);
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        java.lang.Long long8 = product5.getId();
        product5.setName("Product{id=0, name='', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        int int11 = product5.getQuantity();
        java.util.List<java.lang.Double> doubleList12 = product5.getPriceHistory();
        java.lang.String str13 = product5.toString();
        product5.setId((java.lang.Long) 1L);
        product5.setPrice((java.lang.Double) 100.0d);
        java.lang.Double double18 = product5.getPrice();
        java.lang.String str19 = product5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(doubleList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}" + "'", str13, "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Product{id=1, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=100.0, quantity=0}" + "'", str19, "Product{id=1, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=100.0, quantity=0}");
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=100, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}", "Product{id=0, name='hi!', description='', price=0.0, quantity=0}", (java.lang.Double) 1.0d, 0);
        product5.setName("Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}");
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) (-1.0d));
        java.lang.String str12 = product5.getDescription();
        java.lang.Long long13 = product5.getId();
        java.lang.Double double14 = product5.getPrice();
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setId((java.lang.Long) 0L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        java.lang.Class<?> wildcardClass8 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.util.List<java.lang.Double> doubleList8 = product5.getPriceHistory();
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.String str11 = product5.getDescription();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        product5.setName("Product{id=0, name='hi!', description='', price=1.0, quantity=10}");
        org.junit.Assert.assertNotNull(doubleList8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", "Product{id=0, name='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=0}", (java.lang.Double) 10.0d, (-1));
        java.lang.String str6 = product5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str6, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.lang.String str10 = product5.getName();
        java.lang.String str11 = product5.getName();
        java.lang.Double double12 = product5.getPrice();
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        java.lang.String str15 = product5.getDescription();
        java.lang.Double double16 = product5.getPrice();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=100, name='hi!', description='', price=100.0, quantity=0}", "Product{id=0, name='hi!', description='hi!', price=1.0, quantity=100}", (java.lang.Double) 10.0d, (int) (short) 0);
        product5.setId((java.lang.Long) (-1L));
        product5.setDescription("Product{id=0, name='Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}', description='Product{id=10, name='hi!', description='', price=10.0, quantity=0}', price=0.0, quantity=97}");
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        product5.setQuantity((int) (short) 10);
        java.lang.String str9 = product5.toString();
        java.lang.Long long10 = product5.getId();
        product5.setId((java.lang.Long) 0L);
        java.lang.String str13 = product5.getDescription();
        product5.setName("Product{id=100, name='hi!', description='', price=100.0, quantity=0}");
        product5.setDescription("Product{id=100, name='', description='', price=-1.0, quantity=10}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=10}" + "'", str9, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setQuantity((int) '#');
        product5.setName("hi!");
        java.lang.String str15 = product5.getDescription();
        product5.setId((java.lang.Long) 10L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "Product{id=10, name='Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}', description='', price=100.0, quantity=0}", "Product{id=1, name='Product{id=100, name='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', description='', price=1.0, quantity=0}', description='Product{id=0, name='hi!', description='', price=0.0, quantity=0}', price=10.0, quantity=-1}", (java.lang.Double) 0.0d, 35);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setName("");
        java.lang.String str14 = product5.toString();
        java.lang.Double double15 = product5.getPrice();
        java.lang.String str16 = product5.toString();
        product5.setName("Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
        java.lang.Long long19 = product5.getId();
        product5.setName("Product{id=0, name='Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}', description='Product{id=10, name='hi!', description='', price=10.0, quantity=0}', price=0.0, quantity=97}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str14, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str16, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setQuantity((int) '#');
        product5.setId((java.lang.Long) 100L);
        java.lang.Double double15 = product5.getPrice();
        product5.setName("hi!");
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 0.0d);
        product5.setName("Product{id=0, name='hi!', description='Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}', price=0.0, quantity=0}");
        java.util.List<java.lang.Double> doubleList14 = product5.getPriceHistory();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(doubleList14);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setQuantity((int) (short) 1);
        java.lang.Double double10 = product5.getPrice();
        java.lang.String str11 = product5.getName();
        product5.setId((java.lang.Long) 0L);
        product5.setDescription("");
        java.lang.Long long16 = product5.getId();
        product5.setId((java.lang.Long) 0L);
        product5.setId((java.lang.Long) 0L);
        java.lang.Long long21 = product5.getId();
        java.lang.Class<?> wildcardClass22 = product5.getClass();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}", "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}", (java.lang.Double) (-1.0d), (int) (short) 0);
        product5.setId((java.lang.Long) 10L);
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        java.lang.String str10 = product5.getDescription();
        java.lang.String str11 = product5.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}" + "'", str10, "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product{id=10, name='Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}', description='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', price=-1.0, quantity=0}" + "'", str11, "Product{id=10, name='Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}', description='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', price=-1.0, quantity=0}");
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setQuantity((int) '#');
        product5.setId((java.lang.Long) 100L);
        java.lang.Double double15 = product5.getPrice();
        java.lang.String str16 = product5.getDescription();
        java.lang.String str17 = product5.getName();
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        java.lang.String str20 = product5.getDescription();
        java.lang.Long long21 = product5.getId();
        int int22 = product5.getQuantity();
        int int23 = product5.getQuantity();
        product5.setId((java.lang.Long) 100L);
        product5.setPrice((java.lang.Double) 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        int int11 = product5.getQuantity();
        java.util.List<java.lang.Double> doubleList12 = product5.getPriceHistory();
        int int13 = product5.getQuantity();
        java.lang.String str14 = product5.getName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(doubleList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.lang.String str10 = product5.getName();
        java.util.List<java.lang.Double> doubleList11 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 0L);
        java.lang.Class<?> wildcardClass14 = product5.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(doubleList11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.Long long7 = product5.getId();
        int int8 = product5.getQuantity();
        product5.setQuantity(35);
        product5.addPriceToHistory((java.lang.Double) 10.0d);
        product5.setDescription("Product{id=1, name='', description='', price=-1.0, quantity=100}");
        product5.setId((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}", "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}", (java.lang.Double) 10.0d, (-1));
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "", "", (java.lang.Double) 0.0d, (int) (byte) 100);
        product5.setName("Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}");
        product5.setPrice((java.lang.Double) (-1.0d));
        product5.setPrice((java.lang.Double) 1.0d);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        java.lang.String str11 = product5.getDescription();
        java.lang.Double double12 = product5.getPrice();
        product5.setDescription("Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setQuantity((int) (byte) -1);
        product5.setQuantity((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", "hi!", (java.lang.Double) 100.0d, (int) '#');
        int int6 = product5.getQuantity();
        product5.setName("Product{id=100, name='', description='', price=10.0, quantity=0}");
        java.lang.String str9 = product5.getName();
        product5.setName("Product{id=-1, name='hi!', description='', price=0.0, quantity=100}");
        java.lang.Double double12 = product5.getPrice();
        java.lang.String str13 = product5.toString();
        product5.setQuantity(0);
        product5.setQuantity((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str9, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=1, name='Product{id=-1, name='hi!', description='', price=0.0, quantity=100}', description='hi!', price=100.0, quantity=35}" + "'", str13, "Product{id=1, name='Product{id=-1, name='hi!', description='', price=0.0, quantity=100}', description='hi!', price=100.0, quantity=35}");
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        product5.setQuantity((int) (short) 1);
        int int10 = product5.getQuantity();
        java.lang.String str11 = product5.getName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "hi!", "", (java.lang.Double) 0.0d, (int) (byte) 100);
        product5.addPriceToHistory((java.lang.Double) 10.0d);
        java.lang.String str8 = product5.toString();
        java.util.List<java.lang.Double> doubleList9 = product5.getPriceHistory();
        java.lang.String str10 = product5.toString();
        product5.setId((java.lang.Long) 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Product{id=-1, name='hi!', description='', price=0.0, quantity=100}" + "'", str8, "Product{id=-1, name='hi!', description='', price=0.0, quantity=100}");
        org.junit.Assert.assertNotNull(doubleList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Product{id=-1, name='hi!', description='', price=0.0, quantity=100}" + "'", str10, "Product{id=-1, name='hi!', description='', price=0.0, quantity=100}");
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.util.List<java.lang.Double> doubleList8 = product5.getPriceHistory();
        java.lang.Long long9 = product5.getId();
        java.util.List<java.lang.Double> doubleList10 = product5.getPriceHistory();
        org.junit.Assert.assertNotNull(doubleList8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(doubleList10);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.lang.String str10 = product5.getName();
        java.lang.Long long11 = product5.getId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}", "Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=1.0, quantity=1}", (java.lang.Double) 1.0d, 100);
        java.lang.Class<?> wildcardClass6 = product5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setQuantity((int) '#');
        product5.setId((java.lang.Long) 100L);
        java.lang.Double double15 = product5.getPrice();
        java.util.List<java.lang.Double> doubleList16 = product5.getPriceHistory();
        product5.setPrice((java.lang.Double) (-1.0d));
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        java.lang.String str21 = product5.getName();
        product5.setName("Product{id=100, name='', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}");
        java.lang.Long long24 = product5.getId();
        java.lang.Double double25 = product5.getPrice();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(doubleList16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 100L + "'", long24 == 100L);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.0d) + "'", double25 == (-1.0d));
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setName("");
        java.lang.String str14 = product5.toString();
        java.lang.Double double15 = product5.getPrice();
        java.lang.Double double16 = product5.getPrice();
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        product5.setId((java.lang.Long) 100L);
        product5.setPrice((java.lang.Double) 10.0d);
        java.lang.String str23 = product5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str14, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str23, "Product{id=100, name='', description='', price=10.0, quantity=0}");
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.String str12 = product5.getDescription();
        product5.setPrice((java.lang.Double) (-1.0d));
        java.lang.String str15 = product5.toString();
        java.util.List<java.lang.Double> doubleList16 = product5.getPriceHistory();
        java.util.List<java.lang.Double> doubleList17 = product5.getPriceHistory();
        int int18 = product5.getQuantity();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Product{id=100, name='hi!', description='', price=-1.0, quantity=0}" + "'", str15, "Product{id=100, name='hi!', description='', price=-1.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList16);
        org.junit.Assert.assertNotNull(doubleList17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        product5.setQuantity((int) (short) 10);
        java.lang.String str9 = product5.toString();
        java.lang.String str10 = product5.getName();
        java.util.List<java.lang.Double> doubleList11 = product5.getPriceHistory();
        product5.setDescription("Product{id=0, name='hi!', description='', price=100.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=10}" + "'", str9, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(doubleList11);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "", "Product{id=0, name='hi!', description='', price=1.0, quantity=0}", (java.lang.Double) (-1.0d), 0);
        java.lang.String str6 = product5.getDescription();
        product5.setDescription("Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}");
        product5.addPriceToHistory((java.lang.Double) 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str6, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=100, name='hi!', description='', price=100.0, quantity=0}", "Product{id=0, name='hi!', description='hi!', price=1.0, quantity=100}", (java.lang.Double) 10.0d, (int) (short) 0);
        java.lang.String str6 = product5.toString();
        java.lang.Double double7 = product5.getPrice();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=-1, name='Product{id=100, name='hi!', description='', price=100.0, quantity=0}', description='Product{id=0, name='hi!', description='hi!', price=1.0, quantity=100}', price=10.0, quantity=0}" + "'", str6, "Product{id=-1, name='Product{id=100, name='hi!', description='', price=100.0, quantity=0}', description='Product{id=0, name='hi!', description='hi!', price=1.0, quantity=100}', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.String str7 = product5.toString();
        product5.setId((java.lang.Long) 100L);
        java.lang.Long long10 = product5.getId();
        java.lang.Double double11 = product5.getPrice();
        java.util.List<java.lang.Double> doubleList12 = product5.getPriceHistory();
        java.lang.Long long13 = product5.getId();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str7, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(doubleList12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getDescription();
        java.lang.String str9 = product5.toString();
        java.lang.String str10 = product5.getName();
        product5.addPriceToHistory((java.lang.Double) 10.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str9, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.String str7 = product5.toString();
        java.lang.Long long8 = product5.getId();
        java.lang.String str9 = product5.getDescription();
        java.lang.String str10 = product5.getDescription();
        java.lang.String str11 = product5.getDescription();
        product5.addPriceToHistory((java.lang.Double) 1.0d);
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        product5.addPriceToHistory((java.lang.Double) 10.0d);
        java.lang.String str18 = product5.getDescription();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str7, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.lang.Double double10 = product5.getPrice();
        java.lang.Long long11 = product5.getId();
        java.lang.Long long12 = product5.getId();
        product5.setQuantity((int) (short) 0);
        java.lang.Double double15 = product5.getPrice();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setQuantity((int) '#');
        product5.setId((java.lang.Long) 100L);
        int int15 = product5.getQuantity();
        java.util.List<java.lang.Double> doubleList16 = product5.getPriceHistory();
        product5.setDescription("Product{id=10, name='Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}', description='', price=100.0, quantity=0}");
        product5.setId((java.lang.Long) (-1L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertNotNull(doubleList16);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setQuantity((int) '#');
        product5.setId((java.lang.Long) 100L);
        java.lang.Double double15 = product5.getPrice();
        java.util.List<java.lang.Double> doubleList16 = product5.getPriceHistory();
        java.lang.String str17 = product5.getName();
        product5.setId((java.lang.Long) 1L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(doubleList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        int int8 = product5.getQuantity();
        product5.setDescription("hi!");
        java.util.List<java.lang.Double> doubleList11 = product5.getPriceHistory();
        java.util.List<java.lang.Double> doubleList12 = product5.getPriceHistory();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleList11);
        org.junit.Assert.assertNotNull(doubleList12);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=100, name='hi!', description='', price=-1.0, quantity=0}", "Product{id=10, name='hi!', description='', price=1.0, quantity=10}", (java.lang.Double) 0.0d, 97);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setQuantity((int) (short) 1);
        java.util.List<java.lang.Double> doubleList10 = product5.getPriceHistory();
        java.lang.String str11 = product5.toString();
        org.junit.Assert.assertNotNull(doubleList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=1}" + "'", str11, "Product{id=0, name='hi!', description='', price=1.0, quantity=1}");
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "", "", (java.lang.Double) 0.0d, (int) (byte) 100);
        product5.setName("Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}");
        product5.setPrice((java.lang.Double) (-1.0d));
        product5.setId((java.lang.Long) 100L);
        product5.setDescription("Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}");
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "", "", (java.lang.Double) (-1.0d), (int) (byte) 100);
        product5.setDescription("Product{id=1, name='hi!', description='', price=1.0, quantity=0}");
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getName();
        product5.setDescription("hi!");
        product5.setId((java.lang.Long) 10L);
        java.util.List<java.lang.Double> doubleList13 = product5.getPriceHistory();
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        java.lang.String str16 = product5.getDescription();
        java.lang.Long long17 = product5.getId();
        product5.setName("Product{id=0, name='Product{id=0, name='hi!', description='', price=0.0, quantity=0}', description='Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}', price=0.0, quantity=35}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(doubleList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setName("");
        java.lang.Long long11 = product5.getId();
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        java.lang.String str14 = product5.getName();
        java.lang.String str15 = product5.getName();
        java.util.List<java.lang.Double> doubleList16 = product5.getPriceHistory();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(doubleList16);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getName();
        product5.setName("");
        product5.setDescription("");
        java.lang.String str13 = product5.getDescription();
        product5.setId((java.lang.Long) 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setName("");
        java.lang.String str14 = product5.toString();
        java.lang.Double double15 = product5.getPrice();
        java.lang.Double double16 = product5.getPrice();
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) 0.0d);
        int int21 = product5.getQuantity();
        java.lang.Double double22 = product5.getPrice();
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        product5.setQuantity((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str14, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) (-1.0d));
        java.lang.String str12 = product5.getDescription();
        java.lang.Long long13 = product5.getId();
        product5.setDescription("Product{id=1, name='hi!', description='', price=1.0, quantity=0}");
        int int16 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setPrice((java.lang.Double) (-1.0d));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "Product{id=100, name='', description='', price=10.0, quantity=0}", "Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}", (java.lang.Double) 1.0d, (int) '#');
        product5.setDescription("Product{id=100, name='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', description='', price=10.0, quantity=0}");
        java.lang.Double double8 = product5.getPrice();
        product5.setId((java.lang.Long) 10L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "Product{id=100, name='hi!', description='', price=10.0, quantity=0}", "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}", (java.lang.Double) 0.0d, (int) (short) 100);
        product5.setQuantity(52);
        java.lang.Double double8 = product5.getPrice();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        product5.setQuantity((int) (short) 10);
        java.lang.String str9 = product5.toString();
        java.lang.Long long10 = product5.getId();
        int int11 = product5.getQuantity();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=10}" + "'", str9, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) (-1.0d));
        java.lang.String str12 = product5.getDescription();
        product5.setId((java.lang.Long) (-1L));
        product5.setId((java.lang.Long) (-1L));
        java.lang.String str17 = product5.toString();
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        java.lang.Double double22 = product5.getPrice();
        int int23 = product5.getQuantity();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Product{id=-1, name='hi!', description='', price=-1.0, quantity=0}" + "'", str17, "Product{id=-1, name='hi!', description='', price=-1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) (-1.0d));
        java.lang.String str12 = product5.getDescription();
        product5.setId((java.lang.Long) (-1L));
        product5.setId((java.lang.Long) (-1L));
        java.lang.String str17 = product5.toString();
        product5.setId((java.lang.Long) 0L);
        java.lang.Long long20 = product5.getId();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Product{id=-1, name='hi!', description='', price=-1.0, quantity=0}" + "'", str17, "Product{id=-1, name='hi!', description='', price=-1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setQuantity((int) (short) 1);
        java.lang.Double double10 = product5.getPrice();
        java.lang.String str11 = product5.getName();
        product5.setId((java.lang.Long) 0L);
        product5.setDescription("");
        java.lang.Long long16 = product5.getId();
        product5.setId((java.lang.Long) 0L);
        product5.setName("Product{id=100, name='', description='', price=10.0, quantity=0}");
        java.lang.String str21 = product5.getDescription();
        java.lang.Double double22 = product5.getPrice();
        product5.addPriceToHistory((java.lang.Double) (-1.0d));
        java.util.List<java.lang.Double> doubleList25 = product5.getPriceHistory();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertNotNull(doubleList25);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getName();
        product5.setDescription("hi!");
        product5.setId((java.lang.Long) 10L);
        java.lang.String str13 = product5.getDescription();
        java.lang.String str14 = product5.getName();
        java.lang.String str15 = product5.toString();
        java.lang.String str16 = product5.toString();
        product5.setDescription("Product{id=0, name='Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}', description='Product{id=10, name='hi!', description='', price=10.0, quantity=0}', price=0.0, quantity=97}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}" + "'", str15, "Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}" + "'", str16, "Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}");
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}", "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", (java.lang.Double) 100.0d, (int) '4');
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        product5.setName("Product{id=-1, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='hi!', price=1.0, quantity=35}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str7, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "Product{id=100, name='Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=100}', description='', price=1.0, quantity=0}", "Product{id=0, name='hi!', description='', price=1.0, quantity=32}", (java.lang.Double) 10.0d, (int) ' ');
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "Product{id=10, name='Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}', description='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', price=10.0, quantity=100}", "Product{id=10, name='Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}', description='', price=1.0, quantity=10}", (java.lang.Double) 10.0d, 52);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.util.List<java.lang.Double> doubleList7 = product5.getPriceHistory();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(doubleList7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "Product{id=0, name='hi!', description='Product{id=100, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='', price=10.0, quantity=0}', price=1.0, quantity=0}", "Product{id=100, name='', description='Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}', price=10.0, quantity=0}", (java.lang.Double) 0.0d, 52);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=10, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=100, name='hi!', description='', price=1.0, quantity=0}', price=100.0, quantity=52}", "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", (java.lang.Double) 0.0d, 0);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        java.lang.Long long10 = product5.getId();
        product5.setQuantity((int) (short) 100);
        java.util.List<java.lang.Double> doubleList13 = product5.getPriceHistory();
        product5.addPriceToHistory((java.lang.Double) (-1.0d));
        java.lang.Long long16 = product5.getId();
        java.lang.String str17 = product5.getName();
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.String str20 = product5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertNotNull(doubleList13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Product{id=100, name='hi!', description='', price=0.0, quantity=100}" + "'", str20, "Product{id=100, name='hi!', description='', price=0.0, quantity=100}");
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=100}", "Product{id=100, name='', description='', price=10.0, quantity=0}", (java.lang.Double) 1.0d, 0);
        java.lang.String str6 = product5.getName();
        product5.setQuantity((-1));
        java.lang.Long long9 = product5.getId();
        java.lang.String str10 = product5.getName();
        java.lang.String str11 = product5.getDescription();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=100}" + "'", str6, "Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=100}");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=100}" + "'", str10, "Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=100}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str11, "Product{id=100, name='', description='', price=10.0, quantity=0}");
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        java.lang.String str10 = product5.getDescription();
        java.lang.String str11 = product5.getDescription();
        java.lang.String str12 = product5.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Product{id=0, name='hi!', description='', price=100.0, quantity=0}" + "'", str12, "Product{id=0, name='hi!', description='', price=100.0, quantity=0}");
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        int int11 = product5.getQuantity();
        java.util.List<java.lang.Double> doubleList12 = product5.getPriceHistory();
        java.lang.String str13 = product5.toString();
        product5.setId((java.lang.Long) 1L);
        product5.setPrice((java.lang.Double) 100.0d);
        java.lang.String str18 = product5.getName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(doubleList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}" + "'", str13, "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.String str11 = product5.getDescription();
        java.lang.Long long12 = product5.getId();
        product5.setId((java.lang.Long) 0L);
        product5.setName("Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getName();
        product5.setName("");
        java.lang.String str11 = product5.getName();
        java.lang.Double double12 = product5.getPrice();
        int int13 = product5.getQuantity();
        java.lang.Double double14 = product5.getPrice();
        java.lang.String str15 = product5.toString();
        java.lang.String str16 = product5.getDescription();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Product{id=0, name='', description='', price=1.0, quantity=0}" + "'", str15, "Product{id=0, name='', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.lang.String str6 = product5.getName();
        java.lang.Long long7 = product5.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        product5.setQuantity((int) (short) 10);
        java.lang.String str9 = product5.toString();
        product5.setDescription("hi!");
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.Double double14 = product5.getPrice();
        product5.setQuantity(35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=10}" + "'", str9, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.String str7 = product5.toString();
        java.lang.Long long8 = product5.getId();
        java.lang.String str9 = product5.getDescription();
        java.lang.String str10 = product5.getDescription();
        product5.setQuantity(35);
        product5.addPriceToHistory((java.lang.Double) 1.0d);
        product5.setDescription("Product{id=100, name='', description='', price=-1.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str7, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.String str12 = product5.getDescription();
        product5.setPrice((java.lang.Double) (-1.0d));
        java.lang.String str15 = product5.toString();
        java.util.List<java.lang.Double> doubleList16 = product5.getPriceHistory();
        java.lang.Double double17 = product5.getPrice();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Product{id=100, name='hi!', description='', price=-1.0, quantity=0}" + "'", str15, "Product{id=100, name='hi!', description='', price=-1.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "", "", (java.lang.Double) 0.0d, (int) (short) -1);
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        java.lang.String str8 = product5.getName();
        java.lang.Long long9 = product5.getId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setQuantity((int) '#');
        java.lang.Long long13 = product5.getId();
        product5.addPriceToHistory((java.lang.Double) (-1.0d));
        java.lang.String str16 = product5.getDescription();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", "Product{id=0, name='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=0}", (java.lang.Double) 10.0d, (-1));
        product5.setId((java.lang.Long) 1L);
        java.util.List<java.lang.Double> doubleList8 = product5.getPriceHistory();
        product5.setQuantity((int) (byte) -1);
        org.junit.Assert.assertNotNull(doubleList8);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "", "Product{id=1, name='', description='', price=-1.0, quantity=100}", (java.lang.Double) 0.0d, (int) (byte) -1);
        product5.setDescription("Product{id=0, name='hi!', description='', price=0.0, quantity=0}");
        product5.addPriceToHistory((java.lang.Double) (-1.0d));
        product5.setQuantity(1);
        java.util.List<java.lang.Double> doubleList12 = product5.getPriceHistory();
        org.junit.Assert.assertNotNull(doubleList12);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        int int11 = product5.getQuantity();
        java.util.List<java.lang.Double> doubleList12 = product5.getPriceHistory();
        java.lang.String str13 = product5.toString();
        product5.setId((java.lang.Long) 1L);
        product5.setDescription("Product{id=-1, name='hi!', description='', price=-1.0, quantity=0}");
        product5.setPrice((java.lang.Double) 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(doubleList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}" + "'", str13, "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}");
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "Product{id=0, name='Product{id=0, name='hi!', description='', price=0.0, quantity=0}', description='Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}', price=0.0, quantity=35}", "Product{id=10, name='Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}', description='', price=0.0, quantity=100}", (java.lang.Double) 10.0d, (int) (byte) 1);
        java.lang.Class<?> wildcardClass6 = product5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        product5.setName("hi!");
        product5.setName("hi!");
        product5.setName("Product{id=1, name='Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='hi!', price=100.0, quantity=35}', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=0.0, quantity=1}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        int int11 = product5.getQuantity();
        java.util.List<java.lang.Double> doubleList12 = product5.getPriceHistory();
        java.lang.String str13 = product5.toString();
        product5.setDescription("Product{id=100, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='', price=10.0, quantity=0}");
        java.util.List<java.lang.Double> doubleList16 = product5.getPriceHistory();
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        java.util.List<java.lang.Double> doubleList19 = product5.getPriceHistory();
        java.lang.Double double20 = product5.getPrice();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(doubleList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}" + "'", str13, "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList16);
        org.junit.Assert.assertNotNull(doubleList19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) (-1.0d));
        java.lang.String str12 = product5.getDescription();
        product5.setId((java.lang.Long) (-1L));
        product5.setId((java.lang.Long) (-1L));
        java.lang.Long long17 = product5.getId();
        java.lang.Long long18 = product5.getId();
        java.lang.String str19 = product5.getDescription();
        java.lang.Class<?> wildcardClass20 = product5.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setQuantity((int) '#');
        java.lang.Long long13 = product5.getId();
        product5.setQuantity((int) (byte) 100);
        product5.setPrice((java.lang.Double) 0.0d);
        int int18 = product5.getQuantity();
        product5.setDescription("Product{id=100, name='Product{id=-1, name='hi!', description='', price=0.0, quantity=100}', description='hi!', price=100.0, quantity=35}");
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) (-1.0d));
        java.lang.String str12 = product5.getDescription();
        java.lang.Long long13 = product5.getId();
        int int14 = product5.getQuantity();
        product5.addPriceToHistory((java.lang.Double) (-1.0d));
        product5.setName("Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        product5.setDescription("Product{id=10, name='', description='', price=0.0, quantity=-1}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}", "Product{id=0, name='hi!', description='', price=0.0, quantity=0}", (java.lang.Double) 1.0d, (int) ' ');
        java.lang.String str6 = product5.getDescription();
        java.lang.Long long7 = product5.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=0, name='hi!', description='', price=0.0, quantity=0}" + "'", str6, "Product{id=0, name='hi!', description='', price=0.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setId((java.lang.Long) 10L);
        product5.setQuantity((int) (short) 1);
        java.lang.String str16 = product5.getName();
        product5.setId((java.lang.Long) 0L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setQuantity((int) '#');
        product5.setDescription("");
        product5.setName("Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}");
        product5.setId((java.lang.Long) 100L);
        product5.setPrice((java.lang.Double) 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        java.lang.String str10 = product5.getDescription();
        java.lang.String str11 = product5.toString();
        java.lang.String str12 = product5.getDescription();
        java.util.List<java.lang.Double> doubleList13 = product5.getPriceHistory();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str11, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(doubleList13);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        product5.setName("hi!");
        product5.setId((java.lang.Long) 10L);
        product5.setId((java.lang.Long) (-1L));
        java.lang.Double double14 = product5.getPrice();
        java.lang.String str15 = product5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Product{id=-1, name='hi!', description='', price=1.0, quantity=0}" + "'", str15, "Product{id=-1, name='hi!', description='', price=1.0, quantity=0}");
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "Product{id=1, name='hi!', description='Product{id=-1, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}", "Product{id=10, name='hi!', description='', price=1.0, quantity=10}", (java.lang.Double) 10.0d, 32);
        java.lang.String str6 = product5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=1, name='hi!', description='Product{id=-1, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}" + "'", str6, "Product{id=1, name='hi!', description='Product{id=-1, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}");
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setQuantity((int) (short) 1);
        java.lang.Double double10 = product5.getPrice();
        java.lang.String str11 = product5.getName();
        product5.setDescription("Product{id=1, name='Product{id=-1, name='hi!', description='', price=0.0, quantity=100}', description='hi!', price=100.0, quantity=35}");
        product5.addPriceToHistory((java.lang.Double) 10.0d);
        product5.setQuantity(0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setName("hi!");
        int int8 = product5.getQuantity();
        java.lang.Double double9 = product5.getPrice();
        product5.setPrice((java.lang.Double) (-1.0d));
        product5.setId((java.lang.Long) 0L);
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "", "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}", (java.lang.Double) (-1.0d), (int) (short) 100);
        product5.setQuantity((int) '#');
        java.lang.String str8 = product5.getName();
        product5.setQuantity((int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.lang.Double double10 = product5.getPrice();
        product5.setId((java.lang.Long) 10L);
        java.util.List<java.lang.Double> doubleList13 = product5.getPriceHistory();
        java.lang.String str14 = product5.getDescription();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertNotNull(doubleList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 0L);
        product5.addPriceToHistory((java.lang.Double) (-1.0d));
        java.lang.Double double11 = product5.getPrice();
        int int12 = product5.getQuantity();
        product5.setId((java.lang.Long) (-1L));
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "", "", (java.lang.Double) 0.0d, (int) (short) -1);
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        product5.setId((java.lang.Long) 100L);
        product5.setId((java.lang.Long) 0L);
        product5.setDescription("hi!");
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setQuantity((int) (short) 1);
        java.lang.Double double10 = product5.getPrice();
        java.lang.String str11 = product5.getName();
        product5.setId((java.lang.Long) 0L);
        java.lang.Double double14 = product5.getPrice();
        java.lang.String str15 = product5.getDescription();
        product5.setDescription("Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        int int10 = product5.getQuantity();
        java.lang.Double double11 = product5.getPrice();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=10.0, quantity=0}", "Product{id=100, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='', price=1.0, quantity=0}", (java.lang.Double) 10.0d, (int) (short) 100);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        product5.setName("hi!");
        java.lang.Double double10 = product5.getPrice();
        java.lang.String str11 = product5.toString();
        product5.setId((java.lang.Long) (-1L));
        java.lang.String str14 = product5.getName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str11, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setQuantity((int) (short) 1);
        product5.setQuantity((int) (short) 100);
        java.lang.String str12 = product5.getName();
        product5.setDescription("Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
        java.util.List<java.lang.Double> doubleList15 = product5.getPriceHistory();
        product5.setQuantity((int) 'a');
        java.lang.String str18 = product5.getDescription();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(doubleList15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=10}" + "'", str18, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 0.0d);
        product5.setPrice((java.lang.Double) 100.0d);
        java.lang.String str14 = product5.toString();
        product5.setDescription("Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=100}");
        product5.setPrice((java.lang.Double) (-1.0d));
        product5.setName("Product{id=1, name='', description='Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}', price=-1.0, quantity=100}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Product{id=100, name='hi!', description='', price=100.0, quantity=0}" + "'", str14, "Product{id=100, name='hi!', description='', price=100.0, quantity=0}");
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.Double double8 = product5.getPrice();
        product5.setId((java.lang.Long) (-1L));
        product5.addPriceToHistory((java.lang.Double) 10.0d);
        java.lang.String str13 = product5.toString();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=-1, name='hi!', description='', price=1.0, quantity=0}" + "'", str13, "Product{id=-1, name='hi!', description='', price=1.0, quantity=0}");
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getName();
        product5.setQuantity((int) (byte) -1);
        java.lang.Long long11 = product5.getId();
        java.lang.String str12 = product5.getDescription();
        java.lang.Long long13 = product5.getId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getName();
        product5.setDescription("hi!");
        product5.setPrice((java.lang.Double) 1.0d);
        java.lang.String str13 = product5.getName();
        int int14 = product5.getQuantity();
        java.lang.String str15 = product5.toString();
        java.lang.String str16 = product5.getDescription();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Product{id=0, name='hi!', description='hi!', price=1.0, quantity=0}" + "'", str15, "Product{id=0, name='hi!', description='hi!', price=1.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=100, name='hi!', description='', price=1.0, quantity=10}", "Product{id=0, name='hi!', description='', price=1.0, quantity=0}", (java.lang.Double) 0.0d, (int) (short) -1);
        java.lang.String str6 = product5.getName();
        java.lang.String str7 = product5.toString();
        product5.setId((java.lang.Long) (-1L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=10}" + "'", str6, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}" + "'", str7, "Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}");
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "Product{id=100, name='Product{id=-1, name='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=-1.0, quantity=35}', description='', price=10.0, quantity=35}", "", (java.lang.Double) (-1.0d), 35);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        org.junit.Assert.assertNotNull(doubleList6);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=100, name='', description='', price=10.0, quantity=0}", "", (java.lang.Double) 100.0d, (int) ' ');
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        java.lang.Long long8 = product5.getId();
        java.util.List<java.lang.Double> doubleList9 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setDescription("Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=1.0, quantity=1}");
        java.lang.Long long16 = product5.getId();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(doubleList9);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getName();
        product5.setDescription("hi!");
        product5.setPrice((java.lang.Double) 1.0d);
        java.lang.String str13 = product5.getName();
        int int14 = product5.getQuantity();
        product5.setDescription("Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        product5.setQuantity(35);
        int int19 = product5.getQuantity();
        java.util.List<java.lang.Double> doubleList20 = product5.getPriceHistory();
        product5.setDescription("Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=10.0, quantity=0}");
        product5.setName("Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=-1.0, quantity=100}', price=-1.0, quantity=10}");
        product5.setPrice((java.lang.Double) 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
        org.junit.Assert.assertNotNull(doubleList20);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}", "Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=100}", (java.lang.Double) (-1.0d), 10);
        java.lang.Double double6 = product5.getPrice();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=100, name='hi!', description='', price=10.0, quantity=0}", "Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}", (java.lang.Double) (-1.0d), (int) (short) 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.String str7 = product5.getDescription();
        java.util.List<java.lang.Double> doubleList8 = product5.getPriceHistory();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}" + "'", str7, "Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList8);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=1, name='Product{id=1, name='', description='', price=-1.0, quantity=100}', description='hi!', price=100.0, quantity=35}", "Product{id=100, name='hi!', description='hi!', price=-1.0, quantity=0}", (java.lang.Double) 1.0d, 35);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) (-1.0d), (int) (byte) 100);
        product5.setPrice((java.lang.Double) 100.0d);
        java.lang.Long long8 = product5.getId();
        product5.setId((java.lang.Long) (-1L));
        java.lang.Double double11 = product5.getPrice();
        product5.setQuantity(52);
        java.util.List<java.lang.Double> doubleList14 = product5.getPriceHistory();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertNotNull(doubleList14);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=100, name='', description='', price=10.0, quantity=0}", "", (java.lang.Double) 100.0d, (int) ' ');
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        java.lang.Long long8 = product5.getId();
        java.lang.String str9 = product5.toString();
        java.lang.Long long10 = product5.getId();
        product5.setName("Product{id=0, name='hi!', description='', price=1.0, quantity=35}");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}" + "'", str9, "Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=100, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='', price=10.0, quantity=0}", "Product{id=100, name='hi!', description='', price=100.0, quantity=0}", (java.lang.Double) 10.0d, 52);
        product5.setPrice((java.lang.Double) 10.0d);
        int int8 = product5.getQuantity();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setName("");
        java.lang.String str14 = product5.toString();
        java.lang.Double double15 = product5.getPrice();
        java.lang.String str16 = product5.toString();
        product5.setName("Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
        java.lang.Long long19 = product5.getId();
        java.lang.String str20 = product5.getName();
        product5.setPrice((java.lang.Double) 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str14, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str16, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=10}" + "'", str20, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "hi!", "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}", (java.lang.Double) 0.0d, (int) ' ');
        product5.setName("Product{id=100, name='', description='', price=10.0, quantity=0}");
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setPrice((java.lang.Double) 1.0d);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "Product{id=10, name='', description='', price=0.0, quantity=-1}", "hi!", (java.lang.Double) 0.0d, 32);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        java.lang.String str9 = product5.getDescription();
        product5.setName("Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}");
        product5.setName("Product{id=100, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}");
        product5.setDescription("Product{id=100, name='', description='', price=-1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setName("");
        java.lang.String str14 = product5.toString();
        java.lang.Double double15 = product5.getPrice();
        java.lang.String str16 = product5.toString();
        product5.setName("Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
        product5.setPrice((java.lang.Double) (-1.0d));
        java.lang.Double double21 = product5.getPrice();
        java.lang.Long long22 = product5.getId();
        product5.setQuantity(0);
        java.lang.Double double25 = product5.getPrice();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str14, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str16, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.0d) + "'", double25 == (-1.0d));
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.Double double8 = product5.getPrice();
        product5.setQuantity((int) (byte) 0);
        java.lang.Long long11 = product5.getId();
        java.lang.Long long12 = product5.getId();
        int int13 = product5.getQuantity();
        product5.setQuantity(0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.String str7 = product5.toString();
        product5.addPriceToHistory((java.lang.Double) 10.0d);
        java.lang.String str10 = product5.toString();
        java.lang.Double double11 = product5.getPrice();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str7, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str10, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=100}", "Product{id=100, name='', description='', price=10.0, quantity=0}", (java.lang.Double) 1.0d, 0);
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        int int8 = product5.getQuantity();
        product5.setDescription("Product{id=100, name='', description='', price=0.0, quantity=0}");
        product5.addPriceToHistory((java.lang.Double) (-1.0d));
        java.lang.Double double13 = product5.getPrice();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.util.List<java.lang.Double> doubleList10 = product5.getPriceHistory();
        java.util.List<java.lang.Double> doubleList11 = product5.getPriceHistory();
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setQuantity((int) ' ');
        product5.setPrice((java.lang.Double) 10.0d);
        java.util.List<java.lang.Double> doubleList18 = product5.getPriceHistory();
        org.junit.Assert.assertNotNull(doubleList10);
        org.junit.Assert.assertNotNull(doubleList11);
        org.junit.Assert.assertNotNull(doubleList18);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}", "Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}", (java.lang.Double) 0.0d, 100);
        product5.addPriceToHistory((java.lang.Double) 1.0d);
        product5.setName("Product{id=1, name='Product{id=100, name='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', description='', price=1.0, quantity=0}', description='Product{id=0, name='hi!', description='', price=0.0, quantity=0}', price=10.0, quantity=-1}");
        int int10 = product5.getQuantity();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        java.lang.String str10 = product5.getDescription();
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        java.lang.Double double13 = product5.getPrice();
        java.lang.String str14 = product5.getName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setQuantity((int) '#');
        product5.setName("hi!");
        java.lang.String str15 = product5.getDescription();
        java.lang.String str16 = product5.getDescription();
        java.lang.Long long17 = product5.getId();
        product5.setQuantity((int) (short) 0);
        java.lang.String str20 = product5.getName();
        java.lang.Double double21 = product5.getPrice();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setId((java.lang.Long) 10L);
        java.lang.Long long14 = product5.getId();
        java.lang.Double double15 = product5.getPrice();
        product5.setName("Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}");
        java.lang.String str18 = product5.getName();
        product5.setPrice((java.lang.Double) 100.0d);
        java.lang.String str21 = product5.toString();
        java.lang.String str22 = product5.getDescription();
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}" + "'", str18, "Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Product{id=10, name='Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}', description='', price=100.0, quantity=0}" + "'", str21, "Product{id=10, name='Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}', description='', price=100.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}", "Product{id=100, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=0.0, quantity=0}", (java.lang.Double) (-1.0d), (int) (byte) -1);
        java.lang.String str6 = product5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=10, name='Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}', description='Product{id=100, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=0.0, quantity=0}', price=-1.0, quantity=-1}" + "'", str6, "Product{id=10, name='Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}', description='Product{id=100, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=0.0, quantity=0}', price=-1.0, quantity=-1}");
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}", "Product{id=1, name='hi!', description='', price=1.0, quantity=0}", (java.lang.Double) 0.0d, 100);
        product5.setId((java.lang.Long) 100L);
        java.lang.String str8 = product5.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Product{id=100, name='Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}', description='Product{id=1, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=100}" + "'", str8, "Product{id=100, name='Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}', description='Product{id=1, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=100}");
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setQuantity((int) '#');
        product5.setName("hi!");
        java.lang.String str15 = product5.getDescription();
        java.lang.String str16 = product5.getDescription();
        java.lang.Long long17 = product5.getId();
        int int18 = product5.getQuantity();
        java.lang.String str19 = product5.toString();
        product5.setDescription("Product{id=100, name='hi!', description='', price=-1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Product{id=100, name='hi!', description='', price=10.0, quantity=35}" + "'", str19, "Product{id=100, name='hi!', description='', price=10.0, quantity=35}");
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=100, name='hi!', description='', price=10.0, quantity=0}", "hi!", (java.lang.Double) 1.0d, 52);
        product5.setQuantity((int) (short) 10);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setQuantity((int) '#');
        product5.setId((java.lang.Long) 100L);
        java.lang.Double double15 = product5.getPrice();
        java.util.List<java.lang.Double> doubleList16 = product5.getPriceHistory();
        product5.setPrice((java.lang.Double) (-1.0d));
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        java.lang.String str21 = product5.getDescription();
        product5.addPriceToHistory((java.lang.Double) 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(doubleList16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        int int8 = product5.getQuantity();
        product5.setDescription("hi!");
        java.util.List<java.lang.Double> doubleList11 = product5.getPriceHistory();
        java.lang.String str12 = product5.getName();
        java.lang.String str13 = product5.toString();
        product5.setPrice((java.lang.Double) 0.0d);
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        product5.setQuantity(0);
        product5.setName("Product{id=100, name='hi!', description='', price=1.0, quantity=97}");
        java.lang.String str22 = product5.getDescription();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}" + "'", str13, "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}", "Product{id=1, name='hi!', description='', price=1.0, quantity=0}", (java.lang.Double) 0.0d, 100);
        product5.setId((java.lang.Long) 100L);
        java.lang.String str8 = product5.getDescription();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Product{id=1, name='hi!', description='', price=1.0, quantity=0}" + "'", str8, "Product{id=1, name='hi!', description='', price=1.0, quantity=0}");
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.String str12 = product5.getDescription();
        product5.addPriceToHistory((java.lang.Double) (-1.0d));
        product5.setDescription("Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
        product5.setId((java.lang.Long) (-1L));
        java.lang.String str19 = product5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Product{id=-1, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=0.0, quantity=0}" + "'", str19, "Product{id=-1, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=0.0, quantity=0}");
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}", "", (java.lang.Double) 100.0d, (-1));
        product5.addPriceToHistory((java.lang.Double) 10.0d);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.util.List<java.lang.Double> doubleList10 = product5.getPriceHistory();
        java.lang.String str11 = product5.getName();
        java.lang.String str12 = product5.toString();
        product5.setId((java.lang.Long) 100L);
        java.lang.Double double15 = product5.getPrice();
        org.junit.Assert.assertNotNull(doubleList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str12, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setName("");
        java.lang.String str14 = product5.toString();
        java.lang.Double double15 = product5.getPrice();
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str14, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "hi!", "", (java.lang.Double) 0.0d, (int) (byte) 100);
        product5.addPriceToHistory((java.lang.Double) 10.0d);
        java.lang.String str8 = product5.toString();
        java.util.List<java.lang.Double> doubleList9 = product5.getPriceHistory();
        product5.setId((java.lang.Long) (-1L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Product{id=-1, name='hi!', description='', price=0.0, quantity=100}" + "'", str8, "Product{id=-1, name='hi!', description='', price=0.0, quantity=100}");
        org.junit.Assert.assertNotNull(doubleList9);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=100, name='Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}', description='Product{id=1, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=100}", "Product{id=100, name='hi!', description='hi!', price=0.0, quantity=0}", (java.lang.Double) 1.0d, 10);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.String str12 = product5.getDescription();
        int int13 = product5.getQuantity();
        product5.setId((java.lang.Long) 1L);
        product5.setDescription("Product{id=1, name='Product{id=100, name='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', description='', price=1.0, quantity=0}', description='Product{id=0, name='hi!', description='', price=0.0, quantity=0}', price=10.0, quantity=-1}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.String str7 = product5.toString();
        java.lang.Long long8 = product5.getId();
        java.lang.String str9 = product5.getDescription();
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        java.lang.String str12 = product5.getDescription();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str7, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        int int8 = product5.getQuantity();
        product5.setDescription("hi!");
        java.util.List<java.lang.Double> doubleList11 = product5.getPriceHistory();
        java.lang.String str12 = product5.getName();
        java.lang.String str13 = product5.toString();
        product5.setPrice((java.lang.Double) 0.0d);
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        product5.setId((java.lang.Long) 100L);
        int int20 = product5.getQuantity();
        product5.setDescription("Product{id=1, name='', description='', price=-1.0, quantity=100}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}" + "'", str13, "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setId((java.lang.Long) 10L);
        java.lang.Long long14 = product5.getId();
        product5.setName("Product{id=100, name='hi!', description='', price=100.0, quantity=0}");
        product5.setQuantity((int) '#');
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}", "Product{id=0, name='hi!', description='hi!', price=1.0, quantity=0}", (java.lang.Double) 100.0d, (int) 'a');
        java.lang.String str6 = product5.getName();
        product5.setDescription("Product{id=1, name='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', description='Product{id=0, name='Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}', description='Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}', price=1.0, quantity=0}', price=0.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}" + "'", str6, "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}");
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}", "Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}", (java.lang.Double) 0.0d, 35);
        product5.setPrice((java.lang.Double) (-1.0d));
        product5.setDescription("Product{id=0, name='hi!', description='hi!', price=1.0, quantity=100}");
        java.util.List<java.lang.Double> doubleList10 = product5.getPriceHistory();
        org.junit.Assert.assertNotNull(doubleList10);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getName();
        product5.setDescription("hi!");
        product5.setPrice((java.lang.Double) 1.0d);
        java.lang.String str13 = product5.getName();
        int int14 = product5.getQuantity();
        product5.setDescription("Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        product5.setQuantity(35);
        int int19 = product5.getQuantity();
        java.util.List<java.lang.Double> doubleList20 = product5.getPriceHistory();
        product5.setQuantity((int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
        org.junit.Assert.assertNotNull(doubleList20);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.Long long7 = product5.getId();
        int int8 = product5.getQuantity();
        java.lang.String str9 = product5.getDescription();
        int int10 = product5.getQuantity();
        java.lang.Long long11 = product5.getId();
        product5.addPriceToHistory((java.lang.Double) 1.0d);
        java.lang.String str14 = product5.toString();
        product5.setName("Product{id=0, name='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str14, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        int int8 = product5.getQuantity();
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        product5.setId((java.lang.Long) 10L);
        product5.setQuantity(0);
        java.lang.Long long15 = product5.getId();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setId((java.lang.Long) 1L);
        java.lang.String str20 = product5.getName();
        java.util.List<java.lang.Double> doubleList21 = product5.getPriceHistory();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(doubleList21);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=0, name='', description='', price=1.0, quantity=0}", "Product{id=100, name='hi!', description='', price=1.0, quantity=1}", (java.lang.Double) 1.0d, 32);
        product5.setDescription("Product{id=10, name='', description='', price=-1.0, quantity=-1}");
        product5.setName("Product{id=10, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=100, name='hi!', description='', price=1.0, quantity=0}', price=100.0, quantity=52}");
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        product5.setName("");
        product5.addPriceToHistory((java.lang.Double) (-1.0d));
        java.lang.Long long12 = product5.getId();
        product5.addPriceToHistory((java.lang.Double) (-1.0d));
        java.lang.String str15 = product5.getDescription();
        java.lang.String str16 = product5.toString();
        product5.setQuantity(10);
        java.lang.Double double19 = product5.getPrice();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Product{id=100, name='', description='', price=1.0, quantity=0}" + "'", str16, "Product{id=100, name='', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}", "Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}", (java.lang.Double) 100.0d, (int) '4');
        java.lang.String str6 = product5.getDescription();
        java.lang.Double double7 = product5.getPrice();
        java.util.List<java.lang.Double> doubleList8 = product5.getPriceHistory();
        product5.addPriceToHistory((java.lang.Double) 1.0d);
        product5.setName("Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}" + "'", str6, "Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertNotNull(doubleList8);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.lang.String str10 = product5.getName();
        java.util.List<java.lang.Double> doubleList11 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 0L);
        int int14 = product5.getQuantity();
        java.lang.Double double15 = product5.getPrice();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(doubleList11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getName();
        product5.setName("");
        java.lang.String str11 = product5.getName();
        java.lang.String str12 = product5.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Product{id=0, name='', description='', price=1.0, quantity=0}" + "'", str12, "Product{id=0, name='', description='', price=1.0, quantity=0}");
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "Product{id=0, name='Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}', description='Product{id=0, name='Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}', description='Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}', price=0.0, quantity=100}', price=0.0, quantity=-1}", "Product{id=-1, name='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', description='Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}', price=10.0, quantity=32}", (java.lang.Double) 10.0d, (int) ' ');
        product5.setDescription("Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=52}");
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        int int11 = product5.getQuantity();
        java.util.List<java.lang.Double> doubleList12 = product5.getPriceHistory();
        java.lang.String str13 = product5.toString();
        product5.setDescription("Product{id=100, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='', price=10.0, quantity=0}");
        java.util.List<java.lang.Double> doubleList16 = product5.getPriceHistory();
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        java.util.List<java.lang.Double> doubleList19 = product5.getPriceHistory();
        java.util.List<java.lang.Double> doubleList20 = product5.getPriceHistory();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(doubleList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}" + "'", str13, "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList16);
        org.junit.Assert.assertNotNull(doubleList19);
        org.junit.Assert.assertNotNull(doubleList20);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        product5.setName("hi!");
        product5.setPrice((java.lang.Double) 100.0d);
        java.util.List<java.lang.Double> doubleList12 = product5.getPriceHistory();
        product5.setDescription("Product{id=100, name='hi!', description='', price=10.0, quantity=0}");
        java.lang.Long long15 = product5.getId();
        java.lang.String str16 = product5.getDescription();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(doubleList12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Product{id=100, name='hi!', description='', price=10.0, quantity=0}" + "'", str16, "Product{id=100, name='hi!', description='', price=10.0, quantity=0}");
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        product5.setId((java.lang.Long) 1L);
        product5.setPrice((java.lang.Double) 1.0d);
        product5.setId((java.lang.Long) 1L);
        java.lang.String str16 = product5.getDescription();
        product5.setName("Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=1.0, quantity=1}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", "hi!", (java.lang.Double) 100.0d, (int) '#');
        int int6 = product5.getQuantity();
        product5.setName("Product{id=100, name='', description='', price=10.0, quantity=0}");
        java.lang.String str9 = product5.getName();
        product5.setName("Product{id=-1, name='hi!', description='', price=0.0, quantity=100}");
        product5.setName("Product{id=-1, name='hi!', description='', price=0.0, quantity=100}");
        product5.setDescription("hi!");
        product5.setName("Product{id=100, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str9, "Product{id=100, name='', description='', price=10.0, quantity=0}");
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.String str8 = product5.getDescription();
        java.util.List<java.lang.Double> doubleList9 = product5.getPriceHistory();
        product5.setPrice((java.lang.Double) 0.0d);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        product5.setName("");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(doubleList9);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.Long long7 = product5.getId();
        int int8 = product5.getQuantity();
        product5.setName("Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}");
        java.lang.String str11 = product5.getDescription();
        java.lang.Long long12 = product5.getId();
        product5.setName("Product{id=10, name='Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}', description='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', price=10.0, quantity=100}");
        product5.addPriceToHistory((java.lang.Double) 10.0d);
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        java.lang.String str11 = product5.getDescription();
        java.lang.Double double12 = product5.getPrice();
        product5.setDescription("Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        product5.setId((java.lang.Long) (-1L));
        java.lang.Long long17 = product5.getId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}", "Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}", (java.lang.Double) 0.0d, 100);
        product5.addPriceToHistory((java.lang.Double) (-1.0d));
        product5.setQuantity(97);
        product5.setDescription("Product{id=100, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=0}', price=10.0, quantity=-1}");
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.lang.String str10 = product5.getName();
        java.util.List<java.lang.Double> doubleList11 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 0L);
        product5.setName("Product{id=10, name='hi!', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(doubleList11);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setQuantity((int) '#');
        product5.setName("hi!");
        java.lang.Double double15 = product5.getPrice();
        java.lang.String str16 = product5.getName();
        product5.setDescription("");
        java.lang.Class<?> wildcardClass19 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=10, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=10.0, quantity=35}", "Product{id=100, name='hi!', description='', price=-1.0, quantity=0}", (java.lang.Double) 1.0d, (int) (byte) 0);
        int int6 = product5.getQuantity();
        product5.setDescription("Product{id=100, name='Product{id=0, name='hi!', description='Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}', price=0.0, quantity=0}', description='', price=0.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getName();
        product5.setDescription("hi!");
        product5.setPrice((java.lang.Double) 1.0d);
        java.lang.String str13 = product5.getName();
        int int14 = product5.getQuantity();
        java.util.List<java.lang.Double> doubleList15 = product5.getPriceHistory();
        product5.setPrice((java.lang.Double) 1.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(doubleList15);
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        java.lang.String str11 = product5.getDescription();
        java.lang.Double double12 = product5.getPrice();
        product5.setDescription("Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        product5.setPrice((java.lang.Double) 10.0d);
        java.lang.Double double17 = product5.getPrice();
        java.util.List<java.lang.Double> doubleList18 = product5.getPriceHistory();
        java.lang.String str19 = product5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertNotNull(doubleList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Product{id=100, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=0}', price=10.0, quantity=0}" + "'", str19, "Product{id=100, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=0}', price=10.0, quantity=0}");
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 0L);
        java.util.List<java.lang.Double> doubleList9 = product5.getPriceHistory();
        java.lang.String str10 = product5.toString();
        java.lang.Class<?> wildcardClass11 = product5.getClass();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertNotNull(doubleList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str10, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.util.List<java.lang.Double> doubleList8 = product5.getPriceHistory();
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.String str11 = product5.toString();
        product5.setDescription("Product{id=100, name='hi!', description='', price=1.0, quantity=97}");
        org.junit.Assert.assertNotNull(doubleList8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product{id=0, name='hi!', description='', price=0.0, quantity=0}" + "'", str11, "Product{id=0, name='hi!', description='', price=0.0, quantity=0}");
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=100, name='hi!', description='', price=1.0, quantity=10}", "Product{id=0, name='hi!', description='', price=1.0, quantity=0}", (java.lang.Double) 0.0d, (int) (short) -1);
        java.lang.String str6 = product5.getName();
        java.lang.String str7 = product5.getName();
        product5.addPriceToHistory((java.lang.Double) 10.0d);
        product5.addPriceToHistory((java.lang.Double) 1.0d);
        product5.setDescription("Product{id=100, name='hi!', description='', price=100.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=10}" + "'", str6, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=10}" + "'", str7, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) (-1.0d), (int) (byte) 100);
        product5.setPrice((java.lang.Double) 100.0d);
        java.lang.Long long8 = product5.getId();
        product5.setId((java.lang.Long) (-1L));
        product5.setName("Product{id=100, name='hi!', description='', price=1.0, quantity=35}");
        product5.setDescription("Product{id=100, name='', description='Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}', price=10.0, quantity=0}");
        java.lang.Class<?> wildcardClass15 = product5.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setId((java.lang.Long) 10L);
        product5.setName("");
        product5.setQuantity((int) (short) 10);
        product5.setName("Product{id=100, name='', description='', price=10.0, quantity=0}");
        java.lang.String str20 = product5.toString();
        product5.setPrice((java.lang.Double) (-1.0d));
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str27 = product5.getName();
        java.util.List<java.lang.Double> doubleList28 = product5.getPriceHistory();
        product5.setId((java.lang.Long) (-1L));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}" + "'", str20, "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str27, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList28);
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        int int11 = product5.getQuantity();
        java.util.List<java.lang.Double> doubleList12 = product5.getPriceHistory();
        java.lang.String str13 = product5.toString();
        int int14 = product5.getQuantity();
        java.lang.String str15 = product5.getDescription();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(doubleList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}" + "'", str13, "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str15, "Product{id=100, name='', description='', price=10.0, quantity=0}");
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setQuantity((int) (short) 1);
        java.lang.Double double10 = product5.getPrice();
        java.lang.String str11 = product5.getName();
        product5.setId((java.lang.Long) 0L);
        product5.setDescription("");
        java.lang.Long long16 = product5.getId();
        product5.setId((java.lang.Long) 0L);
        product5.setName("Product{id=100, name='', description='', price=10.0, quantity=0}");
        java.lang.Long long21 = product5.getId();
        java.lang.Long long22 = product5.getId();
        java.lang.String str23 = product5.getDescription();
        java.lang.String str24 = product5.getName();
        java.lang.String str25 = product5.getDescription();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str24, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        int int8 = product5.getQuantity();
        product5.setDescription("hi!");
        java.util.List<java.lang.Double> doubleList11 = product5.getPriceHistory();
        product5.setDescription("Product{id=100, name='hi!', description='', price=10.0, quantity=0}");
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.String str16 = product5.getDescription();
        product5.setQuantity(0);
        product5.setPrice((java.lang.Double) 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleList11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Product{id=100, name='hi!', description='', price=10.0, quantity=0}" + "'", str16, "Product{id=100, name='hi!', description='', price=10.0, quantity=0}");
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", "hi!", (java.lang.Double) 100.0d, (int) '#');
        int int6 = product5.getQuantity();
        product5.setName("Product{id=100, name='', description='', price=10.0, quantity=0}");
        java.lang.String str9 = product5.getName();
        product5.setName("Product{id=-1, name='hi!', description='', price=0.0, quantity=100}");
        product5.setName("Product{id=-1, name='hi!', description='', price=0.0, quantity=100}");
        java.util.List<java.lang.Double> doubleList14 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 100L);
        java.lang.String str17 = product5.getDescription();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str9, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=-1, name='hi!', description='', price=-1.0, quantity=0}", "Product{id=-1, name='hi!', description='', price=-1.0, quantity=0}", (java.lang.Double) 1.0d, (int) 'a');
        java.lang.Double double6 = product5.getPrice();
        product5.setQuantity((int) (byte) 1);
        java.util.List<java.lang.Double> doubleList9 = product5.getPriceHistory();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertNotNull(doubleList9);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=0, name='hi!', description='hi!', price=1.0, quantity=100}", "Product{id=0, name='hi!', description='', price=1.0, quantity=0}", (java.lang.Double) 10.0d, (int) (byte) -1);
        java.lang.Double double6 = product5.getPrice();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=100, name='hi!', description='', price=10.0, quantity=0}", "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}", (java.lang.Double) 10.0d, (int) ' ');
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        product5.setPrice((java.lang.Double) 1.0d);
        java.lang.Double double9 = product5.getPrice();
        product5.setId((java.lang.Long) 1L);
        product5.setQuantity(1);
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setId((java.lang.Long) 10L);
        product5.setName("");
        product5.setQuantity((int) (short) 10);
        product5.setName("Product{id=100, name='', description='', price=10.0, quantity=0}");
        java.lang.String str20 = product5.toString();
        product5.setPrice((java.lang.Double) (-1.0d));
        product5.setId((java.lang.Long) (-1L));
        java.util.List<java.lang.Double> doubleList25 = product5.getPriceHistory();
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}" + "'", str20, "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}");
        org.junit.Assert.assertNotNull(doubleList25);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "", "", (java.lang.Double) 0.0d, (int) (short) -1);
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        product5.setId((java.lang.Long) 100L);
        product5.setId((java.lang.Long) 0L);
        product5.addPriceToHistory((java.lang.Double) 0.0d);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.String str13 = product5.getDescription();
        java.lang.String str14 = product5.getDescription();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        int int8 = product5.getQuantity();
        product5.setDescription("hi!");
        java.util.List<java.lang.Double> doubleList11 = product5.getPriceHistory();
        java.lang.String str12 = product5.getName();
        java.lang.String str13 = product5.toString();
        product5.setPrice((java.lang.Double) 0.0d);
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        product5.setId((java.lang.Long) 100L);
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setDescription("Product{id=10, name='Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}', description='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', price=10.0, quantity=100}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}" + "'", str13, "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}");
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=100, name='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', description='', price=1.0, quantity=0}", "Product{id=0, name='hi!', description='', price=0.0, quantity=0}", (java.lang.Double) 0.0d, (int) (byte) -1);
        product5.setQuantity((int) (byte) 1);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) (-1.0d), (int) (byte) 100);
        product5.setName("Product{id=-1, name='hi!', description='', price=0.0, quantity=100}");
        java.lang.Double double8 = product5.getPrice();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        int int11 = product5.getQuantity();
        product5.setPrice((java.lang.Double) (-1.0d));
        java.util.List<java.lang.Double> doubleList14 = product5.getPriceHistory();
        product5.setDescription("Product{id=100, name='hi!', description='', price=10.0, quantity=35}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(doubleList14);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setId((java.lang.Long) 10L);
        java.lang.Long long14 = product5.getId();
        java.lang.Double double15 = product5.getPrice();
        product5.setName("Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}");
        product5.setName("Product{id=0, name='Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}', description='Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}', price=0.0, quantity=100}");
        java.util.List<java.lang.Double> doubleList20 = product5.getPriceHistory();
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(doubleList20);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setId((java.lang.Long) 10L);
        java.lang.Long long14 = product5.getId();
        java.lang.String str15 = product5.getDescription();
        java.lang.String str16 = product5.getName();
        product5.setQuantity((int) (short) -1);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.Double double8 = product5.getPrice();
        product5.setQuantity((int) (byte) 0);
        java.lang.Double double11 = product5.getPrice();
        int int12 = product5.getQuantity();
        java.lang.String str13 = product5.getName();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setId((java.lang.Long) 10L);
        product5.setName("");
        product5.setQuantity((int) (short) 10);
        product5.setDescription("Product{id=10, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=100, name='hi!', description='', price=1.0, quantity=0}', price=100.0, quantity=52}");
        java.util.List<java.lang.Double> doubleList20 = product5.getPriceHistory();
        java.lang.Double double21 = product5.getPrice();
        int int22 = product5.getQuantity();
        org.junit.Assert.assertNotNull(doubleList20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setName("");
        java.lang.String str14 = product5.toString();
        java.lang.Double double15 = product5.getPrice();
        java.lang.String str16 = product5.toString();
        product5.setName("Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
        product5.setPrice((java.lang.Double) (-1.0d));
        java.lang.Double double21 = product5.getPrice();
        int int22 = product5.getQuantity();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str14, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str16, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setName("hi!");
        java.lang.String str8 = product5.getDescription();
        java.util.List<java.lang.Double> doubleList9 = product5.getPriceHistory();
        java.lang.String str10 = product5.getName();
        product5.setDescription("Product{id=10, name='', description='', price=0.0, quantity=-1}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(doubleList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setName("");
        java.lang.Double double14 = product5.getPrice();
        product5.setQuantity((int) (byte) 10);
        java.lang.Double double17 = product5.getPrice();
        java.lang.Long long18 = product5.getId();
        product5.setDescription("Product{id=0, name='hi!', description='hi!', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "Product{id=0, name='hi!', description='Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}', price=1.0, quantity=0}", "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}", (java.lang.Double) 1.0d, 97);
        java.lang.Double double6 = product5.getPrice();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "hi!", "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}", (java.lang.Double) 0.0d, (int) ' ');
        product5.setQuantity((int) 'a');
        product5.setName("Product{id=100, name='', description='', price=-1.0, quantity=0}");
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.lang.String str10 = product5.getName();
        java.util.List<java.lang.Double> doubleList11 = product5.getPriceHistory();
        product5.setName("Product{id=100, name='hi!', description='', price=0.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(doubleList11);
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setName("");
        java.lang.String str14 = product5.toString();
        java.lang.Double double15 = product5.getPrice();
        java.lang.String str16 = product5.toString();
        product5.setName("Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
        product5.setPrice((java.lang.Double) (-1.0d));
        java.lang.Double double21 = product5.getPrice();
        java.lang.Long long22 = product5.getId();
        product5.setDescription("hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str14, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str16, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=10, name='hi!', description='', price=10.0, quantity=0}", "Product{id=100, name='hi!', description='', price=1.0, quantity=10}", (java.lang.Double) 0.0d, (int) (short) -1);
        java.lang.String str6 = product5.toString();
        product5.setDescription("Product{id=0, name='Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}', description='Product{id=0, name='Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}', description='Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}', price=0.0, quantity=100}', price=0.0, quantity=-1}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=0, name='Product{id=10, name='hi!', description='', price=10.0, quantity=0}', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=0.0, quantity=-1}" + "'", str6, "Product{id=0, name='Product{id=10, name='hi!', description='', price=10.0, quantity=0}', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=0.0, quantity=-1}");
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setName("");
        java.lang.Long long11 = product5.getId();
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        java.lang.String str14 = product5.getDescription();
        product5.setQuantity((int) '#');
        java.lang.String str17 = product5.getDescription();
        product5.setPrice((java.lang.Double) 0.0d);
        java.util.List<java.lang.Double> doubleList20 = product5.getPriceHistory();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str14, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str17, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList20);
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}", "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}", (java.lang.Double) (-1.0d), (int) (short) 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.Class<?> wildcardClass8 = product5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "Product{id=100, name='hi!', description='', price=10.0, quantity=35}", "Product{id=-1, name='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', description='Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}', price=10.0, quantity=32}", (java.lang.Double) (-1.0d), (int) (byte) 0);
        product5.setQuantity(32);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", "hi!", (java.lang.Double) 100.0d, (int) '#');
        int int6 = product5.getQuantity();
        product5.setName("Product{id=100, name='', description='', price=10.0, quantity=0}");
        java.lang.String str9 = product5.getName();
        product5.setName("Product{id=-1, name='hi!', description='', price=0.0, quantity=100}");
        product5.setName("Product{id=-1, name='hi!', description='', price=0.0, quantity=100}");
        java.util.List<java.lang.Double> doubleList14 = product5.getPriceHistory();
        int int15 = product5.getQuantity();
        product5.setDescription("Product{id=0, name='hi!', description='', price=1.0, quantity=1}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str9, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        int int11 = product5.getQuantity();
        java.util.List<java.lang.Double> doubleList12 = product5.getPriceHistory();
        java.lang.String str13 = product5.toString();
        product5.setId((java.lang.Long) 1L);
        product5.setDescription("Product{id=-1, name='hi!', description='', price=-1.0, quantity=0}");
        java.lang.String str18 = product5.toString();
        java.lang.Double double19 = product5.getPrice();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(doubleList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}" + "'", str13, "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Product{id=1, name='hi!', description='Product{id=-1, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}" + "'", str18, "Product{id=1, name='hi!', description='Product{id=-1, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=100, name='hi!', description='', price=10.0, quantity=0}", "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", (java.lang.Double) 1.0d, 35);
        product5.setId((java.lang.Long) 1L);
        product5.setDescription("");
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        java.lang.String str11 = product5.getDescription();
        java.lang.Double double12 = product5.getPrice();
        product5.setDescription("Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        product5.setPrice((java.lang.Double) 10.0d);
        java.lang.String str17 = product5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Product{id=100, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=0}', price=10.0, quantity=0}" + "'", str17, "Product{id=100, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=0}', price=10.0, quantity=0}");
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        product5.addPriceToHistory((java.lang.Double) 1.0d);
        product5.setQuantity((int) (byte) 100);
        product5.setQuantity(52);
        org.junit.Assert.assertNotNull(doubleList6);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        java.lang.Long long9 = product5.getId();
        java.lang.String str10 = product5.getName();
        java.util.List<java.lang.Double> doubleList11 = product5.getPriceHistory();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(doubleList11);
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=100, name='Product{id=-1, name='hi!', description='', price=0.0, quantity=100}', description='hi!', price=100.0, quantity=35}", "Product{id=100, name='hi!', description='hi!', price=10.0, quantity=0}", (java.lang.Double) 0.0d, (int) (short) 1);
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=100, name='Product{id=100, name='hi!', description='', price=1.0, quantity=0}', description='Product{id=0, name='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=0}', price=10.0, quantity=-1}", "Product{id=1, name='Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}', description='Product{id=0, name='hi!', description='', price=100.0, quantity=0}', price=10.0, quantity=0}", (java.lang.Double) 10.0d, (int) (byte) 1);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.util.List<java.lang.Double> doubleList10 = product5.getPriceHistory();
        java.lang.Long long11 = product5.getId();
        product5.setPrice((java.lang.Double) 100.0d);
        java.lang.String str14 = product5.toString();
        java.lang.Long long15 = product5.getId();
        org.junit.Assert.assertNotNull(doubleList10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Product{id=0, name='hi!', description='', price=100.0, quantity=0}" + "'", str14, "Product{id=0, name='hi!', description='', price=100.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        java.lang.String str9 = product5.getDescription();
        product5.setId((java.lang.Long) 10L);
        java.lang.String str12 = product5.getName();
        product5.setDescription("Product{id=1, name='hi!', description='Product{id=-1, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}");
        int int15 = product5.getQuantity();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        product5.setQuantity((int) (short) 10);
        java.lang.String str9 = product5.toString();
        java.lang.Long long10 = product5.getId();
        java.lang.String str11 = product5.getDescription();
        product5.setDescription("");
        java.util.List<java.lang.Double> doubleList14 = product5.getPriceHistory();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setPrice((java.lang.Double) 10.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=10}" + "'", str9, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(doubleList14);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getName();
        product5.setDescription("hi!");
        product5.setId((java.lang.Long) 10L);
        java.lang.String str13 = product5.getDescription();
        java.lang.String str14 = product5.getName();
        java.lang.Double double15 = product5.getPrice();
        product5.setId((java.lang.Long) (-1L));
        product5.setName("Product{id=10, name='hi!', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=100, name='', description='', price=10.0, quantity=0}", "", (java.lang.Double) 100.0d, (int) ' ');
        java.lang.String str6 = product5.toString();
        product5.setId((java.lang.Long) (-1L));
        product5.setName("Product{id=-1, name='hi!', description='', price=0.0, quantity=100}");
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        product5.setName("Product{id=10, name='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=-1.0, quantity=35}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}" + "'", str6, "Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}");
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        java.lang.String str11 = product5.getDescription();
        java.lang.Double double12 = product5.getPrice();
        product5.setDescription("Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        product5.setDescription("Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        product5.setQuantity((int) (byte) 1);
        java.lang.String str19 = product5.getDescription();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str19, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setQuantity((int) (short) 1);
        java.lang.Double double10 = product5.getPrice();
        java.lang.String str11 = product5.getName();
        product5.setId((java.lang.Long) 0L);
        java.lang.Long long14 = product5.getId();
        java.util.List<java.lang.Double> doubleList15 = product5.getPriceHistory();
        product5.setDescription("Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}");
        java.lang.Long long18 = product5.getId();
        java.lang.Double double19 = product5.getPrice();
        product5.setName("Product{id=100, name='', description='', price=0.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(doubleList15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=100, name='hi!', description='', price=1.0, quantity=10}", "Product{id=0, name='hi!', description='', price=1.0, quantity=0}", (java.lang.Double) 0.0d, (int) (short) -1);
        java.lang.String str6 = product5.getName();
        java.lang.String str7 = product5.getName();
        java.util.List<java.lang.Double> doubleList8 = product5.getPriceHistory();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=10}" + "'", str6, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=10}" + "'", str7, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
        org.junit.Assert.assertNotNull(doubleList8);
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}", "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", (java.lang.Double) 100.0d, (int) '4');
        product5.setQuantity((int) (short) 10);
        product5.setQuantity((int) (byte) -1);
        product5.setQuantity((int) (byte) 100);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        int int8 = product5.getQuantity();
        product5.setDescription("hi!");
        java.util.List<java.lang.Double> doubleList11 = product5.getPriceHistory();
        java.lang.String str12 = product5.getName();
        java.lang.String str13 = product5.toString();
        product5.setPrice((java.lang.Double) 0.0d);
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        product5.setQuantity(0);
        java.lang.Double double20 = product5.getPrice();
        java.lang.String str21 = product5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}" + "'", str13, "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Product{id=100, name='hi!', description='hi!', price=0.0, quantity=0}" + "'", str21, "Product{id=100, name='hi!', description='hi!', price=0.0, quantity=0}");
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setName("");
        java.lang.String str14 = product5.toString();
        java.lang.Double double15 = product5.getPrice();
        java.lang.Double double16 = product5.getPrice();
        int int17 = product5.getQuantity();
        java.lang.Class<?> wildcardClass18 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str14, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setName("hi!");
        java.lang.String str8 = product5.getDescription();
        java.lang.String str9 = product5.getDescription();
        product5.setDescription("Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.String str7 = product5.toString();
        java.lang.Long long8 = product5.getId();
        java.lang.String str9 = product5.getDescription();
        java.lang.String str10 = product5.getDescription();
        product5.setQuantity(35);
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        product5.setDescription("Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        java.lang.Long long19 = product5.getId();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str7, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setId((java.lang.Long) 10L);
        product5.setName("");
        product5.setQuantity((int) (short) 10);
        product5.setName("Product{id=100, name='', description='', price=10.0, quantity=0}");
        java.lang.String str20 = product5.toString();
        java.lang.Class<?> wildcardClass21 = product5.getClass();
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}" + "'", str20, "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}", "Product{id=1, name='Product{id=-1, name='hi!', description='', price=0.0, quantity=100}', description='hi!', price=100.0, quantity=35}", (java.lang.Double) (-1.0d), (int) (short) 10);
        java.lang.String str6 = product5.getDescription();
        product5.setDescription("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=1, name='Product{id=-1, name='hi!', description='', price=0.0, quantity=100}', description='hi!', price=100.0, quantity=35}" + "'", str6, "Product{id=1, name='Product{id=-1, name='hi!', description='', price=0.0, quantity=100}', description='hi!', price=100.0, quantity=35}");
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        java.lang.String str9 = product5.getName();
        product5.setQuantity((int) (short) -1);
        int int12 = product5.getQuantity();
        java.lang.String str13 = product5.getDescription();
        product5.setDescription("Product{id=100, name='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', description='', price=1.0, quantity=0}");
        java.lang.String str16 = product5.getDescription();
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Product{id=100, name='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', description='', price=1.0, quantity=0}" + "'", str16, "Product{id=100, name='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', description='', price=1.0, quantity=0}");
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}", "Product{id=0, name='Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}', description='Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}', price=0.0, quantity=100}", (java.lang.Double) 0.0d, (int) (byte) -1);
        product5.setDescription("");
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        java.lang.String str11 = product5.getDescription();
        java.lang.Double double12 = product5.getPrice();
        product5.setDescription("Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        product5.setPrice((java.lang.Double) 10.0d);
        java.lang.Double double17 = product5.getPrice();
        product5.setName("Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}");
        java.lang.String str20 = product5.toString();
        java.lang.Class<?> wildcardClass21 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Product{id=100, name='Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}', description='Product{id=100, name='hi!', description='', price=1.0, quantity=0}', price=10.0, quantity=0}" + "'", str20, "Product{id=100, name='Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}', description='Product{id=100, name='hi!', description='', price=1.0, quantity=0}', price=10.0, quantity=0}");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=100, name='', description='', price=10.0, quantity=0}", "", (java.lang.Double) 100.0d, (int) ' ');
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        java.lang.Long long8 = product5.getId();
        java.util.List<java.lang.Double> doubleList9 = product5.getPriceHistory();
        java.lang.String str10 = product5.toString();
        java.lang.Long long11 = product5.getId();
        java.lang.Double double12 = product5.getPrice();
        java.lang.Class<?> wildcardClass13 = product5.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(doubleList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}" + "'", str10, "Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        int int11 = product5.getQuantity();
        java.util.List<java.lang.Double> doubleList12 = product5.getPriceHistory();
        java.lang.String str13 = product5.toString();
        product5.setId((java.lang.Long) 1L);
        product5.setDescription("Product{id=-1, name='hi!', description='', price=-1.0, quantity=0}");
        java.lang.String str18 = product5.toString();
        java.lang.Long long19 = product5.getId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(doubleList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}" + "'", str13, "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Product{id=1, name='hi!', description='Product{id=-1, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}" + "'", str18, "Product{id=1, name='hi!', description='Product{id=-1, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getName();
        product5.setDescription("hi!");
        product5.setId((java.lang.Long) 10L);
        product5.addPriceToHistory((java.lang.Double) 10.0d);
        product5.setName("Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}");
        java.lang.Long long17 = product5.getId();
        product5.setId((java.lang.Long) 10L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.util.List<java.lang.Double> doubleList10 = product5.getPriceHistory();
        java.lang.String str11 = product5.getName();
        java.lang.String str12 = product5.toString();
        product5.setId((java.lang.Long) 100L);
        product5.setName("Product{id=-1, name='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', description='Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}', price=10.0, quantity=32}");
        java.lang.Class<?> wildcardClass17 = product5.getClass();
        org.junit.Assert.assertNotNull(doubleList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str12, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        java.lang.String str9 = product5.getName();
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        java.lang.Double double12 = product5.getPrice();
        java.lang.Long long13 = product5.getId();
        int int14 = product5.getQuantity();
        java.lang.Double double15 = product5.getPrice();
        product5.setName("Product{id=0, name='Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}', description='Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}', price=0.0, quantity=100}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getDescription();
        product5.setId((java.lang.Long) 0L);
        java.lang.String str11 = product5.toString();
        product5.setDescription("Product{id=100, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=0.0, quantity=0}");
        product5.setDescription("Product{id=-1, name='hi!', description='', price=-1.0, quantity=0}");
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str11, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "", "", (java.lang.Double) (-1.0d), (int) (byte) 100);
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        product5.setDescription("Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}");
        java.lang.String str10 = product5.toString();
        product5.setDescription("Product{id=0, name='Product{id=10, name='hi!', description='', price=10.0, quantity=0}', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=0.0, quantity=-1}");
        java.lang.Double double13 = product5.getPrice();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Product{id=1, name='', description='Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}', price=-1.0, quantity=100}" + "'", str10, "Product{id=1, name='', description='Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}', price=-1.0, quantity=100}");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setName("");
        java.lang.String str14 = product5.toString();
        java.lang.Double double15 = product5.getPrice();
        java.lang.Double double16 = product5.getPrice();
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) 0.0d);
        int int21 = product5.getQuantity();
        java.lang.String str22 = product5.getName();
        java.lang.String str23 = product5.getName();
        java.lang.String str24 = product5.getDescription();
        java.lang.Double double25 = product5.getPrice();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str14, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setQuantity((int) '#');
        product5.setId((java.lang.Long) 100L);
        java.lang.Double double15 = product5.getPrice();
        java.util.List<java.lang.Double> doubleList16 = product5.getPriceHistory();
        product5.setPrice((java.lang.Double) (-1.0d));
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        java.lang.String str21 = product5.getDescription();
        int int22 = product5.getQuantity();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(doubleList16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getName();
        product5.setDescription("hi!");
        product5.setPrice((java.lang.Double) 1.0d);
        java.lang.String str13 = product5.getName();
        int int14 = product5.getQuantity();
        product5.setId((java.lang.Long) 0L);
        java.util.List<java.lang.Double> doubleList17 = product5.getPriceHistory();
        java.lang.Class<?> wildcardClass18 = doubleList17.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(doubleList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "Product{id=100, name='hi!', description='', price=0.0, quantity=100}", "", (java.lang.Double) 0.0d, (int) ' ');
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getDescription();
        product5.setId((java.lang.Long) 0L);
        int int11 = product5.getQuantity();
        int int12 = product5.getQuantity();
        java.util.List<java.lang.Double> doubleList13 = product5.getPriceHistory();
        product5.setPrice((java.lang.Double) 1.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(doubleList13);
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setName("");
        java.lang.String str14 = product5.toString();
        java.lang.Double double15 = product5.getPrice();
        java.lang.String str16 = product5.toString();
        product5.setDescription("Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}");
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        java.lang.String str21 = product5.toString();
        java.lang.String str22 = product5.getDescription();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str14, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str16, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Product{id=100, name='', description='Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}', price=10.0, quantity=0}" + "'", str21, "Product{id=100, name='', description='Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}', price=10.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}" + "'", str22, "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}");
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) (-1.0d));
        java.lang.String str12 = product5.getDescription();
        product5.setId((java.lang.Long) (-1L));
        java.lang.Double double15 = product5.getPrice();
        product5.setQuantity(52);
        product5.setName("");
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        java.lang.Double double22 = product5.getPrice();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.0d) + "'", double22 == (-1.0d));
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}", "Product{id=-1, name='hi!', description='', price=0.0, quantity=100}", (java.lang.Double) 0.0d, (int) 'a');
        product5.setQuantity((int) (byte) 1);
        java.lang.String str8 = product5.getName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str8, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}", "Product{id=1, name='hi!', description='Product{id=-1, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}", (java.lang.Double) 1.0d, 100);
        java.lang.Long long6 = product5.getId();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        int int8 = product5.getQuantity();
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        java.lang.String str11 = product5.toString();
        java.lang.Double double12 = product5.getPrice();
        int int13 = product5.getQuantity();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str11, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "", "", (java.lang.Double) 0.0d, (int) (byte) 100);
        product5.setQuantity((int) (short) -1);
        product5.setPrice((java.lang.Double) (-1.0d));
        product5.setQuantity((int) '#');
        product5.setName("Product{id=100, name='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', description='', price=-1.0, quantity=0}");
        product5.setDescription("Product{id=10, name='', description='', price=-1.0, quantity=-1}");
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "", "", (java.lang.Double) 0.0d, (int) (byte) 100);
        product5.setName("Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}");
        product5.setDescription("Product{id=10, name='', description='', price=0.0, quantity=-1}");
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        java.lang.String str10 = product5.getDescription();
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        product5.setDescription("Product{id=-1, name='hi!', description='', price=0.0, quantity=100}");
        java.util.List<java.lang.Double> doubleList15 = product5.getPriceHistory();
        product5.setDescription("Product{id=100, name='', description='', price=-1.0, quantity=10}");
        java.lang.Double double18 = product5.getPrice();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(doubleList15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        java.lang.Long long10 = product5.getId();
        product5.setQuantity((int) (short) 100);
        java.util.List<java.lang.Double> doubleList13 = product5.getPriceHistory();
        product5.addPriceToHistory((java.lang.Double) (-1.0d));
        java.lang.Long long16 = product5.getId();
        java.lang.String str17 = product5.getName();
        java.lang.Double double18 = product5.getPrice();
        java.lang.String str19 = product5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertNotNull(doubleList13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=100}" + "'", str19, "Product{id=100, name='hi!', description='', price=1.0, quantity=100}");
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setId((java.lang.Long) 10L);
        java.lang.Long long14 = product5.getId();
        product5.setName("Product{id=100, name='hi!', description='', price=100.0, quantity=0}");
        java.lang.String str17 = product5.toString();
        java.lang.String str18 = product5.getDescription();
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Product{id=10, name='Product{id=100, name='hi!', description='', price=100.0, quantity=0}', description='', price=10.0, quantity=0}" + "'", str17, "Product{id=10, name='Product{id=100, name='hi!', description='', price=100.0, quantity=0}', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        int int8 = product5.getQuantity();
        product5.setDescription("hi!");
        product5.setDescription("Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        product5.setId((java.lang.Long) 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setName("");
        java.lang.String str14 = product5.toString();
        java.lang.Double double15 = product5.getPrice();
        java.lang.String str16 = product5.toString();
        product5.setQuantity((int) (short) -1);
        java.util.List<java.lang.Double> doubleList19 = product5.getPriceHistory();
        product5.setName("Product{id=100, name='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', description='', price=1.0, quantity=0}");
        product5.setPrice((java.lang.Double) 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str14, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str16, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList19);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.String str12 = product5.getDescription();
        product5.addPriceToHistory((java.lang.Double) (-1.0d));
        product5.setDescription("Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
        int int17 = product5.getQuantity();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=100, name='Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}', description='Product{id=1, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=100}", "Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}", (java.lang.Double) 10.0d, (int) (byte) 100);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setQuantity((int) '#');
        product5.setName("hi!");
        java.lang.Double double15 = product5.getPrice();
        java.lang.Class<?> wildcardClass16 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }
}

