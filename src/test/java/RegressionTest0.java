import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

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
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.Class<?> wildcardClass7 = doubleList6.getClass();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.lang.Class<?> wildcardClass6 = product5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getName();
        product5.setName("");
        java.lang.Class<?> wildcardClass11 = product5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.String str8 = product5.getDescription();
        java.util.List<java.lang.Double> doubleList9 = product5.getPriceHistory();
        java.lang.Class<?> wildcardClass10 = doubleList9.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(doubleList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 0.0d);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "hi!", "", (java.lang.Double) 0.0d, (int) (byte) 100);
        java.lang.Class<?> wildcardClass6 = product5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        product5.setDescription("hi!");
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        java.lang.Class<?> wildcardClass9 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        product5.setName("");
        java.lang.Class<?> wildcardClass10 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.String str7 = product5.toString();
        java.lang.Long long8 = product5.getId();
        java.lang.Class<?> wildcardClass9 = product5.getClass();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str7, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        product5.setName("hi!");
        int int10 = product5.getQuantity();
        java.lang.String str11 = product5.getName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setName("");
        java.lang.String str14 = product5.toString();
        java.lang.Class<?> wildcardClass15 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str14, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getName();
        product5.setQuantity((int) (byte) -1);
        product5.addPriceToHistory((java.lang.Double) 1.0d);
        java.lang.Class<?> wildcardClass13 = product5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) (-1.0d));
        java.lang.String str12 = product5.getDescription();
        java.lang.Class<?> wildcardClass13 = product5.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setId((java.lang.Long) 10L);
        java.lang.Long long14 = product5.getId();
        java.lang.String str15 = product5.getDescription();
        java.lang.Class<?> wildcardClass16 = product5.getClass();
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setQuantity((int) (short) 1);
        java.lang.Double double10 = product5.getPrice();
        java.lang.String str11 = product5.getName();
        java.lang.Class<?> wildcardClass12 = product5.getClass();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setQuantity((int) '#');
        java.lang.Class<?> wildcardClass13 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        product5.setQuantity((int) (short) 10);
        java.lang.String str9 = product5.toString();
        product5.setDescription("hi!");
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.Class<?> wildcardClass14 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=10}" + "'", str9, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        product5.setQuantity((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) (-1.0d), (int) (byte) 100);
        product5.setPrice((java.lang.Double) 100.0d);
        java.lang.Long long8 = product5.getId();
        java.lang.Class<?> wildcardClass9 = product5.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) (-1.0d));
        java.lang.String str12 = product5.getDescription();
        java.lang.String str13 = product5.toString();
        java.lang.Double double14 = product5.getPrice();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}" + "'", str13, "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setName("");
        java.lang.Class<?> wildcardClass11 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        int int8 = product5.getQuantity();
        product5.setDescription("hi!");
        java.util.List<java.lang.Double> doubleList11 = product5.getPriceHistory();
        java.lang.String str12 = product5.getName();
        java.lang.String str13 = product5.toString();
        java.lang.Long long14 = product5.getId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}" + "'", str13, "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setQuantity((int) (short) 1);
        java.util.List<java.lang.Double> doubleList10 = product5.getPriceHistory();
        java.lang.Class<?> wildcardClass11 = product5.getClass();
        org.junit.Assert.assertNotNull(doubleList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        product5.setQuantity((int) (short) 10);
        java.lang.String str9 = product5.toString();
        product5.setDescription("hi!");
        product5.setDescription("");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=10}" + "'", str9, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 0.0d);
        java.util.List<java.lang.Double> doubleList11 = product5.getPriceHistory();
        product5.setName("Product{id=0, name='hi!', description='', price=-1.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertNotNull(doubleList11);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "hi!", "", (java.lang.Double) 0.0d, (int) (byte) 100);
        product5.addPriceToHistory((java.lang.Double) 10.0d);
        product5.setId((java.lang.Long) 100L);
        java.util.List<java.lang.Double> doubleList10 = product5.getPriceHistory();
        org.junit.Assert.assertNotNull(doubleList10);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "", "Product{id=100, name='', description='', price=10.0, quantity=0}", (java.lang.Double) 100.0d, (int) (byte) 0);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setQuantity((int) (short) 1);
        java.lang.Double double10 = product5.getPrice();
        java.lang.String str11 = product5.getName();
        product5.setId((java.lang.Long) 0L);
        product5.setDescription("");
        java.lang.Class<?> wildcardClass16 = product5.getClass();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setName("");
        java.lang.String str14 = product5.toString();
        java.lang.Double double15 = product5.getPrice();
        java.lang.Class<?> wildcardClass16 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str14, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.util.List<java.lang.Double> doubleList10 = product5.getPriceHistory();
        java.lang.String str11 = product5.getDescription();
        java.lang.String str12 = product5.getName();
        org.junit.Assert.assertNotNull(doubleList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.String str7 = product5.toString();
        product5.setDescription("Product{id=0, name='hi!', description='', price=-1.0, quantity=0}");
        java.lang.String str10 = product5.toString();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str7, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}" + "'", str10, "Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}");
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.String str7 = product5.toString();
        product5.setDescription("Product{id=0, name='hi!', description='', price=-1.0, quantity=0}");
        java.lang.String str10 = product5.getName();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str7, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.util.List<java.lang.Double> doubleList10 = product5.getPriceHistory();
        java.lang.String str11 = product5.getDescription();
        product5.setName("Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        java.lang.Class<?> wildcardClass14 = product5.getClass();
        org.junit.Assert.assertNotNull(doubleList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
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
        java.lang.Class<?> wildcardClass18 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "hi!", "", (java.lang.Double) 0.0d, (int) (byte) 100);
        product5.addPriceToHistory((java.lang.Double) 10.0d);
        java.lang.Class<?> wildcardClass8 = product5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.lang.String str10 = product5.getName();
        java.util.List<java.lang.Double> doubleList11 = product5.getPriceHistory();
        java.lang.String str12 = product5.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(doubleList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "Product{id=100, name='', description='', price=10.0, quantity=0}", "Product{id=100, name='hi!', description='', price=10.0, quantity=0}", (java.lang.Double) 100.0d, (int) (short) 100);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.String str7 = product5.toString();
        java.lang.Long long8 = product5.getId();
        java.lang.String str9 = product5.getDescription();
        java.lang.String str10 = product5.getDescription();
        product5.setName("Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str7, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setQuantity((int) '4');
        product5.setId((java.lang.Long) 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.lang.Double double10 = product5.getPrice();
        product5.setId((java.lang.Long) 10L);
        int int13 = product5.getQuantity();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 0.0d);
        java.util.List<java.lang.Double> doubleList11 = product5.getPriceHistory();
        java.lang.String str12 = product5.toString();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertNotNull(doubleList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Product{id=0, name='hi!', description='', price=0.0, quantity=0}" + "'", str12, "Product{id=0, name='hi!', description='', price=0.0, quantity=0}");
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "", "", (java.lang.Double) 0.0d, (int) (byte) 100);
        java.lang.Class<?> wildcardClass6 = product5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}", "Product{id=100, name='hi!', description='', price=1.0, quantity=10}", (java.lang.Double) (-1.0d), (int) (short) 100);
        java.lang.String str6 = product5.getDescription();
        product5.setQuantity(0);
        java.lang.Class<?> wildcardClass9 = product5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=10}" + "'", str6, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getName();
        product5.setDescription("hi!");
        product5.setId((java.lang.Long) 10L);
        java.lang.String str13 = product5.getDescription();
        java.lang.String str14 = product5.getName();
        product5.setName("Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", "hi!", (java.lang.Double) 100.0d, (int) '#');
        int int6 = product5.getQuantity();
        product5.setName("Product{id=100, name='', description='', price=10.0, quantity=0}");
        java.lang.Double double9 = product5.getPrice();
        product5.setPrice((java.lang.Double) 10.0d);
        java.lang.String str12 = product5.getName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str12, "Product{id=100, name='', description='', price=10.0, quantity=0}");
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        product5.setName("hi!");
        product5.setId((java.lang.Long) 10L);
        product5.setId((java.lang.Long) (-1L));
        product5.addPriceToHistory((java.lang.Double) (-1.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        java.lang.String str9 = product5.getDescription();
        product5.setDescription("Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}", "Product{id=1, name='', description='', price=-1.0, quantity=100}", (java.lang.Double) 10.0d, (int) (short) -1);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 0.0d);
        java.util.List<java.lang.Double> doubleList11 = product5.getPriceHistory();
        java.lang.Class<?> wildcardClass12 = doubleList11.getClass();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertNotNull(doubleList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=100}", "Product{id=1, name='', description='', price=-1.0, quantity=100}", (java.lang.Double) 100.0d, 100);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.String str8 = product5.getDescription();
        product5.addPriceToHistory((java.lang.Double) 1.0d);
        java.util.List<java.lang.Double> doubleList11 = product5.getPriceHistory();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(doubleList11);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.String str12 = product5.getDescription();
        product5.addPriceToHistory((java.lang.Double) (-1.0d));
        java.lang.Class<?> wildcardClass15 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.String str8 = product5.getDescription();
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        product5.addPriceToHistory((java.lang.Double) 1.0d);
        java.lang.Class<?> wildcardClass13 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getDescription();
        java.lang.String str9 = product5.toString();
        java.lang.Long long10 = product5.getId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str9, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setId((java.lang.Long) 10L);
        product5.setName("");
        product5.setQuantity((int) (short) 10);
        product5.setId((java.lang.Long) 100L);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getName();
        product5.setDescription("hi!");
        product5.setPrice((java.lang.Double) 1.0d);
        java.lang.String str13 = product5.getName();
        int int14 = product5.getQuantity();
        product5.setDescription("Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        product5.setQuantity(35);
        java.lang.Class<?> wildcardClass19 = product5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        product5.setName("hi!");
        int int10 = product5.getQuantity();
        java.lang.Class<?> wildcardClass11 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.Long long7 = product5.getId();
        int int8 = product5.getQuantity();
        product5.setQuantity(35);
        product5.setQuantity((int) (short) 0);
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
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
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        product5.setQuantity((int) (short) 10);
        java.lang.String str9 = product5.toString();
        product5.setDescription("hi!");
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.Double double14 = product5.getPrice();
        java.lang.Class<?> wildcardClass15 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=10}" + "'", str9, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setQuantity((int) (short) 1);
        java.lang.Double double10 = product5.getPrice();
        java.lang.String str11 = product5.getName();
        product5.setId((java.lang.Long) 0L);
        product5.setDescription("");
        java.lang.Long long16 = product5.getId();
        java.util.List<java.lang.Double> doubleList17 = product5.getPriceHistory();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(doubleList17);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "", "", (java.lang.Double) (-1.0d), (int) (byte) 100);
        product5.setId((java.lang.Long) 1L);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        product5.setName("hi!");
        product5.setName("hi!");
        java.lang.String str12 = product5.getDescription();
        product5.setDescription("Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}");
        product5.setName("Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 0L);
        product5.addPriceToHistory((java.lang.Double) (-1.0d));
        product5.setPrice((java.lang.Double) 100.0d);
        org.junit.Assert.assertNotNull(doubleList6);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}", "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", (java.lang.Double) 1.0d, (int) '#');
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        product5.setName("hi!");
        product5.setName("hi!");
        java.lang.String str12 = product5.getDescription();
        product5.setDescription("Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}");
        java.lang.Class<?> wildcardClass15 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.lang.String str6 = product5.getName();
        product5.setName("Product{id=100, name='', description='', price=10.0, quantity=0}");
        product5.setDescription("Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        product5.setName("hi!");
        java.lang.Double double10 = product5.getPrice();
        product5.setId((java.lang.Long) (-1L));
        int int13 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        java.lang.Long long16 = product5.getId();
        java.lang.Class<?> wildcardClass17 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 0L);
        java.lang.String str9 = product5.getDescription();
        product5.setDescription("Product{id=100, name='hi!', description='', price=10.0, quantity=0}");
        java.lang.Long long12 = product5.getId();
        java.lang.String str13 = product5.toString();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}" + "'", str13, "Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}");
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setId((java.lang.Long) 10L);
        java.lang.Long long14 = product5.getId();
        java.lang.String str15 = product5.getDescription();
        java.lang.Double double16 = product5.getPrice();
        product5.setId((java.lang.Long) 0L);
        java.lang.Class<?> wildcardClass19 = product5.getClass();
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}", "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}", (java.lang.Double) 10.0d, 100);
        java.lang.Class<?> wildcardClass6 = product5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        product5.setQuantity((int) (short) 10);
        java.lang.String str9 = product5.toString();
        java.lang.String str10 = product5.getName();
        product5.setId((java.lang.Long) 10L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=10}" + "'", str9, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=100, name='hi!', description='', price=10.0, quantity=0}", "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}", (java.lang.Double) 10.0d, (int) ' ');
        java.lang.Class<?> wildcardClass6 = product5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setName("");
        java.lang.Long long11 = product5.getId();
        java.lang.Long long12 = product5.getId();
        java.lang.Class<?> wildcardClass13 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        product5.setId((java.lang.Long) 1L);
        product5.setPrice((java.lang.Double) 1.0d);
        java.util.List<java.lang.Double> doubleList14 = product5.getPriceHistory();
        product5.setDescription("Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}");
        product5.setDescription("Product{id=-1, name='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', description='Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}', price=10.0, quantity=32}");
        org.junit.Assert.assertNotNull(doubleList14);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", "hi!", (java.lang.Double) 100.0d, (int) '#');
        int int6 = product5.getQuantity();
        product5.setName("Product{id=100, name='', description='', price=10.0, quantity=0}");
        java.lang.Double double9 = product5.getPrice();
        java.lang.Long long10 = product5.getId();
        product5.setName("Product{id=0, name='hi!', description='', price=-1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=100, name='hi!', description='', price=10.0, quantity=0}", "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}", (java.lang.Double) 10.0d, (int) ' ');
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.Class<?> wildcardClass7 = doubleList6.getClass();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) (-1.0d));
        java.lang.String str12 = product5.getDescription();
        product5.setId((java.lang.Long) (-1L));
        product5.setId((java.lang.Long) (-1L));
        java.lang.Class<?> wildcardClass17 = product5.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        int int8 = product5.getQuantity();
        product5.setDescription("hi!");
        java.util.List<java.lang.Double> doubleList11 = product5.getPriceHistory();
        product5.setDescription("Product{id=100, name='hi!', description='', price=10.0, quantity=0}");
        java.lang.Class<?> wildcardClass14 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleList11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.String str8 = product5.getDescription();
        java.util.List<java.lang.Double> doubleList9 = product5.getPriceHistory();
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.String str12 = product5.getName();
        product5.setDescription("");
        product5.setName("Product{id=0, name='hi!', description='', price=-1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(doubleList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.lang.Double double10 = product5.getPrice();
        product5.setId((java.lang.Long) 10L);
        product5.setPrice((java.lang.Double) 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.lang.String str10 = product5.getName();
        java.lang.String str11 = product5.toString();
        product5.setQuantity((-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str11, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=0, name='hi!', description='', price=1.0, quantity=0}", "Product{id=100, name='', description='', price=10.0, quantity=0}", (java.lang.Double) (-1.0d), (int) '#');
        product5.setQuantity((int) ' ');
        java.lang.Class<?> wildcardClass8 = product5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        java.lang.Long long10 = product5.getId();
        product5.setQuantity(0);
        product5.setQuantity((int) (byte) -1);
        product5.setName("Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}");
        int int17 = product5.getQuantity();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}", "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", (java.lang.Double) 100.0d, (int) '4');
        java.lang.Class<?> wildcardClass6 = product5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.String str7 = product5.toString();
        java.lang.Long long8 = product5.getId();
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.Double double11 = product5.getPrice();
        java.lang.Class<?> wildcardClass12 = product5.getClass();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str7, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
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
        java.lang.String str21 = product5.getName();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str21, "Product{id=100, name='', description='', price=10.0, quantity=0}");
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) (-1.0d));
        java.lang.String str12 = product5.getDescription();
        product5.setId((java.lang.Long) (-1L));
        java.lang.Double double15 = product5.getPrice();
        java.lang.Class<?> wildcardClass16 = product5.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getName();
        product5.setName("");
        product5.setName("Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        product5.setDescription("Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}");
        java.lang.Class<?> wildcardClass15 = product5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.util.List<java.lang.Double> doubleList7 = product5.getPriceHistory();
        product5.setQuantity((int) (short) 100);
        product5.setName("");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(doubleList7);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
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
        product5.setDescription("Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=100}");
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
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) 10.0d);
        java.lang.String str12 = product5.getDescription();
        product5.setPrice((java.lang.Double) 0.0d);
        product5.setId((java.lang.Long) 0L);
        java.lang.Class<?> wildcardClass17 = product5.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=100, name='hi!', description='', price=10.0, quantity=0}", "Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=100}", (java.lang.Double) 100.0d, (int) (short) 10);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        int int8 = product5.getQuantity();
        java.util.List<java.lang.Double> doubleList9 = product5.getPriceHistory();
        product5.setPrice((java.lang.Double) 0.0d);
        product5.setDescription("Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleList9);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.Double double8 = product5.getPrice();
        product5.setQuantity((int) (byte) 0);
        java.lang.String str11 = product5.getDescription();
        java.lang.String str12 = product5.getDescription();
        java.lang.Class<?> wildcardClass13 = product5.getClass();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getName();
        product5.setDescription("hi!");
        product5.setPrice((java.lang.Double) 1.0d);
        java.lang.String str13 = product5.getName();
        int int14 = product5.getQuantity();
        product5.setQuantity((int) '4');
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        java.lang.String str10 = product5.getDescription();
        java.lang.Long long11 = product5.getId();
        java.lang.Class<?> wildcardClass12 = product5.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        java.lang.String str10 = product5.getDescription();
        int int11 = product5.getQuantity();
        java.lang.String str12 = product5.getDescription();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=100, name='hi!', description='', price=10.0, quantity=0}", "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}", (java.lang.Double) 10.0d, (int) ' ');
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.Class<?> wildcardClass7 = product5.getClass();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", "hi!", (java.lang.Double) 100.0d, (int) '#');
        java.lang.Double double6 = product5.getPrice();
        java.lang.Class<?> wildcardClass7 = product5.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.lang.Double double10 = product5.getPrice();
        product5.setId((java.lang.Long) 10L);
        java.lang.String str13 = product5.getName();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
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
        java.lang.Class<?> wildcardClass19 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(doubleList16);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "hi!", "Product{id=1, name='', description='', price=-1.0, quantity=100}", (java.lang.Double) 0.0d, (int) (byte) 10);
        java.lang.String str6 = product5.getName();
        product5.setId((java.lang.Long) 10L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.String str8 = product5.getDescription();
        java.util.List<java.lang.Double> doubleList9 = product5.getPriceHistory();
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.String str12 = product5.getName();
        java.util.List<java.lang.Double> doubleList13 = product5.getPriceHistory();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(doubleList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(doubleList13);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        product5.setName("");
        product5.setName("Product{id=0, name='hi!', description='', price=-1.0, quantity=0}");
        product5.addPriceToHistory((java.lang.Double) (-1.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        java.lang.Long long9 = product5.getId();
        java.util.List<java.lang.Double> doubleList10 = product5.getPriceHistory();
        java.lang.Class<?> wildcardClass11 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertNotNull(doubleList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        java.lang.String str9 = product5.getName();
        java.lang.String str10 = product5.getDescription();
        product5.setPrice((java.lang.Double) 10.0d);
        java.util.List<java.lang.Double> doubleList13 = product5.getPriceHistory();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(doubleList13);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
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
        java.lang.Class<?> wildcardClass23 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(doubleList16);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.lang.String str10 = product5.getName();
        java.lang.String str11 = product5.toString();
        int int12 = product5.getQuantity();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str11, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        int int8 = product5.getQuantity();
        product5.setDescription("hi!");
        java.util.List<java.lang.Double> doubleList11 = product5.getPriceHistory();
        java.lang.Class<?> wildcardClass12 = doubleList11.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setName("");
        java.lang.Double double14 = product5.getPrice();
        product5.setQuantity((int) (byte) 10);
        product5.setQuantity((-1));
        java.util.List<java.lang.Double> doubleList19 = product5.getPriceHistory();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertNotNull(doubleList19);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        int int8 = product5.getQuantity();
        product5.setDescription("hi!");
        java.util.List<java.lang.Double> doubleList11 = product5.getPriceHistory();
        java.lang.String str12 = product5.getName();
        java.lang.String str13 = product5.toString();
        product5.setDescription("hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}" + "'", str13, "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}");
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 0L);
        java.lang.String str9 = product5.getDescription();
        product5.setDescription("Product{id=100, name='hi!', description='', price=10.0, quantity=0}");
        java.lang.String str12 = product5.toString();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}" + "'", str12, "Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}");
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}", "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", (java.lang.Double) 100.0d, (int) '4');
        product5.setId((java.lang.Long) 1L);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
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
        product5.setDescription("Product{id=100, name='hi!', description='', price=1.0, quantity=100}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}" + "'", str13, "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}");
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=1, name='', description='', price=-1.0, quantity=100}", "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}", (java.lang.Double) (-1.0d), (int) '#');
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}", "Product{id=100, name='hi!', description='', price=1.0, quantity=10}", (java.lang.Double) (-1.0d), (int) (short) 100);
        java.lang.String str6 = product5.getDescription();
        product5.setQuantity(0);
        java.lang.String str9 = product5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=10}" + "'", str6, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=0, name='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=0}" + "'", str9, "Product{id=0, name='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=0}");
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", "hi!", (java.lang.Double) 100.0d, (int) '#');
        java.lang.Double double6 = product5.getPrice();
        java.lang.Double double7 = product5.getPrice();
        product5.setPrice((java.lang.Double) 1.0d);
        java.lang.String str10 = product5.toString();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Product{id=1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=0}', description='hi!', price=1.0, quantity=35}" + "'", str10, "Product{id=1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=0}', description='hi!', price=1.0, quantity=35}");
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        java.lang.String str11 = product5.getDescription();
        java.lang.Class<?> wildcardClass12 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) (-1.0d));
        java.lang.String str12 = product5.getDescription();
        product5.setId((java.lang.Long) (-1L));
        product5.setId((java.lang.Long) (-1L));
        java.util.List<java.lang.Double> doubleList17 = product5.getPriceHistory();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(doubleList17);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "", "Product{id=-1, name='hi!', description='', price=0.0, quantity=100}", (java.lang.Double) 100.0d, (int) (short) 100);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.String str12 = product5.getDescription();
        product5.setPrice((java.lang.Double) (-1.0d));
        java.lang.String str15 = product5.getName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
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
        java.lang.Class<?> wildcardClass21 = product5.getClass();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "", "", (java.lang.Double) 0.0d, (int) (byte) 100);
        product5.addPriceToHistory((java.lang.Double) 100.0d);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=100, name='hi!', description='', price=10.0, quantity=0}", "Product{id=0, name='hi!', description='', price=1.0, quantity=0}", (java.lang.Double) 0.0d, (-1));
        product5.setName("Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}");
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setId((java.lang.Long) 10L);
        product5.setName("");
        product5.setQuantity((int) (short) 10);
        java.lang.Double double18 = product5.getPrice();
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}", "Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}", (java.lang.Double) 0.0d, 0);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
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
        product5.setPrice((java.lang.Double) 10.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertNotNull(doubleList13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        product5.setQuantity((int) (short) 10);
        java.lang.String str9 = product5.toString();
        java.lang.Long long10 = product5.getId();
        java.lang.String str11 = product5.getDescription();
        product5.setDescription("");
        java.lang.Long long14 = product5.getId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=10}" + "'", str9, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.Long long7 = product5.getId();
        int int8 = product5.getQuantity();
        java.lang.String str9 = product5.getDescription();
        product5.addPriceToHistory((java.lang.Double) 10.0d);
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        int int8 = product5.getQuantity();
        java.util.List<java.lang.Double> doubleList9 = product5.getPriceHistory();
        product5.setDescription("Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleList9);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.util.List<java.lang.Double> doubleList7 = product5.getPriceHistory();
        java.lang.Class<?> wildcardClass8 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(doubleList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        java.lang.Long long10 = product5.getId();
        product5.setQuantity((int) (short) 100);
        java.util.List<java.lang.Double> doubleList13 = product5.getPriceHistory();
        java.lang.Class<?> wildcardClass14 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertNotNull(doubleList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getDescription();
        product5.setId((java.lang.Long) 0L);
        java.lang.String str11 = product5.toString();
        java.lang.String str12 = product5.getDescription();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str11, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "Product{id=100, name='hi!', description='', price=100.0, quantity=0}", "", (java.lang.Double) 100.0d, 0);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 0L);
        java.util.List<java.lang.Double> doubleList9 = product5.getPriceHistory();
        product5.setPrice((java.lang.Double) 100.0d);
        java.lang.String str12 = product5.getName();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertNotNull(doubleList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        java.lang.String str11 = product5.getDescription();
        java.lang.String str12 = product5.toString();
        java.lang.String str13 = product5.getName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Product{id=100, name='hi!', description='', price=10.0, quantity=0}" + "'", str12, "Product{id=100, name='hi!', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.Double double8 = product5.getPrice();
        product5.setQuantity((int) (byte) 0);
        java.lang.String str11 = product5.getDescription();
        java.lang.Class<?> wildcardClass12 = product5.getClass();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.Double double8 = product5.getPrice();
        java.lang.String str9 = product5.toString();
        java.lang.Double double10 = product5.getPrice();
        java.lang.Class<?> wildcardClass11 = product5.getClass();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str9, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", "hi!", (java.lang.Double) 100.0d, (int) '#');
        int int6 = product5.getQuantity();
        product5.setName("Product{id=100, name='', description='', price=10.0, quantity=0}");
        java.lang.String str9 = product5.getName();
        product5.setName("Product{id=-1, name='hi!', description='', price=0.0, quantity=100}");
        product5.setName("Product{id=-1, name='hi!', description='', price=0.0, quantity=100}");
        java.lang.String str14 = product5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str9, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Product{id=1, name='Product{id=-1, name='hi!', description='', price=0.0, quantity=100}', description='hi!', price=100.0, quantity=35}" + "'", str14, "Product{id=1, name='Product{id=-1, name='hi!', description='', price=0.0, quantity=100}', description='hi!', price=100.0, quantity=35}");
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        product5.setName("hi!");
        int int10 = product5.getQuantity();
        product5.setName("Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}");
        java.lang.String str13 = product5.getDescription();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "", "Product{id=0, name='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=0}", (java.lang.Double) 100.0d, 0);
        java.lang.String str6 = product5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        product5.setQuantity(0);
        java.lang.Double double13 = product5.getPrice();
        java.util.List<java.lang.Double> doubleList14 = product5.getPriceHistory();
        java.lang.Class<?> wildcardClass15 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(doubleList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.util.List<java.lang.Double> doubleList10 = product5.getPriceHistory();
        java.util.List<java.lang.Double> doubleList11 = product5.getPriceHistory();
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setId((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(doubleList10);
        org.junit.Assert.assertNotNull(doubleList11);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=0}', description='hi!', price=1.0, quantity=35}", "Product{id=0, name='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=0}", (java.lang.Double) 100.0d, (int) 'a');
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setQuantity((int) '#');
        product5.setDescription("");
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        java.lang.Long long17 = product5.getId();
        java.lang.Class<?> wildcardClass18 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 0L);
        java.util.List<java.lang.Double> doubleList9 = product5.getPriceHistory();
        java.lang.Long long10 = product5.getId();
        java.lang.String str11 = product5.getName();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertNotNull(doubleList9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        product5.setQuantity((int) (short) 10);
        int int9 = product5.getQuantity();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) (-1.0d), (int) (byte) 100);
        product5.setName("Product{id=-1, name='hi!', description='', price=0.0, quantity=100}");
        java.lang.Long long8 = product5.getId();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) (-1.0d));
        java.lang.String str12 = product5.getDescription();
        java.lang.Long long13 = product5.getId();
        java.lang.Double double14 = product5.getPrice();
        java.lang.Double double15 = product5.getPrice();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
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
        int int21 = product5.getQuantity();
        product5.setId((java.lang.Long) 10L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str14, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str16, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "", "", (java.lang.Double) (-1.0d), (int) (byte) 100);
        java.lang.Class<?> wildcardClass6 = product5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setName("");
        product5.setQuantity((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        int int11 = product5.getQuantity();
        java.util.List<java.lang.Double> doubleList12 = product5.getPriceHistory();
        java.lang.String str13 = product5.getDescription();
        product5.setDescription("Product{id=100, name='hi!', description='', price=10.0, quantity=0}");
        java.lang.String str16 = product5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(doubleList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str13, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Product{id=100, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}" + "'", str16, "Product{id=100, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}");
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", "hi!", (java.lang.Double) 100.0d, (int) '#');
        int int6 = product5.getQuantity();
        product5.setName("Product{id=100, name='', description='', price=10.0, quantity=0}");
        java.lang.Double double9 = product5.getPrice();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setId((java.lang.Long) (-1L));
        java.lang.Class<?> wildcardClass14 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.lang.String str10 = product5.getName();
        java.util.List<java.lang.Double> doubleList11 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 0L);
        java.lang.String str14 = product5.getDescription();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(doubleList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        product5.setId((java.lang.Long) 1L);
        java.lang.Class<?> wildcardClass12 = product5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
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
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        java.lang.String str9 = product5.getDescription();
        java.lang.Double double10 = product5.getPrice();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "", "", (java.lang.Double) (-1.0d), (int) (byte) 100);
        java.lang.String str6 = product5.toString();
        java.lang.Class<?> wildcardClass7 = product5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=1, name='', description='', price=-1.0, quantity=100}" + "'", str6, "Product{id=1, name='', description='', price=-1.0, quantity=100}");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
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
        java.lang.Long long19 = product5.getId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 0L);
        java.util.List<java.lang.Double> doubleList9 = product5.getPriceHistory();
        product5.setDescription("Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertNotNull(doubleList9);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        java.lang.String str11 = product5.getDescription();
        java.lang.String str12 = product5.toString();
        product5.setName("Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        java.lang.String str15 = product5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Product{id=100, name='hi!', description='', price=10.0, quantity=0}" + "'", str12, "Product{id=100, name='hi!', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Product{id=100, name='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', description='', price=10.0, quantity=0}" + "'", str15, "Product{id=100, name='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', description='', price=10.0, quantity=0}");
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        java.lang.String str9 = product5.getName();
        java.lang.String str10 = product5.getDescription();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setPrice((java.lang.Double) 10.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setQuantity((int) (short) 1);
        java.lang.Double double10 = product5.getPrice();
        java.lang.String str11 = product5.getName();
        product5.setId((java.lang.Long) 0L);
        java.lang.Long long14 = product5.getId();
        product5.setPrice((java.lang.Double) 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        int int8 = product5.getQuantity();
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        product5.setDescription("Product{id=100, name='hi!', description='', price=10.0, quantity=35}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) (-1.0d), (int) (byte) 100);
        product5.setPrice((java.lang.Double) 100.0d);
        java.lang.Long long8 = product5.getId();
        product5.setId((java.lang.Long) (-1L));
        product5.setId((java.lang.Long) 100L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setQuantity((int) '#');
        product5.setDescription("");
        product5.setName("Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}");
        product5.setPrice((java.lang.Double) 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.String str11 = product5.toString();
        java.lang.Class<?> wildcardClass12 = product5.getClass();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product{id=0, name='hi!', description='', price=0.0, quantity=0}" + "'", str11, "Product{id=0, name='hi!', description='', price=0.0, quantity=0}");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setId((java.lang.Long) 10L);
        java.lang.Long long14 = product5.getId();
        java.lang.String str15 = product5.getDescription();
        java.lang.Double double16 = product5.getPrice();
        java.lang.Class<?> wildcardClass17 = product5.getClass();
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.util.List<java.lang.Double> doubleList10 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 10L);
        product5.setName("Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        java.lang.String str15 = product5.getName();
        product5.addPriceToHistory((java.lang.Double) (-1.0d));
        org.junit.Assert.assertNotNull(doubleList10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str15, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        product5.setQuantity(0);
        java.lang.Class<?> wildcardClass13 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "", "", (java.lang.Double) (-1.0d), (int) (byte) 100);
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        java.lang.Long long8 = product5.getId();
        product5.setName("Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}");
        product5.setQuantity((int) 'a');
        java.lang.Class<?> wildcardClass13 = product5.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.String str11 = product5.getDescription();
        int int12 = product5.getQuantity();
        java.lang.String str13 = product5.getDescription();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}", "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", (java.lang.Double) 100.0d, (int) '4');
        product5.setQuantity((int) (short) 10);
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        java.lang.String str10 = product5.getName();
        java.lang.Class<?> wildcardClass11 = product5.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=10}" + "'", str10, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) (-1.0d));
        java.lang.String str12 = product5.getDescription();
        java.lang.String str13 = product5.toString();
        product5.setDescription("Product{id=1, name='Product{id=-1, name='hi!', description='', price=0.0, quantity=100}', description='hi!', price=100.0, quantity=35}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}" + "'", str13, "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}");
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getDescription();
        java.lang.String str9 = product5.toString();
        java.lang.String str10 = product5.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str9, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str10, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
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
        java.lang.Double double19 = product5.getPrice();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertNotNull(doubleList18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=-1, name='hi!', description='', price=-1.0, quantity=0}", "Product{id=-1, name='hi!', description='', price=-1.0, quantity=0}", (java.lang.Double) 1.0d, (int) 'a');
        java.lang.String str6 = product5.getDescription();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=-1, name='hi!', description='', price=-1.0, quantity=0}" + "'", str6, "Product{id=-1, name='hi!', description='', price=-1.0, quantity=0}");
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.String str7 = product5.toString();
        java.lang.Long long8 = product5.getId();
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.String str11 = product5.toString();
        product5.addPriceToHistory((java.lang.Double) (-1.0d));
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str7, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product{id=100, name='hi!', description='', price=0.0, quantity=0}" + "'", str11, "Product{id=100, name='hi!', description='', price=0.0, quantity=0}");
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.String str7 = product5.toString();
        java.lang.Long long8 = product5.getId();
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.String str11 = product5.toString();
        java.lang.String str12 = product5.getName();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str7, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product{id=100, name='hi!', description='', price=0.0, quantity=0}" + "'", str11, "Product{id=100, name='hi!', description='', price=0.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=100, name='hi!', description='', price=10.0, quantity=0}", "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}", (java.lang.Double) 10.0d, (int) ' ');
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        product5.setPrice((java.lang.Double) 1.0d);
        java.lang.Double double9 = product5.getPrice();
        product5.setId((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=100, name='', description='', price=10.0, quantity=0}", "Product{id=0, name='hi!', description='', price=1.0, quantity=0}", (java.lang.Double) 10.0d, (int) (short) 100);
        product5.setName("hi!");
        java.lang.Double double8 = product5.getPrice();
        product5.setDescription("");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        product5.setName("hi!");
        int int10 = product5.getQuantity();
        product5.setName("Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}");
        product5.setId((java.lang.Long) 100L);
        java.lang.String str15 = product5.toString();
        product5.setPrice((java.lang.Double) 100.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Product{id=100, name='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', description='', price=1.0, quantity=0}" + "'", str15, "Product{id=100, name='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', description='', price=1.0, quantity=0}");
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        product5.setQuantity((int) (short) 10);
        product5.setQuantity((int) 'a');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        product5.setQuantity((int) (short) 10);
        java.lang.String str9 = product5.toString();
        java.lang.Long long10 = product5.getId();
        product5.setId((java.lang.Long) 0L);
        java.lang.String str13 = product5.getDescription();
        java.lang.Class<?> wildcardClass14 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=10}" + "'", str9, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        product5.setName("hi!");
        int int10 = product5.getQuantity();
        product5.setName("Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}");
        product5.setId((java.lang.Long) 100L);
        java.lang.String str15 = product5.toString();
        product5.setPrice((java.lang.Double) (-1.0d));
        java.lang.Double double18 = product5.getPrice();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Product{id=100, name='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', description='', price=1.0, quantity=0}" + "'", str15, "Product{id=100, name='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.util.List<java.lang.Double> doubleList10 = product5.getPriceHistory();
        java.util.List<java.lang.Double> doubleList11 = product5.getPriceHistory();
        java.lang.Class<?> wildcardClass12 = doubleList11.getClass();
        org.junit.Assert.assertNotNull(doubleList10);
        org.junit.Assert.assertNotNull(doubleList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.Double double8 = product5.getPrice();
        product5.setQuantity((int) (byte) 0);
        java.lang.Long long11 = product5.getId();
        product5.setPrice((java.lang.Double) 10.0d);
        java.lang.Long long14 = product5.getId();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.util.List<java.lang.Double> doubleList7 = product5.getPriceHistory();
        product5.setQuantity((int) (short) 100);
        java.lang.Double double10 = product5.getPrice();
        product5.setId((java.lang.Long) 10L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(doubleList7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.String str7 = product5.toString();
        java.lang.Long long8 = product5.getId();
        java.lang.String str9 = product5.getDescription();
        java.lang.String str10 = product5.getDescription();
        product5.setQuantity(35);
        product5.addPriceToHistory((java.lang.Double) 1.0d);
        java.lang.String str15 = product5.getDescription();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str7, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setId((java.lang.Long) 100L);
        java.lang.String str10 = product5.getDescription();
        java.lang.String str11 = product5.getDescription();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        product5.setQuantity((int) (short) 10);
        java.lang.String str9 = product5.toString();
        java.lang.String str10 = product5.getName();
        java.lang.Long long11 = product5.getId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=10}" + "'", str9, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.String str8 = product5.getDescription();
        java.util.List<java.lang.Double> doubleList9 = product5.getPriceHistory();
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.String str12 = product5.getName();
        product5.setDescription("");
        java.lang.Class<?> wildcardClass15 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(doubleList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "", "Product{id=1, name='', description='', price=-1.0, quantity=100}", (java.lang.Double) 0.0d, (int) (byte) -1);
        int int6 = product5.getQuantity();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        product5.setName("hi!");
        java.lang.Double double10 = product5.getPrice();
        product5.setId((java.lang.Long) (-1L));
        int int13 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        java.lang.Long long16 = product5.getId();
        java.lang.String str17 = product5.getDescription();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setQuantity((int) '#');
        java.lang.Long long13 = product5.getId();
        java.util.List<java.lang.Double> doubleList14 = product5.getPriceHistory();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertNotNull(doubleList14);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setQuantity((int) '#');
        product5.setDescription("");
        product5.setDescription("Product{id=100, name='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setQuantity((int) '#');
        java.lang.String str13 = product5.getName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
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
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "hi!", "", (java.lang.Double) 0.0d, (int) (byte) 100);
        product5.addPriceToHistory((java.lang.Double) 10.0d);
        java.lang.String str8 = product5.toString();
        java.lang.Double double9 = product5.getPrice();
        java.lang.String str10 = product5.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Product{id=-1, name='hi!', description='', price=0.0, quantity=100}" + "'", str8, "Product{id=-1, name='hi!', description='', price=0.0, quantity=100}");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Product{id=-1, name='hi!', description='', price=0.0, quantity=100}" + "'", str10, "Product{id=-1, name='hi!', description='', price=0.0, quantity=100}");
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setName("");
        java.lang.String str14 = product5.toString();
        product5.setQuantity(0);
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str14, "Product{id=100, name='', description='', price=10.0, quantity=0}");
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 0.0d);
        product5.setName("Product{id=100, name='', description='', price=10.0, quantity=0}");
        java.lang.String str14 = product5.toString();
        product5.setPrice((java.lang.Double) (-1.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Product{id=100, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=0.0, quantity=0}" + "'", str14, "Product{id=100, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=0.0, quantity=0}");
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getName();
        product5.setDescription("hi!");
        product5.setId((java.lang.Long) 10L);
        java.lang.String str13 = product5.getDescription();
        java.lang.String str14 = product5.getName();
        java.lang.String str15 = product5.toString();
        java.util.List<java.lang.Double> doubleList16 = product5.getPriceHistory();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}" + "'", str15, "Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList16);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
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
        product5.setQuantity((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleList9);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(doubleList17);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 10.0d, (int) (short) 1);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        org.junit.Assert.assertNotNull(doubleList6);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        int int8 = product5.getQuantity();
        product5.setDescription("hi!");
        java.util.List<java.lang.Double> doubleList11 = product5.getPriceHistory();
        product5.setDescription("Product{id=100, name='hi!', description='', price=10.0, quantity=0}");
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.String str16 = product5.getDescription();
        java.lang.Class<?> wildcardClass17 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleList11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Product{id=100, name='hi!', description='', price=10.0, quantity=0}" + "'", str16, "Product{id=100, name='hi!', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        product5.setName("hi!");
        product5.setPrice((java.lang.Double) 100.0d);
        java.util.List<java.lang.Double> doubleList12 = product5.getPriceHistory();
        java.lang.Class<?> wildcardClass13 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(doubleList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 0L);
        java.util.List<java.lang.Double> doubleList9 = product5.getPriceHistory();
        java.lang.String str10 = product5.toString();
        java.lang.String str11 = product5.getDescription();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertNotNull(doubleList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str10, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setId((java.lang.Long) 10L);
        java.lang.Long long14 = product5.getId();
        java.lang.String str15 = product5.getName();
        product5.setId((java.lang.Long) (-1L));
        java.util.List<java.lang.Double> doubleList18 = product5.getPriceHistory();
        java.lang.Class<?> wildcardClass19 = doubleList18.getClass();
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(doubleList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        product5.addPriceToHistory((java.lang.Double) 1.0d);
        product5.setQuantity((int) (byte) 100);
        int int11 = product5.getQuantity();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getName();
        product5.setDescription("hi!");
        product5.setPrice((java.lang.Double) 1.0d);
        java.lang.String str13 = product5.getName();
        product5.setQuantity((int) (byte) 100);
        java.lang.String str16 = product5.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Product{id=0, name='hi!', description='hi!', price=1.0, quantity=100}" + "'", str16, "Product{id=0, name='hi!', description='hi!', price=1.0, quantity=100}");
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        product5.setName("hi!");
        java.lang.String str10 = product5.toString();
        java.lang.Long long11 = product5.getId();
        java.lang.Double double12 = product5.getPrice();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str10, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 0L);
        product5.addPriceToHistory((java.lang.Double) (-1.0d));
        java.lang.Double double11 = product5.getPrice();
        product5.setName("Product{id=100, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        product5.setId((java.lang.Long) 1L);
        product5.setPrice((java.lang.Double) 1.0d);
        product5.setId((java.lang.Long) 1L);
        java.lang.Double double16 = product5.getPrice();
        java.lang.Double double17 = product5.getPrice();
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "hi!", "Product{id=1, name='', description='', price=-1.0, quantity=100}", (java.lang.Double) 0.0d, (int) (byte) 10);
        java.lang.String str6 = product5.getName();
        java.lang.Long long7 = product5.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        java.lang.String str11 = product5.getDescription();
        java.lang.Double double12 = product5.getPrice();
        product5.setPrice((java.lang.Double) 0.0d);
        product5.addPriceToHistory((java.lang.Double) 1.0d);
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}", "Product{id=100, name='hi!', description='', price=1.0, quantity=10}", (java.lang.Double) (-1.0d), (int) (short) 100);
        java.lang.String str6 = product5.getName();
        java.util.List<java.lang.Double> doubleList7 = product5.getPriceHistory();
        product5.setName("hi!");
        java.lang.String str10 = product5.getDescription();
        java.lang.String str11 = product5.toString();
        product5.setPrice((java.lang.Double) 100.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}" + "'", str6, "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=10}" + "'", str10, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=100}" + "'", str11, "Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=100}");
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
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
        java.util.List<java.lang.Double> doubleList23 = product5.getPriceHistory();
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}" + "'", str20, "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}");
        org.junit.Assert.assertNotNull(doubleList23);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        int int8 = product5.getQuantity();
        product5.setDescription("hi!");
        java.util.List<java.lang.Double> doubleList11 = product5.getPriceHistory();
        product5.setDescription("Product{id=100, name='hi!', description='', price=10.0, quantity=0}");
        product5.setPrice((java.lang.Double) 0.0d);
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleList11);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        product5.setQuantity((int) (short) 10);
        java.lang.String str9 = product5.toString();
        java.lang.String str10 = product5.getName();
        java.lang.Class<?> wildcardClass11 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=10}" + "'", str9, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        int int8 = product5.getQuantity();
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        product5.setId((java.lang.Long) 10L);
        int int13 = product5.getQuantity();
        java.lang.Class<?> wildcardClass14 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=100, name='', description='', price=10.0, quantity=0}", "Product{id=0, name='hi!', description='', price=1.0, quantity=0}", (java.lang.Double) 10.0d, (int) (short) 100);
        product5.setName("hi!");
        java.lang.Double double8 = product5.getPrice();
        java.lang.String str9 = product5.getName();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        product5.setQuantity((int) (short) 10);
        java.lang.String str9 = product5.toString();
        java.lang.Long long10 = product5.getId();
        product5.setDescription("");
        product5.setId((java.lang.Long) 10L);
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        product5.setName("Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}");
        java.lang.String str19 = product5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=10}" + "'", str9, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Product{id=10, name='Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}', description='', price=1.0, quantity=10}" + "'", str19, "Product{id=10, name='Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}', description='', price=1.0, quantity=10}");
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.String str7 = product5.toString();
        java.lang.Long long8 = product5.getId();
        java.lang.String str9 = product5.getDescription();
        java.lang.String str10 = product5.getDescription();
        product5.setQuantity(35);
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        product5.setId((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str7, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}", "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", (java.lang.Double) 100.0d, (int) '4');
        java.lang.String str6 = product5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=10}" + "'", str6, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
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
        java.lang.Long long24 = product5.getId();
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}" + "'", str20, "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=0, name='Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}', description='Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}', price=1.0, quantity=0}", "Product{id=100, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=0.0, quantity=0}", (java.lang.Double) 10.0d, 0);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
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
        java.lang.Long long18 = product5.getId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.lang.Double double10 = product5.getPrice();
        java.lang.Long long11 = product5.getId();
        java.util.List<java.lang.Double> doubleList12 = product5.getPriceHistory();
        java.lang.Class<?> wildcardClass13 = product5.getClass();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(doubleList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
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
        product5.setPrice((java.lang.Double) 100.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(doubleList16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) (-1.0d), (int) (byte) 100);
        product5.setPrice((java.lang.Double) 100.0d);
        java.lang.String str8 = product5.getDescription();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", "hi!", (java.lang.Double) 100.0d, (int) '#');
        java.lang.Double double6 = product5.getPrice();
        java.lang.Double double7 = product5.getPrice();
        java.lang.Long long8 = product5.getId();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
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
        java.util.List<java.lang.Double> doubleList17 = product5.getPriceHistory();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str7, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(doubleList17);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        product5.setQuantity((int) (short) 10);
        java.lang.String str9 = product5.toString();
        product5.setDescription("hi!");
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.Double double14 = product5.getPrice();
        product5.setQuantity(100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=10}" + "'", str9, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        int int11 = product5.getQuantity();
        java.util.List<java.lang.Double> doubleList12 = product5.getPriceHistory();
        java.lang.String str13 = product5.toString();
        product5.setId((java.lang.Long) 1L);
        java.lang.Class<?> wildcardClass16 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(doubleList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}" + "'", str13, "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        java.lang.Long long9 = product5.getId();
        java.lang.String str10 = product5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str10, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        product5.setId((java.lang.Long) 1L);
        product5.setPrice((java.lang.Double) 1.0d);
        java.util.List<java.lang.Double> doubleList14 = product5.getPriceHistory();
        java.lang.String str15 = product5.getName();
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        java.lang.Class<?> wildcardClass18 = product5.getClass();
        org.junit.Assert.assertNotNull(doubleList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.util.List<java.lang.Double> doubleList8 = product5.getPriceHistory();
        java.lang.Class<?> wildcardClass9 = doubleList8.getClass();
        org.junit.Assert.assertNotNull(doubleList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=1, name='', description='', price=-1.0, quantity=100}", "hi!", (java.lang.Double) 0.0d, 0);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        int int11 = product5.getQuantity();
        java.util.List<java.lang.Double> doubleList12 = product5.getPriceHistory();
        java.lang.String str13 = product5.toString();
        product5.setQuantity((int) (byte) 100);
        product5.setId((java.lang.Long) (-1L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(doubleList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}" + "'", str13, "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}");
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 0L);
        java.lang.String str9 = product5.getDescription();
        product5.setDescription("Product{id=100, name='hi!', description='', price=10.0, quantity=0}");
        java.lang.Long long12 = product5.getId();
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.Long long15 = product5.getId();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) (-1.0d), (int) (byte) 100);
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        java.util.List<java.lang.Double> doubleList8 = product5.getPriceHistory();
        java.lang.String str9 = product5.getDescription();
        org.junit.Assert.assertNotNull(doubleList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str9, "Product{id=100, name='', description='', price=10.0, quantity=0}");
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.Double double8 = product5.getPrice();
        java.lang.String str9 = product5.toString();
        java.lang.Double double10 = product5.getPrice();
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        java.lang.Class<?> wildcardClass13 = product5.getClass();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str9, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setId((java.lang.Long) 10L);
        product5.setName("");
        product5.setQuantity((int) (short) 10);
        product5.setName("Product{id=100, name='', description='', price=10.0, quantity=0}");
        java.lang.String str20 = product5.toString();
        java.lang.String str21 = product5.getDescription();
        java.lang.String str22 = product5.toString();
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}" + "'", str20, "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}" + "'", str22, "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}");
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
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
        java.lang.Long long22 = product5.getId();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
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
        product5.setId((java.lang.Long) 10L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str14, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str16, "Product{id=100, name='', description='', price=10.0, quantity=0}");
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        java.lang.String str8 = product5.getName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
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
        java.lang.Double double25 = product5.getPrice();
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}" + "'", str20, "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.0d) + "'", double25 == (-1.0d));
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}", "Product{id=-1, name='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', description='Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}', price=10.0, quantity=32}", (java.lang.Double) (-1.0d), 52);
        product5.setName("Product{id=0, name='hi!', description='', price=-1.0, quantity=0}");
        java.lang.Class<?> wildcardClass8 = product5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setQuantity((int) (short) 1);
        product5.setQuantity((int) (short) 100);
        java.lang.Double double12 = product5.getPrice();
        java.lang.Class<?> wildcardClass13 = product5.getClass();
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        int int8 = product5.getQuantity();
        product5.setDescription("hi!");
        java.util.List<java.lang.Double> doubleList11 = product5.getPriceHistory();
        java.lang.String str12 = product5.getName();
        java.lang.String str13 = product5.toString();
        product5.setPrice((java.lang.Double) 0.0d);
        product5.setQuantity((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}" + "'", str13, "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}");
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setName("");
        java.lang.Long long11 = product5.getId();
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        java.lang.Class<?> wildcardClass14 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        java.lang.String str9 = product5.getName();
        java.lang.String str10 = product5.getDescription();
        product5.addPriceToHistory((java.lang.Double) 10.0d);
        java.lang.String str13 = product5.getDescription();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        java.lang.String str9 = product5.getName();
        java.lang.String str10 = product5.getDescription();
        product5.setPrice((java.lang.Double) 10.0d);
        java.lang.String str13 = product5.getDescription();
        java.util.List<java.lang.Double> doubleList14 = product5.getPriceHistory();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(doubleList14);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setQuantity((int) (short) 1);
        java.lang.String str10 = product5.getName();
        int int11 = product5.getQuantity();
        product5.setQuantity((int) '#');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "hi!", "", (java.lang.Double) 0.0d, (int) (byte) 100);
        product5.addPriceToHistory((java.lang.Double) 10.0d);
        java.lang.String str8 = product5.toString();
        java.lang.Double double9 = product5.getPrice();
        java.lang.Class<?> wildcardClass10 = product5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Product{id=-1, name='hi!', description='', price=0.0, quantity=100}" + "'", str8, "Product{id=-1, name='hi!', description='', price=0.0, quantity=100}");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.util.List<java.lang.Double> doubleList7 = product5.getPriceHistory();
        java.lang.String str8 = product5.getName();
        java.lang.Class<?> wildcardClass9 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(doubleList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
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
        product5.setName("Product{id=0, name='hi!', description='', price=-1.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str7, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "", "Product{id=10, name='hi!', description='', price=10.0, quantity=0}", (java.lang.Double) 1.0d, (int) '4');
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        product5.setQuantity((int) (short) 10);
        java.lang.String str9 = product5.toString();
        product5.setDescription("hi!");
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.Double double14 = product5.getPrice();
        product5.setPrice((java.lang.Double) (-1.0d));
        java.util.List<java.lang.Double> doubleList17 = product5.getPriceHistory();
        java.lang.String str18 = product5.getDescription();
        product5.setDescription("Product{id=100, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=10}" + "'", str9, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(doubleList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.util.List<java.lang.Double> doubleList10 = product5.getPriceHistory();
        java.lang.String str11 = product5.getName();
        java.lang.String str12 = product5.toString();
        java.lang.String str13 = product5.toString();
        product5.setName("Product{id=10, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=100, name='hi!', description='', price=1.0, quantity=0}', price=100.0, quantity=52}");
        org.junit.Assert.assertNotNull(doubleList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str12, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str13, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        java.lang.Double double11 = product5.getPrice();
        product5.setPrice((java.lang.Double) 100.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=100, name='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', description='', price=1.0, quantity=0}", "Product{id=0, name='hi!', description='', price=0.0, quantity=0}", (java.lang.Double) 0.0d, (int) (byte) -1);
        product5.setPrice((java.lang.Double) 10.0d);
        java.lang.String str8 = product5.toString();
        product5.setName("Product{id=0, name='hi!', description='', price=-1.0, quantity=0}");
        java.lang.String str11 = product5.getName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Product{id=1, name='Product{id=100, name='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', description='', price=1.0, quantity=0}', description='Product{id=0, name='hi!', description='', price=0.0, quantity=0}', price=10.0, quantity=-1}" + "'", str8, "Product{id=1, name='Product{id=100, name='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', description='', price=1.0, quantity=0}', description='Product{id=0, name='hi!', description='', price=0.0, quantity=0}', price=10.0, quantity=-1}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}" + "'", str11, "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}");
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=100, name='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', description='', price=10.0, quantity=0}", "Product{id=-1, name='hi!', description='', price=-1.0, quantity=0}", (java.lang.Double) (-1.0d), (int) (byte) 1);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.util.List<java.lang.Double> doubleList10 = product5.getPriceHistory();
        java.lang.String str11 = product5.getName();
        java.lang.String str12 = product5.toString();
        java.lang.Long long13 = product5.getId();
        java.lang.Double double14 = product5.getPrice();
        java.lang.Class<?> wildcardClass15 = product5.getClass();
        org.junit.Assert.assertNotNull(doubleList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str12, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        java.lang.String str10 = product5.getDescription();
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        java.lang.Class<?> wildcardClass13 = product5.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getName();
        product5.setDescription("hi!");
        product5.setPrice((java.lang.Double) 1.0d);
        product5.setDescription("");
        product5.setDescription("Product{id=-1, name='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=-1.0, quantity=35}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
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
        product5.setName("hi!");
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
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.Double double8 = product5.getPrice();
        java.lang.String str9 = product5.toString();
        java.lang.Double double10 = product5.getPrice();
        java.lang.String str11 = product5.getName();
        java.lang.Long long12 = product5.getId();
        java.lang.Double double13 = product5.getPrice();
        java.util.List<java.lang.Double> doubleList14 = product5.getPriceHistory();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str9, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(doubleList14);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
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
        java.util.List<java.lang.Double> doubleList17 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 1L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(doubleList17);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", "hi!", (java.lang.Double) 100.0d, (int) '#');
        int int6 = product5.getQuantity();
        product5.setName("Product{id=100, name='', description='', price=10.0, quantity=0}");
        java.lang.Double double9 = product5.getPrice();
        product5.setPrice((java.lang.Double) 10.0d);
        java.lang.String str12 = product5.getDescription();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setQuantity((int) '#');
        java.util.List<java.lang.Double> doubleList13 = product5.getPriceHistory();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleList13);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.Long long7 = product5.getId();
        java.lang.Long long8 = product5.getId();
        product5.setName("Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}");
        product5.setQuantity(1);
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=0, name='hi!', description='', price=0.0, quantity=0}", "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}", (java.lang.Double) 0.0d, (int) '#');
        product5.setQuantity(0);
        java.lang.Class<?> wildcardClass8 = product5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
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
        product5.setQuantity((int) (byte) 100);
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
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
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
        product5.setDescription("Product{id=0, name='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=0}");
        product5.setQuantity(100);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}" + "'", str20, "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setQuantity((int) (byte) 0);
        java.lang.String str11 = product5.toString();
        product5.setQuantity(100);
        product5.setQuantity((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str11, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
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
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}" + "'", str13, "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}");
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=0, name='hi!', description='hi!', price=1.0, quantity=100}", "Product{id=0, name='hi!', description='', price=1.0, quantity=0}", (java.lang.Double) 10.0d, (int) (byte) -1);
        product5.setQuantity((int) (short) -1);
        java.lang.Class<?> wildcardClass8 = product5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        java.lang.String str10 = product5.getDescription();
        int int11 = product5.getQuantity();
        int int12 = product5.getQuantity();
        java.lang.String str13 = product5.toString();
        product5.setQuantity((int) ' ');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str13, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getName();
        product5.setDescription("hi!");
        product5.setPrice((java.lang.Double) 1.0d);
        product5.setDescription("hi!");
        product5.setId((java.lang.Long) (-1L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "Product{id=0, name='hi!', description='hi!', price=1.0, quantity=100}", "Product{id=0, name='hi!', description='hi!', price=1.0, quantity=0}", (java.lang.Double) 100.0d, 0);
        product5.setPrice((java.lang.Double) (-1.0d));
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.String str7 = product5.toString();
        java.lang.Long long8 = product5.getId();
        java.lang.String str9 = product5.getDescription();
        product5.addPriceToHistory((java.lang.Double) (-1.0d));
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.Class<?> wildcardClass14 = product5.getClass();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str7, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=100, name='hi!', description='', price=10.0, quantity=0}", "Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}", (java.lang.Double) (-1.0d), (int) (short) 0);
        product5.setQuantity(1);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "Product{id=100, name='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', description='', price=1.0, quantity=0}", "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}", (java.lang.Double) 10.0d, 100);
        java.lang.Long long6 = product5.getId();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        int int8 = product5.getQuantity();
        product5.setDescription("hi!");
        java.util.List<java.lang.Double> doubleList11 = product5.getPriceHistory();
        java.lang.String str12 = product5.getName();
        product5.setQuantity((int) (byte) -1);
        product5.setName("Product{id=10, name='Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}', description='', price=1.0, quantity=10}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) (-1.0d));
        java.lang.String str12 = product5.getDescription();
        java.lang.Long long13 = product5.getId();
        product5.setDescription("Product{id=1, name='hi!', description='', price=1.0, quantity=0}");
        product5.setPrice((java.lang.Double) (-1.0d));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.util.List<java.lang.Double> doubleList10 = product5.getPriceHistory();
        java.lang.String str11 = product5.getName();
        java.lang.String str12 = product5.toString();
        java.lang.Long long13 = product5.getId();
        java.lang.Double double14 = product5.getPrice();
        product5.setPrice((java.lang.Double) 100.0d);
        org.junit.Assert.assertNotNull(doubleList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str12, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
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
        product5.setName("Product{id=1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=0}', description='hi!', price=1.0, quantity=35}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str14, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) (-1.0d));
        java.lang.String str12 = product5.getDescription();
        java.lang.Long long13 = product5.getId();
        int int14 = product5.getQuantity();
        java.util.List<java.lang.Double> doubleList15 = product5.getPriceHistory();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(doubleList15);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=0, name='hi!', description='', price=0.0, quantity=0}", "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}", (java.lang.Double) 0.0d, (int) '#');
        product5.setQuantity(0);
        java.lang.Long long8 = product5.getId();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}", "Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}", (java.lang.Double) 0.0d, 100);
        java.lang.String str6 = product5.getDescription();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}" + "'", str6, "Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}");
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.addPriceToHistory((java.lang.Double) 10.0d);
        java.lang.Long long8 = product5.getId();
        product5.setPrice((java.lang.Double) 10.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.Long long7 = product5.getId();
        java.lang.Long long8 = product5.getId();
        product5.setName("Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}");
        java.lang.String str11 = product5.getDescription();
        product5.setName("Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=100}");
        product5.setId((java.lang.Long) 100L);
        product5.setDescription("Product{id=0, name='hi!', description='', price=-1.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        java.lang.Long long10 = product5.getId();
        product5.setQuantity(0);
        product5.setQuantity((int) (byte) -1);
        product5.setName("Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}");
        java.lang.Class<?> wildcardClass17 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        java.lang.String str11 = product5.getDescription();
        java.lang.Double double12 = product5.getPrice();
        java.util.List<java.lang.Double> doubleList13 = product5.getPriceHistory();
        java.lang.Double double14 = product5.getPrice();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(doubleList13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        java.lang.String str9 = product5.getDescription();
        java.lang.String str10 = product5.getName();
        java.lang.Double double11 = product5.getPrice();
        java.lang.String str12 = product5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str12, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}", "Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}", (java.lang.Double) 0.0d, 100);
        java.lang.String str6 = product5.toString();
        java.lang.Double double7 = product5.getPrice();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=0, name='Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}', description='Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}', price=0.0, quantity=100}" + "'", str6, "Product{id=0, name='Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}', description='Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}', price=0.0, quantity=100}");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.util.List<java.lang.Double> doubleList10 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 10L);
        product5.setName("Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        product5.setQuantity((int) 'a');
        org.junit.Assert.assertNotNull(doubleList10);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) (-1.0d), (int) (byte) 100);
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        java.util.List<java.lang.Double> doubleList8 = product5.getPriceHistory();
        java.lang.String str9 = product5.toString();
        org.junit.Assert.assertNotNull(doubleList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=-1.0, quantity=100}" + "'", str9, "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=-1.0, quantity=100}");
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=-1, name='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', description='Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}', price=10.0, quantity=32}", "Product{id=-1, name='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', description='Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}', price=10.0, quantity=32}", (java.lang.Double) (-1.0d), (int) ' ');
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setQuantity((int) (short) 1);
        java.lang.String str10 = product5.getName();
        java.lang.String str11 = product5.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) 10.0d);
        java.lang.String str12 = product5.getDescription();
        java.util.List<java.lang.Double> doubleList13 = product5.getPriceHistory();
        java.lang.Class<?> wildcardClass14 = doubleList13.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(doubleList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        java.lang.String str10 = product5.getDescription();
        java.lang.Double double11 = product5.getPrice();
        java.lang.String str12 = product5.getDescription();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "", "", (java.lang.Double) (-1.0d), (int) (byte) 100);
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        product5.setDescription("Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}");
        java.lang.String str10 = product5.getName();
        product5.setPrice((java.lang.Double) (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.util.List<java.lang.Double> doubleList10 = product5.getPriceHistory();
        java.lang.String str11 = product5.getDescription();
        java.lang.String str12 = product5.getDescription();
        java.lang.String str13 = product5.getDescription();
        org.junit.Assert.assertNotNull(doubleList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setQuantity((int) (short) 1);
        java.lang.Double double10 = product5.getPrice();
        java.lang.String str11 = product5.getName();
        product5.setId((java.lang.Long) 0L);
        java.lang.Long long14 = product5.getId();
        java.lang.Class<?> wildcardClass15 = product5.getClass();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setQuantity((int) '#');
        java.lang.Long long13 = product5.getId();
        product5.addPriceToHistory((java.lang.Double) (-1.0d));
        java.lang.String str16 = product5.getName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=100, name='', description='', price=10.0, quantity=0}", "", (java.lang.Double) 100.0d, (int) ' ');
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        java.lang.Long long8 = product5.getId();
        java.lang.String str9 = product5.toString();
        java.lang.Class<?> wildcardClass10 = product5.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}" + "'", str9, "Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.lang.String str10 = product5.toString();
        java.lang.Class<?> wildcardClass11 = product5.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str10, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        java.lang.Double double9 = product5.getPrice();
        java.lang.Double double10 = product5.getPrice();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.String str7 = product5.toString();
        java.lang.Long long8 = product5.getId();
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.Double double11 = product5.getPrice();
        java.lang.String str12 = product5.getDescription();
        java.lang.String str13 = product5.getDescription();
        java.lang.String str14 = product5.getName();
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
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "", "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", (java.lang.Double) 0.0d, (int) (byte) 1);
        int int6 = product5.getQuantity();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setId((java.lang.Long) 10L);
        java.lang.Long long14 = product5.getId();
        java.lang.String str15 = product5.getDescription();
        java.lang.String str16 = product5.getName();
        java.lang.String str17 = product5.getName();
        product5.setName("Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.Long long7 = product5.getId();
        java.lang.Long long8 = product5.getId();
        product5.setQuantity((int) (short) 0);
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        product5.setQuantity((int) (short) 1);
        java.lang.String str10 = product5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=1}" + "'", str10, "Product{id=100, name='hi!', description='', price=1.0, quantity=1}");
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        java.lang.Long long10 = product5.getId();
        product5.setQuantity(0);
        product5.setQuantity((int) (byte) -1);
        java.lang.String str15 = product5.getName();
        java.lang.Class<?> wildcardClass16 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "", "", (java.lang.Double) (-1.0d), (int) (byte) 100);
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        java.lang.Double double8 = product5.getPrice();
        java.lang.String str9 = product5.getName();
        java.lang.Class<?> wildcardClass10 = product5.getClass();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        java.lang.Long long10 = product5.getId();
        product5.setQuantity((int) (short) 100);
        java.util.List<java.lang.Double> doubleList13 = product5.getPriceHistory();
        product5.addPriceToHistory((java.lang.Double) (-1.0d));
        java.lang.String str16 = product5.getName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertNotNull(doubleList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
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
        java.lang.String str17 = product5.toString();
        java.lang.Class<?> wildcardClass18 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertNotNull(doubleList13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=100}" + "'", str17, "Product{id=100, name='hi!', description='', price=1.0, quantity=100}");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "hi!", "Product{id=100, name='hi!', description='', price=0.0, quantity=0}", (java.lang.Double) 100.0d, (int) (byte) 100);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        org.junit.Assert.assertNotNull(doubleList6);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.lang.String str10 = product5.getName();
        java.lang.String str11 = product5.toString();
        product5.setQuantity((int) (short) 100);
        java.util.List<java.lang.Double> doubleList14 = product5.getPriceHistory();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str11, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList14);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        product5.setId((java.lang.Long) 1L);
        product5.setPrice((java.lang.Double) 1.0d);
        java.util.List<java.lang.Double> doubleList14 = product5.getPriceHistory();
        java.util.List<java.lang.Double> doubleList15 = product5.getPriceHistory();
        org.junit.Assert.assertNotNull(doubleList14);
        org.junit.Assert.assertNotNull(doubleList15);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        java.lang.String str10 = product5.getName();
        java.util.List<java.lang.Double> doubleList11 = product5.getPriceHistory();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(doubleList11);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        java.lang.Double double11 = product5.getPrice();
        product5.setPrice((java.lang.Double) 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=1, name='Product{id=-1, name='hi!', description='', price=0.0, quantity=100}', description='hi!', price=100.0, quantity=35}", "Product{id=10, name='hi!', description='', price=1.0, quantity=10}", (java.lang.Double) 1.0d, (int) (short) -1);
        product5.setName("Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}");
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        java.lang.String str10 = product5.getDescription();
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        java.lang.Double double13 = product5.getPrice();
        java.util.List<java.lang.Double> doubleList14 = product5.getPriceHistory();
        java.lang.Class<?> wildcardClass15 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(doubleList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.Double double8 = product5.getPrice();
        product5.setQuantity((int) (byte) 0);
        java.lang.String str11 = product5.getDescription();
        java.lang.String str12 = product5.getDescription();
        int int13 = product5.getQuantity();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}", "Product{id=100, name='hi!', description='', price=1.0, quantity=10}", (java.lang.Double) (-1.0d), (int) (short) 100);
        java.lang.String str6 = product5.getName();
        java.util.List<java.lang.Double> doubleList7 = product5.getPriceHistory();
        product5.setName("hi!");
        java.lang.String str10 = product5.getDescription();
        product5.setQuantity((int) ' ');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}" + "'", str6, "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=10}" + "'", str10, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        int int11 = product5.getQuantity();
        java.util.List<java.lang.Double> doubleList12 = product5.getPriceHistory();
        java.lang.String str13 = product5.getDescription();
        product5.setDescription("Product{id=100, name='hi!', description='', price=10.0, quantity=0}");
        java.lang.String str16 = product5.getName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(doubleList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str13, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 0L);
        java.lang.String str9 = product5.getName();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.String str7 = product5.toString();
        java.lang.Long long8 = product5.getId();
        java.lang.String str9 = product5.getDescription();
        java.lang.String str10 = product5.getDescription();
        product5.setQuantity(35);
        java.lang.String str13 = product5.toString();
        product5.setQuantity(0);
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str7, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=35}" + "'", str13, "Product{id=100, name='hi!', description='', price=1.0, quantity=35}");
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getName();
        product5.setDescription("hi!");
        product5.setPrice((java.lang.Double) 1.0d);
        java.lang.String str13 = product5.getName();
        int int14 = product5.getQuantity();
        product5.setId((java.lang.Long) 0L);
        java.util.List<java.lang.Double> doubleList17 = product5.getPriceHistory();
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        java.lang.Double double20 = product5.getPrice();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(doubleList17);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.String str7 = product5.toString();
        product5.setId((java.lang.Long) 100L);
        java.lang.String str10 = product5.getName();
        product5.setQuantity((int) (short) 0);
        java.util.List<java.lang.Double> doubleList13 = product5.getPriceHistory();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str7, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(doubleList13);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setQuantity((int) (short) 1);
        product5.setQuantity((int) (short) 100);
        java.lang.String str12 = product5.getName();
        product5.setDescription("Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
        java.lang.Double double15 = product5.getPrice();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getName();
        product5.setName("");
        java.lang.String str11 = product5.getName();
        java.lang.Double double12 = product5.getPrice();
        product5.setQuantity((int) (short) -1);
        int int15 = product5.getQuantity();
        java.lang.Class<?> wildcardClass16 = product5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.Long long7 = product5.getId();
        int int8 = product5.getQuantity();
        product5.setName("Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}");
        java.lang.String str11 = product5.getDescription();
        product5.setPrice((java.lang.Double) 1.0d);
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=100, name='hi!', description='', price=100.0, quantity=0}", "Product{id=100, name='hi!', description='', price=1.0, quantity=35}", (java.lang.Double) 100.0d, (int) (short) 0);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=100}", "Product{id=-1, name='hi!', description='', price=0.0, quantity=100}", (java.lang.Double) 100.0d, (int) (byte) 10);
        java.lang.Class<?> wildcardClass6 = product5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=0, name='hi!', description='', price=1.0, quantity=0}", "Product{id=100, name='', description='', price=10.0, quantity=0}", (java.lang.Double) (-1.0d), (int) '#');
        product5.setQuantity((int) ' ');
        product5.setQuantity((int) 'a');
        product5.setName("Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}");
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", "hi!", (java.lang.Double) 100.0d, (int) '#');
        int int6 = product5.getQuantity();
        product5.setName("Product{id=100, name='', description='', price=10.0, quantity=0}");
        java.lang.String str9 = product5.getName();
        java.lang.String str10 = product5.getName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str9, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str10, "Product{id=100, name='', description='', price=10.0, quantity=0}");
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "hi!", "", (java.lang.Double) 0.0d, (int) (byte) 100);
        product5.addPriceToHistory((java.lang.Double) 10.0d);
        java.util.List<java.lang.Double> doubleList8 = product5.getPriceHistory();
        java.lang.Class<?> wildcardClass9 = doubleList8.getClass();
        org.junit.Assert.assertNotNull(doubleList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}", "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", (java.lang.Double) 100.0d, (int) '4');
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Class<?> wildcardClass8 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str7, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setId((java.lang.Long) 10L);
        product5.setName("");
        product5.setQuantity((int) (short) 10);
        product5.setName("Product{id=100, name='', description='', price=10.0, quantity=0}");
        product5.setQuantity(10);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=0, name='hi!', description='', price=0.0, quantity=0}", "Product{id=100, name='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', description='', price=10.0, quantity=0}", (java.lang.Double) 0.0d, (int) (short) 100);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        org.junit.Assert.assertNotNull(doubleList6);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        product5.setQuantity((int) (short) 10);
        java.lang.Double double9 = product5.getPrice();
        product5.setDescription("");
        java.util.List<java.lang.Double> doubleList12 = product5.getPriceHistory();
        java.lang.String str13 = product5.getName();
        product5.setQuantity((int) ' ');
        product5.setDescription("Product{id=-1, name='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=-1.0, quantity=35}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(doubleList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=0, name='hi!', description='', price=1.0, quantity=0}", "Product{id=100, name='', description='', price=10.0, quantity=0}", (java.lang.Double) (-1.0d), (int) '#');
        product5.setId((java.lang.Long) 10L);
        java.lang.String str8 = product5.getName();
        product5.setQuantity(52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str8, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getDescription();
        java.lang.String str9 = product5.toString();
        java.lang.Double double10 = product5.getPrice();
        java.lang.String str11 = product5.getDescription();
        product5.setId((java.lang.Long) 10L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str9, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getDescription();
        int int9 = product5.getQuantity();
        java.lang.Class<?> wildcardClass10 = product5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "hi!", "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}", (java.lang.Double) 0.0d, (int) ' ');
        product5.setName("Product{id=100, name='', description='', price=10.0, quantity=0}");
        java.lang.Long long8 = product5.getId();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.String str7 = product5.toString();
        java.lang.Long long8 = product5.getId();
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.Double double11 = product5.getPrice();
        java.lang.String str12 = product5.getDescription();
        java.lang.String str13 = product5.getDescription();
        java.lang.String str14 = product5.getName();
        product5.setId((java.lang.Long) (-1L));
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str7, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setDescription("Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}");
        java.lang.Long long14 = product5.getId();
        java.lang.String str15 = product5.getDescription();
        java.lang.Long long16 = product5.getId();
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}" + "'", str15, "Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setId((java.lang.Long) 10L);
        product5.setQuantity((int) (short) 1);
        int int16 = product5.getQuantity();
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.String str7 = product5.toString();
        java.lang.Long long8 = product5.getId();
        java.lang.String str9 = product5.getDescription();
        java.lang.String str10 = product5.getDescription();
        java.lang.String str11 = product5.getDescription();
        java.lang.Double double12 = product5.getPrice();
        product5.setName("Product{id=0, name='hi!', description='', price=0.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str7, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        java.lang.String str10 = product5.getName();
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        java.lang.String str11 = product5.getDescription();
        java.lang.Double double12 = product5.getPrice();
        product5.setDescription("Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        java.lang.String str15 = product5.getDescription();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str15, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", "hi!", (java.lang.Double) 100.0d, (int) '#');
        java.lang.Double double6 = product5.getPrice();
        java.lang.Double double7 = product5.getPrice();
        product5.setPrice((java.lang.Double) 1.0d);
        product5.setPrice((java.lang.Double) (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        product5.setQuantity((int) (short) 10);
        java.lang.String str9 = product5.toString();
        java.lang.Long long10 = product5.getId();
        java.lang.String str11 = product5.getDescription();
        product5.setDescription("");
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=10}" + "'", str9, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}", "Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}", (java.lang.Double) 0.0d, 35);
        product5.setDescription("Product{id=-1, name='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', description='Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}', price=10.0, quantity=32}");
        product5.setDescription("Product{id=0, name='hi!', description='', price=0.0, quantity=0}");
        java.lang.String str10 = product5.getName();
        java.lang.String str11 = product5.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}" + "'", str10, "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}" + "'", str11, "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}");
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=100, name='hi!', description='', price=10.0, quantity=0}", "hi!", (java.lang.Double) 1.0d, 52);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        org.junit.Assert.assertNotNull(doubleList6);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
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
        product5.setQuantity((int) (byte) 100);
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
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "Product{id=-1, name='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=-1.0, quantity=35}", "Product{id=1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=0}', description='hi!', price=1.0, quantity=35}", (java.lang.Double) (-1.0d), (int) ' ');
        int int6 = product5.getQuantity();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", "hi!", (java.lang.Double) 100.0d, (int) '#');
        java.lang.Double double6 = product5.getPrice();
        product5.setName("Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}");
        java.lang.Class<?> wildcardClass9 = product5.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        java.lang.String str10 = product5.getDescription();
        int int11 = product5.getQuantity();
        int int12 = product5.getQuantity();
        product5.setName("Product{id=10, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=10.0, quantity=35}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.lang.String str10 = product5.getName();
        java.lang.String str11 = product5.toString();
        product5.addPriceToHistory((java.lang.Double) 1.0d);
        product5.setId((java.lang.Long) 1L);
        java.lang.Class<?> wildcardClass16 = product5.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str11, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.Double double8 = product5.getPrice();
        product5.setDescription("Product{id=100, name='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', description='', price=-1.0, quantity=0}");
        java.lang.Class<?> wildcardClass11 = product5.getClass();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.Long long7 = product5.getId();
        java.lang.Double double8 = product5.getPrice();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "", "Product{id=100, name='hi!', description='', price=1.0, quantity=100}", (java.lang.Double) 100.0d, 32);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
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
        java.lang.Double double22 = product5.getPrice();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str14, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str16, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList19);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
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
        java.lang.Class<?> wildcardClass18 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str14, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}", "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}", (java.lang.Double) 100.0d, (-1));
        java.lang.String str6 = product5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=10, name='Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}', description='Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}', price=100.0, quantity=-1}" + "'", str6, "Product{id=10, name='Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}', description='Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}', price=100.0, quantity=-1}");
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
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
        product5.setQuantity((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}" + "'", str13, "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}");
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setId((java.lang.Long) 100L);
        product5.setDescription("Product{id=-1, name='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', description='Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}', price=10.0, quantity=32}");
        product5.setDescription("Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}");
        java.lang.Double double14 = product5.getPrice();
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        java.lang.String str9 = product5.getDescription();
        product5.setId((java.lang.Long) 10L);
        int int12 = product5.getQuantity();
        java.lang.String str13 = product5.getDescription();
        java.lang.String str14 = product5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Product{id=10, name='hi!', description='', price=1.0, quantity=0}" + "'", str14, "Product{id=10, name='hi!', description='', price=1.0, quantity=0}");
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) (-1.0d));
        java.lang.String str12 = product5.getDescription();
        product5.setName("Product{id=0, name='hi!', description='', price=0.0, quantity=0}");
        product5.setName("Product{id=100, name='hi!', description='', price=10.0, quantity=0}");
        product5.setName("Product{id=100, name='hi!', description='', price=1.0, quantity=100}");
        product5.setQuantity(100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        java.lang.Class<?> wildcardClass12 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=100, name='hi!', description='', price=-1.0, quantity=35}", "Product{id=0, name='Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}', description='Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}', price=0.0, quantity=100}", (java.lang.Double) 0.0d, (int) (short) 0);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.lang.String str10 = product5.getName();
        java.lang.String str11 = product5.toString();
        product5.setQuantity((int) (short) 100);
        java.lang.String str14 = product5.getDescription();
        java.lang.String str15 = product5.getName();
        java.lang.Class<?> wildcardClass16 = product5.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str11, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "Product{id=1, name='', description='', price=-1.0, quantity=100}", "Product{id=1, name='Product{id=100, name='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', description='', price=1.0, quantity=0}', description='Product{id=0, name='hi!', description='', price=0.0, quantity=0}', price=10.0, quantity=-1}", (java.lang.Double) 0.0d, (int) (short) 0);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=100, name='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', description='', price=-1.0, quantity=0}", "", (java.lang.Double) 100.0d, (int) (byte) -1);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        java.lang.String str9 = product5.getName();
        java.lang.String str10 = product5.getDescription();
        product5.setQuantity(0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
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
        product5.setQuantity((-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}" + "'", str20, "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
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
        int int26 = product5.getQuantity();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str14, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str16, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52 + "'", int26 == 52);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        java.lang.String str11 = product5.getDescription();
        java.lang.Double double12 = product5.getPrice();
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.Class<?> wildcardClass15 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}", "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}", (java.lang.Double) 10.0d, 100);
        java.lang.String str6 = product5.getName();
        java.lang.Long long7 = product5.getId();
        java.lang.String str8 = product5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}" + "'", str6, "Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Product{id=10, name='Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}', description='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', price=10.0, quantity=100}" + "'", str8, "Product{id=10, name='Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}', description='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', price=10.0, quantity=100}");
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "Product{id=100, name='hi!', description='', price=10.0, quantity=0}", "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}", (java.lang.Double) 0.0d, (int) (short) 100);
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        java.lang.String str8 = product5.getDescription();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}" + "'", str8, "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}");
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.lang.String str10 = product5.toString();
        java.lang.Double double11 = product5.getPrice();
        java.lang.String str12 = product5.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str10, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str12, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        java.lang.String str10 = product5.getDescription();
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        java.lang.String str13 = product5.getName();
        product5.setPrice((java.lang.Double) 1.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.String str8 = product5.getDescription();
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        product5.addPriceToHistory((java.lang.Double) 1.0d);
        product5.setPrice((java.lang.Double) 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        int int7 = product5.getQuantity();
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        product5.setDescription("Product{id=100, name='hi!', description='', price=0.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 0L);
        java.lang.String str9 = product5.getDescription();
        product5.setDescription("Product{id=100, name='hi!', description='', price=10.0, quantity=0}");
        java.lang.Long long12 = product5.getId();
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.String str15 = product5.getName();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        product5.setQuantity((int) (short) 10);
        java.lang.Double double9 = product5.getPrice();
        product5.setDescription("");
        java.util.List<java.lang.Double> doubleList12 = product5.getPriceHistory();
        java.lang.String str13 = product5.toString();
        product5.setName("Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(doubleList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=10}" + "'", str13, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
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
        product5.setPrice((java.lang.Double) 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", "hi!", (java.lang.Double) 100.0d, (int) '#');
        int int6 = product5.getQuantity();
        product5.setName("Product{id=100, name='', description='', price=10.0, quantity=0}");
        java.lang.String str9 = product5.getName();
        product5.setName("Product{id=-1, name='hi!', description='', price=0.0, quantity=100}");
        java.lang.Long long12 = product5.getId();
        java.lang.Class<?> wildcardClass13 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str9, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "Product{id=100, name='', description='', price=10.0, quantity=0}", "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", (java.lang.Double) 1.0d, 100);
        product5.setName("Product{id=100, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}");
        int int8 = product5.getQuantity();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
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
        java.lang.String str20 = product5.toString();
        product5.setDescription("Product{id=-1, name='hi!', description='', price=-1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str14, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str16, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Product{id=100, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='', price=10.0, quantity=0}" + "'", str20, "Product{id=100, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='', price=10.0, quantity=0}");
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setQuantity((int) '#');
        product5.setDescription("");
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        java.lang.Long long17 = product5.getId();
        product5.setQuantity((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=100, name='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', description='', price=-1.0, quantity=0}", "Product{id=0, name='hi!', description='Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}', price=0.0, quantity=0}", (java.lang.Double) 0.0d, (int) (byte) -1);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getName();
        product5.setDescription("hi!");
        product5.setId((java.lang.Long) 10L);
        int int13 = product5.getQuantity();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=100, name='hi!', description='', price=10.0, quantity=0}", "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}", (java.lang.Double) 10.0d, (int) ' ');
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        product5.setPrice((java.lang.Double) 1.0d);
        int int9 = product5.getQuantity();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        product5.addPriceToHistory((java.lang.Double) 1.0d);
        product5.setDescription("Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}");
        product5.setQuantity(1);
        product5.setQuantity(0);
        org.junit.Assert.assertNotNull(doubleList6);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setQuantity((int) (short) 1);
        product5.setQuantity((int) (short) 100);
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.Class<?> wildcardClass14 = product5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        java.lang.Long long10 = product5.getId();
        product5.setQuantity(0);
        product5.setQuantity((int) (byte) -1);
        product5.setName("Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}");
        product5.setName("Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=100}");
        java.lang.String str19 = product5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Product{id=100, name='Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=100}', description='', price=1.0, quantity=-1}" + "'", str19, "Product{id=100, name='Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=100}', description='', price=1.0, quantity=-1}");
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.String str7 = product5.toString();
        java.lang.Long long8 = product5.getId();
        java.lang.String str9 = product5.getDescription();
        java.lang.String str10 = product5.getDescription();
        product5.setQuantity(35);
        product5.setQuantity(0);
        int int15 = product5.getQuantity();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str7, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        java.lang.String str11 = product5.getDescription();
        java.lang.String str12 = product5.toString();
        product5.setPrice((java.lang.Double) 100.0d);
        java.lang.Class<?> wildcardClass15 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Product{id=100, name='hi!', description='', price=10.0, quantity=0}" + "'", str12, "Product{id=100, name='hi!', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        int int11 = product5.getQuantity();
        java.util.List<java.lang.Double> doubleList12 = product5.getPriceHistory();
        java.lang.String str13 = product5.getDescription();
        product5.addPriceToHistory((java.lang.Double) (-1.0d));
        java.lang.String str16 = product5.getName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(doubleList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str13, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        int int11 = product5.getQuantity();
        java.util.List<java.lang.Double> doubleList12 = product5.getPriceHistory();
        int int13 = product5.getQuantity();
        product5.setDescription("Product{id=100, name='hi!', description='', price=100.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(doubleList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}", "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", (java.lang.Double) 100.0d, (int) '4');
        int int6 = product5.getQuantity();
        product5.setQuantity(1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        java.lang.String str9 = product5.getDescription();
        product5.setName("Product{id=1, name='', description='', price=-1.0, quantity=100}");
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
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=100, name='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', description='', price=-1.0, quantity=0}", "Product{id=10, name='Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}', description='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', price=10.0, quantity=100}", (java.lang.Double) 1.0d, (int) (byte) 1);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        product5.setQuantity((int) (short) 10);
        java.lang.String str9 = product5.toString();
        java.lang.Long long10 = product5.getId();
        java.lang.String str11 = product5.getDescription();
        java.lang.Class<?> wildcardClass12 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=10}" + "'", str9, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
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
        java.util.List<java.lang.Double> doubleList21 = product5.getPriceHistory();
        java.lang.Double double22 = product5.getPrice();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(doubleList21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.String str7 = product5.toString();
        java.lang.Long long8 = product5.getId();
        java.lang.String str9 = product5.getDescription();
        product5.addPriceToHistory((java.lang.Double) (-1.0d));
        product5.setPrice((java.lang.Double) 0.0d);
        product5.setPrice((java.lang.Double) 100.0d);
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str7, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.lang.Double double10 = product5.getPrice();
        java.lang.String str11 = product5.getName();
        product5.setDescription("Product{id=100, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='', price=10.0, quantity=0}");
        java.lang.Double double14 = product5.getPrice();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        int int8 = product5.getQuantity();
        product5.setDescription("hi!");
        product5.setDescription("Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        product5.setDescription("");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) (-1.0d));
        java.lang.String str12 = product5.getDescription();
        product5.setId((java.lang.Long) (-1L));
        product5.setId((java.lang.Long) (-1L));
        java.lang.Double double17 = product5.getPrice();
        product5.setName("Product{id=0, name='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 0L);
        java.lang.String str9 = product5.getDescription();
        java.lang.Double double10 = product5.getPrice();
        java.lang.String str11 = product5.toString();
        product5.setPrice((java.lang.Double) 10.0d);
        java.lang.String str14 = product5.getName();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str11, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
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
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        java.lang.String str21 = product5.getName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=0, name='Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}', description='Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}', price=1.0, quantity=0}", "Product{id=1, name='hi!', description='', price=1.0, quantity=0}", (java.lang.Double) 0.0d, 10);
        product5.setId((java.lang.Long) 100L);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=0, name='hi!', description='', price=-1.0, quantity=0}", "Product{id=100, name='hi!', description='', price=1.0, quantity=10}", (java.lang.Double) (-1.0d), (int) (short) 100);
        java.lang.String str6 = product5.getDescription();
        product5.setName("Product{id=100, name='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=10}" + "'", str6, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getDescription();
        product5.setId((java.lang.Long) 0L);
        java.lang.String str11 = product5.toString();
        java.lang.Long long12 = product5.getId();
        int int13 = product5.getQuantity();
        java.lang.String str14 = product5.getName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str11, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "", "", (java.lang.Double) (-1.0d), (int) (byte) 100);
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        java.lang.Double double8 = product5.getPrice();
        java.lang.String str9 = product5.getName();
        product5.setDescription("Product{id=10, name='Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}', description='Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=1.0, quantity=0}', price=100.0, quantity=-1}");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.Long long7 = product5.getId();
        int int8 = product5.getQuantity();
        product5.setQuantity(35);
        product5.addPriceToHistory((java.lang.Double) 10.0d);
        java.lang.Class<?> wildcardClass13 = product5.getClass();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.lang.String str10 = product5.toString();
        java.lang.Double double11 = product5.getPrice();
        java.lang.String str12 = product5.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str10, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
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
        java.lang.String str23 = product5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str14, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Product{id=100, name='', description='', price=0.0, quantity=0}" + "'", str23, "Product{id=100, name='', description='', price=0.0, quantity=0}");
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "", "", (java.lang.Double) (-1.0d), (int) (byte) 100);
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        java.util.List<java.lang.Double> doubleList8 = product5.getPriceHistory();
        product5.setQuantity((int) ' ');
        org.junit.Assert.assertNotNull(doubleList8);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        int int7 = product5.getQuantity();
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        java.util.List<java.lang.Double> doubleList10 = product5.getPriceHistory();
        java.lang.Double double11 = product5.getPrice();
        product5.setDescription("Product{id=0, name='hi!', description='Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}', price=0.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(doubleList10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        java.lang.String str11 = product5.getDescription();
        java.lang.Double double12 = product5.getPrice();
        product5.setPrice((java.lang.Double) 0.0d);
        product5.addPriceToHistory((java.lang.Double) 1.0d);
        int int17 = product5.getQuantity();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        int int11 = product5.getQuantity();
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "Product{id=10, name='hi!', description='hi!', price=1.0, quantity=0}", "Product{id=100, name='', description='', price=10.0, quantity=0}", (java.lang.Double) 100.0d, (int) (short) 100);
        java.lang.Long long6 = product5.getId();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        product5.setName("hi!");
        product5.setId((java.lang.Long) 10L);
        product5.addPriceToHistory((java.lang.Double) 1.0d);
        java.util.List<java.lang.Double> doubleList14 = product5.getPriceHistory();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(doubleList14);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}", "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}", (java.lang.Double) (-1.0d), (int) (short) 0);
        product5.setId((java.lang.Long) 10L);
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        java.lang.Class<?> wildcardClass10 = product5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=100, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=0.0, quantity=0}", "Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}", (java.lang.Double) (-1.0d), 10);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=10, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=100, name='hi!', description='', price=1.0, quantity=0}', price=100.0, quantity=52}", "Product{id=10, name='hi!', description='', price=1.0, quantity=10}", (java.lang.Double) 1.0d, (int) (short) 1);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.String str7 = product5.toString();
        product5.setId((java.lang.Long) 100L);
        java.lang.Long long10 = product5.getId();
        java.lang.String str11 = product5.getName();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str7, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getDescription();
        product5.setId((java.lang.Long) 0L);
        java.lang.String str11 = product5.toString();
        java.lang.Class<?> wildcardClass12 = product5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str11, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=100, name='hi!', description='', price=1.0, quantity=100}", "", (java.lang.Double) 1.0d, (int) (short) 100);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
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
        java.lang.String str22 = product5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}" + "'", str13, "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Product{id=100, name='hi!', description='hi!', price=10.0, quantity=0}" + "'", str22, "Product{id=100, name='hi!', description='hi!', price=10.0, quantity=0}");
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=100, name='hi!', description='', price=1.0, quantity=10}", "Product{id=0, name='hi!', description='', price=1.0, quantity=0}", (java.lang.Double) 0.0d, (int) (short) -1);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.Class<?> wildcardClass7 = doubleList6.getClass();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 0.0d);
        int int11 = product5.getQuantity();
        product5.setQuantity((int) '#');
        int int14 = product5.getQuantity();
        java.util.List<java.lang.Double> doubleList15 = product5.getPriceHistory();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertNotNull(doubleList15);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.Double double8 = product5.getPrice();
        java.lang.String str9 = product5.toString();
        java.lang.Double double10 = product5.getPrice();
        java.lang.String str11 = product5.getName();
        java.lang.Long long12 = product5.getId();
        product5.setPrice((java.lang.Double) 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str9, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        product5.setQuantity((int) (short) 10);
        java.lang.Double double9 = product5.getPrice();
        product5.setDescription("");
        java.util.List<java.lang.Double> doubleList12 = product5.getPriceHistory();
        java.lang.String str13 = product5.getName();
        java.lang.Double double14 = product5.getPrice();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(doubleList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.util.List<java.lang.Double> doubleList10 = product5.getPriceHistory();
        java.lang.String str11 = product5.getDescription();
        java.lang.String str12 = product5.getDescription();
        product5.setDescription("Product{id=100, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=0.0, quantity=0}");
        product5.setPrice((java.lang.Double) 10.0d);
        org.junit.Assert.assertNotNull(doubleList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) (-1.0d), (int) (byte) 100);
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        java.lang.String str8 = product5.getDescription();
        product5.setPrice((java.lang.Double) 10.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str8, "Product{id=100, name='', description='', price=10.0, quantity=0}");
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.Long long7 = product5.getId();
        int int8 = product5.getQuantity();
        product5.setQuantity(35);
        java.lang.String str11 = product5.getDescription();
        product5.setPrice((java.lang.Double) 10.0d);
        java.lang.Class<?> wildcardClass14 = product5.getClass();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 0L);
        java.lang.String str9 = product5.getDescription();
        java.lang.Double double10 = product5.getPrice();
        java.lang.String str11 = product5.toString();
        product5.setId((java.lang.Long) 1L);
        product5.setQuantity((int) (short) 0);
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str11, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.String str13 = product5.getDescription();
        product5.setName("Product{id=100, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='', price=10.0, quantity=0}");
        java.lang.String str16 = product5.getName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Product{id=100, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='', price=10.0, quantity=0}" + "'", str16, "Product{id=100, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='', price=10.0, quantity=0}");
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        java.lang.String str9 = product5.getName();
        product5.setQuantity((int) (short) -1);
        product5.addPriceToHistory((java.lang.Double) (-1.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
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
        product5.setDescription("Product{id=100, name='hi!', description='Product{id=100, name='hi!', description='', price=10.0, quantity=0}', price=1.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}" + "'", str20, "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}");
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.String str7 = product5.toString();
        java.lang.Long long8 = product5.getId();
        product5.addPriceToHistory((java.lang.Double) 10.0d);
        product5.setName("Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str7, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        product5.setQuantity((int) (short) 10);
        java.lang.String str9 = product5.toString();
        java.lang.Long long10 = product5.getId();
        product5.setDescription("");
        product5.setId((java.lang.Long) 10L);
        product5.addPriceToHistory((java.lang.Double) 0.0d);
        java.lang.String str17 = product5.getDescription();
        java.lang.String str18 = product5.toString();
        java.lang.String str19 = product5.getDescription();
        java.util.List<java.lang.Double> doubleList20 = product5.getPriceHistory();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=10}" + "'", str9, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Product{id=10, name='hi!', description='', price=1.0, quantity=10}" + "'", str18, "Product{id=10, name='hi!', description='', price=1.0, quantity=10}");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(doubleList20);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
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
        product5.setName("Product{id=100, name='hi!', description='', price=0.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}" + "'", str13, "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}");
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        int int11 = product5.getQuantity();
        product5.setPrice((java.lang.Double) (-1.0d));
        product5.setId((java.lang.Long) 1L);
        product5.setDescription("Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        java.lang.String str18 = product5.getDescription();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str18, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getName();
        product5.setName("");
        java.lang.String str11 = product5.getName();
        java.lang.Double double12 = product5.getPrice();
        product5.setQuantity((int) (short) -1);
        int int15 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 100.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.util.List<java.lang.Double> doubleList10 = product5.getPriceHistory();
        product5.setDescription("Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}");
        java.util.List<java.lang.Double> doubleList13 = product5.getPriceHistory();
        java.lang.String str14 = product5.toString();
        org.junit.Assert.assertNotNull(doubleList10);
        org.junit.Assert.assertNotNull(doubleList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Product{id=0, name='hi!', description='Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}', price=1.0, quantity=0}" + "'", str14, "Product{id=0, name='hi!', description='Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}', price=1.0, quantity=0}");
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "", "", (java.lang.Double) (-1.0d), (int) (byte) 100);
        java.lang.String str6 = product5.getDescription();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        int int8 = product5.getQuantity();
        product5.setDescription("hi!");
        java.util.List<java.lang.Double> doubleList11 = product5.getPriceHistory();
        java.lang.String str12 = product5.getName();
        java.lang.String str13 = product5.toString();
        java.lang.Class<?> wildcardClass14 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}" + "'", str13, "Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}", "Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=100}", (java.lang.Double) (-1.0d), 10);
        int int6 = product5.getQuantity();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=100, name='', description='', price=10.0, quantity=0}", "", (java.lang.Double) 100.0d, (int) ' ');
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        product5.setQuantity((int) (short) 0);
        java.lang.Long long10 = product5.getId();
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 0L, "Product{id=100, name='', description='', price=10.0, quantity=0}", "", (java.lang.Double) 100.0d, (int) ' ');
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        java.lang.Double double8 = product5.getPrice();
        java.lang.Class<?> wildcardClass9 = product5.getClass();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
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
        java.lang.Long long20 = product5.getId();
        java.lang.String str21 = product5.getDescription();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 100L + "'", long20 == 100L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) (-1.0d));
        java.lang.String str12 = product5.getDescription();
        product5.setId((java.lang.Long) (-1L));
        product5.setId((java.lang.Long) (-1L));
        java.lang.Long long17 = product5.getId();
        java.lang.Long long18 = product5.getId();
        java.lang.String str19 = product5.toString();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Product{id=-1, name='hi!', description='', price=-1.0, quantity=0}" + "'", str19, "Product{id=-1, name='hi!', description='', price=-1.0, quantity=0}");
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
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
        java.lang.String str17 = product5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str14, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str17, "Product{id=100, name='', description='', price=10.0, quantity=0}");
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
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
        java.lang.String str28 = product5.toString();
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}" + "'", str20, "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=-1.0, quantity=100}', price=-1.0, quantity=10}" + "'", str28, "Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=-1.0, quantity=100}', price=-1.0, quantity=10}");
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "Product{id=-1, name='hi!', description='', price=0.0, quantity=100}", "Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}", (java.lang.Double) 100.0d, (int) (short) 0);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getName();
        product5.setDescription("hi!");
        product5.setPrice((java.lang.Double) 1.0d);
        java.lang.String str13 = product5.getName();
        int int14 = product5.getQuantity();
        product5.setId((java.lang.Long) 0L);
        int int17 = product5.getQuantity();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=0, name='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=0}", "Product{id=100, name='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', description='', price=-1.0, quantity=0}", (java.lang.Double) 100.0d, (int) '#');
        product5.setQuantity((int) '4');
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setId((java.lang.Long) 10L);
        java.lang.Long long14 = product5.getId();
        product5.setName("Product{id=100, name='hi!', description='', price=100.0, quantity=0}");
        java.lang.Class<?> wildcardClass17 = product5.getClass();
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.util.List<java.lang.Double> doubleList7 = product5.getPriceHistory();
        java.lang.String str8 = product5.getName();
        int int9 = product5.getQuantity();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(doubleList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        product5.setQuantity((int) (short) 10);
        java.lang.Double double9 = product5.getPrice();
        product5.setDescription("");
        java.lang.Long long12 = product5.getId();
        product5.setName("Product{id=100, name='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.addPriceToHistory((java.lang.Double) 10.0d);
        product5.setQuantity((int) (byte) 10);
        java.lang.String str10 = product5.toString();
        java.lang.Class<?> wildcardClass11 = product5.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=10}" + "'", str10, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=100, name='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', description='', price=1.0, quantity=0}", "Product{id=0, name='hi!', description='', price=0.0, quantity=0}", (java.lang.Double) 0.0d, (int) (byte) -1);
        product5.setPrice((java.lang.Double) 10.0d);
        java.lang.String str8 = product5.toString();
        product5.setQuantity(0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Product{id=1, name='Product{id=100, name='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', description='', price=1.0, quantity=0}', description='Product{id=0, name='hi!', description='', price=0.0, quantity=0}', price=10.0, quantity=-1}" + "'", str8, "Product{id=1, name='Product{id=100, name='Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}', description='', price=1.0, quantity=0}', description='Product{id=0, name='hi!', description='', price=0.0, quantity=0}', price=10.0, quantity=-1}");
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.Double double8 = product5.getPrice();
        product5.setId((java.lang.Long) (-1L));
        java.lang.String str11 = product5.getDescription();
        java.lang.String str12 = product5.toString();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Product{id=-1, name='hi!', description='', price=1.0, quantity=0}" + "'", str12, "Product{id=-1, name='hi!', description='', price=1.0, quantity=0}");
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        java.lang.String str11 = product5.getDescription();
        java.lang.Double double12 = product5.getPrice();
        product5.setPrice((java.lang.Double) 0.0d);
        product5.addPriceToHistory((java.lang.Double) 1.0d);
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        java.lang.Class<?> wildcardClass19 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.String str7 = product5.toString();
        product5.setId((java.lang.Long) 100L);
        java.lang.String str10 = product5.getName();
        product5.addPriceToHistory((java.lang.Double) 10.0d);
        java.lang.Class<?> wildcardClass13 = product5.getClass();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=0}" + "'", str7, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 100.0d);
        java.lang.String str10 = product5.getDescription();
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        java.lang.String str13 = product5.getName();
        java.util.List<java.lang.Double> doubleList14 = product5.getPriceHistory();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(doubleList14);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        product5.setName("hi!");
        java.util.List<java.lang.Double> doubleList10 = product5.getPriceHistory();
        product5.setDescription("Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}");
        java.lang.Class<?> wildcardClass13 = product5.getClass();
        org.junit.Assert.assertNotNull(doubleList10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getDescription();
        product5.setId((java.lang.Long) 0L);
        java.lang.String str11 = product5.toString();
        java.lang.Long long12 = product5.getId();
        int int13 = product5.getQuantity();
        product5.setQuantity((int) (short) 100);
        java.lang.Double double16 = product5.getPrice();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str11, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setQuantity((int) '#');
        product5.setName("hi!");
        java.lang.String str15 = product5.getDescription();
        product5.setDescription("Product{id=100, name='hi!', description='Product{id=0, name='hi!', description='', price=-1.0, quantity=0}', price=1.0, quantity=0}");
        product5.setName("Product{id=0, name='Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}', description='Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}', price=1.0, quantity=0}");
        java.lang.String str20 = product5.getName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Product{id=0, name='Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}', description='Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}', price=1.0, quantity=0}" + "'", str20, "Product{id=0, name='Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}', description='Product{id=-1, name='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', description='Product{id=0, name='hi!', description='', price=1.0, quantity=0}', price=0.0, quantity=-1}', price=1.0, quantity=0}");
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 10L, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}", "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", (java.lang.Double) 100.0d, (int) '4');
        int int6 = product5.getQuantity();
        product5.setId((java.lang.Long) 100L);
        java.util.List<java.lang.Double> doubleList9 = product5.getPriceHistory();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(doubleList9);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        product5.setDescription("Product{id=-1, name='hi!', description='', price=0.0, quantity=100}");
        product5.setQuantity((int) (byte) 100);
        java.lang.String str13 = product5.getDescription();
        product5.setQuantity(32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=-1, name='hi!', description='', price=0.0, quantity=100}" + "'", str13, "Product{id=-1, name='hi!', description='', price=0.0, quantity=100}");
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "Product{id=100, name='', description='', price=10.0, quantity=0}", "Product{id=0, name='hi!', description='', price=1.0, quantity=0}", (java.lang.Double) 0.0d, (int) (short) -1);
        java.lang.String str6 = product5.getDescription();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Product{id=0, name='hi!', description='', price=1.0, quantity=0}" + "'", str6, "Product{id=0, name='hi!', description='', price=1.0, quantity=0}");
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getName();
        product5.setDescription("hi!");
        product5.setId((java.lang.Long) 10L);
        java.util.List<java.lang.Double> doubleList13 = product5.getPriceHistory();
        java.lang.Class<?> wildcardClass14 = product5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(doubleList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "Product{id=100, name='', description='', price=10.0, quantity=0}", "Product{id=0, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=100.0, quantity=32}", (java.lang.Double) 1.0d, (int) '#');
        java.lang.Class<?> wildcardClass6 = product5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        product5.setQuantity((int) (short) 10);
        java.lang.Double double9 = product5.getPrice();
        product5.setDescription("");
        java.util.List<java.lang.Double> doubleList12 = product5.getPriceHistory();
        java.lang.String str13 = product5.toString();
        java.lang.Class<?> wildcardClass14 = product5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(doubleList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Product{id=100, name='hi!', description='', price=1.0, quantity=10}" + "'", str13, "Product{id=100, name='hi!', description='', price=1.0, quantity=10}");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setQuantity((int) '#');
        product5.setDescription("");
        product5.setDescription("Product{id=100, name='', description='', price=10.0, quantity=0}");
        java.lang.String str17 = product5.getName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
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
        product5.setQuantity((int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}" + "'", str20, "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}");
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.Double double7 = product5.getPrice();
        int int8 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 10.0d);
        product5.setQuantity((int) '#');
        product5.setId((java.lang.Long) 100L);
        java.lang.Double double15 = product5.getPrice();
        java.util.List<java.lang.Double> doubleList16 = product5.getPriceHistory();
        java.lang.Class<?> wildcardClass17 = doubleList16.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(doubleList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        java.lang.Long long7 = product5.getId();
        java.lang.Long long8 = product5.getId();
        product5.setName("Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}");
        java.lang.String str11 = product5.getDescription();
        product5.setName("Product{id=0, name='hi!', description='Product{id=100, name='hi!', description='', price=1.0, quantity=10}', price=-1.0, quantity=100}");
        product5.setId((java.lang.Long) 100L);
        java.util.List<java.lang.Double> doubleList16 = product5.getPriceHistory();
        org.junit.Assert.assertNotNull(doubleList6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(doubleList16);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=100, name='hi!', description='', price=1.0, quantity=0}", "hi!", (java.lang.Double) 100.0d, (int) '#');
        int int6 = product5.getQuantity();
        product5.setName("Product{id=100, name='', description='', price=10.0, quantity=0}");
        java.lang.String str9 = product5.getName();
        product5.setName("Product{id=1, name='', description='', price=-1.0, quantity=100}");
        java.lang.String str12 = product5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Product{id=100, name='', description='', price=10.0, quantity=0}" + "'", str9, "Product{id=100, name='', description='', price=10.0, quantity=0}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Product{id=1, name='Product{id=1, name='', description='', price=-1.0, quantity=100}', description='hi!', price=100.0, quantity=35}" + "'", str12, "Product{id=1, name='Product{id=1, name='', description='', price=-1.0, quantity=100}', description='hi!', price=100.0, quantity=35}");
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) (-1.0d), (int) (byte) 100);
        java.lang.String str6 = product5.getName();
        java.lang.String str7 = product5.getName();
        product5.addPriceToHistory((java.lang.Double) 100.0d);
        java.lang.String str10 = product5.getName();
        java.util.List<java.lang.Double> doubleList11 = product5.getPriceHistory();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(doubleList11);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.example.Product product5 = new org.example.Product((java.lang.Long) (-1L), "Product{id=100, name='hi!', description='', price=10.0, quantity=0}", "Product{id=10, name='Product{id=100, name='', description='', price=10.0, quantity=0}', description='', price=10.0, quantity=10}", (java.lang.Double) 10.0d, (int) ' ');
        product5.setQuantity((int) '#');
        java.lang.String str8 = product5.getName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Product{id=100, name='hi!', description='', price=10.0, quantity=0}" + "'", str8, "Product{id=100, name='hi!', description='', price=10.0, quantity=0}");
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) (-1.0d), (int) (byte) 100);
        java.lang.String str6 = product5.getName();
        int int7 = product5.getQuantity();
        product5.setPrice((java.lang.Double) (-1.0d));
        product5.setId((java.lang.Long) 10L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        java.util.List<java.lang.Double> doubleList6 = product5.getPriceHistory();
        product5.setId((java.lang.Long) 0L);
        product5.setPrice((java.lang.Double) 0.0d);
        product5.setPrice((java.lang.Double) 1.0d);
        org.junit.Assert.assertNotNull(doubleList6);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        int int6 = product5.getQuantity();
        java.lang.String str7 = product5.getDescription();
        java.lang.Double double8 = product5.getPrice();
        int int9 = product5.getQuantity();
        product5.setPrice((java.lang.Double) 0.0d);
        java.lang.Double double12 = product5.getPrice();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 100L, "hi!", "", (java.lang.Double) 1.0d, 0);
        product5.setId((java.lang.Long) 0L);
        java.lang.String str8 = product5.getName();
        product5.setDescription("hi!");
        product5.setPrice((java.lang.Double) 1.0d);
        product5.setDescription("");
        product5.setDescription("Product{id=100, name='hi!', description='hi!', price=1.0, quantity=0}");
        product5.setDescription("Product{id=-1, name='hi!', description='', price=0.0, quantity=100}");
        product5.setDescription("Product{id=100, name='hi!', description='Product{id=100, name='', description='', price=10.0, quantity=0}', price=-1.0, quantity=100}");
        product5.setPrice((java.lang.Double) 100.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.example.Product product5 = new org.example.Product((java.lang.Long) 1L, "Product{id=-1, name='hi!', description='', price=-1.0, quantity=0}", "Product{id=-1, name='hi!', description='', price=-1.0, quantity=0}", (java.lang.Double) 1.0d, (int) 'a');
        java.lang.Double double6 = product5.getPrice();
        product5.setId((java.lang.Long) (-1L));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }
}

