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
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        product5.setQuantity((int) (short) 10);
        java.lang.String str9 = product5.toString();
        java.lang.Long long10 = product5.getId();
        java.lang.String str11 = product5.getDescription();
        product5.setDescription("");
        java.util.List<java.lang.Double> doubleList14 = product5.getPriceHistory();
        java.util.List<java.lang.Double> doubleList15 = product5.getPriceHistory();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=10}" + "'", str9, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(doubleList14);
        org.junit.Assert.assertNotNull(doubleList15);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "", "", (java.lang.Double) (-1.0d), (int) (byte) 100);
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        java.lang.Long long8 = product5.getId();
        java.lang.Class<?> wildcardClass9 = product5.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}", "Product{id=-1, name='hi!', description='', price=0.0, quantity=100}", (java.lang.Double) 1.0d, (int) 'a');
        java.lang.String str6 = product5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}" + "'", str6, "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}");
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setQuantity((int) (short) 1);
        java.lang.Double double10 = product5.getPrice();
        java.lang.String str11 = product5.getName();
        product5.setId((java.lang.Long) 0L);
        product5.setName("Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}");
        java.lang.Class<?> wildcardClass16 = product5.getClass();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
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
        java.lang.Class<?> wildcardClass20 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setQuantity((int) (short) 1);
        java.lang.Double double10 = product5.getPrice();
        java.lang.String str11 = product5.getName();
        product5.setDescription("Product{id=1, name='Product{id=-1, name='hi!', description='', price=0.0, quantity=100}', description='hi!', price=100.0, quantity=35}");
        java.lang.Class<?> wildcardClass14 = product5.getClass();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "Product{id=100, name='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', description='', price=1.0, quantity=0}", "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}", (java.lang.Double) 10.0d, 100);
        product5.setDescription("Product{id=1, name='Product{id=100, name='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', description='', price=1.0, quantity=0}', description='Product{id=0, name='hi!', description='', price=0.0, quantity=0}', price=10.0, quantity=-1}");
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=10, name='Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}', description='Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}', price=100.0, quantity=-1}", "Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=1.0, quantity=1}", (java.lang.Double) 1.0d, 0);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        java.lang.String str9 = product5.getDescription();
        java.lang.String str10 = product5.getDescription();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
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
        java.lang.Class<?> wildcardClass20 = product5.getClass();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(doubleList15);
        org.junit.Assert.assertNotNull(doubleList16);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", "hi!", (java.lang.Double) 100.0d, (int) '#');
        int int6 = product5.getQuantity();
        product5.setName("Product{id=100, name='', description='', price=10.0, quantity=0}");
        java.lang.Double double9 = product5.getPrice();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.addPriceToHistory((java.lang.Double) 1.0d);
        product5.setDescription("Product{id=-1, name='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=-1.0, quantity=35}");
        java.lang.Double double16 = product5.getPrice();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        product5.setId((java.lang.Long) 1L);
        product5.setPrice((java.lang.Double) 1.0d);
        java.util.List<java.lang.Double> doubleList14 = product5.getPriceHistory();
        java.lang.String str15 = product5.getName();
        product5.setName("Product{id=-1, name='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=-1.0, quantity=35}");
        org.junit.Assert.assertNotNull(doubleList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.String str8 = product5.getDescription();
        java.util.List<java.lang.Double> doubleList9 = product5.getPriceHistory();
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.String str12 = product5.getName();
        product5.setDescription("");
        int int15 = product5.getQuantity();
        java.lang.String str16 = product5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(doubleList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Product{id=100, name='hi!', description='', price=0.0, quantity=0}" + "'", str16, "Product{id=100, name='hi!', description='', price=0.0, quantity=0}");
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        product5.setQuantity((int) (short) 10);
        java.lang.Double double9 = product5.getPrice();
        product5.setDescription("");
        java.lang.Long long12 = product5.getId();
        product5.setQuantity((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.String str11 = product5.getDescription();
        java.lang.Long long12 = product5.getId();
        product5.setDescription("Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}");
        java.lang.String str15 = product5.toString();
        java.lang.Class<?> wildcardClass16 = product5.getClass();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Product{id=0, name='hi!', description='Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}', price=0.0, quantity=0}" + "'", str15, "Product{id=0, name='hi!', description='Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}', price=0.0, quantity=0}");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        product5.setQuantity((int) (short) 10);
        java.lang.Double double9 = product5.getPrice();
        product5.setId((java.lang.Long) 100L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getName();
        product5.setName("");
        java.lang.String str11 = product5.getName();
        java.lang.Double double12 = product5.getPrice();
        java.lang.String str13 = product5.getName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}", "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", (java.lang.Double) 100.0d, (int) '4');
        int int6 = product5.getQuantity();
        java.lang.Class<?> wildcardClass7 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        product5.setQuantity((int) (short) 10);
        java.lang.String str9 = product5.toString();
        product5.setDescription("hi!");
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.Double double14 = product5.getPrice();
        product5.setPrice((java.lang.Double) (-1.0d));
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        java.lang.String str21 = product5.getName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=10}" + "'", str9, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
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
        product5.addPriceToHistory((java.lang.Double) 1.0d);
        product5.setPrice((java.lang.Double) 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.Long long7 = product5.getId();
        int int8 = product5.getQuantity();
        product5.setQuantity(35);
        java.lang.String str11 = product5.getDescription();
        java.lang.String str12 = product5.toString();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=35}" + "'", str12, "Product{id=100, name='hi!', description='', price=1.0, quantity=35}");
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "", "Product{id=100, name='hi!', description='', price=1.0, quantity=35}", (java.lang.Double) 0.0d, 10);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}", "Product{id=1, name='Product{id=-1, name='hi!', description='', price=0.0, quantity=100}', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=0.0, quantity=52}", (java.lang.Double) 1.0d, (int) ' ');
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}", "Product{id=100, name='hi!', description='', price=1.0, quantity=10}", (java.lang.Double) 1.0d, (int) 'a');
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.String str8 = product5.getName();
        product5.setQuantity((int) (short) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=10}" + "'", str8, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.String str7 = product5.toString();
        java.lang.Long long8 = product5.getId();
        product5.setPrice((java.lang.Double) 0.0d);
        int int11 = product5.getQuantity();
        java.lang.Double double12 = product5.getPrice();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str7, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.String str7 = product5.toString();
        java.lang.Long long8 = product5.getId();
        java.lang.String str9 = product5.getDescription();
        java.lang.String str10 = product5.getDescription();
        product5.setQuantity(35);
        product5.setQuantity(0);
        java.lang.Long long15 = product5.getId();
        java.lang.String str16 = product5.getDescription();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str7, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.String str7 = product5.toString();
        java.lang.Long long8 = product5.getId();
        product5.setPrice((java.lang.Double) 0.0d);
        product5.setDescription("Product{id=0, name='hi!', description='', price=-1.0, quantity=0}");
        product5.setQuantity((int) (byte) 100);
        product5.setName("Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str7, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.String str7 = product5.toString();
        java.lang.Long long8 = product5.getId();
        java.lang.String str9 = product5.getDescription();
        java.lang.String str10 = product5.getDescription();
        product5.setQuantity(35);
        java.lang.String str13 = product5.toString();
        java.lang.String str14 = product5.toString();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str7, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=35}" + "'", str13, "Product{id=100, name='hi!', description='', price=1.0, quantity=35}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=35}" + "'", str14, "Product{id=100, name='hi!', description='', price=1.0, quantity=35}");
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.util.List<java.lang.Double> doubleList10 = product5.getPriceHistory();
        java.lang.Long long11 = product5.getId();
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setQuantity((int) (short) 0);
        org.junit.Assert.assertNotNull(doubleList10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
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
        java.lang.String str19 = product5.getName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Product{id=0, name='hi!', description='hi!', price=1.0, quantity=0}" + "'", str15, "Product{id=0, name='hi!', description='hi!', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.Double double8 = product5.getPrice();
        product5.setQuantity((int) (byte) 0);
        product5.setDescription("Product{id=0, name='hi!', description='', price=0.0, quantity=0}");
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        java.lang.String str15 = product5.getDescription();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Product{id=0, name='hi!', description='', price=0.0, quantity=0}" + "'", str15, "Product{id=0, name='hi!', description='', price=0.0, quantity=0}");
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=100, name='', description='', price=10.0, quantity=0}", "", (java.lang.Double) 100.0d, (int) ' ');
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        product5.setQuantity((int) (short) 0);
        product5.setName("Product{id=100, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=0.0, quantity=0}");
        java.util.List<java.lang.Double> doubleList12 = product5.getPriceHistory();
        org.junit.Assert.assertNotNull(doubleList12);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=100, name='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', description='', price=1.0, quantity=0}", "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}", (java.lang.Double) 1.0d, (int) (byte) 10);
        product5.addPriceToHistory((java.lang.Double) 100.0d);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
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
        product5.setDescription("Product{id=100, name='hi!', description='', price=100.0, quantity=0}");
        java.lang.String str26 = product5.getDescription();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str14, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str16, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Product{id=100, name='hi!', description='', price=100.0, quantity=0}" + "'", str26, "Product{id=100, name='hi!', description='', price=100.0, quantity=0}");
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        product5.setQuantity((int) (short) 10);
        java.lang.Double double9 = product5.getPrice();
        java.util.List<java.lang.Double> doubleList10 = product5.getPriceHistory();
        int int11 = product5.getQuantity();
        java.lang.Long long12 = product5.getId();
        java.lang.Class<?> wildcardClass13 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(doubleList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
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
        java.lang.Long long18 = product5.getId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(doubleList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}" + "'", str13, "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getName();
        product5.setName("");
        java.lang.String str11 = product5.getName();
        java.lang.Double double12 = product5.getPrice();
        product5.setQuantity((int) (short) -1);
        int int15 = product5.getQuantity();
        java.lang.String str16 = product5.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Product{id=0, name='', description='', price=1.0, quantity=-1}" + "'", str16, "Product{id=0, name='', description='', price=1.0, quantity=-1}");
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getDescription();
        java.lang.Long long9 = product5.getId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        int int11 = product5.getQuantity();
        product5.setPrice((java.lang.Double) (-1.0d));
        java.util.List<java.lang.Double> doubleList14 = product5.getPriceHistory();
        java.lang.Class<?> wildcardClass15 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(doubleList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        product5.setDescription("Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}");
        java.lang.Class<?> wildcardClass13 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        product5.setId((java.lang.Long) 1L);
        product5.setPrice((java.lang.Double) 1.0d);
        product5.setId((java.lang.Long) 1L);
        java.lang.Double double16 = product5.getPrice();
        product5.setDescription("hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.lang.Double double10 = product5.getPrice();
        java.lang.String str11 = product5.getName();
        product5.setDescription("Product{id=100, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='', price=10.0, quantity=0}");
        product5.setQuantity((int) (short) 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=100, name='hi!', description='', price=-1.0, quantity=0}", "Product{id=0, name='hi!', description='hi!', price=1.0, quantity=0}", (java.lang.Double) 10.0d, (int) '4');
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}", "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", (java.lang.Double) 100.0d, (int) '4');
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.String str8 = product5.toString();
        java.lang.Class<?> wildcardClass9 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str7, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Product{id=10, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=100, name='hi!', description='', price=1.0, quantity=0}', price=100.0, quantity=52}" + "'", str8, "Product{id=10, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=100, name='hi!', description='', price=1.0, quantity=0}', price=100.0, quantity=52}");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}", "Product{id=0, name='hi!', description='', price=1.0, quantity=0}", (java.lang.Double) (-1.0d), (int) (byte) 10);
        product5.setPrice((java.lang.Double) 1.0d);
        java.lang.Class<?> wildcardClass8 = product5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        product5.setQuantity((int) (short) 10);
        java.lang.String str9 = product5.toString();
        product5.setDescription("hi!");
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.Double double14 = product5.getPrice();
        java.lang.Long long15 = product5.getId();
        java.lang.Class<?> wildcardClass16 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=10}" + "'", str9, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=100, name='hi!', description='', price=1.0, quantity=10}", "Product{id=0, name='hi!', description='', price=1.0, quantity=0}", (java.lang.Double) 0.0d, (int) (short) -1);
        java.lang.Long long6 = product5.getId();
        product5.setPrice((java.lang.Double) 1.0d);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        java.lang.String str10 = product5.getDescription();
        java.lang.String str11 = product5.toString();
        int int12 = product5.getQuantity();
        product5.setQuantity(52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str11, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) (-1.0d), (int) (byte) 100);
        java.lang.String str6 = product5.getName();
        int int7 = product5.getQuantity();
        product5.setPrice((java.lang.Double) (-1.0d));
        java.lang.Class<?> wildcardClass10 = product5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.Double double8 = product5.getPrice();
        java.lang.String str9 = product5.toString();
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setName("Product{id=100, name='hi!', description='', price=1.0, quantity=1}");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str9, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.Double double8 = product5.getPrice();
        java.lang.String str9 = product5.toString();
        java.lang.String str10 = product5.toString();
        java.lang.String str11 = product5.getDescription();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str9, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str10, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        java.lang.Long long10 = product5.getId();
        product5.setQuantity((int) (short) 100);
        product5.setId((java.lang.Long) (-1L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}", "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}", (java.lang.Double) 100.0d, (-1));
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        org.junit.Assert.assertNotNull(doubleList6);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) (-1.0d));
        java.lang.String str12 = product5.getDescription();
        java.lang.Long long13 = product5.getId();
        int int14 = product5.getQuantity();
        product5.addPriceToHistory((java.lang.Double) (-1.0d));
        product5.setPrice((java.lang.Double) (-1.0d));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        int int11 = product5.getQuantity();
        java.util.List<java.lang.Double> doubleList12 = product5.getPriceHistory();
        java.lang.String str13 = product5.toString();
        product5.setQuantity((int) (byte) 100);
        int int16 = product5.getQuantity();
        product5.setName("Product{id=-1, name='hi!', description='', price=-1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(doubleList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}" + "'", str13, "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}", "Product{id=100, name='hi!', description='', price=1.0, quantity=10}", (java.lang.Double) (-1.0d), (int) (short) 100);
        java.lang.String str6 = product5.getName();
        java.util.List<java.lang.Double> doubleList7 = product5.getPriceHistory();
        product5.setName("hi!");
        java.lang.String str10 = product5.toString();
        java.lang.Double double11 = product5.getPrice();
        product5.setQuantity(35);
        java.lang.String str14 = product5.getDescription();
        int int15 = product5.getQuantity();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}" + "'", str6, "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=100}" + "'", str10, "Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=100}");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=10}" + "'", str14, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}", "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}", (java.lang.Double) 10.0d, 100);
        java.lang.Long long6 = product5.getId();
        java.lang.Long long7 = product5.getId();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getDescription();
        product5.setId((java.lang.Long) 0L);
        int int11 = product5.getQuantity();
        java.lang.Double double12 = product5.getPrice();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.String str7 = product5.toString();
        java.lang.Long long8 = product5.getId();
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.Double double11 = product5.getPrice();
        java.lang.String str12 = product5.getDescription();
        java.lang.String str13 = product5.getDescription();
        java.lang.String str14 = product5.getName();
        product5.setName("Product{id=100, name='hi!', description='', price=0.0, quantity=0}");
        product5.setQuantity(35);
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str7, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getName();
        product5.setQuantity(1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=100, name='', description='', price=10.0, quantity=0}", "Product{id=10, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=100, name='hi!', description='', price=1.0, quantity=0}', price=100.0, quantity=52}", (java.lang.Double) 10.0d, (int) (byte) 100);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=-1, name='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=-1.0, quantity=35}", "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}", (java.lang.Double) 100.0d, (-1));
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
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
        product5.setQuantity((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(doubleList16);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=-1, name='hi!', description='', price=0.0, quantity=100}", "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}", (java.lang.Double) 0.0d, 52);
        product5.setName("Product{id=1, name='', description='', price=-1.0, quantity=100}");
        java.lang.String str8 = product5.getDescription();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}" + "'", str8, "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}");
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "Product{id=100, name='hi!', description='', price=100.0, quantity=0}", "", (java.lang.Double) (-1.0d), (int) '4');
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}", "Product{id=100, name='hi!', description='', price=1.0, quantity=10}", (java.lang.Double) 1.0d, (int) 'a');
        java.lang.Double double6 = product5.getPrice();
        product5.addPriceToHistory((java.lang.Double) (-1.0d));
        java.util.List<java.lang.Double> doubleList9 = product5.getPriceHistory();
        product5.setPrice((java.lang.Double) (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertNotNull(doubleList9);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 0L);
        java.lang.String str9 = product5.getDescription();
        int int10 = product5.getQuantity();
        java.lang.Long long11 = product5.getId();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
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
        java.lang.String str22 = product5.getName();
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}" + "'", str20, "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str22, "Product{id=100, name='', description='', price=10.0, quantity=0}");
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        java.lang.Long long10 = product5.getId();
        product5.setQuantity(0);
        product5.setQuantity((int) (byte) -1);
        java.util.List<java.lang.Double> doubleList15 = product5.getPriceHistory();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertNotNull(doubleList15);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.util.List<java.lang.Double> doubleList7 = product5.getPriceHistory();
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(doubleList7);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}", "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}", (java.lang.Double) (-1.0d), (int) (short) 0);
        product5.setId((java.lang.Long) 10L);
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        java.lang.String str10 = product5.getDescription();
        java.lang.Double double11 = product5.getPrice();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}" + "'", str10, "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setName("hi!");
        product5.setName("");
        java.lang.String str10 = product5.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        java.lang.String str9 = product5.getDescription();
        int int10 = product5.getQuantity();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        int int11 = product5.getQuantity();
        java.util.List<java.lang.Double> doubleList12 = product5.getPriceHistory();
        java.lang.String str13 = product5.toString();
        product5.setQuantity((int) (byte) 100);
        int int16 = product5.getQuantity();
        java.lang.String str17 = product5.getDescription();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(doubleList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}" + "'", str13, "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str17, "Product{id=100, name='', description='', price=10.0, quantity=0}");
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.String str11 = product5.toString();
        java.lang.Double double12 = product5.getPrice();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product{id=0, name='hi!', description='', price=0.0, quantity=0}" + "'", str11, "Product{id=0, name='hi!', description='', price=0.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.Double double8 = product5.getPrice();
        java.lang.String str9 = product5.toString();
        product5.setDescription("Product{id=100, name='hi!', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str9, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        int int8 = product5.getQuantity();
        product5.setDescription("hi!");
        java.util.List<java.lang.Double> doubleList11 = product5.getPriceHistory();
        java.lang.String str12 = product5.getName();
        product5.setDescription("");
        java.lang.Double double15 = product5.getPrice();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getName();
        product5.setName("");
        product5.setDescription("");
        int int13 = product5.getQuantity();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 0L);
        java.lang.String str9 = product5.getDescription();
        java.lang.Double double10 = product5.getPrice();
        java.lang.String str11 = product5.toString();
        product5.setPrice((java.lang.Double) 10.0d);
        java.lang.Double double14 = product5.getPrice();
        product5.setDescription("Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=-1.0, quantity=100}");
        java.lang.Class<?> wildcardClass17 = product5.getClass();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str11, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=100, name='hi!', description='', price=10.0, quantity=0}", "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}", (java.lang.Double) 10.0d, (int) ' ');
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        product5.setPrice((java.lang.Double) 1.0d);
        java.lang.Double double9 = product5.getPrice();
        product5.setId((java.lang.Long) 1L);
        java.lang.Double double12 = product5.getPrice();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}", "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}", (java.lang.Double) 10.0d, 100);
        java.lang.String str6 = product5.getName();
        java.lang.Long long7 = product5.getId();
        product5.setQuantity((int) (short) 10);
        java.lang.Class<?> wildcardClass10 = product5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}" + "'", str6, "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.Double double8 = product5.getPrice();
        product5.setQuantity((int) (byte) 0);
        java.lang.Long long11 = product5.getId();
        java.util.List<java.lang.Double> doubleList12 = product5.getPriceHistory();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(doubleList12);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) (-1.0d), (int) (byte) 100);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.Long long7 = product5.getId();
        int int8 = product5.getQuantity();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setQuantity((int) '#');
        product5.setName("hi!");
        java.lang.String str15 = product5.getDescription();
        java.lang.String str16 = product5.getDescription();
        java.lang.Double double17 = product5.getPrice();
        java.lang.String str18 = product5.getDescription();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getName();
        java.util.List<java.lang.Double> doubleList9 = product5.getPriceHistory();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(doubleList9);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=0, name='hi!', description='Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}', price=0.0, quantity=0}", "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", (java.lang.Double) (-1.0d), (int) (byte) 1);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=100, name='hi!', description='', price=-1.0, quantity=0}", "Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=-1.0, quantity=100}', price=-1.0, quantity=10}", (java.lang.Double) 100.0d, 0);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.String str12 = product5.getDescription();
        java.lang.String str13 = product5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=100, name='hi!', description='', price=0.0, quantity=0}" + "'", str13, "Product{id=100, name='hi!', description='', price=0.0, quantity=0}");
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setId((java.lang.Long) 10L);
        java.lang.Long long14 = product5.getId();
        java.lang.String str15 = product5.getDescription();
        java.lang.Double double16 = product5.getPrice();
        product5.setId((java.lang.Long) 0L);
        java.lang.String str19 = product5.getName();
        java.util.List<java.lang.Double> doubleList20 = product5.getPriceHistory();
        java.lang.Class<?> wildcardClass21 = doubleList20.getClass();
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(doubleList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setQuantity((int) '#');
        product5.setDescription("");
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        product5.setId((java.lang.Long) 10L);
        java.lang.String str19 = product5.toString();
        java.lang.String str20 = product5.getName();
        product5.setName("Product{id=-1, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Product{id=10, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=10.0, quantity=35}" + "'", str19, "Product{id=10, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=10.0, quantity=35}");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.util.List<java.lang.Double> doubleList10 = product5.getPriceHistory();
        java.lang.Long long11 = product5.getId();
        product5.setPrice((java.lang.Double) 100.0d);
        java.lang.String str14 = product5.getDescription();
        org.junit.Assert.assertNotNull(doubleList10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.Long long7 = product5.getId();
        java.lang.Long long8 = product5.getId();
        int int9 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 1.0d);
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.String str7 = product5.toString();
        java.lang.Long long8 = product5.getId();
        product5.addPriceToHistory((java.lang.Double) 10.0d);
        product5.setPrice((java.lang.Double) 0.0d);
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str7, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setQuantity((int) '#');
        product5.setDescription("");
        product5.setName("Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}");
        product5.setPrice((java.lang.Double) (-1.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        int int8 = product5.getQuantity();
        product5.setDescription("hi!");
        java.lang.String str11 = product5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}" + "'", str11, "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}");
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=1, name='', description='Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}', price=-1.0, quantity=100}", "Product{id=0, name='', description='', price=1.0, quantity=0}", (java.lang.Double) 0.0d, 35);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
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
        java.lang.String str25 = product5.getDescription();
        java.lang.String str26 = product5.getDescription();
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}" + "'", str20, "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        product5.setId((java.lang.Long) 1L);
        product5.setPrice((java.lang.Double) 1.0d);
        java.util.List<java.lang.Double> doubleList14 = product5.getPriceHistory();
        java.lang.String str15 = product5.getName();
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        product5.setDescription("Product{id=0, name='Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}', description='Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}', price=0.0, quantity=100}");
        org.junit.Assert.assertNotNull(doubleList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
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
        java.lang.Class<?> wildcardClass27 = product5.getClass();
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}" + "'", str20, "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.util.List<java.lang.Double> doubleList10 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 10L);
        product5.setName("Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        product5.setName("Product{id=100, name='hi!', description='hi!', price=10.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList10);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.Double double8 = product5.getPrice();
        product5.setQuantity((int) (byte) 0);
        product5.setDescription("Product{id=100, name='hi!', description='', price=-1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "", "Product{id=0, name='hi!', description='', price=1.0, quantity=0}", (java.lang.Double) (-1.0d), 0);
        product5.setPrice((java.lang.Double) 100.0d);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
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
        product5.setPrice((java.lang.Double) (-1.0d));
        product5.setId((java.lang.Long) (-1L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str14, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=10, name='hi!', description='', price=10.0, quantity=0}", "Product{id=1, name='hi!', description='', price=1.0, quantity=0}", (java.lang.Double) (-1.0d), 1);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=-1, name='hi!', description='', price=0.0, quantity=100}", "Product{id=100, name='hi!', description='', price=1.0, quantity=10}", (java.lang.Double) 10.0d, (int) (short) 10);
        java.lang.String str6 = product5.getDescription();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=10}" + "'", str6, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=0, name='hi!', description='', price=1.0, quantity=0}", "Product{id=100, name='', description='', price=10.0, quantity=0}", (java.lang.Double) (-1.0d), (int) '#');
        product5.setName("Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        java.lang.String str9 = product5.getDescription();
        product5.setId((java.lang.Long) 10L);
        int int12 = product5.getQuantity();
        java.lang.String str13 = product5.getDescription();
        product5.setDescription("Product{id=10, name='Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}', description='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', price=10.0, quantity=100}");
        java.lang.String str16 = product5.getName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", "hi!", (java.lang.Double) 100.0d, (int) '#');
        int int6 = product5.getQuantity();
        product5.setName("Product{id=100, name='', description='', price=10.0, quantity=0}");
        java.lang.String str9 = product5.getName();
        product5.setName("Product{id=-1, name='hi!', description='', price=0.0, quantity=100}");
        java.util.List<java.lang.Double> doubleList12 = product5.getPriceHistory();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str9, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList12);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setQuantity((int) (short) 1);
        java.lang.Double double10 = product5.getPrice();
        java.lang.String str11 = product5.getName();
        product5.setId((java.lang.Long) 0L);
        java.lang.Long long14 = product5.getId();
        java.util.List<java.lang.Double> doubleList15 = product5.getPriceHistory();
        java.util.List<java.lang.Double> doubleList16 = product5.getPriceHistory();
        java.lang.Long long17 = product5.getId();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(doubleList15);
        org.junit.Assert.assertNotNull(doubleList16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "Product{id=100, name='', description='', price=10.0, quantity=0}", "Product{id=0, name='hi!', description='', price=1.0, quantity=0}", (java.lang.Double) 0.0d, (int) (short) -1);
        product5.addPriceToHistory((java.lang.Double) 10.0d);
        java.lang.Class<?> wildcardClass8 = product5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getName();
        product5.setDescription("hi!");
        product5.setId((java.lang.Long) 10L);
        java.lang.String str13 = product5.getName();
        product5.setId((java.lang.Long) 10L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        java.lang.Long long9 = product5.getId();
        java.util.List<java.lang.Double> doubleList10 = product5.getPriceHistory();
        int int11 = product5.getQuantity();
        product5.setName("Product{id=1, name='Product{id=-1, name='hi!', description='', price=0.0, quantity=100}', description='hi!', price=100.0, quantity=35}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertNotNull(doubleList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "Product{id=0, name='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=0}", "Product{id=-1, name='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=-1.0, quantity=35}", (java.lang.Double) 100.0d, (int) (short) 100);
        product5.addPriceToHistory((java.lang.Double) 10.0d);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}", "Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}", (java.lang.Double) 100.0d, (int) '4');
        java.lang.String str6 = product5.getDescription();
        java.lang.Double double7 = product5.getPrice();
        java.util.List<java.lang.Double> doubleList8 = product5.getPriceHistory();
        java.lang.Class<?> wildcardClass9 = product5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}" + "'", str6, "Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertNotNull(doubleList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.util.List<java.lang.Double> doubleList10 = product5.getPriceHistory();
        java.lang.String str11 = product5.getDescription();
        java.lang.String str12 = product5.getDescription();
        product5.setDescription("Product{id=100, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=0.0, quantity=0}");
        java.lang.Double double15 = product5.getPrice();
        org.junit.Assert.assertNotNull(doubleList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setQuantity((int) (byte) 0);
        java.lang.String str11 = product5.toString();
        product5.setQuantity(100);
        java.lang.String str14 = product5.getDescription();
        product5.setQuantity((-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str11, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "", "", (java.lang.Double) (-1.0d), (int) (byte) 100);
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        java.util.List<java.lang.Double> doubleList8 = product5.getPriceHistory();
        product5.setDescription("Product{id=100, name='hi!', description='', price=1.0, quantity=1}");
        org.junit.Assert.assertNotNull(doubleList8);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "", "Product{id=0, name='hi!', description='Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}', price=1.0, quantity=0}", (java.lang.Double) 1.0d, (int) (short) 10);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", "hi!", (java.lang.Double) 100.0d, (int) '#');
        int int6 = product5.getQuantity();
        product5.setName("Product{id=100, name='', description='', price=10.0, quantity=0}");
        java.lang.Double double9 = product5.getPrice();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.addPriceToHistory((java.lang.Double) 1.0d);
        product5.setId((java.lang.Long) (-1L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "", "", (java.lang.Double) 0.0d, (int) (byte) 100);
        product5.setQuantity((int) (short) -1);
        product5.setPrice((java.lang.Double) (-1.0d));
        product5.setQuantity((int) '#');
        int int12 = product5.getQuantity();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "Product{id=100, name='', description='', price=10.0, quantity=0}", "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", (java.lang.Double) 1.0d, 100);
        product5.setName("Product{id=100, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}");
        product5.setId((java.lang.Long) 100L);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "hi!", "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}", (java.lang.Double) 0.0d, (int) ' ');
        product5.setName("Product{id=100, name='', description='', price=10.0, quantity=0}");
        product5.setPrice((java.lang.Double) 10.0d);
        java.lang.Double double10 = product5.getPrice();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=100, name='hi!', description='', price=1.0, quantity=35}", "Product{id=10, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=100, name='hi!', description='', price=1.0, quantity=0}', price=100.0, quantity=52}", (java.lang.Double) 10.0d, (int) (short) 1);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 0.0d);
        product5.setPrice((java.lang.Double) 100.0d);
        java.lang.String str14 = product5.toString();
        product5.addPriceToHistory((java.lang.Double) 10.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Product{id=100, name='hi!', description='', price=100.0, quantity=0}" + "'", str14, "Product{id=100, name='hi!', description='', price=100.0, quantity=0}");
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setId((java.lang.Long) 10L);
        product5.setName("");
        product5.setQuantity((int) (short) 10);
        product5.setName("Product{id=1, name='Product{id=1, name='', description='', price=-1.0, quantity=100}', description='hi!', price=100.0, quantity=35}");
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "Product{id=100, name='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', description='', price=-1.0, quantity=0}", "Product{id=100, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=0.0, quantity=0}", (java.lang.Double) 0.0d, (-1));
        product5.setPrice((java.lang.Double) 0.0d);
        product5.setName("Product{id=100, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}");
        product5.setQuantity((int) (short) 1);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=0, name='hi!', description='', price=1.0, quantity=0}", "Product{id=100, name='', description='', price=10.0, quantity=0}", (java.lang.Double) (-1.0d), (int) '#');
        product5.setId((java.lang.Long) 10L);
        java.util.List<java.lang.Double> doubleList8 = product5.getPriceHistory();
        product5.setName("Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=-1.0, quantity=100}");
        org.junit.Assert.assertNotNull(doubleList8);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "hi!", "Product{id=10, name='hi!', description='', price=1.0, quantity=10}", (java.lang.Double) (-1.0d), (int) (short) 100);
        product5.setQuantity((int) (short) 1);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        product5.setName("");
        product5.addPriceToHistory((java.lang.Double) (-1.0d));
        java.lang.Long long12 = product5.getId();
        java.lang.Class<?> wildcardClass13 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setName("");
        java.lang.String str14 = product5.toString();
        product5.setQuantity(0);
        product5.setDescription("Product{id=100, name='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', description='', price=-1.0, quantity=0}");
        java.util.List<java.lang.Double> doubleList19 = product5.getPriceHistory();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str14, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList19);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}", "Product{id=-1, name='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', description='Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}', price=10.0, quantity=32}", (java.lang.Double) (-1.0d), 52);
        product5.setName("Product{id=0, name='hi!', description='', price=-1.0, quantity=0}");
        product5.setPrice((java.lang.Double) 0.0d);
        product5.setName("Product{id=0, name='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=0}");
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.Long long7 = product5.getId();
        int int8 = product5.getQuantity();
        java.lang.String str9 = product5.getDescription();
        int int10 = product5.getQuantity();
        java.lang.Long long11 = product5.getId();
        product5.addPriceToHistory((java.lang.Double) 1.0d);
        java.lang.Long long14 = product5.getId();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=10, name='Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}', description='Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}', price=100.0, quantity=-1}", "Product{id=-1, name='hi!', description='', price=-1.0, quantity=0}", (java.lang.Double) 100.0d, (int) 'a');
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=0, name='hi!', description='', price=1.0, quantity=1}", "Product{id=0, name='Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}', description='Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}', price=0.0, quantity=100}", (java.lang.Double) 100.0d, (int) (byte) 0);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", "hi!", (java.lang.Double) 100.0d, (int) '#');
        int int6 = product5.getQuantity();
        product5.setName("Product{id=100, name='', description='', price=10.0, quantity=0}");
        java.lang.String str9 = product5.getName();
        product5.setName("Product{id=-1, name='hi!', description='', price=0.0, quantity=100}");
        product5.setName("Product{id=-1, name='hi!', description='', price=0.0, quantity=100}");
        java.util.List<java.lang.Double> doubleList14 = product5.getPriceHistory();
        java.lang.Double double15 = product5.getPrice();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str9, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
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
        java.lang.Double double20 = product5.getPrice();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}", "Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}", (java.lang.Double) 1.0d, (int) (short) -1);
        product5.setQuantity(1);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        java.lang.String str10 = product5.getDescription();
        java.lang.Double double11 = product5.getPrice();
        product5.addPriceToHistory((java.lang.Double) 10.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setQuantity((int) (short) 1);
        product5.setQuantity((int) (short) 100);
        product5.setPrice((java.lang.Double) 0.0d);
        product5.setQuantity((int) (short) -1);
        int int16 = product5.getQuantity();
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        product5.setQuantity((int) (short) 10);
        java.lang.String str9 = product5.toString();
        product5.setDescription("hi!");
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.Double double14 = product5.getPrice();
        product5.setPrice((java.lang.Double) (-1.0d));
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        java.lang.Double double19 = product5.getPrice();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=10}" + "'", str9, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "Product{id=100, name='hi!', description='', price=-1.0, quantity=0}", "Product{id=10, name='Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}', description='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', price=10.0, quantity=100}", (java.lang.Double) 100.0d, (int) (short) 0);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "Product{id=0, name='hi!', description='Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}', price=0.0, quantity=0}", "Product{id=0, name='hi!', description='Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}', price=1.0, quantity=0}", (java.lang.Double) 1.0d, (int) (short) 100);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
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
        product5.setPrice((java.lang.Double) (-1.0d));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.lang.Double double10 = product5.getPrice();
        product5.setId((java.lang.Long) 10L);
        product5.setName("Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}");
        java.lang.Double double15 = product5.getPrice();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.addPriceToHistory((java.lang.Double) 10.0d);
        product5.setQuantity((int) (byte) 10);
        java.lang.String str10 = product5.getDescription();
        product5.setId((java.lang.Long) 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        product5.setName("hi!");
        java.lang.String str10 = product5.toString();
        java.lang.Long long11 = product5.getId();
        java.lang.String str12 = product5.getName();
        java.lang.String str13 = product5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str10, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str13, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
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
        java.lang.String str16 = product5.getName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}" + "'", str15, "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}", "Product{id=100, name='hi!', description='', price=1.0, quantity=100}", (java.lang.Double) (-1.0d), (int) '4');
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.Double double8 = product5.getPrice();
        product5.setQuantity((int) (byte) 0);
        java.lang.Long long11 = product5.getId();
        product5.setPrice((java.lang.Double) 10.0d);
        java.lang.Class<?> wildcardClass14 = product5.getClass();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        java.lang.String str11 = product5.getDescription();
        java.lang.Double double12 = product5.getPrice();
        product5.setDescription("Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        product5.setDescription("Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        java.lang.Long long17 = product5.getId();
        java.lang.Class<?> wildcardClass18 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "", "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}", (java.lang.Double) 10.0d, (int) (short) 1);
        java.lang.String str6 = product5.getDescription();
        product5.setQuantity((int) (byte) 100);
        product5.setDescription("Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}");
        int int11 = product5.getQuantity();
        product5.setName("Product{id=100, name='Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}', description='Product{id=100, name='hi!', description='', price=1.0, quantity=0}', price=10.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}" + "'", str6, "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        product5.setQuantity((int) (short) 10);
        java.lang.String str9 = product5.toString();
        product5.setDescription("hi!");
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.Double double14 = product5.getPrice();
        int int15 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=10}" + "'", str9, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 0L);
        java.lang.String str9 = product5.getDescription();
        java.lang.Double double10 = product5.getPrice();
        java.lang.String str11 = product5.toString();
        product5.setPrice((java.lang.Double) 1.0d);
        product5.setName("Product{id=0, name='hi!', description='hi!', price=1.0, quantity=0}");
        product5.addPriceToHistory((java.lang.Double) 10.0d);
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str11, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        int int11 = product5.getQuantity();
        java.util.List<java.lang.Double> doubleList12 = product5.getPriceHistory();
        java.lang.String str13 = product5.toString();
        product5.setQuantity((int) (byte) 100);
        product5.setQuantity(10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(doubleList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}" + "'", str13, "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}");
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.String str7 = product5.toString();
        java.lang.Long long8 = product5.getId();
        java.lang.String str9 = product5.getDescription();
        java.lang.String str10 = product5.getDescription();
        product5.setQuantity(35);
        product5.setQuantity(0);
        java.lang.String str15 = product5.toString();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str7, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str15, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) (-1.0d), (int) (byte) 100);
        product5.setPrice((java.lang.Double) 100.0d);
        java.lang.Long long8 = product5.getId();
        product5.setId((java.lang.Long) (-1L));
        java.util.List<java.lang.Double> doubleList11 = product5.getPriceHistory();
        java.lang.Class<?> wildcardClass12 = product5.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertNotNull(doubleList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
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
        java.lang.Long long19 = product5.getId();
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
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        java.lang.String str11 = product5.getDescription();
        java.lang.Double double12 = product5.getPrice();
        product5.setDescription("Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        product5.setDescription("Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        java.util.List<java.lang.Double> doubleList17 = product5.getPriceHistory();
        product5.addPriceToHistory((java.lang.Double) 10.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(doubleList17);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        product5.setId((java.lang.Long) 1L);
        product5.setPrice((java.lang.Double) 1.0d);
        java.util.List<java.lang.Double> doubleList14 = product5.getPriceHistory();
        java.lang.String str15 = product5.getName();
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        java.lang.String str18 = product5.toString();
        int int19 = product5.getQuantity();
        org.junit.Assert.assertNotNull(doubleList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Product{id=1, name='hi!', description='', price=1.0, quantity=0}" + "'", str18, "Product{id=1, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
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
        product5.setDescription("Product{id=100, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str14, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}", "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}", (java.lang.Double) 100.0d, (-1));
        product5.setId((java.lang.Long) 10L);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
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
        product5.setDescription("Product{id=100, name='hi!', description='', price=10.0, quantity=35}");
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
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.util.List<java.lang.Double> doubleList10 = product5.getPriceHistory();
        java.lang.String str11 = product5.getName();
        java.lang.String str12 = product5.toString();
        java.lang.Long long13 = product5.getId();
        product5.setPrice((java.lang.Double) 100.0d);
        org.junit.Assert.assertNotNull(doubleList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str12, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
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
        java.lang.Class<?> wildcardClass23 = product5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
        org.junit.Assert.assertNotNull(doubleList20);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
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
        java.lang.Long long22 = product5.getId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Product{id=100, name='hi!', description='', price=10.0, quantity=0}" + "'", str21, "Product{id=100, name='hi!', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}", "Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}", (java.lang.Double) 0.0d, 100);
        product5.addPriceToHistory((java.lang.Double) (-1.0d));
        java.lang.Class<?> wildcardClass8 = product5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=100, name='hi!', description='', price=1.0, quantity=35}", "Product{id=0, name='Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}', description='Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}', price=0.0, quantity=100}", (java.lang.Double) 0.0d, 100);
        java.lang.Double double6 = product5.getPrice();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "", "", (java.lang.Double) 0.0d, (int) (short) -1);
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        java.lang.Long long8 = product5.getId();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getDescription();
        java.lang.String str9 = product5.toString();
        java.lang.Double double10 = product5.getPrice();
        java.lang.String str11 = product5.getDescription();
        java.util.List<java.lang.Double> doubleList12 = product5.getPriceHistory();
        java.lang.Double double13 = product5.getPrice();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str9, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(doubleList12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.util.List<java.lang.Double> doubleList10 = product5.getPriceHistory();
        java.lang.Double double11 = product5.getPrice();
        product5.setId((java.lang.Long) 0L);
        java.util.List<java.lang.Double> doubleList14 = product5.getPriceHistory();
        product5.setName("Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}");
        product5.setDescription("Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}");
        java.lang.String str19 = product5.getName();
        product5.setId((java.lang.Long) 1L);
        org.junit.Assert.assertNotNull(doubleList10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(doubleList14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}" + "'", str19, "Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}");
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=100, name='', description='', price=0.0, quantity=0}", "Product{id=100, name='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', description='', price=1.0, quantity=0}", (java.lang.Double) 100.0d, 0);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "hi!", "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}", (java.lang.Double) 0.0d, (int) ' ');
        product5.setQuantity((int) (byte) 10);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.util.List<java.lang.Double> doubleList8 = product5.getPriceHistory();
        product5.addPriceToHistory((java.lang.Double) 10.0d);
        org.junit.Assert.assertNotNull(doubleList8);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", "Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}", (java.lang.Double) (-1.0d), (int) '#');
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        java.lang.Long long10 = product5.getId();
        product5.setQuantity((int) (short) 100);
        java.util.List<java.lang.Double> doubleList13 = product5.getPriceHistory();
        product5.addPriceToHistory((java.lang.Double) (-1.0d));
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
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}", "Product{id=100, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=0.0, quantity=0}", (java.lang.Double) (-1.0d), (int) (byte) -1);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        product5.addPriceToHistory((java.lang.Double) 10.0d);
        org.junit.Assert.assertNotNull(doubleList6);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setQuantity((int) (short) 1);
        java.lang.Double double10 = product5.getPrice();
        java.lang.String str11 = product5.getName();
        product5.setId((java.lang.Long) 0L);
        product5.setDescription("");
        product5.setPrice((java.lang.Double) (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setQuantity((int) '#');
        product5.setId((java.lang.Long) 100L);
        product5.setQuantity(0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        java.lang.String str10 = product5.getName();
        java.lang.Long long11 = product5.getId();
        product5.setQuantity((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
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
        product5.addPriceToHistory((java.lang.Double) (-1.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=100, name='', description='', price=10.0, quantity=0}", "Product{id=0, name='hi!', description='', price=1.0, quantity=0}", (java.lang.Double) 10.0d, (int) (short) 100);
        product5.setName("hi!");
        java.lang.String str8 = product5.getDescription();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str8, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 0L);
        int int9 = product5.getQuantity();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getName();
        product5.setDescription("hi!");
        product5.setId((java.lang.Long) 10L);
        java.lang.String str13 = product5.getDescription();
        product5.setDescription("Product{id=0, name='hi!', description='Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}', price=1.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 0L);
        java.lang.String str9 = product5.getDescription();
        java.lang.Double double10 = product5.getPrice();
        java.lang.String str11 = product5.toString();
        product5.setPrice((java.lang.Double) 10.0d);
        java.util.List<java.lang.Double> doubleList14 = product5.getPriceHistory();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str11, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList14);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 0L);
        java.lang.String str9 = product5.getDescription();
        java.lang.Double double10 = product5.getPrice();
        java.lang.String str11 = product5.toString();
        product5.setId((java.lang.Long) 1L);
        java.util.List<java.lang.Double> doubleList14 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str11, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList14);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
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
        java.lang.Long long24 = product5.getId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str14, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str16, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList19);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 100L + "'", long24 == 100L);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.util.List<java.lang.Double> doubleList10 = product5.getPriceHistory();
        java.lang.String str11 = product5.getName();
        java.lang.String str12 = product5.toString();
        java.lang.String str13 = product5.toString();
        java.lang.String str14 = product5.getDescription();
        product5.setPrice((java.lang.Double) 0.0d);
        org.junit.Assert.assertNotNull(doubleList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str12, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str13, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
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
        java.lang.String str22 = product5.getName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(doubleList16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=-1, name='hi!', description='', price=0.0, quantity=100}", "", (java.lang.Double) 100.0d, 1);
        product5.setQuantity((int) (byte) 1);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setId((java.lang.Long) 10L);
        java.lang.Long long14 = product5.getId();
        java.lang.String str15 = product5.getDescription();
        java.lang.Double double16 = product5.getPrice();
        product5.setPrice((java.lang.Double) 10.0d);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=0, name='Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}', description='Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}', price=1.0, quantity=0}", "Product{id=1, name='hi!', description='', price=1.0, quantity=0}", (java.lang.Double) 0.0d, 10);
        java.lang.String str6 = product5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=0, name='Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}', description='Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}', price=1.0, quantity=0}" + "'", str6, "Product{id=0, name='Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}', description='Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}', price=1.0, quantity=0}");
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        product5.setName("hi!");
        java.lang.Double double10 = product5.getPrice();
        java.lang.String str11 = product5.toString();
        product5.setDescription("Product{id=100, name='hi!', description='', price=-1.0, quantity=35}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str11, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) 10.0d);
        java.lang.String str12 = product5.getDescription();
        product5.setPrice((java.lang.Double) 0.0d);
        product5.setId((java.lang.Long) 0L);
        java.lang.Long long17 = product5.getId();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.String str8 = product5.getDescription();
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        java.lang.String str11 = product5.getDescription();
        product5.setDescription("Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        java.lang.String str9 = product5.getDescription();
        java.lang.String str10 = product5.getDescription();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        product5.setId((java.lang.Long) 1L);
        java.lang.Long long12 = product5.getId();
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=0, name='hi!', description='', price=1.0, quantity=0}", "Product{id=100, name='', description='', price=10.0, quantity=0}", (java.lang.Double) (-1.0d), (int) '#');
        product5.setId((java.lang.Long) 10L);
        java.util.List<java.lang.Double> doubleList8 = product5.getPriceHistory();
        java.lang.String str9 = product5.getDescription();
        product5.setPrice((java.lang.Double) 10.0d);
        org.junit.Assert.assertNotNull(doubleList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str9, "Product{id=100, name='', description='', price=10.0, quantity=0}");
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
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
        java.util.List<java.lang.Double> doubleList19 = product5.getPriceHistory();
        java.lang.Double double20 = product5.getPrice();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str14, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str16, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.lang.Double double10 = product5.getPrice();
        java.lang.Long long11 = product5.getId();
        java.lang.Long long12 = product5.getId();
        java.lang.Class<?> wildcardClass13 = product5.getClass();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.Double double8 = product5.getPrice();
        product5.setQuantity((int) (byte) 0);
        java.lang.String str11 = product5.getDescription();
        java.lang.Long long12 = product5.getId();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=100}", "Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=100}", (java.lang.Double) 100.0d, (int) (byte) -1);
        product5.setQuantity(0);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=100, name='hi!', description='', price=1.0, quantity=35}", "Product{id=0, name='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=0}", (java.lang.Double) 1.0d, (int) (short) 100);
        product5.addPriceToHistory((java.lang.Double) 100.0d);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 0L);
        java.lang.String str9 = product5.getDescription();
        java.lang.Double double10 = product5.getPrice();
        java.lang.String str11 = product5.toString();
        product5.setPrice((java.lang.Double) 10.0d);
        java.lang.Class<?> wildcardClass14 = product5.getClass();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str11, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        product5.setDescription("Product{id=-1, name='hi!', description='', price=0.0, quantity=100}");
        product5.setId((java.lang.Long) 100L);
        product5.setQuantity((-1));
        java.lang.String str15 = product5.getName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=100, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=0.0, quantity=0}", "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}", (java.lang.Double) 10.0d, (int) (short) 0);
        java.lang.String str6 = product5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=0, name='Product{id=100, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=0.0, quantity=0}', description='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', price=10.0, quantity=0}" + "'", str6, "Product{id=0, name='Product{id=100, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=0.0, quantity=0}', description='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', price=10.0, quantity=0}");
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) (-1.0d), (int) (byte) 100);
        product5.setPrice((java.lang.Double) 100.0d);
        java.lang.Long long8 = product5.getId();
        product5.setId((java.lang.Long) (-1L));
        product5.setId((java.lang.Long) 0L);
        product5.setName("Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        product5.setName("hi!");
        int int10 = product5.getQuantity();
        product5.setName("Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}");
        product5.setId((java.lang.Long) 100L);
        java.util.List<java.lang.Double> doubleList15 = product5.getPriceHistory();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(doubleList15);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
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
        java.util.List<java.lang.Double> doubleList22 = product5.getPriceHistory();
        java.lang.String str23 = product5.getDescription();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(doubleList16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(doubleList22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.Long long7 = product5.getId();
        int int8 = product5.getQuantity();
        product5.setName("Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}");
        java.lang.String str11 = product5.getDescription();
        java.lang.Long long12 = product5.getId();
        product5.setDescription("Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=-1.0, quantity=100}");
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        int int8 = product5.getQuantity();
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        product5.setId((java.lang.Long) 10L);
        product5.setQuantity(0);
        java.lang.Long long15 = product5.getId();
        java.lang.Double double16 = product5.getPrice();
        product5.setPrice((java.lang.Double) 10.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setId((java.lang.Long) 10L);
        product5.setName("");
        product5.setQuantity((int) (short) 10);
        product5.setName("Product{id=100, name='', description='', price=10.0, quantity=0}");
        product5.addPriceToHistory((java.lang.Double) 1.0d);
        java.lang.Double double22 = product5.getPrice();
        int int23 = product5.getQuantity();
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}", "Product{id=100, name='hi!', description='', price=1.0, quantity=10}", (java.lang.Double) (-1.0d), (int) (short) 100);
        java.lang.String str6 = product5.getName();
        java.util.List<java.lang.Double> doubleList7 = product5.getPriceHistory();
        product5.setName("hi!");
        java.lang.String str10 = product5.getDescription();
        product5.setPrice((java.lang.Double) 10.0d);
        java.util.List<java.lang.Double> doubleList13 = product5.getPriceHistory();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}" + "'", str6, "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=10}" + "'", str10, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
        org.junit.Assert.assertNotNull(doubleList13);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) (-1.0d));
        java.lang.String str12 = product5.getDescription();
        product5.setId((java.lang.Long) (-1L));
        product5.setId((java.lang.Long) (-1L));
        java.lang.Long long17 = product5.getId();
        product5.setId((java.lang.Long) 100L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
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
        java.lang.String str19 = product5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Product{id=100, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=0}', price=10.0, quantity=-1}" + "'", str19, "Product{id=100, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=0}', price=10.0, quantity=-1}");
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        product5.setName("");
        product5.addPriceToHistory((java.lang.Double) (-1.0d));
        java.lang.String str12 = product5.getName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=0, name='Product{id=10, name='hi!', description='', price=10.0, quantity=0}', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=0.0, quantity=-1}", "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}", (java.lang.Double) 1.0d, 1);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=100, name='hi!', description='', price=10.0, quantity=0}", "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}", (java.lang.Double) 10.0d, (int) ' ');
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        product5.setPrice((java.lang.Double) 1.0d);
        java.lang.Double double9 = product5.getPrice();
        product5.setId((java.lang.Long) 1L);
        product5.setQuantity((int) 'a');
        product5.setQuantity(35);
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=100, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=0}', price=10.0, quantity=-1}", "Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}", (java.lang.Double) 100.0d, (int) (short) 1);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "", "", (java.lang.Double) 0.0d, (int) (short) -1);
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        product5.setId((java.lang.Long) 100L);
        product5.setDescription("Product{id=0, name='hi!', description='Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}', price=0.0, quantity=0}");
        product5.setName("Product{id=100, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=0.0, quantity=0}");
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "hi!", "Product{id=1, name='', description='', price=-1.0, quantity=100}", (java.lang.Double) 0.0d, (int) (byte) 10);
        java.lang.Double double6 = product5.getPrice();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}", "Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}", (java.lang.Double) 0.0d, 35);
        product5.setDescription("Product{id=-1, name='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', description='Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}', price=10.0, quantity=32}");
        product5.setDescription("Product{id=0, name='hi!', description='', price=0.0, quantity=0}");
        java.lang.Double double10 = product5.getPrice();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
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
        product5.setName("Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}");
        product5.setId((java.lang.Long) 0L);
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
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.String str8 = product5.getDescription();
        java.util.List<java.lang.Double> doubleList9 = product5.getPriceHistory();
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.String str12 = product5.getName();
        product5.setDescription("");
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.String str17 = product5.getName();
        java.lang.Class<?> wildcardClass18 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(doubleList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
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
        java.lang.Long long17 = product5.getId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(doubleList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}" + "'", str13, "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setQuantity((int) (short) 1);
        product5.setQuantity((int) (short) 100);
        java.lang.String str12 = product5.getName();
        product5.setDescription("Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
        java.util.List<java.lang.Double> doubleList15 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 100L);
        java.util.List<java.lang.Double> doubleList18 = product5.getPriceHistory();
        java.lang.Class<?> wildcardClass19 = product5.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(doubleList15);
        org.junit.Assert.assertNotNull(doubleList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=100, name='hi!', description='', price=10.0, quantity=0}", "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}", (java.lang.Double) 10.0d, (int) ' ');
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        product5.setPrice((java.lang.Double) 1.0d);
        java.lang.Double double9 = product5.getPrice();
        java.lang.Class<?> wildcardClass10 = product5.getClass();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.String str7 = product5.toString();
        java.lang.Long long8 = product5.getId();
        product5.setPrice((java.lang.Double) 0.0d);
        product5.setDescription("Product{id=0, name='hi!', description='', price=-1.0, quantity=0}");
        product5.setQuantity((int) (byte) 100);
        product5.setPrice((java.lang.Double) 100.0d);
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str7, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "Product{id=1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=0}', description='hi!', price=1.0, quantity=35}", "Product{id=100, name='hi!', description='', price=-1.0, quantity=35}", (java.lang.Double) 10.0d, 97);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=100}", "Product{id=100, name='', description='', price=10.0, quantity=0}", (java.lang.Double) 1.0d, 0);
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        int int8 = product5.getQuantity();
        product5.setDescription("Product{id=100, name='', description='', price=0.0, quantity=0}");
        java.lang.Long long11 = product5.getId();
        product5.setName("Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=100}");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "Product{id=100, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=0.0, quantity=0}", "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}", (java.lang.Double) 0.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        org.junit.Assert.assertNotNull(doubleList6);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "", "", (java.lang.Double) (-1.0d), (int) (byte) 100);
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        java.lang.Long long8 = product5.getId();
        java.lang.Long long9 = product5.getId();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setName("");
        java.lang.Long long11 = product5.getId();
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        java.lang.String str14 = product5.getName();
        java.lang.String str15 = product5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Product{id=100, name='', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}" + "'", str15, "Product{id=100, name='', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}");
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
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
        product5.setPrice((java.lang.Double) 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str14, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str16, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Product{id=100, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='', price=10.0, quantity=0}" + "'", str19, "Product{id=100, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='', price=10.0, quantity=0}");
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
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
        product5.setPrice((java.lang.Double) 1.0d);
        java.lang.String str22 = product5.toString();
        org.junit.Assert.assertNotNull(doubleList10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(doubleList14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Product{id=0, name='Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}', description='Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}', price=1.0, quantity=0}" + "'", str19, "Product{id=0, name='Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}', description='Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}', price=1.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Product{id=0, name='Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}', description='Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}', price=1.0, quantity=0}" + "'", str22, "Product{id=0, name='Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}', description='Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}', price=1.0, quantity=0}");
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) (-1.0d));
        java.lang.String str12 = product5.getDescription();
        product5.setId((java.lang.Long) (-1L));
        product5.setId((java.lang.Long) (-1L));
        product5.setPrice((java.lang.Double) (-1.0d));
        java.lang.Class<?> wildcardClass19 = product5.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=1, name='Product{id=-1, name='hi!', description='', price=0.0, quantity=100}', description='hi!', price=100.0, quantity=35}", "Product{id=0, name='hi!', description='', price=0.0, quantity=0}", (java.lang.Double) 1.0d, 32);
        int int6 = product5.getQuantity();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=-1, name='hi!', description='', price=1.0, quantity=0}", "Product{id=100, name='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', description='', price=-1.0, quantity=0}", (java.lang.Double) 1.0d, (int) ' ');
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=100}", "Product{id=100, name='', description='', price=10.0, quantity=0}", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) (-1L));
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=-1, name='hi!', description='', price=0.0, quantity=100}", "Product{id=-1, name='hi!', description='', price=-1.0, quantity=0}", (java.lang.Double) 1.0d, (int) '#');
        int int6 = product5.getQuantity();
        product5.setId((java.lang.Long) 100L);
        product5.setPrice((java.lang.Double) (-1.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=100, name='hi!', description='', price=10.0, quantity=0}", "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}", (java.lang.Double) 10.0d, (int) ' ');
        java.lang.String str6 = product5.toString();
        java.lang.String str7 = product5.getDescription();
        product5.addPriceToHistory((java.lang.Double) 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=-1, name='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', description='Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}', price=10.0, quantity=32}" + "'", str6, "Product{id=-1, name='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', description='Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}', price=10.0, quantity=32}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}" + "'", str7, "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}");
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        product5.setName("hi!");
        java.lang.Double double10 = product5.getPrice();
        product5.setId((java.lang.Long) (-1L));
        int int13 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        java.lang.Long long16 = product5.getId();
        java.lang.String str17 = product5.getName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 0L);
        java.lang.String str9 = product5.getDescription();
        java.lang.Double double10 = product5.getPrice();
        java.lang.String str11 = product5.toString();
        product5.setPrice((java.lang.Double) 10.0d);
        int int14 = product5.getQuantity();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str11, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.String str7 = product5.toString();
        java.lang.Long long8 = product5.getId();
        java.lang.String str9 = product5.getDescription();
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        java.util.List<java.lang.Double> doubleList12 = product5.getPriceHistory();
        java.lang.String str13 = product5.getDescription();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str7, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(doubleList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.String str7 = product5.toString();
        product5.setQuantity((int) (byte) 100);
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str7, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setQuantity((int) '#');
        product5.setName("hi!");
        java.lang.String str15 = product5.toString();
        java.lang.String str16 = product5.getDescription();
        java.lang.String str17 = product5.getDescription();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Product{id=100, name='hi!', description='', price=10.0, quantity=35}" + "'", str15, "Product{id=100, name='hi!', description='', price=10.0, quantity=35}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
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
        java.util.List<java.lang.Double> doubleList17 = product5.getPriceHistory();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}" + "'", str13, "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(doubleList17);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        java.lang.String str9 = product5.getDescription();
        int int10 = product5.getQuantity();
        java.lang.Double double11 = product5.getPrice();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=-1.0, quantity=100}", "Product{id=100, name='Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=100}', description='', price=1.0, quantity=-1}", (java.lang.Double) (-1.0d), (int) (byte) 10);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        int int11 = product5.getQuantity();
        java.lang.String str12 = product5.toString();
        product5.setPrice((java.lang.Double) 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}" + "'", str12, "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}");
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getName();
        product5.setDescription("hi!");
        product5.setPrice((java.lang.Double) 1.0d);
        java.lang.String str13 = product5.getName();
        int int14 = product5.getQuantity();
        product5.setDescription("Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        product5.setQuantity(35);
        product5.setPrice((java.lang.Double) (-1.0d));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}", "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", (java.lang.Double) 0.0d, (int) '#');
        java.lang.String str6 = product5.getDescription();
        product5.setName("Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str6, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        java.lang.String str9 = product5.getName();
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        java.lang.Double double12 = product5.getPrice();
        java.lang.Long long13 = product5.getId();
        int int14 = product5.getQuantity();
        product5.setName("");
        product5.setId((java.lang.Long) 10L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        java.lang.String str10 = product5.getDescription();
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        java.lang.String str13 = product5.getName();
        java.lang.String str14 = product5.getDescription();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) (-1.0d));
        java.lang.String str12 = product5.getDescription();
        product5.setId((java.lang.Long) (-1L));
        product5.setId((java.lang.Long) (-1L));
        java.lang.Double double17 = product5.getPrice();
        product5.setPrice((java.lang.Double) 1.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        java.lang.String str10 = product5.getName();
        product5.setId((java.lang.Long) (-1L));
        product5.setQuantity(100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "hi!", "Product{id=0, name='Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}', description='Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}', price=1.0, quantity=0}", (java.lang.Double) 1.0d, 35);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}", (java.lang.Double) 10.0d, 35);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}", "Product{id=0, name='hi!', description='', price=0.0, quantity=0}", (java.lang.Double) 1.0d, (int) ' ');
        java.lang.String str6 = product5.getDescription();
        java.lang.String str7 = product5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=0, name='hi!', description='', price=0.0, quantity=0}" + "'", str6, "Product{id=0, name='hi!', description='', price=0.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}" + "'", str7, "Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}");
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        java.lang.Long long10 = product5.getId();
        product5.setQuantity((int) (short) 100);
        java.lang.Double double13 = product5.getPrice();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}", "Product{id=1, name='Product{id=-1, name='hi!', description='', price=0.0, quantity=100}', description='hi!', price=100.0, quantity=35}", (java.lang.Double) 1.0d, 1);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
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
        product5.setQuantity((int) (byte) 1);
        product5.setPrice((java.lang.Double) 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}" + "'", str13, "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}");
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        java.lang.Long long10 = product5.getId();
        product5.setQuantity((int) (short) 100);
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        java.lang.Long long15 = product5.getId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=10.0, quantity=0}", "Product{id=0, name='hi!', description='', price=1.0, quantity=0}", (java.lang.Double) 1.0d, 10);
        int int6 = product5.getQuantity();
        int int7 = product5.getQuantity();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
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
        product5.setPrice((java.lang.Double) 10.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}" + "'", str13, "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", "Product{id=0, name='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=0}", (java.lang.Double) 10.0d, (-1));
        product5.setId((java.lang.Long) 1L);
        java.util.List<java.lang.Double> doubleList8 = product5.getPriceHistory();
        product5.setPrice((java.lang.Double) (-1.0d));
        org.junit.Assert.assertNotNull(doubleList8);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
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
        java.util.List<java.lang.Double> doubleList25 = product5.getPriceHistory();
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
        org.junit.Assert.assertNotNull(doubleList25);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.Double double8 = product5.getPrice();
        java.lang.String str9 = product5.toString();
        java.lang.Double double10 = product5.getPrice();
        product5.addPriceToHistory((java.lang.Double) 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str9, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setId((java.lang.Long) 100L);
        product5.setDescription("Product{id=-1, name='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', description='Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}', price=10.0, quantity=32}");
        product5.setName("Product{id=-1, name='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', description='Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}', price=10.0, quantity=32}");
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getName();
        product5.setName("");
        int int11 = product5.getQuantity();
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        java.lang.Long long14 = product5.getId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", "hi!", (java.lang.Double) 100.0d, (int) '#');
        int int6 = product5.getQuantity();
        product5.setName("Product{id=100, name='', description='', price=10.0, quantity=0}");
        product5.setId((java.lang.Long) 10L);
        int int11 = product5.getQuantity();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getDescription();
        product5.setId((java.lang.Long) 0L);
        int int11 = product5.getQuantity();
        int int12 = product5.getQuantity();
        product5.setDescription("Product{id=1, name='Product{id=-1, name='hi!', description='', price=0.0, quantity=100}', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=0.0, quantity=52}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}", "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", (java.lang.Double) 0.0d, (int) '#');
        product5.setName("");
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.Double double8 = product5.getPrice();
        java.lang.String str9 = product5.toString();
        java.lang.Double double10 = product5.getPrice();
        java.lang.Double double11 = product5.getPrice();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str9, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 0L);
        java.lang.String str9 = product5.getDescription();
        java.lang.Double double10 = product5.getPrice();
        java.lang.String str11 = product5.toString();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setDescription("Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=-1.0, quantity=100}', price=-1.0, quantity=10}");
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str11, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}", "Product{id=0, name='hi!', description='Product{id=100, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='', price=10.0, quantity=0}', price=1.0, quantity=0}", (java.lang.Double) 0.0d, 0);
        java.lang.Class<?> wildcardClass6 = product5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "Product{id=100, name='', description='', price=10.0, quantity=0}", "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", (java.lang.Double) 1.0d, 100);
        product5.setName("Product{id=100, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}");
        product5.setQuantity((int) (short) 10);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
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
        product5.setPrice((java.lang.Double) (-1.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str14, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        int int8 = product5.getQuantity();
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        product5.setId((java.lang.Long) 10L);
        int int13 = product5.getQuantity();
        java.lang.String str14 = product5.toString();
        product5.setName("Product{id=100, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Product{id=10, name='hi!', description='', price=1.0, quantity=0}" + "'", str14, "Product{id=10, name='hi!', description='', price=1.0, quantity=0}");
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setName("");
        java.lang.Long long11 = product5.getId();
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        java.lang.String str14 = product5.getName();
        product5.setName("Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        java.util.List<java.lang.Double> doubleList17 = product5.getPriceHistory();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(doubleList17);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setQuantity((int) '#');
        java.lang.Long long13 = product5.getId();
        product5.setQuantity((int) (byte) 100);
        java.lang.String str16 = product5.getName();
        java.util.List<java.lang.Double> doubleList17 = product5.getPriceHistory();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(doubleList17);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}", "Product{id=-1, name='hi!', description='', price=0.0, quantity=100}", (java.lang.Double) 0.0d, (int) 'a');
        java.lang.Long long6 = product5.getId();
        product5.setDescription("Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getDescription();
        java.lang.String str9 = product5.toString();
        product5.setName("Product{id=100, name='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str9, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setQuantity((int) (byte) 0);
        java.lang.String str11 = product5.toString();
        product5.addPriceToHistory((java.lang.Double) 10.0d);
        java.lang.String str14 = product5.getDescription();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str11, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
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
        java.lang.String str20 = product5.getName();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
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
        java.lang.String str19 = product5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Product{id=100, name='Product{id=-1, name='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=-1.0, quantity=35}', description='', price=10.0, quantity=35}" + "'", str19, "Product{id=100, name='Product{id=-1, name='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=-1.0, quantity=35}', description='', price=10.0, quantity=35}");
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
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
        product5.addPriceToHistory((java.lang.Double) (-1.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}" + "'", str13, "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}");
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) 10.0d);
        java.lang.String str12 = product5.getDescription();
        product5.setPrice((java.lang.Double) 0.0d);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 10.0d);
        java.lang.Class<?> wildcardClass19 = product5.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setId((java.lang.Long) 10L);
        java.lang.Long long14 = product5.getId();
        java.lang.String str15 = product5.getDescription();
        product5.setQuantity(32);
        java.lang.Double double18 = product5.getPrice();
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setQuantity((int) '#');
        java.lang.Long long13 = product5.getId();
        product5.addPriceToHistory((java.lang.Double) (-1.0d));
        java.lang.Double double16 = product5.getPrice();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) (-1.0d), (int) (byte) 100);
        product5.setPrice((java.lang.Double) 100.0d);
        java.lang.Long long8 = product5.getId();
        product5.setDescription("Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}");
        product5.setName("Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=-1.0, quantity=100}");
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.String str11 = product5.getDescription();
        java.lang.Long long12 = product5.getId();
        java.lang.String str13 = product5.getDescription();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.lang.String str10 = product5.getName();
        java.util.List<java.lang.Double> doubleList11 = product5.getPriceHistory();
        java.util.List<java.lang.Double> doubleList12 = product5.getPriceHistory();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(doubleList11);
        org.junit.Assert.assertNotNull(doubleList12);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}", "Product{id=100, name='hi!', description='', price=1.0, quantity=10}", (java.lang.Double) (-1.0d), (int) (short) 100);
        java.lang.Long long6 = product5.getId();
        java.lang.Class<?> wildcardClass7 = product5.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
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
        java.util.List<java.lang.Double> doubleList23 = product5.getPriceHistory();
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}" + "'", str13, "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(doubleList23);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=10, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=100, name='hi!', description='', price=1.0, quantity=0}', price=100.0, quantity=52}", "Product{id=100, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=0.0, quantity=0}", (java.lang.Double) 100.0d, 52);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}", "Product{id=100, name='hi!', description='', price=1.0, quantity=10}", (java.lang.Double) (-1.0d), (int) (short) 100);
        java.lang.String str6 = product5.getName();
        java.util.List<java.lang.Double> doubleList7 = product5.getPriceHistory();
        product5.setName("hi!");
        java.lang.String str10 = product5.getDescription();
        java.lang.String str11 = product5.toString();
        product5.setPrice((java.lang.Double) 0.0d);
        java.util.List<java.lang.Double> doubleList14 = product5.getPriceHistory();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}" + "'", str6, "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=10}" + "'", str10, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=100}" + "'", str11, "Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=100}");
        org.junit.Assert.assertNotNull(doubleList14);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}", "Product{id=0, name='Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}', description='Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}', price=0.0, quantity=100}", (java.lang.Double) 0.0d, (int) (byte) -1);
        java.lang.String str6 = product5.getDescription();
        java.lang.String str7 = product5.getDescription();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=0, name='Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}', description='Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}', price=0.0, quantity=100}" + "'", str6, "Product{id=0, name='Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}', description='Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}', price=0.0, quantity=100}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=0, name='Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}', description='Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}', price=0.0, quantity=100}" + "'", str7, "Product{id=0, name='Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}', description='Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}', price=0.0, quantity=100}");
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=0, name='Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}', description='Product{id=0, name='Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}', description='Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}', price=0.0, quantity=100}', price=0.0, quantity=-1}", "Product{id=1, name='hi!', description='', price=1.0, quantity=0}", (java.lang.Double) (-1.0d), (int) (short) 100);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.Long long7 = product5.getId();
        java.lang.Long long8 = product5.getId();
        product5.setName("Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}");
        java.lang.String str11 = product5.getDescription();
        product5.setName("Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=100}");
        product5.setId((java.lang.Long) 100L);
        product5.setPrice((java.lang.Double) 1.0d);
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "", "", (java.lang.Double) (-1.0d), (int) (byte) 100);
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        product5.setDescription("Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}");
        product5.setName("Product{id=0, name='hi!', description='', price=0.0, quantity=0}");
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=10, name='Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}', description='', price=100.0, quantity=0}", "Product{id=100, name='Product{id=-1, name='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=-1.0, quantity=35}', description='', price=10.0, quantity=35}", (java.lang.Double) 0.0d, (int) (short) 1);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        java.lang.String str9 = product5.getName();
        java.lang.Class<?> wildcardClass10 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) (-1.0d));
        java.lang.String str12 = product5.getDescription();
        product5.setId((java.lang.Long) (-1L));
        product5.setId((java.lang.Long) (-1L));
        product5.setPrice((java.lang.Double) (-1.0d));
        product5.setId((java.lang.Long) (-1L));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setName("");
        java.lang.Long long11 = product5.getId();
        product5.setQuantity(35);
        java.util.List<java.lang.Double> doubleList14 = product5.getPriceHistory();
        product5.setQuantity((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertNotNull(doubleList14);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setId((java.lang.Long) 10L);
        java.lang.Long long14 = product5.getId();
        java.lang.String str15 = product5.getDescription();
        java.lang.Double double16 = product5.getPrice();
        product5.setId((java.lang.Long) 0L);
        java.lang.String str19 = product5.getName();
        java.util.List<java.lang.Double> doubleList20 = product5.getPriceHistory();
        java.lang.Class<?> wildcardClass21 = product5.getClass();
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(doubleList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
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
        java.lang.String str20 = product5.getName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=10}" + "'", str9, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
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
        product5.setDescription("Product{id=-1, name='hi!', description='', price=-1.0, quantity=0}");
        product5.setName("Product{id=100, name='hi!', description='', price=-1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str14, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str16, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "Product{id=10, name='Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}', description='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', price=10.0, quantity=100}", "Product{id=10, name='Product{id=100, name='hi!', description='', price=100.0, quantity=0}', description='', price=10.0, quantity=0}", (java.lang.Double) 0.0d, 0);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
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
        java.util.List<java.lang.Double> doubleList17 = product5.getPriceHistory();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(doubleList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}" + "'", str13, "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertNotNull(doubleList17);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.lang.Double double10 = product5.getPrice();
        java.lang.Long long11 = product5.getId();
        java.lang.Long long12 = product5.getId();
        java.util.List<java.lang.Double> doubleList13 = product5.getPriceHistory();
        product5.setName("Product{id=0, name='', description='', price=1.0, quantity=-1}");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(doubleList13);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "", "Product{id=100, name='hi!', description='', price=100.0, quantity=0}", (java.lang.Double) (-1.0d), (int) (byte) -1);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=0, name='hi!', description='hi!', price=1.0, quantity=100}", "Product{id=100, name='hi!', description='', price=-1.0, quantity=35}", (java.lang.Double) (-1.0d), (int) (byte) 0);
        product5.addPriceToHistory((java.lang.Double) 100.0d);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        int int8 = product5.getQuantity();
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.Class<?> wildcardClass13 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=10, name='hi!', description='', price=1.0, quantity=10}", "Product{id=100, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=0.0, quantity=0}", (java.lang.Double) 0.0d, 35);
        java.lang.Class<?> wildcardClass6 = product5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.String str7 = product5.toString();
        java.lang.Long long8 = product5.getId();
        java.lang.String str9 = product5.getDescription();
        java.lang.String str10 = product5.getDescription();
        product5.setQuantity(35);
        java.lang.String str13 = product5.toString();
        java.lang.String str14 = product5.getName();
        java.lang.Class<?> wildcardClass15 = product5.getClass();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str7, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=35}" + "'", str13, "Product{id=100, name='hi!', description='', price=1.0, quantity=35}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.String str12 = product5.getDescription();
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        java.lang.Double double15 = product5.getPrice();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        product5.setName("hi!");
        int int10 = product5.getQuantity();
        java.lang.Double double11 = product5.getPrice();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=100, name='hi!', description='', price=1.0, quantity=10}", "Product{id=0, name='hi!', description='', price=1.0, quantity=0}", (java.lang.Double) 0.0d, (int) (short) -1);
        java.lang.String str6 = product5.getName();
        java.lang.Double double7 = product5.getPrice();
        product5.setId((java.lang.Long) 100L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=10}" + "'", str6, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}", "Product{id=100, name='hi!', description='', price=1.0, quantity=10}", (java.lang.Double) (-1.0d), (int) (short) 100);
        java.lang.String str6 = product5.getName();
        java.util.List<java.lang.Double> doubleList7 = product5.getPriceHistory();
        product5.setName("hi!");
        java.lang.String str10 = product5.toString();
        java.lang.Double double11 = product5.getPrice();
        product5.setQuantity(35);
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        java.util.List<java.lang.Double> doubleList16 = product5.getPriceHistory();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}" + "'", str6, "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=100}" + "'", str10, "Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=100}");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleList16);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setName("");
        java.lang.Long long11 = product5.getId();
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        java.lang.String str14 = product5.getName();
        product5.setName("Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        int int17 = product5.getQuantity();
        product5.setId((java.lang.Long) (-1L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
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
        product5.setDescription("Product{id=100, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=0.0, quantity=0}");
        java.lang.Long long27 = product5.getId();
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}" + "'", str20, "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}" + "'", str24, "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 10L + "'", long27 == 10L);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}", "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", (java.lang.Double) 100.0d, (int) '4');
        java.lang.Double double6 = product5.getPrice();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=100, name='Product{id=-1, name='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=-1.0, quantity=35}', description='', price=10.0, quantity=35}", "Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}", (java.lang.Double) 100.0d, (int) (byte) 100);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
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
        product5.setQuantity(32);
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str11, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setName("");
        java.lang.Long long14 = product5.getId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        product5.setQuantity(0);
        java.lang.Double double13 = product5.getPrice();
        java.util.List<java.lang.Double> doubleList14 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(doubleList14);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "Product{id=100, name='hi!', description='', price=1.0, quantity=1}", "Product{id=1, name='', description='', price=-1.0, quantity=100}", (java.lang.Double) 10.0d, (int) (short) 100);
        product5.setQuantity((int) '4');
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
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
        java.util.List<java.lang.Double> doubleList26 = product5.getPriceHistory();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(doubleList23);
        org.junit.Assert.assertNotNull(doubleList26);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
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
        int int23 = product5.getQuantity();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str14, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str16, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "", "", (java.lang.Double) (-1.0d), (int) (byte) 100);
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        java.lang.Double double8 = product5.getPrice();
        java.lang.Double double9 = product5.getPrice();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setQuantity((int) (short) 1);
        java.lang.String str10 = product5.getName();
        product5.setQuantity((int) (short) 0);
        java.lang.String str13 = product5.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "", "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}", (java.lang.Double) (-1.0d), 0);
        java.lang.String str6 = product5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        product5.setName("hi!");
        int int10 = product5.getQuantity();
        product5.setName("Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}");
        product5.setId((java.lang.Long) 100L);
        java.lang.String str15 = product5.toString();
        product5.setPrice((java.lang.Double) (-1.0d));
        java.util.List<java.lang.Double> doubleList18 = product5.getPriceHistory();
        java.lang.Long long19 = product5.getId();
        product5.setName("Product{id=100, name='Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=100}', description='', price=1.0, quantity=-1}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Product{id=100, name='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', description='', price=1.0, quantity=0}" + "'", str15, "Product{id=100, name='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "Product{id=100, name='hi!', description='', price=10.0, quantity=0}", "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}", (java.lang.Double) 0.0d, (int) (short) 100);
        product5.setQuantity(52);
        int int8 = product5.getQuantity();
        product5.setQuantity(0);
        java.lang.Class<?> wildcardClass11 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        java.lang.String str10 = product5.getDescription();
        java.util.List<java.lang.Double> doubleList11 = product5.getPriceHistory();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(doubleList11);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        int int11 = product5.getQuantity();
        java.util.List<java.lang.Double> doubleList12 = product5.getPriceHistory();
        java.lang.String str13 = product5.toString();
        java.lang.Long long14 = product5.getId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(doubleList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}" + "'", str13, "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=100}", "Product{id=100, name='', description='', price=10.0, quantity=0}", (java.lang.Double) 1.0d, 0);
        java.lang.String str6 = product5.getName();
        product5.setQuantity((-1));
        java.lang.Class<?> wildcardClass9 = product5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=100}" + "'", str6, "Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=100}");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "Product{id=100, name='hi!', description='', price=1.0, quantity=1}", "Product{id=1, name='', description='', price=-1.0, quantity=100}", (java.lang.Double) 10.0d, (int) (short) 100);
        java.lang.Long long6 = product5.getId();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}", "Product{id=100, name='hi!', description='', price=1.0, quantity=10}", (java.lang.Double) 1.0d, (int) 'a');
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.String str8 = product5.getName();
        java.lang.Class<?> wildcardClass9 = product5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=10}" + "'", str8, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) (-1.0d), (int) (byte) 100);
        product5.setPrice((java.lang.Double) 100.0d);
        java.lang.Long long8 = product5.getId();
        product5.setDescription("Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}");
        product5.setName("Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=-1.0, quantity=100}");
        java.lang.Double double13 = product5.getPrice();
        product5.setDescription("Product{id=10, name='Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}', description='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', price=10.0, quantity=100}");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", "hi!", (java.lang.Double) 100.0d, (int) '#');
        int int6 = product5.getQuantity();
        product5.setName("Product{id=100, name='', description='', price=10.0, quantity=0}");
        product5.setId((java.lang.Long) 10L);
        product5.setPrice((java.lang.Double) 100.0d);
        java.lang.Long long13 = product5.getId();
        java.lang.String str14 = product5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='hi!', price=100.0, quantity=35}" + "'", str14, "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='hi!', price=100.0, quantity=35}");
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "hi!", "Product{id=1, name='', description='', price=-1.0, quantity=100}", (java.lang.Double) 0.0d, (int) (byte) 10);
        java.lang.String str6 = product5.getDescription();
        product5.setDescription("Product{id=0, name='hi!', description='hi!', price=1.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=1, name='', description='', price=-1.0, quantity=100}" + "'", str6, "Product{id=1, name='', description='', price=-1.0, quantity=100}");
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        java.lang.String str9 = product5.getName();
        product5.setQuantity((int) (short) -1);
        int int12 = product5.getQuantity();
        java.lang.String str13 = product5.getDescription();
        product5.setDescription("Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
        product5.setName("Product{id=100, name='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', description='', price=10.0, quantity=0}");
        int int18 = product5.getQuantity();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "Product{id=0, name='Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}', description='Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}', price=0.0, quantity=100}", "Product{id=10, name='hi!', description='', price=1.0, quantity=10}", (java.lang.Double) 0.0d, 35);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "hi!", "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}", (java.lang.Double) 0.0d, (int) ' ');
        product5.setQuantity((int) 'a');
        product5.setDescription("Product{id=100, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}");
        product5.setDescription("Product{id=100, name='hi!', description='', price=10.0, quantity=35}");
        java.lang.Class<?> wildcardClass12 = product5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setName("");
        java.lang.Long long11 = product5.getId();
        java.lang.Long long12 = product5.getId();
        java.lang.Long long13 = product5.getId();
        int int14 = product5.getQuantity();
        product5.setQuantity(100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
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
        product5.setId((java.lang.Long) (-1L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertNotNull(doubleList13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.String str11 = product5.getDescription();
        java.lang.Long long12 = product5.getId();
        product5.setDescription("Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}");
        java.lang.Class<?> wildcardClass15 = product5.getClass();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
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
        product5.addPriceToHistory((java.lang.Double) (-1.0d));
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
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        java.lang.String str11 = product5.getDescription();
        java.lang.String str12 = product5.toString();
        product5.setPrice((java.lang.Double) 100.0d);
        java.lang.String str15 = product5.getName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Product{id=100, name='hi!', description='', price=10.0, quantity=0}" + "'", str12, "Product{id=100, name='hi!', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=100, name='', description='', price=10.0, quantity=0}", "", (java.lang.Double) 100.0d, (int) ' ');
        product5.setId((java.lang.Long) 1L);
        product5.setName("Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=10.0, quantity=0}");
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.String str11 = product5.getDescription();
        java.lang.Long long12 = product5.getId();
        product5.setId((java.lang.Long) 0L);
        product5.setName("Product{id=10, name='hi!', description='', price=1.0, quantity=10}");
        java.lang.Double double17 = product5.getPrice();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}", "Product{id=0, name='Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}', description='Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}', price=0.0, quantity=100}", (java.lang.Double) 0.0d, (int) (byte) -1);
        java.lang.String str6 = product5.getDescription();
        int int7 = product5.getQuantity();
        java.lang.String str8 = product5.toString();
        product5.setQuantity((int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=0, name='Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}', description='Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}', price=0.0, quantity=100}" + "'", str6, "Product{id=0, name='Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}', description='Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}', price=0.0, quantity=100}");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Product{id=0, name='Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}', description='Product{id=0, name='Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}', description='Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}', price=0.0, quantity=100}', price=0.0, quantity=-1}" + "'", str8, "Product{id=0, name='Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}', description='Product{id=0, name='Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}', description='Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}', price=0.0, quantity=100}', price=0.0, quantity=-1}");
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) (-1.0d));
        java.lang.String str12 = product5.getDescription();
        product5.setId((java.lang.Long) (-1L));
        product5.setId((java.lang.Long) (-1L));
        product5.addPriceToHistory((java.lang.Double) (-1.0d));
        product5.setDescription("Product{id=-1, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        product5.setName("hi!");
        java.lang.Double double10 = product5.getPrice();
        product5.setId((java.lang.Long) (-1L));
        int int13 = product5.getQuantity();
        product5.setName("Product{id=100, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='', price=10.0, quantity=0}");
        java.util.List<java.lang.Double> doubleList16 = product5.getPriceHistory();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(doubleList16);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}", "Product{id=100, name='hi!', description='', price=1.0, quantity=10}", (java.lang.Double) (-1.0d), (int) (short) 100);
        java.lang.String str6 = product5.getName();
        java.util.List<java.lang.Double> doubleList7 = product5.getPriceHistory();
        product5.setName("hi!");
        java.lang.String str10 = product5.getDescription();
        java.lang.Long long11 = product5.getId();
        product5.setPrice((java.lang.Double) 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}" + "'", str6, "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=10}" + "'", str10, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.util.List<java.lang.Double> doubleList10 = product5.getPriceHistory();
        java.lang.Double double11 = product5.getPrice();
        java.lang.Long long12 = product5.getId();
        java.lang.Class<?> wildcardClass13 = product5.getClass();
        org.junit.Assert.assertNotNull(doubleList10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        product5.setQuantity((int) (short) 10);
        java.lang.String str9 = product5.toString();
        java.lang.Long long10 = product5.getId();
        product5.setDescription("");
        product5.setId((java.lang.Long) 10L);
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        product5.addPriceToHistory((java.lang.Double) (-1.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=10}" + "'", str9, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
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
        java.lang.String str28 = product5.toString();
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}" + "'", str20, "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Product{id=0, name='Product{id=10, name='Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}', description='', price=100.0, quantity=0}', description='', price=-1.0, quantity=10}" + "'", str28, "Product{id=0, name='Product{id=10, name='Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}', description='', price=100.0, quantity=0}', description='', price=-1.0, quantity=10}");
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=0, name='hi!', description='', price=0.0, quantity=0}", "Product{id=0, name='hi!', description='', price=1.0, quantity=32}", (java.lang.Double) 100.0d, (int) '#');
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=100, name='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', description='', price=1.0, quantity=0}", "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}", (java.lang.Double) 1.0d, (int) (byte) 10);
        product5.addPriceToHistory((java.lang.Double) 10.0d);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=1, name='Product{id=100, name='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', description='', price=1.0, quantity=0}', description='Product{id=0, name='hi!', description='', price=0.0, quantity=0}', price=10.0, quantity=-1}", "Product{id=10, name='Product{id=100, name='hi!', description='', price=100.0, quantity=0}', description='', price=10.0, quantity=0}", (java.lang.Double) 0.0d, 35);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=0, name='Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}', description='Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}', price=0.0, quantity=100}", "Product{id=10, name='Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}', description='', price=1.0, quantity=10}", (java.lang.Double) 10.0d, (int) ' ');
        java.lang.Double double6 = product5.getPrice();
        java.lang.Class<?> wildcardClass7 = product5.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "Product{id=0, name='Product{id=100, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=0.0, quantity=0}', description='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', price=10.0, quantity=0}", "Product{id=0, name='Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}', description='Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}', price=0.0, quantity=100}", (java.lang.Double) 1.0d, (int) (byte) 1);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setDescription("Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}");
        java.lang.Long long14 = product5.getId();
        java.lang.String str15 = product5.getDescription();
        java.util.List<java.lang.Double> doubleList16 = product5.getPriceHistory();
        product5.addPriceToHistory((java.lang.Double) (-1.0d));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}" + "'", str15, "Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList16);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
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
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=100, name='hi!', description='', price=1.0, quantity=10}", "Product{id=0, name='hi!', description='', price=1.0, quantity=0}", (java.lang.Double) 0.0d, (int) (short) -1);
        java.lang.Long long6 = product5.getId();
        java.lang.String str7 = product5.getName();
        product5.addPriceToHistory((java.lang.Double) 10.0d);
        product5.setQuantity(97);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=10}" + "'", str7, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=10, name='hi!', description='', price=1.0, quantity=10}", "Product{id=100, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=0.0, quantity=0}", (java.lang.Double) 10.0d, 1);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}", "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}", (java.lang.Double) 10.0d, 100);
        java.lang.String str6 = product5.getName();
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}" + "'", str6, "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}");
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "", "", (java.lang.Double) 0.0d, (int) (byte) 100);
        product5.setQuantity((int) (short) -1);
        product5.setPrice((java.lang.Double) (-1.0d));
        product5.setQuantity((int) '#');
        java.lang.Class<?> wildcardClass12 = product5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=-1, name='hi!', description='', price=0.0, quantity=100}", "Product{id=-1, name='hi!', description='', price=-1.0, quantity=0}", (java.lang.Double) 1.0d, (int) '#');
        product5.setName("Product{id=0, name='Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}', description='Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}', price=1.0, quantity=0}");
        java.lang.Class<?> wildcardClass8 = product5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) (-1.0d));
        java.lang.String str12 = product5.getDescription();
        product5.setId((java.lang.Long) (-1L));
        product5.setId((java.lang.Long) (-1L));
        java.lang.Long long17 = product5.getId();
        int int18 = product5.getQuantity();
        int int19 = product5.getQuantity();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 0.0d);
        product5.setName("Product{id=0, name='hi!', description='Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}', price=0.0, quantity=0}");
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        int int16 = product5.getQuantity();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        product5.setName("hi!");
        java.lang.String str10 = product5.toString();
        java.lang.Long long11 = product5.getId();
        java.lang.String str12 = product5.getDescription();
        java.lang.Double double13 = product5.getPrice();
        java.lang.String str14 = product5.getName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str10, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        java.lang.String str11 = product5.toString();
        java.lang.Class<?> wildcardClass12 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product{id=100, name='hi!', description='', price=10.0, quantity=0}" + "'", str11, "Product{id=100, name='hi!', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
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
        int int25 = product5.getQuantity();
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=100, name='hi!', description='', price=10.0, quantity=0}", "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}", (java.lang.Double) 10.0d, (int) ' ');
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        product5.setPrice((java.lang.Double) 1.0d);
        java.lang.Double double9 = product5.getPrice();
        java.util.List<java.lang.Double> doubleList10 = product5.getPriceHistory();
        product5.setDescription("Product{id=100, name='hi!', description='', price=-1.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(doubleList10);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=0, name='Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}', description='Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}', price=0.0, quantity=100}", "Product{id=0, name='hi!', description='Product{id=100, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='', price=10.0, quantity=0}', price=1.0, quantity=0}", (java.lang.Double) 10.0d, 32);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "Product{id=1, name='Product{id=100, name='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', description='', price=1.0, quantity=0}', description='Product{id=0, name='hi!', description='', price=0.0, quantity=0}', price=10.0, quantity=-1}", "Product{id=0, name='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=0}", (java.lang.Double) (-1.0d), (int) '#');
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
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
        product5.setDescription("Product{id=0, name='hi!', description='Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}', price=0.0, quantity=0}");
        java.util.List<java.lang.Double> doubleList19 = product5.getPriceHistory();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(doubleList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str13, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList16);
        org.junit.Assert.assertNotNull(doubleList19);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}", "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", (java.lang.Double) 100.0d, (int) '4');
        product5.setQuantity((int) (byte) 1);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.lang.String str10 = product5.getName();
        java.util.List<java.lang.Double> doubleList11 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 0L);
        int int14 = product5.getQuantity();
        product5.setId((java.lang.Long) 0L);
        java.lang.String str17 = product5.getDescription();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(doubleList11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.addPriceToHistory((java.lang.Double) 10.0d);
        product5.setId((java.lang.Long) 100L);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=100, name='', description='', price=10.0, quantity=0}", "", (java.lang.Double) 100.0d, (int) ' ');
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        java.lang.Long long8 = product5.getId();
        java.util.List<java.lang.Double> doubleList9 = product5.getPriceHistory();
        java.lang.String str10 = product5.getDescription();
        java.lang.String str11 = product5.getDescription();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(doubleList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=0, name='hi!', description='', price=1.0, quantity=0}", "Product{id=100, name='', description='', price=10.0, quantity=0}", (java.lang.Double) (-1.0d), (int) '#');
        product5.setId((java.lang.Long) 10L);
        java.lang.String str8 = product5.getName();
        int int9 = product5.getQuantity();
        product5.setQuantity(100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str8, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.String str7 = product5.toString();
        java.lang.Long long8 = product5.getId();
        java.lang.String str9 = product5.getDescription();
        product5.addPriceToHistory((java.lang.Double) (-1.0d));
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.String str14 = product5.getDescription();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str7, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        product5.setQuantity(0);
        java.lang.Double double13 = product5.getPrice();
        java.util.List<java.lang.Double> doubleList14 = product5.getPriceHistory();
        product5.setName("Product{id=100, name='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', description='', price=10.0, quantity=0}");
        product5.setPrice((java.lang.Double) 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(doubleList14);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        product5.setName("hi!");
        int int10 = product5.getQuantity();
        product5.setName("Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}");
        product5.setId((java.lang.Long) 100L);
        java.lang.String str15 = product5.toString();
        product5.setPrice((java.lang.Double) (-1.0d));
        java.util.List<java.lang.Double> doubleList18 = product5.getPriceHistory();
        product5.setName("Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Product{id=100, name='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', description='', price=1.0, quantity=0}" + "'", str15, "Product{id=100, name='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList18);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
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
        java.lang.Long long19 = product5.getId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertNotNull(doubleList13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=10.0, quantity=0}", "Product{id=0, name='hi!', description='', price=0.0, quantity=0}", (java.lang.Double) 0.0d, (int) (byte) -1);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        int int8 = product5.getQuantity();
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        product5.setId((java.lang.Long) 10L);
        java.lang.String str13 = product5.getName();
        java.lang.String str14 = product5.getDescription();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
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
        product5.setName("Product{id=1, name='Product{id=-1, name='hi!', description='', price=0.0, quantity=100}', description='hi!', price=100.0, quantity=35}");
        product5.setDescription("");
        java.lang.Long long24 = product5.getId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}" + "'", str13, "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 100L + "'", long24 == 100L);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        int int8 = product5.getQuantity();
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        product5.setId((java.lang.Long) 10L);
        int int13 = product5.getQuantity();
        java.lang.String str14 = product5.toString();
        product5.addPriceToHistory((java.lang.Double) 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Product{id=10, name='hi!', description='', price=1.0, quantity=0}" + "'", str14, "Product{id=10, name='hi!', description='', price=1.0, quantity=0}");
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        int int8 = product5.getQuantity();
        product5.setDescription("hi!");
        product5.setDescription("Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        product5.setName("Product{id=0, name='Product{id=10, name='hi!', description='', price=10.0, quantity=0}', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=0.0, quantity=-1}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=10, name='hi!', description='', price=1.0, quantity=10}", "Product{id=100, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=0.0, quantity=0}", (java.lang.Double) 0.0d, 35);
        product5.setDescription("");
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
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
        product5.addPriceToHistory((java.lang.Double) 1.0d);
        org.junit.Assert.assertNotNull(doubleList10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(doubleList14);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
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
        java.lang.String str29 = product5.getName();
        java.lang.Class<?> wildcardClass30 = product5.getClass();
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}" + "'", str20, "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str29, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=-1, name='hi!', description='', price=0.0, quantity=100}", "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}", (java.lang.Double) 0.0d, 52);
        java.lang.String str6 = product5.toString();
        java.lang.Class<?> wildcardClass7 = product5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=1, name='Product{id=-1, name='hi!', description='', price=0.0, quantity=100}', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=0.0, quantity=52}" + "'", str6, "Product{id=1, name='Product{id=-1, name='hi!', description='', price=0.0, quantity=100}', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=0.0, quantity=52}");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "", "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}", (java.lang.Double) 10.0d, (int) (short) 1);
        java.lang.String str6 = product5.getDescription();
        product5.setQuantity((int) (byte) 100);
        product5.setDescription("Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}");
        product5.addPriceToHistory((java.lang.Double) (-1.0d));
        java.lang.Long long13 = product5.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}" + "'", str6, "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        java.lang.String str9 = product5.getDescription();
        product5.setId((java.lang.Long) 10L);
        java.lang.String str12 = product5.toString();
        java.lang.Long long13 = product5.getId();
        java.lang.String str14 = product5.getName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Product{id=10, name='hi!', description='', price=1.0, quantity=0}" + "'", str12, "Product{id=10, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
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
        product5.setDescription("Product{id=0, name='hi!', description='', price=-1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str14, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str16, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Product{id=100, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='', price=10.0, quantity=0}" + "'", str19, "Product{id=100, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='', price=10.0, quantity=0}");
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        int int8 = product5.getQuantity();
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        product5.setId((java.lang.Long) 10L);
        int int13 = product5.getQuantity();
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 0L);
        java.lang.String str9 = product5.getDescription();
        int int10 = product5.getQuantity();
        java.lang.Double double11 = product5.getPrice();
        java.lang.Class<?> wildcardClass12 = product5.getClass();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.String str7 = product5.toString();
        product5.setId((java.lang.Long) 100L);
        java.lang.String str10 = product5.getName();
        java.lang.Class<?> wildcardClass11 = product5.getClass();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str7, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", "hi!", (java.lang.Double) 100.0d, (int) '#');
        int int6 = product5.getQuantity();
        product5.setName("Product{id=100, name='', description='', price=10.0, quantity=0}");
        product5.setId((java.lang.Long) 1L);
        product5.setPrice((java.lang.Double) 0.0d);
        product5.setDescription("Product{id=0, name='Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}', description='Product{id=0, name='Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}', description='Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}', price=0.0, quantity=100}', price=0.0, quantity=-1}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.Double double8 = product5.getPrice();
        java.lang.String str9 = product5.toString();
        java.lang.Double double10 = product5.getPrice();
        java.lang.String str11 = product5.getName();
        int int12 = product5.getQuantity();
        product5.setId((java.lang.Long) 1L);
        java.lang.Long long15 = product5.getId();
        java.lang.Double double16 = product5.getPrice();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str9, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "", "", (java.lang.Double) (-1.0d), (int) (byte) 100);
        java.lang.String str6 = product5.toString();
        java.lang.String str7 = product5.getDescription();
        product5.setId((java.lang.Long) 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=1, name='', description='', price=-1.0, quantity=100}" + "'", str6, "Product{id=1, name='', description='', price=-1.0, quantity=100}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 0.0d);
        product5.setName("Product{id=100, name='', description='', price=10.0, quantity=0}");
        java.util.List<java.lang.Double> doubleList14 = product5.getPriceHistory();
        product5.addPriceToHistory((java.lang.Double) 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(doubleList14);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}", "Product{id=100, name='hi!', description='', price=1.0, quantity=10}", (java.lang.Double) (-1.0d), (int) (short) 100);
        java.lang.String str6 = product5.getName();
        java.util.List<java.lang.Double> doubleList7 = product5.getPriceHistory();
        product5.setName("hi!");
        java.lang.String str10 = product5.getDescription();
        java.lang.String str11 = product5.toString();
        product5.setPrice((java.lang.Double) 0.0d);
        int int14 = product5.getQuantity();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}" + "'", str6, "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=10}" + "'", str10, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=100}" + "'", str11, "Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=100}");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        java.lang.String str11 = product5.getDescription();
        java.lang.String str12 = product5.toString();
        product5.setQuantity(100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Product{id=100, name='hi!', description='', price=10.0, quantity=0}" + "'", str12, "Product{id=100, name='hi!', description='', price=10.0, quantity=0}");
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.String str8 = product5.getDescription();
        java.util.List<java.lang.Double> doubleList9 = product5.getPriceHistory();
        product5.setPrice((java.lang.Double) 0.0d);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setId((java.lang.Long) 1L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(doubleList9);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
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
        java.lang.Long long18 = product5.getId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Product{id=100, name='hi!', description='', price=-1.0, quantity=0}" + "'", str15, "Product{id=100, name='hi!', description='', price=-1.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList16);
        org.junit.Assert.assertNotNull(doubleList17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        java.lang.String str9 = product5.getDescription();
        product5.setName("Product{id=1, name='', description='', price=-1.0, quantity=100}");
        java.lang.String str12 = product5.getDescription();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}", (java.lang.Double) 100.0d, 10);
        java.lang.String str6 = product5.getDescription();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}" + "'", str6, "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}");
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.lang.String str10 = product5.getName();
        java.lang.String str11 = product5.getName();
        java.lang.Double double12 = product5.getPrice();
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        int int15 = product5.getQuantity();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setName("hi!");
        java.lang.String str8 = product5.getDescription();
        java.util.List<java.lang.Double> doubleList9 = product5.getPriceHistory();
        java.util.List<java.lang.Double> doubleList10 = product5.getPriceHistory();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(doubleList9);
        org.junit.Assert.assertNotNull(doubleList10);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        int int8 = product5.getQuantity();
        product5.setDescription("hi!");
        java.util.List<java.lang.Double> doubleList11 = product5.getPriceHistory();
        java.lang.String str12 = product5.getDescription();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", "Product{id=0, name='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=0}", (java.lang.Double) 10.0d, (-1));
        java.lang.String str6 = product5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=100, name='Product{id=100, name='hi!', description='', price=1.0, quantity=0}', description='Product{id=0, name='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=0}', price=10.0, quantity=-1}" + "'", str6, "Product{id=100, name='Product{id=100, name='hi!', description='', price=1.0, quantity=0}', description='Product{id=0, name='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=0}', price=10.0, quantity=-1}");
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        int int11 = product5.getQuantity();
        product5.setPrice((java.lang.Double) (-1.0d));
        product5.setId((java.lang.Long) 1L);
        product5.setDescription("Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        int int18 = product5.getQuantity();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setQuantity((int) (short) 1);
        java.lang.Double double10 = product5.getPrice();
        java.lang.String str11 = product5.getName();
        java.lang.Long long12 = product5.getId();
        java.lang.Double double13 = product5.getPrice();
        product5.setQuantity((int) (short) 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        java.lang.String str10 = product5.getDescription();
        product5.setId((java.lang.Long) 1L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", "hi!", (java.lang.Double) 100.0d, (int) '#');
        int int6 = product5.getQuantity();
        product5.setName("Product{id=100, name='', description='', price=10.0, quantity=0}");
        product5.setId((java.lang.Long) 100L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
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
        java.lang.String str23 = product5.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
        org.junit.Assert.assertNotNull(doubleList20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=10.0, quantity=0}', price=1.0, quantity=35}" + "'", str23, "Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=10.0, quantity=0}', price=1.0, quantity=35}");
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
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
        java.lang.Double double21 = product5.getPrice();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.util.List<java.lang.Double> doubleList7 = product5.getPriceHistory();
        product5.setQuantity((int) (short) 100);
        java.lang.Double double10 = product5.getPrice();
        java.lang.Class<?> wildcardClass11 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(doubleList7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.Double double8 = product5.getPrice();
        java.lang.String str9 = product5.toString();
        java.lang.Double double10 = product5.getPrice();
        java.lang.String str11 = product5.getName();
        int int12 = product5.getQuantity();
        java.lang.Double double13 = product5.getPrice();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str9, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=10, name='hi!', description='', price=1.0, quantity=10}", "Product{id=100, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=0}', price=10.0, quantity=-1}", (java.lang.Double) 1.0d, 0);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        java.lang.String str11 = product5.getDescription();
        java.lang.String str12 = product5.toString();
        product5.setPrice((java.lang.Double) 100.0d);
        java.lang.String str15 = product5.getDescription();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Product{id=100, name='hi!', description='', price=10.0, quantity=0}" + "'", str12, "Product{id=100, name='hi!', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", "hi!", (java.lang.Double) 100.0d, (int) '#');
        int int6 = product5.getQuantity();
        product5.setName("Product{id=100, name='', description='', price=10.0, quantity=0}");
        java.lang.String str9 = product5.getName();
        product5.setName("Product{id=-1, name='hi!', description='', price=0.0, quantity=100}");
        java.lang.String str12 = product5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str9, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Product{id=1, name='Product{id=-1, name='hi!', description='', price=0.0, quantity=100}', description='hi!', price=100.0, quantity=35}" + "'", str12, "Product{id=1, name='Product{id=-1, name='hi!', description='', price=0.0, quantity=100}', description='hi!', price=100.0, quantity=35}");
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
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
        java.lang.Class<?> wildcardClass19 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertNotNull(doubleList13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}", "Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}", (java.lang.Double) 0.0d, 100);
        product5.addPriceToHistory((java.lang.Double) 1.0d);
        java.lang.Double double8 = product5.getPrice();
        java.lang.String str9 = product5.getDescription();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}" + "'", str9, "Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}");
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) (-1.0d), (int) (byte) 100);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        product5.setPrice((java.lang.Double) 10.0d);
        java.lang.Double double9 = product5.getPrice();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        int int8 = product5.getQuantity();
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        product5.setId((java.lang.Long) 10L);
        product5.setQuantity(0);
        java.lang.Long long15 = product5.getId();
        java.lang.Double double16 = product5.getPrice();
        java.lang.String str17 = product5.getDescription();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}", "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}", (java.lang.Double) (-1.0d), (int) 'a');
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.lang.String str10 = product5.getName();
        java.lang.String str11 = product5.toString();
        product5.addPriceToHistory((java.lang.Double) 1.0d);
        product5.setName("Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}");
        product5.setPrice((java.lang.Double) 1.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str11, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.String str8 = product5.getDescription();
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        product5.addPriceToHistory((java.lang.Double) 1.0d);
        java.lang.String str13 = product5.getDescription();
        product5.addPriceToHistory((java.lang.Double) 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.Double double8 = product5.getPrice();
        java.lang.String str9 = product5.toString();
        java.lang.Double double10 = product5.getPrice();
        java.lang.String str11 = product5.getName();
        java.lang.Long long12 = product5.getId();
        java.util.List<java.lang.Double> doubleList13 = product5.getPriceHistory();
        product5.setName("Product{id=100, name='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str9, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(doubleList13);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=0, name='hi!', description='', price=1.0, quantity=0}", "Product{id=100, name='', description='', price=10.0, quantity=0}", (java.lang.Double) (-1.0d), (int) '#');
        product5.setId((java.lang.Long) 10L);
        java.lang.String str8 = product5.getName();
        product5.setPrice((java.lang.Double) 10.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str8, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=0, name='hi!', description='', price=1.0, quantity=0}", "Product{id=100, name='', description='', price=10.0, quantity=0}", (java.lang.Double) (-1.0d), (int) '#');
        product5.setId((java.lang.Long) 10L);
        java.lang.Long long8 = product5.getId();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=100, name='hi!', description='', price=1.0, quantity=10}", "Product{id=0, name='hi!', description='', price=1.0, quantity=0}", (java.lang.Double) 0.0d, (int) (short) -1);
        java.lang.String str6 = product5.getName();
        java.lang.String str7 = product5.toString();
        product5.setDescription("Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        product5.setQuantity(100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=10}" + "'", str6, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}" + "'", str7, "Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}");
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "", "Product{id=0, name='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=0}", (java.lang.Double) 100.0d, 0);
        java.lang.String str6 = product5.getDescription();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=0, name='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=0}" + "'", str6, "Product{id=0, name='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=0}");
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
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
        product5.setDescription("Product{id=100, name='hi!', description='', price=-1.0, quantity=0}");
        java.lang.Long long20 = product5.getId();
        int int21 = product5.getQuantity();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 100L + "'", long20 == 100L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setQuantity((int) '4');
        java.lang.Class<?> wildcardClass13 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=-1, name='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', description='Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}', price=10.0, quantity=32}", "Product{id=100, name='', description='', price=0.0, quantity=0}", (java.lang.Double) 1.0d, 1);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        product5.setName("hi!");
        int int10 = product5.getQuantity();
        product5.setQuantity((int) (short) 100);
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "hi!", "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}", (java.lang.Double) 0.0d, (int) ' ');
        product5.setDescription("Product{id=100, name='Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=100}', description='', price=1.0, quantity=-1}");
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}", "Product{id=100, name='hi!', description='', price=1.0, quantity=35}", (java.lang.Double) 10.0d, (int) '#');
        int int6 = product5.getQuantity();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "", "", (java.lang.Double) 0.0d, (int) (byte) 100);
        product5.setName("Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}");
        java.lang.String str8 = product5.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Product{id=10, name='Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}', description='', price=0.0, quantity=100}" + "'", str8, "Product{id=10, name='Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}', description='', price=0.0, quantity=100}");
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.String str7 = product5.toString();
        product5.setId((java.lang.Long) 100L);
        java.lang.Long long10 = product5.getId();
        java.lang.Double double11 = product5.getPrice();
        product5.setPrice((java.lang.Double) 0.0d);
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str7, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        int int10 = product5.getQuantity();
        java.util.List<java.lang.Double> doubleList11 = product5.getPriceHistory();
        java.lang.String str12 = product5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(doubleList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str12, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "", "Product{id=0, name='hi!', description='', price=0.0, quantity=0}", (java.lang.Double) 10.0d, (int) (byte) 100);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}", "Product{id=-1, name='hi!', description='', price=0.0, quantity=100}", (java.lang.Double) 0.0d, (int) 'a');
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        product5.setDescription("Product{id=0, name='Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}', description='Product{id=0, name='Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}', description='Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}', price=0.0, quantity=100}', price=0.0, quantity=-1}");
        org.junit.Assert.assertNotNull(doubleList6);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
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
        product5.setDescription("Product{id=100, name='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str14, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "Product{id=10, name='Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}', description='', price=0.0, quantity=100}", "", (java.lang.Double) 0.0d, (int) (byte) 1);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
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
        java.util.List<java.lang.Double> doubleList21 = product5.getPriceHistory();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertNotNull(doubleList21);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
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
        product5.setPrice((java.lang.Double) (-1.0d));
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str14, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        product5.setName("hi!");
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setId((java.lang.Long) 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setQuantity((int) (short) 1);
        java.lang.Double double10 = product5.getPrice();
        java.lang.String str11 = product5.getName();
        product5.setDescription("Product{id=1, name='Product{id=-1, name='hi!', description='', price=0.0, quantity=100}', description='hi!', price=100.0, quantity=35}");
        product5.addPriceToHistory((java.lang.Double) 10.0d);
        java.util.List<java.lang.Double> doubleList16 = product5.getPriceHistory();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(doubleList16);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.Long long7 = product5.getId();
        int int8 = product5.getQuantity();
        product5.setName("Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}");
        java.lang.String str11 = product5.getDescription();
        java.util.List<java.lang.Double> doubleList12 = product5.getPriceHistory();
        java.lang.Long long13 = product5.getId();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(doubleList12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        java.lang.Long long11 = product5.getId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}", "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}", (java.lang.Double) (-1.0d), (int) (short) 0);
        product5.setId((java.lang.Long) 0L);
        int int8 = product5.getQuantity();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.util.List<java.lang.Double> doubleList10 = product5.getPriceHistory();
        java.lang.String str11 = product5.getName();
        java.lang.String str12 = product5.toString();
        java.lang.String str13 = product5.toString();
        product5.setDescription("Product{id=-1, name='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=-1.0, quantity=35}");
        org.junit.Assert.assertNotNull(doubleList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str12, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str13, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=-1, name='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', description='Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}', price=10.0, quantity=32}", "Product{id=0, name='hi!', description='', price=1.0, quantity=1}", (java.lang.Double) 10.0d, (int) '#');
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.String str7 = product5.toString();
        java.lang.Long long8 = product5.getId();
        java.lang.String str9 = product5.getDescription();
        java.lang.String str10 = product5.getDescription();
        product5.setQuantity(35);
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        product5.setDescription("Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        product5.setDescription("Product{id=100, name='', description='', price=0.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str7, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.String str8 = product5.getDescription();
        java.util.List<java.lang.Double> doubleList9 = product5.getPriceHistory();
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.String str12 = product5.getName();
        product5.setDescription("");
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.Long long17 = product5.getId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(doubleList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setId((java.lang.Long) 10L);
        java.lang.Long long14 = product5.getId();
        java.lang.Double double15 = product5.getPrice();
        product5.setName("Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}");
        java.lang.String str18 = product5.getName();
        java.lang.Long long19 = product5.getId();
        java.lang.Long long20 = product5.getId();
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}" + "'", str18, "Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.String str11 = product5.getDescription();
        java.lang.Long long12 = product5.getId();
        product5.setId((java.lang.Long) 0L);
        product5.setName("Product{id=10, name='hi!', description='', price=1.0, quantity=10}");
        java.lang.Long long17 = product5.getId();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        int int8 = product5.getQuantity();
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        product5.setId((java.lang.Long) 10L);
        product5.setQuantity(0);
        java.lang.Long long15 = product5.getId();
        product5.setPrice((java.lang.Double) 10.0d);
        java.lang.String str18 = product5.getDescription();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.lang.Double double10 = product5.getPrice();
        product5.setId((java.lang.Long) 10L);
        product5.setName("Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}");
        product5.setName("Product{id=100, name='hi!', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setId((java.lang.Long) 1L);
        product5.setDescription("Product{id=100, name='Product{id=100, name='hi!', description='', price=1.0, quantity=0}', description='Product{id=0, name='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=0}', price=10.0, quantity=-1}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.String str8 = product5.getDescription();
        product5.setId((java.lang.Long) (-1L));
        product5.setQuantity((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=0, name='Product{id=0, name='hi!', description='', price=0.0, quantity=0}', description='Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}', price=0.0, quantity=35}", "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=-1.0, quantity=100}", (java.lang.Double) 10.0d, 10);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.Double double8 = product5.getPrice();
        product5.setQuantity((int) (byte) 0);
        java.lang.String str11 = product5.toString();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str11, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 0L);
        java.lang.String str9 = product5.getDescription();
        java.lang.Double double10 = product5.getPrice();
        product5.setPrice((java.lang.Double) 1.0d);
        int int13 = product5.getQuantity();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", "hi!", (java.lang.Double) 100.0d, (int) '#');
        int int6 = product5.getQuantity();
        product5.setName("Product{id=100, name='', description='', price=10.0, quantity=0}");
        java.lang.String str9 = product5.getName();
        product5.setName("Product{id=-1, name='hi!', description='', price=0.0, quantity=100}");
        product5.setName("Product{id=-1, name='hi!', description='', price=0.0, quantity=100}");
        java.util.List<java.lang.Double> doubleList14 = product5.getPriceHistory();
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        java.lang.Double double17 = product5.getPrice();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str9, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList14);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        java.lang.String str9 = product5.getName();
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        java.lang.Double double12 = product5.getPrice();
        java.lang.Long long13 = product5.getId();
        int int14 = product5.getQuantity();
        int int15 = product5.getQuantity();
        java.lang.Double double16 = product5.getPrice();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        product5.setName("hi!");
        product5.setPrice((java.lang.Double) 100.0d);
        java.util.List<java.lang.Double> doubleList12 = product5.getPriceHistory();
        product5.setDescription("Product{id=100, name='hi!', description='', price=10.0, quantity=0}");
        java.lang.Double double15 = product5.getPrice();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(doubleList12);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setName("");
        product5.addPriceToHistory((java.lang.Double) (-1.0d));
        java.lang.String str13 = product5.getName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setQuantity((int) (short) 1);
        java.lang.Double double10 = product5.getPrice();
        java.lang.String str11 = product5.getName();
        product5.setId((java.lang.Long) 0L);
        product5.setId((java.lang.Long) 100L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setQuantity((int) '#');
        product5.setDescription("");
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        java.lang.Long long17 = product5.getId();
        java.lang.String str18 = product5.getName();
        product5.setQuantity((int) (byte) 100);
        product5.setDescription("Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}");
        product5.setQuantity(0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
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
        java.lang.Double double17 = product5.getPrice();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str14, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}", "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}", (java.lang.Double) (-1.0d), (int) (short) 0);
        product5.setDescription("Product{id=0, name='hi!', description='', price=0.0, quantity=0}");
        product5.addPriceToHistory((java.lang.Double) 1.0d);
        product5.setDescription("Product{id=1, name='Product{id=-1, name='hi!', description='', price=0.0, quantity=100}', description='hi!', price=100.0, quantity=35}");
        product5.setName("Product{id=100, name='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', description='', price=10.0, quantity=0}");
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
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
        product5.setId((java.lang.Long) (-1L));
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}" + "'", str13, "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.lang.String str6 = product5.getName();
        product5.setName("Product{id=100, name='', description='', price=10.0, quantity=0}");
        java.lang.String str9 = product5.getDescription();
        java.util.List<java.lang.Double> doubleList10 = product5.getPriceHistory();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(doubleList10);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.String str8 = product5.getDescription();
        product5.addPriceToHistory((java.lang.Double) 1.0d);
        product5.setQuantity((int) '4');
        product5.setPrice((java.lang.Double) (-1.0d));
        java.lang.String str15 = product5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Product{id=100, name='hi!', description='', price=-1.0, quantity=52}" + "'", str15, "Product{id=100, name='hi!', description='', price=-1.0, quantity=52}");
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
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
        java.util.List<java.lang.Double> doubleList19 = product5.getPriceHistory();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Product{id=0, name='hi!', description='Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}', price=0.0, quantity=0}" + "'", str15, "Product{id=0, name='hi!', description='Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}', price=0.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList16);
        org.junit.Assert.assertNotNull(doubleList19);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.util.List<java.lang.Double> doubleList10 = product5.getPriceHistory();
        java.lang.String str11 = product5.getDescription();
        product5.setName("Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        java.lang.Long long14 = product5.getId();
        product5.setId((java.lang.Long) 1L);
        org.junit.Assert.assertNotNull(doubleList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}", "Product{id=100, name='hi!', description='', price=1.0, quantity=10}", (java.lang.Double) (-1.0d), (int) (short) 100);
        java.lang.String str6 = product5.getName();
        java.util.List<java.lang.Double> doubleList7 = product5.getPriceHistory();
        product5.setName("hi!");
        java.lang.String str10 = product5.toString();
        java.lang.Long long11 = product5.getId();
        product5.setPrice((java.lang.Double) 100.0d);
        java.lang.Class<?> wildcardClass14 = product5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}" + "'", str6, "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=100}" + "'", str10, "Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=100}");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=100, name='hi!', description='', price=100.0, quantity=0}", "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}", (java.lang.Double) 0.0d, 52);
        product5.addPriceToHistory((java.lang.Double) 1.0d);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        int int8 = product5.getQuantity();
        product5.setDescription("hi!");
        java.util.List<java.lang.Double> doubleList11 = product5.getPriceHistory();
        java.lang.String str12 = product5.getName();
        product5.setDescription("");
        product5.setDescription("Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=100}");
        product5.setPrice((java.lang.Double) 100.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.util.List<java.lang.Double> doubleList10 = product5.getPriceHistory();
        java.lang.String str11 = product5.getName();
        java.lang.String str12 = product5.toString();
        java.lang.String str13 = product5.getDescription();
        org.junit.Assert.assertNotNull(doubleList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str12, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setQuantity((int) '#');
        product5.setId((java.lang.Long) 100L);
        java.lang.Double double15 = product5.getPrice();
        product5.setName("hi!");
        java.lang.Double double18 = product5.getPrice();
        product5.setQuantity(52);
        java.lang.String str21 = product5.getName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setQuantity((int) (byte) 0);
        java.lang.String str11 = product5.getDescription();
        java.lang.Double double12 = product5.getPrice();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
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
        int int20 = product5.getQuantity();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertNotNull(doubleList13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        product5.setQuantity((int) (short) 10);
        java.lang.String str9 = product5.toString();
        product5.setDescription("hi!");
        product5.setId((java.lang.Long) 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=10}" + "'", str9, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setQuantity((int) (byte) 0);
        java.lang.String str11 = product5.toString();
        product5.setQuantity(100);
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        java.lang.String str16 = product5.getName();
        product5.setQuantity((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str11, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.lang.String str6 = product5.getName();
        product5.addPriceToHistory((java.lang.Double) (-1.0d));
        java.lang.String str9 = product5.getName();
        java.lang.String str10 = product5.getDescription();
        product5.setName("Product{id=1, name='Product{id=-1, name='hi!', description='', price=0.0, quantity=100}', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=0.0, quantity=52}");
        java.lang.Long long13 = product5.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "Product{id=-1, name='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=-1.0, quantity=35}", "Product{id=10, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=10.0, quantity=35}", (java.lang.Double) 10.0d, (int) (short) 100);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        java.lang.String str10 = product5.getDescription();
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        product5.setName("hi!");
        java.lang.Double double15 = product5.getPrice();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        product5.setQuantity((int) (short) 10);
        java.lang.String str9 = product5.toString();
        product5.setDescription("hi!");
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.Double double14 = product5.getPrice();
        int int15 = product5.getQuantity();
        product5.setId((java.lang.Long) 10L);
        product5.addPriceToHistory((java.lang.Double) 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=10}" + "'", str9, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }
}

