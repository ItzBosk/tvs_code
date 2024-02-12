package randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        // The following exception was thrown during execution in test generation
        try {
            figure.Rettangolo rettangolo2 = new figure.Rettangolo((int) (short) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidParameterException; message: base non puo? esswere negativa");
        } catch (java.security.InvalidParameterException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        figure.Rettangolo rettangolo2 = new figure.Rettangolo(100, (int) (short) -1);
        java.lang.Class<?> wildcardClass3 = rettangolo2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        figure.Rettangolo rettangolo2 = new figure.Rettangolo(100, (int) (short) -1);
        int int3 = rettangolo2.getPerimetro();
        int int4 = rettangolo2.getPerimetro();
        java.lang.Class<?> wildcardClass5 = rettangolo2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 400 + "'", int3 == 400);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 400 + "'", int4 == 400);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        figure.Rettangolo rettangolo2 = new figure.Rettangolo(1, (int) (byte) 10);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        figure.Rettangolo rettangolo2 = new figure.Rettangolo((int) (byte) 0, (int) (byte) -1);
        double double3 = rettangolo2.getArea();
        java.lang.Class<?> wildcardClass4 = rettangolo2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        figure.Rettangolo rettangolo2 = new figure.Rettangolo((int) (short) 1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = rettangolo2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        figure.Rettangolo rettangolo2 = new figure.Rettangolo(100, (int) (short) -1);
        int int3 = rettangolo2.getPerimetro();
        int int4 = rettangolo2.getPerimetro();
        int int5 = rettangolo2.getPerimetro();
        java.lang.Class<?> wildcardClass6 = rettangolo2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 400 + "'", int3 == 400);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 400 + "'", int4 == 400);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 400 + "'", int5 == 400);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        figure.Rettangolo rettangolo2 = new figure.Rettangolo((int) (short) 1, (int) (short) 10);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        // The following exception was thrown during execution in test generation
        try {
            figure.Rettangolo rettangolo2 = new figure.Rettangolo((int) (short) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.security.InvalidParameterException; message: base non puo? esswere negativa");
        } catch (java.security.InvalidParameterException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        figure.Rettangolo rettangolo2 = new figure.Rettangolo((int) ' ', (int) (byte) 10);
        int int3 = rettangolo2.getPerimetro();
        java.lang.Class<?> wildcardClass4 = rettangolo2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 128 + "'", int3 == 128);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        figure.Rettangolo rettangolo2 = new figure.Rettangolo(100, (int) (short) -1);
        int int3 = rettangolo2.getPerimetro();
        double double4 = rettangolo2.getArea();
        int int5 = rettangolo2.getPerimetro();
        java.lang.Class<?> wildcardClass6 = rettangolo2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 400 + "'", int3 == 400);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 400 + "'", int5 == 400);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        figure.Rettangolo rettangolo2 = new figure.Rettangolo((int) (byte) 100, (int) (byte) 10);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        figure.Rettangolo rettangolo2 = new figure.Rettangolo(100, (int) (short) -1);
        int int3 = rettangolo2.getPerimetro();
        double double4 = rettangolo2.getArea();
        java.lang.Class<?> wildcardClass5 = rettangolo2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 400 + "'", int3 == 400);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        // The following exception was thrown during execution in test generation
        try {
            figure.Rettangolo rettangolo2 = new figure.Rettangolo((int) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.security.InvalidParameterException; message: base non puo? esswere negativa");
        } catch (java.security.InvalidParameterException e) {
        // Expected exception.
        }
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        figure.Rettangolo rettangolo2 = new figure.Rettangolo((int) (short) 0, (int) (short) 100);
        double double3 = rettangolo2.getArea();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        figure.Rettangolo rettangolo2 = new figure.Rettangolo(100, (int) (short) -1);
        double double3 = rettangolo2.getArea();
        java.lang.Class<?> wildcardClass4 = rettangolo2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        figure.Rettangolo rettangolo2 = new figure.Rettangolo(0, 0);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        figure.Rettangolo rettangolo2 = new figure.Rettangolo((int) (byte) 100, 10);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        figure.Rettangolo rettangolo2 = new figure.Rettangolo(100, (int) (short) -1);
        int int3 = rettangolo2.getPerimetro();
        int int4 = rettangolo2.getPerimetro();
        int int5 = rettangolo2.getPerimetro();
        int int6 = rettangolo2.getPerimetro();
        double double7 = rettangolo2.getArea();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 400 + "'", int3 == 400);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 400 + "'", int4 == 400);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 400 + "'", int5 == 400);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 400 + "'", int6 == 400);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        figure.Rettangolo rettangolo2 = new figure.Rettangolo((int) (byte) 0, (int) (byte) -1);
        double double3 = rettangolo2.getArea();
        double double4 = rettangolo2.getArea();
        java.lang.Class<?> wildcardClass5 = rettangolo2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        figure.Rettangolo rettangolo2 = new figure.Rettangolo((int) '4', 0);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        figure.Rettangolo rettangolo2 = new figure.Rettangolo((int) (byte) 0, (int) (byte) -1);
        java.lang.Class<?> wildcardClass3 = rettangolo2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        figure.Rettangolo rettangolo2 = new figure.Rettangolo((int) (byte) 0, (int) (byte) -1);
        double double3 = rettangolo2.getArea();
        double double4 = rettangolo2.getArea();
        double double5 = rettangolo2.getArea();
        java.lang.Class<?> wildcardClass6 = rettangolo2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        figure.Rettangolo rettangolo2 = new figure.Rettangolo((int) ' ', (int) (byte) 10);
        int int3 = rettangolo2.getPerimetro();
        int int4 = rettangolo2.getPerimetro();
        int int5 = rettangolo2.getPerimetro();
        int int6 = rettangolo2.getPerimetro();
        int int7 = rettangolo2.getPerimetro();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 128 + "'", int3 == 128);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 128 + "'", int4 == 128);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 128 + "'", int5 == 128);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 128 + "'", int6 == 128);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 128 + "'", int7 == 128);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        figure.Rettangolo rettangolo2 = new figure.Rettangolo((int) '4', 400);
        java.lang.Class<?> wildcardClass3 = rettangolo2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        figure.Rettangolo rettangolo2 = new figure.Rettangolo(400, (int) (byte) 0);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        figure.Rettangolo rettangolo2 = new figure.Rettangolo((int) 'a', (int) '#');
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        figure.Rettangolo rettangolo2 = new figure.Rettangolo((int) (byte) 1, (int) (byte) 100);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        figure.Rettangolo rettangolo2 = new figure.Rettangolo((int) (byte) 0, (int) (byte) -1);
        int int3 = rettangolo2.getPerimetro();
        double double4 = rettangolo2.getArea();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        figure.Rettangolo rettangolo2 = new figure.Rettangolo((int) ' ', (int) (byte) 10);
        java.lang.Class<?> wildcardClass3 = rettangolo2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        figure.Rettangolo rettangolo2 = new figure.Rettangolo((int) '#', (int) (byte) 10);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        figure.Rettangolo rettangolo2 = new figure.Rettangolo((int) (byte) 0, (int) (byte) -1);
        double double3 = rettangolo2.getArea();
        int int4 = rettangolo2.getPerimetro();
        int int5 = rettangolo2.getPerimetro();
        int int6 = rettangolo2.getPerimetro();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        figure.Rettangolo rettangolo2 = new figure.Rettangolo((int) '4', 400);
        double double3 = rettangolo2.getArea();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        figure.Rettangolo rettangolo2 = new figure.Rettangolo((int) ' ', (int) (byte) 10);
        int int3 = rettangolo2.getPerimetro();
        int int4 = rettangolo2.getPerimetro();
        int int5 = rettangolo2.getPerimetro();
        double double6 = rettangolo2.getArea();
        int int7 = rettangolo2.getPerimetro();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 128 + "'", int3 == 128);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 128 + "'", int4 == 128);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 128 + "'", int5 == 128);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 128 + "'", int7 == 128);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        figure.Rettangolo rettangolo2 = new figure.Rettangolo(100, (int) (short) -1);
        double double3 = rettangolo2.getArea();
        int int4 = rettangolo2.getPerimetro();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 400 + "'", int4 == 400);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        figure.Rettangolo rettangolo2 = new figure.Rettangolo((int) (byte) 0, (int) ' ');
        double double3 = rettangolo2.getArea();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        figure.Rettangolo rettangolo2 = new figure.Rettangolo(100, (int) (short) -1);
        int int3 = rettangolo2.getPerimetro();
        int int4 = rettangolo2.getPerimetro();
        int int5 = rettangolo2.getPerimetro();
        int int6 = rettangolo2.getPerimetro();
        java.lang.Class<?> wildcardClass7 = rettangolo2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 400 + "'", int3 == 400);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 400 + "'", int4 == 400);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 400 + "'", int5 == 400);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 400 + "'", int6 == 400);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        figure.Rettangolo rettangolo2 = new figure.Rettangolo(128, (int) (short) 1);
        double double3 = rettangolo2.getArea();
        double double4 = rettangolo2.getArea();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        figure.Rettangolo rettangolo2 = new figure.Rettangolo(100, (int) (short) -1);
        int int3 = rettangolo2.getPerimetro();
        int int4 = rettangolo2.getPerimetro();
        int int5 = rettangolo2.getPerimetro();
        int int6 = rettangolo2.getPerimetro();
        int int7 = rettangolo2.getPerimetro();
        int int8 = rettangolo2.getPerimetro();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 400 + "'", int3 == 400);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 400 + "'", int4 == 400);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 400 + "'", int5 == 400);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 400 + "'", int6 == 400);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 400 + "'", int7 == 400);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 400 + "'", int8 == 400);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        figure.Rettangolo rettangolo2 = new figure.Rettangolo((int) (byte) 0, (int) (byte) -1);
        double double3 = rettangolo2.getArea();
        double double4 = rettangolo2.getArea();
        int int5 = rettangolo2.getPerimetro();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        figure.Rettangolo rettangolo2 = new figure.Rettangolo((int) (short) 0, (int) '#');
        double double3 = rettangolo2.getArea();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        figure.Rettangolo rettangolo2 = new figure.Rettangolo((int) (byte) 100, 512);
        int int3 = rettangolo2.getPerimetro();
        double double4 = rettangolo2.getArea();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 400 + "'", int3 == 400);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        figure.Rettangolo rettangolo2 = new figure.Rettangolo((int) (byte) 0, (int) (byte) -1);
        int int3 = rettangolo2.getPerimetro();
        int int4 = rettangolo2.getPerimetro();
        java.lang.Class<?> wildcardClass5 = rettangolo2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        figure.Rettangolo rettangolo2 = new figure.Rettangolo((int) (byte) 100, 512);
        double double3 = rettangolo2.getArea();
        int int4 = rettangolo2.getPerimetro();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 400 + "'", int4 == 400);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        figure.Rettangolo rettangolo2 = new figure.Rettangolo((int) (byte) 0, (int) (byte) -1);
        int int3 = rettangolo2.getPerimetro();
        int int4 = rettangolo2.getPerimetro();
        double double5 = rettangolo2.getArea();
        int int6 = rettangolo2.getPerimetro();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        figure.Rettangolo rettangolo2 = new figure.Rettangolo((int) (byte) 0, (int) (byte) -1);
        double double3 = rettangolo2.getArea();
        double double4 = rettangolo2.getArea();
        double double5 = rettangolo2.getArea();
        double double6 = rettangolo2.getArea();
        int int7 = rettangolo2.getPerimetro();
        int int8 = rettangolo2.getPerimetro();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        figure.Rettangolo rettangolo2 = new figure.Rettangolo((int) ' ', (int) (byte) 10);
        int int3 = rettangolo2.getPerimetro();
        int int4 = rettangolo2.getPerimetro();
        java.lang.Class<?> wildcardClass5 = rettangolo2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 128 + "'", int3 == 128);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 128 + "'", int4 == 128);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        figure.Rettangolo rettangolo2 = new figure.Rettangolo((int) (short) 10, (int) (byte) 0);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        figure.Rettangolo rettangolo2 = new figure.Rettangolo(100, (int) (short) -1);
        int int3 = rettangolo2.getPerimetro();
        int int4 = rettangolo2.getPerimetro();
        double double5 = rettangolo2.getArea();
        double double6 = rettangolo2.getArea();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 400 + "'", int3 == 400);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 400 + "'", int4 == 400);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        figure.Rettangolo rettangolo2 = new figure.Rettangolo((int) (byte) 100, 512);
        int int3 = rettangolo2.getPerimetro();
        java.lang.Class<?> wildcardClass4 = rettangolo2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 400 + "'", int3 == 400);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        figure.Rettangolo rettangolo2 = new figure.Rettangolo(128, (int) (short) 1);
        int int3 = rettangolo2.getPerimetro();
        double double4 = rettangolo2.getArea();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 512 + "'", int3 == 512);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        figure.Rettangolo rettangolo2 = new figure.Rettangolo((int) (byte) 1, 1);
        double double3 = rettangolo2.getArea();
        double double4 = rettangolo2.getArea();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        figure.Rettangolo rettangolo2 = new figure.Rettangolo((int) (byte) 1, 100);
        java.lang.Class<?> wildcardClass3 = rettangolo2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        figure.Rettangolo rettangolo2 = new figure.Rettangolo(400, 10);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        figure.Rettangolo rettangolo2 = new figure.Rettangolo((int) 'a', 128);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        figure.Rettangolo rettangolo2 = new figure.Rettangolo((int) (short) 1, (int) (short) 0);
        double double3 = rettangolo2.getArea();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }
}

