package randoop;

import junit.framework.*;

public class RandoopTest1 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test1");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert(0, 1);
    boolean var9 = var0.isFull((-1));
    boolean var10 = var0.isFull();
    boolean var13 = var0.insert(1, 1);
    boolean var15 = var0.isFull(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test2");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert(0, 1);
    boolean var8 = var0.isFull();
    boolean var9 = var0.isFull();
    boolean var10 = var0.isFull();
    boolean var12 = var0.isFull(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test3");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull((-1));
    boolean var8 = var0.isFull(1);
    boolean var11 = var0.insert(10, (-1));
    boolean var13 = var0.isFull(100);
    boolean var15 = var0.isFull(10);
    boolean var18 = var0.insert(0, 0);
    boolean var19 = var0.isFull();
    boolean var20 = var0.isFull();
    boolean var21 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test4");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert((-1), 1);
    boolean var8 = var0.isFull();
    boolean var11 = var0.insert(100, 0);
    boolean var14 = var0.insert(100, 1);
    boolean var15 = var0.isFull();
    boolean var18 = var0.insert(100, 0);
    boolean var21 = var0.insert((-1), 100);
    boolean var22 = var0.isFull();
    boolean var25 = var0.insert(100, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test5");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull((-1));
    boolean var8 = var0.isFull(1);
    boolean var11 = var0.insert(10, (-1));
    boolean var14 = var0.insert(100, (-1));
    boolean var15 = var0.isFull();
    boolean var17 = var0.isFull(0);
    boolean var18 = var0.isFull();
    boolean var21 = var0.insert(1, (-1));
    boolean var22 = var0.isFull();
    boolean var24 = var0.isFull(1);
    boolean var25 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test6");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var6 = var0.insert(0, 100);
    boolean var8 = var0.isFull(0);
    boolean var11 = var0.insert((-1), 1);
    boolean var12 = var0.isFull();
    boolean var15 = var0.insert(0, 100);
    boolean var17 = var0.isFull(0);
    boolean var18 = var0.isFull();
    boolean var21 = var0.insert(100, 10);
    boolean var24 = var0.insert(10, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test7");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var6 = var0.insert(1, 100);
    boolean var8 = var0.isFull(0);
    boolean var11 = var0.insert(100, 100);
    boolean var13 = var0.isFull(100);
    boolean var14 = var0.isFull();
    boolean var17 = var0.insert(0, (-1));
    boolean var19 = var0.isFull(1);
    boolean var21 = var0.isFull(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test8");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var5 = var0.insert(10, 0);
    boolean var6 = var0.isFull();
    boolean var9 = var0.insert(1, 10);
    boolean var12 = var0.insert(100, 100);
    boolean var15 = var0.insert(100, (-1));
    boolean var18 = var0.insert(10, 1);
    boolean var21 = var0.insert((-1), 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test9");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(100);
    boolean var6 = var0.isFull();
    boolean var8 = var0.isFull(0);
    boolean var9 = var0.isFull();
    boolean var10 = var0.isFull();
    boolean var11 = var0.isFull();
    boolean var12 = var0.isFull();
    boolean var15 = var0.insert((-1), (-1));
    boolean var17 = var0.isFull(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test10");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(0);
    boolean var7 = var0.isFull((-1));
    boolean var10 = var0.insert(10, 1);
    boolean var13 = var0.insert(100, 10);
    boolean var15 = var0.isFull(100);
    boolean var16 = var0.isFull();
    boolean var18 = var0.isFull(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test11");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var6 = var0.insert(1, 100);
    boolean var9 = var0.insert(100, (-1));
    boolean var11 = var0.isFull(1);
    boolean var12 = var0.isFull();
    boolean var13 = var0.isFull();
    boolean var14 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test12");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 10);
    boolean var5 = var0.isFull(1);
    boolean var8 = var0.insert(0, 100);
    boolean var11 = var0.insert(10, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test13");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert((-1), 1);
    boolean var9 = var0.isFull(0);
    boolean var12 = var0.insert(100, 10);
    boolean var13 = var0.isFull();
    boolean var16 = var0.insert((-1), 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test14");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert(0, 10);
    boolean var8 = var0.isFull();
    boolean var10 = var0.isFull(1);
    boolean var12 = var0.isFull(100);
    boolean var14 = var0.isFull(10);
    boolean var16 = var0.isFull(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test15");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(0);
    boolean var7 = var0.isFull(10);
    boolean var10 = var0.insert(1, 1);
    boolean var12 = var0.isFull(0);
    boolean var14 = var0.isFull(1);
    boolean var16 = var0.isFull(0);
    boolean var17 = var0.isFull();
    boolean var20 = var0.insert(10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test16");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(0);
    boolean var7 = var0.isFull(10);
    boolean var10 = var0.insert(1, 1);
    boolean var12 = var0.isFull(0);
    boolean var15 = var0.insert(0, 100);
    boolean var18 = var0.insert(10, 100);
    boolean var20 = var0.isFull(100);
    boolean var22 = var0.isFull(100);
    boolean var25 = var0.insert((-1), 10);
    boolean var28 = var0.insert(0, 100);
    boolean var31 = var0.insert(1, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test17");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull((-1));
    boolean var8 = var0.isFull(1);
    boolean var11 = var0.insert(10, (-1));
    boolean var14 = var0.insert(100, (-1));
    boolean var16 = var0.isFull(1);
    boolean var17 = var0.isFull();
    boolean var20 = var0.insert((-1), 100);
    boolean var22 = var0.isFull(100);
    boolean var25 = var0.insert(0, (-1));
    boolean var28 = var0.insert(0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test18");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var5 = var0.isFull();
    boolean var7 = var0.isFull((-1));
    boolean var9 = var0.isFull(1);
    boolean var11 = var0.isFull(10);
    boolean var13 = var0.isFull(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test19");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(100, 1);
    boolean var4 = var0.isFull();
    boolean var6 = var0.isFull(0);
    boolean var9 = var0.insert(0, 0);
    boolean var10 = var0.isFull();
    boolean var13 = var0.insert(10, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test20");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(100);
    boolean var6 = var0.isFull();
    boolean var8 = var0.isFull(0);
    boolean var9 = var0.isFull();
    boolean var10 = var0.isFull();
    boolean var11 = var0.isFull();
    boolean var12 = var0.isFull();
    boolean var15 = var0.insert(10, (-1));
    boolean var18 = var0.insert(0, 0);
    boolean var19 = var0.isFull();
    boolean var20 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test21");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull((-1));
    boolean var8 = var0.isFull(1);
    boolean var11 = var0.insert(10, (-1));
    boolean var14 = var0.insert(100, (-1));
    boolean var17 = var0.insert((-1), 0);
    boolean var20 = var0.insert(10, 1);
    boolean var23 = var0.insert(0, (-1));
    boolean var26 = var0.insert(100, 0);
    boolean var27 = var0.isFull();
    boolean var30 = var0.insert(1, 100);
    boolean var32 = var0.isFull(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test22");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test23");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(100);
    boolean var8 = var0.insert(0, 1);
    boolean var9 = var0.isFull();
    boolean var10 = var0.isFull();
    boolean var12 = var0.isFull(0);
    boolean var13 = var0.isFull();
    boolean var14 = var0.isFull();
    boolean var15 = var0.isFull();
    boolean var16 = var0.isFull();
    boolean var17 = var0.isFull();
    boolean var18 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test24");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var3 = var0.isFull();
    boolean var5 = var0.isFull((-1));
    boolean var7 = var0.isFull(1);
    boolean var8 = var0.isFull();
    boolean var10 = var0.isFull(1);
    boolean var13 = var0.insert((-1), 1);
    boolean var15 = var0.isFull(0);
    boolean var17 = var0.isFull(1);
    boolean var20 = var0.insert(100, 0);
    boolean var23 = var0.insert((-1), 10);
    boolean var26 = var0.insert(1, 0);
    boolean var27 = var0.isFull();
    boolean var28 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test25");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var6 = var0.insert(1, 10);
    boolean var9 = var0.insert(0, 0);
    boolean var11 = var0.isFull(0);
    boolean var12 = var0.isFull();
    boolean var15 = var0.insert(1, 1);
    boolean var16 = var0.isFull();
    boolean var18 = var0.isFull(100);
    boolean var21 = var0.insert(0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test26");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull((-1));
    boolean var8 = var0.isFull(1);
    boolean var11 = var0.insert(10, (-1));
    boolean var13 = var0.isFull(100);
    boolean var14 = var0.isFull();
    boolean var15 = var0.isFull();
    boolean var18 = var0.insert(100, (-1));
    boolean var19 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test27");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var5 = var0.isFull();
    boolean var8 = var0.insert(1, 10);
    boolean var11 = var0.insert(100, (-1));
    boolean var12 = var0.isFull();
    boolean var13 = var0.isFull();
    boolean var16 = var0.insert(1, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test28");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var3 = var0.isFull();
    boolean var6 = var0.insert(1, 1);
    boolean var7 = var0.isFull();
    boolean var10 = var0.insert(0, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test29");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull((-1));
    boolean var8 = var0.isFull(1);
    boolean var11 = var0.insert(10, (-1));
    boolean var13 = var0.isFull(100);
    boolean var15 = var0.isFull(10);
    boolean var17 = var0.isFull(1);
    boolean var20 = var0.insert(10, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test30");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(100);
    boolean var6 = var0.isFull();
    boolean var8 = var0.isFull(10);
    boolean var9 = var0.isFull();
    boolean var11 = var0.isFull(100);
    boolean var12 = var0.isFull();
    boolean var14 = var0.isFull(0);
    boolean var15 = var0.isFull();
    boolean var16 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test31");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var6 = var0.insert(1, 10);
    boolean var9 = var0.insert(0, 0);
    boolean var11 = var0.isFull(0);
    boolean var12 = var0.isFull();
    boolean var15 = var0.insert(1, 1);
    boolean var16 = var0.isFull();
    boolean var18 = var0.isFull(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test32");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert((-1), 1);
    boolean var9 = var0.isFull(0);
    boolean var11 = var0.isFull(0);
    boolean var13 = var0.isFull(1);
    boolean var14 = var0.isFull();
    boolean var15 = var0.isFull();
    boolean var17 = var0.isFull(100);
    boolean var20 = var0.insert(0, 100);
    boolean var21 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test33");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert((-1), 1);
    boolean var9 = var0.isFull((-1));
    boolean var11 = var0.isFull(1);
    boolean var13 = var0.isFull(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test34");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert(0, 1);
    boolean var8 = var0.isFull();
    boolean var9 = var0.isFull();
    boolean var10 = var0.isFull();
    boolean var13 = var0.insert(1, 1);
    boolean var15 = var0.isFull(10);
    boolean var18 = var0.insert(10, 0);
    boolean var21 = var0.insert((-1), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test35");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var6 = var0.insert(1, 100);
    boolean var8 = var0.isFull(0);
    boolean var11 = var0.insert(100, 100);
    boolean var14 = var0.insert(1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test36");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert((-1), 1);
    boolean var9 = var0.isFull(0);
    boolean var11 = var0.isFull(0);
    boolean var12 = var0.isFull();
    boolean var13 = var0.isFull();
    boolean var16 = var0.insert(100, 10);
    boolean var19 = var0.insert(10, 0);
    boolean var21 = var0.isFull(0);
    boolean var23 = var0.isFull(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test37");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull((-1));
    boolean var8 = var0.isFull(1);
    boolean var9 = var0.isFull();
    boolean var11 = var0.isFull((-1));
    boolean var14 = var0.insert(100, (-1));
    boolean var16 = var0.isFull(1);
    boolean var19 = var0.insert(100, 100);
    boolean var20 = var0.isFull();
    boolean var23 = var0.insert(10, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test38");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var5 = var0.isFull();
    boolean var7 = var0.isFull(0);
    boolean var10 = var0.insert(100, 1);
    boolean var13 = var0.insert(0, 1);
    boolean var15 = var0.isFull(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test39");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert(0, 1);
    boolean var10 = var0.insert(10, (-1));
    boolean var12 = var0.isFull(1);
    boolean var15 = var0.insert(1, 10);
    boolean var18 = var0.insert(10, 0);
    boolean var19 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test40");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(0);
    boolean var7 = var0.isFull((-1));
    boolean var9 = var0.isFull(100);
    boolean var10 = var0.isFull();
    boolean var12 = var0.isFull((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test41");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert(0, 1);
    boolean var10 = var0.insert(10, (-1));
    boolean var12 = var0.isFull(1);
    boolean var14 = var0.isFull(0);
    boolean var17 = var0.insert(0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test42");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert(0, 10);
    boolean var8 = var0.isFull();
    boolean var10 = var0.isFull(1);
    boolean var12 = var0.isFull(100);
    boolean var13 = var0.isFull();
    boolean var15 = var0.isFull(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test43");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(100, 1);
    boolean var6 = var0.insert(0, 0);
    boolean var9 = var0.insert(100, 0);
    boolean var11 = var0.isFull(10);
    boolean var13 = var0.isFull((-1));
    boolean var14 = var0.isFull();
    boolean var16 = var0.isFull(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test44");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert((-1), 1);
    boolean var8 = var0.isFull();
    boolean var11 = var0.insert(100, 0);
    boolean var14 = var0.insert(100, 1);
    boolean var15 = var0.isFull();
    boolean var17 = var0.isFull(100);
    boolean var18 = var0.isFull();
    boolean var19 = var0.isFull();
    boolean var21 = var0.isFull(1);
    boolean var22 = var0.isFull();
    boolean var23 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test45");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var6 = var0.insert(0, 100);
    boolean var8 = var0.isFull(0);
    boolean var11 = var0.insert(100, 10);
    boolean var13 = var0.isFull(0);
    boolean var14 = var0.isFull();
    boolean var15 = var0.isFull();
    boolean var17 = var0.isFull(0);
    boolean var18 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test46");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(0);
    boolean var6 = var0.isFull();
    boolean var8 = var0.isFull(100);
    boolean var10 = var0.isFull(100);
    boolean var13 = var0.insert(0, (-1));
    boolean var16 = var0.insert(0, 10);
    boolean var18 = var0.isFull(100);
    boolean var21 = var0.insert(100, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test47");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert((-1), 1);
    boolean var9 = var0.isFull(0);
    boolean var12 = var0.insert(1, 1);
    boolean var15 = var0.insert(100, 0);
    boolean var16 = var0.isFull();
    boolean var17 = var0.isFull();
    boolean var18 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test48");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var6 = var0.insert(1, 100);
    boolean var9 = var0.insert((-1), 100);
    boolean var12 = var0.insert(100, 1);
    boolean var13 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test49");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(100);
    boolean var6 = var0.isFull();
    boolean var8 = var0.isFull(10);
    boolean var9 = var0.isFull();
    boolean var12 = var0.insert(1, 100);
    boolean var14 = var0.isFull((-1));
    boolean var15 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test50");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var6 = var0.insert(0, 100);
    boolean var8 = var0.isFull(100);
    boolean var11 = var0.insert(1, 100);
    boolean var12 = var0.isFull();
    boolean var14 = var0.isFull(10);
    boolean var15 = var0.isFull();
    boolean var17 = var0.isFull((-1));
    boolean var20 = var0.insert(0, 0);
    boolean var21 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test51");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(100, 1);
    boolean var6 = var0.insert(0, 0);
    boolean var9 = var0.insert(100, 0);
    boolean var10 = var0.isFull();
    boolean var11 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test52");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(100, 1);
    boolean var4 = var0.isFull();
    boolean var6 = var0.isFull(0);
    boolean var8 = var0.isFull(100);
    boolean var10 = var0.isFull(10);
    boolean var11 = var0.isFull();
    boolean var14 = var0.insert(10, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test53");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert((-1), 1);
    boolean var8 = var0.isFull();
    boolean var11 = var0.insert(100, 0);
    boolean var13 = var0.isFull(10);
    boolean var16 = var0.insert(1, (-1));
    boolean var17 = var0.isFull();
    boolean var20 = var0.insert(0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test54");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var6 = var0.insert(0, 100);
    boolean var8 = var0.isFull(0);
    boolean var11 = var0.insert(100, 100);
    boolean var12 = var0.isFull();
    boolean var13 = var0.isFull();
    boolean var15 = var0.isFull(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test55");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert(0, 10);
    boolean var10 = var0.insert(100, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test56");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var5 = var0.isFull();
    boolean var8 = var0.insert(1, 10);
    boolean var10 = var0.isFull((-1));
    boolean var11 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test57");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert((-1), 1);
    boolean var8 = var0.isFull();
    boolean var11 = var0.insert(100, 0);
    boolean var14 = var0.insert(100, 1);
    boolean var15 = var0.isFull();
    boolean var18 = var0.insert(100, 0);
    boolean var19 = var0.isFull();
    boolean var20 = var0.isFull();
    boolean var21 = var0.isFull();
    boolean var24 = var0.insert(100, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test58");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var6 = var0.insert(0, 100);
    boolean var8 = var0.isFull((-1));
    boolean var9 = var0.isFull();
    boolean var12 = var0.insert(100, (-1));
    boolean var15 = var0.insert(1, (-1));
    boolean var18 = var0.insert(10, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test59");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull((-1));
    boolean var7 = var0.isFull();
    boolean var10 = var0.insert(1, 10);
    boolean var11 = var0.isFull();
    boolean var12 = var0.isFull();
    boolean var15 = var0.insert(10, 100);
    boolean var17 = var0.isFull(1);
    boolean var18 = var0.isFull();
    boolean var19 = var0.isFull();
    boolean var20 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test60");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(100);
    boolean var8 = var0.insert((-1), (-1));
    boolean var9 = var0.isFull();
    boolean var11 = var0.isFull(1);
    boolean var13 = var0.isFull(10);
    boolean var16 = var0.insert(100, 100);
    boolean var18 = var0.isFull(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test61");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull((-1));
    boolean var8 = var0.isFull(1);
    boolean var11 = var0.insert(10, (-1));
    boolean var13 = var0.isFull(100);
    boolean var14 = var0.isFull();
    boolean var15 = var0.isFull();
    boolean var17 = var0.isFull(10);
    boolean var20 = var0.insert(100, 1);
    boolean var22 = var0.isFull((-1));
    boolean var23 = var0.isFull();
    boolean var24 = var0.isFull();
    boolean var27 = var0.insert(100, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test62");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(0);
    boolean var7 = var0.isFull(10);
    boolean var10 = var0.insert(1, 1);
    boolean var12 = var0.isFull(0);
    boolean var15 = var0.insert((-1), 100);
    boolean var16 = var0.isFull();
    boolean var19 = var0.insert(10, 1);
    boolean var21 = var0.isFull(1);
    boolean var22 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test63");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(0);
    boolean var8 = var0.insert(10, 10);
    boolean var11 = var0.insert(100, 1);
    boolean var12 = var0.isFull();
    boolean var15 = var0.insert(0, 10);
    boolean var17 = var0.isFull(1);
    boolean var18 = var0.isFull();
    boolean var21 = var0.insert(0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test64");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var5 = var0.insert(10, 0);
    boolean var7 = var0.isFull((-1));
    boolean var10 = var0.insert((-1), (-1));
    boolean var13 = var0.insert(1, 1);
    boolean var16 = var0.insert(100, 0);
    boolean var18 = var0.isFull(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test65");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(100);
    boolean var8 = var0.insert(0, 1);
    boolean var9 = var0.isFull();
    boolean var10 = var0.isFull();
    boolean var12 = var0.isFull(0);
    boolean var15 = var0.insert(10, 1);
    boolean var18 = var0.insert((-1), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test66");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(100);
    boolean var6 = var0.isFull();
    boolean var8 = var0.isFull(0);
    boolean var9 = var0.isFull();
    boolean var10 = var0.isFull();
    boolean var11 = var0.isFull();
    boolean var12 = var0.isFull();
    boolean var15 = var0.insert(10, (-1));
    boolean var18 = var0.insert(0, 0);
    boolean var19 = var0.isFull();
    boolean var21 = var0.isFull((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test67");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var6 = var0.insert(0, 100);
    boolean var7 = var0.isFull();
    boolean var10 = var0.insert(0, 1);
    boolean var11 = var0.isFull();
    boolean var13 = var0.isFull((-1));
    boolean var15 = var0.isFull(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test68");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert((-1), 1);
    boolean var9 = var0.isFull(0);
    boolean var11 = var0.isFull(0);
    boolean var13 = var0.isFull(1);
    boolean var14 = var0.isFull();
    boolean var16 = var0.isFull(0);
    boolean var18 = var0.isFull(10);
    boolean var20 = var0.isFull(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test69");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var6 = var0.insert(1, 100);
    boolean var8 = var0.isFull(0);
    boolean var11 = var0.insert(100, 100);
    boolean var13 = var0.isFull(100);
    boolean var14 = var0.isFull();
    boolean var15 = var0.isFull();
    boolean var18 = var0.insert(100, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test70");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(0);
    boolean var8 = var0.insert(10, 10);
    boolean var11 = var0.insert(100, 1);
    boolean var12 = var0.isFull();
    boolean var15 = var0.insert(100, 1);
    boolean var17 = var0.isFull(0);
    boolean var18 = var0.isFull();
    boolean var21 = var0.insert((-1), (-1));
    boolean var24 = var0.insert((-1), 100);
    boolean var27 = var0.insert((-1), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test71");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var6 = var0.insert(0, 100);
    boolean var8 = var0.isFull((-1));
    boolean var10 = var0.isFull((-1));
    boolean var12 = var0.isFull((-1));
    boolean var14 = var0.isFull(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test72");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert(100, 1);
    boolean var9 = var0.isFull(10);
    boolean var12 = var0.insert(100, 100);
    boolean var14 = var0.isFull(10);
    boolean var17 = var0.insert(100, (-1));
    boolean var19 = var0.isFull(1);
    boolean var21 = var0.isFull((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test73");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(100);
    boolean var6 = var0.isFull();
    boolean var8 = var0.isFull(1);
    boolean var9 = var0.isFull();
    boolean var12 = var0.insert(100, 10);
    boolean var14 = var0.isFull(1);
    boolean var17 = var0.insert(10, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test74");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(1);
    boolean var8 = var0.insert(0, 0);
    boolean var11 = var0.insert((-1), 100);
    boolean var14 = var0.insert((-1), 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test75");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull(10);
    boolean var8 = var0.isFull((-1));
    boolean var10 = var0.isFull(1);
    boolean var12 = var0.isFull(1);
    boolean var15 = var0.insert(1, 100);
    boolean var18 = var0.insert(0, (-1));
    boolean var20 = var0.isFull(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test76");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(0);
    boolean var8 = var0.insert(10, 10);
    boolean var11 = var0.insert(100, 1);
    boolean var12 = var0.isFull();
    boolean var15 = var0.insert(10, 1);
    boolean var16 = var0.isFull();
    boolean var19 = var0.insert(0, (-1));
    boolean var21 = var0.isFull((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test77");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var6 = var0.insert(1, 100);
    boolean var9 = var0.insert((-1), 100);
    boolean var12 = var0.insert(100, 1);
    boolean var15 = var0.insert(10, (-1));
    boolean var16 = var0.isFull();
    boolean var17 = var0.isFull();
    boolean var18 = var0.isFull();
    boolean var20 = var0.isFull(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);

  }

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test78");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 10);
    boolean var5 = var0.isFull(1);
    boolean var8 = var0.insert(0, 100);
    boolean var10 = var0.isFull(1);
    boolean var12 = var0.isFull((-1));
    boolean var13 = var0.isFull();
    boolean var16 = var0.insert((-1), 0);
    boolean var18 = var0.isFull((-1));
    boolean var19 = var0.isFull();
    boolean var22 = var0.insert(0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test79");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(100);
    boolean var6 = var0.isFull();
    boolean var8 = var0.isFull(0);
    boolean var9 = var0.isFull();
    boolean var10 = var0.isFull();
    boolean var11 = var0.isFull();
    boolean var12 = var0.isFull();
    boolean var15 = var0.insert((-1), (-1));
    boolean var18 = var0.insert(1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test80");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(0);
    boolean var7 = var0.isFull((-1));
    boolean var8 = var0.isFull();
    boolean var10 = var0.isFull((-1));
    boolean var12 = var0.isFull(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test81");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert(0, 1);
    boolean var8 = var0.isFull();
    boolean var9 = var0.isFull();
    boolean var10 = var0.isFull();
    boolean var12 = var0.isFull(0);
    boolean var15 = var0.insert(100, 10);
    boolean var16 = var0.isFull();
    boolean var17 = var0.isFull();
    boolean var18 = var0.isFull();
    boolean var20 = var0.isFull((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);

  }

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test82");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(0);
    boolean var8 = var0.insert(10, 10);
    boolean var11 = var0.insert(100, 1);
    boolean var12 = var0.isFull();
    boolean var15 = var0.insert(100, 0);
    boolean var16 = var0.isFull();
    boolean var19 = var0.insert((-1), 1);
    boolean var21 = var0.isFull(10);
    boolean var23 = var0.isFull(100);
    boolean var25 = var0.isFull(0);
    boolean var26 = var0.isFull();
    boolean var28 = var0.isFull(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test83");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull((-1));
    boolean var8 = var0.isFull(1);
    boolean var11 = var0.insert(10, (-1));
    boolean var13 = var0.isFull(100);
    boolean var14 = var0.isFull();
    boolean var15 = var0.isFull();
    boolean var17 = var0.isFull(10);
    boolean var19 = var0.isFull((-1));
    boolean var20 = var0.isFull();
    boolean var23 = var0.insert(10, 1);
    boolean var24 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test84");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull((-1));
    boolean var8 = var0.isFull(1);
    boolean var11 = var0.insert(10, (-1));
    boolean var14 = var0.insert(100, (-1));
    boolean var15 = var0.isFull();
    boolean var17 = var0.isFull(0);
    boolean var18 = var0.isFull();
    boolean var21 = var0.insert(1, (-1));
    boolean var22 = var0.isFull();
    boolean var24 = var0.isFull(1);
    boolean var27 = var0.insert(100, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test85");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(1);
    boolean var6 = var0.isFull();
    boolean var8 = var0.isFull(100);
    boolean var11 = var0.insert((-1), 0);
    boolean var14 = var0.insert(0, 1);
    boolean var15 = var0.isFull();
    boolean var18 = var0.insert(1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test86");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(0, (-1));
    boolean var6 = var0.insert(0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test87");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull((-1));
    boolean var8 = var0.isFull(1);
    boolean var11 = var0.insert(10, (-1));
    boolean var14 = var0.insert(100, (-1));
    boolean var16 = var0.isFull(1);
    boolean var17 = var0.isFull();
    boolean var18 = var0.isFull();
    boolean var20 = var0.isFull(1);
    boolean var23 = var0.insert(0, 0);
    boolean var26 = var0.insert(100, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test88");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull((-1));
    boolean var8 = var0.isFull(1);
    boolean var11 = var0.insert(10, (-1));
    boolean var14 = var0.insert(100, (-1));
    boolean var16 = var0.isFull(10);
    boolean var17 = var0.isFull();
    boolean var19 = var0.isFull(10);
    boolean var21 = var0.isFull(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test89");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var3 = var0.isFull();
    boolean var5 = var0.isFull((-1));
    boolean var7 = var0.isFull(1);
    boolean var8 = var0.isFull();
    boolean var10 = var0.isFull(1);
    boolean var13 = var0.insert((-1), 1);
    boolean var15 = var0.isFull(0);
    boolean var17 = var0.isFull(1);
    boolean var20 = var0.insert(100, 0);
    boolean var23 = var0.insert((-1), 10);
    boolean var26 = var0.insert(1, 0);
    boolean var29 = var0.insert(10, (-1));
    boolean var32 = var0.insert((-1), 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test90");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull((-1));
    boolean var8 = var0.isFull(1);
    boolean var11 = var0.insert(10, (-1));
    boolean var14 = var0.insert(100, (-1));
    boolean var15 = var0.isFull();
    boolean var18 = var0.insert(0, 10);
    boolean var19 = var0.isFull();
    boolean var22 = var0.insert(100, (-1));
    boolean var25 = var0.insert(1, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test91");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(100, 1);
    boolean var4 = var0.isFull();
    boolean var5 = var0.isFull();
    boolean var6 = var0.isFull();
    boolean var9 = var0.insert(0, (-1));
    boolean var12 = var0.insert(0, 100);
    boolean var15 = var0.insert((-1), 1);
    boolean var18 = var0.insert(0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test92");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(0);
    boolean var7 = var0.isFull(10);
    boolean var10 = var0.insert((-1), 1);
    boolean var11 = var0.isFull();
    boolean var13 = var0.isFull(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test93");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull((-1));
    boolean var8 = var0.isFull(1);
    boolean var11 = var0.insert(10, (-1));
    boolean var13 = var0.isFull(100);
    boolean var15 = var0.isFull(1);
    boolean var17 = var0.isFull(0);
    boolean var19 = var0.isFull(0);
    boolean var20 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test94");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var6 = var0.insert(0, 100);
    boolean var8 = var0.isFull((-1));
    boolean var10 = var0.isFull(0);
    boolean var13 = var0.insert(100, 1);
    boolean var15 = var0.isFull(1);
    boolean var16 = var0.isFull();
    boolean var19 = var0.insert(100, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test95");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert(100, 1);
    boolean var9 = var0.isFull(10);
    boolean var11 = var0.isFull(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test96");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var5 = var0.insert(10, 0);
    boolean var6 = var0.isFull();
    boolean var7 = var0.isFull();
    boolean var10 = var0.insert(1, 10);
    boolean var13 = var0.insert(0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test97");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var6 = var0.insert(0, 100);
    boolean var8 = var0.isFull(0);
    boolean var11 = var0.insert(100, 100);
    boolean var14 = var0.insert(10, 0);
    boolean var16 = var0.isFull(1);
    boolean var17 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test98");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(0);
    boolean var8 = var0.insert(10, 10);
    boolean var11 = var0.insert(100, 1);
    boolean var12 = var0.isFull();
    boolean var15 = var0.insert(100, 1);
    boolean var17 = var0.isFull(0);
    boolean var18 = var0.isFull();
    boolean var21 = var0.insert((-1), (-1));
    boolean var24 = var0.insert((-1), 100);
    boolean var26 = var0.isFull((-1));
    boolean var27 = var0.isFull();
    boolean var30 = var0.insert((-1), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);

  }

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test99");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull((-1));
    boolean var8 = var0.isFull(1);
    boolean var11 = var0.insert(10, (-1));
    boolean var14 = var0.insert(100, (-1));
    boolean var15 = var0.isFull();
    boolean var18 = var0.insert(0, 10);
    boolean var21 = var0.insert(0, 10);
    boolean var23 = var0.isFull((-1));
    boolean var26 = var0.insert(100, (-1));
    boolean var29 = var0.insert(1, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test100");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(100, 1);
    boolean var5 = var0.isFull(0);
    boolean var6 = var0.isFull();
    boolean var7 = var0.isFull();
    boolean var8 = var0.isFull();
    boolean var9 = var0.isFull();
    boolean var12 = var0.insert(0, 0);
    boolean var13 = var0.isFull();
    boolean var16 = var0.insert(0, 10);
    boolean var17 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test101() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test101");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var4 = var0.isFull();
    boolean var6 = var0.isFull(1);
    boolean var7 = var0.isFull();
    boolean var10 = var0.insert(10, 100);
    boolean var13 = var0.insert((-1), (-1));
    boolean var16 = var0.insert(10, 100);
    boolean var19 = var0.insert(0, (-1));
    boolean var22 = var0.insert((-1), (-1));
    boolean var25 = var0.insert(1, 0);
    boolean var27 = var0.isFull(10);
    boolean var29 = var0.isFull(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);

  }

  public void test102() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test102");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(0);
    boolean var8 = var0.insert(10, 10);
    boolean var11 = var0.insert(100, 1);
    boolean var12 = var0.isFull();
    boolean var15 = var0.insert(100, 0);
    boolean var16 = var0.isFull();
    boolean var19 = var0.insert((-1), 1);
    boolean var20 = var0.isFull();
    boolean var23 = var0.insert(0, 100);
    boolean var26 = var0.insert(100, 100);
    boolean var28 = var0.isFull(1);
    boolean var31 = var0.insert(10, 0);
    boolean var32 = var0.isFull();
    boolean var33 = var0.isFull();
    boolean var35 = var0.isFull((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);

  }

  public void test103() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test103");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull((-1));
    boolean var8 = var0.isFull(1);
    boolean var11 = var0.insert(10, (-1));
    boolean var13 = var0.isFull(100);
    boolean var14 = var0.isFull();
    boolean var15 = var0.isFull();
    boolean var17 = var0.isFull(10);
    boolean var18 = var0.isFull();
    boolean var20 = var0.isFull(10);
    boolean var22 = var0.isFull((-1));
    boolean var24 = var0.isFull(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);

  }

  public void test104() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test104");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var6 = var0.insert(0, 100);
    boolean var9 = var0.insert((-1), 100);
    boolean var12 = var0.insert(1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test105() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test105");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert((-1), 1);
    boolean var9 = var0.isFull(0);
    boolean var11 = var0.isFull(0);
    boolean var13 = var0.isFull(0);
    boolean var14 = var0.isFull();
    boolean var17 = var0.insert(1, (-1));
    boolean var18 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test106() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test106");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var4 = var0.isFull();
    boolean var7 = var0.insert(100, 100);
    boolean var8 = var0.isFull();
    boolean var9 = var0.isFull();
    boolean var10 = var0.isFull();
    boolean var11 = var0.isFull();
    boolean var14 = var0.insert(0, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test107() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test107");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert((-1), 1);
    boolean var8 = var0.isFull();
    boolean var11 = var0.insert(100, 0);
    boolean var13 = var0.isFull(10);
    boolean var16 = var0.insert(1, (-1));
    boolean var17 = var0.isFull();
    boolean var19 = var0.isFull(1);
    boolean var22 = var0.insert(1, (-1));
    boolean var23 = var0.isFull();
    boolean var25 = var0.isFull(100);
    boolean var27 = var0.isFull((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);

  }

  public void test108() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test108");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert(0, 10);
    boolean var8 = var0.isFull();
    boolean var10 = var0.isFull(1);
    boolean var13 = var0.insert((-1), 0);
    boolean var16 = var0.insert(10, 1);
    boolean var18 = var0.isFull(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test109() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test109");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull((-1));
    boolean var8 = var0.isFull(1);
    boolean var9 = var0.isFull();
    boolean var11 = var0.isFull((-1));
    boolean var14 = var0.insert(100, (-1));
    boolean var16 = var0.isFull(1);
    boolean var18 = var0.isFull((-1));
    boolean var20 = var0.isFull(100);
    boolean var21 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test110() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test110");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull((-1));
    boolean var8 = var0.isFull(1);
    boolean var9 = var0.isFull();
    boolean var12 = var0.insert(10, 0);
    boolean var15 = var0.insert(1, 100);
    boolean var16 = var0.isFull();
    boolean var18 = var0.isFull(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test111() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test111");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(1);
    boolean var8 = var0.insert(100, 10);
    boolean var11 = var0.insert(0, 0);
    boolean var12 = var0.isFull();
    boolean var13 = var0.isFull();
    boolean var14 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test112() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test112");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull((-1));
    boolean var8 = var0.isFull(1);
    boolean var11 = var0.insert(10, (-1));
    boolean var13 = var0.isFull(100);
    boolean var14 = var0.isFull();
    boolean var15 = var0.isFull();
    boolean var17 = var0.isFull(10);
    boolean var20 = var0.insert((-1), 0);
    boolean var23 = var0.insert(100, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test113() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test113");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull((-1));
    boolean var8 = var0.isFull(1);
    boolean var11 = var0.insert(10, (-1));
    boolean var14 = var0.insert(100, (-1));
    boolean var17 = var0.insert((-1), 0);
    boolean var20 = var0.insert(10, 1);
    boolean var23 = var0.insert(0, (-1));
    boolean var26 = var0.insert(100, 0);
    boolean var27 = var0.isFull();
    boolean var29 = var0.isFull(100);
    boolean var30 = var0.isFull();
    boolean var32 = var0.isFull(100);
    boolean var34 = var0.isFull(1);
    boolean var36 = var0.isFull(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);

  }

  public void test114() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test114");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull((-1));
    boolean var8 = var0.isFull(1);
    boolean var11 = var0.insert(10, (-1));
    boolean var14 = var0.insert(100, (-1));
    boolean var16 = var0.isFull(1);
    boolean var17 = var0.isFull();
    boolean var20 = var0.insert((-1), 100);
    boolean var22 = var0.isFull(100);
    boolean var24 = var0.isFull(10);
    boolean var26 = var0.isFull((-1));
    boolean var29 = var0.insert(0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test115() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test115");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert(0, 1);
    boolean var8 = var0.isFull();
    boolean var9 = var0.isFull();
    boolean var10 = var0.isFull();
    boolean var12 = var0.isFull(0);
    boolean var15 = var0.insert(100, 10);
    boolean var17 = var0.isFull(0);
    boolean var18 = var0.isFull();
    boolean var19 = var0.isFull();
    boolean var21 = var0.isFull(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test116() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test116");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 10);
    boolean var5 = var0.isFull(1);
    boolean var8 = var0.insert(0, 100);
    boolean var10 = var0.isFull(1);
    boolean var12 = var0.isFull((-1));
    boolean var15 = var0.insert(1, (-1));
    boolean var18 = var0.insert(1, 1);
    boolean var19 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test117() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test117");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(0);
    boolean var6 = var0.isFull();
    boolean var8 = var0.isFull(100);
    boolean var10 = var0.isFull(100);
    boolean var13 = var0.insert(0, (-1));
    boolean var16 = var0.insert(0, 10);
    boolean var18 = var0.isFull(1);
    boolean var20 = var0.isFull(100);
    boolean var21 = var0.isFull();
    boolean var22 = var0.isFull();
    boolean var25 = var0.insert(100, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test118() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test118");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull((-1));
    boolean var8 = var0.isFull(1);
    boolean var11 = var0.insert(10, (-1));
    boolean var13 = var0.isFull(100);
    boolean var14 = var0.isFull();
    boolean var15 = var0.isFull();
    boolean var17 = var0.isFull(10);
    boolean var20 = var0.insert(100, 1);
    boolean var22 = var0.isFull((-1));
    boolean var23 = var0.isFull();
    boolean var24 = var0.isFull();
    boolean var25 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test119() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test119");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert((-1), 1);
    boolean var9 = var0.isFull((-1));
    boolean var11 = var0.isFull(10);
    boolean var14 = var0.insert(1, 10);
    boolean var17 = var0.insert((-1), 100);
    boolean var18 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test120() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test120");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var3 = var0.isFull();
    boolean var6 = var0.insert(10, 1);
    boolean var9 = var0.insert((-1), 100);
    boolean var11 = var0.isFull(1);
    boolean var13 = var0.isFull(100);
    boolean var15 = var0.isFull((-1));
    boolean var16 = var0.isFull();
    boolean var17 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test121() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test121");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(0);
    boolean var8 = var0.insert(10, 10);
    boolean var9 = var0.isFull();
    boolean var11 = var0.isFull((-1));
    boolean var14 = var0.insert(100, 1);
    boolean var17 = var0.insert(100, 1);
    boolean var18 = var0.isFull();
    boolean var19 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test122() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test122");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull((-1));
    boolean var8 = var0.isFull(1);
    boolean var11 = var0.insert(10, (-1));
    boolean var14 = var0.insert(100, (-1));
    boolean var17 = var0.insert((-1), 0);
    boolean var20 = var0.insert(10, 1);
    boolean var23 = var0.insert(0, (-1));
    boolean var24 = var0.isFull();
    boolean var26 = var0.isFull((-1));
    boolean var28 = var0.isFull(1);
    boolean var29 = var0.isFull();
    boolean var32 = var0.insert(10, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);

  }

  public void test123() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test123");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull((-1));
    boolean var8 = var0.isFull(1);
    boolean var9 = var0.isFull();
    boolean var10 = var0.isFull();
    boolean var13 = var0.insert(100, 1);
    boolean var16 = var0.insert(1, (-1));
    boolean var19 = var0.insert(1, 0);
    boolean var20 = var0.isFull();
    boolean var21 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test124() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test124");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var6 = var0.insert(0, 100);
    boolean var8 = var0.isFull(0);
    boolean var9 = var0.isFull();
    boolean var11 = var0.isFull((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test125() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test125");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull((-1));
    boolean var8 = var0.isFull(1);
    boolean var11 = var0.insert(10, (-1));
    boolean var14 = var0.insert(100, (-1));
    boolean var17 = var0.insert((-1), 0);
    boolean var20 = var0.insert(10, 1);
    boolean var23 = var0.insert(0, (-1));
    boolean var26 = var0.insert(100, 0);
    boolean var27 = var0.isFull();
    boolean var29 = var0.isFull(10);
    boolean var32 = var0.insert(10, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);

  }

  public void test126() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test126");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var6 = var0.insert(0, 100);
    boolean var7 = var0.isFull();
    boolean var10 = var0.insert(0, 1);
    boolean var12 = var0.isFull(100);
    boolean var15 = var0.insert((-1), 10);
    boolean var18 = var0.insert(0, 10);
    boolean var20 = var0.isFull(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test127() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test127");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert(0, 1);
    boolean var8 = var0.isFull();
    boolean var9 = var0.isFull();
    boolean var10 = var0.isFull();
    boolean var12 = var0.isFull(0);
    boolean var14 = var0.isFull(0);
    boolean var16 = var0.isFull(10);
    boolean var17 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test128() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test128");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var5 = var0.isFull();
    boolean var8 = var0.insert(1, 10);
    boolean var11 = var0.insert(0, 1);
    boolean var12 = var0.isFull();
    boolean var15 = var0.insert((-1), 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test129() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test129");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var6 = var0.insert(0, 100);
    boolean var8 = var0.isFull(100);
    boolean var10 = var0.isFull(100);
    boolean var12 = var0.isFull(1);
    boolean var15 = var0.insert((-1), 10);
    boolean var17 = var0.isFull(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);

  }

  public void test130() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test130");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert((-1), 1);
    boolean var10 = var0.insert(0, 100);
    boolean var11 = var0.isFull();
    boolean var13 = var0.isFull(100);
    boolean var14 = var0.isFull();
    boolean var17 = var0.insert(0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test131() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test131");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var3 = var0.isFull();
    boolean var6 = var0.insert(0, 10);
    boolean var7 = var0.isFull();
    boolean var9 = var0.isFull((-1));
    boolean var11 = var0.isFull((-1));
    boolean var14 = var0.insert(10, 0);
    boolean var16 = var0.isFull(100);
    boolean var18 = var0.isFull(0);
    boolean var21 = var0.insert(10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test132() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test132");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert((-1), 1);
    boolean var8 = var0.isFull();
    boolean var11 = var0.insert(100, 0);
    boolean var14 = var0.insert(100, 1);
    boolean var16 = var0.isFull(10);
    boolean var17 = var0.isFull();
    boolean var20 = var0.insert(0, 10);
    boolean var22 = var0.isFull(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test133() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test133");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var4 = var0.isFull();
    boolean var6 = var0.isFull(1);
    boolean var7 = var0.isFull();
    boolean var10 = var0.insert(10, 100);
    boolean var13 = var0.insert((-1), (-1));
    boolean var16 = var0.insert(10, 100);
    boolean var19 = var0.insert(0, (-1));
    boolean var22 = var0.insert((-1), (-1));
    boolean var23 = var0.isFull();
    boolean var26 = var0.insert(100, (-1));
    boolean var27 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test134() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test134");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var5 = var0.insert(10, 0);
    boolean var7 = var0.isFull((-1));
    boolean var10 = var0.insert((-1), (-1));
    boolean var13 = var0.insert(1, 1);
    boolean var15 = var0.isFull(1);
    boolean var17 = var0.isFull(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);

  }

  public void test135() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test135");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(100);
    boolean var6 = var0.isFull();
    boolean var8 = var0.isFull(1);
    boolean var10 = var0.isFull(1);
    boolean var12 = var0.isFull((-1));
    boolean var14 = var0.isFull(1);
    boolean var16 = var0.isFull((-1));
    boolean var18 = var0.isFull(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test136() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test136");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(100);
    boolean var8 = var0.insert((-1), (-1));
    boolean var9 = var0.isFull();
    boolean var10 = var0.isFull();
    boolean var13 = var0.insert(1, 0);
    boolean var15 = var0.isFull(0);
    boolean var17 = var0.isFull(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);

  }

  public void test137() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test137");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull((-1));
    boolean var8 = var0.isFull(1);
    boolean var11 = var0.insert(10, (-1));
    boolean var13 = var0.isFull(100);
    boolean var14 = var0.isFull();
    boolean var15 = var0.isFull();
    boolean var17 = var0.isFull(10);
    boolean var20 = var0.insert(100, 1);
    boolean var22 = var0.isFull((-1));
    boolean var23 = var0.isFull();
    boolean var24 = var0.isFull();
    boolean var27 = var0.insert(1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);

  }

  public void test138() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test138");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var3 = var0.isFull();
    boolean var5 = var0.isFull((-1));
    boolean var7 = var0.isFull(1);
    boolean var8 = var0.isFull();
    boolean var10 = var0.isFull(1);
    boolean var13 = var0.insert((-1), 1);
    boolean var15 = var0.isFull(0);
    boolean var16 = var0.isFull();
    boolean var19 = var0.insert(0, 10);
    boolean var22 = var0.insert(100, 1);
    boolean var24 = var0.isFull(100);
    boolean var25 = var0.isFull();
    boolean var27 = var0.isFull(0);
    boolean var28 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test139() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test139");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert(0, 1);
    boolean var8 = var0.isFull();
    boolean var9 = var0.isFull();
    boolean var10 = var0.isFull();
    boolean var12 = var0.isFull(0);
    boolean var13 = var0.isFull();
    boolean var15 = var0.isFull((-1));
    boolean var18 = var0.insert(100, (-1));
    boolean var20 = var0.isFull(0);
    boolean var21 = var0.isFull();
    boolean var23 = var0.isFull(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test140() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test140");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 10);
    boolean var6 = var0.insert(10, (-1));
    boolean var9 = var0.insert(0, 0);
    boolean var10 = var0.isFull();
    boolean var13 = var0.insert(1, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test141() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test141");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var6 = var0.insert(1, 100);
    boolean var9 = var0.insert((-1), 100);
    boolean var12 = var0.insert(100, 1);
    boolean var15 = var0.insert(10, (-1));
    boolean var16 = var0.isFull();
    boolean var17 = var0.isFull();
    boolean var19 = var0.isFull(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test142() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test142");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert((-1), 1);
    boolean var8 = var0.isFull();
    boolean var11 = var0.insert(100, 0);
    boolean var14 = var0.insert(100, 1);
    boolean var15 = var0.isFull();
    boolean var17 = var0.isFull(100);
    boolean var18 = var0.isFull();
    boolean var20 = var0.isFull(1);
    boolean var21 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test143() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test143");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert((-1), 1);
    boolean var8 = var0.isFull();
    boolean var10 = var0.isFull(100);
    boolean var12 = var0.isFull(0);
    boolean var14 = var0.isFull(10);
    boolean var17 = var0.insert(1, 1);
    boolean var19 = var0.isFull(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test144() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test144");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert(0, 10);
    boolean var8 = var0.isFull();
    boolean var10 = var0.isFull(1);
    boolean var13 = var0.insert((-1), 0);
    boolean var16 = var0.insert(10, 1);
    boolean var19 = var0.insert(100, 1);
    boolean var21 = var0.isFull((-1));
    boolean var24 = var0.insert(100, 1);
    boolean var26 = var0.isFull(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test145() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test145");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(0);
    boolean var8 = var0.insert(10, 10);
    boolean var11 = var0.insert(100, 1);
    boolean var12 = var0.isFull();
    boolean var15 = var0.insert(100, 1);
    boolean var17 = var0.isFull(0);
    boolean var18 = var0.isFull();
    boolean var21 = var0.insert((-1), (-1));
    boolean var24 = var0.insert((-1), 100);
    boolean var27 = var0.insert((-1), 1);
    boolean var30 = var0.insert(1, (-1));
    boolean var31 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);

  }

  public void test146() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test146");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(0);
    boolean var7 = var0.isFull(10);
    boolean var10 = var0.insert(1, 1);
    boolean var13 = var0.insert(100, 10);
    boolean var14 = var0.isFull();
    boolean var16 = var0.isFull(1);
    boolean var17 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test147() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test147");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(100);
    boolean var6 = var0.isFull();
    boolean var8 = var0.isFull(10);
    boolean var9 = var0.isFull();
    boolean var11 = var0.isFull(100);
    boolean var12 = var0.isFull();
    boolean var14 = var0.isFull(100);
    boolean var17 = var0.insert(100, 10);
    boolean var20 = var0.insert((-1), 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test148() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test148");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert((-1), 1);
    boolean var8 = var0.isFull();
    boolean var11 = var0.insert(100, 0);
    boolean var13 = var0.isFull(10);
    boolean var16 = var0.insert(1, (-1));
    boolean var19 = var0.insert(0, 1);
    boolean var22 = var0.insert((-1), 100);
    boolean var25 = var0.insert(10, 1);
    boolean var27 = var0.isFull(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test149() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test149");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull((-1));
    boolean var8 = var0.isFull(1);
    boolean var11 = var0.insert(10, (-1));
    boolean var14 = var0.insert(100, (-1));
    boolean var16 = var0.isFull(1);
    boolean var17 = var0.isFull();
    boolean var20 = var0.insert((-1), 0);
    boolean var23 = var0.insert((-1), 100);
    boolean var25 = var0.isFull(1);
    boolean var26 = var0.isFull();
    boolean var28 = var0.isFull((-1));
    boolean var30 = var0.isFull((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);

  }

  public void test150() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test150");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(0, (-1));
    boolean var5 = var0.isFull((-1));
    boolean var8 = var0.insert(100, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test151() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test151");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(0);
    boolean var7 = var0.isFull(10);
    boolean var10 = var0.insert(1, 1);
    boolean var12 = var0.isFull(0);
    boolean var15 = var0.insert(0, 100);
    boolean var18 = var0.insert(10, 100);
    boolean var20 = var0.isFull(100);
    boolean var22 = var0.isFull(100);
    boolean var25 = var0.insert((-1), 10);
    boolean var28 = var0.insert(0, 100);
    boolean var29 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test152() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test152");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull((-1));
    boolean var8 = var0.isFull(1);
    boolean var11 = var0.insert(10, (-1));
    boolean var13 = var0.isFull(100);
    boolean var14 = var0.isFull();
    boolean var15 = var0.isFull();
    boolean var18 = var0.insert((-1), 10);
    boolean var19 = var0.isFull();
    boolean var20 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test153() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test153");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(0);
    boolean var8 = var0.insert(10, 10);
    boolean var11 = var0.insert(100, 1);
    boolean var12 = var0.isFull();
    boolean var15 = var0.insert(100, 1);
    boolean var17 = var0.isFull(0);
    boolean var18 = var0.isFull();
    boolean var21 = var0.insert((-1), (-1));
    boolean var24 = var0.insert((-1), 100);
    boolean var26 = var0.isFull((-1));
    boolean var29 = var0.insert(10, 1);
    boolean var31 = var0.isFull(0);
    boolean var34 = var0.insert((-1), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);

  }

  public void test154() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test154");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert((-1), 1);
    boolean var9 = var0.isFull(0);
    boolean var11 = var0.isFull(0);
    boolean var13 = var0.isFull(1);
    boolean var14 = var0.isFull();
    boolean var15 = var0.isFull();
    boolean var17 = var0.isFull(100);
    boolean var19 = var0.isFull(0);
    boolean var20 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test155() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test155");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 10);
    boolean var4 = var0.isFull();
    boolean var7 = var0.insert(100, (-1));
    boolean var8 = var0.isFull();
    boolean var11 = var0.insert(100, 0);
    boolean var12 = var0.isFull();
    boolean var13 = var0.isFull();
    boolean var14 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test156() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test156");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull((-1));
    boolean var8 = var0.isFull(1);
    boolean var11 = var0.insert(10, (-1));
    boolean var14 = var0.insert(100, (-1));
    boolean var16 = var0.isFull(100);
    boolean var19 = var0.insert(0, 0);
    boolean var21 = var0.isFull(0);
    boolean var23 = var0.isFull(100);
    boolean var24 = var0.isFull();
    boolean var25 = var0.isFull();
    boolean var26 = var0.isFull();
    boolean var29 = var0.insert(10, 1);
    boolean var32 = var0.insert(1, (-1));
    boolean var34 = var0.isFull((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);

  }

  public void test157() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test157");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert(0, 1);
    boolean var10 = var0.insert(10, (-1));
    boolean var12 = var0.isFull(1);
    boolean var15 = var0.insert(1, 10);
    boolean var17 = var0.isFull((-1));
    boolean var19 = var0.isFull(0);
    boolean var20 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test158() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test158");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert(0, 1);
    boolean var10 = var0.insert(10, (-1));
    boolean var11 = var0.isFull();
    boolean var12 = var0.isFull();
    boolean var14 = var0.isFull(0);
    boolean var16 = var0.isFull(0);
    boolean var18 = var0.isFull((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);

  }

  public void test159() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test159");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(0);
    boolean var8 = var0.insert(10, 10);
    boolean var11 = var0.insert(100, 1);
    boolean var12 = var0.isFull();
    boolean var15 = var0.insert(0, 10);
    boolean var17 = var0.isFull((-1));
    boolean var18 = var0.isFull();
    boolean var21 = var0.insert(10, 0);
    boolean var24 = var0.insert(0, 1);
    boolean var25 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test160() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test160");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var6 = var0.insert(1, 100);
    boolean var9 = var0.insert((-1), 100);
    boolean var12 = var0.insert(100, 1);
    boolean var15 = var0.insert((-1), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test161() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test161");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull((-1));
    boolean var8 = var0.isFull(1);
    boolean var11 = var0.insert(10, (-1));
    boolean var13 = var0.isFull(100);
    boolean var14 = var0.isFull();
    boolean var15 = var0.isFull();
    boolean var17 = var0.isFull(10);
    boolean var20 = var0.insert(100, 1);
    boolean var22 = var0.isFull((-1));
    boolean var23 = var0.isFull();
    boolean var25 = var0.isFull(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test162() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test162");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var6 = var0.insert(0, 100);
    boolean var7 = var0.isFull();
    boolean var10 = var0.insert(0, 1);
    boolean var11 = var0.isFull();
    boolean var13 = var0.isFull((-1));
    boolean var16 = var0.insert(0, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);

  }

  public void test163() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test163");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull((-1));
    boolean var8 = var0.isFull(1);
    boolean var9 = var0.isFull();
    boolean var11 = var0.isFull((-1));
    boolean var14 = var0.insert((-1), 100);
    boolean var16 = var0.isFull(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test164() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test164");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull((-1));
    boolean var8 = var0.isFull(1);
    boolean var11 = var0.insert(10, (-1));
    boolean var14 = var0.insert(100, (-1));
    boolean var16 = var0.isFull(100);
    boolean var19 = var0.insert(0, 0);
    boolean var21 = var0.isFull(0);
    boolean var23 = var0.isFull(100);
    boolean var24 = var0.isFull();
    boolean var25 = var0.isFull();
    boolean var26 = var0.isFull();
    boolean var29 = var0.insert(10, 1);
    boolean var32 = var0.insert(1, (-1));
    boolean var35 = var0.insert(10, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);

  }

  public void test165() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test165");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert((-1), 1);
    boolean var9 = var0.isFull(0);
    boolean var11 = var0.isFull(0);
    boolean var12 = var0.isFull();
    boolean var14 = var0.isFull(100);
    boolean var17 = var0.insert((-1), 1);
    boolean var19 = var0.isFull(10);
    boolean var21 = var0.isFull(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);

  }

  public void test166() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test166");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull((-1));
    boolean var8 = var0.isFull(1);
    boolean var11 = var0.insert(10, (-1));
    boolean var14 = var0.insert(100, (-1));
    boolean var16 = var0.isFull(1);
    boolean var17 = var0.isFull();
    boolean var20 = var0.insert((-1), 100);
    boolean var23 = var0.insert(10, (-1));
    boolean var25 = var0.isFull((-1));
    boolean var26 = var0.isFull();
    boolean var28 = var0.isFull((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);

  }

  public void test167() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test167");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var1 = var0.isFull();
    boolean var3 = var0.isFull((-1));
    boolean var6 = var0.insert(0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test168() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test168");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var4 = var0.isFull();
    boolean var7 = var0.insert(100, 100);
    boolean var9 = var0.isFull(0);
    boolean var10 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test169() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test169");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var3 = var0.isFull();
    boolean var5 = var0.isFull(1);
    boolean var7 = var0.isFull(0);
    boolean var10 = var0.insert(1, 1);
    boolean var12 = var0.isFull(10);
    boolean var14 = var0.isFull(100);
    boolean var16 = var0.isFull(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test170() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test170");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 10);
    boolean var5 = var0.isFull((-1));
    boolean var7 = var0.isFull((-1));
    boolean var10 = var0.insert(100, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test171() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test171");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(0);
    boolean var6 = var0.isFull();
    boolean var8 = var0.isFull(100);
    boolean var10 = var0.isFull((-1));
    boolean var12 = var0.isFull((-1));
    boolean var13 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test172() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test172");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull((-1));
    boolean var8 = var0.isFull(1);
    boolean var11 = var0.insert(10, (-1));
    boolean var13 = var0.isFull(100);
    boolean var15 = var0.isFull(10);
    boolean var17 = var0.isFull(1);
    boolean var18 = var0.isFull();
    boolean var19 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test173() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test173");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var5 = var0.isFull();
    boolean var8 = var0.insert(0, (-1));
    boolean var10 = var0.isFull((-1));
    boolean var12 = var0.isFull(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test174() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test174");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(0);
    boolean var7 = var0.isFull((-1));
    boolean var8 = var0.isFull();
    boolean var9 = var0.isFull();
    boolean var11 = var0.isFull((-1));
    boolean var12 = var0.isFull();
    boolean var14 = var0.isFull(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test175() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test175");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var5 = var0.insert(10, 0);
    boolean var7 = var0.isFull((-1));
    boolean var10 = var0.insert((-1), 1);
    boolean var11 = var0.isFull();
    boolean var13 = var0.isFull(0);
    boolean var15 = var0.isFull(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test176() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test176");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull((-1));
    boolean var8 = var0.isFull(1);
    boolean var11 = var0.insert(10, (-1));
    boolean var14 = var0.insert(100, (-1));
    boolean var16 = var0.isFull(1);
    boolean var17 = var0.isFull();
    boolean var20 = var0.insert((-1), 0);
    boolean var23 = var0.insert((-1), 100);
    boolean var25 = var0.isFull(1);
    boolean var28 = var0.insert(100, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test177() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test177");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull(10);
    boolean var9 = var0.insert(0, 1);
    boolean var11 = var0.isFull(0);
    boolean var14 = var0.insert(1, 100);
    boolean var17 = var0.insert(100, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test178() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test178");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert((-1), 1);
    boolean var10 = var0.insert(0, 100);
    boolean var11 = var0.isFull();
    boolean var12 = var0.isFull();
    boolean var14 = var0.isFull(10);
    boolean var17 = var0.insert(0, 1);
    boolean var20 = var0.insert((-1), 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test179() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test179");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert((-1), 1);
    boolean var8 = var0.isFull();
    boolean var11 = var0.insert(0, (-1));
    boolean var12 = var0.isFull();
    boolean var15 = var0.insert(1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test180() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test180");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(0);
    boolean var7 = var0.isFull((-1));
    boolean var8 = var0.isFull();
    boolean var9 = var0.isFull();
    boolean var12 = var0.insert(10, 1);
    boolean var15 = var0.insert(0, (-1));
    boolean var18 = var0.insert(10, (-1));
    boolean var20 = var0.isFull((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);

  }

  public void test181() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test181");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert(0, 10);
    boolean var10 = var0.insert(100, 100);
    boolean var11 = var0.isFull();
    boolean var14 = var0.insert(1, 1);
    boolean var15 = var0.isFull();
    boolean var18 = var0.insert(1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test182() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test182");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var6 = var0.insert(0, 100);
    boolean var8 = var0.isFull(100);
    boolean var11 = var0.insert(1, 100);
    boolean var12 = var0.isFull();
    boolean var14 = var0.isFull(10);
    boolean var15 = var0.isFull();
    boolean var17 = var0.isFull((-1));
    boolean var20 = var0.insert(0, 0);
    boolean var23 = var0.insert((-1), (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test183() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test183");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var5 = var0.insert(10, 0);
    boolean var8 = var0.insert(100, 1);
    boolean var10 = var0.isFull((-1));
    boolean var12 = var0.isFull(10);
    boolean var15 = var0.insert((-1), 0);
    boolean var16 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test184() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test184");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var6 = var0.insert(0, 100);
    boolean var9 = var0.insert(10, 10);
    boolean var10 = var0.isFull();
    boolean var11 = var0.isFull();
    boolean var14 = var0.insert(1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test185() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test185");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert((-1), 1);
    boolean var9 = var0.isFull(0);
    boolean var11 = var0.isFull(0);
    boolean var12 = var0.isFull();
    boolean var14 = var0.isFull(100);
    boolean var16 = var0.isFull(1);
    boolean var17 = var0.isFull();
    boolean var20 = var0.insert(10, 100);
    boolean var22 = var0.isFull(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);

  }

  public void test186() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test186");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var6 = var0.insert(0, 100);
    boolean var8 = var0.isFull(100);
    boolean var11 = var0.insert(1, 100);
    boolean var12 = var0.isFull();
    boolean var15 = var0.insert(1, 0);
    boolean var17 = var0.isFull(10);
    boolean var19 = var0.isFull(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);

  }

  public void test187() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test187");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull((-1));
    boolean var8 = var0.isFull(1);
    boolean var9 = var0.isFull();
    boolean var11 = var0.isFull((-1));
    boolean var14 = var0.insert((-1), 100);
    boolean var15 = var0.isFull();
    boolean var16 = var0.isFull();
    boolean var19 = var0.insert((-1), (-1));
    boolean var21 = var0.isFull(1);
    boolean var24 = var0.insert(10, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test188() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test188");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var6 = var0.insert(1, 100);
    boolean var8 = var0.isFull(0);
    boolean var11 = var0.insert(100, 100);
    boolean var13 = var0.isFull(100);
    boolean var15 = var0.isFull(0);
    boolean var17 = var0.isFull((-1));
    boolean var20 = var0.insert(1, (-1));
    boolean var23 = var0.insert(10, 1);
    boolean var25 = var0.isFull(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);

  }

  public void test189() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test189");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var4 = var0.isFull();
    boolean var7 = var0.insert(100, 100);
    boolean var10 = var0.insert(100, 100);
    boolean var11 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test190() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test190");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert((-1), 1);
    boolean var10 = var0.insert(0, 100);
    boolean var11 = var0.isFull();
    boolean var12 = var0.isFull();
    boolean var14 = var0.isFull(10);
    boolean var17 = var0.insert(0, 1);
    boolean var18 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test191() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test191");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(100);
    boolean var6 = var0.isFull();
    boolean var8 = var0.isFull(0);
    boolean var9 = var0.isFull();
    boolean var10 = var0.isFull();
    boolean var11 = var0.isFull();
    boolean var12 = var0.isFull();
    boolean var14 = var0.isFull((-1));
    boolean var17 = var0.insert(0, 100);
    boolean var18 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test192() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test192");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert(0, 1);
    boolean var8 = var0.isFull();
    boolean var9 = var0.isFull();
    boolean var10 = var0.isFull();
    boolean var11 = var0.isFull();
    boolean var12 = var0.isFull();
    boolean var15 = var0.insert((-1), 0);
    boolean var18 = var0.insert(0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test193() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test193");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var5 = var0.isFull();
    boolean var8 = var0.insert(100, 10);
    boolean var11 = var0.insert((-1), 0);
    boolean var12 = var0.isFull();
    boolean var14 = var0.isFull(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test194() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test194");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(0);
    boolean var8 = var0.insert(10, 10);
    boolean var11 = var0.insert(100, 1);
    boolean var12 = var0.isFull();
    boolean var15 = var0.insert(100, 0);
    boolean var16 = var0.isFull();
    boolean var18 = var0.isFull(1);
    boolean var20 = var0.isFull(0);
    boolean var21 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test195() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test195");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(0);
    boolean var8 = var0.insert(10, 10);
    boolean var9 = var0.isFull();
    boolean var11 = var0.isFull((-1));
    boolean var14 = var0.insert(100, 1);
    boolean var17 = var0.insert((-1), (-1));
    boolean var18 = var0.isFull();
    boolean var19 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test196() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test196");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var6 = var0.insert(0, 100);
    boolean var8 = var0.isFull(0);
    boolean var11 = var0.insert((-1), 1);
    boolean var12 = var0.isFull();
    boolean var15 = var0.insert(0, 100);
    boolean var17 = var0.isFull(0);
    boolean var19 = var0.isFull(10);
    boolean var20 = var0.isFull();
    boolean var21 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test197() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test197");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert(0, 1);
    boolean var8 = var0.isFull();
    boolean var10 = var0.isFull(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test198() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test198");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(0);
    boolean var7 = var0.isFull((-1));
    boolean var8 = var0.isFull();
    boolean var9 = var0.isFull();
    boolean var10 = var0.isFull();
    boolean var13 = var0.insert(100, 0);
    boolean var16 = var0.insert((-1), 100);
    boolean var18 = var0.isFull(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);

  }

  public void test199() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test199");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert(0, 1);
    boolean var8 = var0.isFull();
    boolean var9 = var0.isFull();
    boolean var10 = var0.isFull();
    boolean var13 = var0.insert(1, 1);
    boolean var15 = var0.isFull(10);
    boolean var18 = var0.insert((-1), 0);
    boolean var21 = var0.insert(1, 100);
    boolean var23 = var0.isFull(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);

  }

  public void test200() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test200");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var5 = var0.isFull();
    boolean var7 = var0.isFull(0);
    boolean var10 = var0.insert(100, 1);
    boolean var12 = var0.isFull(0);
    boolean var14 = var0.isFull(10);
    boolean var15 = var0.isFull();
    boolean var18 = var0.insert(10, (-1));
    boolean var19 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test201() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test201");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var6 = var0.insert(1, 100);
    boolean var8 = var0.isFull(0);
    boolean var11 = var0.insert(100, 100);
    boolean var13 = var0.isFull(100);
    boolean var15 = var0.isFull(0);
    boolean var17 = var0.isFull((-1));
    boolean var19 = var0.isFull((-1));
    boolean var22 = var0.insert((-1), 10);
    boolean var24 = var0.isFull(1);
    boolean var27 = var0.insert(100, 10);
    boolean var29 = var0.isFull(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);

  }

  public void test202() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test202");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(0);
    boolean var7 = var0.isFull((-1));
    boolean var10 = var0.insert(100, 10);
    boolean var11 = var0.isFull();
    boolean var14 = var0.insert(1, 1);
    boolean var15 = var0.isFull();
    boolean var18 = var0.insert(100, 10);
    boolean var19 = var0.isFull();
    boolean var20 = var0.isFull();
    boolean var22 = var0.isFull((-1));
    boolean var24 = var0.isFull((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);

  }

  public void test203() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test203");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var6 = var0.insert(0, 100);
    boolean var8 = var0.isFull((-1));
    boolean var10 = var0.isFull((-1));
    boolean var11 = var0.isFull();
    boolean var13 = var0.isFull(0);
    boolean var15 = var0.isFull(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test204() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test204");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull((-1));
    boolean var7 = var0.isFull();
    boolean var10 = var0.insert(1, 10);
    boolean var11 = var0.isFull();
    boolean var14 = var0.insert((-1), 0);
    boolean var17 = var0.insert((-1), (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test205() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test205");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var6 = var0.insert(0, 100);
    boolean var8 = var0.isFull((-1));
    boolean var10 = var0.isFull((-1));
    boolean var11 = var0.isFull();
    boolean var13 = var0.isFull(0);
    boolean var15 = var0.isFull(0);
    boolean var16 = var0.isFull();
    boolean var19 = var0.insert((-1), 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test206() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test206");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(100);
    boolean var6 = var0.isFull();
    boolean var8 = var0.isFull(10);
    boolean var9 = var0.isFull();
    boolean var10 = var0.isFull();
    boolean var11 = var0.isFull();
    boolean var12 = var0.isFull();
    boolean var13 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test207() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test207");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var3 = var0.isFull();
    boolean var6 = var0.insert(0, 10);
    boolean var7 = var0.isFull();
    boolean var10 = var0.insert(1, 100);
    boolean var11 = var0.isFull();
    boolean var13 = var0.isFull(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test208() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test208");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var4 = var0.isFull();
    boolean var7 = var0.insert(100, 100);
    boolean var10 = var0.insert(0, 1);
    boolean var12 = var0.isFull(10);
    boolean var13 = var0.isFull();
    boolean var14 = var0.isFull();
    boolean var16 = var0.isFull((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);

  }

  public void test209() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test209");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(1);
    boolean var6 = var0.isFull();
    boolean var8 = var0.isFull(100);
    boolean var10 = var0.isFull((-1));
    boolean var12 = var0.isFull(0);
    boolean var14 = var0.isFull(0);
    boolean var17 = var0.insert(0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test210() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test210");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull((-1));
    boolean var8 = var0.isFull(1);
    boolean var11 = var0.insert(10, (-1));
    boolean var13 = var0.isFull(0);
    boolean var15 = var0.isFull(10);
    boolean var18 = var0.insert(10, 10);
    boolean var19 = var0.isFull();
    boolean var22 = var0.insert((-1), 1);
    boolean var24 = var0.isFull((-1));
    boolean var27 = var0.insert((-1), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test211() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test211");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var5 = var0.isFull();
    boolean var8 = var0.insert(1, 10);
    boolean var11 = var0.insert(100, (-1));
    boolean var12 = var0.isFull();
    boolean var13 = var0.isFull();
    boolean var14 = var0.isFull();
    boolean var17 = var0.insert(1, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);

  }

  public void test212() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test212");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(0);
    boolean var7 = var0.isFull((-1));
    boolean var10 = var0.insert(100, 1);
    boolean var11 = var0.isFull();
    boolean var12 = var0.isFull();
    boolean var14 = var0.isFull(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test213() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test213");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 10);
    boolean var4 = var0.isFull();
    boolean var5 = var0.isFull();
    boolean var8 = var0.insert(1, 10);
    boolean var9 = var0.isFull();
    boolean var11 = var0.isFull(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test214() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test214");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert(0, 1);
    boolean var9 = var0.isFull((-1));
    boolean var10 = var0.isFull();
    boolean var12 = var0.isFull(10);
    boolean var15 = var0.insert(10, 10);
    boolean var18 = var0.insert((-1), 0);
    boolean var19 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test215() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test215");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull((-1));
    boolean var8 = var0.isFull(1);
    boolean var11 = var0.insert(10, (-1));
    boolean var14 = var0.insert(100, (-1));
    boolean var17 = var0.insert((-1), 0);
    boolean var20 = var0.insert(10, 1);
    boolean var23 = var0.insert(0, (-1));
    boolean var25 = var0.isFull(100);
    boolean var27 = var0.isFull(100);
    boolean var28 = var0.isFull();
    boolean var29 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test216() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test216");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var5 = var0.insert(100, 1);
    boolean var6 = var0.isFull();
    boolean var8 = var0.isFull((-1));
    boolean var11 = var0.insert(0, (-1));
    boolean var12 = var0.isFull();
    boolean var13 = var0.isFull();
    boolean var16 = var0.insert((-1), 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test217() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test217");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert(0, 1);
    boolean var8 = var0.isFull();
    boolean var9 = var0.isFull();
    boolean var10 = var0.isFull();
    boolean var12 = var0.isFull((-1));
    boolean var13 = var0.isFull();
    boolean var16 = var0.insert(100, 100);
    boolean var17 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test218() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test218");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var5 = var0.isFull();
    boolean var7 = var0.isFull((-1));
    boolean var10 = var0.insert(1, 10);
    boolean var12 = var0.isFull(1);
    boolean var15 = var0.insert(0, (-1));
    boolean var16 = var0.isFull();
    boolean var18 = var0.isFull(1);
    boolean var21 = var0.insert(100, 100);
    boolean var22 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test219() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test219");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert(0, 1);
    boolean var8 = var0.isFull();
    boolean var9 = var0.isFull();
    boolean var10 = var0.isFull();
    boolean var13 = var0.insert(100, 0);
    boolean var16 = var0.insert(0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test220() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test220");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var3 = var0.isFull();
    boolean var4 = var0.isFull();
    boolean var6 = var0.isFull(100);
    boolean var8 = var0.isFull(0);
    boolean var11 = var0.insert((-1), 0);
    boolean var13 = var0.isFull(0);
    boolean var15 = var0.isFull(1);
    boolean var18 = var0.insert(100, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test221() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test221");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert(100, 1);
    boolean var9 = var0.isFull(10);
    boolean var12 = var0.insert(100, 100);
    boolean var14 = var0.isFull(10);
    boolean var17 = var0.insert(100, (-1));
    boolean var19 = var0.isFull(1);
    boolean var20 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test222() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test222");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var6 = var0.insert(0, 100);
    boolean var8 = var0.isFull(0);
    boolean var10 = var0.isFull(0);
    boolean var12 = var0.isFull(1);
    boolean var14 = var0.isFull(10);
    boolean var15 = var0.isFull();
    boolean var16 = var0.isFull();
    boolean var17 = var0.isFull();
    boolean var19 = var0.isFull(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);

  }

  public void test223() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test223");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var6 = var0.insert(0, 100);
    boolean var8 = var0.isFull(0);
    boolean var11 = var0.insert(100, 10);
    boolean var13 = var0.isFull(100);
    boolean var15 = var0.isFull(1);
    boolean var18 = var0.insert(100, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test224() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test224");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(1);
    boolean var7 = var0.isFull(100);
    boolean var8 = var0.isFull();
    boolean var11 = var0.insert(1, (-1));
    boolean var13 = var0.isFull(1);
    boolean var16 = var0.insert(10, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test225() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test225");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var6 = var0.insert(0, 100);
    boolean var8 = var0.isFull(0);
    boolean var10 = var0.isFull(0);
    boolean var12 = var0.isFull(1);
    boolean var15 = var0.insert(10, 0);
    boolean var16 = var0.isFull();
    boolean var18 = var0.isFull(0);
    boolean var19 = var0.isFull();
    boolean var20 = var0.isFull();
    boolean var21 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test226() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test226");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(100, 1);
    boolean var6 = var0.insert(0, 0);
    boolean var8 = var0.isFull(100);
    boolean var10 = var0.isFull(10);
    boolean var12 = var0.isFull(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test227() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test227");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(100);
    boolean var6 = var0.isFull();
    boolean var8 = var0.isFull(0);
    boolean var9 = var0.isFull();
    boolean var10 = var0.isFull();
    boolean var11 = var0.isFull();
    boolean var12 = var0.isFull();
    boolean var15 = var0.insert((-1), (-1));
    boolean var18 = var0.insert(10, 100);
    boolean var20 = var0.isFull(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test228() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test228");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(1);
    boolean var6 = var0.isFull();
    boolean var8 = var0.isFull(100);
    boolean var11 = var0.insert((-1), 0);
    boolean var14 = var0.insert(0, 1);
    boolean var17 = var0.insert(10, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test229() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test229");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(0);
    boolean var8 = var0.insert(10, 10);
    boolean var9 = var0.isFull();
    boolean var11 = var0.isFull((-1));
    boolean var14 = var0.insert(100, 1);
    boolean var17 = var0.insert(100, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test230() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test230");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull((-1));
    boolean var8 = var0.isFull(1);
    boolean var11 = var0.insert(10, (-1));
    boolean var14 = var0.insert(100, (-1));
    boolean var16 = var0.isFull(1);
    boolean var17 = var0.isFull();
    boolean var20 = var0.insert((-1), 0);
    boolean var22 = var0.isFull(1);
    boolean var23 = var0.isFull();
    boolean var25 = var0.isFull(100);
    boolean var27 = var0.isFull(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);

  }

  public void test231() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test231");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var3 = var0.isFull();
    boolean var5 = var0.isFull((-1));
    boolean var7 = var0.isFull(1);
    boolean var9 = var0.isFull((-1));
    boolean var11 = var0.isFull(1);
    boolean var12 = var0.isFull();
    boolean var14 = var0.isFull(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test232() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test232");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull((-1));
    boolean var8 = var0.isFull(1);
    boolean var11 = var0.insert(10, (-1));
    boolean var14 = var0.insert(100, (-1));
    boolean var15 = var0.isFull();
    boolean var18 = var0.insert(0, 10);
    boolean var21 = var0.insert(0, 10);
    boolean var22 = var0.isFull();
    boolean var25 = var0.insert(100, 100);
    boolean var28 = var0.insert((-1), 10);
    boolean var31 = var0.insert(0, 100);
    boolean var33 = var0.isFull(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);

  }

  public void test233() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test233");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull((-1));
    boolean var8 = var0.isFull(1);
    boolean var9 = var0.isFull();
    boolean var11 = var0.isFull((-1));
    boolean var14 = var0.insert((-1), 100);
    boolean var15 = var0.isFull();
    boolean var18 = var0.insert((-1), 0);
    boolean var19 = var0.isFull();
    boolean var20 = var0.isFull();
    boolean var22 = var0.isFull(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test234() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test234");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert((-1), 1);
    boolean var9 = var0.isFull(0);
    boolean var11 = var0.isFull(0);
    boolean var13 = var0.isFull(1);
    boolean var15 = var0.isFull(100);
    boolean var17 = var0.isFull(10);
    boolean var19 = var0.isFull(100);
    boolean var22 = var0.insert(100, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test235() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test235");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var6 = var0.insert(0, 100);
    boolean var8 = var0.isFull(0);
    boolean var10 = var0.isFull(0);
    boolean var12 = var0.isFull(1);
    boolean var15 = var0.insert(10, 0);
    boolean var17 = var0.isFull(0);
    boolean var19 = var0.isFull(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);

  }

  public void test236() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test236");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var3 = var0.isFull();
    boolean var4 = var0.isFull();
    boolean var6 = var0.isFull(100);
    boolean var8 = var0.isFull(0);
    boolean var11 = var0.insert((-1), 0);
    boolean var13 = var0.isFull(100);
    boolean var16 = var0.insert(100, 100);
    boolean var18 = var0.isFull(1);
    boolean var20 = var0.isFull(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test237() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test237");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(0);
    boolean var8 = var0.insert(10, 10);
    boolean var9 = var0.isFull();
    boolean var11 = var0.isFull((-1));
    boolean var14 = var0.insert(10, 1);
    boolean var16 = var0.isFull(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);

  }

  public void test238() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test238");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull(10);
    boolean var8 = var0.isFull((-1));
    boolean var9 = var0.isFull();
    boolean var10 = var0.isFull();
    boolean var11 = var0.isFull();
    boolean var13 = var0.isFull((-1));
    boolean var16 = var0.insert(1, 1);
    boolean var17 = var0.isFull();
    boolean var20 = var0.insert((-1), 10);
    boolean var22 = var0.isFull(1);
    boolean var23 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test239() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test239");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(100);
    boolean var6 = var0.isFull();
    boolean var8 = var0.isFull(0);
    boolean var9 = var0.isFull();
    boolean var10 = var0.isFull();
    boolean var11 = var0.isFull();
    boolean var12 = var0.isFull();
    boolean var15 = var0.insert((-1), (-1));
    boolean var16 = var0.isFull();
    boolean var19 = var0.insert((-1), 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test240() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test240");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(0);
    boolean var8 = var0.insert(10, 10);
    boolean var11 = var0.insert(100, 1);
    boolean var12 = var0.isFull();
    boolean var15 = var0.insert(100, 0);
    boolean var16 = var0.isFull();
    boolean var19 = var0.insert((-1), 1);
    boolean var21 = var0.isFull(0);
    boolean var23 = var0.isFull((-1));
    boolean var24 = var0.isFull();
    boolean var27 = var0.insert((-1), 1);
    boolean var28 = var0.isFull();
    boolean var30 = var0.isFull((-1));
    boolean var31 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);

  }

  public void test241() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test241");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull((-1));
    boolean var8 = var0.isFull(1);
    boolean var11 = var0.insert(10, (-1));
    boolean var14 = var0.insert(100, (-1));
    boolean var17 = var0.insert((-1), 0);
    boolean var20 = var0.insert(10, 1);
    boolean var23 = var0.insert(0, (-1));
    boolean var24 = var0.isFull();
    boolean var26 = var0.isFull((-1));
    boolean var28 = var0.isFull(1);
    boolean var29 = var0.isFull();
    boolean var31 = var0.isFull(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);

  }

  public void test242() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test242");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert((-1), 1);
    boolean var10 = var0.insert(0, 100);
    boolean var11 = var0.isFull();
    boolean var12 = var0.isFull();
    boolean var14 = var0.isFull(10);
    boolean var17 = var0.insert(0, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);

  }

  public void test243() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test243");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(0);
    boolean var6 = var0.isFull();
    boolean var8 = var0.isFull(100);
    boolean var9 = var0.isFull();
    boolean var11 = var0.isFull(0);
    boolean var14 = var0.insert((-1), 0);
    boolean var15 = var0.isFull();
    boolean var16 = var0.isFull();
    boolean var17 = var0.isFull();
    boolean var20 = var0.insert((-1), 0);
    boolean var23 = var0.insert(0, (-1));
    boolean var25 = var0.isFull(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);

  }

  public void test244() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test244");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var5 = var0.insert(10, 0);
    boolean var7 = var0.isFull((-1));
    boolean var10 = var0.insert(1, 100);
    boolean var11 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test245() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test245");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert((-1), 1);
    boolean var9 = var0.isFull(0);
    boolean var11 = var0.isFull(0);
    boolean var13 = var0.isFull(0);
    boolean var14 = var0.isFull();
    boolean var17 = var0.insert(0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test246() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test246");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert(0, 1);
    boolean var9 = var0.isFull((-1));
    boolean var11 = var0.isFull(100);
    boolean var12 = var0.isFull();
    boolean var13 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test247() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test247");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert(0, 1);
    boolean var10 = var0.insert(10, (-1));
    boolean var12 = var0.isFull(1);
    boolean var15 = var0.insert(1, 10);
    boolean var18 = var0.insert(10, 0);
    boolean var20 = var0.isFull(1);
    boolean var23 = var0.insert(100, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test248() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test248");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull(10);
    boolean var8 = var0.isFull((-1));
    boolean var10 = var0.isFull(1);
    boolean var13 = var0.insert((-1), 10);
    boolean var15 = var0.isFull(1);
    boolean var17 = var0.isFull((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);

  }

  public void test249() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test249");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert((-1), 1);
    boolean var8 = var0.isFull();
    boolean var10 = var0.isFull(100);
    boolean var11 = var0.isFull();
    boolean var12 = var0.isFull();
    boolean var14 = var0.isFull((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test250() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test250");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var3 = var0.isFull();
    boolean var5 = var0.isFull((-1));
    boolean var7 = var0.isFull(1);
    boolean var8 = var0.isFull();
    boolean var10 = var0.isFull(1);
    boolean var13 = var0.insert((-1), 1);
    boolean var15 = var0.isFull(0);
    boolean var17 = var0.isFull(1);
    boolean var20 = var0.insert(100, 0);
    boolean var23 = var0.insert((-1), 10);
    boolean var26 = var0.insert(1, 0);
    boolean var27 = var0.isFull();
    boolean var30 = var0.insert(0, 10);
    boolean var33 = var0.insert(1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);

  }

  public void test251() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test251");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var3 = var0.isFull();
    boolean var6 = var0.insert(0, 10);
    boolean var7 = var0.isFull();
    boolean var10 = var0.insert(1, 100);
    boolean var13 = var0.insert((-1), 0);
    boolean var16 = var0.insert(1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test252() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test252");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert((-1), 1);
    boolean var9 = var0.isFull((-1));
    boolean var12 = var0.insert(0, 10);
    boolean var14 = var0.isFull(10);
    boolean var17 = var0.insert(1, 1);
    boolean var20 = var0.insert((-1), (-1));
    boolean var21 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test253() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test253");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert((-1), 1);
    boolean var9 = var0.isFull(0);
    boolean var12 = var0.insert(1, 1);
    boolean var13 = var0.isFull();
    boolean var14 = var0.isFull();
    boolean var15 = var0.isFull();
    boolean var18 = var0.insert((-1), (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test254() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test254");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert(0, 1);
    boolean var10 = var0.insert(10, (-1));
    boolean var12 = var0.isFull(1);
    boolean var15 = var0.insert(1, 10);
    boolean var18 = var0.insert((-1), 1);
    boolean var21 = var0.insert(10, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test255() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test255");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(1);
    boolean var8 = var0.insert(100, 10);
    boolean var9 = var0.isFull();
    boolean var10 = var0.isFull();
    boolean var12 = var0.isFull(100);
    boolean var13 = var0.isFull();
    boolean var16 = var0.insert(0, (-1));
    boolean var17 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test256() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test256");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var4 = var0.isFull();
    boolean var6 = var0.isFull(1);
    boolean var7 = var0.isFull();
    boolean var10 = var0.insert(10, 100);
    boolean var13 = var0.insert((-1), (-1));
    boolean var16 = var0.insert(100, (-1));
    boolean var19 = var0.insert(0, (-1));
    boolean var22 = var0.insert(10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test257() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test257");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(0);
    boolean var6 = var0.isFull();
    boolean var8 = var0.isFull(100);
    boolean var9 = var0.isFull();
    boolean var11 = var0.isFull(0);
    boolean var14 = var0.insert((-1), 0);
    boolean var15 = var0.isFull();
    boolean var16 = var0.isFull();
    boolean var17 = var0.isFull();
    boolean var18 = var0.isFull();
    boolean var21 = var0.insert((-1), 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test258() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test258");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(100, 1);
    boolean var4 = var0.isFull();
    boolean var5 = var0.isFull();
    boolean var6 = var0.isFull();
    boolean var9 = var0.insert(0, (-1));
    boolean var12 = var0.insert(0, 100);
    boolean var13 = var0.isFull();
    boolean var16 = var0.insert(10, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test259() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test259");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull((-1));
    boolean var8 = var0.isFull(1);
    boolean var11 = var0.insert(10, (-1));
    boolean var14 = var0.insert(100, (-1));
    boolean var15 = var0.isFull();
    boolean var18 = var0.insert(0, 10);
    boolean var21 = var0.insert(0, 10);
    boolean var22 = var0.isFull();
    boolean var25 = var0.insert(100, 100);
    boolean var28 = var0.insert((-1), 10);
    boolean var30 = var0.isFull(1);
    boolean var31 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);

  }

  public void test260() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test260");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(0);
    boolean var8 = var0.insert(10, 10);
    boolean var11 = var0.insert(100, 1);
    boolean var12 = var0.isFull();
    boolean var15 = var0.insert(0, 10);
    boolean var17 = var0.isFull(1);
    boolean var18 = var0.isFull();
    boolean var19 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test261() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test261");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(0);
    boolean var8 = var0.insert(10, 10);
    boolean var11 = var0.insert(100, 1);
    boolean var12 = var0.isFull();
    boolean var15 = var0.insert(100, 1);
    boolean var18 = var0.insert(0, 0);
    boolean var20 = var0.isFull(1);
    boolean var22 = var0.isFull(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);

  }

  public void test262() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test262");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert(0, 1);
    boolean var8 = var0.isFull();
    boolean var9 = var0.isFull();
    boolean var10 = var0.isFull();
    boolean var13 = var0.insert(1, 1);
    boolean var16 = var0.insert(0, 0);
    boolean var18 = var0.isFull(10);
    boolean var21 = var0.insert(1, 10);
    boolean var22 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test263() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test263");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull((-1));
    boolean var7 = var0.isFull();
    boolean var10 = var0.insert(1, 10);
    boolean var11 = var0.isFull();
    boolean var12 = var0.isFull();
    boolean var15 = var0.insert(10, 100);
    boolean var17 = var0.isFull(1);
    boolean var18 = var0.isFull();
    boolean var21 = var0.insert(10, 100);
    boolean var23 = var0.isFull(0);
    boolean var25 = var0.isFull(10);
    boolean var28 = var0.insert((-1), (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test264() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test264");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull((-1));
    boolean var8 = var0.isFull(1);
    boolean var11 = var0.insert(10, (-1));
    boolean var13 = var0.isFull(100);
    boolean var14 = var0.isFull();
    boolean var15 = var0.isFull();
    boolean var18 = var0.insert((-1), 10);
    boolean var21 = var0.insert(10, (-1));
    boolean var23 = var0.isFull(0);
    boolean var24 = var0.isFull();
    boolean var27 = var0.insert((-1), 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test265() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test265");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull((-1));
    boolean var8 = var0.isFull(1);
    boolean var11 = var0.insert(10, (-1));
    boolean var14 = var0.insert(100, (-1));
    boolean var16 = var0.isFull(100);
    boolean var19 = var0.insert(0, 0);
    boolean var21 = var0.isFull(0);
    boolean var23 = var0.isFull(100);
    boolean var24 = var0.isFull();
    boolean var25 = var0.isFull();
    boolean var28 = var0.insert((-1), 0);
    boolean var29 = var0.isFull();
    boolean var31 = var0.isFull(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);

  }

  public void test266() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test266");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var3 = var0.isFull();
    boolean var6 = var0.insert(0, 10);
    boolean var8 = var0.isFull(100);
    boolean var11 = var0.insert(1, 100);
    boolean var12 = var0.isFull();
    boolean var14 = var0.isFull(100);
    boolean var15 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test267() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test267");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var3 = var0.isFull();
    boolean var5 = var0.isFull((-1));
    boolean var7 = var0.isFull(1);
    boolean var8 = var0.isFull();
    boolean var10 = var0.isFull(1);
    boolean var13 = var0.insert((-1), 1);
    boolean var15 = var0.isFull(0);
    boolean var16 = var0.isFull();
    boolean var19 = var0.insert(0, 10);
    boolean var22 = var0.insert(100, 1);
    boolean var23 = var0.isFull();
    boolean var25 = var0.isFull(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test268() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test268");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert((-1), 1);
    boolean var8 = var0.isFull();
    boolean var11 = var0.insert(100, 0);
    boolean var13 = var0.isFull(10);
    boolean var16 = var0.insert(1, (-1));
    boolean var17 = var0.isFull();
    boolean var19 = var0.isFull(10);
    boolean var20 = var0.isFull();
    boolean var23 = var0.insert(0, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);

  }

  public void test269() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test269");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert(100, 1);
    boolean var9 = var0.isFull(0);
    boolean var10 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test270() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test270");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert(0, 1);
    boolean var8 = var0.isFull();
    boolean var11 = var0.insert(0, (-1));
    boolean var12 = var0.isFull();
    boolean var15 = var0.insert((-1), 100);
    boolean var16 = var0.isFull();
    boolean var18 = var0.isFull(100);
    boolean var21 = var0.insert(10, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test271() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test271");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert(0, 1);
    boolean var8 = var0.isFull();
    boolean var9 = var0.isFull();
    boolean var10 = var0.isFull();
    boolean var13 = var0.insert(1, 1);
    boolean var15 = var0.isFull(10);
    boolean var18 = var0.insert((-1), 0);
    boolean var21 = var0.insert(10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test272() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test272");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert(0, 1);
    boolean var9 = var0.isFull((-1));
    boolean var11 = var0.isFull(100);
    boolean var12 = var0.isFull();
    boolean var15 = var0.insert(1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test273() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test273");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert((-1), 1);
    boolean var10 = var0.insert(0, 100);
    boolean var11 = var0.isFull();
    boolean var12 = var0.isFull();
    boolean var13 = var0.isFull();
    boolean var16 = var0.insert(0, 10);
    boolean var19 = var0.insert(100, (-1));
    boolean var21 = var0.isFull(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test274() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test274");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(100, 1);
    boolean var5 = var0.isFull(0);
    boolean var8 = var0.insert(100, 0);
    boolean var10 = var0.isFull(0);
    boolean var13 = var0.insert(100, 0);
    boolean var14 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test275() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test275");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var6 = var0.insert(1, 10);
    boolean var8 = var0.isFull(10);
    boolean var11 = var0.insert(10, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test276() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test276");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var3 = var0.isFull();
    boolean var5 = var0.isFull((-1));
    boolean var7 = var0.isFull(1);
    boolean var8 = var0.isFull();
    boolean var9 = var0.isFull();
    boolean var11 = var0.isFull(1);
    boolean var12 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test277() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test277");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert(0, 1);
    boolean var8 = var0.isFull();
    boolean var10 = var0.isFull(10);
    boolean var12 = var0.isFull(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test278() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test278");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull((-1));
    boolean var8 = var0.isFull(1);
    boolean var11 = var0.insert(10, (-1));
    boolean var13 = var0.isFull(100);
    boolean var14 = var0.isFull();
    boolean var15 = var0.isFull();
    boolean var17 = var0.isFull(10);
    boolean var18 = var0.isFull();
    boolean var20 = var0.isFull(10);
    boolean var21 = var0.isFull();
    boolean var22 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test279() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test279");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(100, 1);
    boolean var4 = var0.isFull();
    boolean var6 = var0.isFull(0);
    boolean var8 = var0.isFull(100);
    boolean var10 = var0.isFull(100);
    boolean var12 = var0.isFull(100);
    boolean var14 = var0.isFull(0);
    boolean var17 = var0.insert(1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);

  }

  public void test280() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test280");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(100);
    boolean var8 = var0.insert(0, 1);
    boolean var9 = var0.isFull();
    boolean var10 = var0.isFull();
    boolean var13 = var0.insert(1, 0);
    boolean var16 = var0.insert(10, 0);
    boolean var19 = var0.insert(10, (-1));
    boolean var21 = var0.isFull(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);

  }

  public void test281() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test281");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 10);
    boolean var5 = var0.isFull(1);
    boolean var8 = var0.insert(0, 100);
    boolean var10 = var0.isFull(1);
    boolean var12 = var0.isFull((-1));
    boolean var15 = var0.insert(1, (-1));
    boolean var18 = var0.insert(1, 1);
    boolean var20 = var0.isFull(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test282() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test282");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var6 = var0.insert(0, 100);
    boolean var8 = var0.isFull(100);
    boolean var11 = var0.insert(1, 100);
    boolean var12 = var0.isFull();
    boolean var15 = var0.insert(1, 0);
    boolean var16 = var0.isFull();
    boolean var17 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test283() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test283");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(1);
    boolean var8 = var0.insert(0, 0);
    boolean var11 = var0.insert(10, 100);
    boolean var12 = var0.isFull();
    boolean var15 = var0.insert(0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test284() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test284");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(0);
    boolean var8 = var0.insert(10, 10);
    boolean var11 = var0.insert(100, 1);
    boolean var14 = var0.insert(0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test285() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test285");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert(100, 1);
    boolean var9 = var0.isFull(10);
    boolean var12 = var0.insert((-1), 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test286() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test286");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull((-1));
    boolean var8 = var0.isFull(1);
    boolean var11 = var0.insert(10, (-1));
    boolean var14 = var0.insert(100, (-1));
    boolean var16 = var0.isFull(100);
    boolean var19 = var0.insert(0, 0);
    boolean var20 = var0.isFull();
    boolean var23 = var0.insert(1, 100);
    boolean var26 = var0.insert(10, (-1));
    boolean var28 = var0.isFull(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test287() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test287");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var6 = var0.insert(0, 100);
    boolean var9 = var0.insert(10, 10);
    boolean var10 = var0.isFull();
    boolean var13 = var0.insert(1, 1);
    boolean var16 = var0.insert(1, 0);
    boolean var19 = var0.insert(1, 100);
    boolean var20 = var0.isFull();
    boolean var21 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test288() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test288");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var3 = var0.isFull();
    boolean var5 = var0.isFull(1);
    boolean var7 = var0.isFull(0);
    boolean var10 = var0.insert(1, 1);
    boolean var12 = var0.isFull((-1));
    boolean var15 = var0.insert((-1), 10);
    boolean var18 = var0.insert((-1), 0);
    boolean var21 = var0.insert((-1), (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test289() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test289");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var5 = var0.isFull();
    boolean var7 = var0.isFull(0);
    boolean var10 = var0.insert(10, (-1));
    boolean var12 = var0.isFull((-1));
    boolean var13 = var0.isFull();
    boolean var14 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test290() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test290");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert((-1), 1);
    boolean var8 = var0.isFull();
    boolean var10 = var0.isFull((-1));
    boolean var11 = var0.isFull();
    boolean var12 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test291() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test291");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(0);
    boolean var8 = var0.insert(10, 10);
    boolean var11 = var0.insert(100, 1);
    boolean var12 = var0.isFull();
    boolean var15 = var0.insert(100, 1);
    boolean var17 = var0.isFull(0);
    boolean var18 = var0.isFull();
    boolean var21 = var0.insert((-1), (-1));
    boolean var24 = var0.insert((-1), 100);
    boolean var27 = var0.insert((-1), 1);
    boolean var30 = var0.insert(0, 0);
    boolean var33 = var0.insert(1, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);

  }

  public void test292() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test292");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull(10);
    boolean var8 = var0.isFull(10);
    boolean var10 = var0.isFull(0);
    boolean var11 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test293() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test293");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull((-1));
    boolean var8 = var0.isFull(1);
    boolean var11 = var0.insert(10, (-1));
    boolean var14 = var0.insert(100, (-1));
    boolean var16 = var0.isFull(1);
    boolean var17 = var0.isFull();
    boolean var18 = var0.isFull();
    boolean var20 = var0.isFull(1);
    boolean var23 = var0.insert(10, 10);
    boolean var26 = var0.insert(100, 10);
    boolean var28 = var0.isFull(10);
    boolean var31 = var0.insert((-1), 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);

  }

  public void test294() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test294");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull((-1));
    boolean var8 = var0.isFull(1);
    boolean var11 = var0.insert(10, (-1));
    boolean var14 = var0.insert(100, (-1));
    boolean var16 = var0.isFull(1);
    boolean var17 = var0.isFull();
    boolean var20 = var0.insert((-1), 100);
    boolean var21 = var0.isFull();
    boolean var22 = var0.isFull();
    boolean var25 = var0.insert((-1), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test295() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test295");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert(0, 1);
    boolean var8 = var0.isFull();
    boolean var9 = var0.isFull();
    boolean var10 = var0.isFull();
    boolean var12 = var0.isFull(0);
    boolean var15 = var0.insert(100, 10);
    boolean var17 = var0.isFull(1);
    boolean var19 = var0.isFull(0);
    boolean var22 = var0.insert(10, (-1));
    boolean var24 = var0.isFull(10);
    boolean var26 = var0.isFull((-1));
    boolean var27 = var0.isFull();
    boolean var29 = var0.isFull(100);
    boolean var30 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);

  }

  public void test296() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test296");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var3 = var0.isFull();
    boolean var5 = var0.isFull((-1));
    boolean var7 = var0.isFull(1);
    boolean var8 = var0.isFull();
    boolean var10 = var0.isFull(1);
    boolean var13 = var0.insert((-1), 1);
    boolean var15 = var0.isFull(0);
    boolean var17 = var0.isFull(1);
    boolean var20 = var0.insert(100, 0);
    boolean var23 = var0.insert((-1), 10);
    boolean var26 = var0.insert(1, 0);
    boolean var27 = var0.isFull();
    boolean var30 = var0.insert(1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);

  }

  public void test297() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test297");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 10);
    boolean var4 = var0.isFull();
    boolean var7 = var0.insert(100, (-1));
    boolean var8 = var0.isFull();
    boolean var11 = var0.insert(100, 0);
    boolean var12 = var0.isFull();
    boolean var14 = var0.isFull(1);
    boolean var17 = var0.insert(0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test298() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test298");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(0);
    boolean var8 = var0.insert(10, 10);
    boolean var11 = var0.insert(100, 1);
    boolean var12 = var0.isFull();
    boolean var15 = var0.insert(100, 0);
    boolean var16 = var0.isFull();
    boolean var19 = var0.insert((-1), 1);
    boolean var21 = var0.isFull(0);
    boolean var23 = var0.isFull((-1));
    boolean var25 = var0.isFull(1);
    boolean var27 = var0.isFull(0);
    boolean var30 = var0.insert(0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);

  }

  public void test299() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test299");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull((-1));
    boolean var8 = var0.isFull(1);
    boolean var11 = var0.insert(10, (-1));
    boolean var14 = var0.insert(100, (-1));
    boolean var16 = var0.isFull(1);
    boolean var17 = var0.isFull();
    boolean var18 = var0.isFull();
    boolean var19 = var0.isFull();
    boolean var21 = var0.isFull(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test300() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test300");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull(10);
    boolean var9 = var0.insert(10, 1);
    boolean var12 = var0.insert((-1), (-1));
    boolean var14 = var0.isFull(100);
    boolean var17 = var0.insert(100, 1);
    boolean var20 = var0.insert(0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test301() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test301");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(100);
    boolean var6 = var0.isFull();
    boolean var8 = var0.isFull(0);
    boolean var9 = var0.isFull();
    boolean var10 = var0.isFull();
    boolean var11 = var0.isFull();
    boolean var12 = var0.isFull();
    boolean var15 = var0.insert((-1), 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test302() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test302");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull(10);
    boolean var9 = var0.insert(10, 1);
    boolean var12 = var0.insert((-1), (-1));
    boolean var15 = var0.insert(1, 10);
    boolean var16 = var0.isFull();
    boolean var18 = var0.isFull(10);
    boolean var20 = var0.isFull(10);
    boolean var21 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test303() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test303");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(1);
    boolean var8 = var0.insert(100, 10);
    boolean var11 = var0.insert(0, 0);
    boolean var12 = var0.isFull();
    boolean var15 = var0.insert(10, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test304() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test304");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var5 = var0.insert(10, 0);
    boolean var8 = var0.insert(10, (-1));
    boolean var9 = var0.isFull();
    boolean var10 = var0.isFull();
    boolean var12 = var0.isFull((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test305() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test305");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull((-1));
    boolean var8 = var0.isFull(1);
    boolean var11 = var0.insert(10, (-1));
    boolean var14 = var0.insert(100, (-1));
    boolean var17 = var0.insert((-1), 0);
    boolean var20 = var0.insert(10, 1);
    boolean var23 = var0.insert(0, (-1));
    boolean var26 = var0.insert(100, 0);
    boolean var27 = var0.isFull();
    boolean var29 = var0.isFull(100);
    boolean var30 = var0.isFull();
    boolean var32 = var0.isFull(100);
    boolean var35 = var0.insert(100, 10);
    boolean var37 = var0.isFull(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);

  }

  public void test306() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test306");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var3 = var0.isFull();
    boolean var5 = var0.isFull((-1));
    boolean var7 = var0.isFull(1);
    boolean var8 = var0.isFull();
    boolean var9 = var0.isFull();
    boolean var12 = var0.insert(100, 10);
    boolean var14 = var0.isFull((-1));
    boolean var16 = var0.isFull(100);
    boolean var18 = var0.isFull(0);
    boolean var20 = var0.isFull(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);

  }

  public void test307() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test307");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var5 = var0.isFull();
    boolean var8 = var0.insert(1, (-1));
    boolean var10 = var0.isFull(1);
    boolean var12 = var0.isFull(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test308() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test308");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull((-1));
    boolean var8 = var0.isFull(1);
    boolean var9 = var0.isFull();
    boolean var10 = var0.isFull();
    boolean var12 = var0.isFull(100);
    boolean var15 = var0.insert(1, 0);
    boolean var17 = var0.isFull((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);

  }

  public void test309() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test309");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(0);
    boolean var6 = var0.isFull();
    boolean var8 = var0.isFull(100);
    boolean var10 = var0.isFull((-1));
    boolean var11 = var0.isFull();
    boolean var12 = var0.isFull();
    boolean var13 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test310() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test310");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull((-1));
    boolean var8 = var0.isFull(1);
    boolean var11 = var0.insert(10, (-1));
    boolean var13 = var0.isFull(100);
    boolean var14 = var0.isFull();
    boolean var15 = var0.isFull();
    boolean var16 = var0.isFull();
    boolean var18 = var0.isFull(0);
    boolean var21 = var0.insert(100, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test311() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test311");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(100, 1);
    boolean var4 = var0.isFull();
    boolean var5 = var0.isFull();
    boolean var6 = var0.isFull();
    boolean var9 = var0.insert(0, (-1));
    boolean var12 = var0.insert(0, 100);
    boolean var14 = var0.isFull(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test312() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test312");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(1);
    boolean var6 = var0.isFull();
    boolean var8 = var0.isFull(100);
    boolean var11 = var0.insert((-1), 100);
    boolean var13 = var0.isFull((-1));
    boolean var16 = var0.insert(100, 0);
    boolean var17 = var0.isFull();
    boolean var20 = var0.insert(100, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test313() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test313");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(100, 1);
    boolean var4 = var0.isFull();
    boolean var5 = var0.isFull();
    boolean var7 = var0.isFull((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test314() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test314");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull((-1));
    boolean var7 = var0.isFull();
    boolean var8 = var0.isFull();
    boolean var11 = var0.insert((-1), (-1));
    boolean var14 = var0.insert(100, 0);
    boolean var17 = var0.insert(1, (-1));
    boolean var18 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test315() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test315");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var3 = var0.isFull();
    boolean var5 = var0.isFull((-1));
    boolean var7 = var0.isFull(1);
    boolean var8 = var0.isFull();
    boolean var10 = var0.isFull(1);
    boolean var13 = var0.insert((-1), 1);
    boolean var15 = var0.isFull(0);
    boolean var17 = var0.isFull(1);
    boolean var20 = var0.insert(100, 1);
    boolean var21 = var0.isFull();
    boolean var22 = var0.isFull();
    boolean var24 = var0.isFull(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);

  }

  public void test316() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test316");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var3 = var0.isFull();
    boolean var4 = var0.isFull();
    boolean var7 = var0.insert((-1), 100);
    boolean var10 = var0.insert(0, 100);
    boolean var11 = var0.isFull();
    boolean var13 = var0.isFull((-1));
    boolean var14 = var0.isFull();
    boolean var17 = var0.insert(10, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test317() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test317");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert((-1), 1);
    boolean var8 = var0.isFull();
    boolean var10 = var0.isFull(100);
    boolean var12 = var0.isFull(0);
    boolean var14 = var0.isFull(10);
    boolean var17 = var0.insert(1, 1);
    boolean var19 = var0.isFull(1);
    boolean var21 = var0.isFull((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);

  }

  public void test318() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test318");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(0);
    boolean var7 = var0.isFull((-1));
    boolean var8 = var0.isFull();
    boolean var9 = var0.isFull();
    boolean var10 = var0.isFull();
    boolean var12 = var0.isFull((-1));
    boolean var14 = var0.isFull(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test319() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test319");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull((-1));
    boolean var8 = var0.isFull(1);
    boolean var11 = var0.insert(10, (-1));
    boolean var13 = var0.isFull(100);
    boolean var14 = var0.isFull();
    boolean var16 = var0.isFull((-1));
    boolean var19 = var0.insert(1, 10);
    boolean var20 = var0.isFull();
    boolean var23 = var0.insert(100, 100);
    boolean var26 = var0.insert(1, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test320() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test320");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var5 = var0.insert(100, 1);
    boolean var7 = var0.isFull(1);
    boolean var8 = var0.isFull();
    boolean var10 = var0.isFull(10);
    boolean var11 = var0.isFull();
    boolean var14 = var0.insert((-1), (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test321() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test321");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull((-1));
    boolean var8 = var0.isFull(1);
    boolean var11 = var0.insert(10, (-1));
    boolean var14 = var0.insert(100, (-1));
    boolean var16 = var0.isFull(1);
    boolean var17 = var0.isFull();
    boolean var20 = var0.insert((-1), 0);
    boolean var22 = var0.isFull(0);
    boolean var24 = var0.isFull(0);
    boolean var27 = var0.insert(10, 0);
    boolean var28 = var0.isFull();
    boolean var31 = var0.insert(100, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);

  }

  public void test322() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test322");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert((-1), 1);
    boolean var9 = var0.isFull(0);
    boolean var11 = var0.isFull(0);
    boolean var12 = var0.isFull();
    boolean var13 = var0.isFull();
    boolean var14 = var0.isFull();
    boolean var15 = var0.isFull();
    boolean var16 = var0.isFull();
    boolean var17 = var0.isFull();
    boolean var18 = var0.isFull();
    boolean var21 = var0.insert(0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test323() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test323");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull((-1));
    boolean var8 = var0.isFull(1);
    boolean var9 = var0.isFull();
    boolean var11 = var0.isFull((-1));
    boolean var14 = var0.insert((-1), 100);
    boolean var17 = var0.insert((-1), 10);
    boolean var20 = var0.insert(100, 10);
    boolean var23 = var0.insert((-1), 1);
    boolean var24 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test324() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test324");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(1);
    boolean var8 = var0.insert(100, 10);
    boolean var11 = var0.insert(0, 0);
    boolean var13 = var0.isFull(1);
    boolean var16 = var0.insert((-1), 0);
    boolean var17 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test325() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test325");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull((-1));
    boolean var8 = var0.isFull(1);
    boolean var11 = var0.insert(10, (-1));
    boolean var14 = var0.insert(100, (-1));
    boolean var16 = var0.isFull(100);
    boolean var19 = var0.insert(0, 0);
    boolean var21 = var0.isFull(0);
    boolean var22 = var0.isFull();
    boolean var25 = var0.insert(1, 100);
    boolean var26 = var0.isFull();
    boolean var29 = var0.insert(100, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test326() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test326");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull((-1));
    boolean var8 = var0.isFull(1);
    boolean var11 = var0.insert(10, (-1));
    boolean var14 = var0.insert(100, (-1));
    boolean var16 = var0.isFull(1);
    boolean var17 = var0.isFull();
    boolean var20 = var0.insert((-1), 0);
    boolean var23 = var0.insert((-1), 100);
    boolean var25 = var0.isFull(1);
    boolean var28 = var0.insert(1, 100);
    boolean var29 = var0.isFull();
    boolean var30 = var0.isFull();
    boolean var31 = var0.isFull();
    boolean var32 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);

  }

  public void test327() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test327");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull((-1));
    boolean var8 = var0.isFull(1);
    boolean var11 = var0.insert(10, (-1));
    boolean var14 = var0.insert(100, (-1));
    boolean var17 = var0.insert((-1), 0);
    boolean var20 = var0.insert(10, 1);
    boolean var23 = var0.insert(0, (-1));
    boolean var25 = var0.isFull(100);
    boolean var27 = var0.isFull(100);
    boolean var30 = var0.insert((-1), 0);
    boolean var32 = var0.isFull(0);
    boolean var33 = var0.isFull();
    boolean var34 = var0.isFull();
    boolean var35 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);

  }

  public void test328() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test328");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var6 = var0.insert(1, 100);
    boolean var8 = var0.isFull(0);
    boolean var11 = var0.insert(100, 100);
    boolean var14 = var0.insert(0, 0);
    boolean var16 = var0.isFull(0);
    boolean var18 = var0.isFull(100);
    boolean var21 = var0.insert(1, 1);
    boolean var23 = var0.isFull(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);

  }

  public void test329() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test329");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull((-1));
    boolean var8 = var0.isFull(1);
    boolean var11 = var0.insert(10, (-1));
    boolean var14 = var0.insert(100, (-1));
    boolean var16 = var0.isFull(100);
    boolean var19 = var0.insert(0, 0);
    boolean var22 = var0.insert(0, 0);
    boolean var24 = var0.isFull(100);
    boolean var26 = var0.isFull(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);

  }

  public void test330() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test330");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var3 = var0.isFull();
    boolean var5 = var0.isFull((-1));
    boolean var7 = var0.isFull(1);
    boolean var9 = var0.isFull((-1));
    boolean var11 = var0.isFull(10);
    boolean var13 = var0.isFull(10);
    boolean var16 = var0.insert((-1), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test331() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test331");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var5 = var0.insert(100, 1);
    boolean var7 = var0.isFull(1);
    boolean var8 = var0.isFull();
    boolean var10 = var0.isFull(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test332() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test332");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var6 = var0.insert(0, 100);
    boolean var8 = var0.isFull(0);
    boolean var11 = var0.insert((-1), 1);
    boolean var12 = var0.isFull();
    boolean var13 = var0.isFull();
    boolean var16 = var0.insert(10, (-1));
    boolean var19 = var0.insert((-1), 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test333() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test333");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var6 = var0.insert(1, 100);
    boolean var8 = var0.isFull(0);
    boolean var11 = var0.insert(100, 100);
    boolean var13 = var0.isFull((-1));
    boolean var14 = var0.isFull();
    boolean var15 = var0.isFull();
    boolean var18 = var0.insert((-1), 10);
    boolean var19 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test334() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test334");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var4 = var0.isFull();
    boolean var7 = var0.insert(100, 100);
    boolean var9 = var0.isFull(1);
    boolean var11 = var0.isFull(1);
    boolean var12 = var0.isFull();
    boolean var15 = var0.insert(0, (-1));
    boolean var18 = var0.insert(10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test335() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test335");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var6 = var0.insert(1, 100);
    boolean var9 = var0.insert((-1), 100);
    boolean var10 = var0.isFull();
    boolean var12 = var0.isFull(10);
    boolean var14 = var0.isFull(0);
    boolean var15 = var0.isFull();
    boolean var16 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test336() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test336");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(0);
    boolean var7 = var0.isFull((-1));
    boolean var10 = var0.insert(100, 10);
    boolean var11 = var0.isFull();
    boolean var14 = var0.insert(1, 1);
    boolean var15 = var0.isFull();
    boolean var18 = var0.insert(100, 10);
    boolean var19 = var0.isFull();
    boolean var20 = var0.isFull();
    boolean var21 = var0.isFull();
    boolean var24 = var0.insert(10, 1);
    boolean var27 = var0.insert((-1), 10);
    boolean var30 = var0.insert(10, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);

  }

  public void test337() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test337");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var3 = var0.isFull();
    boolean var6 = var0.insert(10, 1);
    boolean var9 = var0.insert((-1), 100);
    boolean var11 = var0.isFull((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test338() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test338");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(0);
    boolean var7 = var0.isFull(10);
    boolean var10 = var0.insert(1, 1);
    boolean var12 = var0.isFull(0);
    boolean var15 = var0.insert((-1), 100);
    boolean var16 = var0.isFull();
    boolean var17 = var0.isFull();
    boolean var19 = var0.isFull(0);
    boolean var22 = var0.insert((-1), 100);
    boolean var23 = var0.isFull();
    boolean var24 = var0.isFull();
    boolean var26 = var0.isFull((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);

  }

  public void test339() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test339");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert(0, 1);
    boolean var9 = var0.isFull((-1));
    boolean var12 = var0.insert(1, 1);
    boolean var14 = var0.isFull(1);
    boolean var16 = var0.isFull(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test340() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test340");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull((-1));
    boolean var8 = var0.isFull(1);
    boolean var11 = var0.insert(10, (-1));
    boolean var14 = var0.insert(100, (-1));
    boolean var16 = var0.isFull(100);
    boolean var19 = var0.insert(0, 0);
    boolean var22 = var0.insert(0, 0);
    boolean var23 = var0.isFull();
    boolean var24 = var0.isFull();
    boolean var25 = var0.isFull();
    boolean var28 = var0.insert(100, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test341() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test341");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert((-1), 1);
    boolean var9 = var0.isFull(0);
    boolean var11 = var0.isFull(0);
    boolean var12 = var0.isFull();
    boolean var14 = var0.isFull(100);
    boolean var17 = var0.insert((-1), 1);
    boolean var20 = var0.insert((-1), 100);
    boolean var21 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test342() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test342");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull((-1));
    boolean var8 = var0.isFull(1);
    boolean var11 = var0.insert(10, (-1));
    boolean var14 = var0.insert(100, (-1));
    boolean var17 = var0.insert((-1), 0);
    boolean var20 = var0.insert(10, 1);
    boolean var23 = var0.insert(0, (-1));
    boolean var25 = var0.isFull(100);
    boolean var27 = var0.isFull(100);
    boolean var30 = var0.insert((-1), 0);
    boolean var33 = var0.insert(100, 10);
    boolean var35 = var0.isFull((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);

  }

  public void test343() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test343");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var6 = var0.insert(0, 100);
    boolean var8 = var0.isFull((-1));
    boolean var10 = var0.isFull(0);
    boolean var12 = var0.isFull((-1));
    boolean var15 = var0.insert(0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test344() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test344");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var5 = var0.isFull();
    boolean var7 = var0.isFull((-1));
    boolean var10 = var0.insert(1, 10);
    boolean var12 = var0.isFull(1);
    boolean var14 = var0.isFull(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test345() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test345");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull((-1));
    boolean var8 = var0.isFull(1);
    boolean var9 = var0.isFull();
    boolean var11 = var0.isFull((-1));
    boolean var14 = var0.insert((-1), 100);
    boolean var15 = var0.isFull();
    boolean var18 = var0.insert(0, (-1));
    boolean var21 = var0.insert(10, 100);
    boolean var23 = var0.isFull(100);
    boolean var25 = var0.isFull(100);
    boolean var26 = var0.isFull();
    boolean var29 = var0.insert(100, 0);
    boolean var30 = var0.isFull();
    boolean var32 = var0.isFull(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);

  }

  public void test346() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test346");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var3 = var0.isFull();
    boolean var4 = var0.isFull();
    boolean var6 = var0.isFull(100);
    boolean var8 = var0.isFull(0);
    boolean var11 = var0.insert((-1), 0);
    boolean var13 = var0.isFull(0);
    boolean var15 = var0.isFull(1);
    boolean var18 = var0.insert(100, 10);
    boolean var19 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test347() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test347");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull((-1));
    boolean var7 = var0.insert(100, 1);
    boolean var10 = var0.insert((-1), 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test348() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test348");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(1);
    boolean var6 = var0.isFull();
    boolean var9 = var0.insert((-1), 10);
    boolean var10 = var0.isFull();
    boolean var11 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test349() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test349");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var6 = var0.insert(0, 100);
    boolean var8 = var0.isFull(0);
    boolean var11 = var0.insert((-1), 1);
    boolean var12 = var0.isFull();
    boolean var15 = var0.insert(0, 1);
    boolean var16 = var0.isFull();
    boolean var18 = var0.isFull(1);
    boolean var20 = var0.isFull(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);

  }

  public void test350() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test350");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(0);
    boolean var8 = var0.insert(10, 10);
    boolean var11 = var0.insert(100, 1);
    boolean var12 = var0.isFull();
    boolean var15 = var0.insert(0, 10);
    boolean var18 = var0.insert(1, 10);
    boolean var21 = var0.insert(100, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test351() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test351");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var6 = var0.insert(1, 10);
    boolean var8 = var0.isFull(100);
    boolean var11 = var0.insert((-1), 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test352() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test352");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var6 = var0.insert(0, 100);
    boolean var8 = var0.isFull(100);
    boolean var11 = var0.insert(1, 100);
    boolean var12 = var0.isFull();
    boolean var15 = var0.insert(1, 0);
    boolean var16 = var0.isFull();
    boolean var19 = var0.insert(1, (-1));
    boolean var20 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test353() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test353");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull((-1));
    boolean var8 = var0.isFull(1);
    boolean var11 = var0.insert(10, (-1));
    boolean var14 = var0.insert(100, (-1));
    boolean var16 = var0.isFull(1);
    boolean var17 = var0.isFull();
    boolean var20 = var0.insert((-1), 0);
    boolean var23 = var0.insert((-1), 100);
    boolean var25 = var0.isFull(1);
    boolean var26 = var0.isFull();
    boolean var28 = var0.isFull(0);
    boolean var30 = var0.isFull(0);
    boolean var32 = var0.isFull(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);

  }

  public void test354() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test354");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var3 = var0.isFull();
    boolean var4 = var0.isFull();
    boolean var6 = var0.isFull(100);
    boolean var8 = var0.isFull(0);
    boolean var11 = var0.insert((-1), 0);
    boolean var13 = var0.isFull(0);
    boolean var16 = var0.insert(1, 1);
    boolean var17 = var0.isFull();
    boolean var20 = var0.insert(1, 1);
    boolean var23 = var0.insert((-1), 1);
    boolean var24 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test355() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test355");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(0);
    boolean var8 = var0.insert(10, 10);
    boolean var9 = var0.isFull();
    boolean var11 = var0.isFull((-1));
    boolean var13 = var0.isFull(1);
    boolean var15 = var0.isFull(1);
    boolean var17 = var0.isFull((-1));
    boolean var20 = var0.insert((-1), 10);
    boolean var23 = var0.insert((-1), 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test356() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test356");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 10);
    boolean var4 = var0.isFull();
    boolean var7 = var0.insert(1, 100);
    boolean var10 = var0.insert(100, 0);
    boolean var13 = var0.insert(0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test357() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test357");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(0);
    boolean var8 = var0.insert(10, 10);
    boolean var9 = var0.isFull();
    boolean var11 = var0.isFull((-1));
    boolean var13 = var0.isFull(1);
    boolean var15 = var0.isFull(1);
    boolean var18 = var0.insert((-1), 100);
    boolean var19 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test358() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test358");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var6 = var0.insert(1, 100);
    boolean var9 = var0.insert((-1), 100);
    boolean var12 = var0.insert(100, 1);
    boolean var15 = var0.insert(10, (-1));
    boolean var16 = var0.isFull();
    boolean var17 = var0.isFull();
    boolean var19 = var0.isFull(10);
    boolean var21 = var0.isFull(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test359() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test359");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(0);
    boolean var7 = var0.isFull(10);
    boolean var10 = var0.insert(1, 1);
    boolean var12 = var0.isFull(0);
    boolean var15 = var0.insert((-1), 100);
    boolean var16 = var0.isFull();
    boolean var19 = var0.insert(10, 1);
    boolean var21 = var0.isFull(1);
    boolean var24 = var0.insert((-1), 1);
    boolean var27 = var0.insert(1, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);

  }

  public void test360() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test360");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull((-1));
    boolean var8 = var0.isFull(1);
    boolean var9 = var0.isFull();
    boolean var11 = var0.isFull((-1));
    boolean var14 = var0.insert((-1), 100);
    boolean var15 = var0.isFull();
    boolean var18 = var0.insert(0, (-1));
    boolean var20 = var0.isFull(1);
    boolean var21 = var0.isFull();
    boolean var23 = var0.isFull(10);
    boolean var24 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test361() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test361");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull(10);
    boolean var8 = var0.isFull((-1));
    boolean var9 = var0.isFull();
    boolean var10 = var0.isFull();
    boolean var11 = var0.isFull();
    boolean var13 = var0.isFull((-1));
    boolean var16 = var0.insert(1, 1);
    boolean var17 = var0.isFull();
    boolean var19 = var0.isFull((-1));
    boolean var20 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test362() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test362");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull((-1));
    boolean var8 = var0.isFull(1);
    boolean var11 = var0.insert(0, 0);
    boolean var13 = var0.isFull(100);
    boolean var16 = var0.insert(0, 1);
    boolean var19 = var0.insert(0, 1);
    boolean var22 = var0.insert(0, 0);
    boolean var25 = var0.insert(0, (-1));
    boolean var26 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test363() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test363");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull((-1));
    boolean var8 = var0.isFull(1);
    boolean var11 = var0.insert(10, (-1));
    boolean var14 = var0.insert(100, (-1));
    boolean var17 = var0.insert((-1), 0);
    boolean var20 = var0.insert(10, 1);
    boolean var23 = var0.insert(0, (-1));
    boolean var24 = var0.isFull();
    boolean var27 = var0.insert((-1), (-1));
    boolean var29 = var0.isFull(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);

  }

  public void test364() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test364");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull((-1));
    boolean var8 = var0.isFull(1);
    boolean var11 = var0.insert(10, (-1));
    boolean var14 = var0.insert(100, (-1));
    boolean var16 = var0.isFull(100);
    boolean var19 = var0.insert(0, 0);
    boolean var22 = var0.insert(0, 0);
    boolean var24 = var0.isFull(100);
    boolean var27 = var0.insert(1, (-1));
    boolean var29 = var0.isFull(1);
    boolean var32 = var0.insert(10, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);

  }

  public void test365() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test365");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var6 = var0.insert(0, 100);
    boolean var8 = var0.isFull(0);
    boolean var11 = var0.insert(100, 10);
    boolean var13 = var0.isFull(0);
    boolean var14 = var0.isFull();
    boolean var15 = var0.isFull();
    boolean var18 = var0.insert((-1), (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test366() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test366");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var5 = var0.isFull();
    boolean var7 = var0.isFull((-1));
    boolean var10 = var0.insert(1, 10);
    boolean var12 = var0.isFull(1);
    boolean var15 = var0.insert(0, (-1));
    boolean var18 = var0.insert(100, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test367() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test367");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var3 = var0.isFull();
    boolean var6 = var0.insert(10, 1);
    boolean var9 = var0.insert((-1), 100);
    boolean var12 = var0.insert((-1), (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test368() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test368");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert((-1), 1);
    boolean var9 = var0.isFull(0);
    boolean var11 = var0.isFull(0);
    boolean var13 = var0.isFull(1);
    boolean var15 = var0.isFull(100);
    boolean var16 = var0.isFull();
    boolean var18 = var0.isFull(1);
    boolean var21 = var0.insert((-1), 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test369() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test369");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(100, 1);
    boolean var5 = var0.isFull(0);
    boolean var8 = var0.insert(100, 0);
    boolean var11 = var0.insert(100, 100);
    boolean var14 = var0.insert(0, (-1));
    boolean var16 = var0.isFull(1);
    boolean var18 = var0.isFull(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);

  }

  public void test370() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test370");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var5 = var0.isFull();
    boolean var8 = var0.insert(1, (-1));
    boolean var10 = var0.isFull(1);
    boolean var12 = var0.isFull(1);
    boolean var14 = var0.isFull(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test371() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test371");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var6 = var0.insert(1, 100);
    boolean var8 = var0.isFull(0);
    boolean var11 = var0.insert(100, 100);
    boolean var14 = var0.insert(0, 0);
    boolean var16 = var0.isFull(0);
    boolean var18 = var0.isFull(100);
    boolean var21 = var0.insert(1, 1);
    boolean var23 = var0.isFull(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test372() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test372");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull((-1));
    boolean var8 = var0.isFull(1);
    boolean var11 = var0.insert(10, (-1));
    boolean var13 = var0.isFull(100);
    boolean var14 = var0.isFull();
    boolean var15 = var0.isFull();
    boolean var17 = var0.isFull(10);
    boolean var20 = var0.insert(100, 1);
    boolean var22 = var0.isFull((-1));
    boolean var23 = var0.isFull();
    boolean var24 = var0.isFull();
    boolean var26 = var0.isFull(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test373() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test373");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var6 = var0.insert(1, 10);
    boolean var8 = var0.isFull(100);
    boolean var10 = var0.isFull(10);
    boolean var12 = var0.isFull(100);
    boolean var14 = var0.isFull((-1));
    boolean var15 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test374() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test374");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert(0, 10);
    boolean var10 = var0.insert(100, 100);
    boolean var11 = var0.isFull();
    boolean var13 = var0.isFull((-1));
    boolean var14 = var0.isFull();
    boolean var17 = var0.insert((-1), 0);
    boolean var18 = var0.isFull();
    boolean var20 = var0.isFull(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test375() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test375");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var6 = var0.insert(0, 100);
    boolean var8 = var0.isFull(0);
    boolean var11 = var0.insert((-1), 1);
    boolean var12 = var0.isFull();
    boolean var15 = var0.insert(0, 100);
    boolean var17 = var0.isFull(0);
    boolean var19 = var0.isFull(10);
    boolean var20 = var0.isFull();
    boolean var23 = var0.insert(0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test376() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test376");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var3 = var0.isFull();
    boolean var4 = var0.isFull();
    boolean var6 = var0.isFull(100);
    boolean var8 = var0.isFull(0);
    boolean var11 = var0.insert((-1), 0);
    boolean var14 = var0.insert(100, (-1));
    boolean var15 = var0.isFull();
    boolean var18 = var0.insert((-1), (-1));
    boolean var19 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test377() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test377");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(100);
    boolean var6 = var0.isFull();
    boolean var8 = var0.isFull(10);
    boolean var9 = var0.isFull();
    boolean var11 = var0.isFull(100);
    boolean var12 = var0.isFull();
    boolean var14 = var0.isFull(0);
    boolean var15 = var0.isFull();
    boolean var17 = var0.isFull(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);

  }

  public void test378() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test378");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert((-1), 1);
    boolean var8 = var0.isFull();
    boolean var11 = var0.insert(100, 0);
    boolean var14 = var0.insert(100, 1);
    boolean var15 = var0.isFull();
    boolean var17 = var0.isFull(100);
    boolean var18 = var0.isFull();
    boolean var19 = var0.isFull();
    boolean var22 = var0.insert(0, 1);
    boolean var23 = var0.isFull();
    boolean var26 = var0.insert(0, 10);
    boolean var29 = var0.insert(100, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test379() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test379");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(0);
    boolean var6 = var0.isFull();
    boolean var8 = var0.isFull(100);
    boolean var10 = var0.isFull(100);
    boolean var13 = var0.insert(0, (-1));
    boolean var16 = var0.insert(0, 10);
    boolean var18 = var0.isFull(1);
    boolean var21 = var0.insert((-1), 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test380() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test380");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert(0, 1);
    boolean var10 = var0.insert(10, (-1));
    boolean var12 = var0.isFull(1);
    boolean var15 = var0.insert(1, 10);
    boolean var18 = var0.insert(10, 0);
    boolean var21 = var0.insert(10, (-1));
    boolean var23 = var0.isFull(1);
    boolean var25 = var0.isFull(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);

  }

  public void test381() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test381");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var5 = var0.isFull();
    boolean var8 = var0.insert(100, 10);
    boolean var11 = var0.insert((-1), 0);
    boolean var12 = var0.isFull();
    boolean var15 = var0.insert(10, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test382() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test382");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert((-1), 1);
    boolean var9 = var0.isFull(0);
    boolean var11 = var0.isFull(0);
    boolean var12 = var0.isFull();
    boolean var13 = var0.isFull();
    boolean var16 = var0.insert(100, 10);
    boolean var19 = var0.insert(10, 0);
    boolean var21 = var0.isFull(0);
    boolean var22 = var0.isFull();
    boolean var24 = var0.isFull(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);

  }

  public void test383() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test383");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(100);
    boolean var8 = var0.insert(0, 1);
    boolean var9 = var0.isFull();
    boolean var10 = var0.isFull();
    boolean var12 = var0.isFull(0);
    boolean var15 = var0.insert(10, 1);
    boolean var18 = var0.insert(10, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test384() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test384");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(0);
    boolean var8 = var0.insert(10, 10);
    boolean var11 = var0.insert(100, 1);
    boolean var12 = var0.isFull();
    boolean var15 = var0.insert(100, 0);
    boolean var16 = var0.isFull();
    boolean var19 = var0.insert((-1), 1);
    boolean var21 = var0.isFull(10);
    boolean var23 = var0.isFull(1);
    boolean var24 = var0.isFull();
    boolean var25 = var0.isFull();
    boolean var28 = var0.insert(0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test385() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test385");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(0);
    boolean var6 = var0.isFull();
    boolean var8 = var0.isFull(100);
    boolean var10 = var0.isFull(100);
    boolean var13 = var0.insert(0, (-1));
    boolean var16 = var0.insert(0, 10);
    boolean var18 = var0.isFull(1);
    boolean var21 = var0.insert(0, 100);
    boolean var24 = var0.insert((-1), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test386() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test386");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert(0, 1);
    boolean var10 = var0.insert(10, (-1));
    boolean var11 = var0.isFull();
    boolean var13 = var0.isFull(0);
    boolean var16 = var0.insert((-1), 100);
    boolean var19 = var0.insert(100, 1);
    boolean var21 = var0.isFull(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test387() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test387");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var6 = var0.insert(0, 100);
    boolean var8 = var0.isFull((-1));
    boolean var10 = var0.isFull((-1));
    boolean var12 = var0.isFull((-1));
    boolean var13 = var0.isFull();
    boolean var15 = var0.isFull((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test388() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test388");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull((-1));
    boolean var8 = var0.isFull(1);
    boolean var11 = var0.insert(10, (-1));
    boolean var14 = var0.insert(100, (-1));
    boolean var17 = var0.insert((-1), 0);
    boolean var20 = var0.insert(10, 1);
    boolean var23 = var0.insert(0, (-1));
    boolean var24 = var0.isFull();
    boolean var27 = var0.insert(0, 10);
    boolean var30 = var0.insert(100, 100);
    boolean var32 = var0.isFull(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);

  }

  public void test389() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test389");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert((-1), 1);
    boolean var9 = var0.isFull(0);
    boolean var11 = var0.isFull(0);
    boolean var13 = var0.isFull(0);
    boolean var14 = var0.isFull();
    boolean var16 = var0.isFull(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test390() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test390");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(0, (-1));
    boolean var6 = var0.insert(1, 0);
    boolean var7 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test391() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test391");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(0);
    boolean var8 = var0.insert(10, 10);
    boolean var9 = var0.isFull();
    boolean var11 = var0.isFull((-1));
    boolean var13 = var0.isFull(1);
    boolean var15 = var0.isFull(1);
    boolean var17 = var0.isFull((-1));
    boolean var18 = var0.isFull();
    boolean var21 = var0.insert(10, 10);
    boolean var23 = var0.isFull((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);

  }

  public void test392() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test392");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(0);
    boolean var6 = var0.isFull();
    boolean var8 = var0.isFull(100);
    boolean var9 = var0.isFull();
    boolean var10 = var0.isFull();
    boolean var12 = var0.isFull((-1));
    boolean var15 = var0.insert(100, 10);
    boolean var16 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test393() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test393");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var6 = var0.insert(0, 100);
    boolean var7 = var0.isFull();
    boolean var10 = var0.insert(1, (-1));
    boolean var12 = var0.isFull((-1));
    boolean var15 = var0.insert((-1), 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test394() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test394");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var6 = var0.insert(0, 100);
    boolean var8 = var0.isFull((-1));
    boolean var10 = var0.isFull((-1));
    boolean var12 = var0.isFull((-1));
    boolean var14 = var0.isFull(100);
    boolean var17 = var0.insert(100, 10);
    boolean var18 = var0.isFull();
    boolean var20 = var0.isFull((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);

  }

  public void test395() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test395");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var5 = var0.isFull();
    boolean var7 = var0.isFull((-1));
    boolean var10 = var0.insert(1, 10);
    boolean var13 = var0.insert(10, (-1));
    boolean var16 = var0.insert(10, 100);
    boolean var19 = var0.insert(10, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test396() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test396");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var6 = var0.insert(0, 100);
    boolean var8 = var0.isFull(0);
    boolean var10 = var0.isFull(0);
    boolean var12 = var0.isFull(1);
    boolean var15 = var0.insert(10, 1);
    boolean var16 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test397() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test397");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull((-1));
    boolean var8 = var0.isFull(1);
    boolean var9 = var0.isFull();
    boolean var11 = var0.isFull((-1));
    boolean var12 = var0.isFull();
    boolean var15 = var0.insert(10, 0);
    boolean var18 = var0.insert(1, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);

  }

  public void test398() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test398");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(0);
    boolean var6 = var0.isFull();
    boolean var8 = var0.isFull(100);
    boolean var9 = var0.isFull();
    boolean var10 = var0.isFull();
    boolean var12 = var0.isFull((-1));
    boolean var15 = var0.insert(100, 10);
    boolean var17 = var0.isFull(10);
    boolean var20 = var0.insert(1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test399() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test399");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull((-1));
    boolean var8 = var0.isFull(1);
    boolean var11 = var0.insert(10, (-1));
    boolean var14 = var0.insert(100, (-1));
    boolean var17 = var0.insert((-1), 0);
    boolean var20 = var0.insert(10, 1);
    boolean var23 = var0.insert(0, (-1));
    boolean var25 = var0.isFull(100);
    boolean var27 = var0.isFull(100);
    boolean var28 = var0.isFull();
    boolean var31 = var0.insert(1, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);

  }

  public void test400() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test400");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert((-1), 1);
    boolean var9 = var0.isFull(0);
    boolean var11 = var0.isFull(0);
    boolean var12 = var0.isFull();
    boolean var14 = var0.isFull(100);
    boolean var16 = var0.isFull(1);
    boolean var17 = var0.isFull();
    boolean var19 = var0.isFull((-1));
    boolean var20 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test401() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test401");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var6 = var0.insert(1, 100);
    boolean var8 = var0.isFull(0);
    boolean var9 = var0.isFull();
    boolean var11 = var0.isFull(1);
    boolean var13 = var0.isFull((-1));
    boolean var15 = var0.isFull(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test402() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test402");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var4 = var0.isFull();
    boolean var6 = var0.isFull(1);
    boolean var8 = var0.isFull(10);
    boolean var9 = var0.isFull();
    boolean var12 = var0.insert(1, (-1));
    boolean var15 = var0.insert(0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test403() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test403");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(0);
    boolean var8 = var0.insert(10, 10);
    boolean var11 = var0.insert(100, 1);
    boolean var12 = var0.isFull();
    boolean var15 = var0.insert(100, 0);
    boolean var16 = var0.isFull();
    boolean var19 = var0.insert((-1), 1);
    boolean var20 = var0.isFull();
    boolean var23 = var0.insert(0, 100);
    boolean var26 = var0.insert(100, 100);
    boolean var28 = var0.isFull(1);
    boolean var30 = var0.isFull((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);

  }

  public void test404() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test404");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull(10);
    boolean var8 = var0.isFull((-1));
    boolean var10 = var0.isFull(0);
    boolean var11 = var0.isFull();
    boolean var13 = var0.isFull(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test405() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test405");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var6 = var0.insert(0, 100);
    boolean var8 = var0.isFull(0);
    boolean var11 = var0.insert(100, 10);
    boolean var13 = var0.isFull(0);
    boolean var14 = var0.isFull();
    boolean var15 = var0.isFull();
    boolean var17 = var0.isFull(100);
    boolean var19 = var0.isFull(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);

  }

  public void test406() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test406");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert((-1), 1);
    boolean var10 = var0.insert(0, 100);
    boolean var11 = var0.isFull();
    boolean var12 = var0.isFull();
    boolean var14 = var0.isFull(10);
    boolean var17 = var0.insert(0, 1);
    boolean var20 = var0.insert(100, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test407() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test407");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull((-1));
    boolean var7 = var0.isFull();
    boolean var10 = var0.insert(1, 10);
    boolean var11 = var0.isFull();
    boolean var12 = var0.isFull();
    boolean var15 = var0.insert(0, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test408() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test408");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(0);
    boolean var8 = var0.insert(10, 10);
    boolean var11 = var0.insert(100, 1);
    boolean var12 = var0.isFull();
    boolean var15 = var0.insert(0, 10);
    boolean var17 = var0.isFull(1);
    boolean var18 = var0.isFull();
    boolean var21 = var0.insert(100, 100);
    boolean var24 = var0.insert(10, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test409() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test409");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert((-1), 1);
    boolean var9 = var0.isFull(0);
    boolean var11 = var0.isFull(0);
    boolean var13 = var0.isFull(1);
    boolean var14 = var0.isFull();
    boolean var15 = var0.isFull();
    boolean var16 = var0.isFull();
    boolean var18 = var0.isFull(10);
    boolean var20 = var0.isFull(1);
    boolean var23 = var0.insert((-1), (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test410() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test410");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var4 = var0.isFull();
    boolean var6 = var0.isFull(1);
    boolean var7 = var0.isFull();
    boolean var10 = var0.insert(10, 100);
    boolean var13 = var0.insert((-1), (-1));
    boolean var16 = var0.insert(10, 100);
    boolean var19 = var0.insert(0, (-1));
    boolean var22 = var0.insert((-1), (-1));
    boolean var24 = var0.isFull(100);
    boolean var27 = var0.insert((-1), 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test411() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test411");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(0);
    boolean var8 = var0.insert(10, 10);
    boolean var11 = var0.insert(100, 1);
    boolean var12 = var0.isFull();
    boolean var15 = var0.insert(10, 1);
    boolean var16 = var0.isFull();
    boolean var19 = var0.insert(0, (-1));
    boolean var20 = var0.isFull();
    boolean var22 = var0.isFull((-1));
    boolean var24 = var0.isFull((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);

  }

  public void test412() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test412");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(1);
    boolean var8 = var0.insert(0, 0);
    boolean var10 = var0.isFull(10);
    boolean var13 = var0.insert(1, 10);
    boolean var14 = var0.isFull();
    boolean var16 = var0.isFull(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);

  }

  public void test413() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test413");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(0);
    boolean var7 = var0.isFull((-1));
    boolean var10 = var0.insert(0, 10);
    boolean var11 = var0.isFull();
    boolean var13 = var0.isFull(100);
    boolean var14 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test414() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test414");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert(0, 1);
    boolean var8 = var0.isFull();
    boolean var11 = var0.insert(0, (-1));
    boolean var12 = var0.isFull();
    boolean var13 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test415() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test415");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull((-1));
    boolean var7 = var0.isFull();
    boolean var10 = var0.insert(1, 10);
    boolean var11 = var0.isFull();
    boolean var12 = var0.isFull();
    boolean var15 = var0.insert(10, 100);
    boolean var17 = var0.isFull(1);
    boolean var18 = var0.isFull();
    boolean var21 = var0.insert(10, 100);
    boolean var24 = var0.insert(10, (-1));
    boolean var27 = var0.insert(100, 10);
    boolean var30 = var0.insert((-1), 100);
    boolean var32 = var0.isFull(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);

  }

  public void test416() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test416");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(100);
    boolean var6 = var0.isFull();
    boolean var8 = var0.isFull(0);
    boolean var9 = var0.isFull();
    boolean var10 = var0.isFull();
    boolean var11 = var0.isFull();
    boolean var12 = var0.isFull();
    boolean var15 = var0.insert(10, (-1));
    boolean var18 = var0.insert(0, 0);
    boolean var20 = var0.isFull(10);
    boolean var23 = var0.insert((-1), (-1));
    boolean var25 = var0.isFull(10);
    boolean var27 = var0.isFull(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test417() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test417");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var3 = var0.isFull();
    boolean var6 = var0.insert(10, 1);
    boolean var9 = var0.insert((-1), 100);
    boolean var11 = var0.isFull(1);
    boolean var14 = var0.insert(100, (-1));
    boolean var15 = var0.isFull();
    boolean var18 = var0.insert(0, 1);
    boolean var20 = var0.isFull(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);

  }

  public void test418() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test418");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var6 = var0.insert(1, 100);
    boolean var8 = var0.isFull(0);
    boolean var10 = var0.isFull(10);
    boolean var13 = var0.insert(0, 100);
    boolean var15 = var0.isFull(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test419() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test419");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert((-1), 1);
    boolean var9 = var0.isFull(0);
    boolean var11 = var0.isFull(0);
    boolean var13 = var0.isFull(0);
    boolean var16 = var0.insert(10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test420() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test420");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(100, 1);
    boolean var4 = var0.isFull();
    boolean var5 = var0.isFull();
    boolean var8 = var0.insert(100, 1);
    boolean var10 = var0.isFull(100);
    boolean var13 = var0.insert((-1), (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test421() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test421");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert((-1), 1);
    boolean var10 = var0.insert(0, 100);
    boolean var11 = var0.isFull();
    boolean var12 = var0.isFull();
    boolean var14 = var0.isFull(10);
    boolean var15 = var0.isFull();
    boolean var17 = var0.isFull(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);

  }

  public void test422() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test422");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull((-1));
    boolean var8 = var0.isFull(1);
    boolean var11 = var0.insert(10, (-1));
    boolean var14 = var0.insert(100, (-1));
    boolean var15 = var0.isFull();
    boolean var18 = var0.insert(0, 10);
    boolean var21 = var0.insert(0, 10);
    boolean var22 = var0.isFull();
    boolean var25 = var0.insert(100, 100);
    boolean var28 = var0.insert((-1), 10);
    boolean var31 = var0.insert(0, 100);
    boolean var34 = var0.insert(0, (-1));
    boolean var37 = var0.insert(1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);

  }

  public void test423() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test423");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert((-1), 1);
    boolean var8 = var0.isFull();
    boolean var11 = var0.insert(0, (-1));
    boolean var12 = var0.isFull();
    boolean var14 = var0.isFull(0);
    boolean var15 = var0.isFull();
    boolean var16 = var0.isFull();
    boolean var19 = var0.insert(10, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test424() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test424");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var6 = var0.insert(0, 100);
    boolean var8 = var0.isFull((-1));
    boolean var10 = var0.isFull((-1));
    boolean var12 = var0.isFull((-1));
    boolean var15 = var0.insert(100, 10);
    boolean var18 = var0.insert(10, 0);
    boolean var20 = var0.isFull(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test425() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test425");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert((-1), 1);
    boolean var8 = var0.isFull();
    boolean var10 = var0.isFull(100);
    boolean var11 = var0.isFull();
    boolean var14 = var0.insert(1, (-1));
    boolean var17 = var0.insert(10, 100);
    boolean var19 = var0.isFull(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);

  }

  public void test426() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test426");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var6 = var0.insert(1, 100);
    boolean var8 = var0.isFull(0);
    boolean var11 = var0.insert(100, 100);
    boolean var13 = var0.isFull((-1));
    boolean var16 = var0.insert(0, (-1));
    boolean var17 = var0.isFull();
    boolean var20 = var0.insert(100, (-1));
    boolean var23 = var0.insert(1, 0);
    boolean var26 = var0.insert(10, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test427() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test427");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(0);
    boolean var7 = var0.isFull((-1));
    boolean var10 = var0.insert(100, 1);
    boolean var11 = var0.isFull();
    boolean var14 = var0.insert(0, 10);
    boolean var17 = var0.insert(100, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test428() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test428");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var4 = var0.isFull();
    boolean var6 = var0.isFull(1);
    boolean var9 = var0.insert(0, (-1));
    boolean var12 = var0.insert((-1), 10);
    boolean var13 = var0.isFull();
    boolean var14 = var0.isFull();
    boolean var15 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test429() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test429");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var5 = var0.isFull();
    boolean var7 = var0.isFull(0);
    boolean var10 = var0.insert(100, 1);
    boolean var12 = var0.isFull(0);
    boolean var14 = var0.isFull(100);
    boolean var15 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test430() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test430");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull((-1));
    boolean var8 = var0.isFull(1);
    boolean var11 = var0.insert(10, (-1));
    boolean var14 = var0.insert(100, (-1));
    boolean var16 = var0.isFull(1);
    boolean var17 = var0.isFull();
    boolean var18 = var0.isFull();
    boolean var20 = var0.isFull(1);
    boolean var22 = var0.isFull(100);
    boolean var24 = var0.isFull((-1));
    boolean var26 = var0.isFull(100);
    boolean var28 = var0.isFull((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);

  }

  public void test431() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test431");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull((-1));
    boolean var8 = var0.isFull(1);
    boolean var9 = var0.isFull();
    boolean var11 = var0.isFull((-1));
    boolean var14 = var0.insert((-1), 100);
    boolean var15 = var0.isFull();
    boolean var18 = var0.insert(0, (-1));
    boolean var19 = var0.isFull();
    boolean var21 = var0.isFull((-1));
    boolean var23 = var0.isFull((-1));
    boolean var25 = var0.isFull(0);
    boolean var26 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test432() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test432");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert(0, 1);
    boolean var8 = var0.isFull();
    boolean var9 = var0.isFull();
    boolean var11 = var0.isFull(10);
    boolean var13 = var0.isFull(1);
    boolean var16 = var0.insert(0, 10);
    boolean var17 = var0.isFull();
    boolean var19 = var0.isFull((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);

  }

  public void test433() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test433");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(0);
    boolean var8 = var0.insert(10, 10);
    boolean var11 = var0.insert(100, 1);
    boolean var12 = var0.isFull();
    boolean var15 = var0.insert(0, 10);
    boolean var17 = var0.isFull((-1));
    boolean var18 = var0.isFull();
    boolean var21 = var0.insert(10, 0);
    boolean var22 = var0.isFull();
    boolean var23 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test434() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test434");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull((-1));
    boolean var8 = var0.isFull(1);
    boolean var11 = var0.insert(10, (-1));
    boolean var14 = var0.insert(100, (-1));
    boolean var16 = var0.isFull(100);
    boolean var19 = var0.insert(0, 0);
    boolean var22 = var0.insert(0, 0);
    boolean var24 = var0.isFull((-1));
    boolean var27 = var0.insert(1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test435() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test435");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull((-1));
    boolean var8 = var0.isFull(1);
    boolean var11 = var0.insert(10, (-1));
    boolean var14 = var0.insert(100, (-1));
    boolean var16 = var0.isFull(1);
    boolean var17 = var0.isFull();
    boolean var20 = var0.insert((-1), 100);
    boolean var23 = var0.insert(10, (-1));
    boolean var26 = var0.insert((-1), 10);
    boolean var28 = var0.isFull(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test436() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test436");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(0);
    boolean var8 = var0.insert(10, 10);
    boolean var11 = var0.insert(100, 1);
    boolean var12 = var0.isFull();
    boolean var15 = var0.insert(100, 0);
    boolean var16 = var0.isFull();
    boolean var19 = var0.insert((-1), 1);
    boolean var20 = var0.isFull();
    boolean var21 = var0.isFull();
    boolean var22 = var0.isFull();
    boolean var23 = var0.isFull();
    boolean var25 = var0.isFull(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);

  }

  public void test437() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test437");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull((-1));
    boolean var7 = var0.isFull();
    boolean var10 = var0.insert(1, 10);
    boolean var11 = var0.isFull();
    boolean var12 = var0.isFull();
    boolean var15 = var0.insert(10, 100);
    boolean var18 = var0.insert(100, 1);
    boolean var20 = var0.isFull(100);
    boolean var23 = var0.insert((-1), 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test438() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test438");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert((-1), 1);
    boolean var8 = var0.isFull();
    boolean var11 = var0.insert(100, 0);
    boolean var13 = var0.isFull(10);
    boolean var16 = var0.insert(1, (-1));
    boolean var19 = var0.insert(0, 1);
    boolean var21 = var0.isFull(10);
    boolean var23 = var0.isFull(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);

  }

  public void test439() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test439");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 10);
    boolean var6 = var0.insert(10, (-1));
    boolean var9 = var0.insert(0, 0);
    boolean var10 = var0.isFull();
    boolean var11 = var0.isFull();
    boolean var12 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test440() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test440");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(0);
    boolean var7 = var0.isFull((-1));
    boolean var10 = var0.insert(100, 100);
    boolean var13 = var0.insert(1, 1);
    boolean var15 = var0.isFull(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test441() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test441");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert((-1), 1);
    boolean var10 = var0.insert(100, 100);
    boolean var11 = var0.isFull();
    boolean var13 = var0.isFull(0);
    boolean var16 = var0.insert(1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);

  }

  public void test442() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test442");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var6 = var0.insert(0, 100);
    boolean var8 = var0.isFull(0);
    boolean var10 = var0.isFull(0);
    boolean var12 = var0.isFull(1);
    boolean var15 = var0.insert(10, 1);
    boolean var17 = var0.isFull(0);
    boolean var20 = var0.insert(100, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test443() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test443");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert(0, 1);
    boolean var8 = var0.isFull();
    boolean var9 = var0.isFull();
    boolean var10 = var0.isFull();
    boolean var13 = var0.insert(100, 0);
    boolean var16 = var0.insert(0, 10);
    boolean var18 = var0.isFull(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test444() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test444");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull((-1));
    boolean var8 = var0.isFull(1);
    boolean var11 = var0.insert(10, (-1));
    boolean var14 = var0.insert(100, (-1));
    boolean var17 = var0.insert((-1), 0);
    boolean var20 = var0.insert(10, 1);
    boolean var23 = var0.insert(0, (-1));
    boolean var26 = var0.insert(100, 0);
    boolean var27 = var0.isFull();
    boolean var29 = var0.isFull(100);
    boolean var30 = var0.isFull();
    boolean var32 = var0.isFull(100);
    boolean var34 = var0.isFull(1);
    boolean var36 = var0.isFull((-1));
    boolean var38 = var0.isFull(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);

  }

  public void test445() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test445");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var3 = var0.isFull();
    boolean var6 = var0.insert(0, 10);
    boolean var7 = var0.isFull();
    boolean var9 = var0.isFull((-1));
    boolean var11 = var0.isFull((-1));
    boolean var14 = var0.insert(10, 0);
    boolean var15 = var0.isFull();
    boolean var17 = var0.isFull(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);

  }

  public void test446() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test446");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert(0, 10);
    boolean var8 = var0.isFull();
    boolean var10 = var0.isFull(1);
    boolean var12 = var0.isFull(100);
    boolean var13 = var0.isFull();
    boolean var15 = var0.isFull(100);
    boolean var18 = var0.insert(100, 100);
    boolean var20 = var0.isFull(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);

  }

  public void test447() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test447");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var6 = var0.insert(0, 100);
    boolean var8 = var0.isFull((-1));
    boolean var10 = var0.isFull(0);
    boolean var13 = var0.insert((-1), 0);
    boolean var16 = var0.insert(0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test448() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test448");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert(0, 1);
    boolean var8 = var0.isFull();
    boolean var9 = var0.isFull();
    boolean var10 = var0.isFull();
    boolean var12 = var0.isFull(0);
    boolean var13 = var0.isFull();
    boolean var15 = var0.isFull((-1));
    boolean var17 = var0.isFull((-1));
    boolean var18 = var0.isFull();
    boolean var20 = var0.isFull((-1));
    boolean var22 = var0.isFull(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test449() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test449");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var3 = var0.isFull();
    boolean var5 = var0.isFull((-1));
    boolean var7 = var0.isFull(1);
    boolean var8 = var0.isFull();
    boolean var9 = var0.isFull();
    boolean var11 = var0.isFull(10);
    boolean var13 = var0.isFull(100);
    boolean var15 = var0.isFull((-1));
    boolean var18 = var0.insert(100, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test450() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test450");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(0);
    boolean var7 = var0.isFull(10);
    boolean var10 = var0.insert(1, 1);
    boolean var12 = var0.isFull(0);
    boolean var15 = var0.insert(0, 100);
    boolean var18 = var0.insert(10, 100);
    boolean var20 = var0.isFull(100);
    boolean var22 = var0.isFull(10);
    boolean var25 = var0.insert(1, (-1));
    boolean var28 = var0.insert((-1), 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test451() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test451");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var3 = var0.isFull();
    boolean var5 = var0.isFull((-1));
    boolean var7 = var0.isFull(1);
    boolean var10 = var0.insert(1, 10);
    boolean var11 = var0.isFull();
    boolean var14 = var0.insert(100, 1);
    boolean var17 = var0.insert(100, 0);
    boolean var18 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test452() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test452");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert((-1), 1);
    boolean var9 = var0.isFull(0);
    boolean var11 = var0.isFull(0);
    boolean var12 = var0.isFull();
    boolean var14 = var0.isFull(100);
    boolean var16 = var0.isFull(1);
    boolean var18 = var0.isFull(1);
    boolean var19 = var0.isFull();
    boolean var20 = var0.isFull();
    boolean var22 = var0.isFull(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test453() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test453");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(100, 1);
    boolean var6 = var0.insert(0, 0);
    boolean var7 = var0.isFull();
    boolean var10 = var0.insert(1, (-1));
    boolean var13 = var0.insert(1, 10);
    boolean var15 = var0.isFull(0);
    boolean var17 = var0.isFull(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);

  }

  public void test454() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test454");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var5 = var0.isFull();
    boolean var7 = var0.isFull((-1));
    boolean var9 = var0.isFull(1);
    boolean var12 = var0.insert(1, 1);
    boolean var13 = var0.isFull();
    boolean var14 = var0.isFull();
    boolean var16 = var0.isFull(0);
    boolean var17 = var0.isFull();
    boolean var20 = var0.insert(0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test455() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test455");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert((-1), 1);
    boolean var8 = var0.isFull();
    boolean var10 = var0.isFull(100);
    boolean var12 = var0.isFull(0);
    boolean var14 = var0.isFull(10);
    boolean var15 = var0.isFull();
    boolean var17 = var0.isFull(0);
    boolean var19 = var0.isFull(100);
    boolean var20 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test456() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test456");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var6 = var0.insert(1, 100);
    boolean var8 = var0.isFull(0);
    boolean var11 = var0.insert(100, 100);
    boolean var13 = var0.isFull(100);
    boolean var14 = var0.isFull();
    boolean var16 = var0.isFull(10);
    boolean var18 = var0.isFull((-1));
    boolean var19 = var0.isFull();
    boolean var21 = var0.isFull(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);

  }

  public void test457() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test457");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(100);
    boolean var6 = var0.isFull();
    boolean var8 = var0.isFull(0);
    boolean var9 = var0.isFull();
    boolean var10 = var0.isFull();
    boolean var11 = var0.isFull();
    boolean var12 = var0.isFull();
    boolean var15 = var0.insert(10, (-1));
    boolean var16 = var0.isFull();
    boolean var19 = var0.insert((-1), (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test458() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test458");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(0);
    boolean var8 = var0.insert(10, 10);
    boolean var11 = var0.insert(100, 1);
    boolean var12 = var0.isFull();
    boolean var15 = var0.insert(100, 1);
    boolean var17 = var0.isFull(0);
    boolean var18 = var0.isFull();
    boolean var20 = var0.isFull(1);
    boolean var23 = var0.insert(1, 10);
    boolean var24 = var0.isFull();
    boolean var26 = var0.isFull(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);

  }

  public void test459() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test459");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert((-1), 1);
    boolean var9 = var0.isFull(0);
    boolean var11 = var0.isFull(0);
    boolean var13 = var0.isFull(1);
    boolean var14 = var0.isFull();
    boolean var15 = var0.isFull();
    boolean var18 = var0.insert(10, 0);
    boolean var19 = var0.isFull();
    boolean var21 = var0.isFull(100);
    boolean var24 = var0.insert(100, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test460() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test460");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var6 = var0.insert(1, 100);
    boolean var8 = var0.isFull(0);
    boolean var11 = var0.insert(100, 100);
    boolean var13 = var0.isFull((-1));
    boolean var16 = var0.insert(0, (-1));
    boolean var17 = var0.isFull();
    boolean var20 = var0.insert(100, (-1));
    boolean var23 = var0.insert((-1), (-1));
    boolean var24 = var0.isFull();
    boolean var25 = var0.isFull();
    boolean var27 = var0.isFull(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test461() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test461");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull((-1));
    boolean var8 = var0.isFull(1);
    boolean var11 = var0.insert(10, (-1));
    boolean var13 = var0.isFull(100);
    boolean var14 = var0.isFull();
    boolean var15 = var0.isFull();
    boolean var17 = var0.isFull(10);
    boolean var19 = var0.isFull((-1));
    boolean var20 = var0.isFull();
    boolean var23 = var0.insert(10, 1);
    boolean var25 = var0.isFull(1);
    boolean var28 = var0.insert(100, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test462() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test462");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert(0, 1);
    boolean var8 = var0.isFull();
    boolean var9 = var0.isFull();
    boolean var10 = var0.isFull();
    boolean var13 = var0.insert(1, 1);
    boolean var16 = var0.insert(0, 0);
    boolean var18 = var0.isFull(10);
    boolean var19 = var0.isFull();
    boolean var21 = var0.isFull(10);
    boolean var23 = var0.isFull(1);
    boolean var26 = var0.insert((-1), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test463() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test463");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(0);
    boolean var6 = var0.isFull();
    boolean var8 = var0.isFull(100);
    boolean var9 = var0.isFull();
    boolean var11 = var0.isFull(0);
    boolean var14 = var0.insert((-1), 0);
    boolean var15 = var0.isFull();
    boolean var16 = var0.isFull();
    boolean var17 = var0.isFull();
    boolean var20 = var0.insert((-1), 0);
    boolean var23 = var0.insert(0, (-1));
    boolean var25 = var0.isFull(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);

  }

  public void test464() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test464");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert(0, 1);
    boolean var8 = var0.isFull();
    boolean var9 = var0.isFull();
    boolean var10 = var0.isFull();
    boolean var13 = var0.insert(1, 1);
    boolean var15 = var0.isFull(10);
    boolean var18 = var0.insert(100, 100);
    boolean var19 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test465() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test465");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull((-1));
    boolean var8 = var0.isFull(1);
    boolean var9 = var0.isFull();
    boolean var11 = var0.isFull((-1));
    boolean var12 = var0.isFull();
    boolean var15 = var0.insert(1, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test466() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test466");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var5 = var0.insert(100, 1);
    boolean var6 = var0.isFull();
    boolean var8 = var0.isFull((-1));
    boolean var9 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test467() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test467");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull(10);
    boolean var8 = var0.isFull((-1));
    boolean var9 = var0.isFull();
    boolean var10 = var0.isFull();
    boolean var11 = var0.isFull();
    boolean var12 = var0.isFull();
    boolean var15 = var0.insert(10, 0);
    boolean var16 = var0.isFull();
    boolean var17 = var0.isFull();
    boolean var19 = var0.isFull(10);
    boolean var22 = var0.insert(0, 1);
    boolean var25 = var0.insert(100, 0);
    boolean var28 = var0.insert(10, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test468() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test468");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert(0, 1);
    boolean var8 = var0.isFull();
    boolean var9 = var0.isFull();
    boolean var10 = var0.isFull();
    boolean var12 = var0.isFull(0);
    boolean var13 = var0.isFull();
    boolean var15 = var0.isFull((-1));
    boolean var17 = var0.isFull((-1));
    boolean var18 = var0.isFull();
    boolean var20 = var0.isFull((-1));
    boolean var21 = var0.isFull();
    boolean var23 = var0.isFull((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);

  }

  public void test469() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test469");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull((-1));
    boolean var8 = var0.isFull(1);
    boolean var9 = var0.isFull();
    boolean var11 = var0.isFull((-1));
    boolean var14 = var0.insert((-1), 100);
    boolean var16 = var0.isFull(100);
    boolean var17 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test470() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test470");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(0);
    boolean var8 = var0.insert(10, 10);
    boolean var11 = var0.insert(100, 1);
    boolean var13 = var0.isFull((-1));
    boolean var14 = var0.isFull();
    boolean var16 = var0.isFull(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);

  }

  public void test471() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test471");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var3 = var0.isFull();
    boolean var4 = var0.isFull();
    boolean var6 = var0.isFull(100);
    boolean var8 = var0.isFull(0);
    boolean var11 = var0.insert((-1), 0);
    boolean var13 = var0.isFull(0);
    boolean var16 = var0.insert(1, 1);
    boolean var17 = var0.isFull();
    boolean var18 = var0.isFull();
    boolean var21 = var0.insert(1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);

  }

  public void test472() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test472");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 10);
    boolean var5 = var0.isFull(1);
    boolean var8 = var0.insert(0, 100);
    boolean var10 = var0.isFull((-1));
    boolean var11 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test473() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test473");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull((-1));
    boolean var8 = var0.isFull(1);
    boolean var11 = var0.insert(10, (-1));
    boolean var14 = var0.insert(100, (-1));
    boolean var15 = var0.isFull();
    boolean var18 = var0.insert(0, 10);
    boolean var19 = var0.isFull();
    boolean var22 = var0.insert(0, 1);
    boolean var23 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test474() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test474");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var6 = var0.insert(1, 100);
    boolean var9 = var0.insert(1, 1);
    boolean var11 = var0.isFull(100);
    boolean var14 = var0.insert((-1), (-1));
    boolean var16 = var0.isFull(100);
    boolean var17 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test475() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test475");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert((-1), 1);
    boolean var9 = var0.isFull(0);
    boolean var11 = var0.isFull(0);
    boolean var12 = var0.isFull();
    boolean var14 = var0.isFull(100);
    boolean var17 = var0.insert((-1), 1);
    boolean var19 = var0.isFull(10);
    boolean var21 = var0.isFull(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test476() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test476");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(0);
    boolean var8 = var0.insert(10, 10);
    boolean var11 = var0.insert(100, 1);
    boolean var12 = var0.isFull();
    boolean var15 = var0.insert(100, 0);
    boolean var16 = var0.isFull();
    boolean var19 = var0.insert(1, 1);
    boolean var20 = var0.isFull();
    boolean var23 = var0.insert(100, 1);
    boolean var24 = var0.isFull();
    boolean var26 = var0.isFull(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test477() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test477");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert((-1), 1);
    boolean var9 = var0.isFull(0);
    boolean var11 = var0.isFull(0);
    boolean var13 = var0.isFull(1);
    boolean var15 = var0.isFull(100);
    boolean var16 = var0.isFull();
    boolean var19 = var0.insert(0, 0);
    boolean var22 = var0.insert(100, 10);
    boolean var25 = var0.insert(0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);

  }

  public void test478() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test478");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var4 = var0.isFull();
    boolean var6 = var0.isFull(1);
    boolean var7 = var0.isFull();
    boolean var10 = var0.insert(10, 100);
    boolean var13 = var0.insert((-1), (-1));
    boolean var16 = var0.insert(10, 100);
    boolean var19 = var0.insert(0, (-1));
    boolean var22 = var0.insert((-1), (-1));
    boolean var23 = var0.isFull();
    boolean var24 = var0.isFull();
    boolean var26 = var0.isFull(0);
    boolean var27 = var0.isFull();
    boolean var28 = var0.isFull();
    boolean var29 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test479() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test479");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull((-1));
    boolean var8 = var0.isFull(1);
    boolean var11 = var0.insert(10, (-1));
    boolean var14 = var0.insert(100, (-1));
    boolean var17 = var0.insert((-1), 0);
    boolean var20 = var0.insert(10, 1);
    boolean var23 = var0.insert(0, (-1));
    boolean var25 = var0.isFull(100);
    boolean var27 = var0.isFull(10);
    boolean var30 = var0.insert(0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);

  }

  public void test480() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test480");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var5 = var0.insert(0, 1);
    boolean var8 = var0.insert(10, (-1));
    boolean var10 = var0.isFull(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test481() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test481");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert(0, 1);
    boolean var10 = var0.insert(10, (-1));
    boolean var11 = var0.isFull();
    boolean var13 = var0.isFull(0);
    boolean var16 = var0.insert((-1), 100);
    boolean var19 = var0.insert(0, 10);
    boolean var22 = var0.insert(100, 1);
    boolean var25 = var0.insert((-1), 10);
    boolean var26 = var0.isFull();
    boolean var29 = var0.insert(10, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test482() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test482");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(0);
    boolean var8 = var0.insert(10, 10);
    boolean var11 = var0.insert(100, 1);
    boolean var12 = var0.isFull();
    boolean var15 = var0.insert(10, 1);
    boolean var16 = var0.isFull();
    boolean var17 = var0.isFull();
    boolean var19 = var0.isFull(0);
    boolean var21 = var0.isFull(100);
    boolean var23 = var0.isFull(0);
    boolean var26 = var0.insert(0, 10);
    boolean var28 = var0.isFull((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);

  }

  public void test483() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test483");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var5 = var0.isFull(0);
    boolean var8 = var0.insert(10, 10);
    boolean var11 = var0.insert(100, 1);
    boolean var12 = var0.isFull();
    boolean var15 = var0.insert(100, 1);
    boolean var17 = var0.isFull(0);
    boolean var18 = var0.isFull();
    boolean var21 = var0.insert((-1), (-1));
    boolean var23 = var0.isFull((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);

  }

  public void test484() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test484");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var6 = var0.insert(0, 100);
    boolean var8 = var0.isFull(100);
    boolean var11 = var0.insert(1, 100);
    boolean var12 = var0.isFull();
    boolean var15 = var0.insert(1, 0);
    boolean var18 = var0.insert(100, 1);
    boolean var19 = var0.isFull();
    boolean var22 = var0.insert(0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);

  }

  public void test485() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test485");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert((-1), 1);
    boolean var9 = var0.isFull(0);
    boolean var11 = var0.isFull(0);
    boolean var13 = var0.isFull(1);
    boolean var15 = var0.isFull(100);
    boolean var16 = var0.isFull();
    boolean var19 = var0.insert(0, 0);
    boolean var21 = var0.isFull(1);
    boolean var23 = var0.isFull(0);
    boolean var24 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test486() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test486");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull((-1));
    boolean var8 = var0.isFull(1);
    boolean var11 = var0.insert(10, (-1));
    boolean var13 = var0.isFull(0);
    boolean var15 = var0.isFull(10);
    boolean var18 = var0.insert(10, 10);
    boolean var19 = var0.isFull();
    boolean var21 = var0.isFull(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test487() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test487");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var3 = var0.isFull();
    boolean var6 = var0.insert(0, 10);
    boolean var8 = var0.isFull(100);
    boolean var11 = var0.insert(1, 1);
    boolean var14 = var0.insert((-1), 0);
    boolean var17 = var0.insert(10, 0);
    boolean var19 = var0.isFull(10);
    boolean var22 = var0.insert((-1), 1);
    boolean var25 = var0.insert(0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);

  }

  public void test488() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test488");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull((-1));
    boolean var8 = var0.isFull(1);
    boolean var9 = var0.isFull();
    boolean var11 = var0.isFull((-1));
    boolean var14 = var0.insert((-1), 100);
    boolean var15 = var0.isFull();
    boolean var16 = var0.isFull();
    boolean var19 = var0.insert(10, (-1));
    boolean var22 = var0.insert((-1), 1);
    boolean var23 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test489() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test489");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var6 = var0.insert(1, 10);
    boolean var9 = var0.insert(0, 0);
    boolean var11 = var0.isFull(0);
    boolean var12 = var0.isFull();
    boolean var15 = var0.insert(1, 1);
    boolean var16 = var0.isFull();
    boolean var18 = var0.isFull(1);
    boolean var21 = var0.insert(0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test490() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test490");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var4 = var0.isFull();
    boolean var6 = var0.isFull(1);
    boolean var7 = var0.isFull();
    boolean var10 = var0.insert(10, 100);
    boolean var11 = var0.isFull();
    boolean var13 = var0.isFull(100);
    boolean var16 = var0.insert(100, 1);
    boolean var17 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test491() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test491");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var6 = var0.insert(0, 100);
    boolean var8 = var0.isFull((-1));
    boolean var10 = var0.isFull(10);
    boolean var11 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test492() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test492");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert((-1), 1);
    boolean var9 = var0.isFull((-1));
    boolean var12 = var0.insert(0, 1);
    boolean var15 = var0.insert(100, 0);
    boolean var17 = var0.isFull(1);
    boolean var18 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test493() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test493");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var5 = var0.isFull();
    boolean var7 = var0.isFull(0);
    boolean var10 = var0.insert(100, 1);
    boolean var13 = var0.insert(100, (-1));
    boolean var15 = var0.isFull(0);
    boolean var18 = var0.insert(1, 10);
    boolean var20 = var0.isFull(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);

  }

  public void test494() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test494");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull((-1));
    boolean var8 = var0.isFull(1);
    boolean var11 = var0.insert(10, (-1));
    boolean var14 = var0.insert(100, (-1));
    boolean var16 = var0.isFull(100);
    boolean var19 = var0.insert(0, 0);
    boolean var20 = var0.isFull();
    boolean var23 = var0.insert(100, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test495() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test495");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull((-1));
    boolean var8 = var0.isFull(1);
    boolean var9 = var0.isFull();
    boolean var11 = var0.isFull((-1));
    boolean var12 = var0.isFull();
    boolean var14 = var0.isFull(100);
    boolean var17 = var0.insert(100, 0);
    boolean var20 = var0.insert((-1), 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test496() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test496");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var6 = var0.isFull(10);
    boolean var9 = var0.insert(10, 1);
    boolean var12 = var0.insert((-1), (-1));
    boolean var15 = var0.insert(1, 10);
    boolean var16 = var0.isFull();
    boolean var18 = var0.isFull(10);
    boolean var20 = var0.isFull((-1));
    boolean var22 = var0.isFull(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test497() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test497");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert((-1), 1);
    boolean var8 = var0.isFull();
    boolean var10 = var0.isFull(100);
    boolean var11 = var0.isFull();
    boolean var14 = var0.insert(1, (-1));
    boolean var17 = var0.insert(10, 100);
    boolean var19 = var0.isFull(1);
    boolean var22 = var0.insert(1, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test498() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test498");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert(0, 1);
    boolean var8 = var0.isFull();
    boolean var9 = var0.isFull();
    boolean var10 = var0.isFull();
    boolean var13 = var0.insert(1, 1);
    boolean var16 = var0.insert((-1), 1);
    boolean var18 = var0.isFull(10);
    boolean var20 = var0.isFull(100);
    boolean var22 = var0.isFull(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);

  }

  public void test499() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test499");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var3 = var0.insert(10, 0);
    boolean var6 = var0.insert(1, 10);
    boolean var9 = var0.insert(0, 0);
    boolean var11 = var0.isFull(0);
    boolean var12 = var0.isFull();
    boolean var15 = var0.insert(1, 1);
    boolean var16 = var0.isFull();
    boolean var18 = var0.isFull(1);
    boolean var21 = var0.insert(10, 10);
    boolean var22 = var0.isFull();
    boolean var24 = var0.isFull(100);
    boolean var26 = var0.isFull(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test500() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test500");


    java_testing.Magazzino var0 = new java_testing.Magazzino();
    boolean var2 = var0.isFull(1);
    boolean var4 = var0.isFull(10);
    boolean var7 = var0.insert((-1), 1);
    boolean var8 = var0.isFull();
    boolean var11 = var0.insert(100, 0);
    boolean var14 = var0.insert(100, 1);
    boolean var15 = var0.isFull();
    boolean var17 = var0.isFull(100);
    boolean var19 = var0.isFull(100);
    boolean var20 = var0.isFull();
    boolean var23 = var0.insert(10, 1);
    boolean var24 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

}