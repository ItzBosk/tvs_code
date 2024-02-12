package randoop;

import junit.framework.*;

public class RandoopTest3 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test1");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor(1, 10);
    java.lang.String var7 = var0.toString();
    boolean var10 = var0.changecolor(0, 1);
    boolean var13 = var0.changecolor(10, 1);
    java.lang.String var14 = var0.toString();
    java.lang.String var15 = var0.toString();
    boolean var18 = var0.changecolor((-1), (-1));
    boolean var21 = var0.changecolor(0, 0);
    java.lang.String var22 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "RR"+ "'", var14.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "RR"+ "'", var15.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "VR"+ "'", var22.equals("VR"));

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test2");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    boolean var5 = var0.changecolor(0, 0);
    java.lang.String var6 = var0.toString();
    java.lang.String var7 = var0.toString();
    java.lang.String var8 = var0.toString();
    boolean var11 = var0.changecolor(10, 1);
    boolean var14 = var0.changecolor(100, 100);
    java.lang.String var15 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "VR"+ "'", var6.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "VR"+ "'", var7.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "VR"+ "'", var8.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "VR"+ "'", var15.equals("VR"));

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test3");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor((-1), 10);
    boolean var9 = var0.changecolor(0, (-1));
    java.lang.String var10 = var0.toString();
    boolean var13 = var0.changecolor(1, 100);
    java.lang.String var14 = var0.toString();
    java.lang.String var15 = var0.toString();
    boolean var18 = var0.changecolor(10, 10);
    boolean var21 = var0.changecolor((-1), 10);
    boolean var24 = var0.changecolor((-1), 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "RR"+ "'", var10.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "RR"+ "'", var14.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "RR"+ "'", var15.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test4");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor((-1), 10);
    java.lang.String var8 = var0.toString();
    boolean var11 = var0.changecolor(100, 0);
    boolean var14 = var0.changecolor(1, 1);
    boolean var17 = var0.changecolor((-1), 100);
    boolean var20 = var0.changecolor(100, 100);
    boolean var23 = var0.changecolor(1, 0);
    java.lang.String var24 = var0.toString();
    boolean var27 = var0.changecolor(100, 0);
    java.lang.String var28 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "RV"+ "'", var24.equals("RV"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "RV"+ "'", var28.equals("RV"));

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test5");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor((-1), 10);
    boolean var10 = var0.changecolor((-1), 1);
    boolean var13 = var0.changecolor((-1), 0);
    boolean var16 = var0.changecolor(0, 1);
    boolean var19 = var0.changecolor(100, 10);
    java.lang.String var20 = var0.toString();
    boolean var23 = var0.changecolor((-1), 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
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
    assertTrue("'" + var20 + "' != '" + "RR"+ "'", var20.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test6");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor((-1), 10);
    boolean var9 = var0.changecolor(0, (-1));
    java.lang.String var10 = var0.toString();
    boolean var13 = var0.changecolor(1, 100);
    java.lang.String var14 = var0.toString();
    boolean var17 = var0.changecolor(0, 100);
    boolean var20 = var0.changecolor(0, 10);
    boolean var23 = var0.changecolor(10, 100);
    boolean var26 = var0.changecolor(10, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "RR"+ "'", var10.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "RR"+ "'", var14.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test7");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(1, 1);
    boolean var7 = var0.changecolor((-1), 1);
    java.lang.String var8 = var0.toString();
    java.lang.String var9 = var0.toString();
    boolean var12 = var0.changecolor(100, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "RR"+ "'", var9.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test8");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    boolean var5 = var0.changecolor(0, 0);
    java.lang.String var6 = var0.toString();
    boolean var9 = var0.changecolor(10, (-1));
    java.lang.String var10 = var0.toString();
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.toString();
    java.lang.String var13 = var0.toString();
    boolean var16 = var0.changecolor(1, 0);
    java.lang.String var17 = var0.toString();
    java.lang.String var18 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "VR"+ "'", var6.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "VR"+ "'", var10.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "VR"+ "'", var11.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "VR"+ "'", var12.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "VR"+ "'", var13.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "VR"+ "'", var17.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "VR"+ "'", var18.equals("VR"));

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test9");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor((-1), 10);
    boolean var10 = var0.changecolor(10, 0);
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.toString();
    java.lang.String var13 = var0.toString();
    java.lang.String var14 = var0.toString();
    java.lang.String var15 = var0.toString();
    boolean var18 = var0.changecolor((-1), 0);
    boolean var21 = var0.changecolor(100, 0);
    boolean var24 = var0.changecolor(0, 1);
    java.lang.String var25 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "RR"+ "'", var12.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "RR"+ "'", var13.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "RR"+ "'", var14.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "RR"+ "'", var15.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "RR"+ "'", var25.equals("RR"));

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test10");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    boolean var6 = var0.changecolor(0, 1);
    java.lang.String var7 = var0.toString();
    boolean var10 = var0.changecolor((-1), 1);
    boolean var13 = var0.changecolor((-1), 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test11");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    java.lang.String var5 = var0.toString();
    boolean var8 = var0.changecolor((-1), 0);
    java.lang.String var9 = var0.toString();
    boolean var12 = var0.changecolor(10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "RR"+ "'", var5.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "RR"+ "'", var9.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test12");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    boolean var6 = var0.changecolor((-1), 0);
    boolean var9 = var0.changecolor(1, 10);
    boolean var12 = var0.changecolor(1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test13");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    java.lang.String var4 = var0.toString();
    boolean var7 = var0.changecolor(10, 1);
    java.lang.String var8 = var0.toString();
    boolean var11 = var0.changecolor(10, 1);
    boolean var14 = var0.changecolor(1, 1);
    boolean var17 = var0.changecolor(0, 100);
    boolean var20 = var0.changecolor(100, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "RR"+ "'", var4.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test14");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    java.lang.String var4 = var0.toString();
    boolean var7 = var0.changecolor(1, (-1));
    java.lang.String var8 = var0.toString();
    boolean var11 = var0.changecolor(10, 10);
    boolean var14 = var0.changecolor(1, 0);
    boolean var17 = var0.changecolor((-1), (-1));
    boolean var20 = var0.changecolor(10, 10);
    boolean var23 = var0.changecolor(1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "RR"+ "'", var4.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test15");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    boolean var6 = var0.changecolor(0, 1);
    boolean var9 = var0.changecolor(100, 0);
    java.lang.String var10 = var0.toString();
    boolean var13 = var0.changecolor(1, (-1));
    java.lang.String var14 = var0.toString();
    java.lang.String var15 = var0.toString();
    java.lang.String var16 = var0.toString();
    java.lang.String var17 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "RR"+ "'", var10.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "RR"+ "'", var14.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "RR"+ "'", var15.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "RR"+ "'", var16.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "RR"+ "'", var17.equals("RR"));

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test16");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor((-1), 10);
    boolean var10 = var0.changecolor(10, 0);
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.toString();
    java.lang.String var13 = var0.toString();
    boolean var16 = var0.changecolor((-1), 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "RR"+ "'", var12.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "RR"+ "'", var13.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test17");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    boolean var6 = var0.changecolor(10, 10);
    java.lang.String var7 = var0.toString();
    java.lang.String var8 = var0.toString();
    boolean var11 = var0.changecolor((-1), (-1));
    boolean var14 = var0.changecolor(1, 10);
    boolean var17 = var0.changecolor(0, 0);
    boolean var20 = var0.changecolor(10, 100);
    boolean var23 = var0.changecolor(100, 0);
    java.lang.String var24 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "VR"+ "'", var24.equals("VR"));

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test18");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor((-1), 10);
    java.lang.String var7 = var0.toString();
    java.lang.String var8 = var0.toString();
    boolean var11 = var0.changecolor(0, 100);
    boolean var14 = var0.changecolor(100, 10);
    boolean var17 = var0.changecolor(10, 100);
    boolean var20 = var0.changecolor(10, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test19");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor((-1), 10);
    boolean var10 = var0.changecolor(10, 0);
    boolean var13 = var0.changecolor(1, 1);
    java.lang.String var14 = var0.toString();
    boolean var17 = var0.changecolor(10, 100);
    java.lang.String var18 = var0.toString();
    java.lang.String var19 = var0.toString();
    boolean var22 = var0.changecolor(10, 0);
    boolean var25 = var0.changecolor((-1), 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "RR"+ "'", var14.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "RR"+ "'", var18.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "RR"+ "'", var19.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test20");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    java.lang.String var4 = var0.toString();
    boolean var7 = var0.changecolor(1, (-1));
    java.lang.String var8 = var0.toString();
    boolean var11 = var0.changecolor(10, 10);
    boolean var14 = var0.changecolor(1, 0);
    boolean var17 = var0.changecolor((-1), (-1));
    boolean var20 = var0.changecolor(10, 0);
    boolean var23 = var0.changecolor(1, 1);
    boolean var26 = var0.changecolor(10, 10);
    java.lang.String var27 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "RR"+ "'", var4.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "RG"+ "'", var27.equals("RG"));

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test21");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor((-1), 10);
    boolean var9 = var0.changecolor(0, (-1));
    boolean var12 = var0.changecolor(0, 0);
    boolean var15 = var0.changecolor(10, 100);
    boolean var18 = var0.changecolor(0, 1);
    boolean var21 = var0.changecolor(0, 100);
    java.lang.String var22 = var0.toString();
    java.lang.String var23 = var0.toString();
    boolean var26 = var0.changecolor(10, (-1));
    boolean var29 = var0.changecolor(0, 10);
    boolean var32 = var0.changecolor(1, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "GR"+ "'", var22.equals("GR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "GR"+ "'", var23.equals("GR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test22");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    java.lang.String var4 = var0.toString();
    boolean var7 = var0.changecolor(10, 1);
    java.lang.String var8 = var0.toString();
    java.lang.String var9 = var0.toString();
    boolean var12 = var0.changecolor(100, 100);
    boolean var15 = var0.changecolor(0, 10);
    boolean var18 = var0.changecolor(1, 10);
    java.lang.String var19 = var0.toString();
    boolean var22 = var0.changecolor(0, 100);
    boolean var25 = var0.changecolor(0, 0);
    boolean var28 = var0.changecolor(1, 1);
    java.lang.String var29 = var0.toString();
    java.lang.String var30 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "RR"+ "'", var4.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "RR"+ "'", var9.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "RR"+ "'", var19.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "VR"+ "'", var29.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "VR"+ "'", var30.equals("VR"));

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test23");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor(1, 10);
    java.lang.String var7 = var0.toString();
    boolean var10 = var0.changecolor(100, 10);
    boolean var13 = var0.changecolor(10, 1);
    boolean var16 = var0.changecolor(1, 100);
    boolean var19 = var0.changecolor((-1), 1);
    boolean var22 = var0.changecolor(0, (-1));
    boolean var25 = var0.changecolor(100, 1);
    java.lang.String var26 = var0.toString();
    boolean var29 = var0.changecolor(100, (-1));
    java.lang.String var30 = var0.toString();
    java.lang.String var31 = var0.toString();
    boolean var34 = var0.changecolor(0, 1);
    java.lang.String var35 = var0.toString();
    boolean var38 = var0.changecolor(10, 10);
    boolean var41 = var0.changecolor(0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
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
    assertTrue("'" + var26 + "' != '" + "RR"+ "'", var26.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "RR"+ "'", var30.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "RR"+ "'", var31.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "RR"+ "'", var35.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test24");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor((-1), 10);
    boolean var9 = var0.changecolor(0, (-1));
    boolean var12 = var0.changecolor(0, 0);
    boolean var15 = var0.changecolor(10, 100);
    boolean var18 = var0.changecolor(0, 1);
    boolean var21 = var0.changecolor((-1), 100);
    boolean var24 = var0.changecolor(100, 10);
    java.lang.String var25 = var0.toString();
    boolean var28 = var0.changecolor(1, (-1));
    java.lang.String var29 = var0.toString();
    boolean var32 = var0.changecolor(100, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "GR"+ "'", var25.equals("GR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "GR"+ "'", var29.equals("GR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test25");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor(10, 10);
    boolean var10 = var0.changecolor(1, 10);
    boolean var13 = var0.changecolor(1, 0);
    boolean var16 = var0.changecolor(1, 100);
    boolean var19 = var0.changecolor((-1), (-1));
    boolean var22 = var0.changecolor(0, 100);
    boolean var25 = var0.changecolor(10, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test26");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor((-1), 10);
    boolean var9 = var0.changecolor(100, 1);
    java.lang.String var10 = var0.toString();
    boolean var13 = var0.changecolor(0, 1);
    boolean var16 = var0.changecolor((-1), 10);
    boolean var19 = var0.changecolor(1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "RR"+ "'", var10.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test27");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor((-1), 10);
    boolean var10 = var0.changecolor(10, 0);
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.toString();
    java.lang.String var13 = var0.toString();
    java.lang.String var14 = var0.toString();
    boolean var17 = var0.changecolor((-1), 1);
    boolean var20 = var0.changecolor(1, 0);
    java.lang.String var21 = var0.toString();
    java.lang.String var22 = var0.toString();
    boolean var25 = var0.changecolor(10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "RR"+ "'", var12.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "RR"+ "'", var13.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "RR"+ "'", var14.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "RV"+ "'", var21.equals("RV"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "RV"+ "'", var22.equals("RV"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test28");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    boolean var6 = var0.changecolor(0, 1);
    boolean var9 = var0.changecolor(100, 0);
    java.lang.String var10 = var0.toString();
    java.lang.String var11 = var0.toString();
    boolean var14 = var0.changecolor(10, 1);
    java.lang.String var15 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "RR"+ "'", var10.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "RR"+ "'", var15.equals("RR"));

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test29");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor(1, 10);
    java.lang.String var7 = var0.toString();
    boolean var10 = var0.changecolor(100, 10);
    boolean var13 = var0.changecolor(10, 1);
    boolean var16 = var0.changecolor(1, 100);
    boolean var19 = var0.changecolor((-1), 1);
    boolean var22 = var0.changecolor(0, (-1));
    boolean var25 = var0.changecolor((-1), 10);
    boolean var28 = var0.changecolor((-1), 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
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
    assertTrue(var28 == false);

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test30");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor(1, 10);
    java.lang.String var7 = var0.toString();
    java.lang.String var8 = var0.toString();
    boolean var11 = var0.changecolor(0, 0);
    boolean var14 = var0.changecolor(10, 100);
    boolean var17 = var0.changecolor(100, 100);
    boolean var20 = var0.changecolor(100, 0);
    java.lang.String var21 = var0.toString();
    boolean var24 = var0.changecolor(0, 100);
    boolean var27 = var0.changecolor(1, 10);
    boolean var30 = var0.changecolor(1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "VR"+ "'", var21.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test31");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    boolean var6 = var0.changecolor(0, 1);
    boolean var9 = var0.changecolor(100, 0);
    java.lang.String var10 = var0.toString();
    boolean var13 = var0.changecolor(10, (-1));
    boolean var16 = var0.changecolor((-1), 1);
    boolean var19 = var0.changecolor(10, 10);
    boolean var22 = var0.changecolor(1, (-1));
    boolean var25 = var0.changecolor(0, 100);
    java.lang.String var26 = var0.toString();
    java.lang.String var27 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "RR"+ "'", var10.equals("RR"));
    
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
    assertTrue("'" + var26 + "' != '" + "RR"+ "'", var26.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "RR"+ "'", var27.equals("RR"));

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test32");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(1, 100);
    boolean var6 = var0.changecolor(100, 1);
    boolean var9 = var0.changecolor(1, (-1));
    java.lang.String var10 = var0.toString();
    boolean var13 = var0.changecolor(10, 100);
    boolean var16 = var0.changecolor((-1), 0);
    java.lang.String var17 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "RR"+ "'", var10.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "RR"+ "'", var17.equals("RR"));

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test33");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor(1, 10);
    java.lang.String var7 = var0.toString();
    java.lang.String var8 = var0.toString();
    boolean var11 = var0.changecolor((-1), 1);
    boolean var14 = var0.changecolor(1, 1);
    boolean var17 = var0.changecolor(0, 1);
    java.lang.String var18 = var0.toString();
    boolean var21 = var0.changecolor((-1), 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "RR"+ "'", var18.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test34");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor(1, 10);
    boolean var9 = var0.changecolor(1, 10);
    boolean var12 = var0.changecolor(100, 10);
    boolean var15 = var0.changecolor(1, 0);
    boolean var18 = var0.changecolor((-1), 0);
    boolean var21 = var0.changecolor((-1), 1);
    java.lang.String var22 = var0.toString();
    boolean var25 = var0.changecolor(0, 10);
    boolean var28 = var0.changecolor(100, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "RV"+ "'", var22.equals("RV"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test35");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    boolean var5 = var0.changecolor(10, 10);
    java.lang.String var6 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "RR"+ "'", var6.equals("RR"));

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test36");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, (-1));
    boolean var7 = var0.changecolor(1, 10);
    java.lang.String var8 = var0.toString();
    boolean var11 = var0.changecolor(0, 10);
    boolean var14 = var0.changecolor((-1), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test37");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor((-1), 10);
    boolean var9 = var0.changecolor(0, (-1));
    boolean var12 = var0.changecolor(0, 0);
    boolean var15 = var0.changecolor(10, 100);
    boolean var18 = var0.changecolor(0, 1);
    boolean var21 = var0.changecolor((-1), 100);
    boolean var24 = var0.changecolor(100, 10);
    java.lang.String var25 = var0.toString();
    java.lang.String var26 = var0.toString();
    java.lang.String var27 = var0.toString();
    java.lang.String var28 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "GR"+ "'", var25.equals("GR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "GR"+ "'", var26.equals("GR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "GR"+ "'", var27.equals("GR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "GR"+ "'", var28.equals("GR"));

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test38");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    boolean var6 = var0.changecolor(0, 1);
    boolean var9 = var0.changecolor(100, 0);
    boolean var12 = var0.changecolor(1, (-1));
    boolean var15 = var0.changecolor(100, 1);
    java.lang.String var16 = var0.toString();
    boolean var19 = var0.changecolor(1, 1);
    boolean var22 = var0.changecolor(100, 10);
    boolean var25 = var0.changecolor((-1), 1);
    
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
    assertTrue("'" + var16 + "' != '" + "RR"+ "'", var16.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test39");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor((-1), 10);
    java.lang.String var8 = var0.toString();
    boolean var11 = var0.changecolor(100, 0);
    boolean var14 = var0.changecolor(1, 1);
    boolean var17 = var0.changecolor((-1), 100);
    java.lang.String var18 = var0.toString();
    java.lang.String var19 = var0.toString();
    java.lang.String var20 = var0.toString();
    boolean var23 = var0.changecolor(0, 10);
    boolean var26 = var0.changecolor(1, (-1));
    java.lang.String var27 = var0.toString();
    boolean var30 = var0.changecolor(100, 10);
    boolean var33 = var0.changecolor(10, 100);
    java.lang.String var34 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "RR"+ "'", var18.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "RR"+ "'", var19.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "RR"+ "'", var20.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "RR"+ "'", var27.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "RR"+ "'", var34.equals("RR"));

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test40");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor(1, 10);
    boolean var9 = var0.changecolor((-1), (-1));
    java.lang.String var10 = var0.toString();
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.toString();
    java.lang.String var13 = var0.toString();
    java.lang.String var14 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "RR"+ "'", var10.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "RR"+ "'", var12.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "RR"+ "'", var13.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "RR"+ "'", var14.equals("RR"));

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test41");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor((-1), 10);
    boolean var9 = var0.changecolor(100, 100);
    java.lang.String var10 = var0.toString();
    boolean var13 = var0.changecolor(10, 1);
    boolean var16 = var0.changecolor(0, 100);
    boolean var19 = var0.changecolor(0, 1);
    boolean var22 = var0.changecolor(1, 100);
    boolean var25 = var0.changecolor(100, 1);
    boolean var28 = var0.changecolor(10, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "RR"+ "'", var10.equals("RR"));
    
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
    assertTrue(var28 == false);

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test42");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor((-1), 10);
    boolean var9 = var0.changecolor(100, (-1));
    boolean var12 = var0.changecolor(0, 0);
    boolean var15 = var0.changecolor((-1), 10);
    java.lang.String var16 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "VR"+ "'", var16.equals("VR"));

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test43");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    java.lang.String var4 = var0.toString();
    boolean var7 = var0.changecolor(10, 1);
    boolean var10 = var0.changecolor(10, 100);
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.toString();
    java.lang.String var13 = var0.toString();
    boolean var16 = var0.changecolor(100, 0);
    boolean var19 = var0.changecolor(10, 0);
    boolean var22 = var0.changecolor((-1), 1);
    java.lang.String var23 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "RR"+ "'", var4.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "RR"+ "'", var12.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "RR"+ "'", var13.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "RR"+ "'", var23.equals("RR"));

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test44");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, (-1));
    boolean var7 = var0.changecolor(1, 10);
    java.lang.String var8 = var0.toString();
    boolean var11 = var0.changecolor(0, 10);
    boolean var14 = var0.changecolor(0, 1);
    java.lang.String var15 = var0.toString();
    boolean var18 = var0.changecolor((-1), 0);
    boolean var21 = var0.changecolor(100, 1);
    boolean var24 = var0.changecolor(0, 100);
    java.lang.String var25 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "RR"+ "'", var15.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "RR"+ "'", var25.equals("RR"));

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test45");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor(10, 1);
    boolean var10 = var0.changecolor(100, 10);
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.toString();
    boolean var15 = var0.changecolor(100, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "RR"+ "'", var12.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test46");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    java.lang.String var4 = var0.toString();
    boolean var7 = var0.changecolor(1, (-1));
    java.lang.String var8 = var0.toString();
    boolean var11 = var0.changecolor((-1), 1);
    boolean var14 = var0.changecolor(0, 1);
    boolean var17 = var0.changecolor(1, 10);
    java.lang.String var18 = var0.toString();
    boolean var21 = var0.changecolor(10, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "RR"+ "'", var4.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "RR"+ "'", var18.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test47");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    boolean var6 = var0.changecolor(10, 10);
    java.lang.String var7 = var0.toString();
    boolean var10 = var0.changecolor((-1), (-1));
    boolean var13 = var0.changecolor(100, (-1));
    java.lang.String var14 = var0.toString();
    java.lang.String var15 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "RR"+ "'", var14.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "RR"+ "'", var15.equals("RR"));

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test48");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    boolean var6 = var0.changecolor(0, 1);
    java.lang.String var7 = var0.toString();
    boolean var10 = var0.changecolor((-1), (-1));
    boolean var13 = var0.changecolor((-1), 10);
    java.lang.String var14 = var0.toString();
    boolean var17 = var0.changecolor((-1), 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "RR"+ "'", var14.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test49");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor(1, 10);
    java.lang.String var7 = var0.toString();
    boolean var10 = var0.changecolor(100, 10);
    boolean var13 = var0.changecolor(10, 1);
    boolean var16 = var0.changecolor(1, 100);
    boolean var19 = var0.changecolor((-1), 1);
    boolean var22 = var0.changecolor(0, (-1));
    boolean var25 = var0.changecolor(100, 1);
    java.lang.String var26 = var0.toString();
    boolean var29 = var0.changecolor(100, (-1));
    java.lang.String var30 = var0.toString();
    java.lang.String var31 = var0.toString();
    boolean var34 = var0.changecolor(0, 1);
    boolean var37 = var0.changecolor(10, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
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
    assertTrue("'" + var26 + "' != '" + "RR"+ "'", var26.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "RR"+ "'", var30.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "RR"+ "'", var31.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test50");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor(1, 10);
    java.lang.String var7 = var0.toString();
    boolean var10 = var0.changecolor(100, 10);
    boolean var13 = var0.changecolor(10, 1);
    boolean var16 = var0.changecolor(1, 100);
    boolean var19 = var0.changecolor((-1), 1);
    boolean var22 = var0.changecolor(0, (-1));
    boolean var25 = var0.changecolor(100, 1);
    java.lang.String var26 = var0.toString();
    boolean var29 = var0.changecolor(100, (-1));
    boolean var32 = var0.changecolor(10, 10);
    java.lang.String var33 = var0.toString();
    java.lang.String var34 = var0.toString();
    boolean var37 = var0.changecolor(10, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
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
    assertTrue("'" + var26 + "' != '" + "RR"+ "'", var26.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "RR"+ "'", var33.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "RR"+ "'", var34.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test51");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor((-1), 10);
    boolean var9 = var0.changecolor(100, 100);
    java.lang.String var10 = var0.toString();
    boolean var13 = var0.changecolor(10, 1);
    boolean var16 = var0.changecolor(1, (-1));
    boolean var19 = var0.changecolor(1, 10);
    java.lang.String var20 = var0.toString();
    java.lang.String var21 = var0.toString();
    java.lang.String var22 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "RR"+ "'", var10.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "RR"+ "'", var20.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "RR"+ "'", var21.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "RR"+ "'", var22.equals("RR"));

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test52");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(1, 100);
    java.lang.String var4 = var0.toString();
    java.lang.String var5 = var0.toString();
    boolean var8 = var0.changecolor(0, 1);
    boolean var11 = var0.changecolor(10, (-1));
    boolean var14 = var0.changecolor((-1), 1);
    java.lang.String var15 = var0.toString();
    boolean var18 = var0.changecolor(0, 1);
    java.lang.String var19 = var0.toString();
    boolean var22 = var0.changecolor(10, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "RR"+ "'", var4.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "RR"+ "'", var5.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "RR"+ "'", var15.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "RR"+ "'", var19.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test53");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    java.lang.String var4 = var0.toString();
    boolean var7 = var0.changecolor((-1), 0);
    java.lang.String var8 = var0.toString();
    java.lang.String var9 = var0.toString();
    boolean var12 = var0.changecolor(100, 100);
    java.lang.String var13 = var0.toString();
    java.lang.String var14 = var0.toString();
    java.lang.String var15 = var0.toString();
    java.lang.String var16 = var0.toString();
    java.lang.String var17 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "RR"+ "'", var4.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "RR"+ "'", var9.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "RR"+ "'", var13.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "RR"+ "'", var14.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "RR"+ "'", var15.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "RR"+ "'", var16.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "RR"+ "'", var17.equals("RR"));

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test54");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(1, 100);
    java.lang.String var4 = var0.toString();
    boolean var7 = var0.changecolor(0, (-1));
    boolean var10 = var0.changecolor(1, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "RR"+ "'", var4.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test55");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    java.lang.String var4 = var0.toString();
    boolean var7 = var0.changecolor(10, 1);
    java.lang.String var8 = var0.toString();
    boolean var11 = var0.changecolor(10, 1);
    boolean var14 = var0.changecolor(1, 1);
    java.lang.String var15 = var0.toString();
    boolean var18 = var0.changecolor(0, 100);
    boolean var21 = var0.changecolor(0, 100);
    boolean var24 = var0.changecolor(100, 100);
    java.lang.String var25 = var0.toString();
    boolean var28 = var0.changecolor(0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "RR"+ "'", var4.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "RR"+ "'", var15.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "RR"+ "'", var25.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test56");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor(100, (-1));
    java.lang.String var7 = var0.toString();
    boolean var10 = var0.changecolor(1, 1);
    boolean var13 = var0.changecolor(0, (-1));
    boolean var16 = var0.changecolor((-1), (-1));
    boolean var19 = var0.changecolor(100, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test57");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor((-1), 10);
    boolean var9 = var0.changecolor(100, 1);
    java.lang.String var10 = var0.toString();
    boolean var13 = var0.changecolor(0, 1);
    java.lang.String var14 = var0.toString();
    java.lang.String var15 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "RR"+ "'", var10.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "RR"+ "'", var14.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "RR"+ "'", var15.equals("RR"));

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test58");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor(1, 10);
    java.lang.String var7 = var0.toString();
    boolean var10 = var0.changecolor(0, 1);
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.toString();
    java.lang.String var13 = var0.toString();
    boolean var16 = var0.changecolor(100, (-1));
    boolean var19 = var0.changecolor((-1), (-1));
    java.lang.String var20 = var0.toString();
    boolean var23 = var0.changecolor(0, 100);
    java.lang.String var24 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "RR"+ "'", var12.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "RR"+ "'", var13.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "RR"+ "'", var20.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "RR"+ "'", var24.equals("RR"));

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test59");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor((-1), 10);
    boolean var9 = var0.changecolor(0, (-1));
    java.lang.String var10 = var0.toString();
    java.lang.String var11 = var0.toString();
    boolean var14 = var0.changecolor(10, 100);
    java.lang.String var15 = var0.toString();
    boolean var18 = var0.changecolor(100, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "RR"+ "'", var10.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "RR"+ "'", var15.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test60");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    java.lang.String var4 = var0.toString();
    boolean var7 = var0.changecolor(1, (-1));
    boolean var10 = var0.changecolor(100, 100);
    boolean var13 = var0.changecolor(10, 10);
    boolean var16 = var0.changecolor(10, 0);
    boolean var19 = var0.changecolor(1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "RR"+ "'", var4.equals("RR"));
    
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

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test61");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor(1, 10);
    boolean var9 = var0.changecolor(1, 10);
    boolean var12 = var0.changecolor(100, 10);
    java.lang.String var13 = var0.toString();
    java.lang.String var14 = var0.toString();
    boolean var17 = var0.changecolor(0, 0);
    java.lang.String var18 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "RR"+ "'", var13.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "RR"+ "'", var14.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "VR"+ "'", var18.equals("VR"));

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test62");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor(1, 10);
    boolean var9 = var0.changecolor((-1), (-1));
    java.lang.String var10 = var0.toString();
    java.lang.String var11 = var0.toString();
    boolean var14 = var0.changecolor((-1), 100);
    boolean var17 = var0.changecolor(0, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "RR"+ "'", var10.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test63");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    java.lang.String var5 = var0.toString();
    java.lang.String var6 = var0.toString();
    boolean var9 = var0.changecolor(1, 10);
    boolean var12 = var0.changecolor(10, (-1));
    java.lang.String var13 = var0.toString();
    boolean var16 = var0.changecolor(0, (-1));
    boolean var19 = var0.changecolor(100, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "RR"+ "'", var5.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "RR"+ "'", var6.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "RR"+ "'", var13.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test64");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor(1, 10);
    boolean var9 = var0.changecolor((-1), (-1));
    java.lang.String var10 = var0.toString();
    boolean var13 = var0.changecolor(10, 10);
    boolean var16 = var0.changecolor((-1), 1);
    java.lang.String var17 = var0.toString();
    boolean var20 = var0.changecolor(100, (-1));
    boolean var23 = var0.changecolor(0, 1);
    java.lang.String var24 = var0.toString();
    java.lang.String var25 = var0.toString();
    java.lang.String var26 = var0.toString();
    boolean var29 = var0.changecolor((-1), 0);
    java.lang.String var30 = var0.toString();
    java.lang.String var31 = var0.toString();
    boolean var34 = var0.changecolor(1, 1);
    boolean var37 = var0.changecolor(0, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "RR"+ "'", var10.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "RR"+ "'", var17.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "RR"+ "'", var24.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "RR"+ "'", var25.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "RR"+ "'", var26.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "RR"+ "'", var30.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "RR"+ "'", var31.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test65");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    boolean var6 = var0.changecolor(0, 1);
    boolean var9 = var0.changecolor(100, 0);
    boolean var12 = var0.changecolor(1, (-1));
    boolean var15 = var0.changecolor(100, 1);
    java.lang.String var16 = var0.toString();
    java.lang.String var17 = var0.toString();
    boolean var20 = var0.changecolor(100, 10);
    
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
    assertTrue("'" + var16 + "' != '" + "RR"+ "'", var16.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "RR"+ "'", var17.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test66");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    java.lang.String var4 = var0.toString();
    boolean var7 = var0.changecolor(1, (-1));
    boolean var10 = var0.changecolor(100, 100);
    boolean var13 = var0.changecolor(0, 1);
    boolean var16 = var0.changecolor(1, 0);
    java.lang.String var17 = var0.toString();
    boolean var20 = var0.changecolor((-1), 10);
    boolean var23 = var0.changecolor(0, 0);
    boolean var26 = var0.changecolor(1, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "RR"+ "'", var4.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "RV"+ "'", var17.equals("RV"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test67");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    java.lang.String var5 = var0.toString();
    boolean var8 = var0.changecolor((-1), 0);
    boolean var11 = var0.changecolor(0, 100);
    boolean var14 = var0.changecolor(10, (-1));
    boolean var17 = var0.changecolor(10, 100);
    boolean var20 = var0.changecolor(100, 1);
    java.lang.String var21 = var0.toString();
    java.lang.String var22 = var0.toString();
    java.lang.String var23 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "RR"+ "'", var5.equals("RR"));
    
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
    assertTrue("'" + var21 + "' != '" + "RR"+ "'", var21.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "RR"+ "'", var22.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "RR"+ "'", var23.equals("RR"));

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test68");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, (-1));
    boolean var7 = var0.changecolor(10, 0);
    boolean var10 = var0.changecolor((-1), 100);
    boolean var13 = var0.changecolor((-1), 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test69");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(1, 100);
    boolean var6 = var0.changecolor(100, 1);
    java.lang.String var7 = var0.toString();
    java.lang.String var8 = var0.toString();
    boolean var11 = var0.changecolor(0, 10);
    boolean var14 = var0.changecolor((-1), (-1));
    boolean var17 = var0.changecolor(1, (-1));
    java.lang.String var18 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "RR"+ "'", var18.equals("RR"));

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test70");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    java.lang.String var4 = var0.toString();
    boolean var7 = var0.changecolor(1, (-1));
    java.lang.String var8 = var0.toString();
    boolean var11 = var0.changecolor((-1), 1);
    boolean var14 = var0.changecolor(0, 1);
    boolean var17 = var0.changecolor((-1), (-1));
    boolean var20 = var0.changecolor(100, 100);
    boolean var23 = var0.changecolor(0, 100);
    java.lang.String var24 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "RR"+ "'", var4.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
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
    assertTrue("'" + var24 + "' != '" + "RR"+ "'", var24.equals("RR"));

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test71");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    java.lang.String var4 = var0.toString();
    boolean var7 = var0.changecolor(10, 1);
    boolean var10 = var0.changecolor(10, 100);
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.toString();
    java.lang.String var13 = var0.toString();
    boolean var16 = var0.changecolor(100, 0);
    java.lang.String var17 = var0.toString();
    boolean var20 = var0.changecolor(1, 0);
    boolean var23 = var0.changecolor(10, 1);
    boolean var26 = var0.changecolor(1, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "RR"+ "'", var4.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "RR"+ "'", var12.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "RR"+ "'", var13.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "RR"+ "'", var17.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test72");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor((-1), 10);
    boolean var10 = var0.changecolor(10, 0);
    boolean var13 = var0.changecolor(1, 1);
    boolean var16 = var0.changecolor((-1), 10);
    boolean var19 = var0.changecolor(0, 100);
    boolean var22 = var0.changecolor(10, 100);
    boolean var25 = var0.changecolor(10, 1);
    boolean var28 = var0.changecolor(1, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
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
    assertTrue(var28 == false);

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test73");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor((-1), 10);
    boolean var10 = var0.changecolor(10, 0);
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.toString();
    java.lang.String var13 = var0.toString();
    boolean var16 = var0.changecolor((-1), 100);
    java.lang.String var17 = var0.toString();
    java.lang.String var18 = var0.toString();
    java.lang.String var19 = var0.toString();
    java.lang.String var20 = var0.toString();
    java.lang.String var21 = var0.toString();
    java.lang.String var22 = var0.toString();
    java.lang.String var23 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "RR"+ "'", var12.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "RR"+ "'", var13.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "RR"+ "'", var17.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "RR"+ "'", var18.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "RR"+ "'", var19.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "RR"+ "'", var20.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "RR"+ "'", var21.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "RR"+ "'", var22.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "RR"+ "'", var23.equals("RR"));

  }

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test74");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    boolean var6 = var0.changecolor(0, 1);
    java.lang.String var7 = var0.toString();
    boolean var10 = var0.changecolor(1, 1);
    boolean var13 = var0.changecolor(10, 0);
    boolean var16 = var0.changecolor(0, 0);
    boolean var19 = var0.changecolor(1, 0);
    boolean var22 = var0.changecolor(0, 100);
    boolean var25 = var0.changecolor(100, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test75");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor(1, 10);
    boolean var9 = var0.changecolor(10, 10);
    java.lang.String var10 = var0.toString();
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.toString();
    java.lang.String var13 = var0.toString();
    boolean var16 = var0.changecolor(10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "RR"+ "'", var10.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "RR"+ "'", var12.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "RR"+ "'", var13.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test76");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor((-1), 10);
    java.lang.String var4 = var0.toString();
    boolean var7 = var0.changecolor(10, 10);
    boolean var10 = var0.changecolor(0, 100);
    boolean var13 = var0.changecolor(0, (-1));
    boolean var16 = var0.changecolor(0, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "RR"+ "'", var4.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test77");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    boolean var5 = var0.changecolor(100, 1);
    boolean var8 = var0.changecolor(10, (-1));
    boolean var11 = var0.changecolor(1, 100);
    java.lang.String var12 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "RR"+ "'", var12.equals("RR"));

  }

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test78");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor((-1), 10);
    boolean var10 = var0.changecolor(10, 0);
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.toString();
    java.lang.String var13 = var0.toString();
    boolean var16 = var0.changecolor((-1), 100);
    java.lang.String var17 = var0.toString();
    java.lang.String var18 = var0.toString();
    boolean var21 = var0.changecolor(0, 0);
    boolean var24 = var0.changecolor(1, 100);
    boolean var27 = var0.changecolor(100, 100);
    java.lang.String var28 = var0.toString();
    java.lang.String var29 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "RR"+ "'", var12.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "RR"+ "'", var13.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "RR"+ "'", var17.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "RR"+ "'", var18.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "VR"+ "'", var28.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "VR"+ "'", var29.equals("VR"));

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test79");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor(1, 10);
    java.lang.String var7 = var0.toString();
    java.lang.String var8 = var0.toString();
    boolean var11 = var0.changecolor(0, 0);
    boolean var14 = var0.changecolor(100, 100);
    java.lang.String var15 = var0.toString();
    java.lang.String var16 = var0.toString();
    boolean var19 = var0.changecolor(0, (-1));
    boolean var22 = var0.changecolor((-1), 100);
    boolean var25 = var0.changecolor(1, 0);
    java.lang.String var26 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "VR"+ "'", var15.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "VR"+ "'", var16.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "VR"+ "'", var26.equals("VR"));

  }

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test80");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    boolean var6 = var0.changecolor(10, 10);
    java.lang.String var7 = var0.toString();
    java.lang.String var8 = var0.toString();
    java.lang.String var9 = var0.toString();
    boolean var12 = var0.changecolor(0, 0);
    java.lang.String var13 = var0.toString();
    java.lang.String var14 = var0.toString();
    boolean var17 = var0.changecolor((-1), 100);
    java.lang.String var18 = var0.toString();
    java.lang.String var19 = var0.toString();
    boolean var22 = var0.changecolor(100, 0);
    java.lang.String var23 = var0.toString();
    java.lang.String var24 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "RR"+ "'", var9.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "VR"+ "'", var13.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "VR"+ "'", var14.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "VR"+ "'", var18.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "VR"+ "'", var19.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "VR"+ "'", var23.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "VR"+ "'", var24.equals("VR"));

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test81");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    boolean var6 = var0.changecolor(0, 1);
    java.lang.String var7 = var0.toString();
    boolean var10 = var0.changecolor(10, 1);
    boolean var13 = var0.changecolor(100, 0);
    boolean var16 = var0.changecolor((-1), 0);
    boolean var19 = var0.changecolor((-1), 0);
    boolean var22 = var0.changecolor((-1), 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
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

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test82");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor((-1), 10);
    boolean var10 = var0.changecolor((-1), 1);
    boolean var13 = var0.changecolor((-1), 0);
    boolean var16 = var0.changecolor(0, 1);
    java.lang.String var17 = var0.toString();
    java.lang.String var18 = var0.toString();
    boolean var21 = var0.changecolor(100, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "RR"+ "'", var17.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "RR"+ "'", var18.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test83");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    java.lang.String var4 = var0.toString();
    boolean var7 = var0.changecolor(1, (-1));
    boolean var10 = var0.changecolor(100, 100);
    boolean var13 = var0.changecolor(0, 1);
    boolean var16 = var0.changecolor(1, 0);
    java.lang.String var17 = var0.toString();
    java.lang.String var18 = var0.toString();
    boolean var21 = var0.changecolor((-1), 10);
    boolean var24 = var0.changecolor((-1), 1);
    boolean var27 = var0.changecolor(0, 1);
    boolean var30 = var0.changecolor((-1), 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "RR"+ "'", var4.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "RV"+ "'", var17.equals("RV"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "RV"+ "'", var18.equals("RV"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);

  }

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test84");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor((-1), 10);
    boolean var10 = var0.changecolor((-1), 1);
    java.lang.String var11 = var0.toString();
    boolean var14 = var0.changecolor(100, 10);
    boolean var17 = var0.changecolor(0, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test85");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    java.lang.String var5 = var0.toString();
    java.lang.String var6 = var0.toString();
    java.lang.String var7 = var0.toString();
    boolean var10 = var0.changecolor(1, 10);
    java.lang.String var11 = var0.toString();
    boolean var14 = var0.changecolor((-1), 1);
    boolean var17 = var0.changecolor(10, 10);
    boolean var20 = var0.changecolor(1, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "RR"+ "'", var5.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "RR"+ "'", var6.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test86");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor((-1), 10);
    java.lang.String var8 = var0.toString();
    boolean var11 = var0.changecolor(100, 0);
    boolean var14 = var0.changecolor(1, 1);
    boolean var17 = var0.changecolor((-1), 100);
    java.lang.String var18 = var0.toString();
    java.lang.String var19 = var0.toString();
    java.lang.String var20 = var0.toString();
    java.lang.String var21 = var0.toString();
    boolean var24 = var0.changecolor(0, (-1));
    java.lang.String var25 = var0.toString();
    boolean var28 = var0.changecolor(1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "RR"+ "'", var18.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "RR"+ "'", var19.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "RR"+ "'", var20.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "RR"+ "'", var21.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "RR"+ "'", var25.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test87");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor((-1), 10);
    java.lang.String var8 = var0.toString();
    boolean var11 = var0.changecolor(100, 0);
    boolean var14 = var0.changecolor(1, 1);
    boolean var17 = var0.changecolor(100, 100);
    boolean var20 = var0.changecolor((-1), 100);
    java.lang.String var21 = var0.toString();
    boolean var24 = var0.changecolor(100, 100);
    boolean var27 = var0.changecolor(0, 0);
    java.lang.String var28 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "RR"+ "'", var21.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "VR"+ "'", var28.equals("VR"));

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test88");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor((-1), 10);
    boolean var9 = var0.changecolor(0, (-1));
    java.lang.String var10 = var0.toString();
    boolean var13 = var0.changecolor(1, 100);
    java.lang.String var14 = var0.toString();
    java.lang.String var15 = var0.toString();
    java.lang.String var16 = var0.toString();
    boolean var19 = var0.changecolor((-1), 100);
    boolean var22 = var0.changecolor(100, 1);
    java.lang.String var23 = var0.toString();
    boolean var26 = var0.changecolor(0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "RR"+ "'", var10.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "RR"+ "'", var14.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "RR"+ "'", var15.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "RR"+ "'", var16.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "RR"+ "'", var23.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test89");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    boolean var6 = var0.changecolor(10, 10);
    java.lang.String var7 = var0.toString();
    java.lang.String var8 = var0.toString();
    boolean var11 = var0.changecolor((-1), (-1));
    boolean var14 = var0.changecolor(0, (-1));
    java.lang.String var15 = var0.toString();
    boolean var18 = var0.changecolor(0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "RR"+ "'", var15.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test90");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    java.lang.String var4 = var0.toString();
    boolean var7 = var0.changecolor(1, (-1));
    boolean var10 = var0.changecolor(0, 0);
    boolean var13 = var0.changecolor((-1), 0);
    boolean var16 = var0.changecolor(10, 0);
    boolean var19 = var0.changecolor(10, 10);
    boolean var22 = var0.changecolor(10, 10);
    java.lang.String var23 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "RR"+ "'", var4.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "VR"+ "'", var23.equals("VR"));

  }

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test91");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor((-1), 10);
    boolean var10 = var0.changecolor(10, 1);
    boolean var13 = var0.changecolor(0, (-1));
    boolean var16 = var0.changecolor(10, 10);
    boolean var19 = var0.changecolor((-1), (-1));
    boolean var22 = var0.changecolor((-1), 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
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

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test92");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    java.lang.String var4 = var0.toString();
    boolean var7 = var0.changecolor((-1), 0);
    java.lang.String var8 = var0.toString();
    java.lang.String var9 = var0.toString();
    java.lang.String var10 = var0.toString();
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.toString();
    java.lang.String var13 = var0.toString();
    java.lang.String var14 = var0.toString();
    java.lang.String var15 = var0.toString();
    java.lang.String var16 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "RR"+ "'", var4.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "RR"+ "'", var9.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "RR"+ "'", var10.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "RR"+ "'", var12.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "RR"+ "'", var13.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "RR"+ "'", var14.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "RR"+ "'", var15.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "RR"+ "'", var16.equals("RR"));

  }

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test93");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    boolean var6 = var0.changecolor(0, 1);
    boolean var9 = var0.changecolor(100, 0);
    boolean var12 = var0.changecolor(0, 0);
    boolean var15 = var0.changecolor(100, 0);
    boolean var18 = var0.changecolor(1, 100);
    boolean var21 = var0.changecolor(10, 10);
    boolean var24 = var0.changecolor((-1), (-1));
    java.lang.String var25 = var0.toString();
    boolean var28 = var0.changecolor(0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "VR"+ "'", var25.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);

  }

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test94");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor((-1), 10);
    boolean var10 = var0.changecolor(10, 1);
    boolean var13 = var0.changecolor(0, (-1));
    java.lang.String var14 = var0.toString();
    boolean var17 = var0.changecolor(1, 0);
    boolean var20 = var0.changecolor((-1), 100);
    boolean var23 = var0.changecolor(0, 1);
    java.lang.String var24 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "RR"+ "'", var14.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "RV"+ "'", var24.equals("RV"));

  }

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test95");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor((-1), 10);
    boolean var10 = var0.changecolor(10, 0);
    boolean var13 = var0.changecolor(1, 1);
    boolean var16 = var0.changecolor((-1), 10);
    boolean var19 = var0.changecolor(0, 100);
    boolean var22 = var0.changecolor(10, 100);
    boolean var25 = var0.changecolor(100, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
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

  }

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test96");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    boolean var6 = var0.changecolor(0, 1);
    java.lang.String var7 = var0.toString();
    boolean var10 = var0.changecolor(100, 1);
    boolean var13 = var0.changecolor(100, 10);
    boolean var16 = var0.changecolor(1, 10);
    java.lang.String var17 = var0.toString();
    boolean var20 = var0.changecolor((-1), 0);
    java.lang.String var21 = var0.toString();
    boolean var24 = var0.changecolor(1, 1);
    boolean var27 = var0.changecolor(100, (-1));
    boolean var30 = var0.changecolor(10, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "RR"+ "'", var17.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "RR"+ "'", var21.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test97");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor((-1), 10);
    boolean var10 = var0.changecolor(10, 0);
    boolean var13 = var0.changecolor(10, (-1));
    java.lang.String var14 = var0.toString();
    java.lang.String var15 = var0.toString();
    boolean var18 = var0.changecolor(1, 1);
    boolean var21 = var0.changecolor(1, 0);
    java.lang.String var22 = var0.toString();
    boolean var25 = var0.changecolor(10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "RR"+ "'", var14.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "RR"+ "'", var15.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "RV"+ "'", var22.equals("RV"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test98");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    java.lang.String var4 = var0.toString();
    boolean var7 = var0.changecolor((-1), 0);
    java.lang.String var8 = var0.toString();
    java.lang.String var9 = var0.toString();
    boolean var12 = var0.changecolor((-1), 100);
    boolean var15 = var0.changecolor(100, 1);
    java.lang.String var16 = var0.toString();
    boolean var19 = var0.changecolor((-1), 100);
    boolean var22 = var0.changecolor(1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "RR"+ "'", var4.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "RR"+ "'", var9.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "RR"+ "'", var16.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test99");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor((-1), 10);
    boolean var9 = var0.changecolor(0, (-1));
    java.lang.String var10 = var0.toString();
    java.lang.String var11 = var0.toString();
    boolean var14 = var0.changecolor(10, 100);
    java.lang.String var15 = var0.toString();
    boolean var18 = var0.changecolor(10, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "RR"+ "'", var10.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "RR"+ "'", var15.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test100");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor((-1), 10);
    boolean var9 = var0.changecolor(0, (-1));
    java.lang.String var10 = var0.toString();
    java.lang.String var11 = var0.toString();
    boolean var14 = var0.changecolor(100, 1);
    boolean var17 = var0.changecolor(100, 0);
    boolean var20 = var0.changecolor((-1), (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "RR"+ "'", var10.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test101() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test101");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor(1, 10);
    java.lang.String var7 = var0.toString();
    java.lang.String var8 = var0.toString();
    boolean var11 = var0.changecolor(100, (-1));
    boolean var14 = var0.changecolor(1, 10);
    boolean var17 = var0.changecolor((-1), 0);
    boolean var20 = var0.changecolor(100, 1);
    java.lang.String var21 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "RR"+ "'", var21.equals("RR"));

  }

  public void test102() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test102");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor(1, 10);
    boolean var9 = var0.changecolor(1, 10);
    boolean var12 = var0.changecolor(100, 10);
    boolean var15 = var0.changecolor(100, 1);
    boolean var18 = var0.changecolor(100, 10);
    boolean var21 = var0.changecolor((-1), 1);
    boolean var24 = var0.changecolor(100, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test103() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test103");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(1, 1);
    boolean var7 = var0.changecolor((-1), 1);
    java.lang.String var8 = var0.toString();
    boolean var11 = var0.changecolor(1, 10);
    boolean var14 = var0.changecolor((-1), 100);
    boolean var17 = var0.changecolor(1, 1);
    java.lang.String var18 = var0.toString();
    boolean var21 = var0.changecolor(0, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "RR"+ "'", var18.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test104() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test104");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    boolean var5 = var0.changecolor(0, 0);
    java.lang.String var6 = var0.toString();
    java.lang.String var7 = var0.toString();
    java.lang.String var8 = var0.toString();
    boolean var11 = var0.changecolor(10, 1);
    java.lang.String var12 = var0.toString();
    boolean var15 = var0.changecolor((-1), (-1));
    java.lang.String var16 = var0.toString();
    java.lang.String var17 = var0.toString();
    boolean var20 = var0.changecolor(100, 0);
    java.lang.String var21 = var0.toString();
    java.lang.String var22 = var0.toString();
    boolean var25 = var0.changecolor(10, 10);
    boolean var28 = var0.changecolor(1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "VR"+ "'", var6.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "VR"+ "'", var7.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "VR"+ "'", var8.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "VR"+ "'", var12.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "VR"+ "'", var16.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "VR"+ "'", var17.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "VR"+ "'", var21.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "VR"+ "'", var22.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test105() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test105");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor((-1), 10);
    boolean var9 = var0.changecolor(0, (-1));
    boolean var12 = var0.changecolor((-1), 0);
    java.lang.String var13 = var0.toString();
    java.lang.String var14 = var0.toString();
    java.lang.String var15 = var0.toString();
    java.lang.String var16 = var0.toString();
    java.lang.String var17 = var0.toString();
    boolean var20 = var0.changecolor(1, 1);
    boolean var23 = var0.changecolor(10, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "RR"+ "'", var13.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "RR"+ "'", var14.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "RR"+ "'", var15.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "RR"+ "'", var16.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "RR"+ "'", var17.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test106() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test106");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    java.lang.String var4 = var0.toString();
    boolean var7 = var0.changecolor(10, 1);
    boolean var10 = var0.changecolor(100, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "RR"+ "'", var4.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test107() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test107");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor((-1), 10);
    java.lang.String var8 = var0.toString();
    boolean var11 = var0.changecolor(100, 0);
    boolean var14 = var0.changecolor(1, 1);
    boolean var17 = var0.changecolor((-1), 100);
    java.lang.String var18 = var0.toString();
    java.lang.String var19 = var0.toString();
    java.lang.String var20 = var0.toString();
    boolean var23 = var0.changecolor(0, 10);
    boolean var26 = var0.changecolor(1, (-1));
    java.lang.String var27 = var0.toString();
    boolean var30 = var0.changecolor(1, 0);
    java.lang.String var31 = var0.toString();
    boolean var34 = var0.changecolor(1, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "RR"+ "'", var18.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "RR"+ "'", var19.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "RR"+ "'", var20.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "RR"+ "'", var27.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "RV"+ "'", var31.equals("RV"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);

  }

  public void test108() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test108");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor(10, 1);
    java.lang.String var8 = var0.toString();
    java.lang.String var9 = var0.toString();
    java.lang.String var10 = var0.toString();
    boolean var13 = var0.changecolor(0, 0);
    boolean var16 = var0.changecolor(10, 100);
    java.lang.String var17 = var0.toString();
    boolean var20 = var0.changecolor((-1), 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "RR"+ "'", var9.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "RR"+ "'", var10.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "VR"+ "'", var17.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test109() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test109");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    boolean var5 = var0.changecolor(100, 1);
    boolean var8 = var0.changecolor(10, 0);
    boolean var11 = var0.changecolor(10, 100);
    java.lang.String var12 = var0.toString();
    boolean var15 = var0.changecolor(0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "RR"+ "'", var12.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test110() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test110");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    java.lang.String var4 = var0.toString();
    boolean var7 = var0.changecolor((-1), 0);
    java.lang.String var8 = var0.toString();
    java.lang.String var9 = var0.toString();
    boolean var12 = var0.changecolor(100, 100);
    java.lang.String var13 = var0.toString();
    boolean var16 = var0.changecolor(1, 10);
    boolean var19 = var0.changecolor(0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "RR"+ "'", var4.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "RR"+ "'", var9.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "RR"+ "'", var13.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);

  }

  public void test111() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test111");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    boolean var6 = var0.changecolor(0, 1);
    java.lang.String var7 = var0.toString();
    boolean var10 = var0.changecolor((-1), (-1));
    java.lang.String var11 = var0.toString();
    boolean var14 = var0.changecolor((-1), (-1));
    boolean var17 = var0.changecolor(0, 100);
    java.lang.String var18 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "RR"+ "'", var18.equals("RR"));

  }

  public void test112() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test112");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor(1, 10);
    boolean var9 = var0.changecolor(1, 10);
    java.lang.String var10 = var0.toString();
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.toString();
    boolean var15 = var0.changecolor(0, 0);
    java.lang.String var16 = var0.toString();
    java.lang.String var17 = var0.toString();
    java.lang.String var18 = var0.toString();
    boolean var21 = var0.changecolor(1, (-1));
    boolean var24 = var0.changecolor(1, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "RR"+ "'", var10.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "RR"+ "'", var12.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "VR"+ "'", var16.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "VR"+ "'", var17.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "VR"+ "'", var18.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test113() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test113");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor((-1), 10);
    boolean var10 = var0.changecolor(10, 0);
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.toString();
    java.lang.String var13 = var0.toString();
    boolean var16 = var0.changecolor((-1), 100);
    java.lang.String var17 = var0.toString();
    java.lang.String var18 = var0.toString();
    boolean var21 = var0.changecolor(0, 0);
    boolean var24 = var0.changecolor(1, 100);
    boolean var27 = var0.changecolor(1, 100);
    java.lang.String var28 = var0.toString();
    boolean var31 = var0.changecolor((-1), (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "RR"+ "'", var12.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "RR"+ "'", var13.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "RR"+ "'", var17.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "RR"+ "'", var18.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "VR"+ "'", var28.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);

  }

  public void test114() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test114");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor((-1), 10);
    boolean var9 = var0.changecolor(100, (-1));
    boolean var12 = var0.changecolor(0, (-1));
    java.lang.String var13 = var0.toString();
    java.lang.String var14 = var0.toString();
    boolean var17 = var0.changecolor(10, 1);
    java.lang.String var18 = var0.toString();
    java.lang.String var19 = var0.toString();
    boolean var22 = var0.changecolor((-1), 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "RR"+ "'", var13.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "RR"+ "'", var14.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "RR"+ "'", var18.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "RR"+ "'", var19.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test115() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test115");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    java.lang.String var4 = var0.toString();
    java.lang.String var5 = var0.toString();
    java.lang.String var6 = var0.toString();
    java.lang.String var7 = var0.toString();
    boolean var10 = var0.changecolor(0, 1);
    java.lang.String var11 = var0.toString();
    boolean var14 = var0.changecolor(100, (-1));
    boolean var17 = var0.changecolor(0, 1);
    java.lang.String var18 = var0.toString();
    java.lang.String var19 = var0.toString();
    boolean var22 = var0.changecolor(0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "RR"+ "'", var4.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "RR"+ "'", var5.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "RR"+ "'", var6.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "RR"+ "'", var18.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "RR"+ "'", var19.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);

  }

  public void test116() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test116");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    java.lang.String var4 = var0.toString();
    java.lang.String var5 = var0.toString();
    java.lang.String var6 = var0.toString();
    java.lang.String var7 = var0.toString();
    java.lang.String var8 = var0.toString();
    java.lang.String var9 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "RR"+ "'", var4.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "RR"+ "'", var5.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "RR"+ "'", var6.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "RR"+ "'", var9.equals("RR"));

  }

  public void test117() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test117");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    java.lang.String var5 = var0.toString();
    java.lang.String var6 = var0.toString();
    java.lang.String var7 = var0.toString();
    boolean var10 = var0.changecolor(100, 1);
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.toString();
    boolean var15 = var0.changecolor(1, 100);
    boolean var18 = var0.changecolor(100, 0);
    java.lang.String var19 = var0.toString();
    boolean var22 = var0.changecolor(10, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "RR"+ "'", var5.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "RR"+ "'", var6.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "RR"+ "'", var12.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "RR"+ "'", var19.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test118() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test118");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, (-1));
    boolean var7 = var0.changecolor(1, 10);
    java.lang.String var8 = var0.toString();
    boolean var11 = var0.changecolor(100, 0);
    java.lang.String var12 = var0.toString();
    boolean var15 = var0.changecolor(10, 100);
    java.lang.String var16 = var0.toString();
    java.lang.String var17 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "RR"+ "'", var12.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "RR"+ "'", var16.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "RR"+ "'", var17.equals("RR"));

  }

  public void test119() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test119");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    java.lang.String var4 = var0.toString();
    java.lang.String var5 = var0.toString();
    java.lang.String var6 = var0.toString();
    java.lang.String var7 = var0.toString();
    boolean var10 = var0.changecolor(0, 1);
    java.lang.String var11 = var0.toString();
    boolean var14 = var0.changecolor(10, 100);
    boolean var17 = var0.changecolor(0, 0);
    boolean var20 = var0.changecolor(0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "RR"+ "'", var4.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "RR"+ "'", var5.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "RR"+ "'", var6.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);

  }

  public void test120() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test120");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor(1, 10);
    boolean var9 = var0.changecolor(1, 10);
    boolean var12 = var0.changecolor(100, 10);
    boolean var15 = var0.changecolor(1, 0);
    boolean var18 = var0.changecolor((-1), 0);
    java.lang.String var19 = var0.toString();
    boolean var22 = var0.changecolor(1, 10);
    java.lang.String var23 = var0.toString();
    java.lang.String var24 = var0.toString();
    java.lang.String var25 = var0.toString();
    boolean var28 = var0.changecolor(0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "RV"+ "'", var19.equals("RV"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "RV"+ "'", var23.equals("RV"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "RV"+ "'", var24.equals("RV"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "RV"+ "'", var25.equals("RV"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test121() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test121");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    java.lang.String var4 = var0.toString();
    boolean var7 = var0.changecolor(10, 1);
    java.lang.String var8 = var0.toString();
    java.lang.String var9 = var0.toString();
    boolean var12 = var0.changecolor(100, 100);
    boolean var15 = var0.changecolor(0, 10);
    boolean var18 = var0.changecolor(0, (-1));
    java.lang.String var19 = var0.toString();
    boolean var22 = var0.changecolor(0, 0);
    java.lang.String var23 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "RR"+ "'", var4.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "RR"+ "'", var9.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "RR"+ "'", var19.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "VR"+ "'", var23.equals("VR"));

  }

  public void test122() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test122");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, (-1));
    boolean var7 = var0.changecolor(10, 100);
    boolean var10 = var0.changecolor(0, (-1));
    boolean var13 = var0.changecolor(10, (-1));
    boolean var16 = var0.changecolor(100, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test123() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test123");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    boolean var6 = var0.changecolor(0, 1);
    java.lang.String var7 = var0.toString();
    boolean var10 = var0.changecolor((-1), (-1));
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.toString();
    boolean var15 = var0.changecolor(10, 1);
    boolean var18 = var0.changecolor(10, 1);
    java.lang.String var19 = var0.toString();
    boolean var22 = var0.changecolor(0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "RR"+ "'", var12.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "RR"+ "'", var19.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test124() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test124");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    java.lang.String var5 = var0.toString();
    java.lang.String var6 = var0.toString();
    boolean var9 = var0.changecolor((-1), 100);
    boolean var12 = var0.changecolor(100, 100);
    java.lang.String var13 = var0.toString();
    boolean var16 = var0.changecolor(100, 1);
    java.lang.String var17 = var0.toString();
    java.lang.String var18 = var0.toString();
    boolean var21 = var0.changecolor(0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "RR"+ "'", var5.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "RR"+ "'", var6.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "RR"+ "'", var13.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "RR"+ "'", var17.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "RR"+ "'", var18.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test125() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test125");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor((-1), 10);
    boolean var10 = var0.changecolor(10, 1);
    boolean var13 = var0.changecolor(0, (-1));
    java.lang.String var14 = var0.toString();
    boolean var17 = var0.changecolor(1, 0);
    boolean var20 = var0.changecolor((-1), 100);
    boolean var23 = var0.changecolor(0, 1);
    boolean var26 = var0.changecolor(100, 1);
    java.lang.String var27 = var0.toString();
    boolean var30 = var0.changecolor(1, 0);
    java.lang.String var31 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "RR"+ "'", var14.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "RV"+ "'", var27.equals("RV"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "RV"+ "'", var31.equals("RV"));

  }

  public void test126() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test126");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor((-1), 10);
    boolean var9 = var0.changecolor(0, (-1));
    boolean var12 = var0.changecolor(0, 0);
    boolean var15 = var0.changecolor(10, 100);
    boolean var18 = var0.changecolor(10, 1);
    java.lang.String var19 = var0.toString();
    java.lang.String var20 = var0.toString();
    boolean var23 = var0.changecolor(0, 0);
    java.lang.String var24 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "VR"+ "'", var19.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "VR"+ "'", var20.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "VR"+ "'", var24.equals("VR"));

  }

  public void test127() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test127");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    boolean var6 = var0.changecolor(0, 1);
    java.lang.String var7 = var0.toString();
    boolean var10 = var0.changecolor(1, 1);
    boolean var13 = var0.changecolor(10, 0);
    boolean var16 = var0.changecolor((-1), 1);
    boolean var19 = var0.changecolor(1, 100);
    java.lang.String var20 = var0.toString();
    boolean var23 = var0.changecolor(100, 0);
    boolean var26 = var0.changecolor(10, (-1));
    boolean var29 = var0.changecolor(100, (-1));
    boolean var32 = var0.changecolor((-1), 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "RR"+ "'", var20.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);

  }

  public void test128() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test128");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor(0, 1);
    boolean var10 = var0.changecolor(100, 10);
    boolean var13 = var0.changecolor((-1), 1);
    boolean var16 = var0.changecolor(100, 10);
    java.lang.String var17 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "RR"+ "'", var17.equals("RR"));

  }

  public void test129() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test129");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor(1, 10);
    boolean var9 = var0.changecolor((-1), (-1));
    boolean var12 = var0.changecolor((-1), 0);
    java.lang.String var13 = var0.toString();
    boolean var16 = var0.changecolor(0, 100);
    java.lang.String var17 = var0.toString();
    boolean var20 = var0.changecolor(1, 100);
    java.lang.String var21 = var0.toString();
    boolean var24 = var0.changecolor(10, 10);
    boolean var27 = var0.changecolor(100, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "RR"+ "'", var13.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "RR"+ "'", var17.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "RR"+ "'", var21.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test130() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test130");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor(1, 10);
    java.lang.String var7 = var0.toString();
    boolean var10 = var0.changecolor(100, 10);
    boolean var13 = var0.changecolor(10, 1);
    boolean var16 = var0.changecolor(1, 100);
    boolean var19 = var0.changecolor((-1), 1);
    boolean var22 = var0.changecolor(0, (-1));
    boolean var25 = var0.changecolor(100, 1);
    boolean var28 = var0.changecolor((-1), 100);
    boolean var31 = var0.changecolor(0, 10);
    boolean var34 = var0.changecolor((-1), 1);
    boolean var37 = var0.changecolor(10, 100);
    boolean var40 = var0.changecolor(0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
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
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);

  }

  public void test131() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test131");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor(1, 10);
    java.lang.String var7 = var0.toString();
    java.lang.String var8 = var0.toString();
    boolean var11 = var0.changecolor(0, 0);
    boolean var14 = var0.changecolor(10, 100);
    boolean var17 = var0.changecolor(10, 1);
    boolean var20 = var0.changecolor(0, 0);
    boolean var23 = var0.changecolor(10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
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

  }

  public void test132() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test132");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor((-1), 10);
    java.lang.String var8 = var0.toString();
    java.lang.String var9 = var0.toString();
    boolean var12 = var0.changecolor(0, 100);
    java.lang.String var13 = var0.toString();
    boolean var16 = var0.changecolor(10, (-1));
    boolean var19 = var0.changecolor(100, 1);
    java.lang.String var20 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "RR"+ "'", var9.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "RR"+ "'", var13.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "RR"+ "'", var20.equals("RR"));

  }

  public void test133() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test133");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor(1, 10);
    java.lang.String var7 = var0.toString();
    java.lang.String var8 = var0.toString();
    boolean var11 = var0.changecolor((-1), 1);
    java.lang.String var12 = var0.toString();
    java.lang.String var13 = var0.toString();
    java.lang.String var14 = var0.toString();
    java.lang.String var15 = var0.toString();
    boolean var18 = var0.changecolor(1, 100);
    java.lang.String var19 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "RR"+ "'", var12.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "RR"+ "'", var13.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "RR"+ "'", var14.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "RR"+ "'", var15.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "RR"+ "'", var19.equals("RR"));

  }

  public void test134() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test134");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    boolean var6 = var0.changecolor(0, 1);
    boolean var9 = var0.changecolor(100, 0);
    java.lang.String var10 = var0.toString();
    boolean var13 = var0.changecolor(10, (-1));
    java.lang.String var14 = var0.toString();
    boolean var17 = var0.changecolor((-1), (-1));
    boolean var20 = var0.changecolor(100, (-1));
    java.lang.String var21 = var0.toString();
    boolean var24 = var0.changecolor(100, (-1));
    boolean var27 = var0.changecolor(100, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "RR"+ "'", var10.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "RR"+ "'", var14.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "RR"+ "'", var21.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test135() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test135");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, (-1));
    boolean var7 = var0.changecolor(1, 10);
    java.lang.String var8 = var0.toString();
    boolean var11 = var0.changecolor(0, 10);
    boolean var14 = var0.changecolor(0, 1);
    java.lang.String var15 = var0.toString();
    boolean var18 = var0.changecolor((-1), 0);
    boolean var21 = var0.changecolor(100, (-1));
    java.lang.String var22 = var0.toString();
    java.lang.String var23 = var0.toString();
    boolean var26 = var0.changecolor(10, 0);
    java.lang.String var27 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "RR"+ "'", var15.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "RR"+ "'", var22.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "RR"+ "'", var23.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "RR"+ "'", var27.equals("RR"));

  }

  public void test136() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test136");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor(1, 10);
    boolean var9 = var0.changecolor(1, 10);
    boolean var12 = var0.changecolor(100, 10);
    boolean var15 = var0.changecolor((-1), 1);
    boolean var18 = var0.changecolor(100, 100);
    java.lang.String var19 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "RR"+ "'", var19.equals("RR"));

  }

  public void test137() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test137");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor(1, 10);
    boolean var9 = var0.changecolor((-1), (-1));
    java.lang.String var10 = var0.toString();
    boolean var13 = var0.changecolor(10, 10);
    boolean var16 = var0.changecolor((-1), 1);
    java.lang.String var17 = var0.toString();
    boolean var20 = var0.changecolor(100, (-1));
    boolean var23 = var0.changecolor(0, 0);
    boolean var26 = var0.changecolor(1, 1);
    boolean var29 = var0.changecolor(100, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "RR"+ "'", var10.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "RR"+ "'", var17.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test138() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test138");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    boolean var6 = var0.changecolor(10, 10);
    java.lang.String var7 = var0.toString();
    java.lang.String var8 = var0.toString();
    boolean var11 = var0.changecolor((-1), (-1));
    boolean var14 = var0.changecolor(1, 10);
    boolean var17 = var0.changecolor(0, 0);
    boolean var20 = var0.changecolor(1, 10);
    boolean var23 = var0.changecolor((-1), 1);
    boolean var26 = var0.changecolor((-1), 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test139() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test139");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor((-1), 10);
    boolean var9 = var0.changecolor(0, (-1));
    boolean var12 = var0.changecolor(0, 0);
    boolean var15 = var0.changecolor(10, 100);
    boolean var18 = var0.changecolor(0, 1);
    boolean var21 = var0.changecolor(0, 100);
    java.lang.String var22 = var0.toString();
    boolean var25 = var0.changecolor(0, 100);
    java.lang.String var26 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "GR"+ "'", var22.equals("GR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "GR"+ "'", var26.equals("GR"));

  }

  public void test140() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test140");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor((-1), 10);
    boolean var9 = var0.changecolor(100, 1);
    java.lang.String var10 = var0.toString();
    boolean var13 = var0.changecolor(0, 1);
    boolean var16 = var0.changecolor((-1), (-1));
    java.lang.String var17 = var0.toString();
    java.lang.String var18 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "RR"+ "'", var10.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "RR"+ "'", var17.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "RR"+ "'", var18.equals("RR"));

  }

  public void test141() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test141");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor(1, 10);
    boolean var9 = var0.changecolor(10, 10);
    java.lang.String var10 = var0.toString();
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.toString();
    java.lang.String var13 = var0.toString();
    boolean var16 = var0.changecolor(100, (-1));
    java.lang.String var17 = var0.toString();
    boolean var20 = var0.changecolor(0, (-1));
    java.lang.String var21 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "RR"+ "'", var10.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "RR"+ "'", var12.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "RR"+ "'", var13.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "RR"+ "'", var17.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "RR"+ "'", var21.equals("RR"));

  }

  public void test142() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test142");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor((-1), 10);
    boolean var9 = var0.changecolor(0, (-1));
    boolean var12 = var0.changecolor((-1), 0);
    java.lang.String var13 = var0.toString();
    boolean var16 = var0.changecolor(0, 1);
    java.lang.String var17 = var0.toString();
    boolean var20 = var0.changecolor((-1), 100);
    java.lang.String var21 = var0.toString();
    boolean var24 = var0.changecolor(100, (-1));
    boolean var27 = var0.changecolor(10, 100);
    boolean var30 = var0.changecolor(100, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "RR"+ "'", var13.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "RR"+ "'", var17.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "RR"+ "'", var21.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);

  }

  public void test143() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test143");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    boolean var5 = var0.changecolor(0, 0);
    java.lang.String var6 = var0.toString();
    java.lang.String var7 = var0.toString();
    boolean var10 = var0.changecolor(0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "VR"+ "'", var6.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "VR"+ "'", var7.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test144() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test144");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    java.lang.String var4 = var0.toString();
    boolean var7 = var0.changecolor(10, 1);
    java.lang.String var8 = var0.toString();
    boolean var11 = var0.changecolor(10, 0);
    java.lang.String var12 = var0.toString();
    boolean var15 = var0.changecolor(100, (-1));
    java.lang.String var16 = var0.toString();
    java.lang.String var17 = var0.toString();
    java.lang.String var18 = var0.toString();
    boolean var21 = var0.changecolor(100, (-1));
    java.lang.String var22 = var0.toString();
    java.lang.String var23 = var0.toString();
    boolean var26 = var0.changecolor((-1), 0);
    java.lang.String var27 = var0.toString();
    boolean var30 = var0.changecolor(0, 100);
    java.lang.String var31 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "RR"+ "'", var4.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "RR"+ "'", var12.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "RR"+ "'", var16.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "RR"+ "'", var17.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "RR"+ "'", var18.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "RR"+ "'", var22.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "RR"+ "'", var23.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "RR"+ "'", var27.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "RR"+ "'", var31.equals("RR"));

  }

  public void test145() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test145");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor(1, 10);
    boolean var9 = var0.changecolor((-1), (-1));
    boolean var12 = var0.changecolor(100, 100);
    java.lang.String var13 = var0.toString();
    boolean var16 = var0.changecolor(1, 0);
    boolean var19 = var0.changecolor(1, 1);
    boolean var22 = var0.changecolor((-1), (-1));
    boolean var25 = var0.changecolor(0, 10);
    boolean var28 = var0.changecolor((-1), 1);
    boolean var31 = var0.changecolor(10, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "RR"+ "'", var13.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);

  }

  public void test146() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test146");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    boolean var6 = var0.changecolor(0, 1);
    java.lang.String var7 = var0.toString();
    boolean var10 = var0.changecolor(100, 1);
    boolean var13 = var0.changecolor(100, 10);
    boolean var16 = var0.changecolor(10, 1);
    java.lang.String var17 = var0.toString();
    java.lang.String var18 = var0.toString();
    boolean var21 = var0.changecolor((-1), 10);
    java.lang.String var22 = var0.toString();
    boolean var25 = var0.changecolor((-1), (-1));
    boolean var28 = var0.changecolor(0, 0);
    boolean var31 = var0.changecolor(1, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "RR"+ "'", var17.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "RR"+ "'", var18.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "RR"+ "'", var22.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);

  }

  public void test147() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test147");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor(1, 10);
    java.lang.String var7 = var0.toString();
    java.lang.String var8 = var0.toString();
    boolean var11 = var0.changecolor(100, (-1));
    boolean var14 = var0.changecolor(1, 10);
    java.lang.String var15 = var0.toString();
    boolean var18 = var0.changecolor(100, 1);
    boolean var21 = var0.changecolor((-1), 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "RR"+ "'", var15.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test148() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test148");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    boolean var6 = var0.changecolor(0, 1);
    boolean var9 = var0.changecolor(100, 0);
    boolean var12 = var0.changecolor(0, 0);
    boolean var15 = var0.changecolor(100, 0);
    boolean var18 = var0.changecolor(1, 10);
    boolean var21 = var0.changecolor(10, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test149() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test149");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor((-1), 10);
    boolean var10 = var0.changecolor(10, 1);
    boolean var13 = var0.changecolor(0, (-1));
    boolean var16 = var0.changecolor(10, 100);
    boolean var19 = var0.changecolor(1, 100);
    boolean var22 = var0.changecolor(100, 100);
    boolean var25 = var0.changecolor(1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
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

  }

  public void test150() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test150");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor((-1), 10);
    boolean var9 = var0.changecolor(0, (-1));
    boolean var12 = var0.changecolor(0, 0);
    boolean var15 = var0.changecolor(10, 100);
    boolean var18 = var0.changecolor(0, 1);
    boolean var21 = var0.changecolor((-1), 100);
    boolean var24 = var0.changecolor(100, (-1));
    boolean var27 = var0.changecolor(10, (-1));
    java.lang.String var28 = var0.toString();
    boolean var31 = var0.changecolor(10, 100);
    boolean var34 = var0.changecolor(1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "GR"+ "'", var28.equals("GR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);

  }

  public void test151() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test151");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    java.lang.String var5 = var0.toString();
    java.lang.String var6 = var0.toString();
    java.lang.String var7 = var0.toString();
    boolean var10 = var0.changecolor(0, 0);
    boolean var13 = var0.changecolor(100, 1);
    boolean var16 = var0.changecolor(0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "RR"+ "'", var5.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "RR"+ "'", var6.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test152() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test152");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    boolean var6 = var0.changecolor(0, 1);
    boolean var9 = var0.changecolor(100, 0);
    boolean var12 = var0.changecolor(1, (-1));
    boolean var15 = var0.changecolor(100, 1);
    boolean var18 = var0.changecolor((-1), 0);
    boolean var21 = var0.changecolor(1, 0);
    boolean var24 = var0.changecolor(10, 0);
    java.lang.String var25 = var0.toString();
    boolean var28 = var0.changecolor(10, 1);
    
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
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "RV"+ "'", var25.equals("RV"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test153() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test153");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor((-1), 10);
    boolean var10 = var0.changecolor(10, 0);
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.toString();
    java.lang.String var13 = var0.toString();
    boolean var16 = var0.changecolor((-1), 100);
    java.lang.String var17 = var0.toString();
    java.lang.String var18 = var0.toString();
    java.lang.String var19 = var0.toString();
    boolean var22 = var0.changecolor(1, 0);
    java.lang.String var23 = var0.toString();
    boolean var26 = var0.changecolor(0, (-1));
    boolean var29 = var0.changecolor(10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "RR"+ "'", var12.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "RR"+ "'", var13.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "RR"+ "'", var17.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "RR"+ "'", var18.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "RR"+ "'", var19.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "RV"+ "'", var23.equals("RV"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test154() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test154");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor((-1), 10);
    java.lang.String var8 = var0.toString();
    boolean var11 = var0.changecolor(100, 0);
    boolean var14 = var0.changecolor(1, 1);
    boolean var17 = var0.changecolor(100, 100);
    boolean var20 = var0.changecolor(10, 1);
    java.lang.String var21 = var0.toString();
    boolean var24 = var0.changecolor(1, 10);
    boolean var27 = var0.changecolor(1, 1);
    java.lang.String var28 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "RR"+ "'", var21.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "RR"+ "'", var28.equals("RR"));

  }

  public void test155() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test155");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor(1, 10);
    boolean var9 = var0.changecolor(10, 10);
    java.lang.String var10 = var0.toString();
    java.lang.String var11 = var0.toString();
    boolean var14 = var0.changecolor(100, 0);
    boolean var17 = var0.changecolor(0, 0);
    boolean var20 = var0.changecolor(1, (-1));
    java.lang.String var21 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "RR"+ "'", var10.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "VR"+ "'", var21.equals("VR"));

  }

  public void test156() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test156");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor(1, 10);
    boolean var9 = var0.changecolor(1, 10);
    boolean var12 = var0.changecolor(100, 10);
    boolean var15 = var0.changecolor(1, 0);
    boolean var18 = var0.changecolor((-1), 0);
    boolean var21 = var0.changecolor(1, 10);
    java.lang.String var22 = var0.toString();
    boolean var25 = var0.changecolor(100, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "RV"+ "'", var22.equals("RV"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test157() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test157");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor((-1), 10);
    boolean var10 = var0.changecolor(10, 0);
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.toString();
    java.lang.String var13 = var0.toString();
    boolean var16 = var0.changecolor((-1), 100);
    boolean var19 = var0.changecolor(0, 10);
    java.lang.String var20 = var0.toString();
    boolean var23 = var0.changecolor(1, 1);
    boolean var26 = var0.changecolor(100, 1);
    java.lang.String var27 = var0.toString();
    java.lang.String var28 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "RR"+ "'", var12.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "RR"+ "'", var13.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "RR"+ "'", var20.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "RR"+ "'", var27.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "RR"+ "'", var28.equals("RR"));

  }

  public void test158() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test158");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    boolean var6 = var0.changecolor(0, 1);
    boolean var9 = var0.changecolor(100, 0);
    java.lang.String var10 = var0.toString();
    boolean var13 = var0.changecolor(10, (-1));
    java.lang.String var14 = var0.toString();
    boolean var17 = var0.changecolor((-1), (-1));
    boolean var20 = var0.changecolor(10, 1);
    boolean var23 = var0.changecolor((-1), 10);
    boolean var26 = var0.changecolor((-1), 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "RR"+ "'", var10.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "RR"+ "'", var14.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test159() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test159");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    java.lang.String var4 = var0.toString();
    boolean var7 = var0.changecolor((-1), 0);
    java.lang.String var8 = var0.toString();
    java.lang.String var9 = var0.toString();
    java.lang.String var10 = var0.toString();
    boolean var13 = var0.changecolor(10, 0);
    boolean var16 = var0.changecolor(10, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "RR"+ "'", var4.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "RR"+ "'", var9.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "RR"+ "'", var10.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test160() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test160");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor((-1), 10);
    boolean var10 = var0.changecolor(10, 0);
    boolean var13 = var0.changecolor(1, 1);
    java.lang.String var14 = var0.toString();
    java.lang.String var15 = var0.toString();
    boolean var18 = var0.changecolor(100, 1);
    java.lang.String var19 = var0.toString();
    boolean var22 = var0.changecolor(10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "RR"+ "'", var14.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "RR"+ "'", var15.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "RR"+ "'", var19.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test161() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test161");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    boolean var6 = var0.changecolor(0, 1);
    boolean var9 = var0.changecolor(100, 0);
    boolean var12 = var0.changecolor(1, (-1));
    boolean var15 = var0.changecolor(100, 1);
    boolean var18 = var0.changecolor((-1), 0);
    boolean var21 = var0.changecolor(10, 100);
    java.lang.String var22 = var0.toString();
    boolean var25 = var0.changecolor((-1), 0);
    java.lang.String var26 = var0.toString();
    
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
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "RR"+ "'", var22.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "RR"+ "'", var26.equals("RR"));

  }

  public void test162() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test162");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor((-1), 10);
    boolean var10 = var0.changecolor(10, 0);
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.toString();
    java.lang.String var13 = var0.toString();
    java.lang.String var14 = var0.toString();
    boolean var17 = var0.changecolor((-1), 1);
    boolean var20 = var0.changecolor(0, 100);
    boolean var23 = var0.changecolor((-1), 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "RR"+ "'", var12.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "RR"+ "'", var13.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "RR"+ "'", var14.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test163() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test163");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor(1, 1);
    boolean var9 = var0.changecolor(100, 10);
    boolean var12 = var0.changecolor(1, 10);
    boolean var15 = var0.changecolor((-1), 1);
    boolean var18 = var0.changecolor(100, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
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

  public void test164() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test164");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor(10, 10);
    boolean var10 = var0.changecolor(1, 10);
    boolean var13 = var0.changecolor(100, 10);
    boolean var16 = var0.changecolor(100, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test165() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test165");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor(1, 10);
    boolean var9 = var0.changecolor((-1), (-1));
    java.lang.String var10 = var0.toString();
    boolean var13 = var0.changecolor(10, 10);
    boolean var16 = var0.changecolor((-1), 1);
    java.lang.String var17 = var0.toString();
    java.lang.String var18 = var0.toString();
    boolean var21 = var0.changecolor(1, 10);
    java.lang.String var22 = var0.toString();
    boolean var25 = var0.changecolor(10, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "RR"+ "'", var10.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "RR"+ "'", var17.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "RR"+ "'", var18.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "RR"+ "'", var22.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test166() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test166");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    boolean var6 = var0.changecolor(0, 1);
    boolean var9 = var0.changecolor(100, 0);
    boolean var12 = var0.changecolor(1, (-1));
    boolean var15 = var0.changecolor(100, 1);
    java.lang.String var16 = var0.toString();
    boolean var19 = var0.changecolor(1, 1);
    boolean var22 = var0.changecolor(100, 10);
    boolean var25 = var0.changecolor((-1), 10);
    java.lang.String var26 = var0.toString();
    
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
    assertTrue("'" + var16 + "' != '" + "RR"+ "'", var16.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "RR"+ "'", var26.equals("RR"));

  }

  public void test167() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test167");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    boolean var5 = var0.changecolor(100, 1);
    boolean var8 = var0.changecolor(10, (-1));
    boolean var11 = var0.changecolor(1, 100);
    boolean var14 = var0.changecolor(100, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test168() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test168");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor((-1), 10);
    boolean var10 = var0.changecolor(10, 0);
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.toString();
    java.lang.String var13 = var0.toString();
    java.lang.String var14 = var0.toString();
    java.lang.String var15 = var0.toString();
    boolean var18 = var0.changecolor((-1), 0);
    boolean var21 = var0.changecolor((-1), (-1));
    boolean var24 = var0.changecolor((-1), 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "RR"+ "'", var12.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "RR"+ "'", var13.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "RR"+ "'", var14.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "RR"+ "'", var15.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test169() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test169");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor(1, 10);
    java.lang.String var7 = var0.toString();
    boolean var10 = var0.changecolor(100, 10);
    boolean var13 = var0.changecolor(10, 1);
    boolean var16 = var0.changecolor(1, 100);
    boolean var19 = var0.changecolor((-1), 1);
    boolean var22 = var0.changecolor(0, (-1));
    boolean var25 = var0.changecolor(100, 1);
    java.lang.String var26 = var0.toString();
    java.lang.String var27 = var0.toString();
    java.lang.String var28 = var0.toString();
    java.lang.String var29 = var0.toString();
    java.lang.String var30 = var0.toString();
    java.lang.String var31 = var0.toString();
    java.lang.String var32 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
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
    assertTrue("'" + var26 + "' != '" + "RR"+ "'", var26.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "RR"+ "'", var27.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "RR"+ "'", var28.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "RR"+ "'", var29.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "RR"+ "'", var30.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "RR"+ "'", var31.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "RR"+ "'", var32.equals("RR"));

  }

  public void test170() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test170");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor(1, 10);
    boolean var9 = var0.changecolor(1, 10);
    boolean var12 = var0.changecolor(100, 10);
    boolean var15 = var0.changecolor((-1), 1);
    boolean var18 = var0.changecolor((-1), 1);
    boolean var21 = var0.changecolor(0, 10);
    boolean var24 = var0.changecolor(0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);

  }

  public void test171() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test171");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    boolean var6 = var0.changecolor(0, 1);
    java.lang.String var7 = var0.toString();
    boolean var10 = var0.changecolor(1, 1);
    boolean var13 = var0.changecolor(10, 0);
    boolean var16 = var0.changecolor((-1), 1);
    boolean var19 = var0.changecolor(1, 100);
    java.lang.String var20 = var0.toString();
    java.lang.String var21 = var0.toString();
    java.lang.String var22 = var0.toString();
    boolean var25 = var0.changecolor(10, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "RR"+ "'", var20.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "RR"+ "'", var21.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "RR"+ "'", var22.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test172() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test172");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor((-1), 10);
    boolean var9 = var0.changecolor(0, (-1));
    boolean var12 = var0.changecolor((-1), 0);
    java.lang.String var13 = var0.toString();
    boolean var16 = var0.changecolor(0, 1);
    java.lang.String var17 = var0.toString();
    boolean var20 = var0.changecolor((-1), 100);
    java.lang.String var21 = var0.toString();
    java.lang.String var22 = var0.toString();
    boolean var25 = var0.changecolor(10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "RR"+ "'", var13.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "RR"+ "'", var17.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "RR"+ "'", var21.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "RR"+ "'", var22.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test173() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test173");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    boolean var6 = var0.changecolor(0, 1);
    java.lang.String var7 = var0.toString();
    boolean var10 = var0.changecolor(1, 1);
    java.lang.String var11 = var0.toString();
    boolean var14 = var0.changecolor(100, (-1));
    java.lang.String var15 = var0.toString();
    java.lang.String var16 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "RR"+ "'", var15.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "RR"+ "'", var16.equals("RR"));

  }

  public void test174() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test174");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    java.lang.String var4 = var0.toString();
    boolean var7 = var0.changecolor(10, 1);
    boolean var10 = var0.changecolor(10, 100);
    boolean var13 = var0.changecolor(100, 1);
    boolean var16 = var0.changecolor(0, 1);
    boolean var19 = var0.changecolor(10, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "RR"+ "'", var4.equals("RR"));
    
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

  }

  public void test175() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test175");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor((-1), 10);
    boolean var9 = var0.changecolor(0, (-1));
    boolean var12 = var0.changecolor(0, 0);
    boolean var15 = var0.changecolor(10, 100);
    java.lang.String var16 = var0.toString();
    boolean var19 = var0.changecolor(100, 100);
    boolean var22 = var0.changecolor(100, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "VR"+ "'", var16.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test176() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test176");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    boolean var5 = var0.changecolor(100, 1);
    boolean var8 = var0.changecolor(10, (-1));
    boolean var11 = var0.changecolor(1, (-1));
    boolean var14 = var0.changecolor((-1), 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test177() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test177");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor((-1), 10);
    boolean var9 = var0.changecolor(0, (-1));
    boolean var12 = var0.changecolor(0, 0);
    boolean var15 = var0.changecolor(10, 100);
    boolean var18 = var0.changecolor(10, 1);
    java.lang.String var19 = var0.toString();
    java.lang.String var20 = var0.toString();
    java.lang.String var21 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "VR"+ "'", var19.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "VR"+ "'", var20.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "VR"+ "'", var21.equals("VR"));

  }

  public void test178() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test178");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    java.lang.String var4 = var0.toString();
    boolean var7 = var0.changecolor(10, 1);
    java.lang.String var8 = var0.toString();
    boolean var11 = var0.changecolor(10, 1);
    boolean var14 = var0.changecolor(1, 1);
    boolean var17 = var0.changecolor((-1), 1);
    java.lang.String var18 = var0.toString();
    boolean var21 = var0.changecolor(100, 0);
    java.lang.String var22 = var0.toString();
    java.lang.String var23 = var0.toString();
    java.lang.String var24 = var0.toString();
    java.lang.String var25 = var0.toString();
    boolean var28 = var0.changecolor((-1), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "RR"+ "'", var4.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "RR"+ "'", var18.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "RR"+ "'", var22.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "RR"+ "'", var23.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "RR"+ "'", var24.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "RR"+ "'", var25.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test179() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test179");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    boolean var6 = var0.changecolor(0, 1);
    java.lang.String var7 = var0.toString();
    boolean var10 = var0.changecolor(100, 1);
    boolean var13 = var0.changecolor(100, 10);
    boolean var16 = var0.changecolor(10, 1);
    java.lang.String var17 = var0.toString();
    java.lang.String var18 = var0.toString();
    boolean var21 = var0.changecolor(1, (-1));
    java.lang.String var22 = var0.toString();
    java.lang.String var23 = var0.toString();
    boolean var26 = var0.changecolor((-1), 0);
    java.lang.String var27 = var0.toString();
    boolean var30 = var0.changecolor((-1), (-1));
    java.lang.String var31 = var0.toString();
    boolean var34 = var0.changecolor(100, 0);
    boolean var37 = var0.changecolor(100, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "RR"+ "'", var17.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "RR"+ "'", var18.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "RR"+ "'", var22.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "RR"+ "'", var23.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "RR"+ "'", var27.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "RR"+ "'", var31.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);

  }

  public void test180() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test180");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor((-1), 10);
    boolean var10 = var0.changecolor(10, 0);
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.toString();
    java.lang.String var13 = var0.toString();
    boolean var16 = var0.changecolor((-1), 100);
    boolean var19 = var0.changecolor(0, 100);
    boolean var22 = var0.changecolor(0, 10);
    java.lang.String var23 = var0.toString();
    boolean var26 = var0.changecolor(1, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "RR"+ "'", var12.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "RR"+ "'", var13.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "RR"+ "'", var23.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test181() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test181");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor(1, 10);
    java.lang.String var7 = var0.toString();
    boolean var10 = var0.changecolor(0, 1);
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.toString();
    java.lang.String var13 = var0.toString();
    boolean var16 = var0.changecolor(100, (-1));
    java.lang.String var17 = var0.toString();
    boolean var20 = var0.changecolor(1, 0);
    java.lang.String var21 = var0.toString();
    boolean var24 = var0.changecolor((-1), 10);
    boolean var27 = var0.changecolor(100, (-1));
    java.lang.String var28 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "RR"+ "'", var12.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "RR"+ "'", var13.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "RR"+ "'", var17.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "RV"+ "'", var21.equals("RV"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "RV"+ "'", var28.equals("RV"));

  }

  public void test182() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test182");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor((-1), 10);
    java.lang.String var4 = var0.toString();
    boolean var7 = var0.changecolor(100, (-1));
    boolean var10 = var0.changecolor(0, 10);
    boolean var13 = var0.changecolor(100, 1);
    boolean var16 = var0.changecolor(10, 1);
    java.lang.String var17 = var0.toString();
    java.lang.String var18 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "RR"+ "'", var4.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "RR"+ "'", var17.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "RR"+ "'", var18.equals("RR"));

  }

  public void test183() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test183");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(1, 100);
    java.lang.String var4 = var0.toString();
    java.lang.String var5 = var0.toString();
    boolean var8 = var0.changecolor(0, 1);
    boolean var11 = var0.changecolor(10, (-1));
    boolean var14 = var0.changecolor((-1), 1);
    java.lang.String var15 = var0.toString();
    boolean var18 = var0.changecolor(1, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "RR"+ "'", var4.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "RR"+ "'", var5.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "RR"+ "'", var15.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test184() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test184");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    java.lang.String var4 = var0.toString();
    boolean var7 = var0.changecolor(1, (-1));
    boolean var10 = var0.changecolor(0, 0);
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.toString();
    boolean var15 = var0.changecolor(0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "RR"+ "'", var4.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "VR"+ "'", var11.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "VR"+ "'", var12.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test185() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test185");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor((-1), 10);
    boolean var10 = var0.changecolor(10, 0);
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.toString();
    java.lang.String var13 = var0.toString();
    java.lang.String var14 = var0.toString();
    boolean var17 = var0.changecolor(1, 1);
    boolean var20 = var0.changecolor(0, 1);
    boolean var23 = var0.changecolor(0, 1);
    java.lang.String var24 = var0.toString();
    boolean var27 = var0.changecolor(0, 0);
    boolean var30 = var0.changecolor(100, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "RR"+ "'", var12.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "RR"+ "'", var13.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "RR"+ "'", var14.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "RR"+ "'", var24.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);

  }

  public void test186() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test186");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor((-1), 10);
    boolean var10 = var0.changecolor(10, 1);
    boolean var13 = var0.changecolor(0, (-1));
    java.lang.String var14 = var0.toString();
    boolean var17 = var0.changecolor(1, 10);
    boolean var20 = var0.changecolor((-1), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "RR"+ "'", var14.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test187() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test187");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    java.lang.String var5 = var0.toString();
    java.lang.String var6 = var0.toString();
    boolean var9 = var0.changecolor(1, 10);
    boolean var12 = var0.changecolor(10, 0);
    boolean var15 = var0.changecolor(0, 100);
    boolean var18 = var0.changecolor((-1), 10);
    java.lang.String var19 = var0.toString();
    java.lang.String var20 = var0.toString();
    boolean var23 = var0.changecolor(10, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "RR"+ "'", var5.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "RR"+ "'", var6.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "RR"+ "'", var19.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "RR"+ "'", var20.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test188() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test188");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(1, 100);
    boolean var6 = var0.changecolor(100, 1);
    java.lang.String var7 = var0.toString();
    java.lang.String var8 = var0.toString();
    java.lang.String var9 = var0.toString();
    java.lang.String var10 = var0.toString();
    boolean var13 = var0.changecolor(100, 1);
    boolean var16 = var0.changecolor(10, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "RR"+ "'", var9.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "RR"+ "'", var10.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test189() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test189");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor((-1), 10);
    boolean var10 = var0.changecolor(10, 1);
    boolean var13 = var0.changecolor(0, (-1));
    java.lang.String var14 = var0.toString();
    boolean var17 = var0.changecolor(1, 0);
    boolean var20 = var0.changecolor((-1), 100);
    boolean var23 = var0.changecolor(0, 1);
    boolean var26 = var0.changecolor(100, 1);
    boolean var29 = var0.changecolor(10, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "RR"+ "'", var14.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test190() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test190");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    java.lang.String var4 = var0.toString();
    java.lang.String var5 = var0.toString();
    boolean var8 = var0.changecolor(1, 0);
    java.lang.String var9 = var0.toString();
    boolean var12 = var0.changecolor(100, (-1));
    java.lang.String var13 = var0.toString();
    java.lang.String var14 = var0.toString();
    java.lang.String var15 = var0.toString();
    boolean var18 = var0.changecolor((-1), 10);
    boolean var21 = var0.changecolor(0, (-1));
    boolean var24 = var0.changecolor((-1), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "RR"+ "'", var4.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "RR"+ "'", var5.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "RV"+ "'", var9.equals("RV"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "RV"+ "'", var13.equals("RV"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "RV"+ "'", var14.equals("RV"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "RV"+ "'", var15.equals("RV"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test191() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test191");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor((-1), 10);
    java.lang.String var8 = var0.toString();
    boolean var11 = var0.changecolor(100, 0);
    boolean var14 = var0.changecolor(1, 1);
    boolean var17 = var0.changecolor((-1), 100);
    java.lang.String var18 = var0.toString();
    java.lang.String var19 = var0.toString();
    java.lang.String var20 = var0.toString();
    java.lang.String var21 = var0.toString();
    boolean var24 = var0.changecolor(0, (-1));
    boolean var27 = var0.changecolor(100, 10);
    java.lang.String var28 = var0.toString();
    boolean var31 = var0.changecolor((-1), 1);
    java.lang.String var32 = var0.toString();
    java.lang.String var33 = var0.toString();
    boolean var36 = var0.changecolor((-1), 0);
    boolean var39 = var0.changecolor((-1), 1);
    java.lang.String var40 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "RR"+ "'", var18.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "RR"+ "'", var19.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "RR"+ "'", var20.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "RR"+ "'", var21.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "RR"+ "'", var28.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "RR"+ "'", var32.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "RR"+ "'", var33.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "RR"+ "'", var40.equals("RR"));

  }

  public void test192() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test192");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    boolean var6 = var0.changecolor(0, 1);
    java.lang.String var7 = var0.toString();
    boolean var10 = var0.changecolor((-1), (-1));
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.toString();
    boolean var15 = var0.changecolor(10, 1);
    boolean var18 = var0.changecolor((-1), 0);
    java.lang.String var19 = var0.toString();
    boolean var22 = var0.changecolor(0, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "RR"+ "'", var12.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "RR"+ "'", var19.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test193() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test193");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor((-1), 10);
    boolean var10 = var0.changecolor(100, 100);
    java.lang.String var11 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));

  }

  public void test194() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test194");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor((-1), 10);
    boolean var9 = var0.changecolor(0, (-1));
    boolean var12 = var0.changecolor((-1), 0);
    java.lang.String var13 = var0.toString();
    java.lang.String var14 = var0.toString();
    java.lang.String var15 = var0.toString();
    boolean var18 = var0.changecolor(10, (-1));
    boolean var21 = var0.changecolor(1, 1);
    boolean var24 = var0.changecolor(0, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "RR"+ "'", var13.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "RR"+ "'", var14.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "RR"+ "'", var15.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test195() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test195");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor((-1), 10);
    boolean var10 = var0.changecolor(10, 0);
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.toString();
    java.lang.String var13 = var0.toString();
    java.lang.String var14 = var0.toString();
    java.lang.String var15 = var0.toString();
    boolean var18 = var0.changecolor((-1), 0);
    boolean var21 = var0.changecolor(100, 0);
    boolean var24 = var0.changecolor(0, 1);
    boolean var27 = var0.changecolor(1, (-1));
    boolean var30 = var0.changecolor(10, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "RR"+ "'", var12.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "RR"+ "'", var13.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "RR"+ "'", var14.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "RR"+ "'", var15.equals("RR"));
    
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

  }

  public void test196() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test196");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    boolean var6 = var0.changecolor(10, 10);
    java.lang.String var7 = var0.toString();
    java.lang.String var8 = var0.toString();
    java.lang.String var9 = var0.toString();
    boolean var12 = var0.changecolor(0, 0);
    java.lang.String var13 = var0.toString();
    java.lang.String var14 = var0.toString();
    boolean var17 = var0.changecolor((-1), 100);
    java.lang.String var18 = var0.toString();
    java.lang.String var19 = var0.toString();
    java.lang.String var20 = var0.toString();
    java.lang.String var21 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "RR"+ "'", var9.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "VR"+ "'", var13.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "VR"+ "'", var14.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "VR"+ "'", var18.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "VR"+ "'", var19.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "VR"+ "'", var20.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "VR"+ "'", var21.equals("VR"));

  }

  public void test197() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test197");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor(1, 10);
    boolean var9 = var0.changecolor(10, 10);
    boolean var12 = var0.changecolor(1, (-1));
    boolean var15 = var0.changecolor(10, 10);
    boolean var18 = var0.changecolor((-1), 0);
    boolean var21 = var0.changecolor((-1), 10);
    java.lang.String var22 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "RR"+ "'", var22.equals("RR"));

  }

  public void test198() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test198");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    java.lang.String var4 = var0.toString();
    boolean var7 = var0.changecolor(1, (-1));
    boolean var10 = var0.changecolor(100, 100);
    java.lang.String var11 = var0.toString();
    boolean var14 = var0.changecolor(1, 1);
    boolean var17 = var0.changecolor((-1), 100);
    boolean var20 = var0.changecolor(100, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "RR"+ "'", var4.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test199() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test199");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    java.lang.String var4 = var0.toString();
    boolean var7 = var0.changecolor(10, 1);
    boolean var10 = var0.changecolor(10, 100);
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.toString();
    java.lang.String var13 = var0.toString();
    boolean var16 = var0.changecolor(100, 10);
    boolean var19 = var0.changecolor(0, (-1));
    boolean var22 = var0.changecolor(0, 0);
    boolean var25 = var0.changecolor(0, 1);
    java.lang.String var26 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "RR"+ "'", var4.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "RR"+ "'", var12.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "RR"+ "'", var13.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "GR"+ "'", var26.equals("GR"));

  }

  public void test200() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test200");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    boolean var6 = var0.changecolor(0, 1);
    java.lang.String var7 = var0.toString();
    boolean var10 = var0.changecolor(10, 1);
    boolean var13 = var0.changecolor(100, 0);
    boolean var16 = var0.changecolor((-1), 0);
    boolean var19 = var0.changecolor((-1), 0);
    boolean var22 = var0.changecolor(0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
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

  public void test201() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test201");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, (-1));
    boolean var7 = var0.changecolor(1, 10);
    java.lang.String var8 = var0.toString();
    boolean var11 = var0.changecolor(100, 0);
    java.lang.String var12 = var0.toString();
    boolean var15 = var0.changecolor(0, 0);
    boolean var18 = var0.changecolor(10, 100);
    java.lang.String var19 = var0.toString();
    java.lang.String var20 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "RR"+ "'", var12.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "VR"+ "'", var19.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "VR"+ "'", var20.equals("VR"));

  }

  public void test202() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test202");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(1, 1);
    boolean var7 = var0.changecolor((-1), 1);
    java.lang.String var8 = var0.toString();
    boolean var11 = var0.changecolor(1, 10);
    java.lang.String var12 = var0.toString();
    java.lang.String var13 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "RR"+ "'", var12.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "RR"+ "'", var13.equals("RR"));

  }

  public void test203() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test203");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor((-1), 10);
    boolean var9 = var0.changecolor(0, (-1));
    boolean var12 = var0.changecolor(0, 0);
    boolean var15 = var0.changecolor(10, 100);
    java.lang.String var16 = var0.toString();
    java.lang.String var17 = var0.toString();
    boolean var20 = var0.changecolor(0, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "VR"+ "'", var16.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "VR"+ "'", var17.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test204() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test204");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    boolean var6 = var0.changecolor(0, 1);
    java.lang.String var7 = var0.toString();
    boolean var10 = var0.changecolor(100, 1);
    boolean var13 = var0.changecolor(0, 10);
    boolean var16 = var0.changecolor((-1), 1);
    boolean var19 = var0.changecolor(1, 100);
    boolean var22 = var0.changecolor(0, 1);
    boolean var25 = var0.changecolor(0, 100);
    boolean var28 = var0.changecolor(100, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
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
    assertTrue(var28 == false);

  }

  public void test205() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test205");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor((-1), 10);
    boolean var10 = var0.changecolor(10, 0);
    boolean var13 = var0.changecolor(10, (-1));
    boolean var16 = var0.changecolor(0, 100);
    java.lang.String var17 = var0.toString();
    boolean var20 = var0.changecolor(100, 100);
    boolean var23 = var0.changecolor(0, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "RR"+ "'", var17.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test206() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test206");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor((-1), 10);
    boolean var9 = var0.changecolor(0, (-1));
    java.lang.String var10 = var0.toString();
    java.lang.String var11 = var0.toString();
    boolean var14 = var0.changecolor(1, 1);
    java.lang.String var15 = var0.toString();
    boolean var18 = var0.changecolor(10, 0);
    boolean var21 = var0.changecolor(0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "RR"+ "'", var10.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "RR"+ "'", var15.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test207() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test207");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    boolean var6 = var0.changecolor(0, 1);
    boolean var9 = var0.changecolor(100, 0);
    java.lang.String var10 = var0.toString();
    java.lang.String var11 = var0.toString();
    boolean var14 = var0.changecolor(10, 0);
    java.lang.String var15 = var0.toString();
    java.lang.String var16 = var0.toString();
    java.lang.String var17 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "RR"+ "'", var10.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "RR"+ "'", var15.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "RR"+ "'", var16.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "RR"+ "'", var17.equals("RR"));

  }

  public void test208() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test208");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor(10, 10);
    java.lang.String var8 = var0.toString();
    java.lang.String var9 = var0.toString();
    boolean var12 = var0.changecolor(100, 0);
    boolean var15 = var0.changecolor(10, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "RR"+ "'", var9.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test209() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test209");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor(1, 10);
    boolean var9 = var0.changecolor((-1), (-1));
    boolean var12 = var0.changecolor((-1), 0);
    java.lang.String var13 = var0.toString();
    java.lang.String var14 = var0.toString();
    boolean var17 = var0.changecolor(10, 10);
    boolean var20 = var0.changecolor((-1), 100);
    boolean var23 = var0.changecolor(1, 10);
    boolean var26 = var0.changecolor((-1), 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "RR"+ "'", var13.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "RR"+ "'", var14.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test210() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test210");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    java.lang.String var4 = var0.toString();
    boolean var7 = var0.changecolor(10, 1);
    boolean var10 = var0.changecolor(10, 100);
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.toString();
    java.lang.String var13 = var0.toString();
    java.lang.String var14 = var0.toString();
    boolean var17 = var0.changecolor(0, 100);
    boolean var20 = var0.changecolor(0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "RR"+ "'", var4.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "RR"+ "'", var12.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "RR"+ "'", var13.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "RR"+ "'", var14.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test211() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test211");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    boolean var6 = var0.changecolor(0, 1);
    boolean var9 = var0.changecolor(100, 0);
    java.lang.String var10 = var0.toString();
    boolean var13 = var0.changecolor(10, (-1));
    boolean var16 = var0.changecolor((-1), (-1));
    java.lang.String var17 = var0.toString();
    java.lang.String var18 = var0.toString();
    boolean var21 = var0.changecolor(10, (-1));
    java.lang.String var22 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "RR"+ "'", var10.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "RR"+ "'", var17.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "RR"+ "'", var18.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "RR"+ "'", var22.equals("RR"));

  }

  public void test212() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test212");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor(1, 10);
    java.lang.String var7 = var0.toString();
    java.lang.String var8 = var0.toString();
    boolean var11 = var0.changecolor(100, (-1));
    boolean var14 = var0.changecolor(1, 10);
    boolean var17 = var0.changecolor((-1), 10);
    boolean var20 = var0.changecolor(0, 0);
    boolean var23 = var0.changecolor((-1), 1);
    java.lang.String var24 = var0.toString();
    boolean var27 = var0.changecolor(1, 0);
    java.lang.String var28 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "VR"+ "'", var24.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "VR"+ "'", var28.equals("VR"));

  }

  public void test213() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test213");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor((-1), 10);
    java.lang.String var8 = var0.toString();
    java.lang.String var9 = var0.toString();
    boolean var12 = var0.changecolor(0, 100);
    java.lang.String var13 = var0.toString();
    boolean var16 = var0.changecolor(10, (-1));
    boolean var19 = var0.changecolor(100, 1);
    boolean var22 = var0.changecolor(0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "RR"+ "'", var9.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "RR"+ "'", var13.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test214() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test214");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    java.lang.String var5 = var0.toString();
    java.lang.String var6 = var0.toString();
    boolean var9 = var0.changecolor((-1), 100);
    boolean var12 = var0.changecolor(100, 100);
    boolean var15 = var0.changecolor(100, 10);
    java.lang.String var16 = var0.toString();
    java.lang.String var17 = var0.toString();
    java.lang.String var18 = var0.toString();
    java.lang.String var19 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "RR"+ "'", var5.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "RR"+ "'", var6.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "RR"+ "'", var16.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "RR"+ "'", var17.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "RR"+ "'", var18.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "RR"+ "'", var19.equals("RR"));

  }

  public void test215() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test215");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor(10, 10);
    java.lang.String var8 = var0.toString();
    java.lang.String var9 = var0.toString();
    boolean var12 = var0.changecolor(100, 0);
    boolean var15 = var0.changecolor(0, 0);
    boolean var18 = var0.changecolor(1, 0);
    java.lang.String var19 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "RR"+ "'", var9.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "VR"+ "'", var19.equals("VR"));

  }

  public void test216() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test216");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor(1, 10);
    java.lang.String var7 = var0.toString();
    java.lang.String var8 = var0.toString();
    boolean var11 = var0.changecolor(0, 0);
    boolean var14 = var0.changecolor(100, 100);
    java.lang.String var15 = var0.toString();
    java.lang.String var16 = var0.toString();
    boolean var19 = var0.changecolor((-1), 1);
    boolean var22 = var0.changecolor(0, 1);
    boolean var25 = var0.changecolor(10, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "VR"+ "'", var15.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "VR"+ "'", var16.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test217() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test217");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    boolean var6 = var0.changecolor(0, 1);
    boolean var9 = var0.changecolor(100, 0);
    java.lang.String var10 = var0.toString();
    boolean var13 = var0.changecolor(1, (-1));
    boolean var16 = var0.changecolor(0, (-1));
    java.lang.String var17 = var0.toString();
    boolean var20 = var0.changecolor((-1), 10);
    boolean var23 = var0.changecolor(1, (-1));
    boolean var26 = var0.changecolor(0, 0);
    boolean var29 = var0.changecolor(0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "RR"+ "'", var10.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "RR"+ "'", var17.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test218() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test218");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor((-1), 10);
    boolean var10 = var0.changecolor(10, 0);
    boolean var13 = var0.changecolor(1, 1);
    java.lang.String var14 = var0.toString();
    boolean var17 = var0.changecolor(10, 0);
    boolean var20 = var0.changecolor(0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "RR"+ "'", var14.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test219() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test219");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    java.lang.String var4 = var0.toString();
    boolean var7 = var0.changecolor((-1), 0);
    java.lang.String var8 = var0.toString();
    java.lang.String var9 = var0.toString();
    java.lang.String var10 = var0.toString();
    boolean var13 = var0.changecolor(1, (-1));
    boolean var16 = var0.changecolor(10, 100);
    java.lang.String var17 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "RR"+ "'", var4.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "RR"+ "'", var9.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "RR"+ "'", var10.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "RR"+ "'", var17.equals("RR"));

  }

  public void test220() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test220");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor((-1), 10);
    boolean var10 = var0.changecolor((-1), 1);
    boolean var13 = var0.changecolor(10, 10);
    boolean var16 = var0.changecolor((-1), 100);
    java.lang.String var17 = var0.toString();
    boolean var20 = var0.changecolor(100, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "RR"+ "'", var17.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test221() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test221");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor((-1), 10);
    java.lang.String var8 = var0.toString();
    java.lang.String var9 = var0.toString();
    boolean var12 = var0.changecolor(0, 100);
    java.lang.String var13 = var0.toString();
    boolean var16 = var0.changecolor(10, (-1));
    boolean var19 = var0.changecolor(10, 1);
    boolean var22 = var0.changecolor(1, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "RR"+ "'", var9.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "RR"+ "'", var13.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test222() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test222");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    boolean var6 = var0.changecolor(10, 10);
    java.lang.String var7 = var0.toString();
    java.lang.String var8 = var0.toString();
    boolean var11 = var0.changecolor((-1), (-1));
    boolean var14 = var0.changecolor((-1), 100);
    java.lang.String var15 = var0.toString();
    boolean var18 = var0.changecolor(1, (-1));
    boolean var21 = var0.changecolor(10, 10);
    java.lang.String var22 = var0.toString();
    java.lang.String var23 = var0.toString();
    boolean var26 = var0.changecolor(10, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "RR"+ "'", var15.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "RR"+ "'", var22.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "RR"+ "'", var23.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test223() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test223");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(1, 100);
    java.lang.String var4 = var0.toString();
    boolean var7 = var0.changecolor(10, 10);
    java.lang.String var8 = var0.toString();
    boolean var11 = var0.changecolor(100, 1);
    boolean var14 = var0.changecolor(100, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "RR"+ "'", var4.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test224() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test224");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor((-1), 10);
    boolean var10 = var0.changecolor(10, 0);
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.toString();
    java.lang.String var13 = var0.toString();
    java.lang.String var14 = var0.toString();
    java.lang.String var15 = var0.toString();
    boolean var18 = var0.changecolor((-1), 0);
    java.lang.String var19 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "RR"+ "'", var12.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "RR"+ "'", var13.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "RR"+ "'", var14.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "RR"+ "'", var15.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "RR"+ "'", var19.equals("RR"));

  }

  public void test225() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test225");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor((-1), 10);
    boolean var9 = var0.changecolor(0, (-1));
    boolean var12 = var0.changecolor(0, 0);
    boolean var15 = var0.changecolor(10, 100);
    java.lang.String var16 = var0.toString();
    boolean var19 = var0.changecolor(100, 0);
    boolean var22 = var0.changecolor(1, 1);
    java.lang.String var23 = var0.toString();
    boolean var26 = var0.changecolor(100, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "VR"+ "'", var16.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "VR"+ "'", var23.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test226() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test226");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    boolean var6 = var0.changecolor(0, 1);
    boolean var9 = var0.changecolor(100, 0);
    boolean var12 = var0.changecolor((-1), 0);
    boolean var15 = var0.changecolor(10, 1);
    boolean var18 = var0.changecolor(0, 10);
    
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
    assertTrue(var18 == false);

  }

  public void test227() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test227");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor((-1), 10);
    boolean var9 = var0.changecolor(0, (-1));
    java.lang.String var10 = var0.toString();
    boolean var13 = var0.changecolor(1, 100);
    java.lang.String var14 = var0.toString();
    java.lang.String var15 = var0.toString();
    java.lang.String var16 = var0.toString();
    boolean var19 = var0.changecolor((-1), 100);
    boolean var22 = var0.changecolor(0, 10);
    boolean var25 = var0.changecolor(0, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "RR"+ "'", var10.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "RR"+ "'", var14.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "RR"+ "'", var15.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "RR"+ "'", var16.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test228() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test228");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    boolean var6 = var0.changecolor(0, 1);
    java.lang.String var7 = var0.toString();
    boolean var10 = var0.changecolor((-1), (-1));
    java.lang.String var11 = var0.toString();
    boolean var14 = var0.changecolor(0, 0);
    boolean var17 = var0.changecolor(100, 10);
    boolean var20 = var0.changecolor((-1), 1);
    java.lang.String var21 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "VR"+ "'", var21.equals("VR"));

  }

  public void test229() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test229");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor(1, 10);
    java.lang.String var7 = var0.toString();
    boolean var10 = var0.changecolor(100, 10);
    boolean var13 = var0.changecolor(10, 1);
    boolean var16 = var0.changecolor(1, 100);
    boolean var19 = var0.changecolor((-1), 1);
    boolean var22 = var0.changecolor(0, (-1));
    boolean var25 = var0.changecolor((-1), 10);
    boolean var28 = var0.changecolor(100, 100);
    java.lang.String var29 = var0.toString();
    java.lang.String var30 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
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
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "RR"+ "'", var29.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "RR"+ "'", var30.equals("RR"));

  }

  public void test230() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test230");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor(0, 1);
    boolean var10 = var0.changecolor(100, 10);
    boolean var13 = var0.changecolor((-1), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test231() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test231");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor((-1), 10);
    boolean var10 = var0.changecolor(10, 0);
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.toString();
    java.lang.String var13 = var0.toString();
    boolean var16 = var0.changecolor((-1), 100);
    boolean var19 = var0.changecolor(1, 100);
    java.lang.String var20 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "RR"+ "'", var12.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "RR"+ "'", var13.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "RR"+ "'", var20.equals("RR"));

  }

  public void test232() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test232");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    boolean var6 = var0.changecolor(0, 1);
    java.lang.String var7 = var0.toString();
    boolean var10 = var0.changecolor((-1), (-1));
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.toString();
    boolean var15 = var0.changecolor(10, 1);
    boolean var18 = var0.changecolor(10, (-1));
    boolean var21 = var0.changecolor(0, 100);
    boolean var24 = var0.changecolor((-1), (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "RR"+ "'", var12.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test233() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test233");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    boolean var6 = var0.changecolor(0, 1);
    boolean var9 = var0.changecolor(100, 0);
    java.lang.String var10 = var0.toString();
    boolean var13 = var0.changecolor(10, (-1));
    java.lang.String var14 = var0.toString();
    boolean var17 = var0.changecolor((-1), (-1));
    java.lang.String var18 = var0.toString();
    java.lang.String var19 = var0.toString();
    boolean var22 = var0.changecolor(10, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "RR"+ "'", var10.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "RR"+ "'", var14.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "RR"+ "'", var18.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "RR"+ "'", var19.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test234() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test234");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(1, 100);
    boolean var6 = var0.changecolor(100, 1);
    boolean var9 = var0.changecolor(1, (-1));
    boolean var12 = var0.changecolor(100, 0);
    java.lang.String var13 = var0.toString();
    java.lang.String var14 = var0.toString();
    java.lang.String var15 = var0.toString();
    boolean var18 = var0.changecolor(10, 100);
    boolean var21 = var0.changecolor(1, 1);
    boolean var24 = var0.changecolor(10, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "RR"+ "'", var13.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "RR"+ "'", var14.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "RR"+ "'", var15.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test235() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test235");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor((-1), 10);
    boolean var9 = var0.changecolor(0, (-1));
    boolean var12 = var0.changecolor(0, 0);
    boolean var15 = var0.changecolor(10, 100);
    boolean var18 = var0.changecolor(0, 1);
    boolean var21 = var0.changecolor(0, 100);
    boolean var24 = var0.changecolor(1, 10);
    java.lang.String var25 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "GR"+ "'", var25.equals("GR"));

  }

  public void test236() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test236");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor((-1), 10);
    boolean var10 = var0.changecolor(10, 0);
    java.lang.String var11 = var0.toString();
    boolean var14 = var0.changecolor(0, 0);
    java.lang.String var15 = var0.toString();
    boolean var18 = var0.changecolor(1, 0);
    boolean var21 = var0.changecolor(1, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "VR"+ "'", var15.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test237() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test237");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    java.lang.String var4 = var0.toString();
    boolean var7 = var0.changecolor(10, 1);
    boolean var10 = var0.changecolor(10, 100);
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.toString();
    boolean var15 = var0.changecolor(1, 1);
    boolean var18 = var0.changecolor(1, 100);
    java.lang.String var19 = var0.toString();
    java.lang.String var20 = var0.toString();
    java.lang.String var21 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "RR"+ "'", var4.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "RR"+ "'", var12.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "RR"+ "'", var19.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "RR"+ "'", var20.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "RR"+ "'", var21.equals("RR"));

  }

  public void test238() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test238");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    java.lang.String var4 = var0.toString();
    boolean var7 = var0.changecolor(10, 1);
    boolean var10 = var0.changecolor(10, 100);
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.toString();
    java.lang.String var13 = var0.toString();
    boolean var16 = var0.changecolor(100, 0);
    java.lang.String var17 = var0.toString();
    boolean var20 = var0.changecolor(100, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "RR"+ "'", var4.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "RR"+ "'", var12.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "RR"+ "'", var13.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "RR"+ "'", var17.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test239() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test239");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    java.lang.String var4 = var0.toString();
    boolean var7 = var0.changecolor(10, 1);
    java.lang.String var8 = var0.toString();
    java.lang.String var9 = var0.toString();
    boolean var12 = var0.changecolor(100, 100);
    boolean var15 = var0.changecolor(0, 10);
    boolean var18 = var0.changecolor(1, 10);
    boolean var21 = var0.changecolor(0, (-1));
    java.lang.String var22 = var0.toString();
    java.lang.String var23 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "RR"+ "'", var4.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "RR"+ "'", var9.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "RR"+ "'", var22.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "RR"+ "'", var23.equals("RR"));

  }

  public void test240() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test240");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor((-1), 10);
    java.lang.String var8 = var0.toString();
    boolean var11 = var0.changecolor(100, 0);
    boolean var14 = var0.changecolor(1, 1);
    boolean var17 = var0.changecolor((-1), 100);
    java.lang.String var18 = var0.toString();
    java.lang.String var19 = var0.toString();
    java.lang.String var20 = var0.toString();
    boolean var23 = var0.changecolor(0, 10);
    boolean var26 = var0.changecolor(1, (-1));
    java.lang.String var27 = var0.toString();
    boolean var30 = var0.changecolor((-1), 100);
    boolean var33 = var0.changecolor(0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "RR"+ "'", var18.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "RR"+ "'", var19.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "RR"+ "'", var20.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "RR"+ "'", var27.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);

  }

  public void test241() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test241");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    java.lang.String var4 = var0.toString();
    java.lang.String var5 = var0.toString();
    boolean var8 = var0.changecolor(1, 0);
    java.lang.String var9 = var0.toString();
    boolean var12 = var0.changecolor(10, 100);
    boolean var15 = var0.changecolor(10, 10);
    boolean var18 = var0.changecolor(10, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "RR"+ "'", var4.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "RR"+ "'", var5.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "RV"+ "'", var9.equals("RV"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test242() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test242");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, (-1));
    boolean var7 = var0.changecolor(1, 10);
    java.lang.String var8 = var0.toString();
    boolean var11 = var0.changecolor(0, 10);
    boolean var14 = var0.changecolor(0, 0);
    java.lang.String var15 = var0.toString();
    boolean var18 = var0.changecolor(100, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "VR"+ "'", var15.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test243() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test243");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    boolean var6 = var0.changecolor(0, 1);
    java.lang.String var7 = var0.toString();
    boolean var10 = var0.changecolor(100, 1);
    boolean var13 = var0.changecolor(100, 10);
    boolean var16 = var0.changecolor(10, 1);
    java.lang.String var17 = var0.toString();
    java.lang.String var18 = var0.toString();
    boolean var21 = var0.changecolor(1, (-1));
    java.lang.String var22 = var0.toString();
    java.lang.String var23 = var0.toString();
    boolean var26 = var0.changecolor((-1), 0);
    java.lang.String var27 = var0.toString();
    boolean var30 = var0.changecolor(10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "RR"+ "'", var17.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "RR"+ "'", var18.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "RR"+ "'", var22.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "RR"+ "'", var23.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "RR"+ "'", var27.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);

  }

  public void test244() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test244");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor(10, 1);
    boolean var10 = var0.changecolor(10, 100);
    boolean var13 = var0.changecolor(0, 1);
    java.lang.String var14 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "RR"+ "'", var14.equals("RR"));

  }

  public void test245() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test245");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    boolean var6 = var0.changecolor(0, 1);
    java.lang.String var7 = var0.toString();
    boolean var10 = var0.changecolor((-1), (-1));
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.toString();
    boolean var15 = var0.changecolor(10, 1);
    boolean var18 = var0.changecolor(10, (-1));
    boolean var21 = var0.changecolor(0, 0);
    java.lang.String var22 = var0.toString();
    java.lang.String var23 = var0.toString();
    boolean var26 = var0.changecolor(100, 100);
    java.lang.String var27 = var0.toString();
    java.lang.String var28 = var0.toString();
    boolean var31 = var0.changecolor(10, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "RR"+ "'", var12.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "VR"+ "'", var22.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "VR"+ "'", var23.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "VR"+ "'", var27.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "VR"+ "'", var28.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);

  }

  public void test246() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test246");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor((-1), 10);
    boolean var10 = var0.changecolor((-1), 1);
    java.lang.String var11 = var0.toString();
    boolean var14 = var0.changecolor(10, 0);
    boolean var17 = var0.changecolor(1, 10);
    boolean var20 = var0.changecolor((-1), 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test247() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test247");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor((-1), 10);
    boolean var10 = var0.changecolor(10, 1);
    java.lang.String var11 = var0.toString();
    boolean var14 = var0.changecolor(100, (-1));
    java.lang.String var15 = var0.toString();
    boolean var18 = var0.changecolor(0, 10);
    boolean var21 = var0.changecolor(0, 0);
    java.lang.String var22 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "RR"+ "'", var15.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "VR"+ "'", var22.equals("VR"));

  }

  public void test248() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test248");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor(100, (-1));
    java.lang.String var7 = var0.toString();
    boolean var10 = var0.changecolor(1, 1);
    boolean var13 = var0.changecolor(10, 0);
    java.lang.String var14 = var0.toString();
    boolean var17 = var0.changecolor(0, (-1));
    boolean var20 = var0.changecolor(100, 0);
    java.lang.String var21 = var0.toString();
    boolean var24 = var0.changecolor(100, 0);
    boolean var27 = var0.changecolor(1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "RR"+ "'", var14.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "RR"+ "'", var21.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test249() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test249");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor(1, 10);
    java.lang.String var7 = var0.toString();
    java.lang.String var8 = var0.toString();
    boolean var11 = var0.changecolor(100, (-1));
    boolean var14 = var0.changecolor(1, 10);
    boolean var17 = var0.changecolor((-1), 10);
    boolean var20 = var0.changecolor(0, 0);
    java.lang.String var21 = var0.toString();
    boolean var24 = var0.changecolor((-1), 10);
    java.lang.String var25 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "VR"+ "'", var21.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "VR"+ "'", var25.equals("VR"));

  }

  public void test250() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test250");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor((-1), 10);
    boolean var10 = var0.changecolor(10, 0);
    java.lang.String var11 = var0.toString();
    boolean var14 = var0.changecolor(0, 0);
    java.lang.String var15 = var0.toString();
    boolean var18 = var0.changecolor(1, 0);
    java.lang.String var19 = var0.toString();
    java.lang.String var20 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "VR"+ "'", var15.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "VR"+ "'", var19.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "VR"+ "'", var20.equals("VR"));

  }

  public void test251() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test251");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor((-1), 10);
    java.lang.String var4 = var0.toString();
    boolean var7 = var0.changecolor(10, 10);
    boolean var10 = var0.changecolor(0, 100);
    boolean var13 = var0.changecolor(100, 0);
    java.lang.String var14 = var0.toString();
    java.lang.String var15 = var0.toString();
    java.lang.String var16 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "RR"+ "'", var4.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "RR"+ "'", var14.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "RR"+ "'", var15.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "RR"+ "'", var16.equals("RR"));

  }

  public void test252() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test252");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor(1, 10);
    boolean var9 = var0.changecolor((-1), (-1));
    java.lang.String var10 = var0.toString();
    boolean var13 = var0.changecolor(10, 10);
    boolean var16 = var0.changecolor((-1), 1);
    java.lang.String var17 = var0.toString();
    boolean var20 = var0.changecolor(100, (-1));
    boolean var23 = var0.changecolor(0, 0);
    java.lang.String var24 = var0.toString();
    boolean var27 = var0.changecolor(0, 0);
    java.lang.String var28 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "RR"+ "'", var10.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "RR"+ "'", var17.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "VR"+ "'", var24.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "VR"+ "'", var28.equals("VR"));

  }

  public void test253() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test253");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor((-1), 10);
    boolean var10 = var0.changecolor(10, 0);
    boolean var13 = var0.changecolor(1, 1);
    java.lang.String var14 = var0.toString();
    boolean var17 = var0.changecolor(100, 10);
    java.lang.String var18 = var0.toString();
    boolean var21 = var0.changecolor(1, 1);
    boolean var24 = var0.changecolor(0, 100);
    boolean var27 = var0.changecolor((-1), 10);
    boolean var30 = var0.changecolor((-1), (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "RR"+ "'", var14.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "RR"+ "'", var18.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);

  }

  public void test254() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test254");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor((-1), 10);
    java.lang.String var8 = var0.toString();
    boolean var11 = var0.changecolor(100, 0);
    boolean var14 = var0.changecolor(1, 1);
    boolean var17 = var0.changecolor((-1), 100);
    java.lang.String var18 = var0.toString();
    java.lang.String var19 = var0.toString();
    java.lang.String var20 = var0.toString();
    boolean var23 = var0.changecolor(0, 10);
    boolean var26 = var0.changecolor(1, (-1));
    java.lang.String var27 = var0.toString();
    boolean var30 = var0.changecolor((-1), 100);
    boolean var33 = var0.changecolor(0, 0);
    java.lang.String var34 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "RR"+ "'", var18.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "RR"+ "'", var19.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "RR"+ "'", var20.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "RR"+ "'", var27.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "VR"+ "'", var34.equals("VR"));

  }

  public void test255() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test255");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    java.lang.String var4 = var0.toString();
    java.lang.String var5 = var0.toString();
    java.lang.String var6 = var0.toString();
    java.lang.String var7 = var0.toString();
    boolean var10 = var0.changecolor(0, 1);
    java.lang.String var11 = var0.toString();
    boolean var14 = var0.changecolor(10, 100);
    boolean var17 = var0.changecolor(100, 100);
    boolean var20 = var0.changecolor(100, 100);
    boolean var23 = var0.changecolor(1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "RR"+ "'", var4.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "RR"+ "'", var5.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "RR"+ "'", var6.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test256() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test256");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(1, 100);
    java.lang.String var4 = var0.toString();
    java.lang.String var5 = var0.toString();
    boolean var8 = var0.changecolor(0, 1);
    boolean var11 = var0.changecolor(10, 10);
    boolean var14 = var0.changecolor(1, 10);
    boolean var17 = var0.changecolor(1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "RR"+ "'", var4.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "RR"+ "'", var5.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);

  }

  public void test257() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test257");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(1, 100);
    boolean var6 = var0.changecolor(100, 1);
    java.lang.String var7 = var0.toString();
    java.lang.String var8 = var0.toString();
    boolean var11 = var0.changecolor(0, 10);
    boolean var14 = var0.changecolor((-1), (-1));
    boolean var17 = var0.changecolor(10, 100);
    java.lang.String var18 = var0.toString();
    java.lang.String var19 = var0.toString();
    java.lang.String var20 = var0.toString();
    boolean var23 = var0.changecolor(0, 1);
    boolean var26 = var0.changecolor(10, (-1));
    boolean var29 = var0.changecolor(100, 0);
    java.lang.String var30 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "RR"+ "'", var18.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "RR"+ "'", var19.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "RR"+ "'", var20.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "RR"+ "'", var30.equals("RR"));

  }

  public void test258() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test258");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor(100, (-1));
    java.lang.String var7 = var0.toString();
    java.lang.String var8 = var0.toString();
    boolean var11 = var0.changecolor(1, 0);
    boolean var14 = var0.changecolor(100, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test259() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test259");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor(10, 10);
    boolean var10 = var0.changecolor(1, 10);
    boolean var13 = var0.changecolor(1, 0);
    boolean var16 = var0.changecolor(1, 100);
    boolean var19 = var0.changecolor((-1), 100);
    java.lang.String var20 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "RV"+ "'", var20.equals("RV"));

  }

  public void test260() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test260");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor((-1), 10);
    boolean var10 = var0.changecolor(10, 0);
    boolean var13 = var0.changecolor(1, 1);
    boolean var16 = var0.changecolor((-1), 10);
    boolean var19 = var0.changecolor(0, 100);
    boolean var22 = var0.changecolor(100, 1);
    boolean var25 = var0.changecolor((-1), (-1));
    java.lang.String var26 = var0.toString();
    boolean var29 = var0.changecolor((-1), 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
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
    assertTrue("'" + var26 + "' != '" + "RR"+ "'", var26.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test261() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test261");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    boolean var6 = var0.changecolor(0, 1);
    java.lang.String var7 = var0.toString();
    boolean var10 = var0.changecolor(100, 1);
    boolean var13 = var0.changecolor(100, 10);
    boolean var16 = var0.changecolor(10, 1);
    java.lang.String var17 = var0.toString();
    java.lang.String var18 = var0.toString();
    boolean var21 = var0.changecolor(100, 100);
    java.lang.String var22 = var0.toString();
    java.lang.String var23 = var0.toString();
    boolean var26 = var0.changecolor(0, 0);
    boolean var29 = var0.changecolor(0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "RR"+ "'", var17.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "RR"+ "'", var18.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "RR"+ "'", var22.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "RR"+ "'", var23.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);

  }

  public void test262() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test262");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor((-1), 10);
    java.lang.String var8 = var0.toString();
    java.lang.String var9 = var0.toString();
    boolean var12 = var0.changecolor(0, 100);
    boolean var15 = var0.changecolor(100, 100);
    boolean var18 = var0.changecolor(100, 1);
    boolean var21 = var0.changecolor((-1), 100);
    boolean var24 = var0.changecolor(100, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "RR"+ "'", var9.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test263() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test263");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    java.lang.String var5 = var0.toString();
    java.lang.String var6 = var0.toString();
    java.lang.String var7 = var0.toString();
    java.lang.String var8 = var0.toString();
    boolean var11 = var0.changecolor(0, 10);
    java.lang.String var12 = var0.toString();
    java.lang.String var13 = var0.toString();
    java.lang.String var14 = var0.toString();
    boolean var17 = var0.changecolor(10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "RR"+ "'", var5.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "RR"+ "'", var6.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "RR"+ "'", var12.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "RR"+ "'", var13.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "RR"+ "'", var14.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test264() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test264");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor(1, 10);
    boolean var9 = var0.changecolor(1, 10);
    boolean var12 = var0.changecolor(100, 10);
    boolean var15 = var0.changecolor(1, 0);
    boolean var18 = var0.changecolor(100, 0);
    java.lang.String var19 = var0.toString();
    java.lang.String var20 = var0.toString();
    boolean var23 = var0.changecolor((-1), 10);
    java.lang.String var24 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "RV"+ "'", var19.equals("RV"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "RV"+ "'", var20.equals("RV"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "RV"+ "'", var24.equals("RV"));

  }

  public void test265() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test265");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    boolean var6 = var0.changecolor(0, 1);
    java.lang.String var7 = var0.toString();
    boolean var10 = var0.changecolor((-1), (-1));
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.toString();
    boolean var15 = var0.changecolor(10, (-1));
    boolean var18 = var0.changecolor(100, 1);
    boolean var21 = var0.changecolor((-1), 0);
    java.lang.String var22 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "RR"+ "'", var12.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "RR"+ "'", var22.equals("RR"));

  }

  public void test266() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test266");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(1, 100);
    boolean var6 = var0.changecolor(100, 1);
    boolean var9 = var0.changecolor(1, (-1));
    boolean var12 = var0.changecolor(0, 100);
    java.lang.String var13 = var0.toString();
    boolean var16 = var0.changecolor(10, (-1));
    boolean var19 = var0.changecolor(0, (-1));
    boolean var22 = var0.changecolor(1, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "RR"+ "'", var13.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test267() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test267");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor(1, 1);
    boolean var9 = var0.changecolor(100, 10);
    boolean var12 = var0.changecolor(0, (-1));
    boolean var15 = var0.changecolor((-1), (-1));
    java.lang.String var16 = var0.toString();
    java.lang.String var17 = var0.toString();
    boolean var20 = var0.changecolor(0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "RR"+ "'", var16.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "RR"+ "'", var17.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test268() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test268");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    boolean var5 = var0.changecolor(0, 0);
    java.lang.String var6 = var0.toString();
    boolean var9 = var0.changecolor(10, (-1));
    java.lang.String var10 = var0.toString();
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.toString();
    boolean var15 = var0.changecolor(100, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "VR"+ "'", var6.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "VR"+ "'", var10.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "VR"+ "'", var11.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "VR"+ "'", var12.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test269() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test269");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor(1, 10);
    java.lang.String var7 = var0.toString();
    boolean var10 = var0.changecolor(0, 1);
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.toString();
    java.lang.String var13 = var0.toString();
    boolean var16 = var0.changecolor(10, 1);
    java.lang.String var17 = var0.toString();
    java.lang.String var18 = var0.toString();
    boolean var21 = var0.changecolor(1, 1);
    boolean var24 = var0.changecolor(0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "RR"+ "'", var12.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "RR"+ "'", var13.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "RR"+ "'", var17.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "RR"+ "'", var18.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test270() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test270");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor((-1), 10);
    java.lang.String var4 = var0.toString();
    boolean var7 = var0.changecolor(0, 1);
    boolean var10 = var0.changecolor(1, 0);
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "RR"+ "'", var4.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RV"+ "'", var11.equals("RV"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "RV"+ "'", var12.equals("RV"));

  }

  public void test271() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test271");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor((-1), 10);
    boolean var10 = var0.changecolor((-1), 1);
    boolean var13 = var0.changecolor((-1), 0);
    boolean var16 = var0.changecolor(0, 1);
    java.lang.String var17 = var0.toString();
    boolean var20 = var0.changecolor(100, 0);
    java.lang.String var21 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "RR"+ "'", var17.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "RR"+ "'", var21.equals("RR"));

  }

  public void test272() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test272");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor(1, 10);
    java.lang.String var7 = var0.toString();
    java.lang.String var8 = var0.toString();
    boolean var11 = var0.changecolor(100, (-1));
    java.lang.String var12 = var0.toString();
    boolean var15 = var0.changecolor(0, 10);
    java.lang.String var16 = var0.toString();
    java.lang.String var17 = var0.toString();
    java.lang.String var18 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "RR"+ "'", var12.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "RR"+ "'", var16.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "RR"+ "'", var17.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "RR"+ "'", var18.equals("RR"));

  }

  public void test273() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test273");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    java.lang.String var4 = var0.toString();
    boolean var7 = var0.changecolor(10, 1);
    boolean var10 = var0.changecolor(10, 100);
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.toString();
    java.lang.String var13 = var0.toString();
    java.lang.String var14 = var0.toString();
    java.lang.String var15 = var0.toString();
    java.lang.String var16 = var0.toString();
    boolean var19 = var0.changecolor(100, 100);
    boolean var22 = var0.changecolor(1, 100);
    java.lang.String var23 = var0.toString();
    java.lang.String var24 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "RR"+ "'", var4.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "RR"+ "'", var12.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "RR"+ "'", var13.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "RR"+ "'", var14.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "RR"+ "'", var15.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "RR"+ "'", var16.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "RR"+ "'", var23.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "RR"+ "'", var24.equals("RR"));

  }

  public void test274() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test274");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor((-1), 10);
    boolean var10 = var0.changecolor(10, 0);
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.toString();
    java.lang.String var13 = var0.toString();
    java.lang.String var14 = var0.toString();
    boolean var17 = var0.changecolor(1, (-1));
    boolean var20 = var0.changecolor(0, (-1));
    boolean var23 = var0.changecolor(1, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "RR"+ "'", var12.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "RR"+ "'", var13.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "RR"+ "'", var14.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test275() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test275");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor((-1), 10);
    boolean var9 = var0.changecolor(0, (-1));
    boolean var12 = var0.changecolor(0, 0);
    boolean var15 = var0.changecolor(10, 100);
    java.lang.String var16 = var0.toString();
    java.lang.String var17 = var0.toString();
    java.lang.String var18 = var0.toString();
    java.lang.String var19 = var0.toString();
    boolean var22 = var0.changecolor(0, 0);
    java.lang.String var23 = var0.toString();
    java.lang.String var24 = var0.toString();
    java.lang.String var25 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "VR"+ "'", var16.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "VR"+ "'", var17.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "VR"+ "'", var18.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "VR"+ "'", var19.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "VR"+ "'", var23.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "VR"+ "'", var24.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "VR"+ "'", var25.equals("VR"));

  }

  public void test276() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test276");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    java.lang.String var4 = var0.toString();
    boolean var7 = var0.changecolor(10, 1);
    boolean var10 = var0.changecolor(10, 100);
    boolean var13 = var0.changecolor(10, 10);
    boolean var16 = var0.changecolor((-1), 10);
    boolean var19 = var0.changecolor(10, 1);
    boolean var22 = var0.changecolor(0, 100);
    boolean var25 = var0.changecolor(1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "RR"+ "'", var4.equals("RR"));
    
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

  }

  public void test277() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test277");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor((-1), 10);
    boolean var9 = var0.changecolor(0, (-1));
    java.lang.String var10 = var0.toString();
    java.lang.String var11 = var0.toString();
    boolean var14 = var0.changecolor(10, 100);
    java.lang.String var15 = var0.toString();
    boolean var18 = var0.changecolor((-1), 1);
    boolean var21 = var0.changecolor(10, 10);
    java.lang.String var22 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "RR"+ "'", var10.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "RR"+ "'", var15.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "RR"+ "'", var22.equals("RR"));

  }

  public void test278() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test278");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(1, 100);
    boolean var6 = var0.changecolor(1, 0);
    java.lang.String var7 = var0.toString();
    java.lang.String var8 = var0.toString();
    boolean var11 = var0.changecolor(100, 10);
    boolean var14 = var0.changecolor(100, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RV"+ "'", var7.equals("RV"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RV"+ "'", var8.equals("RV"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test279() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test279");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor((-1), 10);
    java.lang.String var7 = var0.toString();
    java.lang.String var8 = var0.toString();
    boolean var11 = var0.changecolor(0, 100);
    boolean var14 = var0.changecolor(100, 10);
    boolean var17 = var0.changecolor(100, 10);
    boolean var20 = var0.changecolor(0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test280() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test280");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    boolean var6 = var0.changecolor(0, 1);
    boolean var9 = var0.changecolor(100, 0);
    boolean var12 = var0.changecolor(1, (-1));
    boolean var15 = var0.changecolor(100, 1);
    boolean var18 = var0.changecolor((-1), 0);
    boolean var21 = var0.changecolor(1, 1);
    boolean var24 = var0.changecolor((-1), (-1));
    
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
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test281() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test281");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    boolean var6 = var0.changecolor(0, 1);
    java.lang.String var7 = var0.toString();
    boolean var10 = var0.changecolor((-1), (-1));
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.toString();
    boolean var15 = var0.changecolor(10, 1);
    boolean var18 = var0.changecolor(10, (-1));
    boolean var21 = var0.changecolor(0, 0);
    java.lang.String var22 = var0.toString();
    boolean var25 = var0.changecolor(1, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "RR"+ "'", var12.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "VR"+ "'", var22.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test282() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test282");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor((-1), 10);
    boolean var10 = var0.changecolor(10, 1);
    java.lang.String var11 = var0.toString();
    boolean var14 = var0.changecolor((-1), 100);
    boolean var17 = var0.changecolor(100, 10);
    boolean var20 = var0.changecolor(1, (-1));
    java.lang.String var21 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "RR"+ "'", var21.equals("RR"));

  }

  public void test283() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test283");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    java.lang.String var4 = var0.toString();
    boolean var7 = var0.changecolor(10, 1);
    boolean var10 = var0.changecolor(10, 100);
    boolean var13 = var0.changecolor(10, 10);
    boolean var16 = var0.changecolor((-1), 0);
    boolean var19 = var0.changecolor(0, 0);
    java.lang.String var20 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "RR"+ "'", var4.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "VR"+ "'", var20.equals("VR"));

  }

  public void test284() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test284");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    java.lang.String var5 = var0.toString();
    java.lang.String var6 = var0.toString();
    java.lang.String var7 = var0.toString();
    boolean var10 = var0.changecolor((-1), 1);
    boolean var13 = var0.changecolor(100, 1);
    boolean var16 = var0.changecolor(10, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "RR"+ "'", var5.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "RR"+ "'", var6.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test285() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test285");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    java.lang.String var4 = var0.toString();
    boolean var7 = var0.changecolor(10, 1);
    java.lang.String var8 = var0.toString();
    java.lang.String var9 = var0.toString();
    boolean var12 = var0.changecolor(100, 100);
    boolean var15 = var0.changecolor(0, 10);
    boolean var18 = var0.changecolor(0, (-1));
    java.lang.String var19 = var0.toString();
    boolean var22 = var0.changecolor(1, 1);
    boolean var25 = var0.changecolor((-1), 10);
    java.lang.String var26 = var0.toString();
    boolean var29 = var0.changecolor(10, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "RR"+ "'", var4.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "RR"+ "'", var9.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "RR"+ "'", var19.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "RR"+ "'", var26.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test286() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test286");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor(1, 10);
    boolean var9 = var0.changecolor((-1), (-1));
    boolean var12 = var0.changecolor((-1), 0);
    java.lang.String var13 = var0.toString();
    boolean var16 = var0.changecolor(10, 0);
    boolean var19 = var0.changecolor(0, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "RR"+ "'", var13.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test287() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test287");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    boolean var6 = var0.changecolor(10, 10);
    java.lang.String var7 = var0.toString();
    java.lang.String var8 = var0.toString();
    boolean var11 = var0.changecolor(10, 100);
    java.lang.String var12 = var0.toString();
    java.lang.String var13 = var0.toString();
    boolean var16 = var0.changecolor(10, 100);
    java.lang.String var17 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "RR"+ "'", var12.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "RR"+ "'", var13.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "RR"+ "'", var17.equals("RR"));

  }

  public void test288() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test288");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor(1, 10);
    java.lang.String var7 = var0.toString();
    java.lang.String var8 = var0.toString();
    boolean var11 = var0.changecolor(100, (-1));
    boolean var14 = var0.changecolor(1, 10);
    boolean var17 = var0.changecolor((-1), 10);
    boolean var20 = var0.changecolor(0, 0);
    boolean var23 = var0.changecolor((-1), 1);
    java.lang.String var24 = var0.toString();
    boolean var27 = var0.changecolor(1, 0);
    boolean var30 = var0.changecolor(10, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "VR"+ "'", var24.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);

  }

  public void test289() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test289");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(1, 100);
    boolean var6 = var0.changecolor(100, 1);
    boolean var9 = var0.changecolor(0, 0);
    boolean var12 = var0.changecolor(1, 10);
    boolean var15 = var0.changecolor(100, 100);
    java.lang.String var16 = var0.toString();
    boolean var19 = var0.changecolor(100, 0);
    java.lang.String var20 = var0.toString();
    boolean var23 = var0.changecolor(100, 0);
    boolean var26 = var0.changecolor((-1), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "VR"+ "'", var16.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "VR"+ "'", var20.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test290() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test290");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    java.lang.String var4 = var0.toString();
    boolean var7 = var0.changecolor(1, (-1));
    boolean var10 = var0.changecolor(100, 100);
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.toString();
    java.lang.String var13 = var0.toString();
    boolean var16 = var0.changecolor(0, 10);
    java.lang.String var17 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "RR"+ "'", var4.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "RR"+ "'", var12.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "RR"+ "'", var13.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "RR"+ "'", var17.equals("RR"));

  }

  public void test291() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test291");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor((-1), 10);
    boolean var10 = var0.changecolor(10, 0);
    boolean var13 = var0.changecolor(10, (-1));
    boolean var16 = var0.changecolor((-1), 10);
    boolean var19 = var0.changecolor(1, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
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

  }

  public void test292() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test292");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    java.lang.String var4 = var0.toString();
    java.lang.String var5 = var0.toString();
    boolean var8 = var0.changecolor(0, 1);
    boolean var11 = var0.changecolor(0, 100);
    java.lang.String var12 = var0.toString();
    boolean var15 = var0.changecolor((-1), 100);
    boolean var18 = var0.changecolor(1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "RR"+ "'", var4.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "RR"+ "'", var5.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "RR"+ "'", var12.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test293() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test293");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor((-1), 10);
    boolean var10 = var0.changecolor(10, 1);
    java.lang.String var11 = var0.toString();
    boolean var14 = var0.changecolor(100, (-1));
    boolean var17 = var0.changecolor(1, 10);
    java.lang.String var18 = var0.toString();
    java.lang.String var19 = var0.toString();
    boolean var22 = var0.changecolor((-1), 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "RR"+ "'", var18.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "RR"+ "'", var19.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test294() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test294");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    boolean var6 = var0.changecolor(10, 10);
    java.lang.String var7 = var0.toString();
    java.lang.String var8 = var0.toString();
    boolean var11 = var0.changecolor((-1), (-1));
    boolean var14 = var0.changecolor((-1), 100);
    java.lang.String var15 = var0.toString();
    boolean var18 = var0.changecolor(1, (-1));
    boolean var21 = var0.changecolor(100, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "RR"+ "'", var15.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test295() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test295");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    boolean var6 = var0.changecolor(0, 1);
    boolean var9 = var0.changecolor(100, 0);
    java.lang.String var10 = var0.toString();
    java.lang.String var11 = var0.toString();
    boolean var14 = var0.changecolor(10, 1);
    boolean var17 = var0.changecolor((-1), 10);
    java.lang.String var18 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "RR"+ "'", var10.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "RR"+ "'", var18.equals("RR"));

  }

  public void test296() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test296");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor((-1), 10);
    boolean var10 = var0.changecolor(10, 0);
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.toString();
    java.lang.String var13 = var0.toString();
    boolean var16 = var0.changecolor((-1), 100);
    java.lang.String var17 = var0.toString();
    java.lang.String var18 = var0.toString();
    boolean var21 = var0.changecolor(0, 0);
    boolean var24 = var0.changecolor(1, 100);
    boolean var27 = var0.changecolor(100, 100);
    java.lang.String var28 = var0.toString();
    boolean var31 = var0.changecolor(0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "RR"+ "'", var12.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "RR"+ "'", var13.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "RR"+ "'", var17.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "RR"+ "'", var18.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "VR"+ "'", var28.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);

  }

  public void test297() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test297");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, (-1));
    boolean var7 = var0.changecolor(1, 10);
    java.lang.String var8 = var0.toString();
    boolean var11 = var0.changecolor((-1), 1);
    boolean var14 = var0.changecolor(0, 0);
    boolean var17 = var0.changecolor(1, 100);
    boolean var20 = var0.changecolor(1, 100);
    boolean var23 = var0.changecolor(1, 0);
    boolean var26 = var0.changecolor(1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test298() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test298");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor((-1), 10);
    boolean var10 = var0.changecolor(10, 1);
    boolean var13 = var0.changecolor(0, (-1));
    boolean var16 = var0.changecolor((-1), 100);
    java.lang.String var17 = var0.toString();
    java.lang.String var18 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "RR"+ "'", var17.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "RR"+ "'", var18.equals("RR"));

  }

  public void test299() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test299");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor((-1), 10);
    boolean var10 = var0.changecolor(10, 1);
    boolean var13 = var0.changecolor(0, (-1));
    java.lang.String var14 = var0.toString();
    java.lang.String var15 = var0.toString();
    boolean var18 = var0.changecolor(1, 100);
    boolean var21 = var0.changecolor(0, 10);
    boolean var24 = var0.changecolor(1, (-1));
    boolean var27 = var0.changecolor(10, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "RR"+ "'", var14.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "RR"+ "'", var15.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test300() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test300");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    java.lang.String var4 = var0.toString();
    boolean var7 = var0.changecolor(1, (-1));
    boolean var10 = var0.changecolor(100, 100);
    java.lang.String var11 = var0.toString();
    boolean var14 = var0.changecolor(1, 1);
    java.lang.String var15 = var0.toString();
    boolean var18 = var0.changecolor(10, 100);
    java.lang.String var19 = var0.toString();
    java.lang.String var20 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "RR"+ "'", var4.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "RR"+ "'", var15.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "RR"+ "'", var19.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "RR"+ "'", var20.equals("RR"));

  }

  public void test301() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test301");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor((-1), 10);
    boolean var10 = var0.changecolor(10, 0);
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.toString();
    java.lang.String var13 = var0.toString();
    boolean var16 = var0.changecolor((-1), 100);
    java.lang.String var17 = var0.toString();
    java.lang.String var18 = var0.toString();
    java.lang.String var19 = var0.toString();
    java.lang.String var20 = var0.toString();
    java.lang.String var21 = var0.toString();
    boolean var24 = var0.changecolor(1, 0);
    java.lang.String var25 = var0.toString();
    java.lang.String var26 = var0.toString();
    java.lang.String var27 = var0.toString();
    boolean var30 = var0.changecolor(0, 1);
    java.lang.String var31 = var0.toString();
    java.lang.String var32 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "RR"+ "'", var12.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "RR"+ "'", var13.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "RR"+ "'", var17.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "RR"+ "'", var18.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "RR"+ "'", var19.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "RR"+ "'", var20.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "RR"+ "'", var21.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "RV"+ "'", var25.equals("RV"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "RV"+ "'", var26.equals("RV"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "RV"+ "'", var27.equals("RV"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "RV"+ "'", var31.equals("RV"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "RV"+ "'", var32.equals("RV"));

  }

  public void test302() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test302");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor((-1), 10);
    boolean var9 = var0.changecolor(100, (-1));
    boolean var12 = var0.changecolor(100, 0);
    java.lang.String var13 = var0.toString();
    boolean var16 = var0.changecolor(0, 100);
    java.lang.String var17 = var0.toString();
    java.lang.String var18 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "RR"+ "'", var13.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "RR"+ "'", var17.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "RR"+ "'", var18.equals("RR"));

  }

  public void test303() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test303");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    boolean var6 = var0.changecolor(0, 1);
    boolean var9 = var0.changecolor(100, 0);
    boolean var12 = var0.changecolor(1, (-1));
    boolean var15 = var0.changecolor(100, 1);
    boolean var18 = var0.changecolor((-1), 0);
    boolean var21 = var0.changecolor(10, 1);
    boolean var24 = var0.changecolor((-1), 10);
    boolean var27 = var0.changecolor(100, 1);
    
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
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test304() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test304");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor(1, 10);
    java.lang.String var7 = var0.toString();
    boolean var10 = var0.changecolor(100, 10);
    boolean var13 = var0.changecolor(10, 1);
    boolean var16 = var0.changecolor(1, 100);
    boolean var19 = var0.changecolor(1, 0);
    boolean var22 = var0.changecolor(1, (-1));
    java.lang.String var23 = var0.toString();
    boolean var26 = var0.changecolor(10, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "RV"+ "'", var23.equals("RV"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test305() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test305");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor((-1), 10);
    boolean var9 = var0.changecolor(0, (-1));
    boolean var12 = var0.changecolor(0, 0);
    boolean var15 = var0.changecolor(10, 100);
    boolean var18 = var0.changecolor((-1), 0);
    boolean var21 = var0.changecolor(1, 0);
    boolean var24 = var0.changecolor(1, 100);
    java.lang.String var25 = var0.toString();
    boolean var28 = var0.changecolor((-1), (-1));
    java.lang.String var29 = var0.toString();
    java.lang.String var30 = var0.toString();
    java.lang.String var31 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "VR"+ "'", var25.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "VR"+ "'", var29.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "VR"+ "'", var30.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "VR"+ "'", var31.equals("VR"));

  }

  public void test306() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test306");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor((-1), 10);
    boolean var10 = var0.changecolor(10, 1);
    boolean var13 = var0.changecolor(0, (-1));
    java.lang.String var14 = var0.toString();
    boolean var17 = var0.changecolor(1, 10);
    boolean var20 = var0.changecolor(100, (-1));
    boolean var23 = var0.changecolor(1, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "RR"+ "'", var14.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test307() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test307");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor((-1), 10);
    boolean var10 = var0.changecolor((-1), 1);
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.toString();
    java.lang.String var13 = var0.toString();
    boolean var16 = var0.changecolor((-1), 1);
    java.lang.String var17 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "RR"+ "'", var12.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "RR"+ "'", var13.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "RR"+ "'", var17.equals("RR"));

  }

  public void test308() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test308");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    java.lang.String var4 = var0.toString();
    boolean var7 = var0.changecolor(1, (-1));
    java.lang.String var8 = var0.toString();
    boolean var11 = var0.changecolor((-1), 1);
    java.lang.String var12 = var0.toString();
    java.lang.String var13 = var0.toString();
    java.lang.String var14 = var0.toString();
    java.lang.String var15 = var0.toString();
    boolean var18 = var0.changecolor((-1), 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "RR"+ "'", var4.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "RR"+ "'", var12.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "RR"+ "'", var13.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "RR"+ "'", var14.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "RR"+ "'", var15.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test309() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test309");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor(10, 10);
    boolean var10 = var0.changecolor(1, 10);
    boolean var13 = var0.changecolor(1, 0);
    boolean var16 = var0.changecolor(1, 100);
    boolean var19 = var0.changecolor((-1), 100);
    boolean var22 = var0.changecolor(10, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test310() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test310");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    boolean var6 = var0.changecolor(0, 1);
    boolean var9 = var0.changecolor(100, 0);
    java.lang.String var10 = var0.toString();
    java.lang.String var11 = var0.toString();
    boolean var14 = var0.changecolor(1, 1);
    java.lang.String var15 = var0.toString();
    boolean var18 = var0.changecolor(0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "RR"+ "'", var10.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "RR"+ "'", var15.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test311() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test311");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor(1, 10);
    boolean var9 = var0.changecolor(1, 10);
    boolean var12 = var0.changecolor(100, 10);
    boolean var15 = var0.changecolor(100, 1);
    java.lang.String var16 = var0.toString();
    java.lang.String var17 = var0.toString();
    java.lang.String var18 = var0.toString();
    java.lang.String var19 = var0.toString();
    java.lang.String var20 = var0.toString();
    boolean var23 = var0.changecolor(1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "RR"+ "'", var16.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "RR"+ "'", var17.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "RR"+ "'", var18.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "RR"+ "'", var19.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "RR"+ "'", var20.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test312() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test312");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(1, 100);
    java.lang.String var4 = var0.toString();
    boolean var7 = var0.changecolor(10, 0);
    boolean var10 = var0.changecolor(100, 10);
    boolean var13 = var0.changecolor(10, 1);
    boolean var16 = var0.changecolor(1, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "RR"+ "'", var4.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test313() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test313");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor(1, 10);
    boolean var9 = var0.changecolor((-1), (-1));
    java.lang.String var10 = var0.toString();
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.toString();
    boolean var15 = var0.changecolor(0, 100);
    boolean var18 = var0.changecolor(100, 10);
    boolean var21 = var0.changecolor(1, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "RR"+ "'", var10.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "RR"+ "'", var12.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test314() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test314");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    java.lang.String var5 = var0.toString();
    java.lang.String var6 = var0.toString();
    java.lang.String var7 = var0.toString();
    boolean var10 = var0.changecolor(100, 1);
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.toString();
    java.lang.String var13 = var0.toString();
    boolean var16 = var0.changecolor(1, (-1));
    boolean var19 = var0.changecolor(10, 0);
    java.lang.String var20 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "RR"+ "'", var5.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "RR"+ "'", var6.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "RR"+ "'", var12.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "RR"+ "'", var13.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "RR"+ "'", var20.equals("RR"));

  }

  public void test315() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test315");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    boolean var6 = var0.changecolor(0, 1);
    java.lang.String var7 = var0.toString();
    boolean var10 = var0.changecolor((-1), (-1));
    java.lang.String var11 = var0.toString();
    boolean var14 = var0.changecolor(0, 0);
    boolean var17 = var0.changecolor(100, 10);
    java.lang.String var18 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "VR"+ "'", var18.equals("VR"));

  }

  public void test316() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test316");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    boolean var5 = var0.changecolor(0, 0);
    java.lang.String var6 = var0.toString();
    java.lang.String var7 = var0.toString();
    java.lang.String var8 = var0.toString();
    boolean var11 = var0.changecolor(10, 1);
    java.lang.String var12 = var0.toString();
    boolean var15 = var0.changecolor((-1), (-1));
    java.lang.String var16 = var0.toString();
    java.lang.String var17 = var0.toString();
    boolean var20 = var0.changecolor(100, 0);
    java.lang.String var21 = var0.toString();
    boolean var24 = var0.changecolor((-1), (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "VR"+ "'", var6.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "VR"+ "'", var7.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "VR"+ "'", var8.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "VR"+ "'", var12.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "VR"+ "'", var16.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "VR"+ "'", var17.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "VR"+ "'", var21.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test317() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test317");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    boolean var6 = var0.changecolor(0, 1);
    java.lang.String var7 = var0.toString();
    boolean var10 = var0.changecolor((-1), (-1));
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.toString();
    boolean var15 = var0.changecolor(10, 1);
    boolean var18 = var0.changecolor(10, (-1));
    boolean var21 = var0.changecolor(0, 0);
    java.lang.String var22 = var0.toString();
    java.lang.String var23 = var0.toString();
    boolean var26 = var0.changecolor(100, 100);
    boolean var29 = var0.changecolor((-1), 0);
    boolean var32 = var0.changecolor((-1), 100);
    boolean var35 = var0.changecolor(10, 0);
    java.lang.String var36 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "RR"+ "'", var12.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "VR"+ "'", var22.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "VR"+ "'", var23.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "VR"+ "'", var36.equals("VR"));

  }

  public void test318() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test318");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, (-1));
    boolean var7 = var0.changecolor(1, 10);
    java.lang.String var8 = var0.toString();
    boolean var11 = var0.changecolor(0, 10);
    boolean var14 = var0.changecolor(0, 0);
    boolean var17 = var0.changecolor(100, (-1));
    boolean var20 = var0.changecolor(1, 1);
    java.lang.String var21 = var0.toString();
    boolean var24 = var0.changecolor(100, (-1));
    boolean var27 = var0.changecolor(100, 10);
    boolean var30 = var0.changecolor((-1), 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "VR"+ "'", var21.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);

  }

  public void test319() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test319");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(1, 100);
    java.lang.String var4 = var0.toString();
    boolean var7 = var0.changecolor(0, (-1));
    boolean var10 = var0.changecolor(100, 10);
    boolean var13 = var0.changecolor(1, 1);
    java.lang.String var14 = var0.toString();
    boolean var17 = var0.changecolor((-1), (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "RR"+ "'", var4.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "RR"+ "'", var14.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test320() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test320");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    java.lang.String var4 = var0.toString();
    boolean var7 = var0.changecolor(10, 1);
    java.lang.String var8 = var0.toString();
    java.lang.String var9 = var0.toString();
    boolean var12 = var0.changecolor(100, 100);
    boolean var15 = var0.changecolor(0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "RR"+ "'", var4.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "RR"+ "'", var9.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test321() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test321");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(1, 100);
    java.lang.String var4 = var0.toString();
    boolean var7 = var0.changecolor(0, (-1));
    boolean var10 = var0.changecolor(100, 10);
    boolean var13 = var0.changecolor(1, 1);
    java.lang.String var14 = var0.toString();
    java.lang.String var15 = var0.toString();
    java.lang.String var16 = var0.toString();
    java.lang.String var17 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "RR"+ "'", var4.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "RR"+ "'", var14.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "RR"+ "'", var15.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "RR"+ "'", var16.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "RR"+ "'", var17.equals("RR"));

  }

  public void test322() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test322");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor(1, 10);
    java.lang.String var7 = var0.toString();
    java.lang.String var8 = var0.toString();
    java.lang.String var9 = var0.toString();
    java.lang.String var10 = var0.toString();
    java.lang.String var11 = var0.toString();
    boolean var14 = var0.changecolor(0, 100);
    boolean var17 = var0.changecolor(100, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "RR"+ "'", var9.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "RR"+ "'", var10.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test323() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test323");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    java.lang.String var5 = var0.toString();
    java.lang.String var6 = var0.toString();
    java.lang.String var7 = var0.toString();
    java.lang.String var8 = var0.toString();
    boolean var11 = var0.changecolor(0, 10);
    boolean var14 = var0.changecolor((-1), 100);
    boolean var17 = var0.changecolor(1, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "RR"+ "'", var5.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "RR"+ "'", var6.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test324() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test324");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor(1, 10);
    java.lang.String var7 = var0.toString();
    java.lang.String var8 = var0.toString();
    boolean var11 = var0.changecolor(0, 0);
    boolean var14 = var0.changecolor(10, 100);
    boolean var17 = var0.changecolor(100, 100);
    boolean var20 = var0.changecolor(100, 0);
    java.lang.String var21 = var0.toString();
    boolean var24 = var0.changecolor(100, (-1));
    boolean var27 = var0.changecolor(0, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "VR"+ "'", var21.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test325() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test325");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor((-1), 10);
    boolean var9 = var0.changecolor(0, (-1));
    boolean var12 = var0.changecolor(0, 0);
    boolean var15 = var0.changecolor(10, 100);
    boolean var18 = var0.changecolor(0, 1);
    boolean var21 = var0.changecolor(0, 100);
    java.lang.String var22 = var0.toString();
    java.lang.String var23 = var0.toString();
    boolean var26 = var0.changecolor(10, (-1));
    boolean var29 = var0.changecolor(0, 10);
    boolean var32 = var0.changecolor(0, 100);
    java.lang.String var33 = var0.toString();
    java.lang.String var34 = var0.toString();
    boolean var37 = var0.changecolor(100, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "GR"+ "'", var22.equals("GR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "GR"+ "'", var23.equals("GR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "GR"+ "'", var33.equals("GR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "GR"+ "'", var34.equals("GR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);

  }

  public void test326() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test326");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor((-1), 10);
    boolean var10 = var0.changecolor(10, 0);
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.toString();
    java.lang.String var13 = var0.toString();
    java.lang.String var14 = var0.toString();
    boolean var17 = var0.changecolor(1, (-1));
    boolean var20 = var0.changecolor(0, (-1));
    boolean var23 = var0.changecolor((-1), 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "RR"+ "'", var12.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "RR"+ "'", var13.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "RR"+ "'", var14.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test327() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test327");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    java.lang.String var4 = var0.toString();
    boolean var7 = var0.changecolor(10, 1);
    java.lang.String var8 = var0.toString();
    boolean var11 = var0.changecolor(10, 1);
    boolean var14 = var0.changecolor(1, 1);
    java.lang.String var15 = var0.toString();
    boolean var18 = var0.changecolor(0, 100);
    boolean var21 = var0.changecolor(0, 0);
    boolean var24 = var0.changecolor(100, 10);
    boolean var27 = var0.changecolor(100, 0);
    boolean var30 = var0.changecolor(100, 0);
    boolean var33 = var0.changecolor(1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "RR"+ "'", var4.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "RR"+ "'", var15.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);

  }

  public void test328() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test328");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor((-1), 10);
    boolean var9 = var0.changecolor(0, (-1));
    boolean var12 = var0.changecolor(0, 0);
    boolean var15 = var0.changecolor(10, 100);
    java.lang.String var16 = var0.toString();
    boolean var19 = var0.changecolor(100, 0);
    boolean var22 = var0.changecolor(0, 10);
    java.lang.String var23 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "VR"+ "'", var16.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "VR"+ "'", var23.equals("VR"));

  }

  public void test329() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test329");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    java.lang.String var4 = var0.toString();
    boolean var7 = var0.changecolor(10, 1);
    java.lang.String var8 = var0.toString();
    boolean var11 = var0.changecolor(10, 0);
    java.lang.String var12 = var0.toString();
    boolean var15 = var0.changecolor(100, (-1));
    java.lang.String var16 = var0.toString();
    java.lang.String var17 = var0.toString();
    java.lang.String var18 = var0.toString();
    boolean var21 = var0.changecolor(100, (-1));
    boolean var24 = var0.changecolor(100, 100);
    boolean var27 = var0.changecolor((-1), 10);
    java.lang.String var28 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "RR"+ "'", var4.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "RR"+ "'", var12.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "RR"+ "'", var16.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "RR"+ "'", var17.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "RR"+ "'", var18.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "RR"+ "'", var28.equals("RR"));

  }

  public void test330() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test330");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    java.lang.String var4 = var0.toString();
    boolean var7 = var0.changecolor(1, (-1));
    java.lang.String var8 = var0.toString();
    boolean var11 = var0.changecolor((-1), 1);
    boolean var14 = var0.changecolor(0, 1);
    boolean var17 = var0.changecolor(1, 10);
    boolean var20 = var0.changecolor(100, 10);
    boolean var23 = var0.changecolor(1, 0);
    java.lang.String var24 = var0.toString();
    boolean var27 = var0.changecolor((-1), 0);
    boolean var30 = var0.changecolor(10, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "RR"+ "'", var4.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "RV"+ "'", var24.equals("RV"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);

  }

  public void test331() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test331");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor(0, 1);
    boolean var10 = var0.changecolor(10, 0);
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.toString();
    java.lang.String var13 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "RR"+ "'", var12.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "RR"+ "'", var13.equals("RR"));

  }

  public void test332() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test332");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor(100, (-1));
    java.lang.String var7 = var0.toString();
    boolean var10 = var0.changecolor(1, 1);
    boolean var13 = var0.changecolor(10, 0);
    java.lang.String var14 = var0.toString();
    boolean var17 = var0.changecolor(0, (-1));
    boolean var20 = var0.changecolor(100, 0);
    java.lang.String var21 = var0.toString();
    java.lang.String var22 = var0.toString();
    boolean var25 = var0.changecolor(10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "RR"+ "'", var14.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "RR"+ "'", var21.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "RR"+ "'", var22.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test333() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test333");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor((-1), 10);
    boolean var9 = var0.changecolor(100, 100);
    boolean var12 = var0.changecolor(10, 0);
    java.lang.String var13 = var0.toString();
    java.lang.String var14 = var0.toString();
    boolean var17 = var0.changecolor(1, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "RR"+ "'", var13.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "RR"+ "'", var14.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test334() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test334");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor(1, 10);
    java.lang.String var7 = var0.toString();
    boolean var10 = var0.changecolor(0, 1);
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.toString();
    java.lang.String var13 = var0.toString();
    boolean var16 = var0.changecolor(100, (-1));
    java.lang.String var17 = var0.toString();
    boolean var20 = var0.changecolor(1, 0);
    java.lang.String var21 = var0.toString();
    boolean var24 = var0.changecolor(1, (-1));
    java.lang.String var25 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "RR"+ "'", var12.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "RR"+ "'", var13.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "RR"+ "'", var17.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "RV"+ "'", var21.equals("RV"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "RV"+ "'", var25.equals("RV"));

  }

  public void test335() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test335");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor(1, 10);
    java.lang.String var7 = var0.toString();
    boolean var10 = var0.changecolor(0, 1);
    java.lang.String var11 = var0.toString();
    boolean var14 = var0.changecolor(100, 10);
    boolean var17 = var0.changecolor(100, 100);
    boolean var20 = var0.changecolor(10, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test336() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test336");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    boolean var6 = var0.changecolor(10, 10);
    java.lang.String var7 = var0.toString();
    boolean var10 = var0.changecolor((-1), (-1));
    boolean var13 = var0.changecolor(10, (-1));
    java.lang.String var14 = var0.toString();
    boolean var17 = var0.changecolor((-1), (-1));
    java.lang.String var18 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "RR"+ "'", var14.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "RR"+ "'", var18.equals("RR"));

  }

  public void test337() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test337");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    boolean var5 = var0.changecolor(0, 0);
    java.lang.String var6 = var0.toString();
    java.lang.String var7 = var0.toString();
    java.lang.String var8 = var0.toString();
    boolean var11 = var0.changecolor(10, 1);
    java.lang.String var12 = var0.toString();
    boolean var15 = var0.changecolor((-1), 0);
    java.lang.String var16 = var0.toString();
    boolean var19 = var0.changecolor(10, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "VR"+ "'", var6.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "VR"+ "'", var7.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "VR"+ "'", var8.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "VR"+ "'", var12.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "VR"+ "'", var16.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test338() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test338");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    boolean var6 = var0.changecolor(0, 1);
    java.lang.String var7 = var0.toString();
    boolean var10 = var0.changecolor(1, 1);
    boolean var13 = var0.changecolor(10, 0);
    boolean var16 = var0.changecolor((-1), 1);
    boolean var19 = var0.changecolor(1, 100);
    java.lang.String var20 = var0.toString();
    boolean var23 = var0.changecolor(10, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "RR"+ "'", var20.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test339() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test339");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    boolean var6 = var0.changecolor(0, 1);
    boolean var9 = var0.changecolor(100, 0);
    boolean var12 = var0.changecolor(1, (-1));
    boolean var15 = var0.changecolor(100, 1);
    boolean var18 = var0.changecolor(0, 0);
    boolean var21 = var0.changecolor(100, 100);
    boolean var24 = var0.changecolor(0, 1);
    java.lang.String var25 = var0.toString();
    
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
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "GR"+ "'", var25.equals("GR"));

  }

  public void test340() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test340");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    java.lang.String var4 = var0.toString();
    boolean var7 = var0.changecolor(1, (-1));
    java.lang.String var8 = var0.toString();
    boolean var11 = var0.changecolor((-1), 1);
    boolean var14 = var0.changecolor(0, 1);
    boolean var17 = var0.changecolor(100, 1);
    boolean var20 = var0.changecolor((-1), (-1));
    java.lang.String var21 = var0.toString();
    boolean var24 = var0.changecolor(1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "RR"+ "'", var4.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "RR"+ "'", var21.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test341() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test341");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor(10, 10);
    java.lang.String var8 = var0.toString();
    java.lang.String var9 = var0.toString();
    java.lang.String var10 = var0.toString();
    boolean var13 = var0.changecolor(100, 0);
    boolean var16 = var0.changecolor(10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "RR"+ "'", var9.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "RR"+ "'", var10.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test342() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test342");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    boolean var6 = var0.changecolor(0, 1);
    java.lang.String var7 = var0.toString();
    boolean var10 = var0.changecolor(1, 1);
    java.lang.String var11 = var0.toString();
    boolean var14 = var0.changecolor(100, (-1));
    java.lang.String var15 = var0.toString();
    boolean var18 = var0.changecolor(100, 10);
    java.lang.String var19 = var0.toString();
    boolean var22 = var0.changecolor(100, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "RR"+ "'", var15.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "RR"+ "'", var19.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test343() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test343");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    boolean var6 = var0.changecolor(10, 10);
    java.lang.String var7 = var0.toString();
    java.lang.String var8 = var0.toString();
    boolean var11 = var0.changecolor(10, 100);
    java.lang.String var12 = var0.toString();
    java.lang.String var13 = var0.toString();
    boolean var16 = var0.changecolor(0, 10);
    boolean var19 = var0.changecolor((-1), (-1));
    java.lang.String var20 = var0.toString();
    java.lang.String var21 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "RR"+ "'", var12.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "RR"+ "'", var13.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "RR"+ "'", var20.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "RR"+ "'", var21.equals("RR"));

  }

  public void test344() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test344");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor(1, 10);
    java.lang.String var7 = var0.toString();
    boolean var10 = var0.changecolor(0, 1);
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.toString();
    java.lang.String var13 = var0.toString();
    boolean var16 = var0.changecolor(100, (-1));
    java.lang.String var17 = var0.toString();
    boolean var20 = var0.changecolor(0, 1);
    boolean var23 = var0.changecolor(10, 10);
    java.lang.String var24 = var0.toString();
    java.lang.String var25 = var0.toString();
    java.lang.String var26 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "RR"+ "'", var12.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "RR"+ "'", var13.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "RR"+ "'", var17.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "RR"+ "'", var24.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "RR"+ "'", var25.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "RR"+ "'", var26.equals("RR"));

  }

  public void test345() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test345");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor((-1), 10);
    boolean var10 = var0.changecolor(10, 1);
    boolean var13 = var0.changecolor(0, (-1));
    java.lang.String var14 = var0.toString();
    boolean var17 = var0.changecolor(1, 0);
    boolean var20 = var0.changecolor((-1), 100);
    boolean var23 = var0.changecolor(0, 1);
    boolean var26 = var0.changecolor(100, 1);
    boolean var29 = var0.changecolor(1, 0);
    java.lang.String var30 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "RR"+ "'", var14.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "RV"+ "'", var30.equals("RV"));

  }

  public void test346() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test346");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor((-1), 10);
    boolean var10 = var0.changecolor(10, 0);
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.toString();
    java.lang.String var13 = var0.toString();
    java.lang.String var14 = var0.toString();
    java.lang.String var15 = var0.toString();
    boolean var18 = var0.changecolor((-1), 0);
    boolean var21 = var0.changecolor(100, 0);
    java.lang.String var22 = var0.toString();
    java.lang.String var23 = var0.toString();
    boolean var26 = var0.changecolor(0, (-1));
    java.lang.String var27 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "RR"+ "'", var12.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "RR"+ "'", var13.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "RR"+ "'", var14.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "RR"+ "'", var15.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "RR"+ "'", var22.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "RR"+ "'", var23.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "RR"+ "'", var27.equals("RR"));

  }

  public void test347() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test347");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor((-1), 10);
    boolean var10 = var0.changecolor(10, 1);
    java.lang.String var11 = var0.toString();
    boolean var14 = var0.changecolor(100, (-1));
    boolean var17 = var0.changecolor(100, 100);
    java.lang.String var18 = var0.toString();
    boolean var21 = var0.changecolor(100, 1);
    boolean var24 = var0.changecolor((-1), 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "RR"+ "'", var18.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test348() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test348");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor((-1), 10);
    boolean var9 = var0.changecolor(0, 0);
    boolean var12 = var0.changecolor(10, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test349() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test349");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor(1, 10);
    boolean var9 = var0.changecolor(1, 10);
    java.lang.String var10 = var0.toString();
    boolean var13 = var0.changecolor(10, 100);
    boolean var16 = var0.changecolor(0, 0);
    java.lang.String var17 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "RR"+ "'", var10.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "VR"+ "'", var17.equals("VR"));

  }

  public void test350() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test350");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    boolean var5 = var0.changecolor(0, 0);
    java.lang.String var6 = var0.toString();
    java.lang.String var7 = var0.toString();
    java.lang.String var8 = var0.toString();
    boolean var11 = var0.changecolor(10, 1);
    boolean var14 = var0.changecolor(1, 1);
    boolean var17 = var0.changecolor(1, 1);
    java.lang.String var18 = var0.toString();
    java.lang.String var19 = var0.toString();
    boolean var22 = var0.changecolor(10, (-1));
    boolean var25 = var0.changecolor(100, 10);
    java.lang.String var26 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "VR"+ "'", var6.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "VR"+ "'", var7.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "VR"+ "'", var8.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "VR"+ "'", var18.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "VR"+ "'", var19.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "VR"+ "'", var26.equals("VR"));

  }

  public void test351() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test351");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor(1, 10);
    boolean var9 = var0.changecolor((-1), (-1));
    java.lang.String var10 = var0.toString();
    boolean var13 = var0.changecolor(10, 10);
    boolean var16 = var0.changecolor((-1), 1);
    java.lang.String var17 = var0.toString();
    java.lang.String var18 = var0.toString();
    boolean var21 = var0.changecolor(1, 100);
    java.lang.String var22 = var0.toString();
    java.lang.String var23 = var0.toString();
    java.lang.String var24 = var0.toString();
    java.lang.String var25 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "RR"+ "'", var10.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "RR"+ "'", var17.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "RR"+ "'", var18.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "RR"+ "'", var22.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "RR"+ "'", var23.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "RR"+ "'", var24.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "RR"+ "'", var25.equals("RR"));

  }

  public void test352() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test352");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor(1, 10);
    boolean var9 = var0.changecolor((-1), (-1));
    java.lang.String var10 = var0.toString();
    boolean var13 = var0.changecolor(10, 10);
    boolean var16 = var0.changecolor((-1), 1);
    java.lang.String var17 = var0.toString();
    java.lang.String var18 = var0.toString();
    boolean var21 = var0.changecolor(1, 100);
    boolean var24 = var0.changecolor(10, 1);
    boolean var27 = var0.changecolor(100, 100);
    boolean var30 = var0.changecolor(100, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "RR"+ "'", var10.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "RR"+ "'", var17.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "RR"+ "'", var18.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);

  }

  public void test353() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test353");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    boolean var6 = var0.changecolor(0, 1);
    java.lang.String var7 = var0.toString();
    boolean var10 = var0.changecolor(1, 1);
    boolean var13 = var0.changecolor(10, 0);
    boolean var16 = var0.changecolor((-1), 1);
    boolean var19 = var0.changecolor(1, 100);
    boolean var22 = var0.changecolor(1, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
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

  public void test354() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test354");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    boolean var6 = var0.changecolor(10, 10);
    java.lang.String var7 = var0.toString();
    java.lang.String var8 = var0.toString();
    boolean var11 = var0.changecolor((-1), (-1));
    boolean var14 = var0.changecolor(100, (-1));
    boolean var17 = var0.changecolor(0, 0);
    boolean var20 = var0.changecolor(100, 0);
    java.lang.String var21 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "VR"+ "'", var21.equals("VR"));

  }

  public void test355() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test355");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    boolean var6 = var0.changecolor(0, 1);
    boolean var9 = var0.changecolor(100, 0);
    boolean var12 = var0.changecolor(1, (-1));
    boolean var15 = var0.changecolor(100, 1);
    boolean var18 = var0.changecolor((-1), 0);
    boolean var21 = var0.changecolor(10, 1);
    java.lang.String var22 = var0.toString();
    boolean var25 = var0.changecolor(10, 10);
    boolean var28 = var0.changecolor(10, 10);
    
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
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "RR"+ "'", var22.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test356() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test356");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor(1, 10);
    java.lang.String var7 = var0.toString();
    boolean var10 = var0.changecolor(100, 10);
    boolean var13 = var0.changecolor(10, 1);
    boolean var16 = var0.changecolor(1, 100);
    boolean var19 = var0.changecolor((-1), 1);
    boolean var22 = var0.changecolor(0, (-1));
    boolean var25 = var0.changecolor(100, 1);
    java.lang.String var26 = var0.toString();
    java.lang.String var27 = var0.toString();
    java.lang.String var28 = var0.toString();
    java.lang.String var29 = var0.toString();
    java.lang.String var30 = var0.toString();
    java.lang.String var31 = var0.toString();
    boolean var34 = var0.changecolor(1, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
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
    assertTrue("'" + var26 + "' != '" + "RR"+ "'", var26.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "RR"+ "'", var27.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "RR"+ "'", var28.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "RR"+ "'", var29.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "RR"+ "'", var30.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "RR"+ "'", var31.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);

  }

  public void test357() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test357");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    java.lang.String var4 = var0.toString();
    boolean var7 = var0.changecolor(10, 1);
    java.lang.String var8 = var0.toString();
    java.lang.String var9 = var0.toString();
    boolean var12 = var0.changecolor(0, 100);
    boolean var15 = var0.changecolor(1, (-1));
    java.lang.String var16 = var0.toString();
    boolean var19 = var0.changecolor(10, 10);
    java.lang.String var20 = var0.toString();
    boolean var23 = var0.changecolor((-1), 100);
    boolean var26 = var0.changecolor(1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "RR"+ "'", var4.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "RR"+ "'", var9.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "RR"+ "'", var16.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "RR"+ "'", var20.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test358() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test358");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    java.lang.String var4 = var0.toString();
    java.lang.String var5 = var0.toString();
    boolean var8 = var0.changecolor(10, 10);
    boolean var11 = var0.changecolor(10, 1);
    boolean var14 = var0.changecolor(0, 1);
    boolean var17 = var0.changecolor(1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "RR"+ "'", var4.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "RR"+ "'", var5.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);

  }

  public void test359() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test359");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    java.lang.String var4 = var0.toString();
    boolean var7 = var0.changecolor(10, 1);
    java.lang.String var8 = var0.toString();
    boolean var11 = var0.changecolor(10, 1);
    java.lang.String var12 = var0.toString();
    boolean var15 = var0.changecolor(1, 100);
    java.lang.String var16 = var0.toString();
    java.lang.String var17 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "RR"+ "'", var4.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "RR"+ "'", var12.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "RR"+ "'", var16.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "RR"+ "'", var17.equals("RR"));

  }

  public void test360() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test360");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    boolean var6 = var0.changecolor(0, 1);
    java.lang.String var7 = var0.toString();
    boolean var10 = var0.changecolor(1, 1);
    boolean var13 = var0.changecolor(10, 0);
    boolean var16 = var0.changecolor((-1), 1);
    boolean var19 = var0.changecolor(1, 100);
    java.lang.String var20 = var0.toString();
    java.lang.String var21 = var0.toString();
    java.lang.String var22 = var0.toString();
    boolean var25 = var0.changecolor((-1), 1);
    java.lang.String var26 = var0.toString();
    java.lang.String var27 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "RR"+ "'", var20.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "RR"+ "'", var21.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "RR"+ "'", var22.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "RR"+ "'", var26.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "RR"+ "'", var27.equals("RR"));

  }

  public void test361() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test361");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    java.lang.String var4 = var0.toString();
    boolean var7 = var0.changecolor(10, 1);
    java.lang.String var8 = var0.toString();
    boolean var11 = var0.changecolor(10, 1);
    boolean var14 = var0.changecolor(1, 1);
    java.lang.String var15 = var0.toString();
    boolean var18 = var0.changecolor(0, 100);
    boolean var21 = var0.changecolor(0, 0);
    boolean var24 = var0.changecolor(100, 10);
    boolean var27 = var0.changecolor(100, 0);
    boolean var30 = var0.changecolor(100, 0);
    java.lang.String var31 = var0.toString();
    java.lang.String var32 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "RR"+ "'", var4.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "RR"+ "'", var15.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "VR"+ "'", var31.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "VR"+ "'", var32.equals("VR"));

  }

  public void test362() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test362");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor((-1), 10);
    boolean var9 = var0.changecolor(100, 100);
    java.lang.String var10 = var0.toString();
    boolean var13 = var0.changecolor(10, 1);
    java.lang.String var14 = var0.toString();
    boolean var17 = var0.changecolor(10, (-1));
    boolean var20 = var0.changecolor(10, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "RR"+ "'", var10.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "RR"+ "'", var14.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test363() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test363");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor((-1), 10);
    boolean var10 = var0.changecolor(10, 0);
    boolean var13 = var0.changecolor(1, 1);
    java.lang.String var14 = var0.toString();
    java.lang.String var15 = var0.toString();
    java.lang.String var16 = var0.toString();
    boolean var19 = var0.changecolor(10, 100);
    boolean var22 = var0.changecolor(10, 100);
    boolean var25 = var0.changecolor(1, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "RR"+ "'", var14.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "RR"+ "'", var15.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "RR"+ "'", var16.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test364() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test364");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    java.lang.String var4 = var0.toString();
    boolean var7 = var0.changecolor(1, (-1));
    boolean var10 = var0.changecolor(100, 100);
    boolean var13 = var0.changecolor(0, 1);
    boolean var16 = var0.changecolor(1, 0);
    java.lang.String var17 = var0.toString();
    java.lang.String var18 = var0.toString();
    java.lang.String var19 = var0.toString();
    java.lang.String var20 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "RR"+ "'", var4.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "RV"+ "'", var17.equals("RV"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "RV"+ "'", var18.equals("RV"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "RV"+ "'", var19.equals("RV"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "RV"+ "'", var20.equals("RV"));

  }

  public void test365() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test365");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    java.lang.String var4 = var0.toString();
    boolean var7 = var0.changecolor(1, (-1));
    boolean var10 = var0.changecolor(100, 100);
    boolean var13 = var0.changecolor(10, 10);
    boolean var16 = var0.changecolor(0, 100);
    boolean var19 = var0.changecolor(100, (-1));
    boolean var22 = var0.changecolor((-1), 10);
    boolean var25 = var0.changecolor(1, 10);
    boolean var28 = var0.changecolor((-1), 100);
    boolean var31 = var0.changecolor(0, 0);
    boolean var34 = var0.changecolor(10, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "RR"+ "'", var4.equals("RR"));
    
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
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);

  }

  public void test366() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test366");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor((-1), 10);
    boolean var9 = var0.changecolor(0, 10);
    java.lang.String var10 = var0.toString();
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "RR"+ "'", var10.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "RR"+ "'", var12.equals("RR"));

  }

  public void test367() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test367");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    java.lang.String var4 = var0.toString();
    boolean var7 = var0.changecolor(1, (-1));
    boolean var10 = var0.changecolor(0, 0);
    boolean var13 = var0.changecolor((-1), 0);
    boolean var16 = var0.changecolor(10, 0);
    boolean var19 = var0.changecolor(10, 10);
    boolean var22 = var0.changecolor(10, 10);
    boolean var25 = var0.changecolor(1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "RR"+ "'", var4.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
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

  }

  public void test368() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test368");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor((-1), 10);
    java.lang.String var8 = var0.toString();
    boolean var11 = var0.changecolor(100, 0);
    boolean var14 = var0.changecolor(1, 1);
    boolean var17 = var0.changecolor((-1), 100);
    boolean var20 = var0.changecolor(100, 100);
    boolean var23 = var0.changecolor(10, 0);
    boolean var26 = var0.changecolor((-1), (-1));
    java.lang.String var27 = var0.toString();
    boolean var30 = var0.changecolor(0, 1);
    boolean var33 = var0.changecolor(1, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
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
    assertTrue("'" + var27 + "' != '" + "RR"+ "'", var27.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);

  }

  public void test369() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test369");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor((-1), 10);
    java.lang.String var4 = var0.toString();
    boolean var7 = var0.changecolor(100, (-1));
    boolean var10 = var0.changecolor(0, 10);
    boolean var13 = var0.changecolor(100, 1);
    boolean var16 = var0.changecolor(10, 1);
    java.lang.String var17 = var0.toString();
    boolean var20 = var0.changecolor((-1), (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "RR"+ "'", var4.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "RR"+ "'", var17.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test370() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test370");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor(1, 10);
    java.lang.String var7 = var0.toString();
    boolean var10 = var0.changecolor(0, 1);
    boolean var13 = var0.changecolor(10, 1);
    java.lang.String var14 = var0.toString();
    java.lang.String var15 = var0.toString();
    boolean var18 = var0.changecolor((-1), (-1));
    boolean var21 = var0.changecolor((-1), (-1));
    boolean var24 = var0.changecolor(0, (-1));
    boolean var27 = var0.changecolor(1, 1);
    boolean var30 = var0.changecolor(0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "RR"+ "'", var14.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "RR"+ "'", var15.equals("RR"));
    
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

  }

  public void test371() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test371");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    java.lang.String var4 = var0.toString();
    boolean var7 = var0.changecolor(10, 1);
    boolean var10 = var0.changecolor(10, 100);
    boolean var13 = var0.changecolor(10, 10);
    boolean var16 = var0.changecolor((-1), 10);
    boolean var19 = var0.changecolor(10, 1);
    java.lang.String var20 = var0.toString();
    boolean var23 = var0.changecolor(100, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "RR"+ "'", var4.equals("RR"));
    
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
    assertTrue("'" + var20 + "' != '" + "RR"+ "'", var20.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test372() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test372");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor(1, 10);
    java.lang.String var7 = var0.toString();
    java.lang.String var8 = var0.toString();
    boolean var11 = var0.changecolor(0, 0);
    boolean var14 = var0.changecolor(10, 100);
    boolean var17 = var0.changecolor(100, 100);
    boolean var20 = var0.changecolor(100, 0);
    java.lang.String var21 = var0.toString();
    boolean var24 = var0.changecolor((-1), (-1));
    java.lang.String var25 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "VR"+ "'", var21.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "VR"+ "'", var25.equals("VR"));

  }

  public void test373() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test373");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor(1, 10);
    java.lang.String var7 = var0.toString();
    boolean var10 = var0.changecolor(0, 1);
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.toString();
    java.lang.String var13 = var0.toString();
    boolean var16 = var0.changecolor(100, (-1));
    java.lang.String var17 = var0.toString();
    java.lang.String var18 = var0.toString();
    boolean var21 = var0.changecolor(0, 0);
    java.lang.String var22 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "RR"+ "'", var12.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "RR"+ "'", var13.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "RR"+ "'", var17.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "RR"+ "'", var18.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "VR"+ "'", var22.equals("VR"));

  }

  public void test374() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test374");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    java.lang.String var5 = var0.toString();
    java.lang.String var6 = var0.toString();
    java.lang.String var7 = var0.toString();
    boolean var10 = var0.changecolor(0, 0);
    boolean var13 = var0.changecolor(100, 10);
    boolean var16 = var0.changecolor(1, 0);
    boolean var19 = var0.changecolor(1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "RR"+ "'", var5.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "RR"+ "'", var6.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test375() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test375");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    boolean var6 = var0.changecolor(0, 1);
    boolean var9 = var0.changecolor(100, 0);
    boolean var12 = var0.changecolor(1, (-1));
    boolean var15 = var0.changecolor(100, 1);
    boolean var18 = var0.changecolor((-1), 0);
    boolean var21 = var0.changecolor(1, 0);
    java.lang.String var22 = var0.toString();
    java.lang.String var23 = var0.toString();
    java.lang.String var24 = var0.toString();
    boolean var27 = var0.changecolor(100, (-1));
    boolean var30 = var0.changecolor((-1), (-1));
    
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
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "RV"+ "'", var22.equals("RV"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "RV"+ "'", var23.equals("RV"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "RV"+ "'", var24.equals("RV"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);

  }

  public void test376() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test376");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    boolean var6 = var0.changecolor(0, 1);
    java.lang.String var7 = var0.toString();
    boolean var10 = var0.changecolor(100, 1);
    boolean var13 = var0.changecolor(100, 10);
    boolean var16 = var0.changecolor(10, 1);
    java.lang.String var17 = var0.toString();
    java.lang.String var18 = var0.toString();
    boolean var21 = var0.changecolor(100, 100);
    boolean var24 = var0.changecolor(10, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "RR"+ "'", var17.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "RR"+ "'", var18.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test377() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test377");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor((-1), 10);
    java.lang.String var8 = var0.toString();
    boolean var11 = var0.changecolor(100, 0);
    boolean var14 = var0.changecolor(1, 1);
    boolean var17 = var0.changecolor((-1), 100);
    java.lang.String var18 = var0.toString();
    java.lang.String var19 = var0.toString();
    java.lang.String var20 = var0.toString();
    boolean var23 = var0.changecolor(0, 10);
    boolean var26 = var0.changecolor(0, 1);
    java.lang.String var27 = var0.toString();
    java.lang.String var28 = var0.toString();
    java.lang.String var29 = var0.toString();
    boolean var32 = var0.changecolor(0, (-1));
    java.lang.String var33 = var0.toString();
    boolean var36 = var0.changecolor(100, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "RR"+ "'", var18.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "RR"+ "'", var19.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "RR"+ "'", var20.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "RR"+ "'", var27.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "RR"+ "'", var28.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "RR"+ "'", var29.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "RR"+ "'", var33.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);

  }

  public void test378() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test378");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor(1, 10);
    java.lang.String var7 = var0.toString();
    boolean var10 = var0.changecolor(100, 10);
    boolean var13 = var0.changecolor(10, 1);
    boolean var16 = var0.changecolor(1, 100);
    boolean var19 = var0.changecolor((-1), 1);
    boolean var22 = var0.changecolor(0, (-1));
    boolean var25 = var0.changecolor(100, 1);
    boolean var28 = var0.changecolor((-1), 10);
    boolean var31 = var0.changecolor(1, 0);
    java.lang.String var32 = var0.toString();
    boolean var35 = var0.changecolor(1, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
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
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "RV"+ "'", var32.equals("RV"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);

  }

  public void test379() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test379");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor(1, 10);
    java.lang.String var7 = var0.toString();
    java.lang.String var8 = var0.toString();
    boolean var11 = var0.changecolor(100, (-1));
    boolean var14 = var0.changecolor(1, 10);
    boolean var17 = var0.changecolor((-1), 10);
    boolean var20 = var0.changecolor(10, 100);
    boolean var23 = var0.changecolor(1, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
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

  }

  public void test380() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test380");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor(100, (-1));
    java.lang.String var7 = var0.toString();
    boolean var10 = var0.changecolor(1, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test381() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test381");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor((-1), 10);
    boolean var9 = var0.changecolor(0, (-1));
    java.lang.String var10 = var0.toString();
    java.lang.String var11 = var0.toString();
    boolean var14 = var0.changecolor(10, 100);
    java.lang.String var15 = var0.toString();
    boolean var18 = var0.changecolor(1, 1);
    java.lang.String var19 = var0.toString();
    boolean var22 = var0.changecolor(0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "RR"+ "'", var10.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "RR"+ "'", var15.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "RR"+ "'", var19.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test382() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test382");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor(1, 10);
    java.lang.String var7 = var0.toString();
    boolean var10 = var0.changecolor(100, 10);
    boolean var13 = var0.changecolor(10, 1);
    boolean var16 = var0.changecolor((-1), 1);
    boolean var19 = var0.changecolor(100, 1);
    boolean var22 = var0.changecolor(1, 1);
    boolean var25 = var0.changecolor(100, 1);
    java.lang.String var26 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
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
    assertTrue("'" + var26 + "' != '" + "RR"+ "'", var26.equals("RR"));

  }

  public void test383() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test383");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    java.lang.String var4 = var0.toString();
    java.lang.String var5 = var0.toString();
    boolean var8 = var0.changecolor(10, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "RR"+ "'", var4.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "RR"+ "'", var5.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test384() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test384");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(1, 100);
    java.lang.String var4 = var0.toString();
    boolean var7 = var0.changecolor(0, (-1));
    boolean var10 = var0.changecolor(100, 10);
    boolean var13 = var0.changecolor(1, 1);
    java.lang.String var14 = var0.toString();
    java.lang.String var15 = var0.toString();
    boolean var18 = var0.changecolor((-1), 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "RR"+ "'", var4.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "RR"+ "'", var14.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "RR"+ "'", var15.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test385() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test385");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor(1, 10);
    java.lang.String var7 = var0.toString();
    boolean var10 = var0.changecolor(100, 10);
    boolean var13 = var0.changecolor(10, 1);
    boolean var16 = var0.changecolor(1, 100);
    boolean var19 = var0.changecolor(1, 0);
    boolean var22 = var0.changecolor(10, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test386() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test386");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor((-1), 10);
    boolean var10 = var0.changecolor(10, 0);
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.toString();
    java.lang.String var13 = var0.toString();
    java.lang.String var14 = var0.toString();
    boolean var17 = var0.changecolor(1, 1);
    boolean var20 = var0.changecolor(0, 100);
    boolean var23 = var0.changecolor((-1), 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "RR"+ "'", var12.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "RR"+ "'", var13.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "RR"+ "'", var14.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test387() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test387");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor((-1), 10);
    boolean var9 = var0.changecolor(0, (-1));
    boolean var12 = var0.changecolor(0, 0);
    boolean var15 = var0.changecolor(10, 100);
    java.lang.String var16 = var0.toString();
    java.lang.String var17 = var0.toString();
    java.lang.String var18 = var0.toString();
    java.lang.String var19 = var0.toString();
    boolean var22 = var0.changecolor(10, (-1));
    boolean var25 = var0.changecolor((-1), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "VR"+ "'", var16.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "VR"+ "'", var17.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "VR"+ "'", var18.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "VR"+ "'", var19.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test388() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test388");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    boolean var6 = var0.changecolor(0, 1);
    java.lang.String var7 = var0.toString();
    boolean var10 = var0.changecolor(10, 1);
    java.lang.String var11 = var0.toString();
    boolean var14 = var0.changecolor(10, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test389() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test389");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    java.lang.String var4 = var0.toString();
    boolean var7 = var0.changecolor(1, (-1));
    boolean var10 = var0.changecolor(100, 100);
    boolean var13 = var0.changecolor((-1), 100);
    boolean var16 = var0.changecolor(0, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "RR"+ "'", var4.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test390() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test390");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    java.lang.String var4 = var0.toString();
    boolean var7 = var0.changecolor(10, 1);
    java.lang.String var8 = var0.toString();
    boolean var11 = var0.changecolor(10, 0);
    java.lang.String var12 = var0.toString();
    boolean var15 = var0.changecolor(100, (-1));
    java.lang.String var16 = var0.toString();
    java.lang.String var17 = var0.toString();
    boolean var20 = var0.changecolor(1, 10);
    boolean var23 = var0.changecolor((-1), 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "RR"+ "'", var4.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "RR"+ "'", var12.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "RR"+ "'", var16.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "RR"+ "'", var17.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test391() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test391");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(1, 100);
    java.lang.String var4 = var0.toString();
    boolean var7 = var0.changecolor(0, (-1));
    boolean var10 = var0.changecolor(100, 10);
    java.lang.String var11 = var0.toString();
    boolean var14 = var0.changecolor((-1), 0);
    boolean var17 = var0.changecolor(100, 10);
    java.lang.String var18 = var0.toString();
    java.lang.String var19 = var0.toString();
    boolean var22 = var0.changecolor(1, 100);
    java.lang.String var23 = var0.toString();
    java.lang.String var24 = var0.toString();
    boolean var27 = var0.changecolor((-1), 1);
    boolean var30 = var0.changecolor(0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "RR"+ "'", var4.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "RR"+ "'", var18.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "RR"+ "'", var19.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "RR"+ "'", var23.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "RR"+ "'", var24.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);

  }

  public void test392() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test392");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    java.lang.String var4 = var0.toString();
    boolean var7 = var0.changecolor(10, 1);
    boolean var10 = var0.changecolor(10, 100);
    java.lang.String var11 = var0.toString();
    boolean var14 = var0.changecolor(0, 100);
    boolean var17 = var0.changecolor(10, (-1));
    boolean var20 = var0.changecolor((-1), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "RR"+ "'", var4.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test393() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test393");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    boolean var6 = var0.changecolor(0, 1);
    java.lang.String var7 = var0.toString();
    boolean var10 = var0.changecolor((-1), (-1));
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.toString();
    boolean var15 = var0.changecolor(10, 1);
    boolean var18 = var0.changecolor(10, 1);
    java.lang.String var19 = var0.toString();
    boolean var22 = var0.changecolor(10, 0);
    java.lang.String var23 = var0.toString();
    java.lang.String var24 = var0.toString();
    java.lang.String var25 = var0.toString();
    boolean var28 = var0.changecolor((-1), 100);
    boolean var31 = var0.changecolor(1, (-1));
    boolean var34 = var0.changecolor((-1), 0);
    java.lang.String var35 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "RR"+ "'", var12.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "RR"+ "'", var19.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "RR"+ "'", var23.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "RR"+ "'", var24.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "RR"+ "'", var25.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "RR"+ "'", var35.equals("RR"));

  }

  public void test394() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test394");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    boolean var6 = var0.changecolor(0, 1);
    java.lang.String var7 = var0.toString();
    boolean var10 = var0.changecolor((-1), (-1));
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.toString();
    boolean var15 = var0.changecolor(10, 1);
    boolean var18 = var0.changecolor(10, 1);
    boolean var21 = var0.changecolor((-1), (-1));
    boolean var24 = var0.changecolor((-1), 10);
    boolean var27 = var0.changecolor(10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "RR"+ "'", var12.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test395() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test395");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor(10, 10);
    boolean var10 = var0.changecolor(1, (-1));
    boolean var13 = var0.changecolor(10, 10);
    boolean var16 = var0.changecolor(100, 0);
    boolean var19 = var0.changecolor((-1), 10);
    java.lang.String var20 = var0.toString();
    java.lang.String var21 = var0.toString();
    java.lang.String var22 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
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
    assertTrue("'" + var20 + "' != '" + "RR"+ "'", var20.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "RR"+ "'", var21.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "RR"+ "'", var22.equals("RR"));

  }

  public void test396() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test396");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor(1, 10);
    boolean var9 = var0.changecolor((-1), (-1));
    java.lang.String var10 = var0.toString();
    boolean var13 = var0.changecolor(10, 10);
    boolean var16 = var0.changecolor((-1), 1);
    java.lang.String var17 = var0.toString();
    boolean var20 = var0.changecolor(100, (-1));
    java.lang.String var21 = var0.toString();
    java.lang.String var22 = var0.toString();
    boolean var25 = var0.changecolor(10, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "RR"+ "'", var10.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "RR"+ "'", var17.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "RR"+ "'", var21.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "RR"+ "'", var22.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test397() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test397");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor((-1), 10);
    java.lang.String var8 = var0.toString();
    boolean var11 = var0.changecolor(0, 10);
    java.lang.String var12 = var0.toString();
    boolean var15 = var0.changecolor(100, (-1));
    java.lang.String var16 = var0.toString();
    java.lang.String var17 = var0.toString();
    java.lang.String var18 = var0.toString();
    boolean var21 = var0.changecolor(0, 0);
    java.lang.String var22 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "RR"+ "'", var12.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "RR"+ "'", var16.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "RR"+ "'", var17.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "RR"+ "'", var18.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "VR"+ "'", var22.equals("VR"));

  }

  public void test398() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test398");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    java.lang.String var5 = var0.toString();
    java.lang.String var6 = var0.toString();
    java.lang.String var7 = var0.toString();
    boolean var10 = var0.changecolor(100, 1);
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.toString();
    java.lang.String var13 = var0.toString();
    boolean var16 = var0.changecolor(1, (-1));
    boolean var19 = var0.changecolor(10, 0);
    boolean var22 = var0.changecolor(0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "RR"+ "'", var5.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "RR"+ "'", var6.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "RR"+ "'", var12.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "RR"+ "'", var13.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);

  }

  public void test399() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test399");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    java.lang.String var5 = var0.toString();
    java.lang.String var6 = var0.toString();
    boolean var9 = var0.changecolor((-1), 100);
    boolean var12 = var0.changecolor(100, 100);
    boolean var15 = var0.changecolor(0, 100);
    java.lang.String var16 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "RR"+ "'", var5.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "RR"+ "'", var6.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "RR"+ "'", var16.equals("RR"));

  }

  public void test400() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test400");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    java.lang.String var4 = var0.toString();
    boolean var7 = var0.changecolor(10, 1);
    boolean var10 = var0.changecolor(10, 100);
    java.lang.String var11 = var0.toString();
    boolean var14 = var0.changecolor(10, 0);
    boolean var17 = var0.changecolor(100, (-1));
    boolean var20 = var0.changecolor(1, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "RR"+ "'", var4.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test401() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test401");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor((-1), 10);
    boolean var10 = var0.changecolor((-1), 1);
    boolean var13 = var0.changecolor((-1), 0);
    boolean var16 = var0.changecolor(0, 1);
    boolean var19 = var0.changecolor(1, 0);
    java.lang.String var20 = var0.toString();
    boolean var23 = var0.changecolor(0, 100);
    java.lang.String var24 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "RV"+ "'", var20.equals("RV"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "RV"+ "'", var24.equals("RV"));

  }

  public void test402() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test402");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    boolean var6 = var0.changecolor(0, 1);
    java.lang.String var7 = var0.toString();
    boolean var10 = var0.changecolor((-1), (-1));
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.toString();
    boolean var15 = var0.changecolor(0, 10);
    java.lang.String var16 = var0.toString();
    boolean var19 = var0.changecolor((-1), 10);
    boolean var22 = var0.changecolor(1, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "RR"+ "'", var12.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "RR"+ "'", var16.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test403() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test403");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(1, 100);
    boolean var6 = var0.changecolor(100, 1);
    boolean var9 = var0.changecolor(1, (-1));
    java.lang.String var10 = var0.toString();
    boolean var13 = var0.changecolor(10, 100);
    java.lang.String var14 = var0.toString();
    boolean var17 = var0.changecolor(10, 1);
    java.lang.String var18 = var0.toString();
    boolean var21 = var0.changecolor((-1), 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "RR"+ "'", var10.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "RR"+ "'", var14.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "RR"+ "'", var18.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test404() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test404");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor((-1), 10);
    boolean var9 = var0.changecolor(0, (-1));
    java.lang.String var10 = var0.toString();
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.toString();
    boolean var15 = var0.changecolor((-1), (-1));
    boolean var18 = var0.changecolor(10, 0);
    boolean var21 = var0.changecolor((-1), (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "RR"+ "'", var10.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "RR"+ "'", var12.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test405() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test405");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor((-1), 10);
    boolean var10 = var0.changecolor(10, 0);
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.toString();
    java.lang.String var13 = var0.toString();
    boolean var16 = var0.changecolor((-1), 100);
    java.lang.String var17 = var0.toString();
    java.lang.String var18 = var0.toString();
    java.lang.String var19 = var0.toString();
    java.lang.String var20 = var0.toString();
    java.lang.String var21 = var0.toString();
    boolean var24 = var0.changecolor(1, 0);
    boolean var27 = var0.changecolor(0, 10);
    boolean var30 = var0.changecolor(10, 10);
    boolean var33 = var0.changecolor(0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "RR"+ "'", var12.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "RR"+ "'", var13.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "RR"+ "'", var17.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "RR"+ "'", var18.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "RR"+ "'", var19.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "RR"+ "'", var20.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "RR"+ "'", var21.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);

  }

  public void test406() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test406");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    boolean var6 = var0.changecolor(10, 10);
    java.lang.String var7 = var0.toString();
    java.lang.String var8 = var0.toString();
    boolean var11 = var0.changecolor((-1), (-1));
    boolean var14 = var0.changecolor((-1), 100);
    java.lang.String var15 = var0.toString();
    boolean var18 = var0.changecolor(1, (-1));
    java.lang.String var19 = var0.toString();
    boolean var22 = var0.changecolor(0, 100);
    java.lang.String var23 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "RR"+ "'", var15.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "RR"+ "'", var19.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "RR"+ "'", var23.equals("RR"));

  }

  public void test407() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test407");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor((-1), 10);
    boolean var9 = var0.changecolor(0, (-1));
    boolean var12 = var0.changecolor(0, 0);
    boolean var15 = var0.changecolor(10, 100);
    java.lang.String var16 = var0.toString();
    boolean var19 = var0.changecolor(0, (-1));
    boolean var22 = var0.changecolor(0, 10);
    boolean var25 = var0.changecolor(1, 1);
    boolean var28 = var0.changecolor(0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "VR"+ "'", var16.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);

  }

  public void test408() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test408");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    java.lang.String var4 = var0.toString();
    boolean var7 = var0.changecolor(0, 0);
    boolean var10 = var0.changecolor(1, 10);
    boolean var13 = var0.changecolor((-1), 100);
    java.lang.String var14 = var0.toString();
    boolean var17 = var0.changecolor(1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "RR"+ "'", var4.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "VR"+ "'", var14.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test409() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test409");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor((-1), 10);
    boolean var9 = var0.changecolor(0, 10);
    java.lang.String var10 = var0.toString();
    boolean var13 = var0.changecolor(0, (-1));
    java.lang.String var14 = var0.toString();
    boolean var17 = var0.changecolor(0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "RR"+ "'", var10.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "RR"+ "'", var14.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test410() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test410");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    java.lang.String var4 = var0.toString();
    boolean var7 = var0.changecolor(1, (-1));
    boolean var10 = var0.changecolor(100, 100);
    boolean var13 = var0.changecolor(0, 1);
    boolean var16 = var0.changecolor(1, 0);
    java.lang.String var17 = var0.toString();
    java.lang.String var18 = var0.toString();
    boolean var21 = var0.changecolor((-1), 10);
    boolean var24 = var0.changecolor(1, 1);
    boolean var27 = var0.changecolor(100, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "RR"+ "'", var4.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "RV"+ "'", var17.equals("RV"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "RV"+ "'", var18.equals("RV"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test411() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test411");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    boolean var6 = var0.changecolor(0, 1);
    java.lang.String var7 = var0.toString();
    boolean var10 = var0.changecolor(100, 1);
    java.lang.String var11 = var0.toString();
    boolean var14 = var0.changecolor(0, 0);
    java.lang.String var15 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "VR"+ "'", var15.equals("VR"));

  }

  public void test412() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test412");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor(1, 10);
    boolean var9 = var0.changecolor((-1), (-1));
    boolean var12 = var0.changecolor((-1), 0);
    java.lang.String var13 = var0.toString();
    java.lang.String var14 = var0.toString();
    java.lang.String var15 = var0.toString();
    boolean var18 = var0.changecolor(0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "RR"+ "'", var13.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "RR"+ "'", var14.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "RR"+ "'", var15.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);

  }

  public void test413() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test413");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    boolean var6 = var0.changecolor(0, 1);
    java.lang.String var7 = var0.toString();
    boolean var10 = var0.changecolor(1, 1);
    boolean var13 = var0.changecolor(10, 0);
    boolean var16 = var0.changecolor(0, 0);
    boolean var19 = var0.changecolor(1, 0);
    boolean var22 = var0.changecolor(0, 100);
    java.lang.String var23 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "VR"+ "'", var23.equals("VR"));

  }

  public void test414() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test414");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor((-1), 10);
    boolean var9 = var0.changecolor(0, (-1));
    boolean var12 = var0.changecolor(0, 0);
    boolean var15 = var0.changecolor(10, 100);
    java.lang.String var16 = var0.toString();
    boolean var19 = var0.changecolor(1, 10);
    boolean var22 = var0.changecolor(1, 100);
    boolean var25 = var0.changecolor(0, 1);
    java.lang.String var26 = var0.toString();
    boolean var29 = var0.changecolor(100, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "VR"+ "'", var16.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "GR"+ "'", var26.equals("GR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test415() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test415");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    java.lang.String var4 = var0.toString();
    boolean var7 = var0.changecolor(10, 1);
    boolean var10 = var0.changecolor(10, 100);
    boolean var13 = var0.changecolor(10, 10);
    boolean var16 = var0.changecolor(1, 1);
    java.lang.String var17 = var0.toString();
    boolean var20 = var0.changecolor(100, (-1));
    boolean var23 = var0.changecolor(1, 1);
    boolean var26 = var0.changecolor(10, 1);
    java.lang.String var27 = var0.toString();
    boolean var30 = var0.changecolor((-1), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "RR"+ "'", var4.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "RR"+ "'", var17.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "RR"+ "'", var27.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);

  }

  public void test416() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test416");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor(10, 1);
    boolean var10 = var0.changecolor(10, 100);
    boolean var13 = var0.changecolor(1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test417() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test417");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor(100, (-1));
    java.lang.String var7 = var0.toString();
    boolean var10 = var0.changecolor(1, 1);
    boolean var13 = var0.changecolor(0, (-1));
    boolean var16 = var0.changecolor(0, 1);
    java.lang.String var17 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "RR"+ "'", var17.equals("RR"));

  }

  public void test418() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test418");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor((-1), 10);
    boolean var9 = var0.changecolor(0, (-1));
    java.lang.String var10 = var0.toString();
    boolean var13 = var0.changecolor(1, 100);
    java.lang.String var14 = var0.toString();
    boolean var17 = var0.changecolor(0, 100);
    boolean var20 = var0.changecolor(0, 10);
    boolean var23 = var0.changecolor(1, 100);
    java.lang.String var24 = var0.toString();
    java.lang.String var25 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "RR"+ "'", var10.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "RR"+ "'", var14.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "RR"+ "'", var24.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "RR"+ "'", var25.equals("RR"));

  }

  public void test419() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test419");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    boolean var6 = var0.changecolor(0, 1);
    java.lang.String var7 = var0.toString();
    boolean var10 = var0.changecolor((-1), (-1));
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.toString();
    boolean var15 = var0.changecolor(10, (-1));
    boolean var18 = var0.changecolor(1, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "RR"+ "'", var12.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test420() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test420");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    boolean var6 = var0.changecolor(0, 1);
    java.lang.String var7 = var0.toString();
    boolean var10 = var0.changecolor(100, 1);
    boolean var13 = var0.changecolor(100, 100);
    boolean var16 = var0.changecolor(0, 100);
    java.lang.String var17 = var0.toString();
    java.lang.String var18 = var0.toString();
    boolean var21 = var0.changecolor(1, 10);
    java.lang.String var22 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "RR"+ "'", var17.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "RR"+ "'", var18.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "RR"+ "'", var22.equals("RR"));

  }

  public void test421() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test421");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(1, 100);
    boolean var6 = var0.changecolor(100, 1);
    boolean var9 = var0.changecolor(1, (-1));
    boolean var12 = var0.changecolor(0, 100);
    java.lang.String var13 = var0.toString();
    boolean var16 = var0.changecolor(10, (-1));
    java.lang.String var17 = var0.toString();
    java.lang.String var18 = var0.toString();
    boolean var21 = var0.changecolor(100, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "RR"+ "'", var13.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "RR"+ "'", var17.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "RR"+ "'", var18.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test422() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test422");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor(1, 10);
    java.lang.String var7 = var0.toString();
    boolean var10 = var0.changecolor(100, 10);
    boolean var13 = var0.changecolor(10, 1);
    boolean var16 = var0.changecolor(1, 100);
    boolean var19 = var0.changecolor((-1), 1);
    boolean var22 = var0.changecolor(0, (-1));
    java.lang.String var23 = var0.toString();
    boolean var26 = var0.changecolor(10, 0);
    boolean var29 = var0.changecolor(1, 100);
    java.lang.String var30 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
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
    assertTrue("'" + var23 + "' != '" + "RR"+ "'", var23.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "RR"+ "'", var30.equals("RR"));

  }

  public void test423() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test423");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor(1, 10);
    boolean var9 = var0.changecolor((-1), (-1));
    java.lang.String var10 = var0.toString();
    boolean var13 = var0.changecolor(10, 10);
    java.lang.String var14 = var0.toString();
    boolean var17 = var0.changecolor(100, 100);
    java.lang.String var18 = var0.toString();
    java.lang.String var19 = var0.toString();
    java.lang.String var20 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "RR"+ "'", var10.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "RR"+ "'", var14.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "RR"+ "'", var18.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "RR"+ "'", var19.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "RR"+ "'", var20.equals("RR"));

  }

  public void test424() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test424");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(1, 100);
    boolean var6 = var0.changecolor(100, 1);
    boolean var9 = var0.changecolor(1, (-1));
    boolean var12 = var0.changecolor(0, 100);
    java.lang.String var13 = var0.toString();
    boolean var16 = var0.changecolor(10, 10);
    java.lang.String var17 = var0.toString();
    java.lang.String var18 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "RR"+ "'", var13.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "RR"+ "'", var17.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "RR"+ "'", var18.equals("RR"));

  }

  public void test425() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test425");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor(10, 10);
    java.lang.String var8 = var0.toString();
    java.lang.String var9 = var0.toString();
    boolean var12 = var0.changecolor(0, 0);
    java.lang.String var13 = var0.toString();
    java.lang.String var14 = var0.toString();
    boolean var17 = var0.changecolor(0, 1);
    boolean var20 = var0.changecolor(0, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "RR"+ "'", var9.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "VR"+ "'", var13.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "VR"+ "'", var14.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test426() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test426");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    java.lang.String var4 = var0.toString();
    java.lang.String var5 = var0.toString();
    boolean var8 = var0.changecolor(1, 0);
    boolean var11 = var0.changecolor(10, 0);
    boolean var14 = var0.changecolor(10, 0);
    java.lang.String var15 = var0.toString();
    boolean var18 = var0.changecolor(0, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "RR"+ "'", var4.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "RR"+ "'", var5.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "RV"+ "'", var15.equals("RV"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test427() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test427");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor((-1), 10);
    boolean var10 = var0.changecolor(10, 0);
    boolean var13 = var0.changecolor(1, 1);
    java.lang.String var14 = var0.toString();
    java.lang.String var15 = var0.toString();
    java.lang.String var16 = var0.toString();
    boolean var19 = var0.changecolor(100, 100);
    boolean var22 = var0.changecolor(10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "RR"+ "'", var14.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "RR"+ "'", var15.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "RR"+ "'", var16.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test428() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test428");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor((-1), 10);
    boolean var10 = var0.changecolor(10, 0);
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.toString();
    java.lang.String var13 = var0.toString();
    boolean var16 = var0.changecolor((-1), 100);
    boolean var19 = var0.changecolor(1, 100);
    boolean var22 = var0.changecolor(1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "RR"+ "'", var12.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "RR"+ "'", var13.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test429() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test429");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(1, 100);
    boolean var6 = var0.changecolor(100, 1);
    boolean var9 = var0.changecolor(1, (-1));
    boolean var12 = var0.changecolor(100, 0);
    java.lang.String var13 = var0.toString();
    java.lang.String var14 = var0.toString();
    java.lang.String var15 = var0.toString();
    boolean var18 = var0.changecolor(10, 100);
    boolean var21 = var0.changecolor(1, 1);
    java.lang.String var22 = var0.toString();
    boolean var25 = var0.changecolor(10, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "RR"+ "'", var13.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "RR"+ "'", var14.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "RR"+ "'", var15.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "RR"+ "'", var22.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test430() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test430");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor(1, 10);
    boolean var9 = var0.changecolor((-1), (-1));
    boolean var12 = var0.changecolor(100, 100);
    java.lang.String var13 = var0.toString();
    boolean var16 = var0.changecolor(1, 0);
    boolean var19 = var0.changecolor(0, 10);
    java.lang.String var20 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "RR"+ "'", var13.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "RV"+ "'", var20.equals("RV"));

  }

  public void test431() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test431");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    java.lang.String var4 = var0.toString();
    boolean var7 = var0.changecolor(10, 1);
    java.lang.String var8 = var0.toString();
    boolean var11 = var0.changecolor(10, 0);
    boolean var14 = var0.changecolor(10, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "RR"+ "'", var4.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test432() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test432");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(1, 100);
    java.lang.String var4 = var0.toString();
    boolean var7 = var0.changecolor(0, (-1));
    boolean var10 = var0.changecolor(1, 1);
    java.lang.String var11 = var0.toString();
    boolean var14 = var0.changecolor(10, 10);
    boolean var17 = var0.changecolor(0, 0);
    java.lang.String var18 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "RR"+ "'", var4.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "VR"+ "'", var18.equals("VR"));

  }

  public void test433() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test433");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    boolean var6 = var0.changecolor(0, 1);
    java.lang.String var7 = var0.toString();
    boolean var10 = var0.changecolor(10, 1);
    boolean var13 = var0.changecolor(100, 0);
    boolean var16 = var0.changecolor((-1), 0);
    java.lang.String var17 = var0.toString();
    boolean var20 = var0.changecolor(100, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "RR"+ "'", var17.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test434() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test434");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor(100, (-1));
    java.lang.String var7 = var0.toString();
    boolean var10 = var0.changecolor(1, 1);
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.toString();
    java.lang.String var13 = var0.toString();
    java.lang.String var14 = var0.toString();
    java.lang.String var15 = var0.toString();
    boolean var18 = var0.changecolor(100, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "RR"+ "'", var12.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "RR"+ "'", var13.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "RR"+ "'", var14.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "RR"+ "'", var15.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test435() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test435");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    boolean var6 = var0.changecolor(0, 1);
    boolean var9 = var0.changecolor(100, 0);
    java.lang.String var10 = var0.toString();
    boolean var13 = var0.changecolor(1, (-1));
    boolean var16 = var0.changecolor(0, (-1));
    java.lang.String var17 = var0.toString();
    boolean var20 = var0.changecolor((-1), 1);
    boolean var23 = var0.changecolor(10, 1);
    boolean var26 = var0.changecolor(0, 1);
    java.lang.String var27 = var0.toString();
    java.lang.String var28 = var0.toString();
    boolean var31 = var0.changecolor(0, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "RR"+ "'", var10.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "RR"+ "'", var17.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "RR"+ "'", var27.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "RR"+ "'", var28.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);

  }

  public void test436() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test436");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    boolean var6 = var0.changecolor(0, 1);
    java.lang.String var7 = var0.toString();
    boolean var10 = var0.changecolor(100, 1);
    boolean var13 = var0.changecolor(0, 10);
    boolean var16 = var0.changecolor((-1), 1);
    boolean var19 = var0.changecolor(1, 100);
    boolean var22 = var0.changecolor(0, 0);
    java.lang.String var23 = var0.toString();
    boolean var26 = var0.changecolor(100, 10);
    boolean var29 = var0.changecolor((-1), 100);
    java.lang.String var30 = var0.toString();
    java.lang.String var31 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "VR"+ "'", var23.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "VR"+ "'", var30.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "VR"+ "'", var31.equals("VR"));

  }

  public void test437() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test437");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor(10, 10);
    boolean var10 = var0.changecolor(100, 1);
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.toString();
    java.lang.String var13 = var0.toString();
    boolean var16 = var0.changecolor(0, 10);
    java.lang.String var17 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "RR"+ "'", var12.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "RR"+ "'", var13.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "RR"+ "'", var17.equals("RR"));

  }

  public void test438() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test438");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor((-1), 10);
    java.lang.String var7 = var0.toString();
    java.lang.String var8 = var0.toString();
    boolean var11 = var0.changecolor(1, 100);
    boolean var14 = var0.changecolor(1, (-1));
    boolean var17 = var0.changecolor(100, 1);
    java.lang.String var18 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "RR"+ "'", var18.equals("RR"));

  }

  public void test439() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test439");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    boolean var6 = var0.changecolor(10, 10);
    java.lang.String var7 = var0.toString();
    boolean var10 = var0.changecolor(0, 0);
    boolean var13 = var0.changecolor(10, 1);
    boolean var16 = var0.changecolor((-1), 1);
    java.lang.String var17 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "VR"+ "'", var17.equals("VR"));

  }

  public void test440() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test440");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    java.lang.String var5 = var0.toString();
    boolean var8 = var0.changecolor(0, 1);
    boolean var11 = var0.changecolor(0, (-1));
    boolean var14 = var0.changecolor(0, 100);
    boolean var17 = var0.changecolor(100, 0);
    boolean var20 = var0.changecolor(1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "RR"+ "'", var5.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);

  }

  public void test441() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test441");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(1, 100);
    boolean var6 = var0.changecolor(100, 1);
    boolean var9 = var0.changecolor(0, 0);
    boolean var12 = var0.changecolor(0, (-1));
    boolean var15 = var0.changecolor(1, 1);
    boolean var18 = var0.changecolor(10, 100);
    boolean var21 = var0.changecolor(1, 100);
    boolean var24 = var0.changecolor(100, 100);
    boolean var27 = var0.changecolor(100, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test442() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test442");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    boolean var6 = var0.changecolor(0, 1);
    java.lang.String var7 = var0.toString();
    boolean var10 = var0.changecolor(10, 1);
    java.lang.String var11 = var0.toString();
    boolean var14 = var0.changecolor(10, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test443() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test443");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    java.lang.String var4 = var0.toString();
    boolean var7 = var0.changecolor((-1), 0);
    java.lang.String var8 = var0.toString();
    java.lang.String var9 = var0.toString();
    java.lang.String var10 = var0.toString();
    boolean var13 = var0.changecolor(1, (-1));
    java.lang.String var14 = var0.toString();
    boolean var17 = var0.changecolor(0, 0);
    boolean var20 = var0.changecolor(1, 100);
    java.lang.String var21 = var0.toString();
    boolean var24 = var0.changecolor(10, 10);
    boolean var27 = var0.changecolor(0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "RR"+ "'", var4.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "RR"+ "'", var9.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "RR"+ "'", var10.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "RR"+ "'", var14.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "VR"+ "'", var21.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test444() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test444");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    java.lang.String var5 = var0.toString();
    boolean var8 = var0.changecolor((-1), 0);
    boolean var11 = var0.changecolor(0, 100);
    java.lang.String var12 = var0.toString();
    java.lang.String var13 = var0.toString();
    java.lang.String var14 = var0.toString();
    boolean var17 = var0.changecolor(1, 0);
    java.lang.String var18 = var0.toString();
    java.lang.String var19 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "RR"+ "'", var5.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "RR"+ "'", var12.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "RR"+ "'", var13.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "RR"+ "'", var14.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "RV"+ "'", var18.equals("RV"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "RV"+ "'", var19.equals("RV"));

  }

  public void test445() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test445");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    java.lang.String var4 = var0.toString();
    boolean var7 = var0.changecolor(1, (-1));
    boolean var10 = var0.changecolor(100, 100);
    boolean var13 = var0.changecolor(10, 10);
    boolean var16 = var0.changecolor(10, 0);
    java.lang.String var17 = var0.toString();
    boolean var20 = var0.changecolor((-1), 1);
    java.lang.String var21 = var0.toString();
    boolean var24 = var0.changecolor(0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "RR"+ "'", var4.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "RR"+ "'", var17.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "RR"+ "'", var21.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test446() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test446");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    java.lang.String var5 = var0.toString();
    java.lang.String var6 = var0.toString();
    java.lang.String var7 = var0.toString();
    boolean var10 = var0.changecolor(0, 0);
    boolean var13 = var0.changecolor(100, 1);
    boolean var16 = var0.changecolor(0, 10);
    boolean var19 = var0.changecolor(100, (-1));
    java.lang.String var20 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "RR"+ "'", var5.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "RR"+ "'", var6.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "VR"+ "'", var20.equals("VR"));

  }

  public void test447() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test447");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor(1, 1);
    java.lang.String var7 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));

  }

  public void test448() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test448");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(1, (-1));
    boolean var6 = var0.changecolor(0, 0);
    boolean var9 = var0.changecolor(10, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test449() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test449");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    java.lang.String var4 = var0.toString();
    boolean var7 = var0.changecolor(10, 1);
    boolean var10 = var0.changecolor(10, 100);
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.toString();
    java.lang.String var13 = var0.toString();
    boolean var16 = var0.changecolor(100, 10);
    boolean var19 = var0.changecolor((-1), 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "RR"+ "'", var4.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "RR"+ "'", var12.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "RR"+ "'", var13.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test450() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test450");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    java.lang.String var4 = var0.toString();
    java.lang.String var5 = var0.toString();
    boolean var8 = var0.changecolor(1, 0);
    java.lang.String var9 = var0.toString();
    boolean var12 = var0.changecolor(100, (-1));
    java.lang.String var13 = var0.toString();
    boolean var16 = var0.changecolor(100, 1);
    java.lang.String var17 = var0.toString();
    boolean var20 = var0.changecolor((-1), 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "RR"+ "'", var4.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "RR"+ "'", var5.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "RV"+ "'", var9.equals("RV"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "RV"+ "'", var13.equals("RV"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "RV"+ "'", var17.equals("RV"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test451() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test451");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor(10, 1);
    boolean var10 = var0.changecolor(100, 10);
    boolean var13 = var0.changecolor((-1), (-1));
    java.lang.String var14 = var0.toString();
    boolean var17 = var0.changecolor(1, 10);
    boolean var20 = var0.changecolor(0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "RR"+ "'", var14.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);

  }

  public void test452() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test452");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    java.lang.String var4 = var0.toString();
    boolean var7 = var0.changecolor(10, 1);
    boolean var10 = var0.changecolor(10, 100);
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.toString();
    java.lang.String var13 = var0.toString();
    boolean var16 = var0.changecolor(100, 0);
    boolean var19 = var0.changecolor((-1), 100);
    boolean var22 = var0.changecolor(10, 100);
    boolean var25 = var0.changecolor(1, 0);
    boolean var28 = var0.changecolor(10, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "RR"+ "'", var4.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "RR"+ "'", var12.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "RR"+ "'", var13.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test453() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test453");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    boolean var6 = var0.changecolor(0, 1);
    java.lang.String var7 = var0.toString();
    boolean var10 = var0.changecolor((-1), (-1));
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.toString();
    boolean var15 = var0.changecolor(10, 1);
    boolean var18 = var0.changecolor(10, 1);
    boolean var21 = var0.changecolor((-1), (-1));
    boolean var24 = var0.changecolor((-1), 10);
    boolean var27 = var0.changecolor(0, 10);
    boolean var30 = var0.changecolor(100, 100);
    java.lang.String var31 = var0.toString();
    boolean var34 = var0.changecolor(100, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "RR"+ "'", var12.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
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
    assertTrue("'" + var31 + "' != '" + "RR"+ "'", var31.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);

  }

  public void test454() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test454");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor(1, 10);
    boolean var9 = var0.changecolor(1, 10);
    boolean var12 = var0.changecolor(100, 10);
    boolean var15 = var0.changecolor(1, 0);
    boolean var18 = var0.changecolor((-1), 0);
    java.lang.String var19 = var0.toString();
    boolean var22 = var0.changecolor((-1), 10);
    boolean var25 = var0.changecolor(0, 0);
    boolean var28 = var0.changecolor((-1), 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "RV"+ "'", var19.equals("RV"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test455() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test455");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor((-1), 10);
    java.lang.String var4 = var0.toString();
    boolean var7 = var0.changecolor(10, 10);
    boolean var10 = var0.changecolor(0, 100);
    boolean var13 = var0.changecolor(100, 0);
    boolean var16 = var0.changecolor(10, 100);
    boolean var19 = var0.changecolor((-1), 100);
    java.lang.String var20 = var0.toString();
    boolean var23 = var0.changecolor(0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "RR"+ "'", var4.equals("RR"));
    
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
    assertTrue("'" + var20 + "' != '" + "RR"+ "'", var20.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);

  }

  public void test456() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test456");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    java.lang.String var4 = var0.toString();
    boolean var7 = var0.changecolor(1, (-1));
    java.lang.String var8 = var0.toString();
    boolean var11 = var0.changecolor(10, 10);
    boolean var14 = var0.changecolor((-1), 1);
    boolean var17 = var0.changecolor((-1), 100);
    java.lang.String var18 = var0.toString();
    boolean var21 = var0.changecolor(1, 100);
    boolean var24 = var0.changecolor(100, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "RR"+ "'", var4.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "RR"+ "'", var18.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test457() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test457");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    java.lang.String var5 = var0.toString();
    boolean var8 = var0.changecolor((-1), 0);
    boolean var11 = var0.changecolor(0, 100);
    boolean var14 = var0.changecolor((-1), 100);
    boolean var17 = var0.changecolor((-1), 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "RR"+ "'", var5.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test458() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test458");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor((-1), 10);
    boolean var10 = var0.changecolor(10, 1);
    boolean var13 = var0.changecolor(0, (-1));
    boolean var16 = var0.changecolor(10, 100);
    java.lang.String var17 = var0.toString();
    java.lang.String var18 = var0.toString();
    boolean var21 = var0.changecolor(1, (-1));
    boolean var24 = var0.changecolor(0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "RR"+ "'", var17.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "RR"+ "'", var18.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);

  }

  public void test459() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test459");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    boolean var6 = var0.changecolor(0, 1);
    boolean var9 = var0.changecolor(100, 0);
    boolean var12 = var0.changecolor(10, 1);
    boolean var15 = var0.changecolor(0, 100);
    java.lang.String var16 = var0.toString();
    java.lang.String var17 = var0.toString();
    java.lang.String var18 = var0.toString();
    java.lang.String var19 = var0.toString();
    boolean var22 = var0.changecolor(0, (-1));
    
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
    assertTrue("'" + var16 + "' != '" + "RR"+ "'", var16.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "RR"+ "'", var17.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "RR"+ "'", var18.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "RR"+ "'", var19.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test460() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test460");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor((-1), 10);
    boolean var9 = var0.changecolor(0, (-1));
    boolean var12 = var0.changecolor(0, 0);
    boolean var15 = var0.changecolor(10, 100);
    boolean var18 = var0.changecolor(0, 1);
    boolean var21 = var0.changecolor((-1), 100);
    java.lang.String var22 = var0.toString();
    boolean var25 = var0.changecolor(1, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "GR"+ "'", var22.equals("GR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test461() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test461");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    boolean var6 = var0.changecolor(10, 10);
    java.lang.String var7 = var0.toString();
    java.lang.String var8 = var0.toString();
    boolean var11 = var0.changecolor((-1), (-1));
    boolean var14 = var0.changecolor(1, 10);
    java.lang.String var15 = var0.toString();
    boolean var18 = var0.changecolor(100, (-1));
    java.lang.String var19 = var0.toString();
    java.lang.String var20 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "RR"+ "'", var15.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "RR"+ "'", var19.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "RR"+ "'", var20.equals("RR"));

  }

  public void test462() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test462");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor((-1), 10);
    boolean var9 = var0.changecolor(0, (-1));
    boolean var12 = var0.changecolor((-1), 0);
    java.lang.String var13 = var0.toString();
    boolean var16 = var0.changecolor(0, 1);
    boolean var19 = var0.changecolor(1, 100);
    boolean var22 = var0.changecolor(0, 100);
    java.lang.String var23 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "RR"+ "'", var13.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "RR"+ "'", var23.equals("RR"));

  }

  public void test463() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test463");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor(1, 10);
    java.lang.String var7 = var0.toString();
    boolean var10 = var0.changecolor(100, 10);
    boolean var13 = var0.changecolor(10, 1);
    boolean var16 = var0.changecolor((-1), 1);
    java.lang.String var17 = var0.toString();
    boolean var20 = var0.changecolor(100, 10);
    boolean var23 = var0.changecolor(10, 100);
    boolean var26 = var0.changecolor(100, 10);
    java.lang.String var27 = var0.toString();
    boolean var30 = var0.changecolor((-1), 10);
    java.lang.String var31 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "RR"+ "'", var17.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "RR"+ "'", var27.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "RR"+ "'", var31.equals("RR"));

  }

  public void test464() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test464");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor((-1), 10);
    boolean var10 = var0.changecolor(10, 0);
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.toString();
    java.lang.String var13 = var0.toString();
    boolean var16 = var0.changecolor((-1), 100);
    java.lang.String var17 = var0.toString();
    boolean var20 = var0.changecolor(10, 100);
    boolean var23 = var0.changecolor(1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "RR"+ "'", var12.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "RR"+ "'", var13.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "RR"+ "'", var17.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test465() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test465");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(1, 100);
    boolean var6 = var0.changecolor(100, 1);
    boolean var9 = var0.changecolor(1, (-1));
    boolean var12 = var0.changecolor(100, 0);
    java.lang.String var13 = var0.toString();
    boolean var16 = var0.changecolor(10, 100);
    boolean var19 = var0.changecolor(100, (-1));
    boolean var22 = var0.changecolor(1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "RR"+ "'", var13.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test466() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test466");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor((-1), 10);
    java.lang.String var8 = var0.toString();
    boolean var11 = var0.changecolor(100, 0);
    boolean var14 = var0.changecolor(1, 1);
    boolean var17 = var0.changecolor((-1), 100);
    java.lang.String var18 = var0.toString();
    java.lang.String var19 = var0.toString();
    java.lang.String var20 = var0.toString();
    java.lang.String var21 = var0.toString();
    boolean var24 = var0.changecolor(0, (-1));
    boolean var27 = var0.changecolor(100, 10);
    java.lang.String var28 = var0.toString();
    java.lang.String var29 = var0.toString();
    java.lang.String var30 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "RR"+ "'", var18.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "RR"+ "'", var19.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "RR"+ "'", var20.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "RR"+ "'", var21.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "RR"+ "'", var28.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "RR"+ "'", var29.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "RR"+ "'", var30.equals("RR"));

  }

  public void test467() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test467");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor((-1), 10);
    java.lang.String var8 = var0.toString();
    java.lang.String var9 = var0.toString();
    boolean var12 = var0.changecolor(0, 100);
    java.lang.String var13 = var0.toString();
    boolean var16 = var0.changecolor(10, (-1));
    java.lang.String var17 = var0.toString();
    java.lang.String var18 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "RR"+ "'", var9.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "RR"+ "'", var13.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "RR"+ "'", var17.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "RR"+ "'", var18.equals("RR"));

  }

  public void test468() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test468");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    boolean var6 = var0.changecolor(0, 1);
    java.lang.String var7 = var0.toString();
    boolean var10 = var0.changecolor(100, 1);
    boolean var13 = var0.changecolor(100, 10);
    java.lang.String var14 = var0.toString();
    boolean var17 = var0.changecolor(100, (-1));
    boolean var20 = var0.changecolor((-1), 0);
    java.lang.String var21 = var0.toString();
    boolean var24 = var0.changecolor((-1), 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "RR"+ "'", var14.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "RR"+ "'", var21.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test469() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test469");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor(1, 10);
    boolean var9 = var0.changecolor(1, 10);
    boolean var12 = var0.changecolor(100, 10);
    boolean var15 = var0.changecolor(1, 0);
    boolean var18 = var0.changecolor(100, 0);
    java.lang.String var19 = var0.toString();
    java.lang.String var20 = var0.toString();
    boolean var23 = var0.changecolor((-1), 10);
    boolean var26 = var0.changecolor(100, 0);
    java.lang.String var27 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "RV"+ "'", var19.equals("RV"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "RV"+ "'", var20.equals("RV"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "RV"+ "'", var27.equals("RV"));

  }

  public void test470() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test470");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    java.lang.String var4 = var0.toString();
    java.lang.String var5 = var0.toString();
    java.lang.String var6 = var0.toString();
    java.lang.String var7 = var0.toString();
    boolean var10 = var0.changecolor(10, 0);
    boolean var13 = var0.changecolor(1, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "RR"+ "'", var4.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "RR"+ "'", var5.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "RR"+ "'", var6.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test471() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test471");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor(100, (-1));
    java.lang.String var7 = var0.toString();
    boolean var10 = var0.changecolor(1, 1);
    boolean var13 = var0.changecolor(10, 0);
    boolean var16 = var0.changecolor(1, 0);
    boolean var19 = var0.changecolor(10, 10);
    boolean var22 = var0.changecolor(100, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test472() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test472");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    boolean var6 = var0.changecolor(0, 1);
    java.lang.String var7 = var0.toString();
    boolean var10 = var0.changecolor(100, 1);
    boolean var13 = var0.changecolor(100, 10);
    boolean var16 = var0.changecolor(10, 1);
    java.lang.String var17 = var0.toString();
    java.lang.String var18 = var0.toString();
    boolean var21 = var0.changecolor(100, 100);
    java.lang.String var22 = var0.toString();
    java.lang.String var23 = var0.toString();
    boolean var26 = var0.changecolor(0, 0);
    java.lang.String var27 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "RR"+ "'", var17.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "RR"+ "'", var18.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "RR"+ "'", var22.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "RR"+ "'", var23.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "VR"+ "'", var27.equals("VR"));

  }

  public void test473() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test473");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor(1, 10);
    boolean var9 = var0.changecolor(1, 10);
    boolean var12 = var0.changecolor(100, 10);
    boolean var15 = var0.changecolor(1, 0);
    boolean var18 = var0.changecolor(1, (-1));
    boolean var21 = var0.changecolor(1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test474() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test474");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    boolean var6 = var0.changecolor(0, 1);
    java.lang.String var7 = var0.toString();
    boolean var10 = var0.changecolor(10, 1);
    boolean var13 = var0.changecolor(100, 0);
    java.lang.String var14 = var0.toString();
    boolean var17 = var0.changecolor(100, 100);
    java.lang.String var18 = var0.toString();
    boolean var21 = var0.changecolor(0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "RR"+ "'", var14.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "RR"+ "'", var18.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test475() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test475");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor(1, 10);
    java.lang.String var7 = var0.toString();
    java.lang.String var8 = var0.toString();
    boolean var11 = var0.changecolor((-1), 1);
    boolean var14 = var0.changecolor(1, 1);
    boolean var17 = var0.changecolor(0, 1);
    java.lang.String var18 = var0.toString();
    boolean var21 = var0.changecolor((-1), 0);
    java.lang.String var22 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "RR"+ "'", var18.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "RR"+ "'", var22.equals("RR"));

  }

  public void test476() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test476");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor((-1), 10);
    boolean var9 = var0.changecolor(0, (-1));
    boolean var12 = var0.changecolor(0, 0);
    boolean var15 = var0.changecolor(10, 100);
    boolean var18 = var0.changecolor(0, 1);
    boolean var21 = var0.changecolor(0, 100);
    java.lang.String var22 = var0.toString();
    java.lang.String var23 = var0.toString();
    java.lang.String var24 = var0.toString();
    java.lang.String var25 = var0.toString();
    java.lang.String var26 = var0.toString();
    boolean var29 = var0.changecolor(100, 100);
    boolean var32 = var0.changecolor(1, 1);
    java.lang.String var33 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "GR"+ "'", var22.equals("GR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "GR"+ "'", var23.equals("GR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "GR"+ "'", var24.equals("GR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "GR"+ "'", var25.equals("GR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "GR"+ "'", var26.equals("GR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "GR"+ "'", var33.equals("GR"));

  }

  public void test477() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test477");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor((-1), 10);
    boolean var10 = var0.changecolor(10, 0);
    boolean var13 = var0.changecolor(10, (-1));
    java.lang.String var14 = var0.toString();
    java.lang.String var15 = var0.toString();
    boolean var18 = var0.changecolor(1, 1);
    boolean var21 = var0.changecolor(1, 0);
    boolean var24 = var0.changecolor((-1), 0);
    boolean var27 = var0.changecolor(1, (-1));
    boolean var30 = var0.changecolor(1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "RR"+ "'", var14.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "RR"+ "'", var15.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);

  }

  public void test478() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test478");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var6 = var0.changecolor(100, (-1));
    java.lang.String var7 = var0.toString();
    boolean var10 = var0.changecolor(1, 1);
    boolean var13 = var0.changecolor(1, (-1));
    java.lang.String var14 = var0.toString();
    java.lang.String var15 = var0.toString();
    java.lang.String var16 = var0.toString();
    boolean var19 = var0.changecolor(100, 100);
    boolean var22 = var0.changecolor((-1), 100);
    boolean var25 = var0.changecolor(0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "RR"+ "'", var14.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "RR"+ "'", var15.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "RR"+ "'", var16.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test479() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test479");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    boolean var5 = var0.changecolor(0, 0);
    java.lang.String var6 = var0.toString();
    java.lang.String var7 = var0.toString();
    boolean var10 = var0.changecolor((-1), 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "VR"+ "'", var6.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "VR"+ "'", var7.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test480() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test480");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    boolean var6 = var0.changecolor(0, 1);
    boolean var9 = var0.changecolor(100, 0);
    java.lang.String var10 = var0.toString();
    boolean var13 = var0.changecolor(10, (-1));
    boolean var16 = var0.changecolor((-1), 1);
    boolean var19 = var0.changecolor(10, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "RR"+ "'", var10.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test481() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test481");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    java.lang.String var4 = var0.toString();
    boolean var7 = var0.changecolor((-1), 0);
    java.lang.String var8 = var0.toString();
    java.lang.String var9 = var0.toString();
    java.lang.String var10 = var0.toString();
    boolean var13 = var0.changecolor(1, (-1));
    java.lang.String var14 = var0.toString();
    boolean var17 = var0.changecolor(0, 0);
    boolean var20 = var0.changecolor(1, 100);
    java.lang.String var21 = var0.toString();
    boolean var24 = var0.changecolor(1, (-1));
    java.lang.String var25 = var0.toString();
    boolean var28 = var0.changecolor(10, 100);
    boolean var31 = var0.changecolor(10, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "RR"+ "'", var4.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "RR"+ "'", var9.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "RR"+ "'", var10.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "RR"+ "'", var14.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "VR"+ "'", var21.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "VR"+ "'", var25.equals("VR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);

  }

  public void test482() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test482");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    boolean var6 = var0.changecolor(10, 10);
    java.lang.String var7 = var0.toString();
    java.lang.String var8 = var0.toString();
    boolean var11 = var0.changecolor((-1), (-1));
    boolean var14 = var0.changecolor(1, 10);
    boolean var17 = var0.changecolor(0, 0);
    boolean var20 = var0.changecolor(1, 100);
    java.lang.String var21 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "VR"+ "'", var21.equals("VR"));

  }

  public void test483() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test483");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    java.lang.String var4 = var0.toString();
    boolean var7 = var0.changecolor(10, 1);
    java.lang.String var8 = var0.toString();
    boolean var11 = var0.changecolor(10, 1);
    boolean var14 = var0.changecolor(1, 1);
    java.lang.String var15 = var0.toString();
    boolean var18 = var0.changecolor(1, 1);
    boolean var21 = var0.changecolor((-1), 10);
    boolean var24 = var0.changecolor((-1), 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "RR"+ "'", var4.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "RR"+ "'", var15.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test484() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test484");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    java.lang.String var4 = var0.toString();
    boolean var7 = var0.changecolor((-1), 0);
    java.lang.String var8 = var0.toString();
    java.lang.String var9 = var0.toString();
    java.lang.String var10 = var0.toString();
    boolean var13 = var0.changecolor(1, (-1));
    java.lang.String var14 = var0.toString();
    boolean var17 = var0.changecolor(100, 100);
    java.lang.String var18 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "RR"+ "'", var4.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "RR"+ "'", var9.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "RR"+ "'", var10.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "RR"+ "'", var14.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "RR"+ "'", var18.equals("RR"));

  }

  public void test485() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test485");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, (-1));
    boolean var7 = var0.changecolor(1, 10);
    java.lang.String var8 = var0.toString();
    boolean var11 = var0.changecolor(0, 10);
    boolean var14 = var0.changecolor(0, 1);
    java.lang.String var15 = var0.toString();
    boolean var18 = var0.changecolor((-1), 0);
    boolean var21 = var0.changecolor((-1), 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "RR"+ "'", var15.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test486() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test486");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor(10, 1);
    boolean var10 = var0.changecolor(10, 100);
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.toString();
    boolean var15 = var0.changecolor(1, 1);
    boolean var18 = var0.changecolor((-1), (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "RR"+ "'", var12.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test487() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test487");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor((-1), 10);
    java.lang.String var8 = var0.toString();
    boolean var11 = var0.changecolor(100, 0);
    boolean var14 = var0.changecolor(1, 1);
    boolean var17 = var0.changecolor(100, 100);
    java.lang.String var18 = var0.toString();
    boolean var21 = var0.changecolor(1, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "RR"+ "'", var18.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test488() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test488");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor((-1), 10);
    boolean var10 = var0.changecolor(10, 1);
    boolean var13 = var0.changecolor(0, (-1));
    boolean var16 = var0.changecolor(10, 10);
    boolean var19 = var0.changecolor(0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
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

  }

  public void test489() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test489");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    boolean var6 = var0.changecolor(0, 1);
    java.lang.String var7 = var0.toString();
    boolean var10 = var0.changecolor((-1), (-1));
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.toString();
    boolean var15 = var0.changecolor(10, 1);
    boolean var18 = var0.changecolor(10, (-1));
    boolean var21 = var0.changecolor(0, 100);
    boolean var24 = var0.changecolor(0, 1);
    java.lang.String var25 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "RR"+ "'", var12.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "RR"+ "'", var25.equals("RR"));

  }

  public void test490() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test490");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor((-1), 10);
    boolean var10 = var0.changecolor(10, 10);
    boolean var13 = var0.changecolor(10, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test491() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test491");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    java.lang.String var4 = var0.toString();
    boolean var7 = var0.changecolor(1, (-1));
    java.lang.String var8 = var0.toString();
    boolean var11 = var0.changecolor((-1), 1);
    boolean var14 = var0.changecolor(0, 1);
    java.lang.String var15 = var0.toString();
    boolean var18 = var0.changecolor(100, 0);
    boolean var21 = var0.changecolor((-1), 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "RR"+ "'", var4.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "RR"+ "'", var15.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test492() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test492");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    java.lang.String var4 = var0.toString();
    boolean var7 = var0.changecolor(1, (-1));
    boolean var10 = var0.changecolor(100, 100);
    java.lang.String var11 = var0.toString();
    boolean var14 = var0.changecolor(1, 1);
    java.lang.String var15 = var0.toString();
    boolean var18 = var0.changecolor(10, 100);
    java.lang.String var19 = var0.toString();
    boolean var22 = var0.changecolor(1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "RR"+ "'", var4.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "RR"+ "'", var15.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "RR"+ "'", var19.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);

  }

  public void test493() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test493");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor((-1), 10);
    boolean var10 = var0.changecolor(10, 0);
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.toString();
    boolean var15 = var0.changecolor((-1), 100);
    boolean var18 = var0.changecolor((-1), 0);
    java.lang.String var19 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "RR"+ "'", var12.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "RR"+ "'", var19.equals("RR"));

  }

  public void test494() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test494");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    java.lang.String var4 = var0.toString();
    java.lang.String var5 = var0.toString();
    boolean var8 = var0.changecolor(1, 0);
    java.lang.String var9 = var0.toString();
    boolean var12 = var0.changecolor(100, (-1));
    java.lang.String var13 = var0.toString();
    java.lang.String var14 = var0.toString();
    java.lang.String var15 = var0.toString();
    java.lang.String var16 = var0.toString();
    boolean var19 = var0.changecolor(100, 10);
    java.lang.String var20 = var0.toString();
    java.lang.String var21 = var0.toString();
    boolean var24 = var0.changecolor(1, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "RR"+ "'", var4.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "RR"+ "'", var5.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "RV"+ "'", var9.equals("RV"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "RV"+ "'", var13.equals("RV"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "RV"+ "'", var14.equals("RV"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "RV"+ "'", var15.equals("RV"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "RV"+ "'", var16.equals("RV"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "RV"+ "'", var20.equals("RV"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "RV"+ "'", var21.equals("RV"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test495() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test495");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    boolean var6 = var0.changecolor(0, 1);
    boolean var9 = var0.changecolor(100, 0);
    java.lang.String var10 = var0.toString();
    boolean var13 = var0.changecolor(10, (-1));
    boolean var16 = var0.changecolor(10, 10);
    boolean var19 = var0.changecolor(10, 100);
    java.lang.String var20 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "RR"+ "'", var10.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "RR"+ "'", var20.equals("RR"));

  }

  public void test496() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test496");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    java.lang.String var4 = var0.toString();
    boolean var7 = var0.changecolor(1, (-1));
    boolean var10 = var0.changecolor(100, 100);
    boolean var13 = var0.changecolor(0, 1);
    boolean var16 = var0.changecolor(1, 0);
    java.lang.String var17 = var0.toString();
    java.lang.String var18 = var0.toString();
    boolean var21 = var0.changecolor(1, 100);
    boolean var24 = var0.changecolor(100, (-1));
    java.lang.String var25 = var0.toString();
    java.lang.String var26 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "RR"+ "'", var2.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "RR"+ "'", var3.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "RR"+ "'", var4.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "RV"+ "'", var17.equals("RV"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "RV"+ "'", var18.equals("RV"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "RV"+ "'", var25.equals("RV"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "RV"+ "'", var26.equals("RV"));

  }

  public void test497() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test497");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, (-1));
    boolean var7 = var0.changecolor(1, 10);
    java.lang.String var8 = var0.toString();
    boolean var11 = var0.changecolor(0, 10);
    boolean var14 = var0.changecolor(0, 1);
    boolean var17 = var0.changecolor((-1), (-1));
    boolean var20 = var0.changecolor(1, (-1));
    boolean var23 = var0.changecolor(0, 1);
    java.lang.String var24 = var0.toString();
    boolean var27 = var0.changecolor(100, 100);
    boolean var30 = var0.changecolor(0, 10);
    boolean var33 = var0.changecolor(1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RR"+ "'", var8.equals("RR"));
    
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
    assertTrue("'" + var24 + "' != '" + "RR"+ "'", var24.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);

  }

  public void test498() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test498");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    java.lang.String var1 = var0.toString();
    boolean var4 = var0.changecolor(100, 1);
    boolean var7 = var0.changecolor((-1), 10);
    boolean var10 = var0.changecolor(10, 1);
    boolean var13 = var0.changecolor(0, (-1));
    boolean var16 = var0.changecolor(10, 100);
    boolean var19 = var0.changecolor(1, 100);
    boolean var22 = var0.changecolor(100, 100);
    java.lang.String var23 = var0.toString();
    boolean var26 = var0.changecolor(100, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "RR"+ "'", var1.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
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
    assertTrue("'" + var23 + "' != '" + "RR"+ "'", var23.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test499() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test499");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    boolean var6 = var0.changecolor(0, 1);
    boolean var9 = var0.changecolor(100, 0);
    java.lang.String var10 = var0.toString();
    boolean var13 = var0.changecolor(10, (-1));
    java.lang.String var14 = var0.toString();
    boolean var17 = var0.changecolor((-1), (-1));
    java.lang.String var18 = var0.toString();
    java.lang.String var19 = var0.toString();
    boolean var22 = var0.changecolor(100, 10);
    java.lang.String var23 = var0.toString();
    java.lang.String var24 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "RR"+ "'", var10.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "RR"+ "'", var14.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "RR"+ "'", var18.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "RR"+ "'", var19.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "RR"+ "'", var23.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "RR"+ "'", var24.equals("RR"));

  }

  public void test500() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test500");


    semaforo.Semaforo var0 = new semaforo.Semaforo();
    boolean var3 = var0.changecolor(10, (-1));
    boolean var6 = var0.changecolor(0, 1);
    java.lang.String var7 = var0.toString();
    boolean var10 = var0.changecolor(100, 1);
    java.lang.String var11 = var0.toString();
    boolean var14 = var0.changecolor(0, 0);
    boolean var17 = var0.changecolor(1, 0);
    boolean var20 = var0.changecolor((-1), (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "RR"+ "'", var7.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "RR"+ "'", var11.equals("RR"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

}