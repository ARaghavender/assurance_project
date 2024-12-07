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
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}", "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}", (java.lang.Double) 10.0d, 100);
        java.lang.String str6 = product5.getName();
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        java.lang.Class<?> wildcardClass9 = product5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}" + "'", str6, "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=100, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=0}', price=10.0, quantity=-1}", "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=52}", (java.lang.Double) 0.0d, 10);
        java.lang.Long long6 = product5.getId();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=100, name='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', description='', price=1.0, quantity=0}", "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}", (java.lang.Double) 1.0d, (int) (byte) 10);
        java.lang.Long long6 = product5.getId();
        java.lang.String str7 = product5.getDescription();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}" + "'", str7, "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}");
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        java.lang.String str10 = product5.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Product{id=0, name='hi!', description='', price=100.0, quantity=0}" + "'", str10, "Product{id=0, name='hi!', description='', price=100.0, quantity=0}");
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setQuantity((int) (short) 1);
        java.lang.Double double10 = product5.getPrice();
        java.lang.String str11 = product5.getName();
        product5.setId((java.lang.Long) 0L);
        java.lang.Long long14 = product5.getId();
        java.util.List<java.lang.Double> doubleList15 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 0L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(doubleList15);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setName("");
        java.lang.Long long11 = product5.getId();
        product5.setQuantity(35);
        java.util.List<java.lang.Double> doubleList14 = product5.getPriceHistory();
        java.lang.String str15 = product5.getName();
        product5.setId((java.lang.Long) (-1L));
        product5.setPrice((java.lang.Double) 100.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertNotNull(doubleList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "", "", (java.lang.Double) (-1.0d), (int) (byte) 100);
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        java.lang.Double double8 = product5.getPrice();
        product5.setId((java.lang.Long) 100L);
        java.lang.Long long11 = product5.getId();
        int int12 = product5.getQuantity();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}", "Product{id=10, name='hi!', description='', price=10.0, quantity=0}", (java.lang.Double) 100.0d, (int) (short) 100);
        java.lang.String str6 = product5.getDescription();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=10, name='hi!', description='', price=10.0, quantity=0}" + "'", str6, "Product{id=10, name='hi!', description='', price=10.0, quantity=0}");
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setQuantity((int) '#');
        product5.setDescription("");
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        product5.setName("Product{id=100, name='hi!', description='', price=10.0, quantity=0}");
        java.lang.String str19 = product5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Product{id=100, name='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=10.0, quantity=35}" + "'", str19, "Product{id=100, name='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=10.0, quantity=35}");
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}", "Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}", (java.lang.Double) 0.0d, 100);
        java.lang.Class<?> wildcardClass6 = product5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        product5.setQuantity((int) (short) 10);
        java.lang.String str9 = product5.toString();
        java.lang.Long long10 = product5.getId();
        product5.setDescription("");
        product5.setId((java.lang.Long) 10L);
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        product5.setName("Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}");
        java.util.List<java.lang.Double> doubleList19 = product5.getPriceHistory();
        java.lang.String str20 = product5.getDescription();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=10}" + "'", str9, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertNotNull(doubleList19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.util.List<java.lang.Double> doubleList10 = product5.getPriceHistory();
        java.lang.String str11 = product5.getDescription();
        java.lang.String str12 = product5.getDescription();
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        org.junit.Assert.assertNotNull(doubleList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=-1, name='hi!', description='', price=-1.0, quantity=0}", "Product{id=-1, name='hi!', description='', price=-1.0, quantity=0}", (java.lang.Double) 1.0d, (int) 'a');
        product5.setPrice((java.lang.Double) 100.0d);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getName();
        product5.setDescription("hi!");
        product5.setId((java.lang.Long) 10L);
        java.util.List<java.lang.Double> doubleList13 = product5.getPriceHistory();
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        java.lang.String str16 = product5.getDescription();
        java.lang.Long long17 = product5.getId();
        java.lang.Long long18 = product5.getId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(doubleList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setQuantity((int) '#');
        product5.setId((java.lang.Long) 100L);
        int int15 = product5.getQuantity();
        product5.addPriceToHistory((java.lang.Double) 10.0d);
        java.lang.String str18 = product5.getDescription();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "Product{id=100, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=0.0, quantity=0}", "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}", (java.lang.Double) 0.0d, 0);
        java.lang.Long long6 = product5.getId();
        java.lang.String str7 = product5.toString();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=100, name='Product{id=100, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=0.0, quantity=0}', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=0.0, quantity=0}" + "'", str7, "Product{id=100, name='Product{id=100, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=0.0, quantity=0}', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=0.0, quantity=0}");
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.util.List<java.lang.Double> doubleList10 = product5.getPriceHistory();
        java.lang.String str11 = product5.getDescription();
        product5.addPriceToHistory((java.lang.Double) 10.0d);
        product5.setQuantity((int) (byte) 1);
        java.lang.String str16 = product5.getDescription();
        org.junit.Assert.assertNotNull(doubleList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", "hi!", (java.lang.Double) 100.0d, (int) '#');
        int int6 = product5.getQuantity();
        product5.setName("Product{id=100, name='', description='', price=10.0, quantity=0}");
        java.lang.String str9 = product5.getName();
        product5.setName("Product{id=-1, name='hi!', description='', price=0.0, quantity=100}");
        product5.setName("Product{id=-1, name='hi!', description='', price=0.0, quantity=100}");
        java.util.List<java.lang.Double> doubleList14 = product5.getPriceHistory();
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        product5.setId((java.lang.Long) 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str9, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList14);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
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
        java.lang.Long long18 = product5.getId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=0, name='hi!', description='', price=100.0, quantity=0}", "Product{id=0, name='', description='', price=1.0, quantity=-1}", (java.lang.Double) 1.0d, (int) (short) 0);
        int int6 = product5.getQuantity();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setName("Product{id=100, name='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', description='', price=10.0, quantity=0}");
        java.lang.Double double13 = product5.getPrice();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        java.lang.String str10 = product5.getDescription();
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        product5.setDescription("Product{id=-1, name='hi!', description='', price=0.0, quantity=100}");
        java.util.List<java.lang.Double> doubleList15 = product5.getPriceHistory();
        product5.setDescription("Product{id=0, name='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(doubleList15);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.util.List<java.lang.Double> doubleList7 = product5.getPriceHistory();
        product5.setQuantity((int) (short) 100);
        java.lang.Double double10 = product5.getPrice();
        java.lang.String str11 = product5.getName();
        java.lang.String str12 = product5.getDescription();
        product5.setId((java.lang.Long) 0L);
        product5.setName("Product{id=1, name='Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='hi!', price=100.0, quantity=35}', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=0.0, quantity=1}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(doubleList7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "Product{id=100, name='hi!', description='', price=10.0, quantity=0}", "", (java.lang.Double) 100.0d, (int) (short) 100);
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setName("Product{id=100, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=0.0, quantity=0}");
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=100, name='', description='', price=10.0, quantity=0}", "", (java.lang.Double) 100.0d, (int) ' ');
        java.lang.String str6 = product5.toString();
        product5.setName("Product{id=100, name='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', description='', price=-1.0, quantity=0}");
        java.lang.String str9 = product5.getDescription();
        product5.setDescription("Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=-1.0, quantity=100}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}" + "'", str6, "Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}", "Product{id=100, name='hi!', description='', price=1.0, quantity=10}", (java.lang.Double) (-1.0d), (int) (short) 100);
        java.lang.String str6 = product5.getName();
        java.util.List<java.lang.Double> doubleList7 = product5.getPriceHistory();
        product5.setName("hi!");
        java.lang.String str10 = product5.toString();
        java.lang.Long long11 = product5.getId();
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setDescription("Product{id=10, name='Product{id=100, name='hi!', description='', price=100.0, quantity=0}', description='', price=10.0, quantity=0}");
        java.lang.String str16 = product5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}" + "'", str6, "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=100}" + "'", str10, "Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=100}");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=100, name='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', description='', price=1.0, quantity=0}", "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}", (java.lang.Double) 1.0d, (int) (byte) 10);
        java.lang.String str6 = product5.getDescription();
        product5.setDescription("Product{id=0, name='hi!', description='', price=-1.0, quantity=0}");
        java.lang.String str9 = product5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}" + "'", str6, "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=0, name='Product{id=100, name='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', description='', price=1.0, quantity=0}', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=10}" + "'", str9, "Product{id=0, name='Product{id=100, name='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', description='', price=1.0, quantity=0}', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=10}");
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", "hi!", (java.lang.Double) 100.0d, (int) '#');
        int int6 = product5.getQuantity();
        product5.setName("Product{id=100, name='', description='', price=10.0, quantity=0}");
        product5.setId((java.lang.Long) 10L);
        product5.setPrice((java.lang.Double) 100.0d);
        int int13 = product5.getQuantity();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
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
        java.lang.String str19 = product5.toString();
        product5.setQuantity(10);
        java.lang.String str22 = product5.toString();
        java.lang.String str23 = product5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str14, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Product{id=100, name='', description='', price=-1.0, quantity=0}" + "'", str19, "Product{id=100, name='', description='', price=-1.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Product{id=100, name='', description='', price=-1.0, quantity=10}" + "'", str22, "Product{id=100, name='', description='', price=-1.0, quantity=10}");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Product{id=100, name='', description='', price=-1.0, quantity=10}" + "'", str23, "Product{id=100, name='', description='', price=-1.0, quantity=10}");
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getName();
        product5.setDescription("hi!");
        product5.setPrice((java.lang.Double) 1.0d);
        java.lang.String str13 = product5.getName();
        int int14 = product5.getQuantity();
        java.lang.String str15 = product5.toString();
        java.lang.String str16 = product5.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Product{id=0, name='hi!', description='hi!', price=1.0, quantity=0}" + "'", str15, "Product{id=0, name='hi!', description='hi!', price=1.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Product{id=0, name='hi!', description='hi!', price=1.0, quantity=0}" + "'", str16, "Product{id=0, name='hi!', description='hi!', price=1.0, quantity=0}");
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}", "Product{id=100, name='hi!', description='', price=1.0, quantity=10}", (java.lang.Double) 1.0d, (int) 'a');
        java.lang.Double double6 = product5.getPrice();
        product5.addPriceToHistory((java.lang.Double) (-1.0d));
        java.lang.Double double9 = product5.getPrice();
        java.lang.Long long10 = product5.getId();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=10, name='', description='', price=0.0, quantity=-1}", "Product{id=100, name='hi!', description='', price=-1.0, quantity=0}", (java.lang.Double) 0.0d, (int) (byte) 10);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.String str7 = product5.toString();
        java.lang.Long long8 = product5.getId();
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.Double double11 = product5.getPrice();
        java.lang.String str12 = product5.getDescription();
        java.lang.String str13 = product5.getDescription();
        java.lang.String str14 = product5.getName();
        product5.addPriceToHistory((java.lang.Double) (-1.0d));
        product5.setPrice((java.lang.Double) 0.0d);
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str7, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
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
        product5.setQuantity(32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "Product{id=100, name='', description='', price=10.0, quantity=0}", "Product{id=0, name='hi!', description='', price=1.0, quantity=0}", (java.lang.Double) 0.0d, (int) (short) -1);
        product5.addPriceToHistory((java.lang.Double) 10.0d);
        java.util.List<java.lang.Double> doubleList8 = product5.getPriceHistory();
        java.util.List<java.lang.Double> doubleList9 = product5.getPriceHistory();
        org.junit.Assert.assertNotNull(doubleList8);
        org.junit.Assert.assertNotNull(doubleList9);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getName();
        product5.setDescription("hi!");
        product5.setPrice((java.lang.Double) 1.0d);
        java.lang.String str13 = product5.getName();
        int int14 = product5.getQuantity();
        java.lang.String str15 = product5.toString();
        product5.addPriceToHistory((java.lang.Double) (-1.0d));
        product5.setQuantity((int) (byte) 100);
        java.util.List<java.lang.Double> doubleList20 = product5.getPriceHistory();
        java.lang.String str21 = product5.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Product{id=0, name='hi!', description='hi!', price=1.0, quantity=0}" + "'", str15, "Product{id=0, name='hi!', description='hi!', price=1.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Product{id=0, name='hi!', description='hi!', price=1.0, quantity=100}" + "'", str21, "Product{id=0, name='hi!', description='hi!', price=1.0, quantity=100}");
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
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
        java.lang.String str19 = product5.getDescription();
        product5.setQuantity((int) (byte) 0);
        java.lang.String str22 = product5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Product{id=100, name='hi!', description='', price=10.0, quantity=0}" + "'", str22, "Product{id=100, name='hi!', description='', price=10.0, quantity=0}");
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) 10.0d);
        java.lang.String str12 = product5.getDescription();
        product5.setPrice((java.lang.Double) 0.0d);
        product5.addPriceToHistory((java.lang.Double) 10.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        java.lang.String str9 = product5.getDescription();
        product5.setDescription("Product{id=10, name='Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}', description='', price=0.0, quantity=100}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.Double double8 = product5.getPrice();
        product5.setId((java.lang.Long) (-1L));
        java.lang.String str11 = product5.getName();
        product5.setQuantity((int) (byte) -1);
        java.util.List<java.lang.Double> doubleList14 = product5.getPriceHistory();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(doubleList14);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}", "Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=1.0, quantity=1}", (java.lang.Double) 10.0d, (int) (short) 0);
        product5.setPrice((java.lang.Double) (-1.0d));
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setName("");
        java.lang.Long long11 = product5.getId();
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        java.lang.String str14 = product5.getDescription();
        java.lang.String str15 = product5.getDescription();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str14, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str15, "Product{id=100, name='', description='', price=10.0, quantity=0}");
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setName("");
        java.lang.Double double14 = product5.getPrice();
        product5.setQuantity((int) (byte) 0);
        java.util.List<java.lang.Double> doubleList17 = product5.getPriceHistory();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertNotNull(doubleList17);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}", "Product{id=0, name='hi!', description='', price=100.0, quantity=0}", (java.lang.Double) 10.0d, 0);
        java.lang.String str6 = product5.toString();
        java.lang.String str7 = product5.getDescription();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=1, name='Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}', description='Product{id=0, name='hi!', description='', price=100.0, quantity=0}', price=10.0, quantity=0}" + "'", str6, "Product{id=1, name='Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}', description='Product{id=0, name='hi!', description='', price=100.0, quantity=0}', price=10.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=0, name='hi!', description='', price=100.0, quantity=0}" + "'", str7, "Product{id=0, name='hi!', description='', price=100.0, quantity=0}");
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
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
        java.util.List<java.lang.Double> doubleList19 = product5.getPriceHistory();
        int int20 = product5.getQuantity();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(doubleList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}" + "'", str13, "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertNotNull(doubleList19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.Long long7 = product5.getId();
        int int8 = product5.getQuantity();
        product5.setName("Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}");
        java.lang.String str11 = product5.getDescription();
        product5.setId((java.lang.Long) 1L);
        java.util.List<java.lang.Double> doubleList14 = product5.getPriceHistory();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(doubleList14);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}", "", (java.lang.Double) 0.0d, (int) (short) 10);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        product5.setQuantity((int) (short) 10);
        java.lang.Double double9 = product5.getPrice();
        java.util.List<java.lang.Double> doubleList10 = product5.getPriceHistory();
        product5.setName("Product{id=100, name='Product{id=-1, name='hi!', description='', price=0.0, quantity=100}', description='hi!', price=100.0, quantity=35}");
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(doubleList10);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) (-1.0d), (int) (byte) 100);
        product5.setPrice((java.lang.Double) 1.0d);
        product5.setPrice((java.lang.Double) 1.0d);
        java.lang.String str10 = product5.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=100}" + "'", str10, "Product{id=100, name='hi!', description='', price=1.0, quantity=100}");
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        int int8 = product5.getQuantity();
        product5.setDescription("hi!");
        java.util.List<java.lang.Double> doubleList11 = product5.getPriceHistory();
        java.lang.String str12 = product5.getName();
        product5.setDescription("");
        product5.setDescription("Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=100}");
        java.lang.Double double17 = product5.getPrice();
        java.lang.Long long18 = product5.getId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setQuantity((int) (short) 1);
        product5.setQuantity((int) (short) 100);
        java.lang.Double double12 = product5.getPrice();
        product5.setId((java.lang.Long) 100L);
        java.util.List<java.lang.Double> doubleList15 = product5.getPriceHistory();
        product5.setQuantity(52);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertNotNull(doubleList15);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.String str13 = product5.getDescription();
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        int int16 = product5.getQuantity();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        int int8 = product5.getQuantity();
        product5.setDescription("hi!");
        java.util.List<java.lang.Double> doubleList11 = product5.getPriceHistory();
        java.lang.String str12 = product5.getName();
        java.lang.String str13 = product5.toString();
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.String str16 = product5.getName();
        product5.addPriceToHistory((java.lang.Double) 1.0d);
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        product5.setDescription("Product{id=1, name='Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='hi!', price=100.0, quantity=35}', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=0.0, quantity=1}");
        product5.setId((java.lang.Long) (-1L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}" + "'", str13, "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        java.lang.String str10 = product5.getDescription();
        java.lang.Double double11 = product5.getPrice();
        java.lang.Double double12 = product5.getPrice();
        product5.addPriceToHistory((java.lang.Double) 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        int int8 = product5.getQuantity();
        product5.setDescription("hi!");
        java.util.List<java.lang.Double> doubleList11 = product5.getPriceHistory();
        java.lang.String str12 = product5.getName();
        java.lang.String str13 = product5.toString();
        product5.setPrice((java.lang.Double) 0.0d);
        product5.setId((java.lang.Long) 10L);
        java.lang.Class<?> wildcardClass18 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}" + "'", str13, "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
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
        java.lang.String str19 = product5.getDescription();
        product5.setPrice((java.lang.Double) 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "Product{id=0, name='hi!', description='', price=1.0, quantity=32}", "Product{id=100, name='Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=100}', description='', price=1.0, quantity=-1}", (java.lang.Double) 100.0d, (int) 'a');
        product5.setId((java.lang.Long) (-1L));
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}", "Product{id=0, name='Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}', description='Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}', price=0.0, quantity=100}", (java.lang.Double) 0.0d, (int) (byte) -1);
        java.lang.String str6 = product5.getDescription();
        product5.addPriceToHistory((java.lang.Double) 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=0, name='Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}', description='Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}', price=0.0, quantity=100}" + "'", str6, "Product{id=0, name='Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}', description='Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}', price=0.0, quantity=100}");
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        java.lang.String str9 = product5.getDescription();
        java.lang.String str10 = product5.getName();
        java.lang.Double double11 = product5.getPrice();
        product5.setName("Product{id=10, name='Product{id=100, name='hi!', description='', price=100.0, quantity=0}', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getName();
        product5.setDescription("hi!");
        product5.setId((java.lang.Long) 10L);
        java.lang.String str13 = product5.getDescription();
        java.lang.String str14 = product5.getName();
        java.lang.String str15 = product5.toString();
        java.lang.Double double16 = product5.getPrice();
        product5.setQuantity(35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}" + "'", str15, "Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) (-1.0d));
        java.lang.String str12 = product5.getDescription();
        product5.setId((java.lang.Long) (-1L));
        product5.setId((java.lang.Long) (-1L));
        product5.addPriceToHistory((java.lang.Double) (-1.0d));
        java.util.List<java.lang.Double> doubleList19 = product5.getPriceHistory();
        product5.setName("Product{id=100, name='hi!', description='hi!', price=10.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(doubleList19);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
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
        product5.setDescription("Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}");
        product5.addPriceToHistory((java.lang.Double) 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(doubleList16);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        java.lang.String str10 = product5.getDescription();
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        java.lang.Double double13 = product5.getPrice();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setQuantity(32);
        java.lang.String str18 = product5.getName();
        java.util.List<java.lang.Double> doubleList19 = product5.getPriceHistory();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(doubleList19);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setQuantity((int) '#');
        product5.setDescription("");
        int int15 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 1.0d);
        product5.setId((java.lang.Long) 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.lang.String str6 = product5.getName();
        product5.addPriceToHistory((java.lang.Double) (-1.0d));
        java.lang.String str9 = product5.getName();
        java.lang.String str10 = product5.getDescription();
        product5.setName("Product{id=0, name='Product{id=100, name='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', description='', price=1.0, quantity=0}', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=10}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
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
        java.lang.Double double24 = product5.getPrice();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str14, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str16, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 100.0d + "'", double24 == 100.0d);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=0, name='hi!', description='Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}', price=0.0, quantity=0}", "Product{id=100, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}", (java.lang.Double) 0.0d, (int) '4');
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setQuantity((int) '#');
        product5.setName("hi!");
        java.lang.Double double15 = product5.getPrice();
        java.lang.String str16 = product5.getName();
        product5.setName("Product{id=-1, name='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=-1.0, quantity=35}");
        java.lang.Double double19 = product5.getPrice();
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) (-1.0d));
        java.lang.String str12 = product5.getDescription();
        java.lang.Long long13 = product5.getId();
        java.lang.String str14 = product5.toString();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}" + "'", str14, "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}");
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        java.lang.String str11 = product5.getDescription();
        java.lang.Double double12 = product5.getPrice();
        product5.setDescription("Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        product5.setId((java.lang.Long) (-1L));
        java.lang.String str17 = product5.getDescription();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str17, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
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
        product5.setPrice((java.lang.Double) 0.0d);
        product5.addPriceToHistory((java.lang.Double) (-1.0d));
        product5.setName("Product{id=100, name='', description='', price=-1.0, quantity=0}");
        int int26 = product5.getQuantity();
        java.lang.String str27 = product5.getDescription();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str14, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str16, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}", "Product{id=1, name='', description='Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}', price=-1.0, quantity=0}", (java.lang.Double) 100.0d, (-1));
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "Product{id=1, name='', description='Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}', price=-1.0, quantity=0}", "", (java.lang.Double) 10.0d, 97);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.String str11 = product5.getDescription();
        int int12 = product5.getQuantity();
        product5.setId((java.lang.Long) (-1L));
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setQuantity((int) (short) 1);
        java.lang.Double double10 = product5.getPrice();
        java.lang.String str11 = product5.getName();
        product5.setId((java.lang.Long) 0L);
        product5.setDescription("");
        java.lang.Long long16 = product5.getId();
        product5.setId((java.lang.Long) 0L);
        java.lang.String str19 = product5.toString();
        java.lang.String str20 = product5.getName();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=1}" + "'", str19, "Product{id=0, name='hi!', description='', price=1.0, quantity=1}");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        int int8 = product5.getQuantity();
        java.util.List<java.lang.Double> doubleList9 = product5.getPriceHistory();
        product5.setPrice((java.lang.Double) 0.0d);
        product5.setId((java.lang.Long) 100L);
        product5.setPrice((java.lang.Double) 0.0d);
        int int16 = product5.getQuantity();
        product5.addPriceToHistory((java.lang.Double) (-1.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleList9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "Product{id=100, name='', description='', price=10.0, quantity=0}", "Product{id=0, name='Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}', description='Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}', price=0.0, quantity=100}", (java.lang.Double) 0.0d, (int) (short) 100);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        java.lang.String str10 = product5.getDescription();
        java.lang.Long long11 = product5.getId();
        java.util.List<java.lang.Double> doubleList12 = product5.getPriceHistory();
        java.lang.String str13 = product5.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(doubleList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
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
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.String str31 = product5.getName();
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}" + "'", str20, "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str27, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList28);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str31, "Product{id=100, name='', description='', price=10.0, quantity=0}");
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "Product{id=0, name='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=0}", "Product{id=0, name='hi!', description='', price=100.0, quantity=100}", (java.lang.Double) 100.0d, 32);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 0L);
        java.lang.String str9 = product5.getDescription();
        java.lang.Double double10 = product5.getPrice();
        java.lang.String str11 = product5.toString();
        product5.setPrice((java.lang.Double) 10.0d);
        java.lang.Double double14 = product5.getPrice();
        java.lang.String str15 = product5.toString();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str11, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Product{id=0, name='hi!', description='', price=10.0, quantity=0}" + "'", str15, "Product{id=0, name='hi!', description='', price=10.0, quantity=0}");
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", "Product{id=100, name='Product{id=100, name='hi!', description='', price=1.0, quantity=0}', description='Product{id=0, name='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=0}', price=10.0, quantity=-1}", (java.lang.Double) 0.0d, (int) (short) -1);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.util.List<java.lang.Double> doubleList10 = product5.getPriceHistory();
        java.lang.Long long11 = product5.getId();
        product5.setName("Product{id=100, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=0.0, quantity=0}");
        product5.addPriceToHistory((java.lang.Double) 10.0d);
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        org.junit.Assert.assertNotNull(doubleList10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 0L);
        java.lang.String str9 = product5.getDescription();
        java.lang.Double double10 = product5.getPrice();
        product5.setPrice((java.lang.Double) 1.0d);
        java.lang.Double double13 = product5.getPrice();
        java.lang.String str14 = product5.getDescription();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        java.lang.String str9 = product5.getName();
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        java.lang.Double double12 = product5.getPrice();
        java.lang.Long long13 = product5.getId();
        product5.setQuantity((-1));
        product5.setQuantity(32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        int int8 = product5.getQuantity();
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        product5.setId((java.lang.Long) 10L);
        int int13 = product5.getQuantity();
        java.lang.Double double14 = product5.getPrice();
        java.lang.Long long15 = product5.getId();
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.lang.String str10 = product5.getName();
        java.lang.String str11 = product5.toString();
        product5.setQuantity((int) (short) 100);
        java.lang.String str14 = product5.getDescription();
        java.lang.String str15 = product5.getName();
        product5.setName("Product{id=10, name='hi!', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str11, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "Product{id=100, name='Product{id=100, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=0.0, quantity=0}', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=0.0, quantity=0}", "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}", (java.lang.Double) 1.0d, 1);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.util.List<java.lang.Double> doubleList7 = product5.getPriceHistory();
        java.lang.String str8 = product5.getName();
        product5.setPrice((java.lang.Double) 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(doubleList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.Long long7 = product5.getId();
        int int8 = product5.getQuantity();
        java.lang.String str9 = product5.getDescription();
        int int10 = product5.getQuantity();
        java.lang.Long long11 = product5.getId();
        java.lang.Double double12 = product5.getPrice();
        product5.setId((java.lang.Long) 100L);
        product5.addPriceToHistory((java.lang.Double) 10.0d);
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.util.List<java.lang.Double> doubleList10 = product5.getPriceHistory();
        java.lang.String str11 = product5.getName();
        java.lang.String str12 = product5.toString();
        java.lang.String str13 = product5.toString();
        java.lang.String str14 = product5.getDescription();
        product5.setPrice((java.lang.Double) (-1.0d));
        java.lang.String str17 = product5.getName();
        org.junit.Assert.assertNotNull(doubleList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str12, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str13, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        java.lang.Long long10 = product5.getId();
        product5.setQuantity((int) (short) 100);
        java.util.List<java.lang.Double> doubleList13 = product5.getPriceHistory();
        product5.addPriceToHistory((java.lang.Double) (-1.0d));
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        int int18 = product5.getQuantity();
        java.lang.String str19 = product5.getName();
        product5.addPriceToHistory((java.lang.Double) 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertNotNull(doubleList13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) (-1.0d), (int) (byte) 100);
        java.lang.String str6 = product5.getName();
        java.lang.String str7 = product5.getName();
        java.lang.String str8 = product5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Product{id=100, name='hi!', description='', price=-1.0, quantity=100}" + "'", str8, "Product{id=100, name='hi!', description='', price=-1.0, quantity=100}");
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=100, name='hi!', description='', price=0.0, quantity=0}", "Product{id=10, name='Product{id=100, name='hi!', description='', price=100.0, quantity=0}', description='', price=10.0, quantity=0}", (java.lang.Double) 1.0d, 0);
        java.lang.String str6 = product5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=100, name='hi!', description='', price=0.0, quantity=0}" + "'", str6, "Product{id=100, name='hi!', description='', price=0.0, quantity=0}");
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", "hi!", (java.lang.Double) 100.0d, (int) '#');
        int int6 = product5.getQuantity();
        product5.setName("Product{id=100, name='', description='', price=10.0, quantity=0}");
        java.lang.String str9 = product5.getName();
        product5.setName("Product{id=1, name='', description='', price=-1.0, quantity=100}");
        product5.setDescription("Product{id=100, name='hi!', description='', price=-1.0, quantity=52}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str9, "Product{id=100, name='', description='', price=10.0, quantity=0}");
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=0, name='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=0}", "Product{id=100, name='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', description='', price=-1.0, quantity=0}", (java.lang.Double) 100.0d, (int) '#');
        product5.setPrice((java.lang.Double) 0.0d);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 0L);
        java.lang.String str9 = product5.getDescription();
        product5.setDescription("Product{id=100, name='hi!', description='', price=10.0, quantity=0}");
        java.lang.Long long12 = product5.getId();
        product5.setDescription("Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}");
        java.lang.String str15 = product5.getName();
        int int16 = product5.getQuantity();
        product5.setName("Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=10.0, quantity=0}', price=1.0, quantity=35}");
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) (-1.0d));
        java.lang.String str12 = product5.getDescription();
        product5.setName("Product{id=0, name='hi!', description='', price=0.0, quantity=0}");
        product5.setName("Product{id=100, name='hi!', description='', price=10.0, quantity=0}");
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setQuantity((int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        java.lang.String str9 = product5.getDescription();
        product5.setName("Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}");
        product5.setName("Product{id=100, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}");
        java.lang.Double double14 = product5.getPrice();
        java.lang.String str15 = product5.getName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Product{id=100, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}" + "'", str15, "Product{id=100, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}");
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "Product{id=0, name='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=0}", "Product{id=-1, name='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=-1.0, quantity=35}", (java.lang.Double) 100.0d, (int) (short) 100);
        product5.setDescription("Product{id=100, name='hi!', description='', price=1.0, quantity=35}");
        java.lang.Class<?> wildcardClass8 = product5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.String str7 = product5.toString();
        product5.setId((java.lang.Long) 100L);
        java.lang.Long long10 = product5.getId();
        java.lang.Double double11 = product5.getPrice();
        int int12 = product5.getQuantity();
        product5.setId((java.lang.Long) 0L);
        java.lang.String str15 = product5.getDescription();
        java.lang.String str16 = product5.getDescription();
        product5.setId((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str7, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
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
        java.lang.Long long22 = product5.getId();
        product5.addPriceToHistory((java.lang.Double) 10.0d);
        product5.setName("Product{id=0, name='', description='', price=1.0, quantity=-1}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}" + "'", str13, "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        java.lang.Long long10 = product5.getId();
        product5.setQuantity(0);
        product5.setQuantity((int) (byte) -1);
        int int15 = product5.getQuantity();
        java.lang.Class<?> wildcardClass16 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
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
        product5.setName("Product{id=10, name='hi!', description='', price=10.0, quantity=0}");
        product5.setId((java.lang.Long) 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) (-1.0d), (int) (byte) 100);
        java.lang.String str6 = product5.getName();
        java.lang.String str7 = product5.getName();
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        java.lang.String str12 = product5.getDescription();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        product5.setName("");
        product5.addPriceToHistory((java.lang.Double) (-1.0d));
        java.lang.Double double12 = product5.getPrice();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=100, name='Product{id=100, name='hi!', description='', price=1.0, quantity=0}', description='Product{id=0, name='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=0}', price=10.0, quantity=-1}", "Product{id=10, name='Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}', description='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', price=10.0, quantity=100}", (java.lang.Double) 100.0d, (int) (short) 100);
        product5.setQuantity((int) (short) 10);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        java.lang.Long long8 = product5.getId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", "hi!", (java.lang.Double) 100.0d, (int) '#');
        product5.setQuantity(0);
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setPrice((java.lang.Double) (-1.0d));
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
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
        java.lang.String str22 = product5.toString();
        product5.setName("Product{id=100, name='hi!', description='hi!', price=10.0, quantity=0}");
        product5.setName("Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=-1.0, quantity=100}', price=-1.0, quantity=10}");
        java.lang.String str27 = product5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(doubleList16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Product{id=100, name='hi!', description='', price=-1.0, quantity=35}" + "'", str22, "Product{id=100, name='hi!', description='', price=-1.0, quantity=35}");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Product{id=100, name='Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=-1.0, quantity=100}', price=-1.0, quantity=10}', description='', price=-1.0, quantity=35}" + "'", str27, "Product{id=100, name='Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=-1.0, quantity=100}', price=-1.0, quantity=10}', description='', price=-1.0, quantity=35}");
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=100, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='', price=1.0, quantity=0}", "Product{id=100, name='', description='Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}', price=10.0, quantity=0}", (java.lang.Double) 0.0d, (int) (short) 0);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        product5.setName("hi!");
        java.lang.Double double10 = product5.getPrice();
        product5.setId((java.lang.Long) (-1L));
        int int13 = product5.getQuantity();
        product5.setId((java.lang.Long) 10L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
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
        product5.setName("Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}");
        product5.setName("");
        product5.setName("Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}" + "'", str13, "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}");
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        product5.setQuantity((int) (short) 10);
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=0, name='hi!', description='', price=1.0, quantity=0}", "Product{id=100, name='', description='', price=10.0, quantity=0}", (java.lang.Double) (-1.0d), (int) '#');
        product5.setQuantity((int) ' ');
        product5.setQuantity((int) 'a');
        java.util.List<java.lang.Double> doubleList10 = product5.getPriceHistory();
        org.junit.Assert.assertNotNull(doubleList10);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) (-1.0d), (int) (byte) 100);
        java.lang.String str6 = product5.getName();
        java.lang.String str7 = product5.getName();
        int int8 = product5.getQuantity();
        product5.setName("Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.Long long7 = product5.getId();
        int int8 = product5.getQuantity();
        java.lang.String str9 = product5.getDescription();
        int int10 = product5.getQuantity();
        java.lang.String str11 = product5.getDescription();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        java.lang.String str9 = product5.getDescription();
        product5.setId((java.lang.Long) 10L);
        java.lang.String str12 = product5.toString();
        int int13 = product5.getQuantity();
        int int14 = product5.getQuantity();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Product{id=10, name='hi!', description='', price=1.0, quantity=0}" + "'", str12, "Product{id=10, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=100, name='hi!', description='', price=-1.0, quantity=35}", "Product{id=100, name='Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=100}', description='', price=1.0, quantity=0}", (java.lang.Double) 1.0d, (int) (byte) 10);
        product5.setPrice((java.lang.Double) 0.0d);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) (-1.0d));
        java.lang.String str12 = product5.getDescription();
        java.lang.String str13 = product5.toString();
        java.lang.String str14 = product5.getDescription();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}" + "'", str13, "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setQuantity((int) '#');
        product5.setDescription("");
        int int15 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 1.0d);
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.String str7 = product5.toString();
        java.lang.Long long8 = product5.getId();
        java.lang.String str9 = product5.getDescription();
        java.lang.String str10 = product5.getDescription();
        java.lang.String str11 = product5.getDescription();
        java.lang.Double double12 = product5.getPrice();
        product5.setPrice((java.lang.Double) (-1.0d));
        product5.setDescription("Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='hi!', price=100.0, quantity=35}");
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str7, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "", "", (java.lang.Double) (-1.0d), (int) (byte) 100);
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        product5.setId((java.lang.Long) (-1L));
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", "hi!", (java.lang.Double) 100.0d, (int) '#');
        int int6 = product5.getQuantity();
        product5.setName("Product{id=100, name='', description='', price=10.0, quantity=0}");
        java.lang.Double double9 = product5.getPrice();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setName("Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}");
        java.lang.Double double14 = product5.getPrice();
        product5.addPriceToHistory((java.lang.Double) 10.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}", "Product{id=0, name='hi!', description='', price=1.0, quantity=0}", (java.lang.Double) (-1.0d), (int) (byte) 10);
        product5.setPrice((java.lang.Double) 1.0d);
        java.lang.String str8 = product5.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Product{id=-1, name='Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=1.0, quantity=10}" + "'", str8, "Product{id=-1, name='Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=1.0, quantity=10}");
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "", "", (java.lang.Double) (-1.0d), (int) (byte) 100);
        java.lang.String str6 = product5.toString();
        java.lang.String str7 = product5.getDescription();
        java.lang.Class<?> wildcardClass8 = product5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=1, name='', description='', price=-1.0, quantity=100}" + "'", str6, "Product{id=1, name='', description='', price=-1.0, quantity=100}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}", "Product{id=1, name='', description='Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}', price=-1.0, quantity=100}", (java.lang.Double) 0.0d, (int) (byte) 10);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "Product{id=100, name='Product{id=-1, name='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=-1.0, quantity=35}', description='', price=10.0, quantity=35}", "Product{id=0, name='Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}', description='Product{id=10, name='hi!', description='', price=10.0, quantity=0}', price=0.0, quantity=97}", (java.lang.Double) 100.0d, (int) 'a');
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.String str7 = product5.toString();
        java.lang.Long long8 = product5.getId();
        product5.setPrice((java.lang.Double) 0.0d);
        product5.setDescription("Product{id=0, name='hi!', description='', price=-1.0, quantity=0}");
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) 1.0d);
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str7, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        java.lang.String str9 = product5.getDescription();
        product5.setName("Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}");
        product5.setName("Product{id=100, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}");
        product5.addPriceToHistory((java.lang.Double) 10.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}", "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}", (java.lang.Double) 10.0d, (int) (short) 1);
        java.lang.Double double6 = product5.getPrice();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.String str7 = product5.toString();
        java.lang.Long long8 = product5.getId();
        java.lang.String str9 = product5.getDescription();
        java.lang.String str10 = product5.getDescription();
        java.lang.String str11 = product5.getDescription();
        product5.setId((java.lang.Long) 0L);
        product5.setDescription("Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}");
        product5.setQuantity((int) (short) 100);
        product5.setName("Product{id=0, name='hi!', description='hi!', price=1.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str7, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
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
        java.lang.String str18 = product5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(doubleList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str13, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Product{id=100, name='hi!', description='', price=10.0, quantity=0}" + "'", str17, "Product{id=100, name='hi!', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Product{id=100, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}" + "'", str18, "Product{id=100, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}");
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        product5.setName("hi!");
        java.lang.Double double10 = product5.getPrice();
        product5.setId((java.lang.Long) (-1L));
        java.lang.String str13 = product5.getName();
        java.lang.String str14 = product5.toString();
        product5.setDescription("Product{id=100, name='hi!', description='hi!', price=10.0, quantity=0}");
        product5.setQuantity((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Product{id=-1, name='hi!', description='', price=1.0, quantity=0}" + "'", str14, "Product{id=-1, name='hi!', description='', price=1.0, quantity=0}");
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "Product{id=100, name='hi!', description='', price=0.0, quantity=0}", "Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=-1.0, quantity=100}', price=-1.0, quantity=10}", (java.lang.Double) 0.0d, (int) (short) -1);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "", "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}", (java.lang.Double) (-1.0d), (int) (short) 100);
        java.lang.String str6 = product5.getName();
        product5.setQuantity(1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 0L);
        product5.addPriceToHistory((java.lang.Double) (-1.0d));
        java.lang.Double double11 = product5.getPrice();
        int int12 = product5.getQuantity();
        product5.setDescription("Product{id=1, name='Product{id=-1, name='hi!', description='', price=0.0, quantity=100}', description='hi!', price=100.0, quantity=35}");
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        int int8 = product5.getQuantity();
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        product5.setId((java.lang.Long) 10L);
        product5.setQuantity(0);
        java.lang.Long long15 = product5.getId();
        product5.setPrice((java.lang.Double) 10.0d);
        int int18 = product5.getQuantity();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setId((java.lang.Long) 100L);
        product5.setDescription("Product{id=-1, name='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', description='Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}', price=10.0, quantity=32}");
        product5.setDescription("Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}");
        java.lang.String str14 = product5.getName();
        java.util.List<java.lang.Double> doubleList15 = product5.getPriceHistory();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(doubleList15);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 0L);
        java.util.List<java.lang.Double> doubleList9 = product5.getPriceHistory();
        product5.setDescription("Product{id=100, name='Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}', description='Product{id=100, name='hi!', description='', price=1.0, quantity=0}', price=10.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertNotNull(doubleList9);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setQuantity((int) (short) 1);
        java.lang.Double double10 = product5.getPrice();
        java.lang.String str11 = product5.getName();
        product5.setId((java.lang.Long) 0L);
        product5.setDescription("");
        product5.setDescription("Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=52}");
        java.util.List<java.lang.Double> doubleList18 = product5.getPriceHistory();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(doubleList18);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setId((java.lang.Long) 10L);
        java.lang.Long long14 = product5.getId();
        java.lang.String str15 = product5.getDescription();
        java.lang.Double double16 = product5.getPrice();
        java.util.List<java.lang.Double> doubleList17 = product5.getPriceHistory();
        int int18 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 1.0d);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertNotNull(doubleList17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.Long long7 = product5.getId();
        java.lang.Long long8 = product5.getId();
        product5.setName("Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}");
        product5.setId((java.lang.Long) (-1L));
        int int13 = product5.getQuantity();
        java.lang.Long long14 = product5.getId();
        product5.setId((java.lang.Long) 100L);
        java.lang.Double double17 = product5.getPrice();
        java.lang.String str18 = product5.getName();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}" + "'", str18, "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}");
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=10, name='Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}', description='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', price=10.0, quantity=100}", "Product{id=100, name='hi!', description='', price=1.0, quantity=10}", (java.lang.Double) 10.0d, (int) (short) -1);
        java.lang.String str6 = product5.getDescription();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=10}" + "'", str6, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setQuantity((int) (short) 1);
        java.lang.String str10 = product5.getName();
        product5.setQuantity((int) (short) 0);
        java.lang.Double double13 = product5.getPrice();
        java.lang.String str14 = product5.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}", "Product{id=100, name='hi!', description='', price=1.0, quantity=10}", (java.lang.Double) (-1.0d), (int) (short) 100);
        java.lang.String str6 = product5.getName();
        java.util.List<java.lang.Double> doubleList7 = product5.getPriceHistory();
        product5.setName("hi!");
        java.lang.String str10 = product5.getDescription();
        java.lang.Long long11 = product5.getId();
        int int12 = product5.getQuantity();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}" + "'", str6, "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=10}" + "'", str10, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 0L);
        java.lang.String str9 = product5.getDescription();
        java.lang.Double double10 = product5.getPrice();
        java.lang.String str11 = product5.toString();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setName("Product{id=100, name='Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=100}', description='', price=1.0, quantity=-1}");
        java.lang.Long long16 = product5.getId();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str11, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}", "Product{id=100, name='hi!', description='', price=1.0, quantity=10}", (java.lang.Double) 0.0d, 100);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 0L);
        java.util.List<java.lang.Double> doubleList9 = product5.getPriceHistory();
        product5.setPrice((java.lang.Double) 100.0d);
        java.lang.String str12 = product5.toString();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertNotNull(doubleList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Product{id=0, name='hi!', description='', price=100.0, quantity=0}" + "'", str12, "Product{id=0, name='hi!', description='', price=100.0, quantity=0}");
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        product5.setDescription("Product{id=-1, name='hi!', description='', price=0.0, quantity=100}");
        product5.setPrice((java.lang.Double) 100.0d);
        java.lang.String str13 = product5.getDescription();
        java.util.List<java.lang.Double> doubleList14 = product5.getPriceHistory();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=-1, name='hi!', description='', price=0.0, quantity=100}" + "'", str13, "Product{id=-1, name='hi!', description='', price=0.0, quantity=100}");
        org.junit.Assert.assertNotNull(doubleList14);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        java.lang.String str10 = product5.getDescription();
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        java.lang.Double double13 = product5.getPrice();
        java.util.List<java.lang.Double> doubleList14 = product5.getPriceHistory();
        java.util.List<java.lang.Double> doubleList15 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 1L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(doubleList14);
        org.junit.Assert.assertNotNull(doubleList15);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.String str13 = product5.getDescription();
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        java.lang.Double double16 = product5.getPrice();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}", "Product{id=100, name='hi!', description='', price=1.0, quantity=10}", (java.lang.Double) (-1.0d), (int) (short) 100);
        java.lang.String str6 = product5.getName();
        java.util.List<java.lang.Double> doubleList7 = product5.getPriceHistory();
        product5.setName("hi!");
        java.lang.String str10 = product5.toString();
        java.lang.Double double11 = product5.getPrice();
        product5.setQuantity(35);
        java.lang.Double double14 = product5.getPrice();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}" + "'", str6, "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=100}" + "'", str10, "Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=100}");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        int int8 = product5.getQuantity();
        product5.setDescription("hi!");
        java.util.List<java.lang.Double> doubleList11 = product5.getPriceHistory();
        java.lang.String str12 = product5.getName();
        product5.setDescription("");
        product5.setDescription("Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=100}");
        java.lang.Double double17 = product5.getPrice();
        product5.setDescription("Product{id=-1, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=0.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "", "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}", (java.lang.Double) 10.0d, (int) (short) 1);
        java.lang.String str6 = product5.getDescription();
        product5.setQuantity((int) (byte) 100);
        product5.setDescription("Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}");
        int int11 = product5.getQuantity();
        product5.setName("Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}" + "'", str6, "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "", "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", (java.lang.Double) 0.0d, (int) 'a');
        java.lang.Long long6 = product5.getId();
        java.lang.Class<?> wildcardClass7 = product5.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        java.lang.Long long10 = product5.getId();
        product5.setQuantity(0);
        product5.setQuantity((int) (byte) -1);
        int int15 = product5.getQuantity();
        java.lang.String str16 = product5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=-1}" + "'", str16, "Product{id=100, name='hi!', description='', price=1.0, quantity=-1}");
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) (-1.0d));
        java.lang.String str12 = product5.getDescription();
        java.lang.Long long13 = product5.getId();
        int int14 = product5.getQuantity();
        product5.addPriceToHistory((java.lang.Double) (-1.0d));
        product5.setName("Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        java.lang.Long long19 = product5.getId();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "Product{id=100, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='', price=1.0, quantity=0}", "", (java.lang.Double) 0.0d, (int) 'a');
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setName("");
        java.lang.Double double14 = product5.getPrice();
        product5.setName("Product{id=1, name='', description='', price=-1.0, quantity=100}");
        java.lang.Double double17 = product5.getPrice();
        java.lang.String str18 = product5.getDescription();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "", "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}", (java.lang.Double) 0.0d, 0);
        java.lang.String str6 = product5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=-1, name='', description='Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}', price=0.0, quantity=0}" + "'", str6, "Product{id=-1, name='', description='Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}', price=0.0, quantity=0}");
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setQuantity((int) (short) 1);
        java.lang.String str10 = product5.getName();
        product5.setQuantity((int) (short) 0);
        product5.setName("Product{id=100, name='Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}', description='Product{id=100, name='hi!', description='', price=1.0, quantity=0}', price=10.0, quantity=0}");
        java.lang.Double double15 = product5.getPrice();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) (-1.0d));
        java.lang.String str12 = product5.getDescription();
        product5.setId((java.lang.Long) (-1L));
        product5.setId((java.lang.Long) (-1L));
        java.lang.String str17 = product5.toString();
        product5.setId((java.lang.Long) 0L);
        java.lang.String str20 = product5.toString();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Product{id=-1, name='hi!', description='', price=-1.0, quantity=0}" + "'", str17, "Product{id=-1, name='hi!', description='', price=-1.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}" + "'", str20, "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}");
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        product5.setQuantity((int) (short) 10);
        java.lang.String str9 = product5.toString();
        java.lang.Long long10 = product5.getId();
        product5.setDescription("");
        product5.setId((java.lang.Long) 10L);
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        java.lang.String str17 = product5.getDescription();
        java.util.List<java.lang.Double> doubleList18 = product5.getPriceHistory();
        int int19 = product5.getQuantity();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=10}" + "'", str9, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(doubleList18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
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
        java.lang.String str21 = product5.getName();
        product5.addPriceToHistory((java.lang.Double) (-1.0d));
        product5.setId((java.lang.Long) (-1L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        product5.setQuantity((int) (short) 10);
        java.lang.String str9 = product5.toString();
        java.lang.Long long10 = product5.getId();
        java.lang.String str11 = product5.getDescription();
        java.lang.String str12 = product5.getName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=10}" + "'", str9, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.util.List<java.lang.Double> doubleList10 = product5.getPriceHistory();
        java.util.List<java.lang.Double> doubleList11 = product5.getPriceHistory();
        product5.setPrice((java.lang.Double) 100.0d);
        java.lang.Long long14 = product5.getId();
        product5.setDescription("Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
        java.lang.Class<?> wildcardClass17 = product5.getClass();
        org.junit.Assert.assertNotNull(doubleList10);
        org.junit.Assert.assertNotNull(doubleList11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "Product{id=1, name='', description='Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}', price=-1.0, quantity=100}", "Product{id=-1, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='hi!', price=1.0, quantity=35}", (java.lang.Double) (-1.0d), 35);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getDescription();
        int int9 = product5.getQuantity();
        java.lang.String str10 = product5.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str10, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setQuantity((int) (short) 1);
        java.lang.Double double10 = product5.getPrice();
        java.lang.String str11 = product5.getName();
        product5.setId((java.lang.Long) 0L);
        java.lang.Long long14 = product5.getId();
        java.util.List<java.lang.Double> doubleList15 = product5.getPriceHistory();
        java.util.List<java.lang.Double> doubleList16 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 10L);
        java.lang.Double double19 = product5.getPrice();
        int int20 = product5.getQuantity();
        java.lang.String str21 = product5.getName();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(doubleList15);
        org.junit.Assert.assertNotNull(doubleList16);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=10, name='Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}', description='Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}', price=100.0, quantity=-1}", "Product{id=1, name='hi!', description='Product{id=-1, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}", (java.lang.Double) 1.0d, (int) (short) 0);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
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
        int int19 = product5.getQuantity();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertNotNull(doubleList13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setQuantity((int) '#');
        product5.setId((java.lang.Long) 100L);
        java.lang.String str15 = product5.getName();
        product5.setName("Product{id=1, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=100.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        product5.setName("hi!");
        java.lang.Double double10 = product5.getPrice();
        product5.setId((java.lang.Long) (-1L));
        product5.setPrice((java.lang.Double) 100.0d);
        java.lang.Double double15 = product5.getPrice();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.util.List<java.lang.Double> doubleList10 = product5.getPriceHistory();
        java.lang.String str11 = product5.getDescription();
        product5.addPriceToHistory((java.lang.Double) 10.0d);
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        org.junit.Assert.assertNotNull(doubleList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        int int11 = product5.getQuantity();
        java.lang.String str12 = product5.toString();
        product5.setId((java.lang.Long) 100L);
        java.util.List<java.lang.Double> doubleList15 = product5.getPriceHistory();
        int int16 = product5.getQuantity();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}" + "'", str12, "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setQuantity((int) '#');
        product5.setName("hi!");
        java.lang.Double double15 = product5.getPrice();
        product5.setQuantity(52);
        product5.setPrice((java.lang.Double) (-1.0d));
        java.lang.String str20 = product5.getName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getName();
        product5.setDescription("hi!");
        product5.setId((java.lang.Long) 10L);
        java.lang.String str13 = product5.getDescription();
        java.lang.String str14 = product5.getName();
        java.lang.String str15 = product5.toString();
        java.lang.Long long16 = product5.getId();
        product5.setDescription("Product{id=1, name='hi!', description='Product{id=-1, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}" + "'", str15, "Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=100, name='Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=100}', description='', price=1.0, quantity=0}", "Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}", (java.lang.Double) 10.0d, (int) (byte) -1);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getDescription();
        int int9 = product5.getQuantity();
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setId((java.lang.Long) 10L);
        product5.setName("");
        product5.setQuantity((int) (short) 10);
        product5.setName("Product{id=100, name='', description='', price=10.0, quantity=0}");
        java.lang.String str20 = product5.toString();
        java.lang.Double double21 = product5.getPrice();
        java.util.List<java.lang.Double> doubleList22 = product5.getPriceHistory();
        product5.setDescription("Product{id=100, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}" + "'", str20, "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertNotNull(doubleList22);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "Product{id=100, name='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', description='', price=1.0, quantity=0}", "Product{id=1, name='Product{id=100, name='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', description='', price=1.0, quantity=0}', description='Product{id=0, name='hi!', description='', price=0.0, quantity=0}', price=10.0, quantity=-1}", (java.lang.Double) 0.0d, (int) (short) 0);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.lang.Double double10 = product5.getPrice();
        product5.setPrice((java.lang.Double) 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.Long long7 = product5.getId();
        java.lang.Long long8 = product5.getId();
        product5.setName("Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}");
        product5.setId((java.lang.Long) (-1L));
        int int13 = product5.getQuantity();
        java.lang.Long long14 = product5.getId();
        product5.setId((java.lang.Long) 100L);
        java.lang.String str17 = product5.getDescription();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
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
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        java.lang.Double double20 = product5.getPrice();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertNotNull(doubleList13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        product5.setId((java.lang.Long) 1L);
        product5.setPrice((java.lang.Double) 1.0d);
        product5.setId((java.lang.Long) 1L);
        java.lang.String str16 = product5.getDescription();
        int int17 = product5.getQuantity();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) (-1.0d), (int) (byte) 100);
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        java.util.List<java.lang.Double> doubleList8 = product5.getPriceHistory();
        java.lang.String str9 = product5.getName();
        java.util.List<java.lang.Double> doubleList10 = product5.getPriceHistory();
        org.junit.Assert.assertNotNull(doubleList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(doubleList10);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.lang.String str10 = product5.getName();
        java.util.List<java.lang.Double> doubleList11 = product5.getPriceHistory();
        product5.setDescription("Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=-1.0, quantity=100}', price=-1.0, quantity=10}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(doubleList11);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 0.0d);
        product5.setName("Product{id=100, name='', description='', price=10.0, quantity=0}");
        java.util.List<java.lang.Double> doubleList14 = product5.getPriceHistory();
        product5.setQuantity(97);
        java.lang.Double double17 = product5.getPrice();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(doubleList14);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getDescription();
        java.lang.String str9 = product5.toString();
        java.lang.Double double10 = product5.getPrice();
        java.lang.String str11 = product5.getDescription();
        java.util.List<java.lang.Double> doubleList12 = product5.getPriceHistory();
        java.lang.Class<?> wildcardClass13 = product5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str9, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(doubleList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=100, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='', price=1.0, quantity=0}", "Product{id=-1, name='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', description='Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}', price=10.0, quantity=32}", (java.lang.Double) (-1.0d), (int) (byte) -1);
        product5.setPrice((java.lang.Double) 1.0d);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.util.List<java.lang.Double> doubleList7 = product5.getPriceHistory();
        java.lang.Double double8 = product5.getPrice();
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        java.lang.Class<?> wildcardClass11 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(doubleList7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=100, name='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', description='', price=10.0, quantity=0}", "Product{id=100, name='', description='Product{id=100, name='hi!', description='', price=1.0, quantity=0}', price=10.0, quantity=0}", (java.lang.Double) 10.0d, (int) (short) 0);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}", "Product{id=100, name='hi!', description='', price=1.0, quantity=10}", (java.lang.Double) (-1.0d), (int) (short) 100);
        java.lang.String str6 = product5.getName();
        java.util.List<java.lang.Double> doubleList7 = product5.getPriceHistory();
        product5.setName("hi!");
        int int10 = product5.getQuantity();
        java.lang.Long long11 = product5.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}" + "'", str6, "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getName();
        product5.setDescription("hi!");
        product5.setPrice((java.lang.Double) 1.0d);
        product5.setPrice((java.lang.Double) 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        int int8 = product5.getQuantity();
        product5.setDescription("hi!");
        java.util.List<java.lang.Double> doubleList11 = product5.getPriceHistory();
        java.lang.String str12 = product5.getName();
        java.lang.String str13 = product5.toString();
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.Double double16 = product5.getPrice();
        java.lang.Class<?> wildcardClass17 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}" + "'", str13, "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=100, name='hi!', description='', price=10.0, quantity=0}", "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}", (java.lang.Double) 10.0d, (int) ' ');
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        product5.setPrice((java.lang.Double) 1.0d);
        java.lang.Double double9 = product5.getPrice();
        product5.setId((java.lang.Long) 1L);
        product5.setPrice((java.lang.Double) 0.0d);
        java.util.List<java.lang.Double> doubleList14 = product5.getPriceHistory();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(doubleList14);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        product5.setName("");
        product5.addPriceToHistory((java.lang.Double) (-1.0d));
        java.lang.Long long12 = product5.getId();
        product5.addPriceToHistory((java.lang.Double) (-1.0d));
        java.lang.String str15 = product5.getDescription();
        java.lang.String str16 = product5.toString();
        java.lang.String str17 = product5.getName();
        product5.setPrice((java.lang.Double) 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Product{id=100, name='', description='', price=1.0, quantity=0}" + "'", str16, "Product{id=100, name='', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        product5.setId((java.lang.Long) 1L);
        product5.setPrice((java.lang.Double) 1.0d);
        java.util.List<java.lang.Double> doubleList14 = product5.getPriceHistory();
        java.lang.String str15 = product5.getName();
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        java.lang.String str18 = product5.toString();
        java.util.List<java.lang.Double> doubleList19 = product5.getPriceHistory();
        product5.setName("Product{id=0, name='Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}', description='Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}', price=0.0, quantity=100}");
        org.junit.Assert.assertNotNull(doubleList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Product{id=1, name='hi!', description='', price=1.0, quantity=0}" + "'", str18, "Product{id=1, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList19);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}", "Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}", (java.lang.Double) 0.0d, 35);
        product5.setId((java.lang.Long) 100L);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.String str7 = product5.toString();
        java.lang.Long long8 = product5.getId();
        product5.setPrice((java.lang.Double) 0.0d);
        int int11 = product5.getQuantity();
        product5.setName("Product{id=0, name='hi!', description='', price=1.0, quantity=32}");
        product5.setDescription("Product{id=0, name='hi!', description='', price=100.0, quantity=100}");
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str7, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.lang.String str10 = product5.getName();
        java.util.List<java.lang.Double> doubleList11 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 0L);
        product5.setQuantity((int) (byte) 0);
        java.lang.Class<?> wildcardClass16 = product5.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(doubleList11);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=1, name='Product{id=-1, name='hi!', description='', price=0.0, quantity=100}', description='hi!', price=100.0, quantity=35}", "Product{id=100, name='', description='', price=0.0, quantity=0}", (java.lang.Double) 100.0d, 97);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.util.List<java.lang.Double> doubleList7 = product5.getPriceHistory();
        product5.setQuantity((int) (short) 100);
        java.lang.Double double10 = product5.getPrice();
        java.lang.String str11 = product5.getName();
        java.util.List<java.lang.Double> doubleList12 = product5.getPriceHistory();
        product5.setPrice((java.lang.Double) (-1.0d));
        product5.setPrice((java.lang.Double) 10.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(doubleList7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(doubleList12);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", "hi!", (java.lang.Double) 100.0d, (int) '#');
        int int6 = product5.getQuantity();
        product5.setName("Product{id=100, name='', description='', price=10.0, quantity=0}");
        java.lang.Long long9 = product5.getId();
        product5.setQuantity((int) 'a');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
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
        java.lang.String str23 = product5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Product{id=100, name='hi!', description='', price=10.0, quantity=0}" + "'", str21, "Product{id=100, name='hi!', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Product{id=100, name='hi!', description='', price=10.0, quantity=0}" + "'", str23, "Product{id=100, name='hi!', description='', price=10.0, quantity=0}");
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=100, name='hi!', description='', price=10.0, quantity=0}", "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", (java.lang.Double) 1.0d, 35);
        java.lang.String str6 = product5.getName();
        java.lang.Double double7 = product5.getPrice();
        java.util.List<java.lang.Double> doubleList8 = product5.getPriceHistory();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=100, name='hi!', description='', price=10.0, quantity=0}" + "'", str6, "Product{id=100, name='hi!', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(doubleList8);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        product5.setName("hi!");
        java.lang.Double double10 = product5.getPrice();
        product5.setId((java.lang.Long) (-1L));
        int int13 = product5.getQuantity();
        java.lang.Long long14 = product5.getId();
        product5.setPrice((java.lang.Double) (-1.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.util.List<java.lang.Double> doubleList10 = product5.getPriceHistory();
        java.lang.Double double11 = product5.getPrice();
        product5.setId((java.lang.Long) 0L);
        java.util.List<java.lang.Double> doubleList14 = product5.getPriceHistory();
        product5.addPriceToHistory((java.lang.Double) (-1.0d));
        java.lang.String str17 = product5.getName();
        java.lang.String str18 = product5.getDescription();
        product5.setDescription("Product{id=0, name='Product{id=100, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=0.0, quantity=0}', description='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', price=10.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(doubleList14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=10, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=10.0, quantity=35}", "Product{id=100, name='hi!', description='', price=-1.0, quantity=0}", (java.lang.Double) 1.0d, (int) (byte) 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=100, name='hi!', description='', price=-1.0, quantity=0}" + "'", str7, "Product{id=100, name='hi!', description='', price=-1.0, quantity=0}");
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        java.lang.String str11 = product5.getDescription();
        java.lang.String str12 = product5.toString();
        java.lang.Double double13 = product5.getPrice();
        java.lang.String str14 = product5.getName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Product{id=100, name='hi!', description='', price=10.0, quantity=0}" + "'", str12, "Product{id=100, name='hi!', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=100, name='hi!', description='', price=10.0, quantity=0}", "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}", (java.lang.Double) 10.0d, (int) ' ');
        java.lang.String str6 = product5.toString();
        java.lang.Class<?> wildcardClass7 = product5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=-1, name='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', description='Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}', price=10.0, quantity=32}" + "'", str6, "Product{id=-1, name='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', description='Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}', price=10.0, quantity=32}");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
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
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        int int22 = product5.getQuantity();
        product5.addPriceToHistory((java.lang.Double) 1.0d);
        product5.setPrice((java.lang.Double) (-1.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}" + "'", str13, "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) (-1.0d), (int) (byte) 100);
        product5.setName("Product{id=-1, name='hi!', description='', price=0.0, quantity=100}");
        product5.addPriceToHistory((java.lang.Double) (-1.0d));
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setId((java.lang.Long) 10L);
        java.lang.Long long14 = product5.getId();
        java.lang.String str15 = product5.getName();
        product5.setId((java.lang.Long) (-1L));
        java.lang.Long long18 = product5.getId();
        java.lang.Double double19 = product5.getPrice();
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        int int8 = product5.getQuantity();
        product5.setDescription("hi!");
        java.util.List<java.lang.Double> doubleList11 = product5.getPriceHistory();
        java.lang.String str12 = product5.getName();
        product5.addPriceToHistory((java.lang.Double) 10.0d);
        product5.setQuantity((int) (short) 10);
        product5.setDescription("Product{id=0, name='Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}', description='Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}', price=0.0, quantity=100}");
        product5.setDescription("");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
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
        int int17 = product5.getQuantity();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str7, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", "hi!", (java.lang.Double) 100.0d, (int) '#');
        java.lang.Double double6 = product5.getPrice();
        int int7 = product5.getQuantity();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setDescription("Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}");
        java.lang.Long long14 = product5.getId();
        product5.setId((java.lang.Long) 10L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}", "Product{id=0, name='Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}', description='Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}', price=0.0, quantity=100}", (java.lang.Double) 0.0d, (int) (byte) -1);
        int int6 = product5.getQuantity();
        product5.setName("Product{id=0, name='Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}', description='Product{id=0, name='Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}', description='Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}', price=0.0, quantity=100}', price=0.0, quantity=-1}");
        java.lang.String str9 = product5.getDescription();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=0, name='Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}', description='Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}', price=0.0, quantity=100}" + "'", str9, "Product{id=0, name='Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}', description='Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}', price=0.0, quantity=100}");
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}", "Product{id=100, name='hi!', description='', price=1.0, quantity=10}", (java.lang.Double) 1.0d, (int) 'a');
        java.lang.Double double6 = product5.getPrice();
        product5.addPriceToHistory((java.lang.Double) (-1.0d));
        java.lang.String str9 = product5.getDescription();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=10}" + "'", str9, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}", "Product{id=1, name='hi!', description='', price=1.0, quantity=0}", (java.lang.Double) 0.0d, 100);
        java.lang.Long long6 = product5.getId();
        java.util.List<java.lang.Double> doubleList7 = product5.getPriceHistory();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(doubleList7);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setQuantity((int) (byte) 0);
        java.lang.String str11 = product5.toString();
        product5.setQuantity(100);
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        product5.setName("Product{id=100, name='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', description='', price=1.0, quantity=0}");
        java.util.List<java.lang.Double> doubleList18 = product5.getPriceHistory();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str11, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList18);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=100, name='', description='', price=-1.0, quantity=10}", "Product{id=0, name='Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}', description='Product{id=0, name='Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}', description='Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}', price=0.0, quantity=100}', price=0.0, quantity=-1}", (java.lang.Double) 1.0d, (int) (byte) 100);
        java.lang.Class<?> wildcardClass6 = product5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=100, name='', description='', price=10.0, quantity=0}", "", (java.lang.Double) 100.0d, (int) ' ');
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        java.lang.Long long8 = product5.getId();
        java.util.List<java.lang.Double> doubleList9 = product5.getPriceHistory();
        java.lang.String str10 = product5.toString();
        java.lang.Long long11 = product5.getId();
        product5.addPriceToHistory((java.lang.Double) (-1.0d));
        product5.setPrice((java.lang.Double) (-1.0d));
        product5.setPrice((java.lang.Double) 1.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(doubleList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}" + "'", str10, "Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getName();
        product5.setDescription("hi!");
        product5.setPrice((java.lang.Double) 1.0d);
        product5.setDescription("hi!");
        product5.setDescription("Product{id=100, name='hi!', description='', price=1.0, quantity=35}");
        java.lang.Long long17 = product5.getId();
        java.lang.Long long18 = product5.getId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getDescription();
        java.lang.String str9 = product5.toString();
        java.lang.String str10 = product5.getName();
        product5.addPriceToHistory((java.lang.Double) 1.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str9, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
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
        product5.setName("Product{id=0, name='hi!', description='Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}', price=0.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(doubleList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
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
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        product5.setId((java.lang.Long) 0L);
        java.lang.Class<?> wildcardClass25 = product5.getClass();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        java.lang.String str9 = product5.getDescription();
        product5.setId((java.lang.Long) 10L);
        java.lang.String str12 = product5.toString();
        int int13 = product5.getQuantity();
        product5.setQuantity(0);
        java.lang.Double double16 = product5.getPrice();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Product{id=10, name='hi!', description='', price=1.0, quantity=0}" + "'", str12, "Product{id=10, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        product5.setQuantity((int) (short) 10);
        java.lang.String str9 = product5.toString();
        java.lang.Long long10 = product5.getId();
        product5.setId((java.lang.Long) 0L);
        java.lang.String str13 = product5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=10}" + "'", str9, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=10}" + "'", str13, "Product{id=0, name='hi!', description='', price=1.0, quantity=10}");
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
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
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        product5.setId((java.lang.Long) 0L);
        int int25 = product5.getQuantity();
        java.lang.String str26 = product5.toString();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=1}" + "'", str26, "Product{id=0, name='hi!', description='', price=1.0, quantity=1}");
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.addPriceToHistory((java.lang.Double) 10.0d);
        java.lang.Long long8 = product5.getId();
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        product5.setQuantity((int) 'a');
        product5.addPriceToHistory((java.lang.Double) (-1.0d));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=100, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}", "Product{id=0, name='hi!', description='', price=0.0, quantity=0}", (java.lang.Double) 1.0d, 0);
        java.lang.Long long6 = product5.getId();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setId((java.lang.Long) 10L);
        product5.setName("");
        product5.setQuantity((int) (short) 10);
        product5.setName("Product{id=100, name='', description='', price=10.0, quantity=0}");
        java.lang.String str20 = product5.toString();
        java.lang.Double double21 = product5.getPrice();
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) (-1.0d));
        product5.setDescription("Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=-1.0, quantity=100}");
        int int28 = product5.getQuantity();
        product5.setDescription("Product{id=1, name='hi!', description='Product{id=-1, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}" + "'", str20, "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.String str7 = product5.toString();
        java.lang.Long long8 = product5.getId();
        java.lang.String str9 = product5.getDescription();
        java.lang.String str10 = product5.getDescription();
        java.lang.String str11 = product5.getDescription();
        product5.addPriceToHistory((java.lang.Double) 1.0d);
        product5.setId((java.lang.Long) 10L);
        java.lang.Long long16 = product5.getId();
        java.lang.Class<?> wildcardClass17 = product5.getClass();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str7, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getName();
        product5.setDescription("hi!");
        product5.setPrice((java.lang.Double) 1.0d);
        java.lang.String str13 = product5.getName();
        int int14 = product5.getQuantity();
        product5.setId((java.lang.Long) 0L);
        java.lang.Double double17 = product5.getPrice();
        java.util.List<java.lang.Double> doubleList18 = product5.getPriceHistory();
        java.lang.String str19 = product5.toString();
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertNotNull(doubleList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Product{id=0, name='hi!', description='hi!', price=1.0, quantity=0}" + "'", str19, "Product{id=0, name='hi!', description='hi!', price=1.0, quantity=0}");
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "", "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}", (java.lang.Double) (-1.0d), 0);
        product5.setDescription("Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=100}");
        product5.setPrice((java.lang.Double) 10.0d);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getName();
        product5.setDescription("hi!");
        product5.setPrice((java.lang.Double) 1.0d);
        java.lang.String str13 = product5.getName();
        int int14 = product5.getQuantity();
        product5.setId((java.lang.Long) 0L);
        java.util.List<java.lang.Double> doubleList17 = product5.getPriceHistory();
        java.lang.String str18 = product5.getDescription();
        product5.setDescription("Product{id=1, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(doubleList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        product5.setQuantity((int) (short) 10);
        java.lang.String str9 = product5.toString();
        java.lang.Long long10 = product5.getId();
        product5.setDescription("");
        product5.setId((java.lang.Long) 10L);
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        java.lang.Long long17 = product5.getId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=10}" + "'", str9, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) (-1.0d), (int) (byte) 100);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str10 = product5.toString();
        product5.setDescription("Product{id=0, name='hi!', description='', price=1.0, quantity=1}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Product{id=0, name='hi!', description='', price=100.0, quantity=100}" + "'", str10, "Product{id=0, name='hi!', description='', price=100.0, quantity=100}");
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=-1, name='hi!', description='', price=0.0, quantity=100}", "Product{id=-1, name='hi!', description='', price=-1.0, quantity=0}", (java.lang.Double) 1.0d, (int) '#');
        product5.setName("Product{id=0, name='Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}', description='Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}', price=1.0, quantity=0}");
        java.lang.String str8 = product5.getDescription();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Product{id=-1, name='hi!', description='', price=-1.0, quantity=0}" + "'", str8, "Product{id=-1, name='hi!', description='', price=-1.0, quantity=0}");
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        java.lang.Long long10 = product5.getId();
        product5.setQuantity(0);
        product5.setQuantity((int) (byte) -1);
        java.lang.String str15 = product5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=-1}" + "'", str15, "Product{id=100, name='hi!', description='', price=1.0, quantity=-1}");
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}", "Product{id=100, name='hi!', description='', price=1.0, quantity=10}", (java.lang.Double) (-1.0d), (int) (short) 100);
        java.lang.Long long6 = product5.getId();
        product5.addPriceToHistory((java.lang.Double) 1.0d);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=100, name='', description='', price=10.0, quantity=0}", "", (java.lang.Double) 100.0d, (int) ' ');
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        java.lang.String str8 = product5.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}" + "'", str8, "Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}");
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
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
        product5.setName("Product{id=10, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=100, name='hi!', description='', price=1.0, quantity=0}', price=100.0, quantity=52}");
        java.util.List<java.lang.Double> doubleList19 = product5.getPriceHistory();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertNotNull(doubleList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=100}" + "'", str16, "Product{id=100, name='hi!', description='', price=1.0, quantity=100}");
        org.junit.Assert.assertNotNull(doubleList19);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.lang.Double double10 = product5.getPrice();
        java.lang.String str11 = product5.getName();
        java.lang.Long long12 = product5.getId();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
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
        product5.setName("Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}");
        java.util.List<java.lang.Double> doubleList21 = product5.getPriceHistory();
        int int22 = product5.getQuantity();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(doubleList21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        product5.setName("");
        product5.setName("Product{id=0, name='hi!', description='', price=-1.0, quantity=0}");
        java.lang.Long long12 = product5.getId();
        java.lang.String str13 = product5.getDescription();
        java.lang.String str14 = product5.getName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}" + "'", str14, "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}");
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 0.0d);
        int int11 = product5.getQuantity();
        product5.setQuantity((int) '#');
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        product5.setDescription("Product{id=0, name='', description='', price=1.0, quantity=-1}");
        java.lang.String str18 = product5.getName();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) (-1.0d));
        java.lang.String str12 = product5.getDescription();
        product5.setName("Product{id=0, name='hi!', description='', price=0.0, quantity=0}");
        product5.setName("Product{id=100, name='hi!', description='', price=10.0, quantity=0}");
        int int17 = product5.getQuantity();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
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
        product5.addPriceToHistory((java.lang.Double) 10.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}" + "'", str20, "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str27, "Product{id=100, name='', description='', price=10.0, quantity=0}");
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.String str7 = product5.toString();
        product5.setId((java.lang.Long) 100L);
        java.lang.String str10 = product5.getName();
        java.lang.String str11 = product5.toString();
        product5.setName("Product{id=10, name='', description='', price=-1.0, quantity=-1}");
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str7, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str11, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=0, name='Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}', description='Product{id=10, name='hi!', description='', price=10.0, quantity=0}', price=0.0, quantity=97}", "Product{id=1, name='Product{id=-1, name='hi!', description='', price=0.0, quantity=100}', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=0.0, quantity=52}", (java.lang.Double) 100.0d, (int) (byte) -1);
        product5.setQuantity((int) (byte) 1);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.lang.Double double10 = product5.getPrice();
        java.lang.Long long11 = product5.getId();
        java.lang.Long long12 = product5.getId();
        product5.setQuantity((int) (short) 0);
        java.lang.String str15 = product5.getName();
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.Long long7 = product5.getId();
        int int8 = product5.getQuantity();
        java.lang.String str9 = product5.getDescription();
        java.lang.String str10 = product5.getDescription();
        java.lang.String str11 = product5.getName();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.String str7 = product5.toString();
        java.lang.Long long8 = product5.getId();
        java.lang.String str9 = product5.getDescription();
        java.lang.String str10 = product5.getDescription();
        product5.setQuantity(35);
        java.lang.Long long13 = product5.getId();
        java.lang.Double double14 = product5.getPrice();
        product5.setId((java.lang.Long) 0L);
        java.lang.String str17 = product5.getName();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str7, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getDescription();
        product5.setId((java.lang.Long) 0L);
        int int11 = product5.getQuantity();
        java.lang.String str12 = product5.getName();
        product5.setId((java.lang.Long) 100L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
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
        product5.addPriceToHistory((java.lang.Double) 10.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        int int11 = product5.getQuantity();
        java.util.List<java.lang.Double> doubleList12 = product5.getPriceHistory();
        java.lang.String str13 = product5.getDescription();
        java.lang.String str14 = product5.getName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(doubleList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str13, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 0.0d);
        product5.setName("Product{id=0, name='hi!', description='Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}', price=0.0, quantity=0}");
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        product5.addPriceToHistory((java.lang.Double) 1.0d);
        int int18 = product5.getQuantity();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
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
        java.util.List<java.lang.Double> doubleList21 = product5.getPriceHistory();
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}" + "'", str18, "Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}");
        org.junit.Assert.assertNotNull(doubleList21);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setDescription("Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}");
        java.lang.Long long14 = product5.getId();
        product5.setQuantity((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setName("");
        java.lang.String str14 = product5.toString();
        product5.setQuantity(0);
        product5.setQuantity(1);
        product5.setPrice((java.lang.Double) 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str14, "Product{id=100, name='', description='', price=10.0, quantity=0}");
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "Product{id=100, name='Product{id=-1, name='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=-1.0, quantity=35}', description='', price=10.0, quantity=35}", "", (java.lang.Double) (-1.0d), 35);
        product5.setQuantity((int) (byte) 10);
        java.util.List<java.lang.Double> doubleList8 = product5.getPriceHistory();
        org.junit.Assert.assertNotNull(doubleList8);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.String str11 = product5.getDescription();
        java.lang.Long long12 = product5.getId();
        product5.setId((java.lang.Long) 0L);
        product5.setName("Product{id=10, name='hi!', description='', price=1.0, quantity=10}");
        product5.setName("Product{id=0, name='Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}', description='Product{id=10, name='hi!', description='', price=10.0, quantity=0}', price=0.0, quantity=97}");
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 0L);
        java.util.List<java.lang.Double> doubleList9 = product5.getPriceHistory();
        java.lang.Long long10 = product5.getId();
        java.lang.Double double11 = product5.getPrice();
        product5.setId((java.lang.Long) (-1L));
        java.lang.Long long14 = product5.getId();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertNotNull(doubleList9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "Product{id=-1, name='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=-1.0, quantity=35}", "Product{id=100, name='hi!', description='', price=1.0, quantity=100}", (java.lang.Double) 0.0d, (int) (short) 100);
        java.lang.String str6 = product5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=-1, name='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=-1.0, quantity=35}" + "'", str6, "Product{id=-1, name='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=-1.0, quantity=35}");
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", "hi!", (java.lang.Double) 100.0d, (int) '#');
        int int6 = product5.getQuantity();
        product5.setName("Product{id=100, name='', description='', price=10.0, quantity=0}");
        product5.setId((java.lang.Long) 1L);
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.String str13 = product5.getDescription();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 0L);
        product5.addPriceToHistory((java.lang.Double) (-1.0d));
        java.lang.Double double11 = product5.getPrice();
        product5.setPrice((java.lang.Double) 0.0d);
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getName();
        product5.setDescription("hi!");
        product5.setPrice((java.lang.Double) 1.0d);
        java.lang.String str13 = product5.getName();
        int int14 = product5.getQuantity();
        java.lang.String str15 = product5.toString();
        int int16 = product5.getQuantity();
        java.lang.Class<?> wildcardClass17 = product5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Product{id=0, name='hi!', description='hi!', price=1.0, quantity=0}" + "'", str15, "Product{id=0, name='hi!', description='hi!', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        int int8 = product5.getQuantity();
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        product5.setId((java.lang.Long) 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.lang.String str10 = product5.getName();
        java.lang.String str11 = product5.toString();
        product5.setQuantity((int) (short) 100);
        java.lang.String str14 = product5.getDescription();
        java.lang.String str15 = product5.getName();
        product5.setQuantity((int) ' ');
        java.lang.String str18 = product5.toString();
        product5.setQuantity((int) (short) 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str11, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=32}" + "'", str18, "Product{id=0, name='hi!', description='', price=1.0, quantity=32}");
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=10, name='Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}', description='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', price=-1.0, quantity=0}", "Product{id=-1, name='Product{id=100, name='hi!', description='', price=100.0, quantity=0}', description='Product{id=0, name='hi!', description='hi!', price=1.0, quantity=100}', price=10.0, quantity=0}", (java.lang.Double) (-1.0d), 0);
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=0, name='Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}', description='Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}', price=1.0, quantity=0}", "Product{id=1, name='hi!', description='', price=1.0, quantity=0}", (java.lang.Double) 0.0d, 10);
        product5.addPriceToHistory((java.lang.Double) 10.0d);
        java.lang.String str8 = product5.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Product{id=1, name='Product{id=0, name='Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}', description='Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}', price=1.0, quantity=0}', description='Product{id=1, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=10}" + "'", str8, "Product{id=1, name='Product{id=0, name='Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}', description='Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}', price=1.0, quantity=0}', description='Product{id=1, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=10}");
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "", "Product{id=0, name='hi!', description='', price=1.0, quantity=35}", (java.lang.Double) (-1.0d), 0);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.util.List<java.lang.Double> doubleList10 = product5.getPriceHistory();
        java.lang.String str11 = product5.getName();
        java.lang.String str12 = product5.toString();
        product5.setId((java.lang.Long) 100L);
        product5.setName("Product{id=-1, name='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', description='Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}', price=10.0, quantity=32}");
        product5.setId((java.lang.Long) 1L);
        java.lang.Double double19 = product5.getPrice();
        org.junit.Assert.assertNotNull(doubleList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str12, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", "hi!", (java.lang.Double) 100.0d, (int) '#');
        int int6 = product5.getQuantity();
        java.lang.Long long7 = product5.getId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setId((java.lang.Long) 10L);
        int int14 = product5.getQuantity();
        java.lang.String str15 = product5.getDescription();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setQuantity((int) '#');
        product5.setName("hi!");
        product5.setQuantity((int) (short) 1);
        product5.setName("Product{id=1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=0}', description='hi!', price=1.0, quantity=35}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setName("");
        java.lang.Long long11 = product5.getId();
        product5.setQuantity(35);
        java.util.List<java.lang.Double> doubleList14 = product5.getPriceHistory();
        int int15 = product5.getQuantity();
        java.lang.String str16 = product5.getDescription();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertNotNull(doubleList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        product5.setName("hi!");
        java.lang.Double double10 = product5.getPrice();
        product5.setId((java.lang.Long) (-1L));
        int int13 = product5.getQuantity();
        java.lang.Long long14 = product5.getId();
        product5.setQuantity((-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
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
        java.lang.Double double19 = product5.getPrice();
        java.lang.Long long20 = product5.getId();
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleList9);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(doubleList17);
        org.junit.Assert.assertNotNull(doubleList18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 100L + "'", long20 == 100L);
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) (-1.0d));
        java.lang.String str12 = product5.getDescription();
        product5.setName("Product{id=0, name='hi!', description='', price=0.0, quantity=0}");
        product5.setName("Product{id=100, name='hi!', description='', price=10.0, quantity=0}");
        product5.setId((java.lang.Long) 0L);
        java.lang.String str19 = product5.getName();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Product{id=100, name='hi!', description='', price=10.0, quantity=0}" + "'", str19, "Product{id=100, name='hi!', description='', price=10.0, quantity=0}");
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getName();
        product5.setDescription("hi!");
        product5.setId((java.lang.Long) 10L);
        java.util.List<java.lang.Double> doubleList13 = product5.getPriceHistory();
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        product5.setName("Product{id=10, name='Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}', description='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', price=10.0, quantity=100}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(doubleList13);
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=100, name='', description='', price=10.0, quantity=0}", "", (java.lang.Double) 100.0d, (int) ' ');
        product5.setId((java.lang.Long) 1L);
        java.lang.Class<?> wildcardClass8 = product5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
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
        java.lang.String str21 = product5.toString();
        org.junit.Assert.assertNotNull(doubleList10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(doubleList14);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Product{id=0, name='Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}', description='Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}', price=1.0, quantity=52}" + "'", str21, "Product{id=0, name='Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}', description='Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}', price=1.0, quantity=52}");
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}", "Product{id=100, name='hi!', description='', price=1.0, quantity=10}", (java.lang.Double) 1.0d, (int) 'a');
        java.lang.Double double6 = product5.getPrice();
        product5.addPriceToHistory((java.lang.Double) (-1.0d));
        java.lang.String str9 = product5.toString();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=100, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=1.0, quantity=97}" + "'", str9, "Product{id=100, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=1.0, quantity=97}");
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "", "Product{id=10, name='Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}', description='', price=1.0, quantity=10}", (java.lang.Double) 1.0d, 97);
        java.lang.Class<?> wildcardClass6 = product5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        java.lang.String str10 = product5.getDescription();
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        java.lang.Double double13 = product5.getPrice();
        product5.setPrice((java.lang.Double) 10.0d);
        java.lang.Class<?> wildcardClass16 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}", "Product{id=0, name='hi!', description='Product{id=100, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='', price=10.0, quantity=0}', price=1.0, quantity=0}", (java.lang.Double) 0.0d, 0);
        java.lang.String str6 = product5.toString();
        product5.setDescription("Product{id=100, name='Product{id=-1, name='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=-1.0, quantity=35}', description='', price=10.0, quantity=35}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='Product{id=100, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='', price=10.0, quantity=0}', price=1.0, quantity=0}', price=0.0, quantity=0}" + "'", str6, "Product{id=1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='Product{id=100, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='', price=10.0, quantity=0}', price=1.0, quantity=0}', price=0.0, quantity=0}");
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.Long long7 = product5.getId();
        int int8 = product5.getQuantity();
        java.lang.String str9 = product5.getDescription();
        java.lang.String str10 = product5.getDescription();
        java.lang.String str11 = product5.getDescription();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
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
        product5.setPrice((java.lang.Double) (-1.0d));
        org.junit.Assert.assertNotNull(doubleList10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(doubleList14);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getName();
        product5.setDescription("hi!");
        product5.setPrice((java.lang.Double) 1.0d);
        java.lang.String str13 = product5.getName();
        int int14 = product5.getQuantity();
        product5.setDescription("Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        product5.setName("Product{id=100, name='', description='', price=10.0, quantity=0}");
        product5.setName("Product{id=0, name='hi!', description='Product{id=100, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='', price=10.0, quantity=0}', price=1.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        int int8 = product5.getQuantity();
        product5.setDescription("hi!");
        product5.setPrice((java.lang.Double) 10.0d);
        java.lang.String str13 = product5.getName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getName();
        product5.setName("");
        int int11 = product5.getQuantity();
        java.util.List<java.lang.Double> doubleList12 = product5.getPriceHistory();
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(doubleList12);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
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
        java.lang.String str22 = product5.toString();
        product5.setName("Product{id=100, name='hi!', description='hi!', price=10.0, quantity=0}");
        product5.setName("Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=-1.0, quantity=100}', price=-1.0, quantity=10}");
        product5.setId((java.lang.Long) 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(doubleList16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Product{id=100, name='hi!', description='', price=-1.0, quantity=35}" + "'", str22, "Product{id=100, name='hi!', description='', price=-1.0, quantity=35}");
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "", "", (java.lang.Double) 0.0d, (int) (short) -1);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        product5.setDescription("");
        java.lang.Class<?> wildcardClass9 = product5.getClass();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "Product{id=100, name='hi!', description='', price=-1.0, quantity=35}", "Product{id=100, name='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', description='', price=10.0, quantity=0}", (java.lang.Double) 0.0d, (int) '#');
        product5.setDescription("Product{id=100, name='Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=100}', description='', price=1.0, quantity=-1}");
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.util.List<java.lang.Double> doubleList10 = product5.getPriceHistory();
        java.lang.String str11 = product5.getDescription();
        product5.setName("Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        product5.setName("Product{id=10, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=10.0, quantity=35}");
        product5.setName("Product{id=1, name='', description='', price=-1.0, quantity=100}");
        java.lang.String str18 = product5.getDescription();
        org.junit.Assert.assertNotNull(doubleList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=10, name='Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}', description='Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}', price=100.0, quantity=-1}", "hi!", (java.lang.Double) 10.0d, (int) (byte) 100);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
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
        product5.setQuantity((int) (short) 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.String str7 = product5.toString();
        java.lang.Long long8 = product5.getId();
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.Double double11 = product5.getPrice();
        int int12 = product5.getQuantity();
        java.lang.Class<?> wildcardClass13 = product5.getClass();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str7, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=10, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=100, name='hi!', description='', price=1.0, quantity=0}', price=100.0, quantity=52}", "Product{id=10, name='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=-1.0, quantity=35}", (java.lang.Double) (-1.0d), 32);
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=100, name='', description='', price=10.0, quantity=0}", "", (java.lang.Double) 100.0d, (int) ' ');
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        java.lang.Long long8 = product5.getId();
        java.util.List<java.lang.Double> doubleList9 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 10.0d);
        java.lang.String str14 = product5.toString();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(doubleList9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=32}" + "'", str14, "Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=32}");
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        java.lang.String str10 = product5.getDescription();
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        java.lang.String str13 = product5.getName();
        product5.setName("");
        product5.setDescription("Product{id=0, name='hi!', description='', price=100.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.String str11 = product5.getDescription();
        int int12 = product5.getQuantity();
        product5.setQuantity((-1));
        product5.setDescription("Product{id=100, name='hi!', description='', price=10.0, quantity=35}");
        product5.addPriceToHistory((java.lang.Double) 1.0d);
        java.lang.String str19 = product5.getDescription();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Product{id=100, name='hi!', description='', price=10.0, quantity=35}" + "'", str19, "Product{id=100, name='hi!', description='', price=10.0, quantity=35}");
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
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
        product5.setQuantity((int) ' ');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str14, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.String str7 = product5.toString();
        java.lang.Long long8 = product5.getId();
        java.lang.String str9 = product5.getDescription();
        java.lang.String str10 = product5.getDescription();
        java.lang.String str11 = product5.getDescription();
        java.lang.Double double12 = product5.getPrice();
        product5.setDescription("Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}");
        product5.setDescription("Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=1.0, quantity=1}");
        java.lang.Class<?> wildcardClass17 = product5.getClass();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str7, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setQuantity((int) '#');
        product5.setName("hi!");
        java.lang.String str15 = product5.toString();
        java.lang.String str16 = product5.getDescription();
        int int17 = product5.getQuantity();
        java.lang.String str18 = product5.getName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Product{id=100, name='hi!', description='', price=10.0, quantity=35}" + "'", str15, "Product{id=100, name='hi!', description='', price=10.0, quantity=35}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=100, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}", "Product{id=0, name='hi!', description='', price=0.0, quantity=0}", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Product{id=100, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}" + "'", str8, "Product{id=100, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}");
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setId((java.lang.Long) 100L);
        product5.setDescription("Product{id=-1, name='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', description='Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}', price=10.0, quantity=32}");
        product5.setDescription("Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}");
        java.lang.String str14 = product5.getName();
        java.lang.String str15 = product5.toString();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Product{id=100, name='hi!', description='Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}', price=1.0, quantity=0}" + "'", str15, "Product{id=100, name='hi!', description='Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}', price=1.0, quantity=0}");
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.String str7 = product5.toString();
        java.lang.Long long8 = product5.getId();
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.Double double11 = product5.getPrice();
        java.lang.String str12 = product5.getDescription();
        product5.setQuantity((int) (short) 10);
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str7, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=10, name='Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}', description='Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}', price=100.0, quantity=-1}", "hi!", (java.lang.Double) 0.0d, (int) (byte) 10);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.Class<?> wildcardClass7 = product5.getClass();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
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
        int int18 = product5.getQuantity();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(doubleList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str13, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Product{id=100, name='hi!', description='', price=10.0, quantity=0}" + "'", str17, "Product{id=100, name='hi!', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getName();
        product5.setDescription("hi!");
        product5.setId((java.lang.Long) 10L);
        java.lang.String str13 = product5.getDescription();
        java.lang.String str14 = product5.getName();
        product5.setDescription("");
        product5.setDescription("hi!");
        java.util.List<java.lang.Double> doubleList19 = product5.getPriceHistory();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(doubleList19);
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=1.0, quantity=1}", "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=-1.0, quantity=100}", (java.lang.Double) (-1.0d), 100);
        java.lang.String str6 = product5.getDescription();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=-1.0, quantity=100}" + "'", str6, "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=-1.0, quantity=100}");
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=100, name='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', description='', price=1.0, quantity=0}", "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}", (java.lang.Double) 1.0d, (int) (byte) 10);
        java.lang.Double double6 = product5.getPrice();
        product5.setQuantity(35);
        product5.setName("Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=1.0, quantity=1}");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", "hi!", (java.lang.Double) 100.0d, (int) '#');
        int int6 = product5.getQuantity();
        product5.setName("Product{id=100, name='', description='', price=10.0, quantity=0}");
        java.lang.Double double9 = product5.getPrice();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setName("Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}");
        product5.setQuantity((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        int int11 = product5.getQuantity();
        java.util.List<java.lang.Double> doubleList12 = product5.getPriceHistory();
        java.lang.String str13 = product5.toString();
        product5.setId((java.lang.Long) 1L);
        java.lang.Double double16 = product5.getPrice();
        product5.setId((java.lang.Long) (-1L));
        product5.setDescription("Product{id=1, name='', description='Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}', price=-1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(doubleList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}" + "'", str13, "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "", "", (java.lang.Double) 0.0d, 52);
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=0, name='hi!', description='', price=0.0, quantity=0}", "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}", (java.lang.Double) 0.0d, (int) '#');
        int int6 = product5.getQuantity();
        product5.addPriceToHistory((java.lang.Double) 1.0d);
        product5.setName("Product{id=-1, name='hi!', description='', price=0.0, quantity=100}");
        product5.setPrice((java.lang.Double) 100.0d);
        java.util.List<java.lang.Double> doubleList13 = product5.getPriceHistory();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(doubleList13);
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
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
        java.util.List<java.lang.Double> doubleList19 = product5.getPriceHistory();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(doubleList19);
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "Product{id=1, name='Product{id=1, name='', description='', price=-1.0, quantity=100}', description='hi!', price=100.0, quantity=35}", "Product{id=100, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=0.0, quantity=0}", (java.lang.Double) (-1.0d), (int) (short) 100);
        product5.setDescription("Product{id=1, name='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', description='Product{id=0, name='Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}', description='Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}', price=1.0, quantity=0}', price=0.0, quantity=0}");
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=0}', description='hi!', price=1.0, quantity=35}", "Product{id=100, name='hi!', description='', price=-1.0, quantity=0}", (java.lang.Double) 1.0d, (int) '#');
        java.lang.Long long6 = product5.getId();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "Product{id=10, name='', description='', price=0.0, quantity=-1}", "Product{id=-1, name='hi!', description='', price=1.0, quantity=0}", (java.lang.Double) (-1.0d), 1);
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.String str12 = product5.getDescription();
        java.lang.String str13 = product5.getName();
        product5.setName("Product{id=0, name='hi!', description='Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}', price=0.0, quantity=0}");
        product5.setPrice((java.lang.Double) 100.0d);
        java.util.List<java.lang.Double> doubleList18 = product5.getPriceHistory();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(doubleList18);
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "", "", (java.lang.Double) (-1.0d), (int) (byte) 100);
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        product5.setDescription("Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}");
        product5.setDescription("Product{id=100, name='hi!', description='', price=0.0, quantity=0}");
        product5.addPriceToHistory((java.lang.Double) 0.0d);
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.util.List<java.lang.Double> doubleList8 = product5.getPriceHistory();
        product5.setPrice((java.lang.Double) 0.0d);
        product5.setName("Product{id=0, name='Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}', description='Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}', price=1.0, quantity=0}");
        product5.setPrice((java.lang.Double) 10.0d);
        org.junit.Assert.assertNotNull(doubleList8);
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "", "Product{id=1, name='Product{id=100, name='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', description='', price=1.0, quantity=0}', description='Product{id=0, name='hi!', description='', price=0.0, quantity=0}', price=10.0, quantity=-1}", (java.lang.Double) 10.0d, (int) (short) 1);
        java.lang.String str6 = product5.getDescription();
        product5.addPriceToHistory((java.lang.Double) 1.0d);
        java.lang.Class<?> wildcardClass9 = product5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=1, name='Product{id=100, name='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', description='', price=1.0, quantity=0}', description='Product{id=0, name='hi!', description='', price=0.0, quantity=0}', price=10.0, quantity=-1}" + "'", str6, "Product{id=1, name='Product{id=100, name='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', description='', price=1.0, quantity=0}', description='Product{id=0, name='hi!', description='', price=0.0, quantity=0}', price=10.0, quantity=-1}");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "", "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}", (java.lang.Double) (-1.0d), 0);
        java.lang.Double double6 = product5.getPrice();
        product5.setQuantity(10);
        java.lang.Long long9 = product5.getId();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setId((java.lang.Long) 10L);
        java.lang.Long long14 = product5.getId();
        java.lang.Double double15 = product5.getPrice();
        java.lang.String str16 = product5.getDescription();
        product5.setName("Product{id=100, name='hi!', description='', price=1.0, quantity=35}");
        java.lang.Double double19 = product5.getPrice();
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "Product{id=10, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=10.0, quantity=35}", "Product{id=0, name='hi!', description='Product{id=100, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='', price=10.0, quantity=0}', price=1.0, quantity=0}", (java.lang.Double) 0.0d, 100);
        int int6 = product5.getQuantity();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        int int8 = product5.getQuantity();
        product5.setDescription("hi!");
        java.util.List<java.lang.Double> doubleList11 = product5.getPriceHistory();
        java.lang.String str12 = product5.getName();
        java.lang.String str13 = product5.toString();
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.String str16 = product5.getName();
        java.lang.String str17 = product5.toString();
        product5.setQuantity((int) (short) 0);
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}" + "'", str13, "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Product{id=100, name='hi!', description='hi!', price=0.0, quantity=0}" + "'", str17, "Product{id=100, name='hi!', description='hi!', price=0.0, quantity=0}");
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "Product{id=1, name='Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}', description='Product{id=0, name='hi!', description='', price=100.0, quantity=0}', price=10.0, quantity=0}", "Product{id=100, name='Product{id=100, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=0.0, quantity=0}', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=0.0, quantity=0}", (java.lang.Double) 1.0d, (int) (byte) 1);
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getName();
        product5.setName("");
        product5.setName("Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        java.lang.String str13 = product5.getDescription();
        java.lang.String str14 = product5.getName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str14, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "hi!", "", (java.lang.Double) 0.0d, (int) (byte) 100);
        product5.addPriceToHistory((java.lang.Double) 10.0d);
        java.lang.String str8 = product5.toString();
        java.lang.String str9 = product5.getName();
        int int10 = product5.getQuantity();
        java.util.List<java.lang.Double> doubleList11 = product5.getPriceHistory();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Product{id=-1, name='hi!', description='', price=0.0, quantity=100}" + "'", str8, "Product{id=-1, name='hi!', description='', price=0.0, quantity=100}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(doubleList11);
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "Product{id=0, name='Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}', description='Product{id=0, name='Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}', description='Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}', price=1.0, quantity=0}', price=1.0, quantity=32}", "Product{id=10, name='hi!', description='', price=1.0, quantity=10}", (java.lang.Double) (-1.0d), (int) (short) 0);
        product5.setName("Product{id=0, name='Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}', description='Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}', price=0.0, quantity=100}");
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
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
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        java.lang.Class<?> wildcardClass23 = product5.getClass();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        java.lang.String str9 = product5.getDescription();
        java.lang.String str10 = product5.getName();
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        product5.setDescription("Product{id=0, name='Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}', description='Product{id=0, name='Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}', description='Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}', price=0.0, quantity=100}', price=0.0, quantity=-1}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setDescription("Product{id=-1, name='hi!', description='', price=0.0, quantity=100}");
        java.lang.String str13 = product5.toString();
        java.util.List<java.lang.Double> doubleList14 = product5.getPriceHistory();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=100, name='hi!', description='Product{id=-1, name='hi!', description='', price=0.0, quantity=100}', price=10.0, quantity=0}" + "'", str13, "Product{id=100, name='hi!', description='Product{id=-1, name='hi!', description='', price=0.0, quantity=100}', price=10.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList14);
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=100, name='hi!', description='', price=1.0, quantity=10}", "Product{id=0, name='hi!', description='', price=1.0, quantity=0}", (java.lang.Double) 0.0d, (int) (short) -1);
        java.lang.String str6 = product5.getName();
        java.lang.String str7 = product5.getName();
        product5.addPriceToHistory((java.lang.Double) 10.0d);
        product5.addPriceToHistory((java.lang.Double) 1.0d);
        int int12 = product5.getQuantity();
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=10}" + "'", str6, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=10}" + "'", str7, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}", "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", (java.lang.Double) 100.0d, (int) '4');
        int int6 = product5.getQuantity();
        product5.setId((java.lang.Long) 100L);
        int int9 = product5.getQuantity();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getName();
        product5.setDescription("hi!");
        product5.setId((java.lang.Long) 10L);
        java.lang.String str13 = product5.getDescription();
        product5.setName("Product{id=100, name='hi!', description='', price=10.0, quantity=0}");
        java.lang.Long long16 = product5.getId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
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
        product5.setQuantity(0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "Product{id=0, name='hi!', description='Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}', price=1.0, quantity=0}", "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}", (java.lang.Double) 1.0d, 97);
        java.lang.String str6 = product5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=0, name='hi!', description='Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}', price=1.0, quantity=0}" + "'", str6, "Product{id=0, name='hi!', description='Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}', price=1.0, quantity=0}");
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", "hi!", (java.lang.Double) 100.0d, (int) '#');
        int int6 = product5.getQuantity();
        product5.setName("Product{id=100, name='', description='', price=10.0, quantity=0}");
        java.lang.Double double9 = product5.getPrice();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setId((java.lang.Long) (-1L));
        java.lang.Long long14 = product5.getId();
        product5.setPrice((java.lang.Double) 1.0d);
        java.lang.String str17 = product5.getName();
        product5.setName("");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str17, "Product{id=100, name='', description='', price=10.0, quantity=0}");
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.Double double8 = product5.getPrice();
        product5.setQuantity((int) (byte) 0);
        java.lang.String str11 = product5.getDescription();
        java.lang.String str12 = product5.getDescription();
        product5.addPriceToHistory((java.lang.Double) 1.0d);
        java.lang.Long long15 = product5.getId();
        product5.setQuantity((int) (short) 1);
        java.lang.String str18 = product5.getName();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        java.lang.String str9 = product5.getDescription();
        product5.setId((java.lang.Long) 10L);
        java.lang.String str12 = product5.getName();
        java.lang.String str13 = product5.toString();
        product5.setDescription("Product{id=10, name='hi!', description='', price=1.0, quantity=10}");
        java.lang.Double double16 = product5.getPrice();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=10, name='hi!', description='', price=1.0, quantity=0}" + "'", str13, "Product{id=10, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getName();
        product5.setDescription("hi!");
        product5.setPrice((java.lang.Double) 1.0d);
        java.lang.String str13 = product5.getName();
        int int14 = product5.getQuantity();
        java.lang.String str15 = product5.toString();
        int int16 = product5.getQuantity();
        product5.setQuantity((int) (byte) 0);
        java.lang.String str19 = product5.toString();
        product5.addPriceToHistory((java.lang.Double) 10.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Product{id=0, name='hi!', description='hi!', price=1.0, quantity=0}" + "'", str15, "Product{id=0, name='hi!', description='hi!', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Product{id=0, name='hi!', description='hi!', price=1.0, quantity=0}" + "'", str19, "Product{id=0, name='hi!', description='hi!', price=1.0, quantity=0}");
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}", "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", (java.lang.Double) 100.0d, (int) '4');
        product5.setQuantity((int) (short) 10);
        product5.addPriceToHistory((java.lang.Double) 100.0d);
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "Product{id=1, name='Product{id=1, name='', description='', price=-1.0, quantity=100}', description='hi!', price=100.0, quantity=35}", "Product{id=100, name='Product{id=0, name='hi!', description='Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}', price=0.0, quantity=0}', description='', price=0.0, quantity=0}", (java.lang.Double) 1.0d, 0);
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=100, name='', description='', price=10.0, quantity=0}", "", (java.lang.Double) 1.0d, (int) ' ');
        java.lang.String str6 = product5.getName();
        product5.setQuantity(100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str6, "Product{id=100, name='', description='', price=10.0, quantity=0}");
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
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
        java.util.List<java.lang.Double> doubleList19 = product5.getPriceHistory();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setPrice((java.lang.Double) 0.0d);
        product5.setName("Product{id=0, name='Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}', description='Product{id=0, name='Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}', description='Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}', price=1.0, quantity=0}', price=1.0, quantity=32}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(doubleList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}" + "'", str13, "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertNotNull(doubleList19);
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}", "Product{id=100, name='hi!', description='', price=1.0, quantity=10}", (java.lang.Double) (-1.0d), (int) (short) 100);
        java.lang.String str6 = product5.getName();
        java.util.List<java.lang.Double> doubleList7 = product5.getPriceHistory();
        product5.setName("hi!");
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setQuantity(52);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}" + "'", str6, "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList7);
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.lang.String str10 = product5.getName();
        java.lang.String str11 = product5.toString();
        product5.addPriceToHistory((java.lang.Double) 1.0d);
        product5.setName("Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}");
        java.lang.String str16 = product5.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str11, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}" + "'", str16, "Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}");
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
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
        java.lang.Double double21 = product5.getPrice();
        product5.setDescription("Product{id=100, name='Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=100}', description='', price=1.0, quantity=0}");
        java.util.List<java.lang.Double> doubleList24 = product5.getPriceHistory();
        java.lang.Class<?> wildcardClass25 = doubleList24.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertNotNull(doubleList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "", "Product{id=0, name='Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}', description='Product{id=10, name='hi!', description='', price=10.0, quantity=0}', price=0.0, quantity=97}", (java.lang.Double) 10.0d, (int) ' ');
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
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
        product5.setName("Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(doubleList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}" + "'", str13, "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setDescription("Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}");
        java.lang.Long long14 = product5.getId();
        java.lang.Double double15 = product5.getPrice();
        product5.setPrice((java.lang.Double) 0.0d);
        product5.setPrice((java.lang.Double) 10.0d);
        java.util.List<java.lang.Double> doubleList20 = product5.getPriceHistory();
        product5.setQuantity((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(doubleList20);
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.Long long7 = product5.getId();
        int int8 = product5.getQuantity();
        java.lang.String str9 = product5.getDescription();
        int int10 = product5.getQuantity();
        java.lang.Long long11 = product5.getId();
        product5.addPriceToHistory((java.lang.Double) 1.0d);
        java.lang.Class<?> wildcardClass14 = product5.getClass();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "", "Product{id=1, name='Product{id=100, name='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', description='', price=1.0, quantity=0}', description='Product{id=0, name='hi!', description='', price=0.0, quantity=0}', price=10.0, quantity=-1}", (java.lang.Double) 10.0d, (int) (short) 1);
        java.lang.String str6 = product5.getDescription();
        product5.addPriceToHistory((java.lang.Double) 1.0d);
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=1, name='Product{id=100, name='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', description='', price=1.0, quantity=0}', description='Product{id=0, name='hi!', description='', price=0.0, quantity=0}', price=10.0, quantity=-1}" + "'", str6, "Product{id=1, name='Product{id=100, name='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', description='', price=1.0, quantity=0}', description='Product{id=0, name='hi!', description='', price=0.0, quantity=0}', price=10.0, quantity=-1}");
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "Product{id=100, name='', description='', price=10.0, quantity=0}", "Product{id=1, name='hi!', description='', price=1.0, quantity=0}", (java.lang.Double) 100.0d, 35);
        product5.setId((java.lang.Long) 100L);
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "hi!", "", (java.lang.Double) 0.0d, (int) (byte) 100);
        product5.addPriceToHistory((java.lang.Double) 10.0d);
        java.lang.String str8 = product5.toString();
        product5.setPrice((java.lang.Double) 100.0d);
        java.util.List<java.lang.Double> doubleList11 = product5.getPriceHistory();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Product{id=-1, name='hi!', description='', price=0.0, quantity=100}" + "'", str8, "Product{id=-1, name='hi!', description='', price=0.0, quantity=100}");
        org.junit.Assert.assertNotNull(doubleList11);
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "Product{id=100, name='hi!', description='', price=10.0, quantity=0}", "Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}", (java.lang.Double) 100.0d, 0);
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.String str11 = product5.getDescription();
        int int12 = product5.getQuantity();
        product5.setDescription("Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=10.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.util.List<java.lang.Double> doubleList10 = product5.getPriceHistory();
        java.lang.String str11 = product5.getName();
        java.lang.String str12 = product5.toString();
        product5.addPriceToHistory((java.lang.Double) (-1.0d));
        org.junit.Assert.assertNotNull(doubleList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str12, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getName();
        product5.setDescription("hi!");
        product5.setPrice((java.lang.Double) 1.0d);
        java.lang.String str13 = product5.getName();
        int int14 = product5.getQuantity();
        product5.setId((java.lang.Long) 0L);
        java.util.List<java.lang.Double> doubleList17 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 10L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(doubleList17);
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "", "Product{id=1, name='Product{id=-1, name='hi!', description='', price=0.0, quantity=100}', description='hi!', price=100.0, quantity=35}", (java.lang.Double) 100.0d, (int) (byte) 0);
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
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
        product5.addPriceToHistory((java.lang.Double) (-1.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(doubleList15);
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "", "", (java.lang.Double) 1.0d, 1);
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getDescription();
        int int9 = product5.getQuantity();
        java.lang.Double double10 = product5.getPrice();
        java.lang.String str11 = product5.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str11, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=-1, name='hi!', description='', price=-1.0, quantity=0}", "Product{id=100, name='hi!', description='', price=10.0, quantity=35}", (java.lang.Double) 0.0d, (int) 'a');
        java.lang.Long long6 = product5.getId();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=100, name='hi!', description='', price=10.0, quantity=0}", "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}", (java.lang.Double) 10.0d, (int) ' ');
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        product5.setPrice((java.lang.Double) 1.0d);
        java.lang.Double double9 = product5.getPrice();
        java.util.List<java.lang.Double> doubleList10 = product5.getPriceHistory();
        java.lang.String str11 = product5.getDescription();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(doubleList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}" + "'", str11, "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}");
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        product5.setName("");
        product5.addPriceToHistory((java.lang.Double) (-1.0d));
        java.lang.Long long12 = product5.getId();
        java.lang.String str13 = product5.getName();
        product5.setPrice((java.lang.Double) 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) (-1.0d));
        java.lang.String str12 = product5.getDescription();
        java.lang.Long long13 = product5.getId();
        int int14 = product5.getQuantity();
        java.lang.Long long15 = product5.getId();
        product5.setQuantity((int) ' ');
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getDescription();
        int int9 = product5.getQuantity();
        product5.setQuantity(0);
        java.lang.Double double12 = product5.getPrice();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        java.lang.String str11 = product5.getDescription();
        java.lang.Double double12 = product5.getPrice();
        product5.setDescription("Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        product5.setId((java.lang.Long) (-1L));
        java.lang.String str17 = product5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Product{id=-1, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=0}', price=10.0, quantity=0}" + "'", str17, "Product{id=-1, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=0}', price=10.0, quantity=0}");
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}", "Product{id=1, name='hi!', description='Product{id=-1, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}", (java.lang.Double) 1.0d, 100);
        int int6 = product5.getQuantity();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}", "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}", (java.lang.Double) (-1.0d), (int) (short) 0);
        java.lang.String str6 = product5.getName();
        java.lang.String str7 = product5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}" + "'", str6, "Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=1, name='Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}', description='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', price=-1.0, quantity=0}" + "'", str7, "Product{id=1, name='Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}', description='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', price=-1.0, quantity=0}");
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", "hi!", (java.lang.Double) 100.0d, (int) '#');
        int int6 = product5.getQuantity();
        product5.setName("Product{id=100, name='', description='', price=10.0, quantity=0}");
        java.lang.Double double9 = product5.getPrice();
        java.lang.Double double10 = product5.getPrice();
        java.lang.String str11 = product5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product{id=1, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='hi!', price=100.0, quantity=35}" + "'", str11, "Product{id=1, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='hi!', price=100.0, quantity=35}");
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        java.lang.Long long10 = product5.getId();
        product5.setQuantity(0);
        product5.setQuantity((int) (byte) -1);
        product5.setName("Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}");
        java.lang.Double double17 = product5.getPrice();
        product5.setPrice((java.lang.Double) 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setId((java.lang.Long) 10L);
        product5.setName("");
        product5.setQuantity((int) (short) 10);
        product5.setName("Product{id=100, name='', description='', price=10.0, quantity=0}");
        product5.addPriceToHistory((java.lang.Double) 1.0d);
        java.lang.Long long22 = product5.getId();
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10L + "'", long22 == 10L);
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=100, name='', description='', price=10.0, quantity=0}", "Product{id=0, name='hi!', description='', price=1.0, quantity=0}", (java.lang.Double) 10.0d, (int) (short) 100);
        product5.setName("hi!");
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        product5.addPriceToHistory((java.lang.Double) 10.0d);
        product5.setName("Product{id=100, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "", "", (java.lang.Double) 0.0d, (int) (short) -1);
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        product5.setId((java.lang.Long) 100L);
        product5.setDescription("Product{id=0, name='hi!', description='Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}', price=0.0, quantity=0}");
        product5.addPriceToHistory((java.lang.Double) 0.0d);
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=0, name='hi!', description='hi!', price=1.0, quantity=100}", "Product{id=0, name='hi!', description='', price=1.0, quantity=0}", (java.lang.Double) 10.0d, (int) (byte) -1);
        java.lang.Long long6 = product5.getId();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
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
        java.lang.Double double17 = product5.getPrice();
        product5.addPriceToHistory((java.lang.Double) 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(doubleList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str13, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.Long long7 = product5.getId();
        int int8 = product5.getQuantity();
        product5.setQuantity((int) (short) -1);
        product5.setId((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.Long long7 = product5.getId();
        int int8 = product5.getQuantity();
        product5.setName("Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}");
        product5.setPrice((java.lang.Double) 1.0d);
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }
}

