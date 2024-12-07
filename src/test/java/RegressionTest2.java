import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

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
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        product5.setName("hi!");
        java.lang.String str10 = product5.toString();
        java.lang.Long long11 = product5.getId();
        java.lang.String str12 = product5.getName();
        product5.setPrice((java.lang.Double) (-1.0d));
        product5.setName("Product{id=100, name='Product{id=100, name='hi!', description='', price=1.0, quantity=0}', description='Product{id=0, name='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=0}', price=10.0, quantity=-1}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str10, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setQuantity((int) '#');
        product5.setId((java.lang.Long) 100L);
        int int15 = product5.getQuantity();
        java.util.List<java.lang.Double> doubleList16 = product5.getPriceHistory();
        java.lang.Long long17 = product5.getId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertNotNull(doubleList16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        int int11 = product5.getQuantity();
        product5.setPrice((java.lang.Double) (-1.0d));
        product5.setId((java.lang.Long) 1L);
        product5.addPriceToHistory((java.lang.Double) (-1.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        product5.setName("hi!");
        int int10 = product5.getQuantity();
        product5.setName("Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}");
        product5.setId((java.lang.Long) 100L);
        java.lang.String str15 = product5.getName();
        int int16 = product5.getQuantity();
        product5.setPrice((java.lang.Double) (-1.0d));
        product5.setId((java.lang.Long) 0L);
        java.lang.String str21 = product5.getDescription();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}" + "'", str15, "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=100, name='hi!', description='', price=10.0, quantity=0}", "hi!", (java.lang.Double) 1.0d, 52);
        product5.setId((java.lang.Long) (-1L));
        java.util.List<java.lang.Double> doubleList8 = product5.getPriceHistory();
        org.junit.Assert.assertNotNull(doubleList8);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        java.lang.String str9 = product5.getName();
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        java.lang.Double double12 = product5.getPrice();
        java.lang.Long long13 = product5.getId();
        int int14 = product5.getQuantity();
        java.lang.Class<?> wildcardClass15 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setQuantity((int) (byte) 0);
        java.lang.String str11 = product5.getDescription();
        int int12 = product5.getQuantity();
        product5.setDescription("hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
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
        java.util.List<java.lang.Double> doubleList20 = product5.getPriceHistory();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}" + "'", str13, "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList20);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "", "", (java.lang.Double) 0.0d, (int) (short) -1);
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setQuantity(1);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) (-1.0d), (int) (byte) 100);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        product5.setPrice((java.lang.Double) 100.0d);
        java.lang.Long long9 = product5.getId();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getName();
        product5.setQuantity((int) (byte) -1);
        product5.addPriceToHistory((java.lang.Double) 1.0d);
        java.lang.Double double13 = product5.getPrice();
        java.lang.String str14 = product5.getDescription();
        product5.setPrice((java.lang.Double) (-1.0d));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        int int10 = product5.getQuantity();
        product5.setId((java.lang.Long) (-1L));
        product5.setDescription("");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}", "Product{id=100, name='Product{id=-1, name='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=-1.0, quantity=35}', description='', price=10.0, quantity=35}", (java.lang.Double) 0.0d, 10);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=100}", "Product{id=100, name='', description='', price=10.0, quantity=0}", (java.lang.Double) 1.0d, 0);
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        int int8 = product5.getQuantity();
        product5.setDescription("Product{id=100, name='', description='', price=0.0, quantity=0}");
        java.lang.Long long11 = product5.getId();
        product5.setName("");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "", "", (java.lang.Double) 0.0d, (int) (byte) 100);
        product5.setQuantity((int) (short) -1);
        product5.setName("Product{id=100, name='hi!', description='', price=1.0, quantity=1}");
        java.util.List<java.lang.Double> doubleList10 = product5.getPriceHistory();
        org.junit.Assert.assertNotNull(doubleList10);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) (-1.0d), (int) (byte) 100);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.Long long7 = product5.getId();
        product5.setId((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) (-1.0d), (int) (byte) 100);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        product5.setPrice((java.lang.Double) 100.0d);
        java.lang.Double double9 = product5.getPrice();
        java.util.List<java.lang.Double> doubleList10 = product5.getPriceHistory();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(doubleList10);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.String str7 = product5.toString();
        java.lang.Long long8 = product5.getId();
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.Double double11 = product5.getPrice();
        java.lang.String str12 = product5.getDescription();
        java.lang.String str13 = product5.getDescription();
        java.lang.String str14 = product5.getName();
        product5.setId((java.lang.Long) 10L);
        java.lang.String str17 = product5.getName();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str7, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
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
        product5.setName("Product{id=0, name='hi!', description='', price=-1.0, quantity=0}");
        java.lang.String str24 = product5.getName();
        java.lang.String str25 = product5.getName();
        java.lang.String str26 = product5.getDescription();
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}" + "'", str20, "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}" + "'", str24, "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}" + "'", str25, "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.String str7 = product5.toString();
        java.lang.Long long8 = product5.getId();
        java.lang.String str9 = product5.getDescription();
        java.lang.String str10 = product5.getDescription();
        product5.setQuantity(35);
        java.lang.String str13 = product5.toString();
        java.lang.String str14 = product5.getName();
        java.util.List<java.lang.Double> doubleList15 = product5.getPriceHistory();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str7, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=35}" + "'", str13, "Product{id=100, name='hi!', description='', price=1.0, quantity=35}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(doubleList15);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        java.lang.Long long9 = product5.getId();
        java.util.List<java.lang.Double> doubleList10 = product5.getPriceHistory();
        int int11 = product5.getQuantity();
        java.lang.Class<?> wildcardClass12 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertNotNull(doubleList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getName();
        product5.setDescription("hi!");
        product5.setId((java.lang.Long) 10L);
        product5.addPriceToHistory((java.lang.Double) 10.0d);
        product5.setName("Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}");
        java.lang.Long long17 = product5.getId();
        java.util.List<java.lang.Double> doubleList18 = product5.getPriceHistory();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
        org.junit.Assert.assertNotNull(doubleList18);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "hi!", "", (java.lang.Double) 0.0d, (int) (byte) 100);
        product5.addPriceToHistory((java.lang.Double) 10.0d);
        java.lang.String str8 = product5.toString();
        java.lang.String str9 = product5.getName();
        int int10 = product5.getQuantity();
        product5.setQuantity((int) (short) -1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Product{id=-1, name='hi!', description='', price=0.0, quantity=100}" + "'", str8, "Product{id=-1, name='hi!', description='', price=0.0, quantity=100}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "", "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", (java.lang.Double) 0.0d, (int) 'a');
        java.lang.Long long6 = product5.getId();
        java.lang.String str7 = product5.getDescription();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str7, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=0, name='Product{id=10, name='Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}', description='', price=100.0, quantity=0}', description='', price=-1.0, quantity=10}", "Product{id=0, name='', description='', price=1.0, quantity=0}", (java.lang.Double) 1.0d, 52);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=100, name='', description='', price=10.0, quantity=0}", "", (java.lang.Double) 100.0d, (int) ' ');
        java.lang.String str6 = product5.toString();
        product5.setName("Product{id=100, name='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', description='', price=-1.0, quantity=0}");
        java.lang.String str9 = product5.getDescription();
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}" + "'", str6, "Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) (-1.0d));
        java.lang.String str12 = product5.getDescription();
        product5.setId((java.lang.Long) (-1L));
        java.lang.Double double15 = product5.getPrice();
        product5.setQuantity(52);
        product5.setName("");
        java.util.List<java.lang.Double> doubleList20 = product5.getPriceHistory();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleList20);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.String str8 = product5.getDescription();
        product5.setId((java.lang.Long) 0L);
        java.lang.String str11 = product5.getName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setName("");
        java.lang.Long long11 = product5.getId();
        java.lang.Long long12 = product5.getId();
        java.lang.Long long13 = product5.getId();
        int int14 = product5.getQuantity();
        product5.setName("Product{id=100, name='hi!', description='', price=-1.0, quantity=35}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", "hi!", (java.lang.Double) 100.0d, (int) '#');
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str7, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=1, name='Product{id=-1, name='hi!', description='', price=0.0, quantity=100}', description='hi!', price=100.0, quantity=35}", "Product{id=0, name='Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}', description='Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}', price=1.0, quantity=0}", (java.lang.Double) 0.0d, (int) (short) -1);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getName();
        product5.setDescription("hi!");
        product5.setId((java.lang.Long) 10L);
        java.lang.String str13 = product5.getDescription();
        java.lang.String str14 = product5.getName();
        java.util.List<java.lang.Double> doubleList15 = product5.getPriceHistory();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(doubleList15);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}", "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}", (java.lang.Double) (-1.0d), (int) (short) 0);
        product5.setDescription("Product{id=0, name='hi!', description='', price=0.0, quantity=0}");
        product5.addPriceToHistory((java.lang.Double) 1.0d);
        product5.setDescription("Product{id=1, name='Product{id=-1, name='hi!', description='', price=0.0, quantity=100}', description='hi!', price=100.0, quantity=35}");
        java.lang.Class<?> wildcardClass12 = product5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        java.lang.String str9 = product5.getName();
        java.lang.String str10 = product5.getDescription();
        product5.setPrice((java.lang.Double) 10.0d);
        java.lang.String str13 = product5.getDescription();
        int int14 = product5.getQuantity();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
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
        product5.setDescription("");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleList9);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(doubleList17);
        org.junit.Assert.assertNotNull(doubleList18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.util.List<java.lang.Double> doubleList10 = product5.getPriceHistory();
        java.lang.Double double11 = product5.getPrice();
        product5.setId((java.lang.Long) 0L);
        java.util.List<java.lang.Double> doubleList14 = product5.getPriceHistory();
        product5.addPriceToHistory((java.lang.Double) (-1.0d));
        java.lang.Double double17 = product5.getPrice();
        product5.setPrice((java.lang.Double) (-1.0d));
        org.junit.Assert.assertNotNull(doubleList10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(doubleList14);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
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
        product5.setName("Product{id=100, name='', description='Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}" + "'", str13, "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=0, name='hi!', description='', price=0.0, quantity=0}", "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}", (java.lang.Double) 0.0d, (int) '#');
        java.lang.String str6 = product5.toString();
        java.lang.Class<?> wildcardClass7 = product5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=0, name='Product{id=0, name='hi!', description='', price=0.0, quantity=0}', description='Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}', price=0.0, quantity=35}" + "'", str6, "Product{id=0, name='Product{id=0, name='hi!', description='', price=0.0, quantity=0}', description='Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}', price=0.0, quantity=35}");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.addPriceToHistory((java.lang.Double) 10.0d);
        product5.setQuantity((int) (byte) 10);
        java.lang.String str10 = product5.getDescription();
        product5.setQuantity((int) (byte) 1);
        java.util.List<java.lang.Double> doubleList13 = product5.getPriceHistory();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(doubleList13);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getName();
        product5.setDescription("hi!");
        product5.setPrice((java.lang.Double) 1.0d);
        java.lang.String str13 = product5.getName();
        int int14 = product5.getQuantity();
        java.lang.String str15 = product5.toString();
        java.lang.Class<?> wildcardClass16 = product5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Product{id=0, name='hi!', description='hi!', price=1.0, quantity=0}" + "'", str15, "Product{id=0, name='hi!', description='hi!', price=1.0, quantity=0}");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        int int8 = product5.getQuantity();
        product5.setDescription("hi!");
        java.util.List<java.lang.Double> doubleList11 = product5.getPriceHistory();
        product5.setDescription("Product{id=100, name='hi!', description='', price=10.0, quantity=0}");
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.String str16 = product5.getDescription();
        product5.setName("Product{id=0, name='', description='', price=1.0, quantity=-1}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleList11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Product{id=100, name='hi!', description='', price=10.0, quantity=0}" + "'", str16, "Product{id=100, name='hi!', description='', price=10.0, quantity=0}");
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        product5.setQuantity(1);
        product5.setQuantity((int) (byte) 100);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.String str11 = product5.getDescription();
        product5.setPrice((java.lang.Double) 0.0d);
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setQuantity((int) '#');
        product5.setId((java.lang.Long) 100L);
        product5.setDescription("Product{id=0, name='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=0}");
        java.util.List<java.lang.Double> doubleList17 = product5.getPriceHistory();
        product5.setPrice((java.lang.Double) 10.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleList17);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.String str7 = product5.toString();
        java.lang.Long long8 = product5.getId();
        java.lang.String str9 = product5.getDescription();
        java.lang.String str10 = product5.getDescription();
        java.lang.String str11 = product5.getDescription();
        product5.setId((java.lang.Long) 0L);
        product5.setDescription("Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}");
        java.lang.Long long16 = product5.getId();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str7, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        java.lang.Long long9 = product5.getId();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.addPriceToHistory((java.lang.Double) (-1.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "", "", (java.lang.Double) 0.0d, (int) (short) -1);
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        product5.setQuantity((int) (byte) 100);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        int int8 = product5.getQuantity();
        java.util.List<java.lang.Double> doubleList9 = product5.getPriceHistory();
        java.lang.String str10 = product5.getDescription();
        java.lang.Long long11 = product5.getId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "Product{id=-1, name='hi!', description='', price=-1.0, quantity=0}", "Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=100}", (java.lang.Double) 10.0d, 0);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
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
        java.lang.String str23 = product5.toString();
        java.lang.String str24 = product5.getName();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=1}" + "'", str23, "Product{id=0, name='hi!', description='', price=1.0, quantity=1}");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) (-1.0d));
        java.lang.String str12 = product5.getDescription();
        product5.setName("Product{id=0, name='hi!', description='', price=0.0, quantity=0}");
        product5.setName("Product{id=100, name='hi!', description='', price=10.0, quantity=0}");
        product5.setId((java.lang.Long) 0L);
        java.lang.Double double19 = product5.getPrice();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
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
        java.lang.Class<?> wildcardClass19 = doubleList18.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertNotNull(doubleList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.lang.Double double10 = product5.getPrice();
        java.lang.String str11 = product5.getName();
        product5.setDescription("Product{id=100, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='', price=10.0, quantity=0}");
        java.lang.String str14 = product5.getDescription();
        java.lang.String str15 = product5.toString();
        java.lang.String str16 = product5.toString();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Product{id=100, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='', price=10.0, quantity=0}" + "'", str14, "Product{id=100, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Product{id=0, name='hi!', description='Product{id=100, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='', price=10.0, quantity=0}', price=1.0, quantity=0}" + "'", str15, "Product{id=0, name='hi!', description='Product{id=100, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='', price=10.0, quantity=0}', price=1.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Product{id=0, name='hi!', description='Product{id=100, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='', price=10.0, quantity=0}', price=1.0, quantity=0}" + "'", str16, "Product{id=0, name='hi!', description='Product{id=100, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='', price=10.0, quantity=0}', price=1.0, quantity=0}");
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.String str7 = product5.toString();
        product5.setDescription("Product{id=0, name='hi!', description='', price=-1.0, quantity=0}");
        product5.setName("Product{id=0, name='Product{id=100, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=0.0, quantity=0}', description='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', price=10.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str7, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}", "Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}", (java.lang.Double) 0.0d, 35);
        product5.setDescription("Product{id=-1, name='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', description='Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}', price=10.0, quantity=32}");
        product5.setDescription("Product{id=0, name='hi!', description='', price=0.0, quantity=0}");
        java.lang.String str10 = product5.getName();
        int int11 = product5.getQuantity();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}" + "'", str10, "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.lang.Double double10 = product5.getPrice();
        java.lang.Long long11 = product5.getId();
        int int12 = product5.getQuantity();
        java.lang.Long long13 = product5.getId();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.String str8 = product5.getDescription();
        java.util.List<java.lang.Double> doubleList9 = product5.getPriceHistory();
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.String str12 = product5.getName();
        product5.setQuantity((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(doubleList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
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
        product5.setPrice((java.lang.Double) 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}" + "'", str13, "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) (-1.0d), (int) (byte) 100);
        java.lang.Double double6 = product5.getPrice();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.util.List<java.lang.Double> doubleList7 = product5.getPriceHistory();
        java.lang.Long long8 = product5.getId();
        product5.setId((java.lang.Long) 10L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(doubleList7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getName();
        product5.setName("");
        product5.setDescription("");
        java.lang.String str13 = product5.getDescription();
        product5.setPrice((java.lang.Double) 100.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        java.lang.String str9 = product5.getDescription();
        product5.setId((java.lang.Long) 10L);
        int int12 = product5.getQuantity();
        java.lang.String str13 = product5.getDescription();
        product5.setPrice((java.lang.Double) 0.0d);
        product5.setPrice((java.lang.Double) 100.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "", "", (java.lang.Double) (-1.0d), (int) (byte) 100);
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        product5.setDescription("Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}");
        java.lang.Long long10 = product5.getId();
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        product5.setQuantity((int) (short) 10);
        java.lang.String str9 = product5.toString();
        java.lang.Long long10 = product5.getId();
        product5.setDescription("");
        product5.setId((java.lang.Long) 10L);
        java.lang.Double double15 = product5.getPrice();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=10}" + "'", str9, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}", "Product{id=100, name='hi!', description='', price=1.0, quantity=10}", (java.lang.Double) (-1.0d), (int) (short) 100);
        java.lang.String str6 = product5.getName();
        java.util.List<java.lang.Double> doubleList7 = product5.getPriceHistory();
        product5.setName("hi!");
        java.lang.String str10 = product5.toString();
        java.lang.Long long11 = product5.getId();
        product5.setPrice((java.lang.Double) 0.0d);
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}" + "'", str6, "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=100}" + "'", str10, "Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=100}");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getName();
        product5.setName("");
        product5.setName("Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        java.lang.String str13 = product5.getDescription();
        product5.addPriceToHistory((java.lang.Double) 10.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getName();
        product5.setQuantity((int) (byte) -1);
        product5.addPriceToHistory((java.lang.Double) 1.0d);
        product5.setQuantity((int) (byte) 1);
        java.lang.String str15 = product5.getDescription();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getName();
        product5.setName("");
        java.lang.String str11 = product5.getDescription();
        product5.setDescription("Product{id=100, name='hi!', description='', price=0.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
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
        product5.setId((java.lang.Long) 100L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=100, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='', price=10.0, quantity=0}", "Product{id=100, name='hi!', description='', price=100.0, quantity=0}", (java.lang.Double) 10.0d, 52);
        product5.setPrice((java.lang.Double) 10.0d);
        java.lang.String str8 = product5.toString();
        java.lang.String str9 = product5.getName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Product{id=1, name='Product{id=100, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='', price=10.0, quantity=0}', description='Product{id=100, name='hi!', description='', price=100.0, quantity=0}', price=10.0, quantity=52}" + "'", str8, "Product{id=1, name='Product{id=100, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='', price=10.0, quantity=0}', description='Product{id=100, name='hi!', description='', price=100.0, quantity=0}', price=10.0, quantity=52}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=100, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='', price=10.0, quantity=0}" + "'", str9, "Product{id=100, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='', price=10.0, quantity=0}");
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "Product{id=100, name='Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=100}', description='', price=1.0, quantity=0}", "Product{id=100, name='hi!', description='', price=-1.0, quantity=0}", (java.lang.Double) (-1.0d), 97);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}", "Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}", (java.lang.Double) 0.0d, 100);
        product5.addPriceToHistory((java.lang.Double) 1.0d);
        java.lang.Double double8 = product5.getPrice();
        java.lang.Class<?> wildcardClass9 = product5.getClass();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 0.0d);
        int int11 = product5.getQuantity();
        java.lang.String str12 = product5.getName();
        java.lang.String str13 = product5.toString();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=0, name='hi!', description='', price=0.0, quantity=0}" + "'", str13, "Product{id=0, name='hi!', description='', price=0.0, quantity=0}");
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setQuantity((int) '#');
        product5.setDescription("");
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        product5.setName("Product{id=100, name='hi!', description='', price=10.0, quantity=0}");
        java.util.List<java.lang.Double> doubleList19 = product5.getPriceHistory();
        java.lang.Long long20 = product5.getId();
        java.lang.Double double21 = product5.getPrice();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleList19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 100L + "'", long20 == 100L);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setId((java.lang.Long) 10L);
        java.lang.Long long14 = product5.getId();
        java.lang.Double double15 = product5.getPrice();
        product5.setName("Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}");
        java.lang.String str18 = product5.getName();
        java.lang.Class<?> wildcardClass19 = product5.getClass();
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}" + "'", str18, "Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setName("hi!");
        int int8 = product5.getQuantity();
        product5.setDescription("Product{id=0, name='Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}', description='Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}', price=0.0, quantity=100}");
        java.lang.Double double11 = product5.getPrice();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        java.lang.Long long10 = product5.getId();
        product5.setId((java.lang.Long) 10L);
        int int13 = product5.getQuantity();
        java.lang.Long long14 = product5.getId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=100, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=0}', price=10.0, quantity=-1}", "Product{id=-1, name='hi!', description='', price=0.0, quantity=100}", (java.lang.Double) 10.0d, 100);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
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
        java.util.List<java.lang.Double> doubleList18 = product5.getPriceHistory();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Product{id=100, name='hi!', description='', price=10.0, quantity=35}" + "'", str15, "Product{id=100, name='hi!', description='', price=10.0, quantity=35}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertNotNull(doubleList18);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
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
        product5.setQuantity((int) (byte) -1);
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str7, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
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
        product5.setDescription("Product{id=100, name='hi!', description='', price=1.0, quantity=35}");
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
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.String str7 = product5.toString();
        java.lang.Long long8 = product5.getId();
        java.lang.String str9 = product5.getDescription();
        java.lang.String str10 = product5.getDescription();
        product5.setPrice((java.lang.Double) 0.0d);
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str7, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
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
        java.lang.String str19 = product5.getDescription();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Product{id=0, name='hi!', description='hi!', price=1.0, quantity=0}" + "'", str15, "Product{id=0, name='hi!', description='hi!', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        int int8 = product5.getQuantity();
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        product5.setId((java.lang.Long) 10L);
        product5.setQuantity(0);
        java.lang.Long long15 = product5.getId();
        java.util.List<java.lang.Double> doubleList16 = product5.getPriceHistory();
        java.lang.String str17 = product5.getDescription();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertNotNull(doubleList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=0}', description='hi!', price=1.0, quantity=35}", "Product{id=100, name='hi!', description='', price=1.0, quantity=100}", (java.lang.Double) 1.0d, 0);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setName("");
        java.lang.Double double14 = product5.getPrice();
        product5.setName("Product{id=1, name='', description='', price=-1.0, quantity=100}");
        product5.setQuantity(97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        int int8 = product5.getQuantity();
        product5.setDescription("hi!");
        java.util.List<java.lang.Double> doubleList11 = product5.getPriceHistory();
        product5.setPrice((java.lang.Double) (-1.0d));
        java.lang.String str14 = product5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Product{id=100, name='hi!', description='hi!', price=-1.0, quantity=0}" + "'", str14, "Product{id=100, name='hi!', description='hi!', price=-1.0, quantity=0}");
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "", "", (java.lang.Double) 0.0d, (int) (short) -1);
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        product5.setDescription("Product{id=0, name='Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}', description='Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}', price=1.0, quantity=0}");
        product5.setName("Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        product5.setId((java.lang.Long) 10L);
        product5.setQuantity(0);
        product5.setId((java.lang.Long) 1L);
        java.lang.String str18 = product5.toString();
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Product{id=1, name='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', description='Product{id=0, name='Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}', description='Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}', price=1.0, quantity=0}', price=0.0, quantity=0}" + "'", str18, "Product{id=1, name='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', description='Product{id=0, name='Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}', description='Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}', price=1.0, quantity=0}', price=0.0, quantity=0}");
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        int int8 = product5.getQuantity();
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        product5.setId((java.lang.Long) 10L);
        product5.setQuantity(0);
        java.util.List<java.lang.Double> doubleList15 = product5.getPriceHistory();
        java.lang.String str16 = product5.toString();
        int int17 = product5.getQuantity();
        java.lang.String str18 = product5.getDescription();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Product{id=10, name='hi!', description='', price=1.0, quantity=0}" + "'", str16, "Product{id=10, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getName();
        product5.setDescription("hi!");
        product5.setPrice((java.lang.Double) 1.0d);
        product5.setDescription("");
        product5.setDescription("Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}");
        product5.setDescription("Product{id=-1, name='hi!', description='', price=0.0, quantity=100}");
        product5.setDescription("Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        java.lang.Class<?> wildcardClass21 = product5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "", "", (java.lang.Double) 0.0d, (int) (byte) 10);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getName();
        product5.setDescription("hi!");
        product5.setPrice((java.lang.Double) 1.0d);
        java.lang.String str13 = product5.getName();
        int int14 = product5.getQuantity();
        product5.setDescription("Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        product5.setQuantity(35);
        product5.setName("Product{id=100, name='', description='', price=10.0, quantity=0}");
        product5.setDescription("Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
        java.lang.String str23 = product5.getDescription();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=10}" + "'", str23, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=100, name='hi!', description='', price=10.0, quantity=0}", "hi!", (java.lang.Double) 1.0d, 52);
        product5.setPrice((java.lang.Double) 1.0d);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setQuantity((int) (byte) 0);
        java.lang.String str11 = product5.toString();
        product5.setQuantity(100);
        java.lang.String str14 = product5.getDescription();
        product5.setPrice((java.lang.Double) (-1.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str11, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) 10.0d);
        java.lang.String str12 = product5.getDescription();
        product5.setPrice((java.lang.Double) 0.0d);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str17 = product5.getName();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.util.List<java.lang.Double> doubleList10 = product5.getPriceHistory();
        java.lang.String str11 = product5.getName();
        java.lang.String str12 = product5.toString();
        java.lang.String str13 = product5.toString();
        java.lang.String str14 = product5.getDescription();
        product5.setPrice((java.lang.Double) (-1.0d));
        java.lang.Long long17 = product5.getId();
        org.junit.Assert.assertNotNull(doubleList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str12, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str13, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.String str8 = product5.getDescription();
        java.util.List<java.lang.Double> doubleList9 = product5.getPriceHistory();
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.String str12 = product5.getName();
        product5.setDescription("");
        int int15 = product5.getQuantity();
        java.lang.Long long16 = product5.getId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(doubleList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.String str12 = product5.getDescription();
        java.lang.String str13 = product5.getName();
        product5.setName("Product{id=0, name='hi!', description='Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}', price=0.0, quantity=0}");
        java.lang.String str16 = product5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Product{id=100, name='Product{id=0, name='hi!', description='Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}', price=0.0, quantity=0}', description='', price=0.0, quantity=0}" + "'", str16, "Product{id=100, name='Product{id=0, name='hi!', description='Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}', price=0.0, quantity=0}', description='', price=0.0, quantity=0}");
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.Long long7 = product5.getId();
        int int8 = product5.getQuantity();
        product5.setName("Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}");
        product5.setId((java.lang.Long) (-1L));
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        java.lang.String str9 = product5.getDescription();
        java.lang.String str10 = product5.getName();
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        java.lang.Class<?> wildcardClass13 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.Double double8 = product5.getPrice();
        product5.setId((java.lang.Long) (-1L));
        java.lang.String str11 = product5.getName();
        java.util.List<java.lang.Double> doubleList12 = product5.getPriceHistory();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(doubleList12);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.String str7 = product5.toString();
        java.lang.Long long8 = product5.getId();
        java.lang.String str9 = product5.getDescription();
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        java.util.List<java.lang.Double> doubleList12 = product5.getPriceHistory();
        java.lang.String str13 = product5.getName();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str7, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(doubleList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setQuantity((int) (short) 1);
        product5.setQuantity((int) (short) 100);
        java.lang.String str12 = product5.getName();
        product5.setDescription("Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
        java.util.List<java.lang.Double> doubleList15 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 100L);
        product5.setDescription("Product{id=0, name='Product{id=10, name='hi!', description='', price=10.0, quantity=0}', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=0.0, quantity=-1}");
        java.lang.Double double20 = product5.getPrice();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(doubleList15);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "Product{id=100, name='', description='', price=10.0, quantity=0}", "Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}", (java.lang.Double) 1.0d, (int) '#');
        int int6 = product5.getQuantity();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        java.lang.String str11 = product5.getDescription();
        java.lang.Double double12 = product5.getPrice();
        product5.setDescription("Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        product5.setDescription("Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        java.lang.Class<?> wildcardClass17 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        product5.setName("hi!");
        java.lang.String str10 = product5.toString();
        java.lang.Long long11 = product5.getId();
        java.lang.String str12 = product5.getName();
        java.util.List<java.lang.Double> doubleList13 = product5.getPriceHistory();
        int int14 = product5.getQuantity();
        product5.setQuantity((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str10, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(doubleList13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=100, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='', price=10.0, quantity=0}", "Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}", (java.lang.Double) (-1.0d), (int) ' ');
        java.lang.String str6 = product5.getDescription();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}" + "'", str6, "Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}");
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setName("");
        java.lang.String str14 = product5.toString();
        product5.setQuantity(0);
        java.lang.Long long17 = product5.getId();
        product5.setPrice((java.lang.Double) 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str14, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
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
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}" + "'", str20, "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}");
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
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
        java.lang.String str20 = product5.getDescription();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Product{id=0, name='hi!', description='hi!', price=1.0, quantity=0}" + "'", str15, "Product{id=0, name='hi!', description='hi!', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Product{id=0, name='hi!', description='hi!', price=1.0, quantity=0}" + "'", str19, "Product{id=0, name='hi!', description='hi!', price=1.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        int int11 = product5.getQuantity();
        java.util.List<java.lang.Double> doubleList12 = product5.getPriceHistory();
        int int13 = product5.getQuantity();
        product5.setId((java.lang.Long) 1L);
        java.lang.Double double16 = product5.getPrice();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(doubleList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        java.lang.Double double11 = product5.getPrice();
        product5.setId((java.lang.Long) 10L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "", "", (java.lang.Double) 0.0d, (int) (short) -1);
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        product5.setDescription("Product{id=0, name='Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}', description='Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}', price=1.0, quantity=0}");
        product5.setName("Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        product5.setId((java.lang.Long) 10L);
        java.lang.Double double14 = product5.getPrice();
        java.lang.String str15 = product5.getName();
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str15, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getName();
        product5.setDescription("hi!");
        product5.setPrice((java.lang.Double) 1.0d);
        java.lang.String str13 = product5.getName();
        int int14 = product5.getQuantity();
        product5.setDescription("Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        product5.setName("Product{id=100, name='', description='', price=10.0, quantity=0}");
        java.lang.Class<?> wildcardClass19 = product5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setDescription("Product{id=-1, name='hi!', description='', price=0.0, quantity=100}");
        product5.setDescription("Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}");
        product5.addPriceToHistory((java.lang.Double) 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        int int8 = product5.getQuantity();
        product5.setDescription("hi!");
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setId((java.lang.Long) 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setName("");
        java.lang.String str14 = product5.toString();
        product5.setQuantity(0);
        java.lang.Long long17 = product5.getId();
        product5.setDescription("");
        java.lang.Class<?> wildcardClass20 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str14, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.lang.Double double10 = product5.getPrice();
        java.lang.String str11 = product5.getName();
        product5.setName("Product{id=10, name='Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}', description='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', price=10.0, quantity=100}");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        product5.setQuantity((int) (short) 10);
        java.lang.Double double9 = product5.getPrice();
        java.lang.String str10 = product5.getDescription();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
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
        int int19 = product5.getQuantity();
        product5.setQuantity(100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.lang.Double double10 = product5.getPrice();
        java.lang.Long long11 = product5.getId();
        java.lang.Long long12 = product5.getId();
        product5.setQuantity((int) (short) 0);
        int int15 = product5.getQuantity();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        product5.setDescription("Product{id=-1, name='hi!', description='', price=0.0, quantity=100}");
        product5.setQuantity((int) (byte) 100);
        java.lang.String str13 = product5.getDescription();
        product5.setPrice((java.lang.Double) (-1.0d));
        product5.setPrice((java.lang.Double) 10.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=-1, name='hi!', description='', price=0.0, quantity=100}" + "'", str13, "Product{id=-1, name='hi!', description='', price=0.0, quantity=100}");
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.lang.String str10 = product5.getDescription();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}", "Product{id=1, name='hi!', description='', price=1.0, quantity=0}", (java.lang.Double) 0.0d, 100);
        product5.setId((java.lang.Long) 100L);
        java.lang.Double double8 = product5.getPrice();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        product5.setDescription("Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}");
        java.lang.Long long13 = product5.getId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "Product{id=100, name='', description='', price=10.0, quantity=0}", "Product{id=100, name='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', description='', price=1.0, quantity=0}", (java.lang.Double) (-1.0d), (int) (short) -1);
        java.lang.Double double6 = product5.getPrice();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
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
        product5.setId((java.lang.Long) 10L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=0, name='hi!', description='', price=1.0, quantity=0}", "Product{id=100, name='', description='', price=10.0, quantity=0}", (java.lang.Double) (-1.0d), (int) '#');
        product5.setId((java.lang.Long) 10L);
        java.util.List<java.lang.Double> doubleList8 = product5.getPriceHistory();
        java.lang.String str9 = product5.getDescription();
        product5.setPrice((java.lang.Double) 1.0d);
        org.junit.Assert.assertNotNull(doubleList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str9, "Product{id=100, name='', description='', price=10.0, quantity=0}");
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=100, name='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', description='', price=1.0, quantity=0}", "Product{id=0, name='hi!', description='', price=0.0, quantity=0}", (java.lang.Double) 0.0d, (int) (byte) -1);
        product5.setPrice((java.lang.Double) 10.0d);
        java.lang.String str8 = product5.toString();
        product5.setName("Product{id=0, name='hi!', description='', price=-1.0, quantity=0}");
        product5.setName("Product{id=100, name='', description='', price=10.0, quantity=0}");
        java.lang.String str13 = product5.getName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Product{id=1, name='Product{id=100, name='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', description='', price=1.0, quantity=0}', description='Product{id=0, name='hi!', description='', price=0.0, quantity=0}', price=10.0, quantity=-1}" + "'", str8, "Product{id=1, name='Product{id=100, name='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', description='', price=1.0, quantity=0}', description='Product{id=0, name='hi!', description='', price=0.0, quantity=0}', price=10.0, quantity=-1}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str13, "Product{id=100, name='', description='', price=10.0, quantity=0}");
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        java.lang.String str9 = product5.getName();
        product5.setQuantity((int) (short) -1);
        int int12 = product5.getQuantity();
        java.lang.String str13 = product5.getDescription();
        product5.setDescription("Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
        product5.setPrice((java.lang.Double) 100.0d);
        int int18 = product5.getQuantity();
        java.lang.Double double19 = product5.getPrice();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.Long long7 = product5.getId();
        int int8 = product5.getQuantity();
        product5.setName("Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}");
        java.lang.String str11 = product5.getDescription();
        java.lang.Long long12 = product5.getId();
        product5.setName("Product{id=10, name='Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}', description='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', price=10.0, quantity=100}");
        product5.setPrice((java.lang.Double) 10.0d);
        int int17 = product5.getQuantity();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.Long long7 = product5.getId();
        java.lang.Long long8 = product5.getId();
        product5.setName("Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}");
        java.lang.String str11 = product5.getDescription();
        product5.setName("Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=100}");
        java.lang.String str14 = product5.toString();
        java.lang.String str15 = product5.toString();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Product{id=100, name='Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=100}', description='', price=1.0, quantity=0}" + "'", str14, "Product{id=100, name='Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=100}', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Product{id=100, name='Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=100}', description='', price=1.0, quantity=0}" + "'", str15, "Product{id=100, name='Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=100}', description='', price=1.0, quantity=0}");
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setName("");
        java.lang.String str14 = product5.toString();
        java.lang.Double double15 = product5.getPrice();
        java.lang.String str16 = product5.getDescription();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str14, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "", "", (java.lang.Double) 0.0d, (int) (short) -1);
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        product5.setDescription("Product{id=0, name='Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}', description='Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}', price=1.0, quantity=0}");
        product5.addPriceToHistory((java.lang.Double) 0.0d);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.String str12 = product5.getDescription();
        product5.setPrice((java.lang.Double) (-1.0d));
        java.lang.String str15 = product5.toString();
        java.lang.String str16 = product5.getName();
        product5.setId((java.lang.Long) 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Product{id=100, name='hi!', description='', price=-1.0, quantity=0}" + "'", str15, "Product{id=100, name='hi!', description='', price=-1.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}", "Product{id=10, name='hi!', description='', price=10.0, quantity=0}", (java.lang.Double) 0.0d, (int) 'a');
        java.lang.String str6 = product5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=0, name='Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}', description='Product{id=10, name='hi!', description='', price=10.0, quantity=0}', price=0.0, quantity=97}" + "'", str6, "Product{id=0, name='Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}', description='Product{id=10, name='hi!', description='', price=10.0, quantity=0}', price=0.0, quantity=97}");
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 0L);
        java.lang.String str9 = product5.getDescription();
        java.lang.Double double10 = product5.getPrice();
        java.lang.String str11 = product5.toString();
        product5.setPrice((java.lang.Double) 10.0d);
        java.lang.Double double14 = product5.getPrice();
        product5.setQuantity((int) ' ');
        product5.setQuantity((int) ' ');
        product5.setDescription("Product{id=1, name='hi!', description='Product{id=-1, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str11, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", "hi!", (java.lang.Double) 100.0d, (int) '#');
        int int6 = product5.getQuantity();
        product5.setName("Product{id=100, name='', description='', price=10.0, quantity=0}");
        java.lang.Double double9 = product5.getPrice();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setId((java.lang.Long) (-1L));
        java.lang.Long long14 = product5.getId();
        product5.setPrice((java.lang.Double) 1.0d);
        java.lang.String str17 = product5.getName();
        java.lang.Double double18 = product5.getPrice();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str17, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=100, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}", "Product{id=100, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=0}', price=10.0, quantity=-1}", (java.lang.Double) 0.0d, (int) 'a');
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.util.List<java.lang.Double> doubleList7 = product5.getPriceHistory();
        product5.setQuantity((int) (short) 100);
        java.lang.Long long10 = product5.getId();
        java.lang.Double double11 = product5.getPrice();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(doubleList7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=0, name='hi!', description='', price=1.0, quantity=0}", "Product{id=100, name='', description='', price=10.0, quantity=0}", (java.lang.Double) (-1.0d), (int) '#');
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.String str7 = product5.toString();
        product5.setQuantity(0);
        java.lang.String str10 = product5.getDescription();
        java.lang.Double double11 = product5.getPrice();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=-1, name='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=-1.0, quantity=35}" + "'", str7, "Product{id=-1, name='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=-1.0, quantity=35}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str10, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        product5.setQuantity((int) (short) 1);
        int int10 = product5.getQuantity();
        product5.setName("Product{id=10, name='hi!', description='', price=1.0, quantity=10}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        java.lang.String str11 = product5.getDescription();
        java.lang.String str12 = product5.toString();
        product5.setPrice((java.lang.Double) 100.0d);
        java.lang.String str15 = product5.toString();
        java.lang.String str16 = product5.getName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Product{id=100, name='hi!', description='', price=10.0, quantity=0}" + "'", str12, "Product{id=100, name='hi!', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Product{id=100, name='hi!', description='', price=100.0, quantity=0}" + "'", str15, "Product{id=100, name='hi!', description='', price=100.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "", "", (java.lang.Double) 0.0d, (int) (byte) 100);
        product5.setName("Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}");
        java.lang.Double double8 = product5.getPrice();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
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
        int int21 = product5.getQuantity();
        java.lang.Class<?> wildcardClass22 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(doubleList16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.Double double8 = product5.getPrice();
        product5.setQuantity((int) (byte) 0);
        product5.setDescription("Product{id=0, name='hi!', description='', price=0.0, quantity=0}");
        java.lang.Long long13 = product5.getId();
        java.util.List<java.lang.Double> doubleList14 = product5.getPriceHistory();
        java.lang.String str15 = product5.toString();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(doubleList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Product{id=0, name='hi!', description='Product{id=0, name='hi!', description='', price=0.0, quantity=0}', price=1.0, quantity=0}" + "'", str15, "Product{id=0, name='hi!', description='Product{id=0, name='hi!', description='', price=0.0, quantity=0}', price=1.0, quantity=0}");
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}", "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", (java.lang.Double) 100.0d, (int) '4');
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Long long8 = product5.getId();
        java.lang.String str9 = product5.getName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str7, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=10}" + "'", str9, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
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
        product5.setDescription("Product{id=100, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=0}', price=10.0, quantity=-1}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Product{id=100, name='hi!', description='', price=100.0, quantity=0}" + "'", str14, "Product{id=100, name='hi!', description='', price=100.0, quantity=0}");
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
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
        product5.setId((java.lang.Long) 1L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(doubleList16);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        java.lang.Long long10 = product5.getId();
        product5.setQuantity((int) (short) 100);
        java.util.List<java.lang.Double> doubleList13 = product5.getPriceHistory();
        java.lang.String str14 = product5.getName();
        java.lang.String str15 = product5.getDescription();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertNotNull(doubleList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "hi!", "", (java.lang.Double) 0.0d, (int) (byte) 100);
        product5.addPriceToHistory((java.lang.Double) 10.0d);
        java.util.List<java.lang.Double> doubleList8 = product5.getPriceHistory();
        product5.setDescription("Product{id=10, name='Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}', description='', price=0.0, quantity=100}");
        org.junit.Assert.assertNotNull(doubleList8);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) (-1.0d));
        java.lang.String str12 = product5.getDescription();
        java.lang.Long long13 = product5.getId();
        java.lang.String str14 = product5.getDescription();
        java.lang.Class<?> wildcardClass15 = product5.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setName("");
        java.lang.Long long11 = product5.getId();
        java.lang.Long long12 = product5.getId();
        java.lang.Double double13 = product5.getPrice();
        java.lang.Class<?> wildcardClass14 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=100, name='hi!', description='', price=10.0, quantity=0}", "Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}", (java.lang.Double) (-1.0d), (int) (short) 0);
        int int6 = product5.getQuantity();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.Long long7 = product5.getId();
        java.lang.Long long8 = product5.getId();
        int int9 = product5.getQuantity();
        java.lang.String str10 = product5.toString();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str10, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        int int8 = product5.getQuantity();
        product5.setDescription("hi!");
        java.util.List<java.lang.Double> doubleList11 = product5.getPriceHistory();
        java.lang.String str12 = product5.getName();
        java.lang.String str13 = product5.toString();
        product5.setPrice((java.lang.Double) (-1.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}" + "'", str13, "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}");
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setId((java.lang.Long) 10L);
        java.lang.Long long14 = product5.getId();
        java.lang.Double double15 = product5.getPrice();
        product5.setName("Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}");
        java.lang.String str18 = product5.getName();
        product5.setQuantity(97);
        product5.setQuantity((int) (short) 10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}" + "'", str18, "Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}");
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        product5.setName("hi!");
        java.lang.Long long10 = product5.getId();
        java.lang.Long long11 = product5.getId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=100, name='hi!', description='', price=1.0, quantity=10}", "Product{id=0, name='hi!', description='', price=1.0, quantity=0}", (java.lang.Double) 0.0d, (int) (short) -1);
        java.lang.Long long6 = product5.getId();
        java.lang.String str7 = product5.getName();
        java.lang.Long long8 = product5.getId();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=10}" + "'", str7, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setQuantity((int) (short) 1);
        product5.setQuantity((int) (short) 100);
        java.lang.String str12 = product5.getName();
        product5.setDescription("Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
        java.util.List<java.lang.Double> doubleList15 = product5.getPriceHistory();
        product5.setDescription("Product{id=10, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=10.0, quantity=35}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(doubleList15);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "Product{id=1, name='hi!', description='Product{id=-1, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}", "Product{id=1, name='Product{id=100, name='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', description='', price=1.0, quantity=0}', description='Product{id=0, name='hi!', description='', price=0.0, quantity=0}', price=10.0, quantity=-1}", (java.lang.Double) 100.0d, (-1));
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.lang.Double double10 = product5.getPrice();
        product5.setId((java.lang.Long) 10L);
        java.util.List<java.lang.Double> doubleList13 = product5.getPriceHistory();
        java.util.List<java.lang.Double> doubleList14 = product5.getPriceHistory();
        java.lang.Double double15 = product5.getPrice();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertNotNull(doubleList13);
        org.junit.Assert.assertNotNull(doubleList14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getDescription();
        int int9 = product5.getQuantity();
        product5.addPriceToHistory((java.lang.Double) (-1.0d));
        java.util.List<java.lang.Double> doubleList12 = product5.getPriceHistory();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(doubleList12);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=0, name='hi!', description='hi!', price=1.0, quantity=100}", "Product{id=0, name='hi!', description='', price=1.0, quantity=0}", (java.lang.Double) 10.0d, (int) (byte) -1);
        java.lang.String str6 = product5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=0, name='hi!', description='hi!', price=1.0, quantity=100}" + "'", str6, "Product{id=0, name='hi!', description='hi!', price=1.0, quantity=100}");
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.util.List<java.lang.Double> doubleList7 = product5.getPriceHistory();
        java.lang.Double double8 = product5.getPrice();
        java.lang.String str9 = product5.toString();
        java.lang.String str10 = product5.getDescription();
        product5.setName("Product{id=10, name='hi!', description='', price=1.0, quantity=10}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(doubleList7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str9, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
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
        java.lang.String str19 = product5.toString();
        java.util.List<java.lang.Double> doubleList20 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 10L);
        product5.setName("Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str14, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str16, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Product{id=100, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='', price=10.0, quantity=0}" + "'", str19, "Product{id=100, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList20);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "", "Product{id=10, name='hi!', description='', price=10.0, quantity=0}", (java.lang.Double) 0.0d, (int) (short) 0);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
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
        java.lang.String str18 = product5.getDescription();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertNotNull(doubleList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=100}" + "'", str16, "Product{id=100, name='hi!', description='', price=1.0, quantity=100}");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) (-1.0d));
        java.lang.String str12 = product5.getDescription();
        java.lang.Long long13 = product5.getId();
        int int14 = product5.getQuantity();
        product5.addPriceToHistory((java.lang.Double) (-1.0d));
        product5.setName("Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        java.lang.Double double19 = product5.getPrice();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.util.List<java.lang.Double> doubleList10 = product5.getPriceHistory();
        java.lang.String str11 = product5.getDescription();
        product5.setName("Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        product5.setName("Product{id=10, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=10.0, quantity=35}");
        product5.setName("Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        java.lang.String str18 = product5.getDescription();
        org.junit.Assert.assertNotNull(doubleList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setName("");
        java.lang.Long long11 = product5.getId();
        int int12 = product5.getQuantity();
        product5.setDescription("Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}");
        product5.setPrice((java.lang.Double) (-1.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.String str7 = product5.toString();
        java.lang.Long long8 = product5.getId();
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.Double double11 = product5.getPrice();
        java.lang.String str12 = product5.getDescription();
        product5.addPriceToHistory((java.lang.Double) (-1.0d));
        product5.setName("Product{id=-1, name='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', description='Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}', price=10.0, quantity=32}");
        java.lang.Double double17 = product5.getPrice();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str7, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        int int8 = product5.getQuantity();
        product5.setDescription("hi!");
        product5.setPrice((java.lang.Double) 10.0d);
        java.lang.Class<?> wildcardClass13 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setName("Product{id=100, name='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', description='', price=10.0, quantity=0}");
        java.lang.Class<?> wildcardClass13 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.Double double8 = product5.getPrice();
        java.lang.String str9 = product5.toString();
        java.lang.Double double10 = product5.getPrice();
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        java.lang.String str13 = product5.toString();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str9, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str13, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.String str7 = product5.toString();
        java.lang.Long long8 = product5.getId();
        product5.setPrice((java.lang.Double) 0.0d);
        product5.setDescription("Product{id=0, name='hi!', description='', price=-1.0, quantity=0}");
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) (-1.0d));
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str7, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=100, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='', price=10.0, quantity=0}", "Product{id=100, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=0.0, quantity=0}", (java.lang.Double) 0.0d, (int) '4');
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.Double double7 = product5.getPrice();
        java.lang.Class<?> wildcardClass8 = product5.getClass();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=0, name='hi!', description='hi!', price=1.0, quantity=100}", "Product{id=100, name='hi!', description='', price=1.0, quantity=10}", (java.lang.Double) 1.0d, (int) '4');
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.Long long7 = product5.getId();
        int int8 = product5.getQuantity();
        java.lang.String str9 = product5.getDescription();
        int int10 = product5.getQuantity();
        java.lang.Long long11 = product5.getId();
        int int12 = product5.getQuantity();
        java.lang.String str13 = product5.getDescription();
        java.lang.Class<?> wildcardClass14 = product5.getClass();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", "hi!", (java.lang.Double) 100.0d, (int) '#');
        int int6 = product5.getQuantity();
        product5.setName("Product{id=100, name='', description='', price=10.0, quantity=0}");
        java.lang.String str9 = product5.getName();
        product5.setName("Product{id=-1, name='hi!', description='', price=0.0, quantity=100}");
        product5.setName("Product{id=-1, name='hi!', description='', price=0.0, quantity=100}");
        product5.setDescription("hi!");
        java.lang.Double double16 = product5.getPrice();
        java.lang.String str17 = product5.getName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str9, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Product{id=-1, name='hi!', description='', price=0.0, quantity=100}" + "'", str17, "Product{id=-1, name='hi!', description='', price=0.0, quantity=100}");
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setName("");
        java.lang.String str14 = product5.toString();
        java.lang.Long long15 = product5.getId();
        product5.setId((java.lang.Long) 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str14, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getName();
        product5.setDescription("hi!");
        product5.setPrice((java.lang.Double) 1.0d);
        product5.setDescription("");
        product5.setDescription("Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}");
        product5.setDescription("Product{id=-1, name='hi!', description='', price=0.0, quantity=100}");
        product5.setPrice((java.lang.Double) (-1.0d));
        java.lang.String str21 = product5.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Product{id=0, name='hi!', description='Product{id=-1, name='hi!', description='', price=0.0, quantity=100}', price=-1.0, quantity=0}" + "'", str21, "Product{id=0, name='hi!', description='Product{id=-1, name='hi!', description='', price=0.0, quantity=100}', price=-1.0, quantity=0}");
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        product5.setName("hi!");
        int int10 = product5.getQuantity();
        java.lang.String str11 = product5.getDescription();
        java.lang.String str12 = product5.getDescription();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        product5.setId((java.lang.Long) 1L);
        product5.setPrice((java.lang.Double) 1.0d);
        java.util.List<java.lang.Double> doubleList14 = product5.getPriceHistory();
        java.lang.String str15 = product5.getName();
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setName("Product{id=100, name='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        product5.setQuantity((int) (short) 10);
        java.lang.String str9 = product5.toString();
        java.lang.Long long10 = product5.getId();
        java.lang.String str11 = product5.getDescription();
        product5.setId((java.lang.Long) 10L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=10}" + "'", str9, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}", "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}", (java.lang.Double) (-1.0d), (int) (short) 0);
        product5.setDescription("Product{id=0, name='hi!', description='', price=0.0, quantity=0}");
        product5.addPriceToHistory((java.lang.Double) 1.0d);
        product5.setDescription("Product{id=1, name='Product{id=-1, name='hi!', description='', price=0.0, quantity=100}', description='hi!', price=100.0, quantity=35}");
        product5.setDescription("Product{id=0, name='hi!', description='Product{id=100, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='', price=10.0, quantity=0}', price=1.0, quantity=0}");
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}", "Product{id=100, name='hi!', description='', price=1.0, quantity=10}", (java.lang.Double) (-1.0d), (int) (short) 100);
        java.lang.String str6 = product5.getDescription();
        product5.addPriceToHistory((java.lang.Double) 1.0d);
        int int9 = product5.getQuantity();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=10}" + "'", str6, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}", "Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}", (java.lang.Double) 100.0d, (int) '4');
        java.lang.String str6 = product5.getDescription();
        product5.setName("Product{id=-1, name='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=-1.0, quantity=35}");
        product5.setName("Product{id=0, name='', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}" + "'", str6, "Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}");
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.util.List<java.lang.Double> doubleList10 = product5.getPriceHistory();
        java.lang.Double double11 = product5.getPrice();
        product5.setId((java.lang.Long) 0L);
        java.util.List<java.lang.Double> doubleList14 = product5.getPriceHistory();
        product5.setName("Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}");
        product5.setDescription("Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}");
        java.lang.String str19 = product5.toString();
        java.lang.String str20 = product5.getName();
        int int21 = product5.getQuantity();
        org.junit.Assert.assertNotNull(doubleList10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(doubleList14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Product{id=0, name='Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}', description='Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}', price=1.0, quantity=0}" + "'", str19, "Product{id=0, name='Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}', description='Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}', price=1.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}" + "'", str20, "Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
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
        product5.setId((java.lang.Long) 1L);
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
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) (-1.0d), (int) (byte) 100);
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        java.util.List<java.lang.Double> doubleList8 = product5.getPriceHistory();
        product5.setQuantity(0);
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        org.junit.Assert.assertNotNull(doubleList8);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getName();
        product5.setDescription("hi!");
        product5.setId((java.lang.Long) 10L);
        java.util.List<java.lang.Double> doubleList13 = product5.getPriceHistory();
        java.lang.Long long14 = product5.getId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(doubleList13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=100, name='', description='', price=10.0, quantity=0}", "", (java.lang.Double) 100.0d, (int) ' ');
        java.lang.String str6 = product5.toString();
        product5.setName("Product{id=100, name='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', description='', price=-1.0, quantity=0}");
        product5.setQuantity((-1));
        java.lang.Double double11 = product5.getPrice();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}" + "'", str6, "Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
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
        java.lang.String str17 = product5.getDescription();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str14, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str16, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
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
        java.lang.Long long18 = product5.getId();
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str7, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        java.lang.Long long10 = product5.getId();
        product5.setQuantity((int) (short) 100);
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        java.util.List<java.lang.Double> doubleList15 = product5.getPriceHistory();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertNotNull(doubleList15);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
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
        product5.setName("Product{id=10, name='Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}', description='Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}', price=100.0, quantity=-1}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}" + "'", str13, "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}");
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
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
        java.lang.String str19 = product5.getDescription();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleList11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Product{id=100, name='hi!', description='', price=10.0, quantity=0}" + "'", str16, "Product{id=100, name='hi!', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Product{id=100, name='hi!', description='', price=10.0, quantity=0}" + "'", str19, "Product{id=100, name='hi!', description='', price=10.0, quantity=0}");
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        int int8 = product5.getQuantity();
        java.util.List<java.lang.Double> doubleList9 = product5.getPriceHistory();
        product5.setPrice((java.lang.Double) 0.0d);
        product5.setId((java.lang.Long) 100L);
        java.util.List<java.lang.Double> doubleList14 = product5.getPriceHistory();
        java.lang.Double double15 = product5.getPrice();
        int int16 = product5.getQuantity();
        product5.setDescription("Product{id=1, name='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', description='Product{id=0, name='Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}', description='Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}', price=1.0, quantity=0}', price=0.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleList9);
        org.junit.Assert.assertNotNull(doubleList14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        product5.setQuantity((int) (short) 10);
        java.lang.String str9 = product5.toString();
        java.lang.Long long10 = product5.getId();
        product5.setId((java.lang.Long) 0L);
        java.lang.String str13 = product5.getDescription();
        product5.setName("Product{id=100, name='hi!', description='', price=100.0, quantity=0}");
        java.lang.Class<?> wildcardClass16 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=10}" + "'", str9, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setQuantity((int) '#');
        product5.setDescription("");
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        product5.setName("Product{id=100, name='hi!', description='', price=10.0, quantity=0}");
        java.util.List<java.lang.Double> doubleList19 = product5.getPriceHistory();
        java.util.List<java.lang.Double> doubleList20 = product5.getPriceHistory();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleList19);
        org.junit.Assert.assertNotNull(doubleList20);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 0L);
        java.lang.String str9 = product5.getDescription();
        product5.setDescription("Product{id=100, name='hi!', description='', price=10.0, quantity=0}");
        java.lang.Long long12 = product5.getId();
        product5.setPrice((java.lang.Double) 0.0d);
        product5.setDescription("Product{id=0, name='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=0}");
        java.lang.Long long17 = product5.getId();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", "hi!", (java.lang.Double) 100.0d, (int) '#');
        int int6 = product5.getQuantity();
        product5.setName("Product{id=100, name='', description='', price=10.0, quantity=0}");
        java.lang.Double double9 = product5.getPrice();
        java.lang.Long long10 = product5.getId();
        java.lang.String str11 = product5.getName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str11, "Product{id=100, name='', description='', price=10.0, quantity=0}");
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}", "Product{id=100, name='hi!', description='', price=1.0, quantity=10}", (java.lang.Double) (-1.0d), (int) (short) 100);
        java.lang.String str6 = product5.getName();
        java.util.List<java.lang.Double> doubleList7 = product5.getPriceHistory();
        product5.setName("hi!");
        java.lang.String str10 = product5.getDescription();
        java.lang.Long long11 = product5.getId();
        product5.setName("Product{id=100, name='hi!', description='', price=-1.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}" + "'", str6, "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=10}" + "'", str10, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "Product{id=10, name='Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}', description='', price=1.0, quantity=10}", "Product{id=-1, name='hi!', description='', price=-1.0, quantity=0}", (java.lang.Double) 1.0d, (int) (byte) -1);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=1, name='hi!', description='', price=1.0, quantity=0}", "", (java.lang.Double) 100.0d, (int) (short) 0);
        java.lang.Long long6 = product5.getId();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setQuantity((int) (short) 1);
        java.util.List<java.lang.Double> doubleList10 = product5.getPriceHistory();
        java.lang.String str11 = product5.getName();
        product5.setId((java.lang.Long) 0L);
        java.lang.String str14 = product5.getDescription();
        org.junit.Assert.assertNotNull(doubleList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.Double double8 = product5.getPrice();
        java.lang.String str9 = product5.toString();
        java.lang.Double double10 = product5.getPrice();
        java.lang.String str11 = product5.getName();
        int int12 = product5.getQuantity();
        java.util.List<java.lang.Double> doubleList13 = product5.getPriceHistory();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str9, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(doubleList13);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setId((java.lang.Long) 10L);
        product5.setQuantity((int) (byte) 100);
        product5.setId((java.lang.Long) 100L);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        java.lang.Long long10 = product5.getId();
        product5.setQuantity(0);
        product5.setQuantity((int) (byte) -1);
        int int15 = product5.getQuantity();
        product5.setQuantity((int) (byte) 100);
        int int18 = product5.getQuantity();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "", "", (java.lang.Double) (-1.0d), (int) (byte) 100);
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        product5.setDescription("Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}");
        java.lang.String str10 = product5.toString();
        product5.setPrice((java.lang.Double) 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Product{id=1, name='', description='Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}', price=-1.0, quantity=100}" + "'", str10, "Product{id=1, name='', description='Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}', price=-1.0, quantity=100}");
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
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
        product5.setName("Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        product5.setDescription("Product{id=0, name='Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}', description='Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}', price=0.0, quantity=100}");
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
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}", "Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=1.0, quantity=1}", (java.lang.Double) 10.0d, (int) (short) 0);
        int int6 = product5.getQuantity();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "Product{id=100, name='hi!', description='', price=10.0, quantity=35}", "Product{id=0, name='hi!', description='', price=0.0, quantity=0}", (java.lang.Double) 10.0d, (int) (byte) 1);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=100, name='Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}', description='Product{id=100, name='hi!', description='', price=1.0, quantity=0}', price=10.0, quantity=0}", "Product{id=1, name='Product{id=-1, name='hi!', description='', price=0.0, quantity=100}', description='hi!', price=100.0, quantity=35}", (java.lang.Double) 0.0d, 97);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=100, name='Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=100}', description='', price=1.0, quantity=0}", "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", (java.lang.Double) 1.0d, (int) (short) 0);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
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
        product5.setDescription("Product{id=100, name='hi!', description='', price=10.0, quantity=0}");
        product5.setDescription("Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}");
        java.util.List<java.lang.Double> doubleList23 = product5.getPriceHistory();
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        product5.setDescription("Product{id=100, name='', description='', price=-1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(doubleList23);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setQuantity((int) (byte) 0);
        java.lang.String str11 = product5.toString();
        product5.setQuantity(100);
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        java.lang.String str16 = product5.getName();
        product5.setId((java.lang.Long) 10L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str11, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=100, name='', description='', price=10.0, quantity=0}", "", (java.lang.Double) 100.0d, (int) ' ');
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        java.lang.Long long8 = product5.getId();
        java.lang.String str9 = product5.toString();
        product5.setDescription("Product{id=100, name='hi!', description='', price=10.0, quantity=35}");
        java.lang.String str12 = product5.getDescription();
        java.lang.Double double13 = product5.getPrice();
        product5.setId((java.lang.Long) (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}" + "'", str9, "Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Product{id=100, name='hi!', description='', price=10.0, quantity=35}" + "'", str12, "Product{id=100, name='hi!', description='', price=10.0, quantity=35}");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", "hi!", (java.lang.Double) 100.0d, (int) '#');
        int int6 = product5.getQuantity();
        product5.setName("Product{id=100, name='', description='', price=10.0, quantity=0}");
        java.lang.Double double9 = product5.getPrice();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.addPriceToHistory((java.lang.Double) 1.0d);
        java.lang.String str14 = product5.getName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str14, "Product{id=100, name='', description='', price=10.0, quantity=0}");
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        java.lang.String str10 = product5.getName();
        java.lang.Class<?> wildcardClass11 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 0L);
        java.lang.String str9 = product5.getDescription();
        product5.setDescription("Product{id=100, name='hi!', description='', price=10.0, quantity=0}");
        java.lang.Long long12 = product5.getId();
        product5.setDescription("Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}");
        java.lang.String str15 = product5.getName();
        int int16 = product5.getQuantity();
        java.lang.String str17 = product5.getDescription();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}" + "'", str17, "Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}");
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.String str7 = product5.toString();
        java.lang.Long long8 = product5.getId();
        java.lang.String str9 = product5.getDescription();
        java.lang.String str10 = product5.getDescription();
        product5.setQuantity(35);
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        java.lang.String str15 = product5.toString();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str7, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=35}" + "'", str15, "Product{id=100, name='hi!', description='', price=1.0, quantity=35}");
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        product5.setId((java.lang.Long) 1L);
        product5.setPrice((java.lang.Double) 1.0d);
        java.util.List<java.lang.Double> doubleList14 = product5.getPriceHistory();
        java.lang.Class<?> wildcardClass15 = product5.getClass();
        org.junit.Assert.assertNotNull(doubleList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
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
        product5.setId((java.lang.Long) 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Product{id=0, name='hi!', description='hi!', price=1.0, quantity=0}" + "'", str15, "Product{id=0, name='hi!', description='hi!', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getName();
        product5.setDescription("hi!");
        product5.setPrice((java.lang.Double) 1.0d);
        product5.setDescription("hi!");
        product5.setDescription("Product{id=100, name='hi!', description='', price=1.0, quantity=35}");
        java.lang.Long long17 = product5.getId();
        product5.setId((java.lang.Long) 1L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
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
        java.lang.Class<?> wildcardClass20 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}" + "'", str13, "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
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
        java.lang.Long long19 = product5.getId();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(doubleList15);
        org.junit.Assert.assertNotNull(doubleList16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=-1.0, quantity=100}", "Product{id=10, name='Product{id=100, name='hi!', description='', price=100.0, quantity=0}', description='', price=10.0, quantity=0}", (java.lang.Double) 10.0d, 52);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}", "Product{id=100, name='', description='', price=10.0, quantity=0}", (java.lang.Double) 100.0d, (int) (short) 100);
        java.lang.Class<?> wildcardClass6 = product5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        product5.setQuantity((int) (short) 10);
        java.lang.String str9 = product5.toString();
        product5.setDescription("hi!");
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.Double double14 = product5.getPrice();
        java.lang.String str15 = product5.getDescription();
        product5.setPrice((java.lang.Double) (-1.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=10}" + "'", str9, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
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
        product5.setName("Product{id=10, name='Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}', description='', price=100.0, quantity=0}");
        product5.setPrice((java.lang.Double) 1.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}" + "'", str20, "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        java.lang.Long long10 = product5.getId();
        product5.setQuantity((int) (short) 100);
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
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
        product5.setPrice((java.lang.Double) 0.0d);
        java.util.List<java.lang.Double> doubleList25 = product5.getPriceHistory();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Product{id=100, name='hi!', description='', price=10.0, quantity=0}" + "'", str21, "Product{id=100, name='hi!', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(doubleList25);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setName("hi!");
        int int8 = product5.getQuantity();
        product5.setDescription("Product{id=0, name='Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}', description='Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}', price=0.0, quantity=100}");
        product5.addPriceToHistory((java.lang.Double) 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "Product{id=100, name='', description='', price=10.0, quantity=0}", "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", (java.lang.Double) 1.0d, 100);
        product5.setName("Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        java.util.List<java.lang.Double> doubleList8 = product5.getPriceHistory();
        org.junit.Assert.assertNotNull(doubleList8);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "hi!", "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}", (java.lang.Double) 0.0d, (int) ' ');
        product5.setQuantity((int) 'a');
        product5.setDescription("Product{id=100, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}");
        product5.setDescription("Product{id=100, name='hi!', description='', price=10.0, quantity=35}");
        int int12 = product5.getQuantity();
        product5.setId((java.lang.Long) 0L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.String str11 = product5.toString();
        java.lang.Long long12 = product5.getId();
        java.lang.String str13 = product5.getDescription();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product{id=0, name='hi!', description='', price=0.0, quantity=0}" + "'", str11, "Product{id=0, name='hi!', description='', price=0.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        product5.setName("hi!");
        int int10 = product5.getQuantity();
        product5.setName("Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}");
        product5.setId((java.lang.Long) 100L);
        java.lang.String str15 = product5.toString();
        product5.setPrice((java.lang.Double) (-1.0d));
        java.lang.String str18 = product5.toString();
        product5.addPriceToHistory((java.lang.Double) (-1.0d));
        java.lang.String str21 = product5.getDescription();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Product{id=100, name='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', description='', price=1.0, quantity=0}" + "'", str15, "Product{id=100, name='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Product{id=100, name='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', description='', price=-1.0, quantity=0}" + "'", str18, "Product{id=100, name='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', description='', price=-1.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=100, name='hi!', description='hi!', price=10.0, quantity=0}", "Product{id=-1, name='hi!', description='', price=0.0, quantity=100}", (java.lang.Double) 10.0d, (int) '#');
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}", "Product{id=100, name='hi!', description='', price=10.0, quantity=0}", (java.lang.Double) 100.0d, (int) (short) 100);
        product5.setQuantity((int) ' ');
        java.lang.String str8 = product5.getName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}" + "'", str8, "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}");
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "", "Product{id=100, name='Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=100}', description='', price=1.0, quantity=-1}", (java.lang.Double) 10.0d, (-1));
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setName("");
        java.lang.Long long11 = product5.getId();
        java.lang.Long long12 = product5.getId();
        java.lang.Double double13 = product5.getPrice();
        java.lang.Long long14 = product5.getId();
        java.lang.String str15 = product5.getDescription();
        product5.setName("Product{id=100, name='hi!', description='', price=-1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
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
        java.util.List<java.lang.Double> doubleList20 = product5.getPriceHistory();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertNotNull(doubleList20);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.util.List<java.lang.Double> doubleList10 = product5.getPriceHistory();
        java.util.List<java.lang.Double> doubleList11 = product5.getPriceHistory();
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setQuantity((int) ' ');
        product5.setPrice((java.lang.Double) 10.0d);
        java.lang.String str18 = product5.getName();
        org.junit.Assert.assertNotNull(doubleList10);
        org.junit.Assert.assertNotNull(doubleList11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=0, name='Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}', description='Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}', price=1.0, quantity=0}", "Product{id=1, name='hi!', description='', price=1.0, quantity=0}", (java.lang.Double) 0.0d, 10);
        java.lang.Class<?> wildcardClass6 = product5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.util.List<java.lang.Double> doubleList10 = product5.getPriceHistory();
        java.lang.Double double11 = product5.getPrice();
        product5.setId((java.lang.Long) 0L);
        java.util.List<java.lang.Double> doubleList14 = product5.getPriceHistory();
        product5.addPriceToHistory((java.lang.Double) (-1.0d));
        java.lang.Double double17 = product5.getPrice();
        java.lang.Class<?> wildcardClass18 = product5.getClass();
        org.junit.Assert.assertNotNull(doubleList10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(doubleList14);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        product5.setName("hi!");
        java.lang.Double double10 = product5.getPrice();
        product5.setId((java.lang.Long) (-1L));
        int int13 = product5.getQuantity();
        int int14 = product5.getQuantity();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        int int8 = product5.getQuantity();
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.String str13 = product5.toString();
        java.lang.String str14 = product5.getName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=100, name='hi!', description='', price=0.0, quantity=0}" + "'", str13, "Product{id=100, name='hi!', description='', price=0.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "hi!", "", (java.lang.Double) 0.0d, (int) (byte) 100);
        product5.addPriceToHistory((java.lang.Double) 10.0d);
        product5.setId((java.lang.Long) 100L);
        java.lang.String str10 = product5.getName();
        java.lang.String str11 = product5.getDescription();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setId((java.lang.Long) 10L);
        java.lang.Long long14 = product5.getId();
        java.lang.String str15 = product5.getDescription();
        product5.setQuantity(32);
        java.util.List<java.lang.Double> doubleList18 = product5.getPriceHistory();
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(doubleList18);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        product5.setDescription("Product{id=-1, name='hi!', description='', price=0.0, quantity=100}");
        product5.setId((java.lang.Long) 100L);
        product5.setId((java.lang.Long) 100L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.util.List<java.lang.Double> doubleList10 = product5.getPriceHistory();
        java.lang.Double double11 = product5.getPrice();
        product5.setId((java.lang.Long) 0L);
        java.util.List<java.lang.Double> doubleList14 = product5.getPriceHistory();
        product5.setName("Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}");
        java.lang.Long long17 = product5.getId();
        org.junit.Assert.assertNotNull(doubleList10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(doubleList14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
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
        java.util.List<java.lang.Double> doubleList18 = product5.getPriceHistory();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(doubleList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(doubleList18);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setId((java.lang.Long) 10L);
        java.lang.Long long14 = product5.getId();
        java.lang.String str15 = product5.toString();
        java.lang.String str16 = product5.getName();
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Product{id=10, name='hi!', description='', price=10.0, quantity=0}" + "'", str15, "Product{id=10, name='hi!', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        java.lang.String str10 = product5.getDescription();
        int int11 = product5.getQuantity();
        product5.setName("Product{id=100, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=0.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}", (java.lang.Double) 100.0d, 10);
        java.lang.Double double6 = product5.getPrice();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        java.lang.String str10 = product5.getDescription();
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        product5.setDescription("Product{id=-1, name='hi!', description='', price=0.0, quantity=100}");
        java.util.List<java.lang.Double> doubleList15 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(doubleList15);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
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
        product5.setId((java.lang.Long) 1L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}" + "'", str20, "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str27, "Product{id=100, name='', description='', price=10.0, quantity=0}");
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=100, name='hi!', description='', price=10.0, quantity=0}", "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}", (java.lang.Double) 10.0d, (int) ' ');
        java.lang.String str6 = product5.toString();
        java.lang.String str7 = product5.getDescription();
        product5.setDescription("Product{id=1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=0}', description='hi!', price=1.0, quantity=35}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=-1, name='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', description='Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}', price=10.0, quantity=32}" + "'", str6, "Product{id=-1, name='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', description='Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}', price=10.0, quantity=32}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}" + "'", str7, "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}");
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=100, name='hi!', description='', price=1.0, quantity=10}", "Product{id=0, name='hi!', description='', price=1.0, quantity=0}", (java.lang.Double) 0.0d, (int) (short) -1);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        int int7 = product5.getQuantity();
        product5.setQuantity(32);
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "", "", (java.lang.Double) (-1.0d), (int) (byte) 100);
        java.lang.String str6 = product5.toString();
        java.lang.String str7 = product5.getDescription();
        product5.setPrice((java.lang.Double) 1.0d);
        java.lang.Double double10 = product5.getPrice();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=1, name='', description='', price=-1.0, quantity=100}" + "'", str6, "Product{id=1, name='', description='', price=-1.0, quantity=100}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.Double double8 = product5.getPrice();
        java.lang.String str9 = product5.toString();
        java.lang.Double double10 = product5.getPrice();
        java.lang.String str11 = product5.getName();
        java.lang.String str12 = product5.getDescription();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str9, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        product5.setName("hi!");
        int int10 = product5.getQuantity();
        product5.setName("Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}");
        product5.setId((java.lang.Long) 100L);
        product5.setQuantity((int) (byte) 0);
        product5.setPrice((java.lang.Double) 100.0d);
        java.lang.String str19 = product5.getName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}" + "'", str19, "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}");
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getName();
        product5.setDescription("hi!");
        product5.setPrice((java.lang.Double) 1.0d);
        java.lang.String str13 = product5.getName();
        int int14 = product5.getQuantity();
        java.lang.String str15 = product5.toString();
        int int16 = product5.getQuantity();
        java.util.List<java.lang.Double> doubleList17 = product5.getPriceHistory();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Product{id=0, name='hi!', description='hi!', price=1.0, quantity=0}" + "'", str15, "Product{id=0, name='hi!', description='hi!', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(doubleList17);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        product5.setName("hi!");
        product5.setPrice((java.lang.Double) 100.0d);
        java.util.List<java.lang.Double> doubleList12 = product5.getPriceHistory();
        product5.setDescription("Product{id=100, name='hi!', description='', price=10.0, quantity=0}");
        java.lang.String str15 = product5.getName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(doubleList12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) (-1.0d));
        java.lang.String str12 = product5.getDescription();
        java.lang.Long long13 = product5.getId();
        java.lang.Double double14 = product5.getPrice();
        product5.setName("Product{id=10, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=10.0, quantity=35}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.util.List<java.lang.Double> doubleList10 = product5.getPriceHistory();
        java.lang.Double double11 = product5.getPrice();
        product5.setId((java.lang.Long) 0L);
        java.util.List<java.lang.Double> doubleList14 = product5.getPriceHistory();
        product5.setName("Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}");
        product5.setDescription("Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}");
        product5.setDescription("Product{id=10, name='Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}', description='Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}', price=100.0, quantity=-1}");
        org.junit.Assert.assertNotNull(doubleList10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(doubleList14);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setQuantity((int) '#');
        product5.setDescription("");
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        product5.setName("Product{id=100, name='hi!', description='', price=10.0, quantity=0}");
        java.lang.Class<?> wildcardClass19 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.lang.Double double10 = product5.getPrice();
        java.lang.Long long11 = product5.getId();
        java.util.List<java.lang.Double> doubleList12 = product5.getPriceHistory();
        java.lang.Long long13 = product5.getId();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(doubleList12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=100, name='hi!', description='', price=1.0, quantity=10}", "Product{id=0, name='hi!', description='', price=1.0, quantity=0}", (java.lang.Double) 0.0d, (int) (short) -1);
        java.lang.String str6 = product5.getName();
        java.lang.String str7 = product5.toString();
        product5.setDescription("Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        product5.setName("Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=10}" + "'", str6, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}" + "'", str7, "Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}");
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getDescription();
        java.lang.String str9 = product5.toString();
        java.lang.Double double10 = product5.getPrice();
        java.lang.String str11 = product5.getDescription();
        java.util.List<java.lang.Double> doubleList12 = product5.getPriceHistory();
        product5.setName("Product{id=0, name='Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}', description='Product{id=0, name='Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}', description='Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}', price=0.0, quantity=100}', price=0.0, quantity=-1}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str9, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(doubleList12);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
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
        java.lang.String str19 = product5.getName();
        java.lang.Class<?> wildcardClass20 = product5.getClass();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str7, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.Double double8 = product5.getPrice();
        product5.setQuantity((int) (byte) 0);
        java.lang.Long long11 = product5.getId();
        product5.setPrice((java.lang.Double) 10.0d);
        java.lang.String str14 = product5.getDescription();
        java.lang.Class<?> wildcardClass15 = product5.getClass();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        java.lang.String str10 = product5.getDescription();
        java.lang.Double double11 = product5.getPrice();
        java.util.List<java.lang.Double> doubleList12 = product5.getPriceHistory();
        java.lang.Class<?> wildcardClass13 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(doubleList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='hi!', price=100.0, quantity=35}", "Product{id=1, name='Product{id=1, name='', description='', price=-1.0, quantity=100}', description='hi!', price=100.0, quantity=35}", (java.lang.Double) 10.0d, 32);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setQuantity((int) '#');
        product5.setId((java.lang.Long) 100L);
        product5.setDescription("Product{id=0, name='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=0}");
        java.util.List<java.lang.Double> doubleList17 = product5.getPriceHistory();
        int int18 = product5.getQuantity();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleList17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        java.lang.String str9 = product5.getName();
        java.lang.String str10 = product5.getDescription();
        product5.setId((java.lang.Long) 1L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
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
        product5.setId((java.lang.Long) 100L);
        java.util.List<java.lang.Double> doubleList21 = product5.getPriceHistory();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertNotNull(doubleList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=100}" + "'", str16, "Product{id=100, name='hi!', description='', price=1.0, quantity=100}");
        org.junit.Assert.assertNotNull(doubleList21);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}", "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}", (java.lang.Double) (-1.0d), (int) (short) 0);
        product5.setId((java.lang.Long) 10L);
        java.lang.Double double8 = product5.getPrice();
        product5.setName("Product{id=100, name='hi!', description='', price=100.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", "hi!", (java.lang.Double) 100.0d, (int) '#');
        int int6 = product5.getQuantity();
        product5.setName("Product{id=100, name='', description='', price=10.0, quantity=0}");
        java.lang.Double double9 = product5.getPrice();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setId((java.lang.Long) (-1L));
        java.lang.Long long14 = product5.getId();
        product5.setPrice((java.lang.Double) 1.0d);
        java.lang.String str17 = product5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Product{id=-1, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='hi!', price=1.0, quantity=35}" + "'", str17, "Product{id=-1, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='hi!', price=1.0, quantity=35}");
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.String str7 = product5.toString();
        product5.setId((java.lang.Long) 100L);
        java.lang.Long long10 = product5.getId();
        product5.setPrice((java.lang.Double) 0.0d);
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str7, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        java.lang.String str10 = product5.getDescription();
        product5.setId((java.lang.Long) 10L);
        java.lang.String str13 = product5.getDescription();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", "hi!", (java.lang.Double) 100.0d, (int) '#');
        int int6 = product5.getQuantity();
        product5.setName("Product{id=100, name='', description='', price=10.0, quantity=0}");
        java.lang.Double double9 = product5.getPrice();
        product5.setPrice((java.lang.Double) 10.0d);
        java.lang.Long long12 = product5.getId();
        product5.setDescription("Product{id=100, name='Product{id=-1, name='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=-1.0, quantity=35}', description='', price=10.0, quantity=35}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
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
        java.lang.String str23 = product5.getName();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str23, "Product{id=100, name='', description='', price=10.0, quantity=0}");
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 0L);
        java.lang.String str9 = product5.getDescription();
        java.lang.Double double10 = product5.getPrice();
        java.lang.Double double11 = product5.getPrice();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.util.List<java.lang.Double> doubleList7 = product5.getPriceHistory();
        java.lang.Double double8 = product5.getPrice();
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) 10.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(doubleList7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
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
        product5.setDescription("Product{id=0, name='hi!', description='', price=100.0, quantity=0}");
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
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
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
        java.lang.Long long25 = product5.getId();
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
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 100L + "'", long25 == 100L);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        int int8 = product5.getQuantity();
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        product5.setId((java.lang.Long) 10L);
        product5.setQuantity(0);
        java.util.List<java.lang.Double> doubleList15 = product5.getPriceHistory();
        java.lang.String str16 = product5.toString();
        int int17 = product5.getQuantity();
        java.lang.Long long18 = product5.getId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Product{id=10, name='hi!', description='', price=1.0, quantity=0}" + "'", str16, "Product{id=10, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "", "", (java.lang.Double) (-1.0d), (int) (byte) 100);
        java.lang.String str6 = product5.toString();
        product5.setName("Product{id=10, name='hi!', description='', price=1.0, quantity=0}");
        product5.setPrice((java.lang.Double) (-1.0d));
        product5.setQuantity((int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=1, name='', description='', price=-1.0, quantity=100}" + "'", str6, "Product{id=1, name='', description='', price=-1.0, quantity=100}");
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setName("hi!");
        product5.setName("");
        product5.setQuantity(32);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}", "Product{id=100, name='', description='', price=10.0, quantity=0}", (java.lang.Double) 0.0d, (-1));
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.lang.Double double10 = product5.getPrice();
        java.lang.Long long11 = product5.getId();
        java.lang.Long long12 = product5.getId();
        int int13 = product5.getQuantity();
        product5.setPrice((java.lang.Double) (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.addPriceToHistory((java.lang.Double) 10.0d);
        product5.setQuantity((int) (byte) 10);
        java.lang.String str10 = product5.getDescription();
        product5.setQuantity((int) (byte) 1);
        java.lang.Class<?> wildcardClass13 = product5.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
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
        product5.setQuantity((int) 'a');
        product5.setPrice((java.lang.Double) 10.0d);
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
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        int int8 = product5.getQuantity();
        java.util.List<java.lang.Double> doubleList9 = product5.getPriceHistory();
        product5.setPrice((java.lang.Double) 0.0d);
        product5.setId((java.lang.Long) 100L);
        product5.setId((java.lang.Long) 100L);
        java.lang.Double double16 = product5.getPrice();
        java.lang.String str17 = product5.getDescription();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleList9);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        java.lang.String str9 = product5.getDescription();
        java.lang.String str10 = product5.getName();
        java.lang.Double double11 = product5.getPrice();
        product5.setDescription("Product{id=10, name='hi!', description='', price=1.0, quantity=10}");
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=100, name='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', description='', price=1.0, quantity=0}", "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}", (java.lang.Double) 1.0d, (int) (byte) 10);
        java.lang.Double double6 = product5.getPrice();
        product5.setName("Product{id=100, name='hi!', description='', price=1.0, quantity=35}");
        java.lang.Long long9 = product5.getId();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}", "Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}", (java.lang.Double) 0.0d, 100);
        product5.addPriceToHistory((java.lang.Double) (-1.0d));
        product5.setQuantity(97);
        product5.setId((java.lang.Long) (-1L));
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
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
        product5.setId((java.lang.Long) 100L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.String str8 = product5.getDescription();
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        product5.addPriceToHistory((java.lang.Double) 1.0d);
        java.lang.String str13 = product5.getName();
        java.util.List<java.lang.Double> doubleList14 = product5.getPriceHistory();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(doubleList14);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=100, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='', price=10.0, quantity=0}", "Product{id=100, name='', description='', price=0.0, quantity=0}", (java.lang.Double) (-1.0d), (int) (short) 100);
        product5.setId((java.lang.Long) 1L);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        java.lang.String str9 = product5.getName();
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        java.lang.Double double12 = product5.getPrice();
        java.lang.Long long13 = product5.getId();
        product5.setQuantity((-1));
        product5.setId((java.lang.Long) 1L);
        product5.setQuantity((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 0L);
        java.lang.String str9 = product5.getDescription();
        java.lang.Double double10 = product5.getPrice();
        java.lang.String str11 = product5.toString();
        product5.setDescription("Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str11, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.util.List<java.lang.Double> doubleList10 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 10L);
        product5.setName("Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        java.util.List<java.lang.Double> doubleList15 = product5.getPriceHistory();
        java.lang.String str16 = product5.getName();
        java.lang.Double double17 = product5.getPrice();
        org.junit.Assert.assertNotNull(doubleList10);
        org.junit.Assert.assertNotNull(doubleList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str16, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        product5.setName("hi!");
        int int10 = product5.getQuantity();
        product5.setName("Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}");
        product5.setId((java.lang.Long) 100L);
        java.lang.String str15 = product5.toString();
        java.lang.String str16 = product5.getDescription();
        java.lang.Double double17 = product5.getPrice();
        product5.setName("Product{id=100, name='hi!', description='hi!', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Product{id=100, name='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', description='', price=1.0, quantity=0}" + "'", str15, "Product{id=100, name='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        java.lang.String str9 = product5.getName();
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        java.lang.Double double12 = product5.getPrice();
        java.lang.Long long13 = product5.getId();
        product5.setQuantity(32);
        java.lang.Class<?> wildcardClass16 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=100, name='hi!', description='', price=10.0, quantity=0}", "hi!", (java.lang.Double) 1.0d, 52);
        product5.setId((java.lang.Long) (-1L));
        java.lang.Double double8 = product5.getPrice();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}", "Product{id=0, name='hi!', description='', price=1.0, quantity=1}", (java.lang.Double) 10.0d, 52);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=100, name='hi!', description='', price=10.0, quantity=0}", "Product{id=0, name='hi!', description='', price=1.0, quantity=0}", (java.lang.Double) 0.0d, (-1));
        java.lang.String str6 = product5.getName();
        product5.setQuantity((int) (byte) 10);
        product5.setName("Product{id=0, name='hi!', description='Product{id=0, name='hi!', description='', price=0.0, quantity=0}', price=1.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=100, name='hi!', description='', price=10.0, quantity=0}" + "'", str6, "Product{id=100, name='hi!', description='', price=10.0, quantity=0}");
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getName();
        product5.setDescription("hi!");
        product5.setPrice((java.lang.Double) 1.0d);
        java.lang.String str13 = product5.getName();
        int int14 = product5.getQuantity();
        java.lang.String str15 = product5.toString();
        product5.addPriceToHistory((java.lang.Double) (-1.0d));
        java.lang.String str18 = product5.getDescription();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Product{id=0, name='hi!', description='hi!', price=1.0, quantity=0}" + "'", str15, "Product{id=0, name='hi!', description='hi!', price=1.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}", "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", (java.lang.Double) 10.0d, 0);
        product5.setId((java.lang.Long) 1L);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        java.lang.String str10 = product5.getDescription();
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        java.lang.Double double13 = product5.getPrice();
        product5.setPrice((java.lang.Double) 10.0d);
        java.lang.String str16 = product5.toString();
        java.util.List<java.lang.Double> doubleList17 = product5.getPriceHistory();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=10.0, quantity=0}" + "'", str16, "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=10.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList17);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        product5.setName("hi!");
        int int10 = product5.getQuantity();
        product5.setName("Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}");
        product5.setId((java.lang.Long) 100L);
        java.lang.String str15 = product5.getName();
        int int16 = product5.getQuantity();
        java.lang.String str17 = product5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}" + "'", str15, "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Product{id=100, name='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', description='', price=1.0, quantity=0}" + "'", str17, "Product{id=100, name='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', description='', price=1.0, quantity=0}");
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "", "", (java.lang.Double) 0.0d, (int) (byte) 100);
        product5.setQuantity((int) (short) -1);
        product5.setName("Product{id=100, name='hi!', description='', price=1.0, quantity=1}");
        java.lang.String str10 = product5.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=1}" + "'", str10, "Product{id=100, name='hi!', description='', price=1.0, quantity=1}");
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.Long long7 = product5.getId();
        int int8 = product5.getQuantity();
        java.lang.String str9 = product5.getDescription();
        int int10 = product5.getQuantity();
        product5.setQuantity((int) (short) -1);
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
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
        product5.setPrice((java.lang.Double) 100.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}" + "'", str20, "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}");
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", "hi!", (java.lang.Double) 100.0d, (int) '#');
        int int6 = product5.getQuantity();
        product5.setName("Product{id=100, name='', description='', price=10.0, quantity=0}");
        java.lang.Double double9 = product5.getPrice();
        product5.setPrice((java.lang.Double) 10.0d);
        java.lang.Long long12 = product5.getId();
        java.lang.Double double13 = product5.getPrice();
        int int14 = product5.getQuantity();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "hi!", "", (java.lang.Double) 0.0d, (int) (byte) 100);
        product5.addPriceToHistory((java.lang.Double) 10.0d);
        java.lang.String str8 = product5.toString();
        java.lang.String str9 = product5.getName();
        product5.addPriceToHistory((java.lang.Double) (-1.0d));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Product{id=-1, name='hi!', description='', price=0.0, quantity=100}" + "'", str8, "Product{id=-1, name='hi!', description='', price=0.0, quantity=100}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.String str12 = product5.getDescription();
        product5.addPriceToHistory((java.lang.Double) (-1.0d));
        product5.setDescription("Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
        product5.setQuantity(1);
        product5.setQuantity((int) ' ');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", "Product{id=0, name='hi!', description='hi!', price=1.0, quantity=100}", (java.lang.Double) 100.0d, (int) (short) 1);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=100}", "Product{id=100, name='', description='', price=10.0, quantity=0}", (java.lang.Double) 1.0d, 0);
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        int int8 = product5.getQuantity();
        java.lang.String str9 = product5.getName();
        product5.addPriceToHistory((java.lang.Double) 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=100}" + "'", str9, "Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=100}");
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.Double double8 = product5.getPrice();
        product5.setDescription("Product{id=100, name='', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}");
        product5.setDescription("Product{id=100, name='', description='', price=-1.0, quantity=10}");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "Product{id=-1, name='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=-1.0, quantity=35}", "Product{id=1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=0}', description='hi!', price=1.0, quantity=35}", (java.lang.Double) (-1.0d), (int) ' ');
        product5.setQuantity(0);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "", "", (java.lang.Double) 0.0d, (int) (short) -1);
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        product5.setDescription("Product{id=0, name='Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}', description='Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}', price=1.0, quantity=0}");
        product5.setName("Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        product5.setId((java.lang.Long) 10L);
        java.lang.Double double14 = product5.getPrice();
        product5.setDescription("Product{id=1, name='Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}', description='Product{id=0, name='hi!', description='', price=100.0, quantity=0}', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.addPriceToHistory((java.lang.Double) 10.0d);
        product5.setName("Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
        java.lang.String str10 = product5.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Product{id=100, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='', price=1.0, quantity=0}" + "'", str10, "Product{id=100, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='', price=1.0, quantity=0}");
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setQuantity((int) '4');
        int int13 = product5.getQuantity();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        product5.setQuantity((int) (short) 10);
        java.lang.String str9 = product5.toString();
        product5.setDescription("hi!");
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.Double double14 = product5.getPrice();
        product5.setPrice((java.lang.Double) (-1.0d));
        java.lang.String str17 = product5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=10}" + "'", str9, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Product{id=100, name='hi!', description='hi!', price=-1.0, quantity=10}" + "'", str17, "Product{id=100, name='hi!', description='hi!', price=-1.0, quantity=10}");
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        product5.setQuantity((int) (short) 10);
        java.lang.String str9 = product5.toString();
        java.lang.Long long10 = product5.getId();
        product5.setDescription("");
        product5.setId((java.lang.Long) 10L);
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        product5.setName("Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}");
        product5.addPriceToHistory((java.lang.Double) 10.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=10}" + "'", str9, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        int int8 = product5.getQuantity();
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        product5.setId((java.lang.Long) 10L);
        java.util.List<java.lang.Double> doubleList13 = product5.getPriceHistory();
        java.lang.Double double14 = product5.getPrice();
        java.lang.Class<?> wildcardClass15 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleList13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
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
        product5.setPrice((java.lang.Double) 10.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(doubleList16);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setQuantity((int) (short) 1);
        java.util.List<java.lang.Double> doubleList10 = product5.getPriceHistory();
        product5.setQuantity((int) (short) -1);
        product5.setId((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(doubleList10);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        product5.setQuantity(1);
        java.lang.Long long12 = product5.getId();
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) (-1.0d));
        java.lang.String str12 = product5.getDescription();
        product5.setId((java.lang.Long) (-1L));
        product5.setId((java.lang.Long) (-1L));
        product5.setId((java.lang.Long) 100L);
        product5.setQuantity((int) (short) 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        product5.setQuantity((int) (short) 10);
        java.lang.String str9 = product5.toString();
        java.lang.Long long10 = product5.getId();
        product5.setId((java.lang.Long) 0L);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str15 = product5.toString();
        int int16 = product5.getQuantity();
        product5.setQuantity(97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=10}" + "'", str9, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=10}" + "'", str15, "Product{id=0, name='hi!', description='', price=1.0, quantity=10}");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        java.lang.String str11 = product5.getDescription();
        java.lang.String str12 = product5.toString();
        product5.setName("Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        product5.setQuantity((int) (short) 100);
        java.lang.String str17 = product5.getName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Product{id=100, name='hi!', description='', price=10.0, quantity=0}" + "'", str12, "Product{id=100, name='hi!', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str17, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "", "", (java.lang.Double) (-1.0d), (int) (byte) 100);
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        java.lang.Double double8 = product5.getPrice();
        java.lang.Long long9 = product5.getId();
        java.lang.String str10 = product5.getDescription();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.String str7 = product5.toString();
        product5.setId((java.lang.Long) 100L);
        java.lang.Long long10 = product5.getId();
        java.lang.Double double11 = product5.getPrice();
        java.util.List<java.lang.Double> doubleList12 = product5.getPriceHistory();
        product5.setQuantity(52);
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str7, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(doubleList12);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.String str11 = product5.getDescription();
        java.lang.Long long12 = product5.getId();
        product5.setDescription("Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}");
        java.lang.String str15 = product5.toString();
        java.util.List<java.lang.Double> doubleList16 = product5.getPriceHistory();
        product5.setDescription("Product{id=1, name='Product{id=-1, name='hi!', description='', price=0.0, quantity=100}', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=0.0, quantity=52}");
        product5.setName("Product{id=10, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=10.0, quantity=35}");
        product5.addPriceToHistory((java.lang.Double) (-1.0d));
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Product{id=0, name='hi!', description='Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}', price=0.0, quantity=0}" + "'", str15, "Product{id=0, name='hi!', description='Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}', price=0.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList16);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.String str7 = product5.toString();
        java.lang.Long long8 = product5.getId();
        java.lang.String str9 = product5.getDescription();
        java.lang.String str10 = product5.getDescription();
        java.lang.String str11 = product5.getDescription();
        product5.setId((java.lang.Long) 0L);
        product5.setDescription("Product{id=100, name='Product{id=-1, name='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=-1.0, quantity=35}', description='', price=10.0, quantity=35}");
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str7, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.util.List<java.lang.Double> doubleList10 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 10L);
        product5.setName("Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        java.lang.String str15 = product5.getName();
        java.util.List<java.lang.Double> doubleList16 = product5.getPriceHistory();
        org.junit.Assert.assertNotNull(doubleList10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str15, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList16);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}", "Product{id=100, name='hi!', description='', price=1.0, quantity=10}", (java.lang.Double) (-1.0d), (int) (short) 100);
        java.lang.String str6 = product5.getDescription();
        product5.setQuantity(0);
        product5.setDescription("Product{id=0, name='hi!', description='', price=-1.0, quantity=0}");
        product5.setQuantity((int) ' ');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=10}" + "'", str6, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}", "Product{id=100, name='hi!', description='', price=1.0, quantity=10}", (java.lang.Double) 1.0d, (int) 'a');
        product5.setPrice((java.lang.Double) 100.0d);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=100, name='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', description='', price=1.0, quantity=0}", "Product{id=0, name='hi!', description='', price=0.0, quantity=0}", (java.lang.Double) 0.0d, (int) (byte) -1);
        product5.setPrice((java.lang.Double) 10.0d);
        java.lang.String str8 = product5.toString();
        java.lang.String str9 = product5.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Product{id=1, name='Product{id=100, name='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', description='', price=1.0, quantity=0}', description='Product{id=0, name='hi!', description='', price=0.0, quantity=0}', price=10.0, quantity=-1}" + "'", str8, "Product{id=1, name='Product{id=100, name='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', description='', price=1.0, quantity=0}', description='Product{id=0, name='hi!', description='', price=0.0, quantity=0}', price=10.0, quantity=-1}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=1, name='Product{id=100, name='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', description='', price=1.0, quantity=0}', description='Product{id=0, name='hi!', description='', price=0.0, quantity=0}', price=10.0, quantity=-1}" + "'", str9, "Product{id=1, name='Product{id=100, name='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', description='', price=1.0, quantity=0}', description='Product{id=0, name='hi!', description='', price=0.0, quantity=0}', price=10.0, quantity=-1}");
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setName("");
        java.lang.Long long11 = product5.getId();
        java.lang.Long long12 = product5.getId();
        java.lang.Long long13 = product5.getId();
        product5.setQuantity(97);
        java.lang.Double double16 = product5.getPrice();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.String str7 = product5.toString();
        product5.addPriceToHistory((java.lang.Double) 10.0d);
        java.lang.Double double10 = product5.getPrice();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str7, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setName("");
        java.lang.Double double14 = product5.getPrice();
        product5.setQuantity((int) (byte) 0);
        java.lang.String str17 = product5.getDescription();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) (-1.0d), (int) (byte) 100);
        product5.setName("Product{id=0, name='hi!', description='hi!', price=1.0, quantity=0}");
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        java.lang.String str10 = product5.getDescription();
        int int11 = product5.getQuantity();
        java.lang.String str12 = product5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str12, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "Product{id=100, name='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', description='', price=10.0, quantity=0}", "Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=1.0, quantity=1}", (java.lang.Double) 1.0d, (int) '#');
        product5.setName("Product{id=10, name='Product{id=100, name='hi!', description='', price=100.0, quantity=0}', description='', price=10.0, quantity=0}");
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=0, name='hi!', description='hi!', price=1.0, quantity=100}", "Product{id=0, name='hi!', description='', price=1.0, quantity=0}", (java.lang.Double) 10.0d, (int) (byte) -1);
        product5.setName("Product{id=0, name='Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}', description='Product{id=0, name='Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}', description='Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}', price=0.0, quantity=100}', price=0.0, quantity=-1}");
        java.lang.String str8 = product5.getDescription();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str8, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        product5.setQuantity((int) (short) 10);
        java.lang.String str9 = product5.toString();
        product5.setDescription("hi!");
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.Double double14 = product5.getPrice();
        product5.setPrice((java.lang.Double) (-1.0d));
        java.util.List<java.lang.Double> doubleList17 = product5.getPriceHistory();
        int int18 = product5.getQuantity();
        product5.setDescription("Product{id=1, name='Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}', description='Product{id=0, name='hi!', description='', price=100.0, quantity=0}', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=10}" + "'", str9, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(doubleList17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "Product{id=0, name='hi!', description='hi!', price=1.0, quantity=100}", "Product{id=0, name='hi!', description='hi!', price=1.0, quantity=0}", (java.lang.Double) 100.0d, 0);
        java.lang.Long long6 = product5.getId();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        int int8 = product5.getQuantity();
        product5.setDescription("hi!");
        product5.setDescription("Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        product5.setDescription("hi!");
        java.lang.String str15 = product5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}" + "'", str15, "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}");
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}", "Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}", (java.lang.Double) 0.0d, 100);
        product5.setPrice((java.lang.Double) 0.0d);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=100, name='', description='', price=10.0, quantity=0}", "", (java.lang.Double) 100.0d, (int) ' ');
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        java.lang.Long long8 = product5.getId();
        java.lang.String str9 = product5.toString();
        product5.setDescription("Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}");
        java.lang.Long long12 = product5.getId();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}" + "'", str9, "Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setQuantity((int) '#');
        product5.setId((java.lang.Long) 100L);
        product5.setDescription("Product{id=0, name='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=0}");
        java.util.List<java.lang.Double> doubleList17 = product5.getPriceHistory();
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setName("Product{id=1, name='hi!', description='Product{id=-1, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}");
        product5.setQuantity((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleList17);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=100, name='hi!', description='', price=1.0, quantity=10}", "Product{id=0, name='hi!', description='', price=1.0, quantity=0}", (java.lang.Double) 0.0d, (int) (short) -1);
        java.lang.Class<?> wildcardClass6 = product5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
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
        java.lang.Double double24 = product5.getPrice();
        product5.setId((java.lang.Long) 1L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=1.0, quantity=1}" + "'", str23, "Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=1.0, quantity=1}");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        java.lang.Long long10 = product5.getId();
        product5.setQuantity((int) (short) 100);
        java.util.List<java.lang.Double> doubleList13 = product5.getPriceHistory();
        product5.setPrice((java.lang.Double) 1.0d);
        int int16 = product5.getQuantity();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertNotNull(doubleList13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=100, name='', description='', price=10.0, quantity=0}", "", (java.lang.Double) 100.0d, (int) ' ');
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        product5.setQuantity((int) (short) 0);
        java.lang.String str10 = product5.getDescription();
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setQuantity((int) '#');
        product5.setName("hi!");
        product5.setPrice((java.lang.Double) (-1.0d));
        product5.setName("Product{id=-1, name='hi!', description='', price=-1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}", "Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}", (java.lang.Double) 0.0d, 100);
        product5.setQuantity((int) (short) 10);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "", "", (java.lang.Double) (-1.0d), (int) (byte) 100);
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        java.lang.Double double8 = product5.getPrice();
        product5.setId((java.lang.Long) 100L);
        product5.setId((java.lang.Long) (-1L));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "Product{id=100, name='hi!', description='', price=10.0, quantity=0}", "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}", (java.lang.Double) 0.0d, (int) (short) 100);
        product5.setQuantity(52);
        java.lang.String str8 = product5.getDescription();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}" + "'", str8, "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}");
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setDescription("Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}");
        java.lang.Long long14 = product5.getId();
        java.lang.String str15 = product5.getDescription();
        java.util.List<java.lang.Double> doubleList16 = product5.getPriceHistory();
        product5.setId((java.lang.Long) (-1L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}" + "'", str15, "Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList16);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.String str7 = product5.toString();
        product5.setPrice((java.lang.Double) 100.0d);
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str7, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=-1, name='hi!', description='', price=-1.0, quantity=0}", "Product{id=-1, name='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', description='Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}', price=10.0, quantity=32}", (java.lang.Double) (-1.0d), (int) (short) 1);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        java.lang.Long long10 = product5.getId();
        product5.setPrice((java.lang.Double) 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getName();
        product5.setName("");
        product5.setName("Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        product5.setDescription("Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}");
        product5.setQuantity((int) (short) -1);
        java.util.List<java.lang.Double> doubleList17 = product5.getPriceHistory();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(doubleList17);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.util.List<java.lang.Double> doubleList10 = product5.getPriceHistory();
        java.lang.String str11 = product5.getName();
        java.lang.String str12 = product5.toString();
        java.lang.Long long13 = product5.getId();
        java.lang.Double double14 = product5.getPrice();
        java.lang.Long long15 = product5.getId();
        org.junit.Assert.assertNotNull(doubleList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str12, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        product5.setQuantity((int) (short) 10);
        java.lang.String str9 = product5.toString();
        product5.setDescription("hi!");
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.Double double14 = product5.getPrice();
        int int15 = product5.getQuantity();
        product5.setQuantity(0);
        java.lang.Class<?> wildcardClass18 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=10}" + "'", str9, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=100, name='', description='', price=10.0, quantity=0}", "", (java.lang.Double) 100.0d, (int) ' ');
        java.lang.String str6 = product5.toString();
        product5.setId((java.lang.Long) (-1L));
        product5.setPrice((java.lang.Double) 10.0d);
        java.lang.String str11 = product5.getDescription();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}" + "'", str6, "Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        java.lang.Long long9 = product5.getId();
        product5.setPrice((java.lang.Double) 10.0d);
        java.lang.String str12 = product5.getDescription();
        java.lang.String str13 = product5.getDescription();
        int int14 = product5.getQuantity();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        int int11 = product5.getQuantity();
        java.lang.String str12 = product5.toString();
        product5.setId((java.lang.Long) 100L);
        product5.setQuantity(52);
        java.lang.String str17 = product5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}" + "'", str12, "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=52}" + "'", str17, "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=52}");
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        int int8 = product5.getQuantity();
        java.util.List<java.lang.Double> doubleList9 = product5.getPriceHistory();
        product5.setPrice((java.lang.Double) 0.0d);
        product5.setId((java.lang.Long) 100L);
        product5.setPrice((java.lang.Double) 0.0d);
        java.util.List<java.lang.Double> doubleList16 = product5.getPriceHistory();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleList9);
        org.junit.Assert.assertNotNull(doubleList16);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=-1, name='hi!', description='', price=0.0, quantity=100}", "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}", (java.lang.Double) 0.0d, 52);
        product5.setName("Product{id=1, name='', description='', price=-1.0, quantity=100}");
        java.lang.Long long8 = product5.getId();
        product5.setDescription("Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setQuantity((int) (short) 1);
        java.lang.Double double10 = product5.getPrice();
        java.lang.String str11 = product5.getName();
        product5.setId((java.lang.Long) 0L);
        product5.setDescription("");
        java.lang.Long long16 = product5.getId();
        product5.setId((java.lang.Long) 0L);
        product5.setQuantity(35);
        java.lang.String str21 = product5.toString();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=35}" + "'", str21, "Product{id=0, name='hi!', description='', price=1.0, quantity=35}");
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='hi!', price=100.0, quantity=35}", "Product{id=100, name='hi!', description='', price=10.0, quantity=0}", (java.lang.Double) 0.0d, (int) (byte) 1);
        java.lang.String str6 = product5.getDescription();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=100, name='hi!', description='', price=10.0, quantity=0}" + "'", str6, "Product{id=100, name='hi!', description='', price=10.0, quantity=0}");
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "Product{id=100, name='hi!', description='', price=0.0, quantity=0}", "Product{id=100, name='', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}", (java.lang.Double) (-1.0d), (int) (byte) -1);
        product5.setId((java.lang.Long) (-1L));
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.util.List<java.lang.Double> doubleList7 = product5.getPriceHistory();
        product5.setQuantity((int) (short) 100);
        java.lang.Double double10 = product5.getPrice();
        java.lang.String str11 = product5.getName();
        java.lang.String str12 = product5.getDescription();
        product5.setId((java.lang.Long) 100L);
        java.lang.String str15 = product5.getName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(doubleList7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='hi!', price=100.0, quantity=35}", "Product{id=100, name='hi!', description='', price=10.0, quantity=0}", (java.lang.Double) 0.0d, (int) (byte) 1);
        java.lang.String str6 = product5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=1, name='Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='hi!', price=100.0, quantity=35}', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=0.0, quantity=1}" + "'", str6, "Product{id=1, name='Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='hi!', price=100.0, quantity=35}', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=0.0, quantity=1}");
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.String str7 = product5.toString();
        product5.setId((java.lang.Long) 100L);
        java.lang.Long long10 = product5.getId();
        java.lang.Double double11 = product5.getPrice();
        product5.setPrice((java.lang.Double) 100.0d);
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str7, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
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
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        product5.setQuantity((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertNotNull(doubleList13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "Product{id=100, name='Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=100}', description='', price=1.0, quantity=-1}", "Product{id=-1, name='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=-1.0, quantity=35}", (java.lang.Double) 0.0d, 1);
        product5.setQuantity((int) (byte) 1);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}", "Product{id=-1, name='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', description='Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}', price=10.0, quantity=32}", (java.lang.Double) (-1.0d), 52);
        java.lang.Class<?> wildcardClass6 = product5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.String str12 = product5.getDescription();
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        java.lang.String str15 = product5.getName();
        product5.setPrice((java.lang.Double) 100.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        java.lang.String str10 = product5.getDescription();
        java.lang.Long long11 = product5.getId();
        product5.setId((java.lang.Long) 1L);
        java.lang.Double double14 = product5.getPrice();
        product5.setDescription("Product{id=0, name='hi!', description='', price=0.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.lang.String str10 = product5.getName();
        java.lang.String str11 = product5.toString();
        product5.addPriceToHistory((java.lang.Double) 1.0d);
        product5.setId((java.lang.Long) 1L);
        java.util.List<java.lang.Double> doubleList16 = product5.getPriceHistory();
        int int17 = product5.getQuantity();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str11, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.util.List<java.lang.Double> doubleList10 = product5.getPriceHistory();
        java.lang.Class<?> wildcardClass11 = product5.getClass();
        org.junit.Assert.assertNotNull(doubleList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
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
        java.lang.Class<?> wildcardClass19 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str14, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getDescription();
        product5.setId((java.lang.Long) 0L);
        java.lang.String str11 = product5.toString();
        java.lang.Long long12 = product5.getId();
        java.lang.Double double13 = product5.getPrice();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str11, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.Double double8 = product5.getPrice();
        product5.setId((java.lang.Long) (-1L));
        product5.setPrice((java.lang.Double) (-1.0d));
        product5.setId((java.lang.Long) 1L);
        java.lang.Double double15 = product5.getPrice();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=100}", "Product{id=100, name='', description='', price=10.0, quantity=0}", (java.lang.Double) 1.0d, 0);
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        java.lang.Long long8 = product5.getId();
        product5.setPrice((java.lang.Double) 100.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 0L);
        product5.addPriceToHistory((java.lang.Double) (-1.0d));
        java.util.List<java.lang.Double> doubleList11 = product5.getPriceHistory();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertNotNull(doubleList11);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=100, name='', description='', price=-1.0, quantity=10}", "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=52}", (java.lang.Double) 1.0d, (int) (byte) 1);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 0L);
        java.lang.String str9 = product5.getDescription();
        product5.setDescription("Product{id=100, name='hi!', description='', price=10.0, quantity=0}");
        java.lang.Long long12 = product5.getId();
        java.lang.String str13 = product5.getName();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=100, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='', price=10.0, quantity=0}", "Product{id=100, name='hi!', description='', price=100.0, quantity=0}", (java.lang.Double) 10.0d, 52);
        product5.setDescription("hi!");
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "", "", (java.lang.Double) 0.0d, (int) (byte) 100);
        product5.setName("Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}");
        product5.setPrice((java.lang.Double) (-1.0d));
        product5.setId((java.lang.Long) 100L);
        java.lang.Double double12 = product5.getPrice();
        java.lang.Double double13 = product5.getPrice();
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "", "", (java.lang.Double) (-1.0d), (int) (byte) 100);
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        java.lang.Long long8 = product5.getId();
        product5.setName("Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}");
        product5.setQuantity((int) 'a');
        java.lang.String str13 = product5.getName();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}" + "'", str13, "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}");
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 0L);
        java.util.List<java.lang.Double> doubleList9 = product5.getPriceHistory();
        java.lang.Long long10 = product5.getId();
        java.lang.Double double11 = product5.getPrice();
        product5.setId((java.lang.Long) (-1L));
        int int14 = product5.getQuantity();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertNotNull(doubleList9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        java.lang.String str9 = product5.getDescription();
        java.lang.String str10 = product5.getName();
        java.lang.Double double11 = product5.getPrice();
        java.lang.Double double12 = product5.getPrice();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.Double double8 = product5.getPrice();
        product5.setQuantity((int) (byte) 0);
        java.lang.Long long11 = product5.getId();
        product5.setPrice((java.lang.Double) (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setId((java.lang.Long) 100L);
        product5.setQuantity((int) (byte) -1);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        product5.setName("hi!");
        product5.setId((java.lang.Long) 10L);
        product5.setId((java.lang.Long) (-1L));
        java.lang.String str14 = product5.getName();
        product5.setName("Product{id=0, name='hi!', description='', price=1.0, quantity=35}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setId((java.lang.Long) 10L);
        java.lang.Long long14 = product5.getId();
        java.lang.Double double15 = product5.getPrice();
        product5.setName("Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}");
        java.lang.String str18 = product5.getName();
        product5.setId((java.lang.Long) 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}" + "'", str18, "Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}");
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.String str7 = product5.toString();
        product5.setId((java.lang.Long) 100L);
        java.lang.Long long10 = product5.getId();
        java.lang.Long long11 = product5.getId();
        product5.setPrice((java.lang.Double) 0.0d);
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str7, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setQuantity((int) (short) 1);
        product5.setName("Product{id=1, name='Product{id=-1, name='hi!', description='', price=0.0, quantity=100}', description='hi!', price=100.0, quantity=35}");
        java.util.List<java.lang.Double> doubleList12 = product5.getPriceHistory();
        org.junit.Assert.assertNotNull(doubleList12);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=100, name='', description='', price=10.0, quantity=0}", "", (java.lang.Double) 100.0d, (int) ' ');
        java.lang.String str6 = product5.toString();
        product5.setName("Product{id=100, name='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', description='', price=-1.0, quantity=0}");
        product5.setQuantity((-1));
        java.lang.String str11 = product5.getName();
        java.util.List<java.lang.Double> doubleList12 = product5.getPriceHistory();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}" + "'", str6, "Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product{id=100, name='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', description='', price=-1.0, quantity=0}" + "'", str11, "Product{id=100, name='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', description='', price=-1.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList12);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
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
        java.lang.Class<?> wildcardClass17 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(doubleList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}" + "'", str13, "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) (-1.0d));
        java.lang.String str12 = product5.getDescription();
        product5.setId((java.lang.Long) (-1L));
        product5.setId((java.lang.Long) (-1L));
        java.lang.String str17 = product5.toString();
        java.lang.String str18 = product5.getName();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Product{id=-1, name='hi!', description='', price=-1.0, quantity=0}" + "'", str17, "Product{id=-1, name='hi!', description='', price=-1.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}", "Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}", (java.lang.Double) 0.0d, 35);
        product5.setQuantity((int) ' ');
        product5.setName("");
        java.lang.Class<?> wildcardClass10 = product5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.Long long7 = product5.getId();
        int int8 = product5.getQuantity();
        product5.setName("Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}");
        java.lang.Class<?> wildcardClass11 = product5.getClass();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
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
        product5.setName("Product{id=0, name='Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}', description='Product{id=0, name='Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}', description='Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}', price=0.0, quantity=100}', price=0.0, quantity=-1}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Product{id=100, name='hi!', description='', price=10.0, quantity=0}" + "'", str21, "Product{id=100, name='hi!', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        product5.setName("hi!");
        java.lang.Double double10 = product5.getPrice();
        product5.setId((java.lang.Long) (-1L));
        int int13 = product5.getQuantity();
        product5.setName("Product{id=100, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='', price=10.0, quantity=0}");
        product5.addPriceToHistory((java.lang.Double) 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        java.lang.String str11 = product5.getDescription();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str11, "Product{id=100, name='', description='', price=10.0, quantity=0}");
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        java.lang.String str11 = product5.getDescription();
        java.lang.Double double12 = product5.getPrice();
        product5.setDescription("Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        product5.setDescription("Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        product5.setId((java.lang.Long) 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        java.lang.String str11 = product5.getDescription();
        java.lang.Double double12 = product5.getPrice();
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.String str15 = product5.getName();
        int int16 = product5.getQuantity();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=100, name='hi!', description='hi!', price=-1.0, quantity=10}", "Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}", (java.lang.Double) (-1.0d), 0);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.String str11 = product5.getDescription();
        java.lang.Long long12 = product5.getId();
        product5.setDescription("Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}");
        java.lang.String str15 = product5.toString();
        java.util.List<java.lang.Double> doubleList16 = product5.getPriceHistory();
        product5.setDescription("Product{id=1, name='Product{id=-1, name='hi!', description='', price=0.0, quantity=100}', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=0.0, quantity=52}");
        product5.setName("Product{id=10, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=10.0, quantity=35}");
        product5.setQuantity((int) (byte) 10);
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Product{id=0, name='hi!', description='Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}', price=0.0, quantity=0}" + "'", str15, "Product{id=0, name='hi!', description='Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}', price=0.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList16);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        int int8 = product5.getQuantity();
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) 0.0d);
        product5.setName("Product{id=100, name='', description='', price=10.0, quantity=0}");
        java.lang.String str15 = product5.toString();
        java.lang.String str16 = product5.getDescription();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Product{id=100, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=0.0, quantity=0}" + "'", str15, "Product{id=100, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=0.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        product5.setName("hi!");
        int int10 = product5.getQuantity();
        product5.setName("Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}");
        product5.setId((java.lang.Long) 100L);
        product5.setQuantity(52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.String str8 = product5.getDescription();
        product5.addPriceToHistory((java.lang.Double) 1.0d);
        product5.setQuantity((int) '4');
        java.lang.Double double13 = product5.getPrice();
        java.lang.String str14 = product5.getDescription();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.String str11 = product5.getDescription();
        java.lang.String str12 = product5.getDescription();
        java.lang.Double double13 = product5.getPrice();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=0, name='hi!', description='Product{id=-1, name='hi!', description='', price=0.0, quantity=100}', price=-1.0, quantity=0}", "Product{id=100, name='Product{id=-1, name='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=-1.0, quantity=35}', description='', price=10.0, quantity=35}", (java.lang.Double) 100.0d, (-1));
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        java.lang.String str10 = product5.getDescription();
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        java.lang.String str13 = product5.getName();
        product5.setName("");
        java.lang.String str16 = product5.getDescription();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=0, name='hi!', description='', price=1.0, quantity=0}", "Product{id=100, name='', description='', price=10.0, quantity=0}", (java.lang.Double) (-1.0d), (int) '#');
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.String str7 = product5.getName();
        java.lang.String str8 = product5.toString();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str7, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Product{id=-1, name='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=-1.0, quantity=35}" + "'", str8, "Product{id=-1, name='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=-1.0, quantity=35}");
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "hi!", "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}", (java.lang.Double) 0.0d, (int) ' ');
        product5.setName("Product{id=100, name='', description='', price=10.0, quantity=0}");
        product5.setPrice((java.lang.Double) 10.0d);
        java.lang.String str10 = product5.getDescription();
        product5.setQuantity((int) 'a');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}" + "'", str10, "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}");
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        product5.setDescription("Product{id=-1, name='hi!', description='', price=0.0, quantity=100}");
        java.util.List<java.lang.Double> doubleList11 = product5.getPriceHistory();
        java.lang.String str12 = product5.getDescription();
        int int13 = product5.getQuantity();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertNotNull(doubleList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Product{id=-1, name='hi!', description='', price=0.0, quantity=100}" + "'", str12, "Product{id=-1, name='hi!', description='', price=0.0, quantity=100}");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        java.lang.String str10 = product5.getDescription();
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        java.lang.Double double13 = product5.getPrice();
        java.util.List<java.lang.Double> doubleList14 = product5.getPriceHistory();
        product5.setQuantity((int) (short) 10);
        java.util.List<java.lang.Double> doubleList17 = product5.getPriceHistory();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(doubleList14);
        org.junit.Assert.assertNotNull(doubleList17);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        product5.setQuantity(0);
        java.lang.Double double13 = product5.getPrice();
        java.util.List<java.lang.Double> doubleList14 = product5.getPriceHistory();
        product5.setName("Product{id=100, name='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', description='', price=10.0, quantity=0}");
        java.lang.Double double17 = product5.getPrice();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(doubleList14);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.Long long7 = product5.getId();
        int int8 = product5.getQuantity();
        java.lang.String str9 = product5.getDescription();
        java.lang.String str10 = product5.getName();
        int int11 = product5.getQuantity();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setId((java.lang.Long) 10L);
        java.lang.Long long14 = product5.getId();
        java.lang.String str15 = product5.getName();
        product5.setId((java.lang.Long) (-1L));
        product5.setQuantity((int) '#');
        java.lang.String str20 = product5.getDescription();
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}", "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=10.0, quantity=0}", (java.lang.Double) (-1.0d), (int) ' ');
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "hi!", "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}", (java.lang.Double) 0.0d, (int) ' ');
        product5.setName("Product{id=100, name='', description='', price=10.0, quantity=0}");
        product5.setPrice((java.lang.Double) 0.0d);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.String str7 = product5.toString();
        java.lang.Long long8 = product5.getId();
        java.lang.String str9 = product5.getDescription();
        java.lang.String str10 = product5.getDescription();
        java.lang.String str11 = product5.getDescription();
        int int12 = product5.getQuantity();
        java.lang.Double double13 = product5.getPrice();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str7, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}", "Product{id=0, name='hi!', description='', price=100.0, quantity=0}", (java.lang.Double) 10.0d, 0);
        java.lang.String str6 = product5.toString();
        java.lang.Double double7 = product5.getPrice();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=1, name='Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}', description='Product{id=0, name='hi!', description='', price=100.0, quantity=0}', price=10.0, quantity=0}" + "'", str6, "Product{id=1, name='Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}', description='Product{id=0, name='hi!', description='', price=100.0, quantity=0}', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getName();
        product5.setDescription("hi!");
        product5.setPrice((java.lang.Double) 1.0d);
        java.lang.String str13 = product5.getName();
        product5.setQuantity((int) (byte) 100);
        java.util.List<java.lang.Double> doubleList16 = product5.getPriceHistory();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(doubleList16);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
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
        java.lang.String str20 = product5.getDescription();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 0L);
        java.lang.String str9 = product5.getDescription();
        product5.setDescription("Product{id=100, name='hi!', description='', price=10.0, quantity=0}");
        java.lang.Long long12 = product5.getId();
        product5.setDescription("Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}");
        java.lang.String str15 = product5.getName();
        product5.setPrice((java.lang.Double) (-1.0d));
        product5.setQuantity((int) (byte) 10);
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        int int11 = product5.getQuantity();
        java.util.List<java.lang.Double> doubleList12 = product5.getPriceHistory();
        int int13 = product5.getQuantity();
        java.lang.String str14 = product5.toString();
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(doubleList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}" + "'", str14, "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}");
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "Product{id=100, name='hi!', description='', price=10.0, quantity=0}", "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}", (java.lang.Double) 0.0d, (int) (short) 100);
        product5.setName("Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}");
        product5.setPrice((java.lang.Double) 100.0d);
        int int10 = product5.getQuantity();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setName("hi!");
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 100.0d);
        java.lang.Class<?> wildcardClass11 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.Long long7 = product5.getId();
        java.lang.Long long8 = product5.getId();
        product5.setName("Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}");
        java.lang.String str11 = product5.getDescription();
        product5.setName("Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=100}");
        product5.setDescription("Product{id=0, name='Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}', description='Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}', price=1.0, quantity=0}");
        int int16 = product5.getQuantity();
        product5.setId((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=100, name='', description='', price=10.0, quantity=0}", "", (java.lang.Double) 100.0d, (int) ' ');
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        java.lang.Long long8 = product5.getId();
        java.util.List<java.lang.Double> doubleList9 = product5.getPriceHistory();
        java.lang.String str10 = product5.toString();
        java.lang.Long long11 = product5.getId();
        product5.setDescription("Product{id=100, name='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', description='', price=-1.0, quantity=0}");
        product5.setId((java.lang.Long) 100L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(doubleList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}" + "'", str10, "Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.String str7 = product5.toString();
        product5.setName("Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}");
        java.lang.String str10 = product5.toString();
        product5.setDescription("Product{id=0, name='hi!', description='', price=100.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str7, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Product{id=100, name='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', description='', price=1.0, quantity=0}" + "'", str10, "Product{id=100, name='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', description='', price=1.0, quantity=0}");
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.String str7 = product5.toString();
        product5.setId((java.lang.Long) 100L);
        java.lang.Double double10 = product5.getPrice();
        java.lang.Double double11 = product5.getPrice();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str7, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setQuantity((int) '#');
        product5.setDescription("");
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        product5.setId((java.lang.Long) 10L);
        java.util.List<java.lang.Double> doubleList19 = product5.getPriceHistory();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleList19);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
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
        product5.setPrice((java.lang.Double) 100.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(doubleList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}" + "'", str13, "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList16);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=100, name='Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=100}', description='', price=1.0, quantity=-1}", "Product{id=0, name='hi!', description='hi!', price=1.0, quantity=100}", (java.lang.Double) 10.0d, 97);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=-1, name='hi!', description='', price=0.0, quantity=100}", "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}", (java.lang.Double) 0.0d, 52);
        product5.setName("Product{id=1, name='', description='', price=-1.0, quantity=100}");
        java.lang.Class<?> wildcardClass8 = product5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
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
        java.lang.String str21 = product5.getDescription();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Product{id=100, name='Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}', description='Product{id=100, name='hi!', description='', price=1.0, quantity=0}', price=10.0, quantity=0}" + "'", str20, "Product{id=100, name='Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}', description='Product{id=100, name='hi!', description='', price=1.0, quantity=0}', price=10.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str21, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.util.List<java.lang.Double> doubleList10 = product5.getPriceHistory();
        java.lang.Double double11 = product5.getPrice();
        product5.setId((java.lang.Long) 0L);
        java.util.List<java.lang.Double> doubleList14 = product5.getPriceHistory();
        product5.setName("Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}");
        product5.setDescription("Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}");
        java.lang.Double double19 = product5.getPrice();
        product5.setDescription("Product{id=-1, name='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', description='Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}', price=10.0, quantity=32}");
        org.junit.Assert.assertNotNull(doubleList10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(doubleList14);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=1, name='', description='', price=-1.0, quantity=100}", "Product{id=1, name='hi!', description='Product{id=-1, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}", (java.lang.Double) 10.0d, (int) (byte) -1);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}", "Product{id=0, name='Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}', description='Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}', price=0.0, quantity=100}", (java.lang.Double) 0.0d, (int) (byte) -1);
        java.lang.String str6 = product5.getDescription();
        int int7 = product5.getQuantity();
        java.lang.Class<?> wildcardClass8 = product5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=0, name='Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}', description='Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}', price=0.0, quantity=100}" + "'", str6, "Product{id=0, name='Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}', description='Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}', price=0.0, quantity=100}");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
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
        product5.setPrice((java.lang.Double) 100.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}" + "'", str13, "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}");
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        int int11 = product5.getQuantity();
        java.util.List<java.lang.Double> doubleList12 = product5.getPriceHistory();
        java.lang.String str13 = product5.toString();
        product5.setQuantity((int) (byte) 100);
        java.util.List<java.lang.Double> doubleList16 = product5.getPriceHistory();
        product5.addPriceToHistory((java.lang.Double) 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(doubleList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}" + "'", str13, "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList16);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setId((java.lang.Long) 10L);
        java.lang.Long long14 = product5.getId();
        java.lang.String str15 = product5.getDescription();
        java.lang.String str16 = product5.getName();
        product5.setId((java.lang.Long) 1L);
        java.util.List<java.lang.Double> doubleList19 = product5.getPriceHistory();
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(doubleList19);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) (-1.0d));
        java.lang.String str12 = product5.getDescription();
        java.lang.Long long13 = product5.getId();
        int int14 = product5.getQuantity();
        product5.addPriceToHistory((java.lang.Double) (-1.0d));
        product5.setName("Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        product5.setId((java.lang.Long) 0L);
        java.lang.Long long21 = product5.getId();
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        product5.setDescription("Product{id=-1, name='hi!', description='', price=0.0, quantity=100}");
        java.lang.String str11 = product5.getDescription();
        product5.setName("Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}");
        product5.setDescription("Product{id=10, name='hi!', description='', price=10.0, quantity=0}");
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product{id=-1, name='hi!', description='', price=0.0, quantity=100}" + "'", str11, "Product{id=-1, name='hi!', description='', price=0.0, quantity=100}");
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=0, name='hi!', description='', price=1.0, quantity=0}", "Product{id=100, name='', description='', price=10.0, quantity=0}", (java.lang.Double) (-1.0d), (int) '#');
        product5.setId((java.lang.Long) 10L);
        java.util.List<java.lang.Double> doubleList8 = product5.getPriceHistory();
        java.lang.String str9 = product5.toString();
        java.lang.String str10 = product5.getName();
        java.util.List<java.lang.Double> doubleList11 = product5.getPriceHistory();
        org.junit.Assert.assertNotNull(doubleList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=10, name='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=-1.0, quantity=35}" + "'", str9, "Product{id=10, name='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=-1.0, quantity=35}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str10, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList11);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "Product{id=100, name='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', description='', price=-1.0, quantity=0}", "Product{id=100, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=0.0, quantity=0}", (java.lang.Double) 0.0d, (-1));
        int int6 = product5.getQuantity();
        java.lang.Long long7 = product5.getId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        product5.setQuantity(0);
        java.lang.Double double13 = product5.getPrice();
        java.util.List<java.lang.Double> doubleList14 = product5.getPriceHistory();
        product5.setName("Product{id=100, name='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', description='', price=10.0, quantity=0}");
        product5.setPrice((java.lang.Double) 100.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(doubleList14);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}", "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", (java.lang.Double) 100.0d, (int) '4');
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Long long8 = product5.getId();
        product5.setName("Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=1.0, quantity=1}");
        java.lang.String str11 = product5.getDescription();
        java.lang.Class<?> wildcardClass12 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str7, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str11, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.lang.String str10 = product5.getName();
        java.lang.String str11 = product5.getName();
        java.lang.String str12 = product5.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str12, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
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
        java.lang.String str20 = product5.toString();
        product5.setName("Product{id=100, name='hi!', description='', price=1.0, quantity=100}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertNotNull(doubleList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Product{id=0, name='hi!', description='hi!', price=1.0, quantity=0}" + "'", str19, "Product{id=0, name='hi!', description='hi!', price=1.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Product{id=0, name='hi!', description='hi!', price=1.0, quantity=0}" + "'", str20, "Product{id=0, name='hi!', description='hi!', price=1.0, quantity=0}");
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=10, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=100, name='hi!', description='', price=1.0, quantity=0}', price=100.0, quantity=52}", "Product{id=0, name='hi!', description='Product{id=-1, name='hi!', description='', price=0.0, quantity=100}', price=-1.0, quantity=0}", (java.lang.Double) 0.0d, 1);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
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
        product5.setQuantity((int) '#');
        java.lang.String str21 = product5.getDescription();
        int int22 = product5.getQuantity();
        product5.setName("");
        product5.setId((java.lang.Long) 1L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.Long long7 = product5.getId();
        int int8 = product5.getQuantity();
        java.lang.String str9 = product5.getDescription();
        java.lang.String str10 = product5.getDescription();
        product5.setQuantity((int) (short) 0);
        product5.setQuantity(32);
        java.util.List<java.lang.Double> doubleList15 = product5.getPriceHistory();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(doubleList15);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=1, name='', description='', price=-1.0, quantity=100}", "Product{id=10, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=10.0, quantity=35}", (java.lang.Double) (-1.0d), (int) (byte) 1);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.lang.String str10 = product5.getName();
        java.lang.String str11 = product5.toString();
        product5.setQuantity((int) (short) 100);
        java.lang.String str14 = product5.getDescription();
        product5.setId((java.lang.Long) 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str11, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        product5.setName("hi!");
        java.lang.Double double10 = product5.getPrice();
        product5.setId((java.lang.Long) (-1L));
        java.lang.String str13 = product5.getName();
        java.lang.String str14 = product5.getDescription();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", "Product{id=0, name='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=0}", (java.lang.Double) 10.0d, (-1));
        product5.setDescription("Product{id=10, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=10.0, quantity=35}");
        java.lang.Double double8 = product5.getPrice();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 0.0d);
        int int11 = product5.getQuantity();
        product5.setQuantity((int) '#');
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        product5.setName("Product{id=10, name='Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}', description='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', price=10.0, quantity=100}");
        product5.setName("Product{id=1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=0}', description='hi!', price=1.0, quantity=35}");
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
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
        java.lang.Class<?> wildcardClass25 = product5.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 0.0d);
        product5.setName("Product{id=100, name='', description='', price=10.0, quantity=0}");
        product5.setPrice((java.lang.Double) 10.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.Long long7 = product5.getId();
        int int8 = product5.getQuantity();
        product5.setQuantity(35);
        java.lang.String str11 = product5.getDescription();
        java.lang.String str12 = product5.getDescription();
        product5.setDescription("Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=100}");
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
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
        java.lang.String str18 = product5.getDescription();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Product{id=100, name='hi!', description='', price=10.0, quantity=35}" + "'", str15, "Product{id=100, name='hi!', description='', price=10.0, quantity=35}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.lang.String str10 = product5.toString();
        product5.setQuantity((int) (byte) 10);
        java.lang.Class<?> wildcardClass13 = product5.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str10, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "Product{id=100, name='hi!', description='', price=1.0, quantity=1}", "Product{id=1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='Product{id=100, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='', price=10.0, quantity=0}', price=1.0, quantity=0}', price=0.0, quantity=0}", (java.lang.Double) (-1.0d), (int) (short) -1);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
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
        java.lang.String str22 = product5.toString();
        product5.setPrice((java.lang.Double) 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(doubleList16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Product{id=100, name='hi!', description='', price=-1.0, quantity=35}" + "'", str22, "Product{id=100, name='hi!', description='', price=-1.0, quantity=35}");
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        java.lang.String str10 = product5.getDescription();
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        java.lang.Double double13 = product5.getPrice();
        java.util.List<java.lang.Double> doubleList14 = product5.getPriceHistory();
        product5.setName("Product{id=100, name='hi!', description='', price=10.0, quantity=35}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(doubleList14);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=-1, name='hi!', description='', price=1.0, quantity=0}", "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}", (java.lang.Double) 0.0d, (int) (short) 100);
        java.lang.String str6 = product5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=-1, name='hi!', description='', price=1.0, quantity=0}" + "'", str6, "Product{id=-1, name='hi!', description='', price=1.0, quantity=0}");
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}", "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", (java.lang.Double) 100.0d, (int) '4');
        product5.addPriceToHistory((java.lang.Double) 10.0d);
        java.lang.String str8 = product5.getDescription();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str8, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        java.lang.String str9 = product5.getDescription();
        product5.setId((java.lang.Long) 10L);
        java.lang.String str12 = product5.toString();
        java.lang.Double double13 = product5.getPrice();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Product{id=10, name='hi!', description='', price=1.0, quantity=0}" + "'", str12, "Product{id=10, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=100, name='', description='', price=10.0, quantity=0}", "", (java.lang.Double) 100.0d, (int) ' ');
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        java.lang.Class<?> wildcardClass8 = product5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
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
        product5.setQuantity(52);
        product5.setId((java.lang.Long) (-1L));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
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
        product5.setQuantity(52);
        product5.setPrice((java.lang.Double) (-1.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(doubleList16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "", "Product{id=1, name='Product{id=100, name='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', description='', price=1.0, quantity=0}', description='Product{id=0, name='hi!', description='', price=0.0, quantity=0}', price=10.0, quantity=-1}", (java.lang.Double) 10.0d, (int) (short) 1);
        product5.setName("Product{id=0, name='', description='', price=1.0, quantity=0}");
        product5.setDescription("Product{id=10, name='hi!', description='', price=1.0, quantity=0}");
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}", "Product{id=100, name='hi!', description='', price=1.0, quantity=10}", (java.lang.Double) (-1.0d), (int) (short) 100);
        java.lang.String str6 = product5.getName();
        java.util.List<java.lang.Double> doubleList7 = product5.getPriceHistory();
        product5.setName("hi!");
        java.lang.String str10 = product5.getDescription();
        product5.setPrice((java.lang.Double) 10.0d);
        int int13 = product5.getQuantity();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}" + "'", str6, "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=10}" + "'", str10, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=100, name='hi!', description='', price=10.0, quantity=0}", "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", (java.lang.Double) 1.0d, 35);
        product5.setQuantity((int) 'a');
        product5.setId((java.lang.Long) 0L);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "hi!", "Product{id=1, name='', description='', price=-1.0, quantity=100}", (java.lang.Double) 0.0d, (int) (byte) 10);
        java.lang.String str6 = product5.getName();
        product5.setPrice((java.lang.Double) (-1.0d));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=100}", "Product{id=100, name='', description='', price=10.0, quantity=0}", (java.lang.Double) 1.0d, 0);
        java.lang.String str6 = product5.getName();
        product5.setQuantity((-1));
        product5.setName("Product{id=100, name='', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=100}" + "'", str6, "Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=100}");
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
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
        java.lang.Long long17 = product5.getId();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str7, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=0, name='Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}', description='Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}', price=1.0, quantity=0}", "Product{id=1, name='Product{id=-1, name='hi!', description='', price=0.0, quantity=100}', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=0.0, quantity=52}", (java.lang.Double) (-1.0d), 0);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setName("");
        product5.addPriceToHistory((java.lang.Double) (-1.0d));
        java.lang.String str13 = product5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=100, name='', description='', price=1.0, quantity=0}" + "'", str13, "Product{id=100, name='', description='', price=1.0, quantity=0}");
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}", "Product{id=100, name='hi!', description='', price=1.0, quantity=10}", (java.lang.Double) (-1.0d), (int) (short) 100);
        java.lang.String str6 = product5.getName();
        java.util.List<java.lang.Double> doubleList7 = product5.getPriceHistory();
        product5.setName("hi!");
        product5.setDescription("Product{id=1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=0}', description='hi!', price=1.0, quantity=35}");
        product5.addPriceToHistory((java.lang.Double) (-1.0d));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}" + "'", str6, "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList7);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.util.List<java.lang.Double> doubleList7 = product5.getPriceHistory();
        product5.setQuantity((int) (short) 100);
        java.lang.Double double10 = product5.getPrice();
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) (-1.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(doubleList7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=100, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=0.0, quantity=0}", "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}", (java.lang.Double) 10.0d, (int) (short) 0);
        product5.setPrice((java.lang.Double) 100.0d);
    }
}

