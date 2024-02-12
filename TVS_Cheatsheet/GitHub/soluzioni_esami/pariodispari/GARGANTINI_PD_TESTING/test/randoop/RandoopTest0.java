package randoop;

import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test1");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var7 = var0.finito();
    boolean var10 = var0.tira((-1), 10);
    boolean var11 = var0.finito();
    boolean var14 = var0.tira(100, 100);
    boolean var15 = var0.finito();
    boolean var16 = var0.finito();
    boolean var19 = var0.tira(0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test2");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var9 = var0.tira(0, 1);
    boolean var12 = var0.tira(100, 10);
    boolean var15 = var0.tira(0, 100);
    boolean var18 = var0.tira(10, 1);
    boolean var19 = var0.finito();
    
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
    assertTrue(var19 == false);

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test3");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var5 = var0.finito();
    boolean var8 = var0.tira(10, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test4");


    p.PariODispari var0 = new p.PariODispari();
    boolean var1 = var0.finito();
    boolean var2 = var0.finito();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test5");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var5 = var0.finito();
    boolean var6 = var0.finito();
    boolean var7 = var0.finito();
    boolean var8 = var0.finito();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test6");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(1, 10);
    boolean var9 = var0.tira(1, 100);
    boolean var10 = var0.finito();
    boolean var13 = var0.tira((-1), 0);
    
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

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test7");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira(1, (-1));
    boolean var4 = var0.finito();
    boolean var7 = var0.tira(100, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test8");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var7 = var0.finito();
    boolean var10 = var0.tira(100, 100);
    boolean var11 = var0.finito();
    boolean var12 = var0.finito();
    boolean var13 = var0.finito();
    boolean var16 = var0.tira(0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
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
    assertTrue(var16 == false);

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test9");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var7 = var0.finito();
    boolean var10 = var0.tira((-1), 10);
    boolean var11 = var0.finito();
    boolean var14 = var0.tira((-1), 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test10");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var7 = var0.finito();
    boolean var10 = var0.tira((-1), 10);
    boolean var11 = var0.finito();
    boolean var14 = var0.tira(100, 100);
    boolean var17 = var0.tira(1, (-1));
    boolean var20 = var0.tira((-1), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test11");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var9 = var0.tira(0, 1);
    boolean var12 = var0.tira(100, 10);
    boolean var15 = var0.tira(1, 1);
    boolean var18 = var0.tira((-1), 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
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

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test12");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var7 = var0.tira((-1), 1);
    boolean var8 = var0.finito();
    boolean var11 = var0.tira(1, 0);
    boolean var14 = var0.tira((-1), 1);
    boolean var17 = var0.tira(0, 100);
    boolean var20 = var0.tira(1, (-1));
    
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
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test13");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var9 = var0.tira(0, 1);
    boolean var12 = var0.tira((-1), (-1));
    boolean var13 = var0.finito();
    boolean var16 = var0.tira(1, (-1));
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test14");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var5 = var0.finito();
    boolean var8 = var0.tira(1, 100);
    boolean var9 = var0.finito();
    boolean var12 = var0.tira((-1), (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test15");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var7 = var0.tira((-1), (-1));
    boolean var10 = var0.tira(1, 10);
    boolean var13 = var0.tira(0, 1);
    
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

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test16");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var9 = var0.tira(0, 1);
    boolean var10 = var0.finito();
    boolean var13 = var0.tira(1, 100);
    boolean var14 = var0.finito();
    boolean var17 = var0.tira(100, 1);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test17");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var7 = var0.tira((-1), 1);
    boolean var8 = var0.finito();
    boolean var11 = var0.tira(1, 0);
    boolean var14 = var0.tira(10, 100);
    boolean var17 = var0.tira(100, (-1));
    boolean var18 = var0.finito();
    boolean var19 = var0.finito();
    
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
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test18");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var7 = var0.tira(0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test19");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var7 = var0.finito();
    boolean var8 = var0.finito();
    boolean var11 = var0.tira(0, 1);
    boolean var14 = var0.tira(10, 10);
    boolean var17 = var0.tira(10, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
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

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test20");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var7 = var0.tira((-1), 1);
    boolean var8 = var0.finito();
    boolean var9 = var0.finito();
    boolean var12 = var0.tira(10, 100);
    boolean var15 = var0.tira((-1), 10);
    boolean var18 = var0.tira(100, 1);
    
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
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test21");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira((-1), (-1));
    boolean var9 = var0.tira(0, 1);
    boolean var12 = var0.tira(1, 0);
    boolean var13 = var0.finito();
    boolean var16 = var0.tira((-1), (-1));
    boolean var19 = var0.tira(0, 1);
    boolean var20 = var0.finito();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test22");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var7 = var0.tira(1, 10);
    boolean var8 = var0.finito();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test23");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var5 = var0.finito();
    boolean var8 = var0.tira(1, 100);
    boolean var11 = var0.tira(10, (-1));
    boolean var14 = var0.tira(100, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test24");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(1, 10);
    boolean var9 = var0.tira(1, 100);
    boolean var12 = var0.tira(0, 0);
    boolean var15 = var0.tira(1, 100);
    
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

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test25");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var5 = var0.finito();
    boolean var8 = var0.tira(1, 100);
    boolean var9 = var0.finito();
    boolean var12 = var0.tira(0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test26");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var9 = var0.tira((-1), 1);
    boolean var12 = var0.tira(10, 1);
    boolean var13 = var0.finito();
    boolean var16 = var0.tira(100, 100);
    boolean var19 = var0.tira(10, 1);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test27");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var5 = var0.finito();
    boolean var8 = var0.tira(1, 100);
    boolean var9 = var0.finito();
    boolean var12 = var0.tira((-1), 1);
    boolean var13 = var0.finito();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test28");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var7 = var0.finito();
    boolean var8 = var0.finito();
    boolean var9 = var0.finito();
    boolean var10 = var0.finito();
    boolean var13 = var0.tira(0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test29");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var7 = var0.finito();
    boolean var10 = var0.tira((-1), 10);
    boolean var11 = var0.finito();
    boolean var14 = var0.tira(100, 100);
    boolean var17 = var0.tira(1, (-1));
    boolean var20 = var0.tira(10, 1);
    boolean var21 = var0.finito();
    boolean var24 = var0.tira((-1), 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test30");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(1, 10);
    boolean var9 = var0.tira(1, 100);
    boolean var12 = var0.tira((-1), 1);
    boolean var13 = var0.finito();
    
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

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test31");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(1, 10);
    boolean var7 = var0.finito();
    boolean var8 = var0.finito();
    boolean var11 = var0.tira(0, 10);
    boolean var14 = var0.tira(100, (-1));
    boolean var17 = var0.tira(10, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
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

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test32");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var7 = var0.tira((-1), 1);
    boolean var8 = var0.finito();
    boolean var11 = var0.tira(1, 0);
    boolean var14 = var0.tira(10, 100);
    boolean var17 = var0.tira(10, 1);
    boolean var18 = var0.finito();
    boolean var19 = var0.finito();
    boolean var22 = var0.tira((-1), 100);
    boolean var23 = var0.finito();
    boolean var26 = var0.tira(0, (-1));
    
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
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test33");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var7 = var0.finito();
    boolean var10 = var0.tira((-1), 10);
    boolean var11 = var0.finito();
    boolean var14 = var0.tira(100, 100);
    boolean var15 = var0.finito();
    boolean var16 = var0.finito();
    boolean var19 = var0.tira((-1), 0);
    boolean var22 = var0.tira(100, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
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

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test34");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(1, 10);
    boolean var7 = var0.finito();
    boolean var8 = var0.finito();
    boolean var9 = var0.finito();
    boolean var12 = var0.tira(100, 100);
    boolean var15 = var0.tira(100, 1);
    boolean var18 = var0.tira(100, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
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
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test35");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira((-1), (-1));
    boolean var9 = var0.tira(0, 1);
    boolean var12 = var0.tira(0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test36");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var7 = var0.finito();
    boolean var10 = var0.tira(100, 100);
    boolean var11 = var0.finito();
    boolean var12 = var0.finito();
    boolean var13 = var0.finito();
    boolean var14 = var0.finito();
    boolean var17 = var0.tira((-1), 1);
    boolean var20 = var0.tira(10, (-1));
    boolean var23 = var0.tira(0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
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
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test37");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var7 = var0.finito();
    boolean var8 = var0.finito();
    boolean var9 = var0.finito();
    boolean var12 = var0.tira((-1), 0);
    boolean var13 = var0.finito();
    boolean var14 = var0.finito();
    boolean var17 = var0.tira(10, 10);
    boolean var20 = var0.tira((-1), 10);
    boolean var21 = var0.finito();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
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
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test38");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(1, 10);
    boolean var7 = var0.finito();
    boolean var8 = var0.finito();
    boolean var11 = var0.tira(0, 10);
    boolean var14 = var0.tira(1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test39");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(1, 10);
    boolean var9 = var0.tira(1, 100);
    boolean var10 = var0.finito();
    boolean var11 = var0.finito();
    boolean var12 = var0.finito();
    boolean var15 = var0.tira(0, (-1));
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test40");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(1, 10);
    boolean var9 = var0.tira(1, 100);
    boolean var10 = var0.finito();
    boolean var11 = var0.finito();
    boolean var12 = var0.finito();
    boolean var13 = var0.finito();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test41");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var7 = var0.tira((-1), 1);
    boolean var10 = var0.tira(10, 1);
    boolean var11 = var0.finito();
    boolean var12 = var0.finito();
    
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
    assertTrue(var12 == false);

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test42");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var7 = var0.finito();
    boolean var10 = var0.tira((-1), 10);
    boolean var11 = var0.finito();
    boolean var14 = var0.tira(100, 100);
    boolean var15 = var0.finito();
    boolean var16 = var0.finito();
    boolean var19 = var0.tira((-1), 0);
    boolean var20 = var0.finito();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test43");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var9 = var0.tira(0, 1);
    boolean var12 = var0.tira((-1), (-1));
    boolean var13 = var0.finito();
    boolean var16 = var0.tira(10, 0);
    boolean var19 = var0.tira(1, 1);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test44");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var9 = var0.tira(0, 1);
    boolean var12 = var0.tira((-1), (-1));
    boolean var13 = var0.finito();
    boolean var16 = var0.tira(10, 0);
    boolean var17 = var0.finito();
    boolean var18 = var0.finito();
    boolean var19 = var0.finito();
    boolean var22 = var0.tira(10, 10);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test45");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira((-1), (-1));
    boolean var9 = var0.tira(0, 1);
    boolean var12 = var0.tira(1, 10);
    boolean var13 = var0.finito();
    boolean var14 = var0.finito();
    boolean var17 = var0.tira((-1), 10);
    boolean var20 = var0.tira(100, (-1));
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test46");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(1, 10);
    boolean var9 = var0.tira(1, 100);
    boolean var10 = var0.finito();
    boolean var11 = var0.finito();
    boolean var14 = var0.tira(0, 1);
    
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
    assertTrue(var14 == false);

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test47");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(1, 10);
    boolean var9 = var0.tira(1, 100);
    boolean var12 = var0.tira(10, 1);
    boolean var15 = var0.tira(100, 10);
    boolean var16 = var0.finito();
    
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

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test48");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(1, 10);
    boolean var7 = var0.finito();
    boolean var8 = var0.finito();
    boolean var11 = var0.tira(0, 10);
    boolean var14 = var0.tira(10, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test49");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(1, 10);
    boolean var7 = var0.finito();
    boolean var8 = var0.finito();
    boolean var9 = var0.finito();
    boolean var12 = var0.tira(1, 100);
    boolean var13 = var0.finito();
    boolean var14 = var0.finito();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
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
    assertTrue(var14 == false);

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test50");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(1, 10);
    boolean var9 = var0.tira(1, 100);
    boolean var10 = var0.finito();
    boolean var11 = var0.finito();
    boolean var14 = var0.tira(1, 10);
    
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
    assertTrue(var14 == false);

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test51");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira((-1), (-1));
    boolean var9 = var0.tira(0, 1);
    boolean var12 = var0.tira(1, 10);
    boolean var15 = var0.tira(1, 0);
    boolean var18 = var0.tira(10, 1);
    boolean var21 = var0.tira((-1), 100);
    
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

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test52");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var5 = var0.finito();
    boolean var8 = var0.tira(100, 0);
    boolean var9 = var0.finito();
    boolean var12 = var0.tira(0, 0);
    boolean var15 = var0.tira((-1), 100);
    boolean var16 = var0.finito();
    boolean var19 = var0.tira((-1), 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
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
    assertTrue(var19 == false);

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test53");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var7 = var0.finito();
    boolean var10 = var0.tira(100, 100);
    boolean var11 = var0.finito();
    boolean var12 = var0.finito();
    boolean var13 = var0.finito();
    boolean var14 = var0.finito();
    boolean var17 = var0.tira((-1), 1);
    boolean var18 = var0.finito();
    boolean var19 = var0.finito();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
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
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test54");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var5 = var0.finito();
    boolean var8 = var0.tira(100, 0);
    boolean var9 = var0.finito();
    boolean var12 = var0.tira(0, 0);
    boolean var15 = var0.tira((-1), 100);
    boolean var18 = var0.tira(100, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
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

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test55");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var9 = var0.tira(0, 1);
    boolean var12 = var0.tira((-1), (-1));
    boolean var13 = var0.finito();
    boolean var16 = var0.tira(10, 0);
    boolean var17 = var0.finito();
    boolean var20 = var0.tira(1, 1);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test56");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(1, 10);
    boolean var7 = var0.finito();
    boolean var8 = var0.finito();
    boolean var9 = var0.finito();
    boolean var12 = var0.tira(100, 100);
    boolean var15 = var0.tira(100, 1);
    boolean var16 = var0.finito();
    boolean var19 = var0.tira(0, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
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
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test57");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var9 = var0.tira(1, (-1));
    boolean var10 = var0.finito();
    boolean var13 = var0.tira(0, 0);
    boolean var14 = var0.finito();
    boolean var17 = var0.tira((-1), 100);
    boolean var18 = var0.finito();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test58");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var7 = var0.tira((-1), 1);
    boolean var8 = var0.finito();
    boolean var11 = var0.tira(1, 0);
    boolean var12 = var0.finito();
    boolean var15 = var0.tira(10, 100);
    boolean var18 = var0.tira(10, (-1));
    
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
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test59");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var7 = var0.tira((-1), 1);
    boolean var8 = var0.finito();
    boolean var11 = var0.tira(10, (-1));
    
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

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test60");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira((-1), (-1));
    boolean var9 = var0.tira(0, 10);
    boolean var10 = var0.finito();
    boolean var11 = var0.finito();
    boolean var14 = var0.tira(10, 0);
    boolean var17 = var0.tira((-1), 100);
    
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
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test61");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var7 = var0.tira((-1), 1);
    boolean var8 = var0.finito();
    boolean var11 = var0.tira(1, 0);
    boolean var14 = var0.tira((-1), 1);
    boolean var15 = var0.finito();
    boolean var16 = var0.finito();
    boolean var17 = var0.finito();
    boolean var18 = var0.finito();
    boolean var21 = var0.tira(100, 1);
    
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

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test62");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var9 = var0.tira(0, 1);
    boolean var12 = var0.tira((-1), (-1));
    boolean var13 = var0.finito();
    boolean var16 = var0.tira((-1), 1);
    boolean var17 = var0.finito();
    boolean var18 = var0.finito();
    boolean var19 = var0.finito();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test63");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(1, 10);
    boolean var9 = var0.tira(1, 100);
    boolean var12 = var0.tira(10, 1);
    boolean var15 = var0.tira(100, (-1));
    
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

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test64");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(1, 10);
    boolean var7 = var0.finito();
    boolean var8 = var0.finito();
    boolean var9 = var0.finito();
    boolean var12 = var0.tira(100, 100);
    boolean var13 = var0.finito();
    boolean var16 = var0.tira(1, 0);
    boolean var17 = var0.finito();
    boolean var20 = var0.tira(0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
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
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test65");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var9 = var0.tira(1, (-1));
    boolean var10 = var0.finito();
    boolean var13 = var0.tira(0, 0);
    boolean var16 = var0.tira((-1), 0);
    boolean var19 = var0.tira(10, (-1));
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test66");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var7 = var0.tira((-1), 1);
    boolean var10 = var0.tira(1, 1);
    boolean var13 = var0.tira((-1), 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test67");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var7 = var0.tira((-1), 1);
    boolean var10 = var0.tira(1, 1);
    boolean var13 = var0.tira(1, (-1));
    boolean var16 = var0.tira(1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test68");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var7 = var0.tira((-1), 1);
    boolean var8 = var0.finito();
    boolean var11 = var0.tira(1, 0);
    boolean var14 = var0.tira(10, 100);
    boolean var17 = var0.tira(10, 1);
    boolean var18 = var0.finito();
    boolean var19 = var0.finito();
    boolean var20 = var0.finito();
    boolean var21 = var0.finito();
    
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
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test69");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var9 = var0.tira(0, 100);
    boolean var12 = var0.tira(100, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test70");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira((-1), (-1));
    boolean var9 = var0.tira(100, 0);
    boolean var10 = var0.finito();
    boolean var11 = var0.finito();
    
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

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test71");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var7 = var0.finito();
    boolean var10 = var0.tira((-1), 10);
    boolean var11 = var0.finito();
    boolean var12 = var0.finito();
    boolean var15 = var0.tira(10, (-1));
    boolean var18 = var0.tira(100, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
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

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test72");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var5 = var0.finito();
    boolean var8 = var0.tira(100, 0);
    boolean var9 = var0.finito();
    boolean var12 = var0.tira(0, 0);
    boolean var15 = var0.tira((-1), 100);
    boolean var16 = var0.finito();
    boolean var19 = var0.tira(10, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
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
    assertTrue(var19 == false);

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test73");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(1, 10);
    boolean var7 = var0.finito();
    boolean var8 = var0.finito();
    boolean var11 = var0.tira(10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test74");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var7 = var0.tira((-1), 1);
    boolean var8 = var0.finito();
    boolean var11 = var0.tira(1, 0);
    boolean var14 = var0.tira(10, 100);
    boolean var17 = var0.tira(1, (-1));
    boolean var20 = var0.tira(1, 10);
    
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
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test75");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var7 = var0.finito();
    boolean var10 = var0.tira((-1), 10);
    boolean var13 = var0.tira(100, 1);
    boolean var16 = var0.tira(100, 100);
    boolean var17 = var0.finito();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
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
    assertTrue(var17 == false);

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test76");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var9 = var0.tira(1, 10);
    boolean var12 = var0.tira(10, 1);
    boolean var15 = var0.tira(0, 100);
    
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

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test77");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira((-1), (-1));
    boolean var9 = var0.tira(0, 1);
    boolean var12 = var0.tira(1, 0);
    boolean var15 = var0.tira((-1), 100);
    boolean var16 = var0.finito();
    
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

  }

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test78");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira((-1), (-1));
    boolean var9 = var0.tira(0, 1);
    boolean var12 = var0.tira(1, 10);
    boolean var15 = var0.tira(100, 0);
    boolean var16 = var0.finito();
    
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

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test79");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var7 = var0.tira((-1), 1);
    boolean var8 = var0.finito();
    boolean var11 = var0.tira(1, 0);
    boolean var14 = var0.tira(10, 100);
    boolean var17 = var0.tira(0, 0);
    boolean var20 = var0.tira(10, 1);
    boolean var21 = var0.finito();
    
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
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test80");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var7 = var0.finito();
    boolean var10 = var0.tira(100, 100);
    boolean var11 = var0.finito();
    boolean var14 = var0.tira(1, 10);
    boolean var15 = var0.finito();
    boolean var18 = var0.tira(0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test81");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(1, 10);
    boolean var7 = var0.finito();
    boolean var10 = var0.tira(10, 1);
    boolean var13 = var0.tira(1, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test82");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var7 = var0.finito();
    boolean var10 = var0.tira(100, 100);
    boolean var11 = var0.finito();
    boolean var12 = var0.finito();
    boolean var13 = var0.finito();
    boolean var14 = var0.finito();
    boolean var17 = var0.tira(1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
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
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test83");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var7 = var0.finito();
    boolean var10 = var0.tira(100, 100);
    boolean var11 = var0.finito();
    boolean var12 = var0.finito();
    boolean var15 = var0.tira(0, 1);
    boolean var16 = var0.finito();
    boolean var17 = var0.finito();
    boolean var18 = var0.finito();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
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
    assertTrue(var18 == false);

  }

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test84");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira((-1), (-1));
    boolean var9 = var0.tira(100, 0);
    boolean var12 = var0.tira((-1), (-1));
    boolean var15 = var0.tira(10, (-1));
    boolean var18 = var0.tira(0, 10);
    boolean var19 = var0.finito();
    
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
    assertTrue(var19 == false);

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test85");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var5 = var0.finito();
    boolean var8 = var0.tira(100, 0);
    boolean var9 = var0.finito();
    boolean var12 = var0.tira(0, 0);
    boolean var15 = var0.tira(1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test86");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var7 = var0.tira((-1), 1);
    boolean var10 = var0.tira((-1), 10);
    boolean var11 = var0.finito();
    boolean var14 = var0.tira(10, 1);
    boolean var15 = var0.finito();
    
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
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test87");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira((-1), (-1));
    boolean var9 = var0.tira(0, 1);
    boolean var10 = var0.finito();
    boolean var13 = var0.tira(100, (-1));
    boolean var16 = var0.tira(100, 10);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test88");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var9 = var0.tira(0, 1);
    boolean var12 = var0.tira((-1), (-1));
    boolean var13 = var0.finito();
    boolean var16 = var0.tira(10, 0);
    boolean var17 = var0.finito();
    boolean var18 = var0.finito();
    boolean var19 = var0.finito();
    boolean var20 = var0.finito();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test89");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var7 = var0.tira((-1), 1);
    boolean var10 = var0.tira((-1), 10);
    boolean var13 = var0.tira(1, 100);
    
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

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test90");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var7 = var0.tira((-1), 1);
    boolean var8 = var0.finito();
    boolean var11 = var0.tira(1, 0);
    boolean var14 = var0.tira(10, 100);
    boolean var17 = var0.tira(10, 1);
    boolean var18 = var0.finito();
    boolean var19 = var0.finito();
    boolean var22 = var0.tira(1, 1);
    boolean var25 = var0.tira(1, 1);
    
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
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);

  }

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test91");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var7 = var0.tira((-1), 1);
    boolean var8 = var0.finito();
    boolean var11 = var0.tira(1, 0);
    boolean var14 = var0.tira((-1), 1);
    boolean var15 = var0.finito();
    boolean var16 = var0.finito();
    boolean var17 = var0.finito();
    boolean var20 = var0.tira(100, 100);
    boolean var23 = var0.tira(100, 100);
    
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

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test92");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(1, 10);
    boolean var7 = var0.finito();
    boolean var8 = var0.finito();
    boolean var9 = var0.finito();
    boolean var12 = var0.tira(100, 100);
    boolean var13 = var0.finito();
    boolean var16 = var0.tira(1, 0);
    boolean var17 = var0.finito();
    boolean var18 = var0.finito();
    boolean var21 = var0.tira(10, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
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
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test93");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira((-1), (-1));
    boolean var9 = var0.tira(0, 1);
    boolean var12 = var0.tira(10, 100);
    boolean var15 = var0.tira((-1), (-1));
    
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

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test94");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var7 = var0.finito();
    boolean var10 = var0.tira((-1), 10);
    boolean var11 = var0.finito();
    boolean var14 = var0.tira(100, 100);
    boolean var17 = var0.tira(1, 10);
    boolean var20 = var0.tira(1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test95");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var7 = var0.finito();
    boolean var10 = var0.tira(100, 100);
    boolean var11 = var0.finito();
    boolean var14 = var0.tira((-1), 100);
    boolean var17 = var0.tira(0, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test96");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var7 = var0.finito();
    boolean var10 = var0.tira((-1), 10);
    boolean var11 = var0.finito();
    boolean var14 = var0.tira(100, 100);
    boolean var15 = var0.finito();
    boolean var16 = var0.finito();
    boolean var17 = var0.finito();
    boolean var18 = var0.finito();
    boolean var19 = var0.finito();
    boolean var22 = var0.tira((-1), 10);
    boolean var23 = var0.finito();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
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
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test97");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var7 = var0.tira((-1), (-1));
    boolean var10 = var0.tira((-1), 100);
    boolean var13 = var0.tira(10, 0);
    boolean var16 = var0.tira(0, 0);
    boolean var19 = var0.tira((-1), 0);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test98");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(1, 10);
    boolean var7 = var0.finito();
    boolean var8 = var0.finito();
    boolean var9 = var0.finito();
    boolean var12 = var0.tira(100, 100);
    boolean var15 = var0.tira(100, 1);
    boolean var16 = var0.finito();
    boolean var19 = var0.tira(1, 10);
    boolean var22 = var0.tira(0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
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
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test99");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var9 = var0.tira(1, (-1));
    boolean var10 = var0.finito();
    boolean var13 = var0.tira(0, 0);
    boolean var16 = var0.tira((-1), 0);
    boolean var19 = var0.tira(1, 100);
    boolean var22 = var0.tira(1, 0);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test100");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var5 = var0.finito();
    boolean var8 = var0.tira(100, 0);
    boolean var9 = var0.finito();
    boolean var12 = var0.tira(0, 0);
    boolean var15 = var0.tira((-1), 100);
    boolean var16 = var0.finito();
    boolean var17 = var0.finito();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
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
    assertTrue(var17 == false);

  }

  public void test101() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test101");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var9 = var0.tira(0, 1);
    boolean var12 = var0.tira(100, 10);
    boolean var15 = var0.tira(0, 100);
    boolean var18 = var0.tira(10, 1);
    boolean var21 = var0.tira((-1), 100);
    boolean var24 = var0.tira(10, (-1));
    
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

  public void test102() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test102");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var7 = var0.tira((-1), 1);
    boolean var8 = var0.finito();
    boolean var11 = var0.tira(0, 100);
    boolean var12 = var0.finito();
    boolean var13 = var0.finito();
    boolean var16 = var0.tira(0, 0);
    
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
    assertTrue(var16 == false);

  }

  public void test103() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test103");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira(10, (-1));
    boolean var4 = var0.finito();
    boolean var7 = var0.tira(0, 0);
    boolean var8 = var0.finito();
    boolean var11 = var0.tira(1, 1);
    boolean var12 = var0.finito();
    boolean var15 = var0.tira(0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test104() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test104");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var7 = var0.tira((-1), 1);
    boolean var8 = var0.finito();
    boolean var11 = var0.tira(1, 0);
    boolean var12 = var0.finito();
    boolean var15 = var0.tira(1, (-1));
    boolean var18 = var0.tira(10, 1);
    
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
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test105() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test105");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira((-1), (-1));
    boolean var9 = var0.tira(0, 1);
    boolean var10 = var0.finito();
    boolean var13 = var0.tira(0, (-1));
    boolean var14 = var0.finito();
    boolean var15 = var0.finito();
    boolean var16 = var0.finito();
    boolean var19 = var0.tira(0, (-1));
    boolean var20 = var0.finito();
    boolean var21 = var0.finito();
    boolean var22 = var0.finito();
    boolean var25 = var0.tira(0, (-1));
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
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
    assertTrue(var25 == false);

  }

  public void test106() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test106");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(1, 10);
    boolean var9 = var0.tira(1, 100);
    boolean var12 = var0.tira(0, 0);
    boolean var13 = var0.finito();
    
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

  public void test107() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test107");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(1, 10);
    boolean var9 = var0.tira(1, 100);
    boolean var12 = var0.tira(10, 1);
    boolean var15 = var0.tira(100, 10);
    boolean var18 = var0.tira(10, 100);
    boolean var19 = var0.finito();
    
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
    assertTrue(var19 == false);

  }

  public void test108() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test108");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var9 = var0.tira(1, (-1));
    boolean var12 = var0.tira((-1), 1);
    boolean var13 = var0.finito();
    boolean var14 = var0.finito();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test109() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test109");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(1, 10);
    boolean var9 = var0.tira(1, 100);
    boolean var12 = var0.tira(0, 0);
    boolean var15 = var0.tira(100, 100);
    boolean var18 = var0.tira(100, 1);
    
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

  public void test110() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test110");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var7 = var0.finito();
    boolean var10 = var0.tira(100, 100);
    boolean var11 = var0.finito();
    boolean var12 = var0.finito();
    boolean var13 = var0.finito();
    boolean var14 = var0.finito();
    boolean var17 = var0.tira((-1), 1);
    boolean var20 = var0.tira(100, 0);
    boolean var23 = var0.tira(0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
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
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test111() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test111");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var7 = var0.tira((-1), 1);
    boolean var8 = var0.finito();
    boolean var11 = var0.tira(1, 0);
    boolean var14 = var0.tira((-1), 1);
    boolean var15 = var0.finito();
    boolean var18 = var0.tira((-1), (-1));
    
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
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test112() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test112");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var5 = var0.finito();
    boolean var8 = var0.tira(100, 0);
    boolean var9 = var0.finito();
    boolean var12 = var0.tira(100, 1);
    boolean var15 = var0.tira(1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test113() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test113");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var5 = var0.finito();
    boolean var8 = var0.tira(1, 100);
    boolean var9 = var0.finito();
    boolean var12 = var0.tira((-1), 1);
    boolean var15 = var0.tira((-1), 10);
    boolean var16 = var0.finito();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
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

  }

  public void test114() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test114");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira(10, (-1));
    boolean var4 = var0.finito();
    boolean var7 = var0.tira(0, 0);
    boolean var8 = var0.finito();
    boolean var9 = var0.finito();
    
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

  }

  public void test115() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test115");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var5 = var0.finito();
    boolean var6 = var0.finito();
    boolean var7 = var0.finito();
    boolean var10 = var0.tira((-1), (-1));
    boolean var13 = var0.tira(1, (-1));
    boolean var14 = var0.finito();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test116() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test116");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var9 = var0.tira(1, (-1));
    boolean var12 = var0.tira((-1), 1);
    boolean var13 = var0.finito();
    boolean var16 = var0.tira(0, (-1));
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test117() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test117");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira((-1), 10);
    boolean var9 = var0.tira(10, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test118() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test118");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var7 = var0.finito();
    boolean var8 = var0.finito();
    boolean var9 = var0.finito();
    boolean var12 = var0.tira((-1), 0);
    boolean var13 = var0.finito();
    boolean var14 = var0.finito();
    boolean var17 = var0.tira(10, 10);
    boolean var20 = var0.tira(10, (-1));
    boolean var21 = var0.finito();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
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
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test119() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test119");


    p.PariODispari var0 = new p.PariODispari();
    boolean var1 = var0.finito();
    boolean var4 = var0.tira(10, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test120() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test120");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var7 = var0.tira((-1), 1);
    boolean var10 = var0.tira((-1), 10);
    boolean var13 = var0.tira(100, 100);
    
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

  public void test121() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test121");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var7 = var0.finito();
    boolean var8 = var0.finito();
    boolean var11 = var0.tira(0, 1);
    boolean var12 = var0.finito();
    boolean var15 = var0.tira((-1), 1);
    boolean var16 = var0.finito();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test122() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test122");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira((-1), (-1));
    boolean var9 = var0.tira(0, 1);
    boolean var10 = var0.finito();
    boolean var11 = var0.finito();
    boolean var14 = var0.tira(100, 0);
    
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
    assertTrue(var14 == false);

  }

  public void test123() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test123");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var9 = var0.tira(0, 1);
    boolean var12 = var0.tira(1, 1);
    boolean var15 = var0.tira(100, 1);
    boolean var18 = var0.tira(10, 100);
    
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

  }

  public void test124() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test124");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var7 = var0.tira((-1), 1);
    boolean var8 = var0.finito();
    boolean var11 = var0.tira(1, 0);
    boolean var14 = var0.tira(10, 100);
    boolean var17 = var0.tira(10, 1);
    boolean var20 = var0.tira(1, 100);
    boolean var23 = var0.tira(0, 100);
    boolean var26 = var0.tira(10, (-1));
    
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
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test125() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test125");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var5 = var0.finito();
    boolean var8 = var0.tira(1, 100);
    boolean var11 = var0.tira(10, (-1));
    boolean var12 = var0.finito();
    boolean var13 = var0.finito();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
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

  }

  public void test126() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test126");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var5 = var0.finito();
    boolean var8 = var0.tira(1, 100);
    boolean var9 = var0.finito();
    boolean var12 = var0.tira((-1), 1);
    boolean var15 = var0.tira((-1), 10);
    boolean var18 = var0.tira(1, 100);
    boolean var19 = var0.finito();
    boolean var20 = var0.finito();
    boolean var23 = var0.tira(10, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
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
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test127() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test127");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(1, 10);
    boolean var9 = var0.tira(1, 100);
    boolean var12 = var0.tira(10, 1);
    boolean var15 = var0.tira(100, 10);
    boolean var18 = var0.tira(1, 0);
    
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

  public void test128() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test128");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(1, 10);
    boolean var9 = var0.tira(1, 100);
    boolean var10 = var0.finito();
    boolean var11 = var0.finito();
    boolean var12 = var0.finito();
    boolean var15 = var0.tira(0, 100);
    boolean var18 = var0.tira(10, (-1));
    boolean var21 = var0.tira((-1), 100);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test129() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test129");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var7 = var0.tira((-1), 1);
    boolean var10 = var0.tira((-1), 10);
    boolean var13 = var0.tira((-1), (-1));
    boolean var16 = var0.tira(0, (-1));
    boolean var19 = var0.tira((-1), 100);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test130() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test130");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var7 = var0.finito();
    boolean var10 = var0.tira((-1), 10);
    boolean var13 = var0.tira(100, 1);
    boolean var14 = var0.finito();
    boolean var17 = var0.tira(0, 100);
    boolean var18 = var0.finito();
    boolean var21 = var0.tira(0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test131() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test131");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var9 = var0.tira(0, 1);
    boolean var10 = var0.finito();
    boolean var13 = var0.tira(1, 100);
    boolean var16 = var0.tira(10, 1);
    boolean var17 = var0.finito();
    boolean var20 = var0.tira(100, (-1));
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test132() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test132");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira((-1), 10);
    boolean var7 = var0.finito();
    boolean var10 = var0.tira(0, (-1));
    boolean var13 = var0.tira((-1), (-1));
    boolean var16 = var0.tira(100, 10);
    boolean var17 = var0.finito();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
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
    assertTrue(var17 == false);

  }

  public void test133() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test133");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira((-1), 10);
    boolean var7 = var0.finito();
    boolean var8 = var0.finito();
    boolean var11 = var0.tira((-1), 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test134() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test134");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(1, 10);
    boolean var7 = var0.finito();
    boolean var10 = var0.tira(10, 1);
    boolean var11 = var0.finito();
    boolean var12 = var0.finito();
    boolean var13 = var0.finito();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
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

  }

  public void test135() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test135");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var7 = var0.finito();
    boolean var8 = var0.finito();
    boolean var9 = var0.finito();
    boolean var12 = var0.tira((-1), 0);
    boolean var13 = var0.finito();
    boolean var16 = var0.tira(10, 1);
    boolean var19 = var0.tira(1, 10);
    boolean var20 = var0.finito();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
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
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test136() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test136");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var9 = var0.tira(1, (-1));
    boolean var10 = var0.finito();
    boolean var13 = var0.tira(0, 0);
    boolean var16 = var0.tira((-1), 0);
    boolean var17 = var0.finito();
    boolean var20 = var0.tira((-1), 1);
    boolean var23 = var0.tira((-1), 1);
    boolean var26 = var0.tira((-1), 10);
    
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

  public void test137() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test137");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira((-1), (-1));
    boolean var9 = var0.tira(0, 1);
    boolean var10 = var0.finito();
    boolean var13 = var0.tira(0, (-1));
    boolean var14 = var0.finito();
    boolean var15 = var0.finito();
    boolean var18 = var0.tira(100, 1);
    boolean var19 = var0.finito();
    boolean var22 = var0.tira(1, 100);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test138() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test138");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira((-1), 10);
    boolean var7 = var0.finito();
    boolean var10 = var0.tira(0, (-1));
    boolean var13 = var0.tira((-1), (-1));
    boolean var16 = var0.tira(100, 10);
    boolean var19 = var0.tira(1, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
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

  }

  public void test139() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test139");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira((-1), (-1));
    boolean var9 = var0.tira(0, 1);
    boolean var12 = var0.tira(1, 0);
    boolean var13 = var0.finito();
    boolean var14 = var0.finito();
    boolean var15 = var0.finito();
    boolean var18 = var0.tira(10, 0);
    boolean var21 = var0.tira(1, 0);
    boolean var24 = var0.tira(10, 0);
    boolean var25 = var0.finito();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test140() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test140");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var7 = var0.finito();
    boolean var10 = var0.tira((-1), 10);
    boolean var13 = var0.tira(100, 1);
    boolean var16 = var0.tira(1, (-1));
    boolean var17 = var0.finito();
    boolean var18 = var0.finito();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
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
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test141() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test141");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(1, 10);
    boolean var7 = var0.finito();
    boolean var8 = var0.finito();
    boolean var9 = var0.finito();
    boolean var12 = var0.tira(100, 100);
    boolean var13 = var0.finito();
    boolean var14 = var0.finito();
    boolean var17 = var0.tira(100, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
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
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test142() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test142");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(1, 10);
    boolean var7 = var0.finito();
    boolean var8 = var0.finito();
    boolean var9 = var0.finito();
    boolean var12 = var0.tira(100, 100);
    boolean var15 = var0.tira(100, 1);
    boolean var16 = var0.finito();
    boolean var19 = var0.tira(100, 10);
    boolean var20 = var0.finito();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
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
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test143() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test143");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var7 = var0.finito();
    boolean var8 = var0.finito();
    boolean var9 = var0.finito();
    boolean var12 = var0.tira((-1), 0);
    boolean var13 = var0.finito();
    boolean var16 = var0.tira(10, 1);
    boolean var17 = var0.finito();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
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
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test144() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test144");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var7 = var0.tira((-1), 1);
    boolean var8 = var0.finito();
    boolean var11 = var0.tira(1, 0);
    boolean var14 = var0.tira(10, 100);
    boolean var17 = var0.tira(100, (-1));
    boolean var20 = var0.tira(10, (-1));
    
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
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test145() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test145");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var9 = var0.tira(0, 1);
    boolean var10 = var0.finito();
    boolean var13 = var0.tira(1, 100);
    boolean var16 = var0.tira(10, 1);
    boolean var17 = var0.finito();
    boolean var18 = var0.finito();
    boolean var19 = var0.finito();
    boolean var22 = var0.tira(10, 10);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test146() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test146");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira((-1), (-1));
    boolean var9 = var0.tira(0, 1);
    boolean var12 = var0.tira(1, 10);
    boolean var15 = var0.tira(1, 0);
    boolean var18 = var0.tira(10, 1);
    boolean var21 = var0.tira(0, 10);
    boolean var22 = var0.finito();
    boolean var23 = var0.finito();
    boolean var26 = var0.tira(0, 0);
    boolean var27 = var0.finito();
    
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
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test147() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test147");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var7 = var0.tira((-1), 1);
    boolean var8 = var0.finito();
    boolean var11 = var0.tira(1, 0);
    boolean var14 = var0.tira(10, 100);
    boolean var17 = var0.tira(0, 0);
    boolean var20 = var0.tira(10, (-1));
    
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
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test148() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test148");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var9 = var0.tira(0, 1);
    boolean var12 = var0.tira((-1), (-1));
    boolean var15 = var0.tira(0, (-1));
    boolean var18 = var0.tira(0, 0);
    boolean var21 = var0.tira(10, (-1));
    
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

  }

  public void test149() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test149");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var7 = var0.tira((-1), 1);
    boolean var8 = var0.finito();
    boolean var9 = var0.finito();
    boolean var10 = var0.finito();
    
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

  }

  public void test150() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test150");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var9 = var0.tira(0, 100);
    boolean var10 = var0.finito();
    boolean var11 = var0.finito();
    
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

  public void test151() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test151");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var7 = var0.tira((-1), 1);
    boolean var10 = var0.tira(1, 1);
    boolean var13 = var0.tira(10, 100);
    boolean var16 = var0.tira(1, 1);
    boolean var17 = var0.finito();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test152() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test152");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira((-1), (-1));
    boolean var9 = var0.tira(0, 1);
    boolean var12 = var0.tira(10, 100);
    boolean var15 = var0.tira(100, 1);
    boolean var16 = var0.finito();
    
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

  }

  public void test153() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test153");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var7 = var0.finito();
    boolean var10 = var0.tira(100, 100);
    boolean var11 = var0.finito();
    boolean var12 = var0.finito();
    boolean var13 = var0.finito();
    boolean var14 = var0.finito();
    boolean var17 = var0.tira((-1), 1);
    boolean var20 = var0.tira(10, (-1));
    boolean var21 = var0.finito();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
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
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test154() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test154");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(1, 10);
    boolean var7 = var0.finito();
    boolean var10 = var0.tira((-1), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test155() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test155");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var7 = var0.finito();
    boolean var10 = var0.tira(100, 100);
    boolean var13 = var0.tira((-1), 100);
    boolean var14 = var0.finito();
    boolean var17 = var0.tira((-1), 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test156() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test156");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var7 = var0.tira((-1), 1);
    boolean var8 = var0.finito();
    boolean var11 = var0.tira(0, 100);
    boolean var12 = var0.finito();
    boolean var13 = var0.finito();
    boolean var16 = var0.tira(10, 10);
    
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
    assertTrue(var16 == false);

  }

  public void test157() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test157");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var7 = var0.tira((-1), 1);
    boolean var8 = var0.finito();
    boolean var11 = var0.tira(1, 0);
    boolean var14 = var0.tira((-1), 1);
    boolean var17 = var0.tira((-1), 100);
    boolean var18 = var0.finito();
    
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
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test158() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test158");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var7 = var0.tira((-1), 1);
    boolean var8 = var0.finito();
    boolean var11 = var0.tira(1, 0);
    boolean var14 = var0.tira(10, 100);
    boolean var17 = var0.tira(10, 1);
    boolean var20 = var0.tira(1, 100);
    boolean var21 = var0.finito();
    
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
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test159() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test159");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var5 = var0.finito();
    boolean var8 = var0.tira(100, 0);
    boolean var9 = var0.finito();
    boolean var12 = var0.tira(100, 1);
    boolean var13 = var0.finito();
    boolean var14 = var0.finito();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test160() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test160");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(1, 10);
    boolean var7 = var0.finito();
    boolean var8 = var0.finito();
    boolean var9 = var0.finito();
    boolean var12 = var0.tira(1, 100);
    boolean var15 = var0.tira(100, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
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
    assertTrue(var15 == false);

  }

  public void test161() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test161");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var9 = var0.tira(100, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test162() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test162");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var7 = var0.tira((-1), 1);
    boolean var8 = var0.finito();
    boolean var11 = var0.tira(1, 0);
    boolean var14 = var0.tira(10, 100);
    boolean var17 = var0.tira(0, 0);
    boolean var20 = var0.tira(1, 10);
    boolean var21 = var0.finito();
    
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
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test163() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test163");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var7 = var0.finito();
    boolean var10 = var0.tira((-1), 10);
    boolean var11 = var0.finito();
    boolean var14 = var0.tira(100, 100);
    boolean var17 = var0.tira(1, (-1));
    boolean var20 = var0.tira(10, 1);
    boolean var21 = var0.finito();
    boolean var22 = var0.finito();
    boolean var23 = var0.finito();
    boolean var24 = var0.finito();
    boolean var27 = var0.tira(100, 10);
    boolean var30 = var0.tira(10, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);

  }

  public void test164() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test164");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var9 = var0.tira(0, 1);
    boolean var12 = var0.tira((-1), (-1));
    boolean var13 = var0.finito();
    boolean var16 = var0.tira((-1), 1);
    boolean var17 = var0.finito();
    boolean var20 = var0.tira(1, 10);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test165() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test165");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var5 = var0.finito();
    boolean var8 = var0.tira(1, 100);
    boolean var9 = var0.finito();
    boolean var12 = var0.tira(10, 0);
    boolean var13 = var0.finito();
    boolean var16 = var0.tira(1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test166() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test166");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira((-1), (-1));
    boolean var9 = var0.tira(0, 10);
    boolean var10 = var0.finito();
    boolean var11 = var0.finito();
    boolean var14 = var0.tira(10, 0);
    boolean var17 = var0.tira(100, (-1));
    boolean var18 = var0.finito();
    
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
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test167() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test167");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var9 = var0.tira(0, 100);
    boolean var10 = var0.finito();
    boolean var13 = var0.tira(100, (-1));
    
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

  public void test168() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test168");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(1, 10);
    boolean var7 = var0.finito();
    boolean var10 = var0.tira(0, 10);
    boolean var13 = var0.tira(100, (-1));
    boolean var16 = var0.tira(10, 0);
    boolean var17 = var0.finito();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
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
    assertTrue(var17 == false);

  }

  public void test169() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test169");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(1, 10);
    boolean var9 = var0.tira(1, 100);
    boolean var12 = var0.tira(10, 1);
    boolean var15 = var0.tira(100, 10);
    boolean var18 = var0.tira(1, (-1));
    
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

  public void test170() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test170");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira((-1), (-1));
    boolean var9 = var0.tira(0, 1);
    boolean var12 = var0.tira(1, 10);
    boolean var15 = var0.tira(1, 0);
    boolean var18 = var0.tira(10, 1);
    boolean var21 = var0.tira(0, (-1));
    boolean var24 = var0.tira(10, 0);
    boolean var27 = var0.tira(0, (-1));
    
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

  public void test171() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test171");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var9 = var0.tira(0, 1);
    boolean var12 = var0.tira(1, 1);
    boolean var15 = var0.tira(100, 1);
    boolean var18 = var0.tira(0, 0);
    boolean var19 = var0.finito();
    boolean var22 = var0.tira(1, 10);
    
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
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test172() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test172");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(1, 10);
    boolean var7 = var0.finito();
    boolean var8 = var0.finito();
    boolean var9 = var0.finito();
    boolean var12 = var0.tira(100, 100);
    boolean var13 = var0.finito();
    boolean var14 = var0.finito();
    boolean var15 = var0.finito();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
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
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test173() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test173");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var7 = var0.finito();
    boolean var10 = var0.tira((-1), 10);
    boolean var11 = var0.finito();
    boolean var14 = var0.tira(100, 100);
    boolean var17 = var0.tira(1, 10);
    boolean var18 = var0.finito();
    boolean var21 = var0.tira(10, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test174() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test174");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira(10, (-1));
    boolean var4 = var0.finito();
    boolean var5 = var0.finito();
    boolean var6 = var0.finito();
    boolean var7 = var0.finito();
    boolean var10 = var0.tira(10, 10);
    boolean var11 = var0.finito();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test175() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test175");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var9 = var0.tira(0, 1);
    boolean var10 = var0.finito();
    boolean var13 = var0.tira(1, 100);
    boolean var14 = var0.finito();
    boolean var15 = var0.finito();
    boolean var16 = var0.finito();
    boolean var19 = var0.tira(100, (-1));
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test176() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test176");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira(10, (-1));
    boolean var4 = var0.finito();
    boolean var7 = var0.tira(0, 0);
    boolean var8 = var0.finito();
    boolean var11 = var0.tira(1, 1);
    boolean var14 = var0.tira((-1), 100);
    boolean var15 = var0.finito();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test177() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test177");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var7 = var0.tira((-1), 1);
    boolean var8 = var0.finito();
    boolean var11 = var0.tira(1, 0);
    boolean var14 = var0.tira(10, 100);
    boolean var15 = var0.finito();
    
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
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test178() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test178");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var7 = var0.finito();
    boolean var10 = var0.tira((-1), 10);
    boolean var11 = var0.finito();
    boolean var12 = var0.finito();
    boolean var15 = var0.tira(10, 0);
    boolean var16 = var0.finito();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
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

  }

  public void test179() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test179");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var9 = var0.tira(0, 1);
    boolean var10 = var0.finito();
    boolean var13 = var0.tira(1, 100);
    boolean var14 = var0.finito();
    boolean var15 = var0.finito();
    boolean var18 = var0.tira(1, 100);
    boolean var19 = var0.finito();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test180() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test180");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(1, 10);
    boolean var7 = var0.finito();
    boolean var8 = var0.finito();
    boolean var9 = var0.finito();
    boolean var10 = var0.finito();
    boolean var13 = var0.tira(10, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test181() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test181");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var7 = var0.tira((-1), 1);
    boolean var8 = var0.finito();
    boolean var11 = var0.tira(1, 0);
    boolean var14 = var0.tira(10, 100);
    boolean var17 = var0.tira(100, (-1));
    boolean var18 = var0.finito();
    boolean var21 = var0.tira(100, (-1));
    boolean var22 = var0.finito();
    
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
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test182() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test182");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var7 = var0.finito();
    boolean var10 = var0.tira((-1), 10);
    boolean var11 = var0.finito();
    boolean var14 = var0.tira(100, 100);
    boolean var17 = var0.tira(1, 10);
    boolean var20 = var0.tira(10, 0);
    boolean var21 = var0.finito();
    boolean var22 = var0.finito();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test183() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test183");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira((-1), (-1));
    boolean var9 = var0.tira(100, 0);
    boolean var12 = var0.tira((-1), (-1));
    boolean var15 = var0.tira(10, 10);
    boolean var18 = var0.tira((-1), 100);
    
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

  public void test184() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test184");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(1, 10);
    boolean var7 = var0.finito();
    boolean var8 = var0.finito();
    boolean var9 = var0.finito();
    boolean var12 = var0.tira(100, 100);
    boolean var13 = var0.finito();
    boolean var16 = var0.tira(1, 0);
    boolean var17 = var0.finito();
    boolean var18 = var0.finito();
    boolean var19 = var0.finito();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
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
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test185() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test185");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var9 = var0.tira(0, 1);
    boolean var12 = var0.tira(100, 10);
    boolean var15 = var0.tira(0, 100);
    boolean var16 = var0.finito();
    boolean var19 = var0.tira((-1), 100);
    boolean var20 = var0.finito();
    boolean var21 = var0.finito();
    
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
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test186() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test186");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira(10, (-1));
    boolean var4 = var0.finito();
    boolean var5 = var0.finito();
    boolean var8 = var0.tira(100, 100);
    boolean var9 = var0.finito();
    boolean var10 = var0.finito();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test187() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test187");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(1, 10);
    boolean var7 = var0.finito();
    boolean var8 = var0.finito();
    boolean var9 = var0.finito();
    boolean var10 = var0.finito();
    boolean var13 = var0.tira(1, 1);
    boolean var14 = var0.finito();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test188() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test188");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var9 = var0.tira(0, 1);
    boolean var12 = var0.tira((-1), (-1));
    boolean var15 = var0.tira(0, (-1));
    boolean var18 = var0.tira(0, 1);
    
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

  public void test189() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test189");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(1, 10);
    boolean var9 = var0.tira(1, 100);
    boolean var12 = var0.tira(10, 1);
    boolean var13 = var0.finito();
    boolean var16 = var0.tira(100, 0);
    boolean var17 = var0.finito();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test190() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test190");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var7 = var0.finito();
    boolean var10 = var0.tira(100, 100);
    boolean var11 = var0.finito();
    boolean var12 = var0.finito();
    boolean var13 = var0.finito();
    boolean var14 = var0.finito();
    boolean var15 = var0.finito();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
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
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test191() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test191");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var9 = var0.tira(0, 1);
    boolean var10 = var0.finito();
    boolean var13 = var0.tira(10, 0);
    
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

  public void test192() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test192");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var5 = var0.finito();
    boolean var6 = var0.finito();
    boolean var7 = var0.finito();
    boolean var10 = var0.tira(1, 10);
    boolean var11 = var0.finito();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test193() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test193");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var7 = var0.tira((-1), 1);
    boolean var10 = var0.tira(1, 1);
    boolean var13 = var0.tira(10, (-1));
    boolean var14 = var0.finito();
    boolean var15 = var0.finito();
    boolean var16 = var0.finito();
    boolean var17 = var0.finito();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
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

  }

  public void test194() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test194");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var7 = var0.finito();
    boolean var10 = var0.tira(100, 100);
    boolean var11 = var0.finito();
    boolean var14 = var0.tira(10, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test195() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test195");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var5 = var0.finito();
    boolean var8 = var0.tira(10, 10);
    boolean var11 = var0.tira((-1), 10);
    boolean var12 = var0.finito();
    boolean var15 = var0.tira((-1), 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
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

  public void test196() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test196");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var7 = var0.finito();
    boolean var10 = var0.tira((-1), 10);
    boolean var13 = var0.tira(100, 1);
    boolean var14 = var0.finito();
    boolean var17 = var0.tira(0, 100);
    boolean var20 = var0.tira(1, 1);
    boolean var23 = var0.tira(10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test197() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test197");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira((-1), (-1));
    boolean var9 = var0.tira(0, 1);
    boolean var12 = var0.tira(1, 0);
    boolean var13 = var0.finito();
    boolean var16 = var0.tira(100, 1);
    boolean var17 = var0.finito();
    boolean var20 = var0.tira(0, 10);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test198() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test198");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var7 = var0.finito();
    boolean var10 = var0.tira(100, 100);
    boolean var11 = var0.finito();
    boolean var14 = var0.tira(1, 10);
    boolean var17 = var0.tira(1, 10);
    boolean var20 = var0.tira(1, 100);
    boolean var23 = var0.tira(0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
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

  public void test199() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test199");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(1, 10);
    boolean var9 = var0.tira(1, 100);
    boolean var10 = var0.finito();
    boolean var11 = var0.finito();
    boolean var12 = var0.finito();
    boolean var15 = var0.tira(1, 10);
    boolean var16 = var0.finito();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test200() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test200");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var9 = var0.tira(0, 1);
    boolean var12 = var0.tira(1, 1);
    boolean var15 = var0.tira(100, 1);
    boolean var18 = var0.tira(0, 0);
    boolean var19 = var0.finito();
    boolean var20 = var0.finito();
    
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
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test201() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test201");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira((-1), (-1));
    boolean var9 = var0.tira(0, 1);
    boolean var10 = var0.finito();
    boolean var13 = var0.tira(0, (-1));
    boolean var14 = var0.finito();
    boolean var17 = var0.tira(0, 100);
    boolean var20 = var0.tira(10, 0);
    boolean var23 = var0.tira(1, 1);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);

  }

  public void test202() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test202");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira((-1), (-1));
    boolean var9 = var0.tira(0, 1);
    boolean var12 = var0.tira(1, 10);
    boolean var15 = var0.tira(1, 0);
    boolean var18 = var0.tira(10, 1);
    boolean var21 = var0.tira(0, 10);
    boolean var22 = var0.finito();
    boolean var25 = var0.tira((-1), 100);
    boolean var28 = var0.tira(0, (-1));
    boolean var31 = var0.tira(100, 0);
    boolean var32 = var0.finito();
    boolean var35 = var0.tira((-1), 1);
    
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
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);

  }

  public void test203() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test203");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var7 = var0.finito();
    boolean var8 = var0.finito();
    boolean var9 = var0.finito();
    boolean var10 = var0.finito();
    boolean var11 = var0.finito();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
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

  }

  public void test204() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test204");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var9 = var0.tira(0, 1);
    boolean var12 = var0.tira((-1), (-1));
    boolean var13 = var0.finito();
    boolean var16 = var0.tira((-1), 1);
    boolean var17 = var0.finito();
    boolean var20 = var0.tira(100, 100);
    boolean var21 = var0.finito();
    boolean var22 = var0.finito();
    
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

  }

  public void test205() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test205");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var9 = var0.tira(0, 1);
    boolean var12 = var0.tira(100, 10);
    boolean var15 = var0.tira(100, 10);
    boolean var16 = var0.finito();
    
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

  }

  public void test206() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test206");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var7 = var0.finito();
    boolean var10 = var0.tira((-1), 10);
    boolean var11 = var0.finito();
    boolean var12 = var0.finito();
    boolean var15 = var0.tira(10, 0);
    boolean var18 = var0.tira((-1), (-1));
    boolean var21 = var0.tira((-1), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
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
    assertTrue(var21 == false);

  }

  public void test207() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test207");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var7 = var0.finito();
    boolean var10 = var0.tira((-1), 10);
    boolean var11 = var0.finito();
    boolean var12 = var0.finito();
    boolean var13 = var0.finito();
    boolean var14 = var0.finito();
    boolean var17 = var0.tira((-1), (-1));
    boolean var20 = var0.tira(0, 1);
    boolean var23 = var0.tira(10, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
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
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test208() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test208");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira((-1), (-1));
    boolean var7 = var0.finito();
    boolean var8 = var0.finito();
    boolean var9 = var0.finito();
    boolean var12 = var0.tira(1, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
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

  }

  public void test209() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test209");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var7 = var0.finito();
    boolean var10 = var0.tira((-1), 10);
    boolean var13 = var0.tira(100, 1);
    boolean var14 = var0.finito();
    boolean var17 = var0.tira(0, 100);
    boolean var20 = var0.tira(100, 0);
    boolean var21 = var0.finito();
    boolean var24 = var0.tira(0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test210() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test210");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira((-1), (-1));
    boolean var9 = var0.tira(0, 1);
    boolean var12 = var0.tira(1, 0);
    boolean var13 = var0.finito();
    boolean var16 = var0.tira(100, 1);
    boolean var19 = var0.tira(0, (-1));
    boolean var20 = var0.finito();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test211() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test211");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var9 = var0.tira(0, 1);
    boolean var12 = var0.tira((-1), (-1));
    boolean var15 = var0.tira(0, (-1));
    boolean var16 = var0.finito();
    
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

  }

  public void test212() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test212");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(1, 10);
    boolean var7 = var0.finito();
    boolean var10 = var0.tira(0, 10);
    boolean var13 = var0.tira(100, (-1));
    boolean var14 = var0.finito();
    boolean var15 = var0.finito();
    boolean var16 = var0.finito();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test213() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test213");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(1, 10);
    boolean var9 = var0.tira(1, 100);
    boolean var10 = var0.finito();
    boolean var11 = var0.finito();
    boolean var14 = var0.tira(100, 100);
    boolean var15 = var0.finito();
    
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
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test214() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test214");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira((-1), (-1));
    boolean var9 = var0.tira(0, 1);
    boolean var12 = var0.tira(1, 10);
    boolean var15 = var0.tira(1, 0);
    boolean var16 = var0.finito();
    boolean var19 = var0.tira(1, 0);
    boolean var22 = var0.tira(0, 1);
    boolean var25 = var0.tira(1, 10);
    boolean var26 = var0.finito();
    
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
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test215() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test215");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var7 = var0.finito();
    boolean var10 = var0.tira(100, 100);
    boolean var11 = var0.finito();
    boolean var12 = var0.finito();
    boolean var13 = var0.finito();
    boolean var14 = var0.finito();
    boolean var17 = var0.tira((-1), 1);
    boolean var20 = var0.tira(100, 0);
    boolean var23 = var0.tira(0, 10);
    boolean var26 = var0.tira(0, 0);
    boolean var27 = var0.finito();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
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

  }

  public void test216() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test216");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var7 = var0.tira((-1), 1);
    boolean var8 = var0.finito();
    boolean var11 = var0.tira(0, 100);
    boolean var14 = var0.tira((-1), (-1));
    
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
    assertTrue(var14 == false);

  }

  public void test217() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test217");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var7 = var0.tira((-1), 1);
    boolean var10 = var0.tira(1, 1);
    boolean var13 = var0.tira(1, (-1));
    boolean var16 = var0.tira(0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test218() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test218");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira((-1), (-1));
    boolean var9 = var0.tira(0, 1);
    boolean var12 = var0.tira(1, 10);
    boolean var15 = var0.tira(1, 0);
    boolean var18 = var0.tira(10, 1);
    boolean var21 = var0.tira(0, 10);
    boolean var22 = var0.finito();
    boolean var25 = var0.tira((-1), 100);
    boolean var26 = var0.finito();
    boolean var29 = var0.tira(100, 10);
    
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
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test219() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test219");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira((-1), (-1));
    boolean var9 = var0.tira(0, 1);
    boolean var12 = var0.tira((-1), 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test220() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test220");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var7 = var0.tira((-1), 1);
    boolean var10 = var0.tira(1, 1);
    boolean var13 = var0.tira(1, (-1));
    boolean var14 = var0.finito();
    boolean var15 = var0.finito();
    boolean var18 = var0.tira((-1), 1);
    boolean var21 = var0.tira(10, (-1));
    boolean var22 = var0.finito();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
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

  }

  public void test221() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test221");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var5 = var0.finito();
    boolean var8 = var0.tira(1, 100);
    boolean var9 = var0.finito();
    boolean var12 = var0.tira((-1), 1);
    boolean var15 = var0.tira((-1), 10);
    boolean var18 = var0.tira(1, 100);
    boolean var21 = var0.tira(0, 10);
    boolean var22 = var0.finito();
    boolean var25 = var0.tira((-1), (-1));
    boolean var26 = var0.finito();
    boolean var29 = var0.tira(10, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
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

  public void test222() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test222");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var9 = var0.tira(0, 1);
    boolean var12 = var0.tira(1, 1);
    boolean var15 = var0.tira(100, 1);
    boolean var18 = var0.tira(0, 0);
    boolean var21 = var0.tira(100, 100);
    boolean var24 = var0.tira((-1), (-1));
    boolean var27 = var0.tira(10, 100);
    
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
    assertTrue(var27 == false);

  }

  public void test223() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test223");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var7 = var0.finito();
    boolean var10 = var0.tira(10, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test224() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test224");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira((-1), (-1));
    boolean var9 = var0.tira(0, 1);
    boolean var10 = var0.finito();
    boolean var13 = var0.tira(0, (-1));
    boolean var14 = var0.finito();
    boolean var15 = var0.finito();
    boolean var16 = var0.finito();
    boolean var17 = var0.finito();
    boolean var18 = var0.finito();
    boolean var21 = var0.tira(1, 0);
    
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

  public void test225() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test225");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(1, 10);
    boolean var7 = var0.finito();
    boolean var10 = var0.tira(10, 10);
    boolean var13 = var0.tira(0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test226() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test226");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var7 = var0.tira((-1), 1);
    boolean var10 = var0.tira(1, 1);
    boolean var13 = var0.tira(10, (-1));
    boolean var14 = var0.finito();
    boolean var17 = var0.tira(10, 100);
    boolean var20 = var0.tira(10, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test227() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test227");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var5 = var0.finito();
    boolean var8 = var0.tira(1, 100);
    boolean var9 = var0.finito();
    boolean var12 = var0.tira((-1), 1);
    boolean var15 = var0.tira(0, 0);
    boolean var18 = var0.tira(100, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
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

  }

  public void test228() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test228");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira(10, (-1));
    boolean var4 = var0.finito();
    boolean var5 = var0.finito();
    boolean var8 = var0.tira(100, (-1));
    boolean var9 = var0.finito();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test229() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test229");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var7 = var0.finito();
    boolean var10 = var0.tira((-1), 10);
    boolean var13 = var0.tira(100, 1);
    boolean var16 = var0.tira(1, (-1));
    boolean var17 = var0.finito();
    boolean var20 = var0.tira(1, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
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
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test230() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test230");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira((-1), (-1));
    boolean var9 = var0.tira(100, 0);
    boolean var12 = var0.tira((-1), (-1));
    boolean var15 = var0.tira(10, 10);
    boolean var18 = var0.tira(0, 10);
    boolean var21 = var0.tira((-1), 10);
    
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

  }

  public void test231() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test231");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var9 = var0.tira(0, 1);
    boolean var12 = var0.tira((-1), (-1));
    boolean var13 = var0.finito();
    boolean var14 = var0.finito();
    boolean var17 = var0.tira(0, 0);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test232() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test232");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira((-1), (-1));
    boolean var9 = var0.tira(0, 1);
    boolean var12 = var0.tira(1, 10);
    boolean var15 = var0.tira(1, 0);
    boolean var16 = var0.finito();
    boolean var19 = var0.tira(1, 1);
    
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
    assertTrue(var19 == true);

  }

  public void test233() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test233");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(1, 10);
    boolean var7 = var0.finito();
    boolean var8 = var0.finito();
    boolean var9 = var0.finito();
    boolean var10 = var0.finito();
    boolean var11 = var0.finito();
    boolean var14 = var0.tira(1, (-1));
    boolean var17 = var0.tira(0, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
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
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test234() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test234");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(1, 10);
    boolean var9 = var0.tira(1, 100);
    boolean var10 = var0.finito();
    boolean var11 = var0.finito();
    boolean var14 = var0.tira(10, 0);
    
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
    assertTrue(var14 == false);

  }

  public void test235() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test235");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira((-1), 10);
    boolean var7 = var0.finito();
    boolean var10 = var0.tira(0, (-1));
    boolean var13 = var0.tira((-1), (-1));
    boolean var16 = var0.tira(100, 10);
    boolean var19 = var0.tira(1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
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
    assertTrue(var19 == true);

  }

  public void test236() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test236");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(1, 10);
    boolean var7 = var0.finito();
    boolean var8 = var0.finito();
    boolean var9 = var0.finito();
    boolean var10 = var0.finito();
    boolean var11 = var0.finito();
    boolean var14 = var0.tira(1, (-1));
    boolean var17 = var0.tira(100, 0);
    boolean var20 = var0.tira(10, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
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
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test237() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test237");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira((-1), (-1));
    boolean var9 = var0.tira(100, 0);
    boolean var12 = var0.tira((-1), (-1));
    boolean var15 = var0.tira(10, 10);
    boolean var18 = var0.tira(0, 10);
    boolean var21 = var0.tira(100, 10);
    
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

  }

  public void test238() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test238");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var7 = var0.tira((-1), 1);
    boolean var10 = var0.tira(1, 1);
    boolean var13 = var0.tira((-1), 0);
    boolean var16 = var0.tira(1, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test239() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test239");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(1, 10);
    boolean var7 = var0.finito();
    boolean var8 = var0.finito();
    boolean var9 = var0.finito();
    boolean var10 = var0.finito();
    boolean var11 = var0.finito();
    boolean var14 = var0.tira(100, 0);
    boolean var17 = var0.tira(100, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
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
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test240() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test240");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var9 = var0.tira(0, 1);
    boolean var10 = var0.finito();
    boolean var11 = var0.finito();
    boolean var14 = var0.tira(1, 0);
    
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
    assertTrue(var14 == false);

  }

  public void test241() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test241");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira((-1), (-1));
    boolean var9 = var0.tira(0, 1);
    boolean var10 = var0.finito();
    boolean var13 = var0.tira(100, 100);
    boolean var14 = var0.finito();
    boolean var17 = var0.tira((-1), 10);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test242() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test242");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var5 = var0.finito();
    boolean var8 = var0.tira(1, 100);
    boolean var9 = var0.finito();
    boolean var10 = var0.finito();
    boolean var11 = var0.finito();
    boolean var12 = var0.finito();
    boolean var15 = var0.tira(10, 1);
    boolean var16 = var0.finito();
    boolean var19 = var0.tira((-1), (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
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

  public void test243() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test243");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(1, 10);
    boolean var9 = var0.tira(1, 100);
    boolean var10 = var0.finito();
    boolean var13 = var0.tira(10, (-1));
    boolean var16 = var0.tira((-1), 0);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test244() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test244");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira(1, 10);
    boolean var6 = var0.tira((-1), 10);
    boolean var7 = var0.finito();
    boolean var10 = var0.tira((-1), 0);
    boolean var11 = var0.finito();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test245() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test245");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var7 = var0.finito();
    boolean var10 = var0.tira((-1), 10);
    boolean var11 = var0.finito();
    boolean var12 = var0.finito();
    boolean var13 = var0.finito();
    boolean var16 = var0.tira(10, 10);
    boolean var17 = var0.finito();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
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
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test246() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test246");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var7 = var0.tira((-1), 1);
    boolean var10 = var0.tira(1, 1);
    boolean var13 = var0.tira(1, (-1));
    boolean var14 = var0.finito();
    boolean var15 = var0.finito();
    boolean var18 = var0.tira((-1), 1);
    boolean var19 = var0.finito();
    boolean var22 = var0.tira(0, 0);
    boolean var23 = var0.finito();
    boolean var24 = var0.finito();
    boolean var25 = var0.finito();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
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
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test247() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test247");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var5 = var0.finito();
    boolean var8 = var0.tira(1, 100);
    boolean var11 = var0.tira(10, (-1));
    boolean var12 = var0.finito();
    boolean var15 = var0.tira(100, 10);
    boolean var16 = var0.finito();
    boolean var17 = var0.finito();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
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

  }

  public void test248() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test248");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var9 = var0.tira(0, 1);
    boolean var12 = var0.tira(100, 10);
    boolean var15 = var0.tira(0, 100);
    boolean var18 = var0.tira(10, 1);
    boolean var21 = var0.tira((-1), 100);
    boolean var22 = var0.finito();
    boolean var23 = var0.finito();
    boolean var24 = var0.finito();
    boolean var27 = var0.tira(100, (-1));
    
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
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test249() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test249");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var5 = var0.finito();
    boolean var8 = var0.tira(1, 100);
    boolean var9 = var0.finito();
    boolean var12 = var0.tira((-1), 1);
    boolean var15 = var0.tira(100, 10);
    boolean var18 = var0.tira(0, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
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

  }

  public void test250() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test250");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(1, 10);
    boolean var7 = var0.finito();
    boolean var8 = var0.finito();
    boolean var9 = var0.finito();
    boolean var10 = var0.finito();
    boolean var11 = var0.finito();
    boolean var14 = var0.tira(1, (-1));
    boolean var17 = var0.tira(100, 0);
    boolean var18 = var0.finito();
    boolean var19 = var0.finito();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
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
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test251() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test251");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var9 = var0.tira(0, 1);
    boolean var12 = var0.tira(100, 10);
    boolean var15 = var0.tira(0, 100);
    boolean var18 = var0.tira(10, 1);
    boolean var21 = var0.tira(0, 0);
    boolean var22 = var0.finito();
    boolean var23 = var0.finito();
    boolean var26 = var0.tira(10, 0);
    boolean var27 = var0.finito();
    
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
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test252() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test252");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var7 = var0.tira((-1), 1);
    boolean var8 = var0.finito();
    boolean var11 = var0.tira(1, 0);
    boolean var14 = var0.tira(10, 100);
    boolean var17 = var0.tira(0, 0);
    boolean var20 = var0.tira(0, (-1));
    
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
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test253() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test253");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var5 = var0.finito();
    boolean var8 = var0.tira(1, 100);
    boolean var11 = var0.tira(10, (-1));
    boolean var14 = var0.tira(10, 10);
    boolean var17 = var0.tira(100, (-1));
    boolean var20 = var0.tira(0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
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

  }

  public void test254() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test254");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var7 = var0.tira((-1), 1);
    boolean var10 = var0.tira(1, 1);
    boolean var11 = var0.finito();
    boolean var14 = var0.tira(10, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test255() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test255");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira(10, (-1));
    boolean var4 = var0.finito();
    boolean var5 = var0.finito();
    boolean var8 = var0.tira(0, 0);
    boolean var11 = var0.tira(10, 0);
    boolean var12 = var0.finito();
    boolean var15 = var0.tira(0, (-1));
    boolean var16 = var0.finito();
    boolean var19 = var0.tira(10, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
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

  }

  public void test256() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test256");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var7 = var0.finito();
    boolean var10 = var0.tira(100, 100);
    boolean var11 = var0.finito();
    boolean var14 = var0.tira(1, 10);
    boolean var15 = var0.finito();
    boolean var16 = var0.finito();
    boolean var17 = var0.finito();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
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

  }

  public void test257() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test257");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(1, 10);
    boolean var7 = var0.finito();
    boolean var8 = var0.finito();
    boolean var11 = var0.tira(0, 10);
    boolean var12 = var0.finito();
    boolean var13 = var0.finito();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
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

  }

  public void test258() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test258");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(1, 10);
    boolean var7 = var0.finito();
    boolean var8 = var0.finito();
    boolean var11 = var0.tira((-1), (-1));
    boolean var12 = var0.finito();
    boolean var13 = var0.finito();
    boolean var14 = var0.finito();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
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

  public void test259() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test259");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira((-1), (-1));
    boolean var9 = var0.tira(0, 1);
    boolean var12 = var0.tira(1, 10);
    boolean var15 = var0.tira(1, 0);
    boolean var18 = var0.tira(10, 1);
    boolean var21 = var0.tira(0, 10);
    boolean var24 = var0.tira(1, 10);
    
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

  public void test260() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test260");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var5 = var0.finito();
    boolean var8 = var0.tira(1, 100);
    boolean var9 = var0.finito();
    boolean var12 = var0.tira((-1), 1);
    boolean var15 = var0.tira((-1), 10);
    boolean var18 = var0.tira(1, 100);
    boolean var19 = var0.finito();
    boolean var22 = var0.tira(10, 1);
    boolean var23 = var0.finito();
    boolean var26 = var0.tira((-1), 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
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
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test261() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test261");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(1, 10);
    boolean var7 = var0.finito();
    boolean var8 = var0.finito();
    boolean var11 = var0.tira(1, 100);
    boolean var14 = var0.tira(0, 100);
    boolean var15 = var0.finito();
    boolean var16 = var0.finito();
    boolean var17 = var0.finito();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
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
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test262() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test262");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira((-1), (-1));
    boolean var9 = var0.tira(0, 1);
    boolean var12 = var0.tira(1, 10);
    boolean var15 = var0.tira(1, 0);
    boolean var16 = var0.finito();
    boolean var19 = var0.tira(1, 0);
    boolean var22 = var0.tira(1, (-1));
    
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
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test263() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test263");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var7 = var0.tira((-1), 1);
    boolean var10 = var0.tira((-1), 10);
    boolean var11 = var0.finito();
    boolean var14 = var0.tira(1, 1);
    
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
    assertTrue(var14 == true);

  }

  public void test264() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test264");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira(10, (-1));
    boolean var4 = var0.finito();
    boolean var5 = var0.finito();
    boolean var8 = var0.tira(0, 0);
    boolean var11 = var0.tira(10, 0);
    boolean var12 = var0.finito();
    boolean var15 = var0.tira(0, (-1));
    boolean var16 = var0.finito();
    boolean var19 = var0.tira(100, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
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

  }

  public void test265() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test265");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(1, 10);
    boolean var7 = var0.finito();
    boolean var8 = var0.finito();
    boolean var9 = var0.finito();
    boolean var12 = var0.tira(100, 100);
    boolean var13 = var0.finito();
    boolean var16 = var0.tira(1, 0);
    boolean var19 = var0.tira(1, 0);
    boolean var20 = var0.finito();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
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
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test266() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test266");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var5 = var0.finito();
    boolean var8 = var0.tira(1, 100);
    boolean var9 = var0.finito();
    boolean var12 = var0.tira((-1), 1);
    boolean var15 = var0.tira((-1), 10);
    boolean var18 = var0.tira(1, 100);
    boolean var19 = var0.finito();
    boolean var22 = var0.tira(10, 1);
    boolean var23 = var0.finito();
    boolean var26 = var0.tira(10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
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
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test267() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test267");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var7 = var0.tira((-1), (-1));
    boolean var10 = var0.tira((-1), 100);
    boolean var13 = var0.tira(1, 0);
    boolean var14 = var0.finito();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test268() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test268");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var9 = var0.tira(0, 1);
    boolean var12 = var0.tira(100, 10);
    boolean var15 = var0.tira(0, 100);
    boolean var18 = var0.tira((-1), 100);
    boolean var19 = var0.finito();
    
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
    assertTrue(var19 == false);

  }

  public void test269() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test269");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var9 = var0.tira(0, 1);
    boolean var12 = var0.tira(100, 10);
    boolean var15 = var0.tira(1, 1);
    boolean var16 = var0.finito();
    boolean var17 = var0.finito();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test270() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test270");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var9 = var0.tira(1, (-1));
    boolean var10 = var0.finito();
    boolean var11 = var0.finito();
    boolean var14 = var0.tira(1, 10);
    
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
    assertTrue(var14 == false);

  }

  public void test271() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test271");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var7 = var0.finito();
    boolean var8 = var0.finito();
    boolean var9 = var0.finito();
    boolean var12 = var0.tira((-1), 0);
    boolean var13 = var0.finito();
    boolean var16 = var0.tira(10, 1);
    boolean var19 = var0.tira(1, 10);
    boolean var22 = var0.tira(1, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
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
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test272() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test272");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var7 = var0.tira((-1), 1);
    boolean var8 = var0.finito();
    boolean var11 = var0.tira(1, 0);
    boolean var14 = var0.tira(10, 100);
    boolean var17 = var0.tira(10, 1);
    boolean var18 = var0.finito();
    boolean var19 = var0.finito();
    boolean var22 = var0.tira((-1), 100);
    boolean var23 = var0.finito();
    boolean var24 = var0.finito();
    boolean var25 = var0.finito();
    boolean var28 = var0.tira(100, 0);
    
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
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
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

  public void test273() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test273");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira((-1), (-1));
    boolean var9 = var0.tira(0, 1);
    boolean var10 = var0.finito();
    boolean var13 = var0.tira(100, 100);
    boolean var16 = var0.tira(0, 100);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test274() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test274");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira((-1), (-1));
    boolean var9 = var0.tira(0, 1);
    boolean var12 = var0.tira(1, 0);
    boolean var13 = var0.finito();
    boolean var14 = var0.finito();
    boolean var15 = var0.finito();
    boolean var18 = var0.tira(10, 0);
    boolean var21 = var0.tira(1, 0);
    boolean var24 = var0.tira(10, 0);
    boolean var27 = var0.tira(0, 1);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
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

  public void test275() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test275");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira((-1), (-1));
    boolean var9 = var0.tira(0, 1);
    boolean var12 = var0.tira(1, 10);
    boolean var15 = var0.tira(1, 0);
    boolean var16 = var0.finito();
    boolean var17 = var0.finito();
    boolean var18 = var0.finito();
    boolean var21 = var0.tira(100, 10);
    boolean var22 = var0.finito();
    
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
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test276() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test276");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var7 = var0.tira((-1), 1);
    boolean var8 = var0.finito();
    boolean var11 = var0.tira(1, 0);
    boolean var14 = var0.tira(100, 1);
    boolean var17 = var0.tira(0, 0);
    boolean var18 = var0.finito();
    
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
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test277() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test277");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var7 = var0.tira((-1), 1);
    boolean var8 = var0.finito();
    boolean var11 = var0.tira(1, 0);
    boolean var14 = var0.tira(10, 100);
    boolean var17 = var0.tira(0, 0);
    boolean var18 = var0.finito();
    boolean var21 = var0.tira(1, 10);
    boolean var22 = var0.finito();
    boolean var25 = var0.tira(100, 100);
    
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
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test278() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test278");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira((-1), 10);
    boolean var7 = var0.finito();
    boolean var8 = var0.finito();
    boolean var9 = var0.finito();
    boolean var10 = var0.finito();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test279() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test279");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var9 = var0.tira(1, (-1));
    boolean var10 = var0.finito();
    boolean var11 = var0.finito();
    boolean var14 = var0.tira(10, 10);
    boolean var15 = var0.finito();
    
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
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test280() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test280");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var5 = var0.finito();
    boolean var8 = var0.tira(1, 100);
    boolean var9 = var0.finito();
    boolean var12 = var0.tira((-1), 1);
    boolean var15 = var0.tira(1, (-1));
    boolean var16 = var0.finito();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
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

  }

  public void test281() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test281");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var7 = var0.finito();
    boolean var10 = var0.tira((-1), 10);
    boolean var11 = var0.finito();
    boolean var14 = var0.tira(100, 100);
    boolean var17 = var0.tira(1, (-1));
    boolean var20 = var0.tira(10, 1);
    boolean var21 = var0.finito();
    boolean var22 = var0.finito();
    boolean var25 = var0.tira(0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
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

  public void test282() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test282");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var7 = var0.finito();
    boolean var10 = var0.tira((-1), 1);
    boolean var13 = var0.tira(0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test283() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test283");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira((-1), (-1));
    boolean var9 = var0.tira(0, 1);
    boolean var10 = var0.finito();
    boolean var13 = var0.tira(0, (-1));
    boolean var14 = var0.finito();
    boolean var15 = var0.finito();
    boolean var18 = var0.tira(10, 1);
    boolean var21 = var0.tira(10, 10);
    boolean var22 = var0.finito();
    
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

  }

  public void test284() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test284");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira(10, (-1));
    boolean var4 = var0.finito();
    boolean var5 = var0.finito();
    boolean var8 = var0.tira(0, 0);
    boolean var11 = var0.tira(10, 0);
    boolean var14 = var0.tira(10, 100);
    boolean var17 = var0.tira(100, 100);
    boolean var20 = var0.tira(10, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
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

  }

  public void test285() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test285");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var7 = var0.tira((-1), 1);
    boolean var8 = var0.finito();
    boolean var11 = var0.tira(1, 0);
    boolean var14 = var0.tira(100, 1);
    boolean var17 = var0.tira(0, 0);
    boolean var20 = var0.tira((-1), 1);
    
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
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test286() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test286");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var9 = var0.tira(0, 1);
    boolean var12 = var0.tira(1, 1);
    boolean var15 = var0.tira(100, 1);
    boolean var16 = var0.finito();
    boolean var17 = var0.finito();
    boolean var18 = var0.finito();
    
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
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test287() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test287");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var9 = var0.tira(0, 1);
    boolean var12 = var0.tira((-1), (-1));
    boolean var13 = var0.finito();
    boolean var16 = var0.tira((-1), 1);
    boolean var17 = var0.finito();
    boolean var20 = var0.tira(100, 100);
    boolean var21 = var0.finito();
    boolean var24 = var0.tira((-1), 0);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test288() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test288");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var7 = var0.finito();
    boolean var10 = var0.tira(100, 100);
    boolean var11 = var0.finito();
    boolean var12 = var0.finito();
    boolean var13 = var0.finito();
    boolean var14 = var0.finito();
    boolean var17 = var0.tira((-1), 1);
    boolean var20 = var0.tira(1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
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
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);

  }

  public void test289() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test289");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var9 = var0.tira(0, 1);
    boolean var12 = var0.tira((-1), (-1));
    boolean var13 = var0.finito();
    boolean var16 = var0.tira((-1), 1);
    boolean var19 = var0.tira(10, 10);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test290() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test290");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var9 = var0.tira(0, 1);
    boolean var10 = var0.finito();
    boolean var13 = var0.tira(1, 100);
    boolean var16 = var0.tira(10, 100);
    boolean var17 = var0.finito();
    boolean var18 = var0.finito();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test291() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test291");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(1, 10);
    boolean var7 = var0.finito();
    boolean var8 = var0.finito();
    boolean var9 = var0.finito();
    boolean var12 = var0.tira(100, 100);
    boolean var13 = var0.finito();
    boolean var16 = var0.tira((-1), (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
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
    assertTrue(var16 == false);

  }

  public void test292() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test292");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(1, 10);
    boolean var7 = var0.finito();
    boolean var8 = var0.finito();
    boolean var9 = var0.finito();
    boolean var12 = var0.tira((-1), (-1));
    boolean var15 = var0.tira(1, 10);
    boolean var16 = var0.finito();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
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
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test293() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test293");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira((-1), (-1));
    boolean var9 = var0.tira(0, 1);
    boolean var10 = var0.finito();
    boolean var13 = var0.tira(0, (-1));
    boolean var14 = var0.finito();
    boolean var17 = var0.tira(0, 100);
    boolean var20 = var0.tira((-1), (-1));
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test294() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test294");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira((-1), (-1));
    boolean var9 = var0.tira(0, 1);
    boolean var12 = var0.tira(1, 10);
    boolean var15 = var0.tira(1, 0);
    boolean var16 = var0.finito();
    boolean var17 = var0.finito();
    boolean var18 = var0.finito();
    boolean var21 = var0.tira((-1), 0);
    boolean var24 = var0.tira(0, 10);
    
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
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test295() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test295");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var7 = var0.tira((-1), 1);
    boolean var8 = var0.finito();
    boolean var11 = var0.tira(1, 0);
    boolean var14 = var0.tira((-1), 1);
    boolean var15 = var0.finito();
    boolean var18 = var0.tira(0, 0);
    boolean var21 = var0.tira(0, 100);
    boolean var24 = var0.tira(10, 0);
    
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
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test296() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test296");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira((-1), (-1));
    boolean var9 = var0.tira(0, 1);
    boolean var12 = var0.tira(1, 10);
    boolean var15 = var0.tira(1, 0);
    boolean var18 = var0.tira(10, 1);
    boolean var21 = var0.tira(0, 10);
    boolean var22 = var0.finito();
    boolean var25 = var0.tira((-1), 100);
    boolean var28 = var0.tira(0, (-1));
    boolean var31 = var0.tira(100, 0);
    boolean var32 = var0.finito();
    boolean var35 = var0.tira(1, (-1));
    
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
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);

  }

  public void test297() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test297");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var7 = var0.finito();
    boolean var10 = var0.tira((-1), 10);
    boolean var11 = var0.finito();
    boolean var14 = var0.tira(100, 100);
    boolean var17 = var0.tira(1, (-1));
    boolean var18 = var0.finito();
    boolean var21 = var0.tira((-1), 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test298() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test298");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira((-1), (-1));
    boolean var9 = var0.tira(0, 1);
    boolean var10 = var0.finito();
    boolean var13 = var0.tira(0, (-1));
    boolean var14 = var0.finito();
    boolean var15 = var0.finito();
    boolean var16 = var0.finito();
    boolean var19 = var0.tira(0, (-1));
    boolean var20 = var0.finito();
    boolean var21 = var0.finito();
    boolean var22 = var0.finito();
    boolean var25 = var0.tira(10, 1);
    boolean var26 = var0.finito();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
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
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test299() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test299");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var7 = var0.tira((-1), 1);
    boolean var10 = var0.tira((-1), 10);
    boolean var13 = var0.tira((-1), (-1));
    boolean var14 = var0.finito();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test300() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test300");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var7 = var0.tira((-1), 1);
    boolean var8 = var0.finito();
    boolean var11 = var0.tira(1, 0);
    boolean var14 = var0.tira((-1), 1);
    boolean var17 = var0.tira(0, 1);
    boolean var20 = var0.tira(10, 0);
    
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
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test301() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test301");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var9 = var0.tira(0, 1);
    boolean var12 = var0.tira((-1), (-1));
    boolean var13 = var0.finito();
    boolean var14 = var0.finito();
    boolean var17 = var0.tira(10, 0);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test302() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test302");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var7 = var0.tira((-1), 1);
    boolean var10 = var0.tira(1, 1);
    boolean var13 = var0.tira((-1), 0);
    boolean var14 = var0.finito();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test303() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test303");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var9 = var0.tira(1, (-1));
    boolean var10 = var0.finito();
    boolean var13 = var0.tira(0, 0);
    boolean var16 = var0.tira((-1), 0);
    boolean var17 = var0.finito();
    boolean var20 = var0.tira(10, 1);
    boolean var21 = var0.finito();
    boolean var24 = var0.tira(10, 1);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test304() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test304");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var9 = var0.tira(0, 1);
    boolean var10 = var0.finito();
    boolean var13 = var0.tira(1, 100);
    boolean var14 = var0.finito();
    boolean var15 = var0.finito();
    boolean var18 = var0.tira((-1), 1);
    boolean var21 = var0.tira(1, 100);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test305() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test305");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira((-1), (-1));
    boolean var9 = var0.tira(100, 0);
    boolean var12 = var0.tira((-1), (-1));
    boolean var13 = var0.finito();
    boolean var14 = var0.finito();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test306() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test306");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var5 = var0.finito();
    boolean var8 = var0.tira(10, 10);
    boolean var11 = var0.tira(10, (-1));
    boolean var14 = var0.tira((-1), 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test307() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test307");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var7 = var0.tira((-1), 1);
    boolean var10 = var0.tira(1, 1);
    boolean var13 = var0.tira(1, (-1));
    boolean var14 = var0.finito();
    boolean var15 = var0.finito();
    boolean var18 = var0.tira((-1), 1);
    boolean var19 = var0.finito();
    boolean var22 = var0.tira(100, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
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
    assertTrue(var22 == false);

  }

  public void test308() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test308");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(1, 10);
    boolean var9 = var0.tira(1, 100);
    boolean var10 = var0.finito();
    boolean var11 = var0.finito();
    boolean var12 = var0.finito();
    boolean var15 = var0.tira(10, (-1));
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test309() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test309");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira(10, (-1));
    boolean var4 = var0.finito();
    boolean var5 = var0.finito();
    boolean var8 = var0.tira(0, 0);
    boolean var11 = var0.tira(10, 0);
    boolean var12 = var0.finito();
    boolean var15 = var0.tira(1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
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

  }

  public void test310() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test310");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira((-1), (-1));
    boolean var9 = var0.tira(0, 1);
    boolean var12 = var0.tira(1, 10);
    boolean var15 = var0.tira(1, 0);
    boolean var16 = var0.finito();
    boolean var17 = var0.finito();
    boolean var20 = var0.tira((-1), 0);
    
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
    assertTrue(var20 == false);

  }

  public void test311() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test311");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var7 = var0.tira((-1), 1);
    boolean var10 = var0.tira(1, 1);
    boolean var13 = var0.tira(1, (-1));
    boolean var14 = var0.finito();
    boolean var15 = var0.finito();
    boolean var16 = var0.finito();
    boolean var17 = var0.finito();
    boolean var20 = var0.tira((-1), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
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
    assertTrue(var20 == false);

  }

  public void test312() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test312");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira((-1), (-1));
    boolean var9 = var0.tira(0, 1);
    boolean var10 = var0.finito();
    boolean var13 = var0.tira(100, 100);
    boolean var14 = var0.finito();
    boolean var17 = var0.tira(0, 10);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test313() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test313");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var7 = var0.finito();
    boolean var10 = var0.tira((-1), 10);
    boolean var13 = var0.tira(100, 1);
    boolean var14 = var0.finito();
    boolean var17 = var0.tira(0, 100);
    boolean var20 = var0.tira(100, 0);
    boolean var21 = var0.finito();
    boolean var22 = var0.finito();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test314() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test314");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var9 = var0.tira(0, 1);
    boolean var10 = var0.finito();
    boolean var13 = var0.tira(1, 100);
    boolean var14 = var0.finito();
    boolean var15 = var0.finito();
    boolean var18 = var0.tira(1, 100);
    boolean var21 = var0.tira(100, 0);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test315() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test315");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var9 = var0.tira(1, (-1));
    boolean var10 = var0.finito();
    boolean var13 = var0.tira(0, 0);
    boolean var16 = var0.tira((-1), 0);
    boolean var17 = var0.finito();
    boolean var20 = var0.tira(0, 1);
    boolean var21 = var0.finito();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test316() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test316");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var7 = var0.tira((-1), 1);
    boolean var8 = var0.finito();
    boolean var11 = var0.tira(1, 0);
    boolean var14 = var0.tira(10, 100);
    boolean var17 = var0.tira(1, (-1));
    boolean var20 = var0.tira(100, 0);
    
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
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test317() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test317");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var7 = var0.finito();
    boolean var10 = var0.tira(100, 100);
    boolean var11 = var0.finito();
    boolean var12 = var0.finito();
    boolean var15 = var0.tira(0, 1);
    boolean var18 = var0.tira(10, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
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

  public void test318() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test318");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var9 = var0.tira(1, 10);
    boolean var12 = var0.tira(10, 1);
    boolean var13 = var0.finito();
    boolean var16 = var0.tira((-1), (-1));
    boolean var17 = var0.finito();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test319() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test319");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var9 = var0.tira(0, 1);
    boolean var10 = var0.finito();
    boolean var13 = var0.tira(100, 100);
    boolean var14 = var0.finito();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test320() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test320");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var7 = var0.finito();
    boolean var10 = var0.tira(100, 100);
    boolean var11 = var0.finito();
    boolean var12 = var0.finito();
    boolean var13 = var0.finito();
    boolean var14 = var0.finito();
    boolean var17 = var0.tira((-1), 1);
    boolean var20 = var0.tira(100, 0);
    boolean var23 = var0.tira(0, 10);
    boolean var26 = var0.tira((-1), 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
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
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test321() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test321");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira((-1), (-1));
    boolean var9 = var0.tira(0, 10);
    boolean var10 = var0.finito();
    boolean var11 = var0.finito();
    boolean var14 = var0.tira(100, 1);
    boolean var17 = var0.tira(100, (-1));
    boolean var18 = var0.finito();
    
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
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test322() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test322");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira((-1), (-1));
    boolean var9 = var0.tira(0, 10);
    boolean var10 = var0.finito();
    boolean var11 = var0.finito();
    boolean var12 = var0.finito();
    boolean var15 = var0.tira((-1), (-1));
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test323() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test323");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira((-1), (-1));
    boolean var9 = var0.tira(0, 1);
    boolean var12 = var0.tira(1, 10);
    boolean var13 = var0.finito();
    boolean var16 = var0.tira(10, 100);
    boolean var17 = var0.finito();
    boolean var20 = var0.tira(1, 1);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);

  }

  public void test324() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test324");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira((-1), (-1));
    boolean var9 = var0.tira(0, 1);
    boolean var12 = var0.tira(1, 10);
    boolean var15 = var0.tira(1, 0);
    boolean var18 = var0.tira(10, 1);
    boolean var21 = var0.tira(0, 10);
    boolean var22 = var0.finito();
    boolean var25 = var0.tira((-1), 100);
    boolean var28 = var0.tira(0, (-1));
    boolean var31 = var0.tira(100, 0);
    boolean var32 = var0.finito();
    boolean var35 = var0.tira(100, (-1));
    boolean var36 = var0.finito();
    
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
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);

  }

  public void test325() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test325");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var5 = var0.finito();
    boolean var6 = var0.finito();
    boolean var7 = var0.finito();
    boolean var10 = var0.tira(10, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test326() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test326");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira((-1), 10);
    boolean var7 = var0.finito();
    boolean var10 = var0.tira(0, (-1));
    boolean var13 = var0.tira((-1), (-1));
    boolean var14 = var0.finito();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test327() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test327");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var9 = var0.tira(0, 1);
    boolean var12 = var0.tira((-1), (-1));
    boolean var13 = var0.finito();
    boolean var16 = var0.tira((-1), 1);
    boolean var17 = var0.finito();
    boolean var18 = var0.finito();
    boolean var21 = var0.tira(0, 10);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test328() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test328");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var7 = var0.tira((-1), (-1));
    boolean var10 = var0.tira((-1), 100);
    boolean var11 = var0.finito();
    boolean var12 = var0.finito();
    boolean var15 = var0.tira(1, 0);
    
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
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test329() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test329");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var7 = var0.tira((-1), (-1));
    boolean var10 = var0.tira((-1), 100);
    boolean var13 = var0.tira(10, 0);
    boolean var16 = var0.tira(100, 0);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test330() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test330");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var7 = var0.finito();
    boolean var10 = var0.tira((-1), 10);
    boolean var11 = var0.finito();
    boolean var12 = var0.finito();
    boolean var13 = var0.finito();
    boolean var16 = var0.tira(1, 0);
    boolean var17 = var0.finito();
    boolean var18 = var0.finito();
    boolean var21 = var0.tira(10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
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
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test331() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test331");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var9 = var0.tira(1, (-1));
    boolean var10 = var0.finito();
    boolean var13 = var0.tira(0, 0);
    boolean var14 = var0.finito();
    boolean var17 = var0.tira(1, 10);
    boolean var20 = var0.tira(0, 100);
    boolean var21 = var0.finito();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test332() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test332");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var7 = var0.tira((-1), (-1));
    boolean var8 = var0.finito();
    boolean var9 = var0.finito();
    
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

  }

  public void test333() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test333");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var7 = var0.tira((-1), 1);
    boolean var8 = var0.finito();
    boolean var11 = var0.tira(1, 0);
    boolean var14 = var0.tira(10, 100);
    boolean var17 = var0.tira(10, 1);
    boolean var18 = var0.finito();
    boolean var19 = var0.finito();
    boolean var22 = var0.tira(10, 100);
    boolean var23 = var0.finito();
    
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
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test334() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test334");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira(1, 10);
    boolean var6 = var0.tira((-1), 10);
    boolean var7 = var0.finito();
    boolean var10 = var0.tira((-1), 0);
    boolean var13 = var0.tira(100, (-1));
    boolean var14 = var0.finito();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test335() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test335");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira((-1), (-1));
    boolean var9 = var0.tira(0, 1);
    boolean var12 = var0.tira(1, 10);
    boolean var15 = var0.tira(1, 0);
    boolean var18 = var0.tira(10, 1);
    boolean var21 = var0.tira(0, (-1));
    boolean var24 = var0.tira((-1), 100);
    boolean var25 = var0.finito();
    
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
    assertTrue(var25 == false);

  }

  public void test336() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test336");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var7 = var0.tira((-1), 1);
    boolean var8 = var0.finito();
    boolean var11 = var0.tira(1, 0);
    boolean var14 = var0.tira(10, 100);
    boolean var17 = var0.tira(100, (-1));
    boolean var18 = var0.finito();
    boolean var21 = var0.tira(100, (-1));
    boolean var24 = var0.tira(100, 100);
    
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
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test337() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test337");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var7 = var0.tira((-1), 1);
    boolean var8 = var0.finito();
    boolean var11 = var0.tira((-1), 100);
    
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

  }

  public void test338() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test338");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(1, 10);
    boolean var7 = var0.finito();
    boolean var8 = var0.finito();
    boolean var11 = var0.tira(1, 100);
    boolean var12 = var0.finito();
    boolean var13 = var0.finito();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
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

  }

  public void test339() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test339");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var7 = var0.tira((-1), 1);
    boolean var8 = var0.finito();
    boolean var11 = var0.tira(1, 0);
    boolean var12 = var0.finito();
    boolean var15 = var0.tira(1, (-1));
    boolean var16 = var0.finito();
    
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
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test340() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test340");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var7 = var0.tira((-1), 1);
    boolean var10 = var0.tira((-1), 10);
    boolean var13 = var0.tira(10, 0);
    boolean var16 = var0.tira(1, 1);
    boolean var17 = var0.finito();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test341() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test341");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var7 = var0.finito();
    boolean var10 = var0.tira((-1), 10);
    boolean var11 = var0.finito();
    boolean var12 = var0.finito();
    boolean var13 = var0.finito();
    boolean var16 = var0.tira(10, 10);
    boolean var19 = var0.tira(10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
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
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test342() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test342");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var7 = var0.finito();
    boolean var10 = var0.tira((-1), 10);
    boolean var13 = var0.tira(100, 1);
    boolean var14 = var0.finito();
    boolean var17 = var0.tira(0, 100);
    boolean var18 = var0.finito();
    boolean var21 = var0.tira(1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test343() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test343");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var9 = var0.tira(0, 1);
    boolean var12 = var0.tira((-1), (-1));
    boolean var13 = var0.finito();
    boolean var16 = var0.tira((-1), 1);
    boolean var17 = var0.finito();
    boolean var18 = var0.finito();
    boolean var21 = var0.tira(0, 100);
    boolean var22 = var0.finito();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test344() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test344");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira((-1), (-1));
    boolean var9 = var0.tira(0, 1);
    boolean var12 = var0.tira(1, 10);
    boolean var13 = var0.finito();
    boolean var16 = var0.tira(10, 100);
    boolean var19 = var0.tira(100, 10);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test345() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test345");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var7 = var0.finito();
    boolean var10 = var0.tira((-1), 10);
    boolean var11 = var0.finito();
    boolean var14 = var0.tira(100, 100);
    boolean var17 = var0.tira(1, (-1));
    boolean var20 = var0.tira(10, 1);
    boolean var21 = var0.finito();
    boolean var22 = var0.finito();
    boolean var23 = var0.finito();
    boolean var26 = var0.tira(100, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test346() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test346");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var7 = var0.tira((-1), 1);
    boolean var8 = var0.finito();
    boolean var11 = var0.tira(1, 0);
    boolean var14 = var0.tira(10, 100);
    boolean var17 = var0.tira(100, (-1));
    boolean var18 = var0.finito();
    boolean var21 = var0.tira(100, 1);
    boolean var22 = var0.finito();
    
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
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test347() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test347");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var5 = var0.finito();
    boolean var6 = var0.finito();
    boolean var9 = var0.tira(1, 1);
    boolean var10 = var0.finito();
    boolean var11 = var0.finito();
    boolean var12 = var0.finito();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test348() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test348");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var5 = var0.finito();
    boolean var8 = var0.tira(1, 100);
    boolean var9 = var0.finito();
    boolean var12 = var0.tira((-1), 1);
    boolean var15 = var0.tira((-1), 10);
    boolean var18 = var0.tira(1, 100);
    boolean var21 = var0.tira(0, 10);
    boolean var22 = var0.finito();
    boolean var25 = var0.tira((-1), (-1));
    boolean var28 = var0.tira(1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
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
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test349() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test349");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var7 = var0.tira((-1), (-1));
    boolean var10 = var0.tira((-1), 100);
    boolean var11 = var0.finito();
    boolean var12 = var0.finito();
    boolean var13 = var0.finito();
    
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
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test350() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test350");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var5 = var0.finito();
    boolean var8 = var0.tira(10, 10);
    boolean var11 = var0.tira(10, (-1));
    boolean var14 = var0.tira(0, 10);
    boolean var15 = var0.finito();
    boolean var16 = var0.finito();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test351() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test351");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var7 = var0.finito();
    boolean var10 = var0.tira((-1), 10);
    boolean var13 = var0.tira(100, 1);
    boolean var14 = var0.finito();
    boolean var17 = var0.tira(0, 100);
    boolean var20 = var0.tira(1, 1);
    boolean var21 = var0.finito();
    boolean var24 = var0.tira(100, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test352() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test352");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var5 = var0.finito();
    boolean var8 = var0.tira(1, 100);
    boolean var9 = var0.finito();
    boolean var10 = var0.finito();
    boolean var11 = var0.finito();
    boolean var14 = var0.tira(100, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test353() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test353");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var9 = var0.tira(0, 1);
    boolean var12 = var0.tira(100, 10);
    boolean var15 = var0.tira(0, 100);
    boolean var18 = var0.tira(10, 1);
    boolean var21 = var0.tira(1, (-1));
    
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

  }

  public void test354() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test354");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var7 = var0.tira((-1), 1);
    boolean var8 = var0.finito();
    boolean var11 = var0.tira(1, 0);
    boolean var14 = var0.tira((-1), 1);
    boolean var17 = var0.tira(0, 100);
    boolean var18 = var0.finito();
    boolean var21 = var0.tira(0, 10);
    
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
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test355() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test355");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var7 = var0.tira((-1), 1);
    boolean var8 = var0.finito();
    boolean var11 = var0.tira(0, 100);
    boolean var12 = var0.finito();
    boolean var15 = var0.tira(10, 0);
    
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
    assertTrue(var15 == false);

  }

  public void test356() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test356");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var7 = var0.tira((-1), 1);
    boolean var8 = var0.finito();
    boolean var11 = var0.tira(1, 0);
    boolean var14 = var0.tira(10, 100);
    boolean var17 = var0.tira(10, 1);
    boolean var18 = var0.finito();
    boolean var21 = var0.tira((-1), (-1));
    boolean var22 = var0.finito();
    boolean var25 = var0.tira((-1), 0);
    
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
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test357() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test357");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var9 = var0.tira(0, 1);
    boolean var12 = var0.tira(1, 1);
    boolean var15 = var0.tira(100, 1);
    boolean var18 = var0.tira(0, 0);
    boolean var21 = var0.tira(100, 100);
    boolean var22 = var0.finito();
    
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
    assertTrue(var22 == false);

  }

  public void test358() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test358");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var7 = var0.tira((-1), (-1));
    boolean var10 = var0.tira((-1), 100);
    boolean var13 = var0.tira(1, 0);
    boolean var16 = var0.tira((-1), 100);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test359() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test359");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var5 = var0.finito();
    boolean var8 = var0.tira((-1), 10);
    boolean var11 = var0.tira(0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test360() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test360");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var7 = var0.finito();
    boolean var10 = var0.tira((-1), 10);
    boolean var11 = var0.finito();
    boolean var12 = var0.finito();
    boolean var15 = var0.tira(10, 0);
    boolean var18 = var0.tira((-1), (-1));
    boolean var21 = var0.tira(1, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
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
    assertTrue(var21 == false);

  }

  public void test361() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test361");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira((-1), 10);
    boolean var7 = var0.finito();
    boolean var8 = var0.finito();
    boolean var9 = var0.finito();
    boolean var12 = var0.tira(10, 1);
    boolean var13 = var0.finito();
    boolean var16 = var0.tira((-1), (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
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
    assertTrue(var16 == false);

  }

  public void test362() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test362");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var7 = var0.tira((-1), 1);
    boolean var8 = var0.finito();
    boolean var11 = var0.tira(1, 0);
    boolean var14 = var0.tira((-1), 1);
    boolean var17 = var0.tira((-1), 100);
    boolean var20 = var0.tira(1, 1);
    
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
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);

  }

  public void test363() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test363");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(1, 10);
    boolean var7 = var0.finito();
    boolean var10 = var0.tira(0, 10);
    boolean var13 = var0.tira(100, (-1));
    boolean var16 = var0.tira(10, 100);
    boolean var19 = var0.tira(1, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
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

  }

  public void test364() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test364");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var9 = var0.tira(0, 1);
    boolean var12 = var0.tira(1, 1);
    boolean var13 = var0.finito();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test365() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test365");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var7 = var0.finito();
    boolean var8 = var0.finito();
    boolean var9 = var0.finito();
    boolean var12 = var0.tira(1, 10);
    boolean var13 = var0.finito();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
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

  }

  public void test366() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test366");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira((-1), (-1));
    boolean var9 = var0.tira(0, 1);
    boolean var12 = var0.tira(1, 10);
    boolean var15 = var0.tira(0, 1);
    
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

  public void test367() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test367");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var5 = var0.finito();
    boolean var8 = var0.tira(1, 100);
    boolean var9 = var0.finito();
    boolean var12 = var0.tira(10, 0);
    boolean var13 = var0.finito();
    boolean var14 = var0.finito();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test368() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test368");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira((-1), (-1));
    boolean var9 = var0.tira(0, 1);
    boolean var12 = var0.tira(1, 10);
    boolean var15 = var0.tira(1, 0);
    boolean var18 = var0.tira(10, 1);
    boolean var21 = var0.tira(0, 10);
    boolean var22 = var0.finito();
    boolean var23 = var0.finito();
    boolean var26 = var0.tira(0, 0);
    boolean var29 = var0.tira(10, 1);
    boolean var32 = var0.tira(100, 100);
    
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
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);

  }

  public void test369() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test369");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira(10, (-1));
    boolean var4 = var0.finito();
    boolean var5 = var0.finito();
    boolean var6 = var0.finito();
    boolean var9 = var0.tira(1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test370() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test370");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira(1, 10);
    boolean var6 = var0.tira((-1), 10);
    boolean var9 = var0.tira((-1), (-1));
    boolean var12 = var0.tira(100, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test371() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test371");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var7 = var0.tira((-1), 1);
    boolean var8 = var0.finito();
    boolean var11 = var0.tira(1, 0);
    boolean var14 = var0.tira(100, 1);
    boolean var15 = var0.finito();
    
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
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test372() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test372");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira((-1), (-1));
    boolean var9 = var0.tira(0, 1);
    boolean var10 = var0.finito();
    boolean var13 = var0.tira(0, (-1));
    boolean var14 = var0.finito();
    boolean var15 = var0.finito();
    boolean var16 = var0.finito();
    boolean var19 = var0.tira(0, (-1));
    boolean var20 = var0.finito();
    boolean var21 = var0.finito();
    boolean var24 = var0.tira(100, 0);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
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
    assertTrue(var24 == false);

  }

  public void test373() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test373");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(1, 10);
    boolean var9 = var0.tira(1, 100);
    boolean var12 = var0.tira(10, 1);
    boolean var15 = var0.tira(100, 10);
    boolean var18 = var0.tira(10, 100);
    boolean var21 = var0.tira(0, 0);
    
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

  }

  public void test374() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test374");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var5 = var0.finito();
    boolean var8 = var0.tira(1, 100);
    boolean var9 = var0.finito();
    boolean var10 = var0.finito();
    boolean var11 = var0.finito();
    boolean var12 = var0.finito();
    boolean var15 = var0.tira(10, 1);
    boolean var18 = var0.tira(0, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
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

  public void test375() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test375");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var7 = var0.tira((-1), 1);
    boolean var10 = var0.tira(1, 1);
    boolean var13 = var0.tira(1, (-1));
    boolean var14 = var0.finito();
    boolean var15 = var0.finito();
    boolean var18 = var0.tira((-1), 1);
    boolean var19 = var0.finito();
    boolean var22 = var0.tira(0, 0);
    boolean var23 = var0.finito();
    boolean var26 = var0.tira((-1), (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
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
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test376() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test376");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var7 = var0.finito();
    boolean var10 = var0.tira((-1), 10);
    boolean var11 = var0.finito();
    boolean var14 = var0.tira(100, 100);
    boolean var17 = var0.tira(1, (-1));
    boolean var20 = var0.tira(0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test377() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test377");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var7 = var0.finito();
    boolean var8 = var0.finito();
    boolean var9 = var0.finito();
    boolean var10 = var0.finito();
    boolean var13 = var0.tira((-1), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test378() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test378");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira(10, (-1));
    boolean var4 = var0.finito();
    boolean var5 = var0.finito();
    boolean var8 = var0.tira(0, 0);
    boolean var11 = var0.tira(10, 0);
    boolean var12 = var0.finito();
    boolean var13 = var0.finito();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
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

  }

  public void test379() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test379");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var7 = var0.finito();
    boolean var10 = var0.tira(100, 100);
    boolean var13 = var0.tira(0, 0);
    boolean var14 = var0.finito();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test380() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test380");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(1, 10);
    boolean var7 = var0.finito();
    boolean var8 = var0.finito();
    boolean var11 = var0.tira(0, 10);
    boolean var14 = var0.tira(100, (-1));
    boolean var15 = var0.finito();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
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

  }

  public void test381() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test381");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira(10, (-1));
    boolean var4 = var0.finito();
    boolean var5 = var0.finito();
    boolean var8 = var0.tira(100, 100);
    boolean var11 = var0.tira(0, (-1));
    boolean var12 = var0.finito();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test382() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test382");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var9 = var0.tira(0, 1);
    boolean var12 = var0.tira(100, 10);
    boolean var15 = var0.tira(0, 100);
    boolean var16 = var0.finito();
    boolean var17 = var0.finito();
    
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

  }

  public void test383() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test383");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(1, 10);
    boolean var9 = var0.tira(1, 100);
    boolean var12 = var0.tira(10, 1);
    boolean var13 = var0.finito();
    boolean var14 = var0.finito();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test384() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test384");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira((-1), (-1));
    boolean var9 = var0.tira(0, 1);
    boolean var12 = var0.tira(10, 100);
    boolean var13 = var0.finito();
    
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

  public void test385() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test385");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var7 = var0.tira((-1), 1);
    boolean var10 = var0.tira(1, 1);
    boolean var13 = var0.tira(1, (-1));
    boolean var14 = var0.finito();
    boolean var15 = var0.finito();
    boolean var16 = var0.finito();
    boolean var19 = var0.tira(10, 100);
    boolean var20 = var0.finito();
    boolean var21 = var0.finito();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
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

  }

  public void test386() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test386");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var9 = var0.tira((-1), 1);
    boolean var12 = var0.tira((-1), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test387() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test387");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var7 = var0.finito();
    boolean var10 = var0.tira((-1), 10);
    boolean var11 = var0.finito();
    boolean var14 = var0.tira(100, 100);
    boolean var17 = var0.tira(1, (-1));
    boolean var20 = var0.tira(10, 1);
    boolean var21 = var0.finito();
    boolean var22 = var0.finito();
    boolean var23 = var0.finito();
    boolean var26 = var0.tira(10, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test388() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test388");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var7 = var0.finito();
    boolean var8 = var0.finito();
    boolean var9 = var0.finito();
    boolean var12 = var0.tira(100, 0);
    boolean var15 = var0.tira((-1), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
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
    assertTrue(var15 == false);

  }

  public void test389() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test389");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var7 = var0.finito();
    boolean var10 = var0.tira((-1), 10);
    boolean var11 = var0.finito();
    boolean var14 = var0.tira(100, 100);
    boolean var17 = var0.tira(1, (-1));
    boolean var20 = var0.tira(10, 1);
    boolean var23 = var0.tira(0, 1);
    boolean var26 = var0.tira(0, (-1));
    boolean var29 = var0.tira(100, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
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
    assertTrue(var29 == false);

  }

  public void test390() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test390");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var5 = var0.finito();
    boolean var8 = var0.tira(1, 100);
    boolean var9 = var0.finito();
    boolean var12 = var0.tira((-1), 1);
    boolean var15 = var0.tira((-1), 10);
    boolean var18 = var0.tira(1, 100);
    boolean var21 = var0.tira(0, 10);
    boolean var24 = var0.tira((-1), 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
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
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test391() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test391");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var7 = var0.finito();
    boolean var10 = var0.tira((-1), 10);
    boolean var13 = var0.tira(100, 1);
    boolean var14 = var0.finito();
    boolean var17 = var0.tira(0, 100);
    boolean var18 = var0.finito();
    boolean var19 = var0.finito();
    boolean var20 = var0.finito();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test392() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test392");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var7 = var0.tira((-1), 1);
    boolean var10 = var0.tira((-1), 10);
    boolean var13 = var0.tira((-1), 1);
    
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

  public void test393() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test393");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var9 = var0.tira(0, 1);
    boolean var12 = var0.tira(100, 10);
    boolean var13 = var0.finito();
    
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

  public void test394() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test394");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var7 = var0.finito();
    boolean var10 = var0.tira((-1), 10);
    boolean var13 = var0.tira(100, 1);
    boolean var14 = var0.finito();
    boolean var17 = var0.tira((-1), 0);
    boolean var18 = var0.finito();
    boolean var19 = var0.finito();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test395() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test395");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira(10, (-1));
    boolean var4 = var0.finito();
    boolean var7 = var0.tira(0, 0);
    boolean var8 = var0.finito();
    boolean var11 = var0.tira(1, 1);
    boolean var14 = var0.tira(0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test396() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test396");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var7 = var0.tira((-1), 1);
    boolean var8 = var0.finito();
    boolean var11 = var0.tira(1, 0);
    boolean var14 = var0.tira((-1), 1);
    boolean var15 = var0.finito();
    boolean var16 = var0.finito();
    boolean var17 = var0.finito();
    boolean var18 = var0.finito();
    boolean var19 = var0.finito();
    boolean var20 = var0.finito();
    
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
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test397() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test397");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var5 = var0.finito();
    boolean var8 = var0.tira(100, 0);
    boolean var9 = var0.finito();
    boolean var10 = var0.finito();
    boolean var13 = var0.tira(0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test398() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test398");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var7 = var0.tira((-1), 1);
    boolean var8 = var0.finito();
    boolean var11 = var0.tira(1, 0);
    boolean var14 = var0.tira(10, 100);
    boolean var17 = var0.tira(0, 0);
    boolean var18 = var0.finito();
    boolean var21 = var0.tira(1, 10);
    boolean var22 = var0.finito();
    boolean var25 = var0.tira(1, (-1));
    
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
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test399() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test399");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var7 = var0.tira((-1), 1);
    boolean var8 = var0.finito();
    boolean var11 = var0.tira(1, 0);
    boolean var12 = var0.finito();
    boolean var13 = var0.finito();
    boolean var14 = var0.finito();
    
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

  public void test400() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test400");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira((-1), (-1));
    boolean var9 = var0.tira(0, 1);
    boolean var12 = var0.tira(1, 0);
    boolean var13 = var0.finito();
    boolean var14 = var0.finito();
    boolean var15 = var0.finito();
    boolean var18 = var0.tira(100, 100);
    boolean var21 = var0.tira(10, 100);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test401() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test401");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var7 = var0.finito();
    boolean var10 = var0.tira((-1), 10);
    boolean var11 = var0.finito();
    boolean var14 = var0.tira(100, 100);
    boolean var15 = var0.finito();
    boolean var16 = var0.finito();
    boolean var17 = var0.finito();
    boolean var20 = var0.tira(100, 10);
    boolean var23 = var0.tira(10, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
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

  }

  public void test402() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test402");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira((-1), (-1));
    boolean var9 = var0.tira(0, 1);
    boolean var12 = var0.tira(1, 0);
    boolean var13 = var0.finito();
    boolean var16 = var0.tira((-1), (-1));
    boolean var17 = var0.finito();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test403() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test403");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var7 = var0.finito();
    boolean var10 = var0.tira(100, 100);
    boolean var11 = var0.finito();
    boolean var12 = var0.finito();
    boolean var13 = var0.finito();
    boolean var14 = var0.finito();
    boolean var17 = var0.tira((-1), 1);
    boolean var20 = var0.tira(100, 0);
    boolean var21 = var0.finito();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
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
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test404() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test404");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var7 = var0.tira((-1), 1);
    boolean var10 = var0.tira(1, 1);
    boolean var13 = var0.tira(1, (-1));
    boolean var14 = var0.finito();
    boolean var15 = var0.finito();
    boolean var18 = var0.tira(0, 10);
    boolean var21 = var0.tira((-1), 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test405() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test405");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var7 = var0.tira((-1), 1);
    boolean var8 = var0.finito();
    boolean var11 = var0.tira(1, 0);
    boolean var14 = var0.tira(10, 100);
    boolean var17 = var0.tira(100, (-1));
    boolean var18 = var0.finito();
    boolean var21 = var0.tira(100, (-1));
    boolean var24 = var0.tira((-1), 0);
    boolean var25 = var0.finito();
    
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
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test406() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test406");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var7 = var0.finito();
    boolean var10 = var0.tira((-1), 10);
    boolean var11 = var0.finito();
    boolean var14 = var0.tira(100, 100);
    boolean var15 = var0.finito();
    boolean var16 = var0.finito();
    boolean var17 = var0.finito();
    boolean var18 = var0.finito();
    boolean var19 = var0.finito();
    boolean var22 = var0.tira((-1), (-1));
    boolean var25 = var0.tira(100, (-1));
    boolean var26 = var0.finito();
    boolean var27 = var0.finito();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
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
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test407() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test407");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira((-1), (-1));
    boolean var9 = var0.tira(0, 1);
    boolean var12 = var0.tira(1, 10);
    boolean var15 = var0.tira(1, 0);
    boolean var18 = var0.tira(10, 1);
    boolean var21 = var0.tira(0, 10);
    boolean var22 = var0.finito();
    boolean var23 = var0.finito();
    boolean var26 = var0.tira(0, 0);
    boolean var29 = var0.tira(10, 0);
    
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
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test408() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test408");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira((-1), (-1));
    boolean var9 = var0.tira(100, 0);
    boolean var10 = var0.finito();
    boolean var13 = var0.tira(100, 1);
    
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

  public void test409() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test409");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(1, 10);
    boolean var7 = var0.finito();
    boolean var8 = var0.finito();
    boolean var9 = var0.finito();
    boolean var12 = var0.tira(1, 100);
    boolean var13 = var0.finito();
    boolean var16 = var0.tira((-1), 100);
    boolean var17 = var0.finito();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
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
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test410() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test410");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira((-1), (-1));
    boolean var9 = var0.tira(0, 1);
    boolean var12 = var0.tira(1, 10);
    boolean var15 = var0.tira(100, 1);
    boolean var18 = var0.tira(1, 100);
    boolean var21 = var0.tira(10, 1);
    
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

  }

  public void test411() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test411");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var7 = var0.finito();
    boolean var10 = var0.tira((-1), 10);
    boolean var13 = var0.tira(100, 1);
    boolean var14 = var0.finito();
    boolean var17 = var0.tira(0, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test412() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test412");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var7 = var0.finito();
    boolean var10 = var0.tira(100, 100);
    boolean var11 = var0.finito();
    boolean var14 = var0.tira(1, 10);
    boolean var17 = var0.tira(1, 10);
    boolean var20 = var0.tira(1, 100);
    boolean var21 = var0.finito();
    boolean var24 = var0.tira(100, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test413() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test413");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira((-1), (-1));
    boolean var9 = var0.tira(0, 1);
    boolean var12 = var0.tira(1, 0);
    boolean var13 = var0.finito();
    boolean var16 = var0.tira((-1), (-1));
    boolean var19 = var0.tira(0, 1);
    boolean var22 = var0.tira(1, 0);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test414() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test414");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var7 = var0.finito();
    boolean var10 = var0.tira(100, 100);
    boolean var11 = var0.finito();
    boolean var14 = var0.tira(1, 10);
    boolean var17 = var0.tira(1, 10);
    boolean var18 = var0.finito();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test415() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test415");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var7 = var0.tira((-1), 1);
    boolean var10 = var0.tira(1, 1);
    boolean var13 = var0.tira(1, (-1));
    boolean var14 = var0.finito();
    boolean var15 = var0.finito();
    boolean var16 = var0.finito();
    boolean var19 = var0.tira(10, 100);
    boolean var22 = var0.tira(1, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
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

  }

  public void test416() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test416");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var7 = var0.finito();
    boolean var8 = var0.finito();
    boolean var9 = var0.finito();
    boolean var12 = var0.tira((-1), 0);
    boolean var13 = var0.finito();
    boolean var14 = var0.finito();
    boolean var17 = var0.tira(10, 10);
    boolean var20 = var0.tira(0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
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
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test417() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test417");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var7 = var0.tira((-1), (-1));
    boolean var10 = var0.tira((-1), 100);
    boolean var13 = var0.tira(0, 0);
    boolean var16 = var0.tira((-1), (-1));
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test418() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test418");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var9 = var0.tira(1, (-1));
    boolean var10 = var0.finito();
    boolean var13 = var0.tira(0, 0);
    boolean var16 = var0.tira((-1), 0);
    boolean var17 = var0.finito();
    boolean var20 = var0.tira((-1), 1);
    boolean var21 = var0.finito();
    boolean var22 = var0.finito();
    boolean var25 = var0.tira(1, 1);
    
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
    assertTrue(var25 == true);

  }

  public void test419() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test419");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira(10, (-1));
    boolean var4 = var0.finito();
    boolean var5 = var0.finito();
    boolean var8 = var0.tira(0, 0);
    boolean var11 = var0.tira(10, 0);
    boolean var12 = var0.finito();
    boolean var15 = var0.tira(0, (-1));
    boolean var18 = var0.tira(100, 0);
    boolean var21 = var0.tira(100, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
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
    assertTrue(var21 == false);

  }

  public void test420() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test420");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(1, 10);
    boolean var9 = var0.tira(1, 100);
    boolean var10 = var0.finito();
    boolean var11 = var0.finito();
    boolean var14 = var0.tira(100, 100);
    boolean var17 = var0.tira(10, 100);
    boolean var18 = var0.finito();
    boolean var21 = var0.tira((-1), 1);
    
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
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test421() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test421");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var9 = var0.tira(0, 1);
    boolean var12 = var0.tira((-1), (-1));
    boolean var13 = var0.finito();
    boolean var16 = var0.tira(10, 0);
    boolean var19 = var0.tira(10, 100);
    boolean var22 = var0.tira(0, 0);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test422() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test422");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira((-1), (-1));
    boolean var9 = var0.tira(0, 1);
    boolean var12 = var0.tira(1, 0);
    boolean var13 = var0.finito();
    boolean var14 = var0.finito();
    boolean var15 = var0.finito();
    boolean var18 = var0.tira(10, 0);
    boolean var19 = var0.finito();
    boolean var22 = var0.tira(1, 0);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test423() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test423");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(1, 10);
    boolean var9 = var0.tira(1, 100);
    boolean var12 = var0.tira((-1), 1);
    boolean var15 = var0.tira((-1), 10);
    
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

  public void test424() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test424");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira((-1), (-1));
    boolean var9 = var0.tira(0, 1);
    boolean var12 = var0.tira(1, 10);
    boolean var15 = var0.tira(1, 0);
    boolean var18 = var0.tira(10, 1);
    boolean var21 = var0.tira(0, (-1));
    boolean var24 = var0.tira((-1), 100);
    boolean var27 = var0.tira(0, 100);
    boolean var30 = var0.tira(1, 1);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);

  }

  public void test425() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test425");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(1, 10);
    boolean var9 = var0.tira(1, 100);
    boolean var10 = var0.finito();
    boolean var11 = var0.finito();
    boolean var12 = var0.finito();
    boolean var15 = var0.tira(0, 100);
    boolean var18 = var0.tira(10, 10);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test426() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test426");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira(1, 10);
    boolean var6 = var0.tira((-1), 10);
    boolean var9 = var0.tira((-1), (-1));
    boolean var10 = var0.finito();
    boolean var13 = var0.tira(100, 10);
    
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

  public void test427() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test427");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira((-1), (-1));
    boolean var9 = var0.tira(0, 1);
    boolean var12 = var0.tira(1, 0);
    boolean var13 = var0.finito();
    boolean var14 = var0.finito();
    boolean var15 = var0.finito();
    boolean var18 = var0.tira(10, 0);
    boolean var21 = var0.tira((-1), 1);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test428() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test428");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira((-1), (-1));
    boolean var9 = var0.tira(0, 1);
    boolean var10 = var0.finito();
    boolean var13 = var0.tira(0, (-1));
    boolean var14 = var0.finito();
    boolean var15 = var0.finito();
    boolean var16 = var0.finito();
    boolean var19 = var0.tira(1, 0);
    boolean var22 = var0.tira(0, 10);
    boolean var23 = var0.finito();
    boolean var24 = var0.finito();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test429() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test429");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira((-1), (-1));
    boolean var9 = var0.tira(0, 1);
    boolean var12 = var0.tira(1, 10);
    boolean var15 = var0.tira(1, 0);
    boolean var18 = var0.tira(10, 1);
    boolean var19 = var0.finito();
    boolean var20 = var0.finito();
    
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
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test430() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test430");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(1, 10);
    boolean var7 = var0.finito();
    boolean var8 = var0.finito();
    boolean var9 = var0.finito();
    boolean var12 = var0.tira(100, 100);
    boolean var15 = var0.tira(100, 1);
    boolean var16 = var0.finito();
    boolean var19 = var0.tira(1, 10);
    boolean var20 = var0.finito();
    boolean var21 = var0.finito();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
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
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test431() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test431");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var7 = var0.finito();
    boolean var10 = var0.tira((-1), 10);
    boolean var11 = var0.finito();
    boolean var12 = var0.finito();
    boolean var15 = var0.tira(10, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test432() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test432");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var7 = var0.tira((-1), 1);
    boolean var8 = var0.finito();
    boolean var11 = var0.tira(1, 0);
    boolean var12 = var0.finito();
    boolean var15 = var0.tira(10, 100);
    boolean var16 = var0.finito();
    boolean var17 = var0.finito();
    boolean var18 = var0.finito();
    
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
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test433() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test433");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var7 = var0.finito();
    boolean var10 = var0.tira((-1), 10);
    boolean var11 = var0.finito();
    boolean var14 = var0.tira(100, 100);
    boolean var17 = var0.tira(1, 10);
    boolean var20 = var0.tira(10, 0);
    boolean var21 = var0.finito();
    boolean var24 = var0.tira(10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test434() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test434");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var5 = var0.finito();
    boolean var6 = var0.finito();
    boolean var9 = var0.tira(1, 1);
    boolean var12 = var0.tira(0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test435() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test435");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(1, 10);
    boolean var7 = var0.finito();
    boolean var8 = var0.finito();
    boolean var9 = var0.finito();
    boolean var10 = var0.finito();
    boolean var11 = var0.finito();
    boolean var12 = var0.finito();
    boolean var15 = var0.tira((-1), 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
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
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test436() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test436");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(1, 10);
    boolean var7 = var0.finito();
    boolean var10 = var0.tira(0, 10);
    boolean var11 = var0.finito();
    boolean var12 = var0.finito();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test437() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test437");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var5 = var0.finito();
    boolean var8 = var0.tira(10, 10);
    boolean var9 = var0.finito();
    boolean var10 = var0.finito();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test438() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test438");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira((-1), (-1));
    boolean var7 = var0.finito();
    boolean var8 = var0.finito();
    boolean var9 = var0.finito();
    boolean var12 = var0.tira(1, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
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

  }

  public void test439() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test439");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var7 = var0.tira((-1), 1);
    boolean var8 = var0.finito();
    boolean var11 = var0.tira(1, 0);
    boolean var14 = var0.tira(10, 100);
    boolean var17 = var0.tira(0, 0);
    boolean var20 = var0.tira(10, 0);
    
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
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test440() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test440");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var7 = var0.tira((-1), 1);
    boolean var8 = var0.finito();
    boolean var11 = var0.tira(1, 0);
    boolean var14 = var0.tira(10, 100);
    boolean var17 = var0.tira(10, 1);
    boolean var18 = var0.finito();
    boolean var19 = var0.finito();
    boolean var22 = var0.tira((-1), 100);
    boolean var23 = var0.finito();
    boolean var24 = var0.finito();
    boolean var25 = var0.finito();
    boolean var26 = var0.finito();
    
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
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
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
    assertTrue(var26 == false);

  }

  public void test441() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test441");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var4 = var0.finito();
    boolean var7 = var0.tira((-1), 1);
    boolean var8 = var0.finito();
    boolean var11 = var0.tira(1, 0);
    boolean var14 = var0.tira(10, 100);
    boolean var17 = var0.tira(0, 0);
    boolean var18 = var0.finito();
    boolean var21 = var0.tira(1, 10);
    boolean var22 = var0.finito();
    boolean var23 = var0.finito();
    
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
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test442() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test442");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(0, 10);
    boolean var7 = var0.finito();
    boolean var10 = var0.tira((-1), 10);
    boolean var11 = var0.finito();
    boolean var14 = var0.tira(100, 100);
    boolean var15 = var0.finito();
    boolean var16 = var0.finito();
    boolean var17 = var0.finito();
    boolean var20 = var0.tira(100, 10);
    boolean var23 = var0.tira(10, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
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

  }

  public void test443() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test443");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(1, 10);
    boolean var7 = var0.finito();
    boolean var10 = var0.tira(10, 1);
    boolean var11 = var0.finito();
    boolean var14 = var0.tira(10, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test444() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test444");


    p.PariODispari var0 = new p.PariODispari();
    boolean var3 = var0.tira((-1), 0);
    boolean var6 = var0.tira(1, 10);
    boolean var7 = var0.finito();
    boolean var8 = var0.finito();
    boolean var9 = var0.finito();
    boolean var10 = var0.finito();
    boolean var11 = var0.finito();
    boolean var14 = var0.tira(1, (-1));
    boolean var17 = var0.tira(100, 0);
    boolean var18 = var0.finito();
    boolean var21 = var0.tira(1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
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
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);

  }

}
