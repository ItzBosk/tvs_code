package randoop;

import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test1");


    counter.Counter var0 = new counter.Counter();
    int var1 = var0.val();
    int var2 = var0.val();
    int var3 = var0.dec();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test2");


    counter.Counter var0 = new counter.Counter();
    int var1 = var0.inc();
    int var2 = var0.val();
    int var3 = var0.inc();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 2);

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test3");


    counter.Counter var0 = new counter.Counter();
    int var1 = var0.inc();
    int var2 = var0.val();
    var0.m(2, (-2));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test4");


    counter.Counter var0 = new counter.Counter();
    var0.m(10, (-1));
    int var4 = var0.val();
    var0.m(0, (-1));
    int var8 = var0.inc();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test5");


    counter.Counter var0 = new counter.Counter();
    int var1 = var0.inc();
    var0.m(100, 0);
    var0.m(2, (-1));
    int var8 = var0.val();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test6");


    counter.Counter var0 = new counter.Counter();
    var0.m((-1), 0);
    int var4 = var0.dec();
    int var5 = var0.inc();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test7");


    counter.Counter var0 = new counter.Counter();
    var0.m(10, (-1));
    int var4 = var0.dec();
    int var5 = var0.inc();
    int var6 = var0.inc();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test8");


    counter.Counter var0 = new counter.Counter();
    int var1 = var0.inc();
    var0.m(10, (-2));
    int var5 = var0.dec();
    int var6 = var0.inc();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test9");


    counter.Counter var0 = new counter.Counter();
    int var1 = var0.inc();
    var0.m(100, 0);
    int var5 = var0.val();
    var0.m(10, 0);
    int var9 = var0.dec();
    int var10 = var0.inc();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test10");


    counter.Counter var0 = new counter.Counter();
    var0.m((-1), 0);
    var0.m(2, 10);

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test11");


    counter.Counter var0 = new counter.Counter();
    int var1 = var0.dec();
    int var2 = var0.val();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test12");


    counter.Counter var0 = new counter.Counter();
    var0.m(10, (-1));
    int var4 = var0.val();
    var0.m(0, (-1));
    int var8 = var0.val();
    int var9 = var0.val();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test13");


    counter.Counter var0 = new counter.Counter();
    int var1 = var0.inc();
    var0.m(10, (-2));
    int var5 = var0.val();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test14");


    counter.Counter var0 = new counter.Counter();
    int var1 = var0.val();
    int var2 = var0.val();
    var0.m(0, 10);
    int var6 = var0.dec();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test15");


    counter.Counter var0 = new counter.Counter();
    var0.m((-1), 0);
    int var4 = var0.val();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test16");


    counter.Counter var0 = new counter.Counter();
    int var1 = var0.inc();
    var0.m(100, 0);
    int var5 = var0.val();
    var0.m(10, 0);
    int var9 = var0.val();
    int var10 = var0.dec();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test17");


    counter.Counter var0 = new counter.Counter();
    var0.m(10, (-1));
    int var4 = var0.dec();
    int var5 = var0.dec();
    var0.m(1, (-2));
    int var9 = var0.inc();
    var0.m(2, 0);
    int var13 = var0.val();
    int var14 = var0.dec();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-2));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-2));

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test18");


    counter.Counter var0 = new counter.Counter();
    var0.m((-1), 10);
    int var4 = var0.inc();
    int var5 = var0.val();
    int var6 = var0.val();
    int var7 = var0.dec();
    int var8 = var0.inc();
    int var9 = var0.dec();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test19");


    counter.Counter var0 = new counter.Counter();
    var0.m(10, (-1));
    int var4 = var0.val();
    int var5 = var0.inc();
    int var6 = var0.dec();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test20");


    counter.Counter var0 = new counter.Counter();
    var0.m(10, (-1));
    int var4 = var0.val();
    var0.m(0, (-1));
    var0.m(100, (-1));
    int var11 = var0.dec();
    int var12 = var0.inc();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test21");


    counter.Counter var0 = new counter.Counter();
    int var1 = var0.inc();
    var0.m(100, 0);
    var0.m(2, (-1));
    int var8 = var0.dec();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test22");


    counter.Counter var0 = new counter.Counter();
    var0.m(10, (-1));
    var0.m(10, 10);
    int var7 = var0.inc();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test23");


    counter.Counter var0 = new counter.Counter();
    int var1 = var0.inc();
    var0.m(10, (-2));
    int var5 = var0.dec();
    var0.m((-2), 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test24");


    counter.Counter var0 = new counter.Counter();
    var0.m(10, (-1));
    int var4 = var0.val();
    int var5 = var0.dec();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test25");


    counter.Counter var0 = new counter.Counter();
    int var1 = var0.inc();
    var0.m(100, 0);
    var0.m(2, (-1));
    var0.m(100, (-2));
    var0.m((-1), 0);
    var0.m(2, 10);
    int var17 = var0.val();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test26");


    counter.Counter var0 = new counter.Counter();
    int var1 = var0.dec();
    var0.m(1, 10);
    var0.m((-2), 100);
    int var8 = var0.inc();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test27");


    counter.Counter var0 = new counter.Counter();
    int var1 = var0.inc();
    var0.m(10, (-2));
    int var5 = var0.dec();
    int var6 = var0.dec();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test28");


    counter.Counter var0 = new counter.Counter();
    var0.m(10, (-1));
    int var4 = var0.val();
    var0.m(0, (-1));
    var0.m(100, (-1));
    var0.m(0, (-2));
    int var14 = var0.inc();
    int var15 = var0.dec();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test29");


    counter.Counter var0 = new counter.Counter();
    var0.m((-1), 10);
    int var4 = var0.inc();
    int var5 = var0.val();
    int var6 = var0.val();
    int var7 = var0.val();
    var0.m((-2), (-2));
    int var11 = var0.inc();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 2);

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test30");


    counter.Counter var0 = new counter.Counter();
    var0.m(10, (-1));
    int var4 = var0.dec();
    int var5 = var0.dec();
    int var6 = var0.val();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-2));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-2));

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test31");


    counter.Counter var0 = new counter.Counter();
    var0.m(10, (-1));
    int var4 = var0.dec();
    int var5 = var0.dec();
    var0.m(0, 1);
    int var9 = var0.val();
    int var10 = var0.val();
    int var11 = var0.val();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-2));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-2));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-2));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-2));

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test32");


    counter.Counter var0 = new counter.Counter();
    int var1 = var0.dec();
    var0.m(1, 10);
    int var5 = var0.dec();
    int var6 = var0.inc();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-2));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test33");


    counter.Counter var0 = new counter.Counter();
    int var1 = var0.inc();
    var0.m(100, 0);
    var0.m(2, (-1));
    var0.m(100, (-2));
    int var11 = var0.inc();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 2);

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test34");


    counter.Counter var0 = new counter.Counter();
    var0.m(10, (-1));
    int var4 = var0.dec();
    int var5 = var0.dec();
    var0.m(1, (-2));
    var0.m(1, (-2));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-2));

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test35");


    counter.Counter var0 = new counter.Counter();
    var0.m(10, (-1));
    int var4 = var0.val();
    var0.m(0, (-1));
    var0.m(100, (-1));
    var0.m(0, (-2));
    int var14 = var0.inc();
    int var15 = var0.val();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test36");


    counter.Counter var0 = new counter.Counter();
    int var1 = var0.inc();
    var0.m(100, 0);
    var0.m(2, (-1));
    var0.m(100, 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test37");


    counter.Counter var0 = new counter.Counter();
    int var1 = var0.val();
    int var2 = var0.dec();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test38");


    counter.Counter var0 = new counter.Counter();
    int var1 = var0.val();
    int var2 = var0.val();
    int var3 = var0.inc();
    int var4 = var0.val();
    int var5 = var0.val();
    int var6 = var0.val();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test39");


    counter.Counter var0 = new counter.Counter();
    int var1 = var0.inc();
    var0.m(100, 0);
    int var5 = var0.val();
    int var6 = var0.inc();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 2);

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test40");


    counter.Counter var0 = new counter.Counter();
    var0.m(10, (-1));
    int var4 = var0.dec();
    int var5 = var0.inc();
    int var6 = var0.dec();
    int var7 = var0.dec();
    int var8 = var0.val();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-2));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-2));

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test41");


    counter.Counter var0 = new counter.Counter();
    var0.m(10, (-1));
    int var4 = var0.val();
    var0.m(2, 10);
    int var8 = var0.val();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test42");


    counter.Counter var0 = new counter.Counter();
    var0.m(10, (-1));
    int var4 = var0.dec();
    int var5 = var0.dec();
    var0.m(0, 1);
    int var9 = var0.val();
    int var10 = var0.dec();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-2));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-2));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-3));

  }

}
